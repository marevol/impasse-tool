package net.marevol.redmine.impasse.testlink;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import net.marevol.redmine.impasse.ImpasseSystemException;
import net.marevol.redmine.impasse.db.cbean.ImpasseNodeTypesCB;
import net.marevol.redmine.impasse.db.cbean.ImpasseNodesCB;
import net.marevol.redmine.impasse.db.cbean.ImpasseTestCasesCB;
import net.marevol.redmine.impasse.db.cbean.ImpasseTestSuitesCB;
import net.marevol.redmine.impasse.db.exbhv.ImpasseNodeTypesBhv;
import net.marevol.redmine.impasse.db.exbhv.ImpasseNodesBhv;
import net.marevol.redmine.impasse.db.exbhv.ImpasseTestCasesBhv;
import net.marevol.redmine.impasse.db.exbhv.ImpasseTestStepsBhv;
import net.marevol.redmine.impasse.db.exbhv.ImpasseTestSuitesBhv;
import net.marevol.redmine.impasse.db.exentity.ImpasseNodeTypes;
import net.marevol.redmine.impasse.db.exentity.ImpasseNodes;
import net.marevol.redmine.impasse.db.exentity.ImpasseTestCases;
import net.marevol.redmine.impasse.db.exentity.ImpasseTestSteps;
import net.marevol.redmine.impasse.db.exentity.ImpasseTestSuites;
import net.marevol.redmine.impasse.testlink.entity.TestCase;
import net.marevol.redmine.impasse.testlink.entity.TestNode;
import net.marevol.redmine.impasse.testlink.entity.TestStep;
import net.marevol.redmine.impasse.testlink.entity.TestSuite;

import org.seasar.dbflute.bhv.InsertOption;
import org.seasar.dbflute.cbean.ListResultBean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Data Importer from TestLink.
 * 
 * @author shinsuke
 *
 */
public class TestLinkImporter {
    private static final String DUMMY = "dummy";

    static final Logger logger = LoggerFactory
            .getLogger(TestLinkImporter.class);

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

    protected Map<String, Integer> nodeTypesMap = new HashMap<String, Integer>();

    public void importData(final String projectId, final TestSuite testSuite) {
        if (logger.isInfoEnabled()) {
            logger.info("Creating Project Node: " + projectId);
        }

        final ListResultBean<ImpasseNodeTypes> nodeTypesList = impasseNodeTypesBhv
                .selectList(new ImpasseNodeTypesCB());
        for (final ImpasseNodeTypes nodeTypes : nodeTypesList) {
            nodeTypesMap.put(nodeTypes.getDescription(), nodeTypes.getId());
        }

        final TestSuite projectNode = getProjectNode(projectId);

        testSuite.setParent(projectNode);
        processTestSuite(testSuite);
    }

    private TestSuite getProjectNode(final String projectId) {
        final TestSuite projectNode = new TestSuite();
        projectNode.setName(projectId);
        projectNode.setNodeOrder(1);

        final ImpasseNodesCB cb = new ImpasseNodesCB();
        cb.query().setName_Equal(projectId);
        ImpasseNodes impasseNodes = impasseNodesBhv.selectEntity(cb);

        if (impasseNodes == null) {
            impasseNodes = new ImpasseNodes();
            impasseNodes.setName(projectNode.getName());
            impasseNodes.setNodeTypeId(nodeTypesMap.get("testproject"));
            impasseNodes.setNodeOrder(projectNode.getNodeOrder());
            impasseNodes.setPath(DUMMY);

            impasseNodesBhv.insert(impasseNodes);

            impasseNodes.setPath(getImpasseNodesPath(projectNode));
            impasseNodesBhv.update(impasseNodes);
        }
        projectNode.setImpasseNodes(impasseNodes);

        return projectNode;
    }

    protected void processTestSuite(final TestSuite testSuite) {
        if (logger.isInfoEnabled()) {
            logger.info("Creating Test Suite: " + testSuite);
        }

        final ImpasseNodes impasseNodes = new ImpasseNodes();
        impasseNodes.setName(testSuite.getName());
        impasseNodes.setNodeTypeId(nodeTypesMap.get("testsuite"));
        final TestSuite parent = testSuite.getParent();
        if (parent != null) {
            final ImpasseNodes parentImpasseNodes = parent.getImpasseNodes();
            if (parentImpasseNodes != null) {
                impasseNodes.setParentId(parentImpasseNodes.getId());
            }
        } else {
            throw new ImpasseSystemException("No parent node.");
        }
        impasseNodes.setNodeOrder(testSuite.getNodeOrder());
        impasseNodes.setPath(DUMMY);

        impasseNodesBhv.insert(impasseNodes);
        testSuite.setImpasseNodes(impasseNodes);

        impasseNodes.setPath(getImpasseNodesPath(testSuite));
        impasseNodesBhv.update(impasseNodes);

        final ImpasseTestSuites impasseTestSuites = new ImpasseTestSuites();
        logger.info("TEST: id=" + impasseNodes.getId());
        impasseTestSuites.setId(impasseNodes.getId());
        impasseTestSuites.setDetails(testSuite.getDetails());
        impasseTestSuitesBhv.varyingInsert(impasseTestSuites,
                new InsertOption<ImpasseTestSuitesCB>()
                        .disablePrimaryKeyIdentity());

        // TODO keywords

        for (final TestNode childNode : testSuite.getChildren()) {
            if (childNode instanceof TestSuite) {
                processTestSuite((TestSuite) childNode);
            } else if (childNode instanceof TestCase) {
                processTestCase((TestCase) childNode);
            }
        }

    }

