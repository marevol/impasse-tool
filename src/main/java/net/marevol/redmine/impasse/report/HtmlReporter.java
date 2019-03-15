package net.marevol.redmine.impasse.report;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import javax.annotation.Resource;

import net.marevol.redmine.impasse.ImpasseSystemException;
import net.marevol.redmine.impasse.db.cbean.ImpasseExecutionsCB;
import net.marevol.redmine.impasse.db.cbean.ImpasseNodeTypesCB;
import net.marevol.redmine.impasse.db.cbean.ImpasseNodesCB;
import net.marevol.redmine.impasse.db.cbean.ImpasseTestCasesCB;
import net.marevol.redmine.impasse.db.cbean.ImpasseTestPlanCasesCB;
import net.marevol.redmine.impasse.db.cbean.ImpasseTestPlansCB;
import net.marevol.redmine.impasse.db.cbean.ImpasseTestStepsCB;
import net.marevol.redmine.impasse.db.cbean.ImpasseTestSuitesCB;
import net.marevol.redmine.impasse.db.cbean.UsersCB;
import net.marevol.redmine.impasse.db.exbhv.ImpasseExecutionsBhv;
import net.marevol.redmine.impasse.db.exbhv.ImpasseNodeTypesBhv;
import net.marevol.redmine.impasse.db.exbhv.ImpasseNodesBhv;
import net.marevol.redmine.impasse.db.exbhv.ImpasseTestCasesBhv;
import net.marevol.redmine.impasse.db.exbhv.ImpasseTestPlanCasesBhv;
import net.marevol.redmine.impasse.db.exbhv.ImpasseTestPlansBhv;
import net.marevol.redmine.impasse.db.exbhv.ImpasseTestStepsBhv;
import net.marevol.redmine.impasse.db.exbhv.ImpasseTestSuitesBhv;
import net.marevol.redmine.impasse.db.exbhv.UsersBhv;
import net.marevol.redmine.impasse.db.exentity.ImpasseExecutions;
import net.marevol.redmine.impasse.db.exentity.ImpasseNodeTypes;
import net.marevol.redmine.impasse.db.exentity.ImpasseNodes;
import net.marevol.redmine.impasse.db.exentity.ImpasseTestCases;
import net.marevol.redmine.impasse.db.exentity.ImpasseTestPlanCases;
import net.marevol.redmine.impasse.db.exentity.ImpasseTestPlans;
import net.marevol.redmine.impasse.db.exentity.ImpasseTestSteps;
import net.marevol.redmine.impasse.db.exentity.ImpasseTestSuites;
import net.marevol.redmine.impasse.db.exentity.Users;

import org.apache.commons.io.IOUtils;
import org.apache.commons.lang.StringUtils;
import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.Velocity;
import org.apache.velocity.runtime.RuntimeConstants;
import org.apache.velocity.tools.generic.DateTool;
import org.apache.velocity.tools.generic.DisplayTool;
import org.seasar.dbflute.cbean.ListResultBean;

public class HtmlReporter implements Reporter {

    private String projectName;

    private File outputFile;

    private boolean includeResults;

    private boolean skipEmptyTestsuite;

    private String planName;

    @Resource
    protected ImpasseNodeTypesBhv impasseNodeTypesBhv;

    @Resource
    protected ImpasseNodesBhv impasseNodesBhv;

    @Resource
    protected ImpasseTestSuitesBhv impasseTestSuitesBhv;

    @Resource
    protected ImpasseTestCasesBhv impasseTestCasesBhv;

    @Resource
    protected ImpasseTestStepsBhv impasseTestStepsBhv;

    @Resource
    protected ImpasseTestPlansBhv impasseTestPlansBhv;

    @Resource
    protected ImpasseTestPlanCasesBhv impasseTestPlanCasesBhv;

    @Resource
    protected ImpasseExecutionsBhv impasseExecutionsBhv;

    @Resource
    protected UsersBhv usersBhv;

    protected String topTemplatePath = "html/top.vm";

    protected String bottomTemplatePath = "html/bottom.vm";

    protected String testsuiteTopTemplatePath = "html/testsuite-top.vm";

    protected String testsuiteBottomTemplatePath = "html/testsuite-bottom.vm";

    protected String testcaseTemplatePath = "html/testcase.vm";

    protected String templateEncoding = "UTF-8";

    protected String outputEncoding = "UTF-8";

    private final Map<String, Integer> nodeTypeMap = new HashMap<String, Integer>();

    private final LinkedList<ImpasseNodes> nodeList = new LinkedList<ImpasseNodes>();

    private final LinkedList<Integer> numberList = new LinkedList<Integer>();

    protected Template testsuiteTopTemplate;

    protected Template testsuiteBottomTemplate;

    protected Template testcaseTemplate;

    protected ImpasseTestPlans testPlan;

    protected ImpasseNodes testProject;

    @Override
    public void execute() {
        final ImpasseNodeTypesCB cb1 = new ImpasseNodeTypesCB();
        final ListResultBean<ImpasseNodeTypes> nodeTypeList = impasseNodeTypesBhv
                .selectList(cb1);
        for (final ImpasseNodeTypes nodeTypes : nodeTypeList) {
            nodeTypeMap.put(nodeTypes.getDescription(), nodeTypes.getId());
        }
        if (!nodeTypeMap.containsKey("testproject")
                || !nodeTypeMap.containsKey("testsuite")
                || !nodeTypeMap.containsKey("testcase")) {
            throw new ImpasseSystemException("impasse_node_types is invalid: "
                    + nodeTypeMap.toString());
        }

        final ImpasseNodesCB cb2 = new ImpasseNodesCB();
        cb2.query().setNodeTypeId_Equal(nodeTypeMap.get("testproject"));
        cb2.query().setName_Equal(projectName);
        testProject = impasseNodesBhv.selectEntity(cb2);
        if (testProject == null) {
            throw new ImpasseSystemException("Project " + projectName
                    + " is not found.");
        }

        if (includeResults) {
            final ImpasseTestPlansCB cb3 = new ImpasseTestPlansCB();
            cb3.query().setName_Equal(planName);
            cb3.query().setActive_IsNull();
            testPlan = impasseTestPlansBhv.selectEntity(cb3);
            if (testPlan == null) {
                throw new ImpasseSystemException("Test Plan " + planName
                        + " is not found.");
            }

        }

        final Properties p = new Properties();
        p.setProperty(RuntimeConstants.RESOURCE_LOADER, "class");
        p.setProperty("class.resource.loader.class",
                "org.apache.velocity.runtime.resource.loader.ClasspathResourceLoader");
        Velocity.init(p);

        Writer writer = null;
        try {
            testsuiteTopTemplate = Velocity.getTemplate(
                    testsuiteTopTemplatePath, templateEncoding);
            testsuiteBottomTemplate = Velocity.getTemplate(
                    testsuiteBottomTemplatePath, templateEncoding);
            testcaseTemplate = Velocity.getTemplate(testcaseTemplatePath,
                    templateEncoding);

            writer = new BufferedWriter(new OutputStreamWriter(
                    new FileOutputStream(outputFile), outputEncoding));

            final VelocityContext context = new VelocityContext();
            context.put("reporter", this);
            context.put("display", new DisplayTool());
            context.put("date", new DateTool());
            context.put("today", new Date());
            if (includeResults) {
                context.put("testPlan", testPlan);
            }

            final List<ContentTitle> contentTitleList = new ArrayList<ContentTitle>();
            parseTitle(testProject, contentTitleList);
            context.put("contentTitleList", contentTitleList);

            final Template topTemplate = Velocity.getTemplate(topTemplatePath,
                    templateEncoding);
            topTemplate.merge(context, writer);

            parseContent(context, testProject, writer);

            final Template bottomTemplate = Velocity.getTemplate(
                    bottomTemplatePath, templateEncoding);
            bottomTemplate.merge(context, writer);

            writer.flush();
        } catch (final Exception e) {
            throw new ImpasseSystemException(e);
        } finally {
            IOUtils.closeQuietly(writer);
        }
    }