    private void processTestCase(final TestCase testCase) {
        if (logger.isInfoEnabled()) {
            logger.info("Creating Test Case: " + testCase);
        }

        final ImpasseNodes impasseNodes = new ImpasseNodes();
        impasseNodes.setName(testCase.getName());
        impasseNodes.setNodeTypeId(nodeTypesMap.get("testcase"));
        final TestSuite parent = testCase.getParent();
        if (parent != null) {
            final ImpasseNodes parentImpasseNodes = parent.getImpasseNodes();
            if (parentImpasseNodes != null) {
                impasseNodes.setParentId(parentImpasseNodes.getId());
            }
        } else {
            throw new ImpasseSystemException("No parent node.");
        }
        impasseNodes.setNodeOrder(testCase.getNodeOrder());
        impasseNodes.setPath(DUMMY);

        impasseNodesBhv.insert(impasseNodes);
        testCase.setImpasseNodes(impasseNodes);

        impasseNodes.setPath(getImpasseNodesPath(testCase));
        impasseNodesBhv.update(impasseNodes);

        final ImpasseTestCases impasseTestCases = new ImpasseTestCases();
        impasseTestCases.setId(impasseNodes.getId());
        impasseTestCases.setSummary(testCase.getSummary());
        impasseTestCases.setPreconditions(testCase.getPreconditions());
        impasseTestCases.setImportance(testCase.getImportance());
        impasseTestCases.setActive(true);
        impasseTestCasesBhv.varyingInsert(impasseTestCases,
                new InsertOption<ImpasseTestCasesCB>()
                        .disablePrimaryKeyIdentity());

        // TODO keywords

        for (final TestStep childNode : testCase.getChildren()) {
            processTestStep(childNode);
        }
    }

    private void processTestStep(final TestStep testStep) {
        if (logger.isInfoEnabled()) {
            logger.info("Creating Test Step: " + testStep);
        }

        final ImpasseTestSteps impasseTestSteps = new ImpasseTestSteps();
        final TestCase parent = testStep.getParent();
        if (parent != null) {
            final ImpasseNodes parentImpasseNodes = parent.getImpasseNodes();
            if (parentImpasseNodes != null) {
                impasseTestSteps.setTestCaseId(parentImpasseNodes.getId());
            }
        } else {
            throw new ImpasseSystemException("No parent node.");
        }
        impasseTestSteps.setStepNumber(testStep.getStepNumber());
        impasseTestSteps.setActions(testStep.getActions());
        impasseTestSteps.setExpectedResults(testStep.getExpectedResults());

        impasseTestStepsBhv.insert(impasseTestSteps);
    }

    protected String getImpasseNodesPath(final Object currentNode) {
        final List<Integer> idList = new ArrayList<Integer>();

        Object node = currentNode;
        while (node != null) {
            if (node instanceof TestSuite) {
                final TestSuite testSuite = (TestSuite) node;
                final ImpasseNodes impasseNodes = testSuite.getImpasseNodes();
                if (impasseNodes != null) {
                    idList.add(impasseNodes.getId());
                }

                node = testSuite.getParent();
            } else if (node instanceof TestCase) {
                final TestCase testCase = (TestCase) node;
                final ImpasseNodes impasseNodes = testCase.getImpasseNodes();
                if (impasseNodes != null) {
                    idList.add(impasseNodes.getId());
                }

                node = testCase.getParent();
            } else if (node instanceof TestStep) {
                final TestStep testStep = (TestStep) node;
                final ImpasseNodes impasseNodes = testStep.getImpasseNodes();
                if (impasseNodes != null) {
                    idList.add(impasseNodes.getId());
                }

                node = testStep.getParent();
            } else {
                node = null;
            }
        }

        final StringBuilder buf = new StringBuilder();
        buf.append('.');
        for (int i = idList.size() - 1; i >= 0; i--) {
            buf.append(idList.get(i).toString());
            buf.append('.');
        }

        return buf.toString();
    }

}