    protected void parseTitle(final ImpasseNodes parentNode,
            final List<ContentTitle> contentTitleList) {
        final ImpasseNodesCB cb1 = new ImpasseNodesCB();
        cb1.query().setParentId_Equal(parentNode.getId());
        cb1.query().addOrderBy_NodeOrder_Asc();
        final ListResultBean<ImpasseNodes> nodesList = impasseNodesBhv
                .selectList(cb1);
        int number = 0;
        for (final ImpasseNodes node : nodesList) {
            if (nodeTypeMap.get("testsuite").intValue() == node.getNodeTypeId()
                    .intValue()) {
                if (skipEmptyTestsuite && !hasTestCaseChild(node)) {
                    continue;
                }
                number++;

                // testsuite
                numberList.addLast(number);

                final ContentTitle contentTitle = new ContentTitle();
                contentTitle.number = StringUtils.join(numberList, '.');
                contentTitle.name = node.getName();
                contentTitle.depth = numberList.size();

                contentTitleList.add(contentTitle);

                parseTitle(node, contentTitleList);

                numberList.removeLast();

            }
        }
    }

    public static class ContentTitle {
        protected String number;

        protected String name;

        protected int depth;

        public String getNumber() {
            return number;
        }

        public void setNumber(final String number) {
            this.number = number;
        }

        public String getName() {
            return name;
        }

        public void setName(final String name) {
            this.name = name;
        }

        public int getDepth() {
            return depth;
        }

        public void setDepth(final int depth) {
            this.depth = depth;
        }

    }

    protected void parseContent(final VelocityContext baseContext,
            final ImpasseNodes parentNode, final Writer writer) {
        final ImpasseNodesCB cb1 = new ImpasseNodesCB();
        cb1.query().setParentId_Equal(parentNode.getId());
        cb1.query().addOrderBy_NodeOrder_Asc();
        final ListResultBean<ImpasseNodes> nodesList = impasseNodesBhv
                .selectList(cb1);
        int number = 0;
        for (final ImpasseNodes node : nodesList) {
            if (nodeTypeMap.get("testsuite").intValue() == node.getNodeTypeId()
                    .intValue()) {
                if (skipEmptyTestsuite && !hasTestCaseChild(node)) {
                    System.out.println("Skip node");
                    continue;
                }

                number++;

                // testsuite
                nodeList.addLast(node);
                numberList.addLast(number);

                final VelocityContext context = new VelocityContext(baseContext);
                context.put("testNode", node);

                final ImpasseTestSuitesCB cb2 = new ImpasseTestSuitesCB();
                cb2.query().setId_Equal(node.getId());
                final ImpasseTestSuites testSuite = impasseTestSuitesBhv
                        .selectEntity(cb2);
                if (testSuite != null) {
                    context.put("testSuite", testSuite);
                }

                testsuiteTopTemplate.merge(context, writer);

                parseContent(baseContext, node, writer);

                testsuiteBottomTemplate.merge(context, writer);

                nodeList.removeLast();
                numberList.removeLast();
            } else if (nodeTypeMap.get("testcase").intValue() == node
                    .getNodeTypeId().intValue()) {
                // testcase
                final VelocityContext context = new VelocityContext(baseContext);
                context.put("testNode", node);

                final ImpasseTestCasesCB cb2 = new ImpasseTestCasesCB();
                cb2.query().setId_Equal(node.getId());
                final ImpasseTestCases testCase = impasseTestCasesBhv
                        .selectEntity(cb2);
                if (testCase != null) {
                    context.put("testCase", testCase);

                    final ImpasseTestStepsCB cb3 = new ImpasseTestStepsCB();
                    cb3.query().setTestCaseId_Equal(testCase.getId());
                    cb3.query().addOrderBy_StepNumber_Asc();
                    final ListResultBean<ImpasseTestSteps> testSteps = impasseTestStepsBhv
                            .selectList(cb3);
                    context.put("testSteps", testSteps);

                    if (includeResults) {
                        final ImpasseTestPlanCasesCB cb4 = new ImpasseTestPlanCasesCB();
                        cb4.query().setTestPlanId_Equal(testPlan.getId());
                        cb4.query().setTestCaseId_Equal(testCase.getId());
                        cb4.query().addOrderBy_NodeOrder_Asc();
                        final ImpasseTestPlanCases testPlanCase = impasseTestPlanCasesBhv
                                .selectEntity(cb4);
                        if (testPlanCase != null) {
                            final ImpasseExecutionsCB cb5 = new ImpasseExecutionsCB();
                            cb5.query().setTestPlanCaseId_Equal(
                                    testPlanCase.getId());
                            final ImpasseExecutions execution = impasseExecutionsBhv
                                    .selectEntity(cb5);
                            if (execution != null) {
                                context.put("execution", execution);

                                if (execution.getTesterId() != null) {
                                    final UsersCB cb6 = new UsersCB();
                                    cb6.query().setId_Equal(
                                            execution.getTesterId());
                                    final Users tester = usersBhv
                                            .selectEntity(cb6);
                                    if (tester != null) {
                                        context.put("tester", tester);
                                    }
                                }

                                if (execution.getExecutorId() != null) {
                                    final UsersCB cb6 = new UsersCB();
                                    cb6.query().setId_Equal(
                                            execution.getExecutorId());
                                    final Users executor = usersBhv
                                            .selectEntity(cb6);
                                    if (executor != null) {
                                        context.put("executor", executor);
                                    }
                                }
                            }
                        }

                    }

                }

                testcaseTemplate.merge(context, writer);

            }
        }
    }

    private boolean hasTestCaseChild(final ImpasseNodes parentNode) {
        final ImpasseNodesCB cb1 = new ImpasseNodesCB();
        cb1.query().setParentId_Equal(parentNode.getId());
        cb1.query().addOrderBy_NodeOrder_Asc();
        final ListResultBean<ImpasseNodes> nodesList = impasseNodesBhv
            .selectList(cb1);
        for (final ImpasseNodes node : nodesList) {
            if (nodeTypeMap.get("testsuite").intValue() == node.getNodeTypeId()
                .intValue()) {
                if (hasTestCaseChild(node)) {
                    return true;
                }
            } else if (nodeTypeMap.get("testcase").intValue() == node.getNodeTypeId()
                .intValue()) {
                if (isTestPlanCase(node)) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean isTestPlanCase(final ImpasseNodes testCaseNode) {
        final ImpasseTestCasesCB cb2 = new ImpasseTestCasesCB();
        cb2.query().setId_Equal(testCaseNode.getId());
        final ImpasseTestCases testCase = impasseTestCasesBhv
            .selectEntity(cb2);
        final ImpasseTestPlanCasesCB cb4 = new ImpasseTestPlanCasesCB();
        cb4.query().setTestPlanId_Equal(testPlan.getId());
        cb4.query().setTestCaseId_Equal(testCase.getId());
        cb4.query().addOrderBy_NodeOrder_Asc();
        final ImpasseTestPlanCases testPlanCase = impasseTestPlanCasesBhv
            .selectEntity(cb4);
        return testPlanCase != null;
    }

    public String getCurrentNumber() {
        final StringBuilder buf = new StringBuilder();
        for (final Integer num : numberList) {
            if (buf.length() > 0) {
                buf.append('.');
            }
            buf.append(num.toString());
        }
        return buf.toString();
    }

    @Override
    public Reporter projectName(final String projectName) {
        this.projectName = projectName;
        return this;
    }

    @Override
    public Reporter outputFile(final File outputFile) {
        this.outputFile = outputFile;
        return this;
    }

    @Override
    public Reporter includeResults(final boolean includeResults) {
        this.includeResults = includeResults;
        return this;
    }

    @Override
    public Reporter skipEmptyTestsuite(boolean skipEmptyTestsite) {
        this.skipEmptyTestsuite = skipEmptyTestsite;
        return this;
    }

    @Override
    public Reporter planName(final String planName) {
        this.planName = planName;
        return this;
    }

    public String getProjectName() {
        return projectName;
    }

    public String getPlanName() {
        return planName;
    }

    public String getOutputEncoding() {
        return outputEncoding;
    }

    public LinkedList<ImpasseNodes> getNodeList() {
        return nodeList;
    }

    public boolean isIncludeResults() {
        return includeResults;
    }

    public ImpasseTestPlans getTestPlan() {
        return testPlan;
    }

    public ImpasseNodes getTestProject() {
        return testProject;
    }

    public LinkedList<Integer> getNumberList() {
        return numberList;
    }

}
