package net.marevol.redmine.impasse.testlink.entity;

import java.util.ArrayList;
import java.util.List;

import net.marevol.redmine.impasse.db.exentity.ImpasseNodes;

/**
 * TestLink's test case.
 * 
 * @author shinsuke
 *
 */
public class TestCase implements TestNode {
    private int internalId;

    private String name = "";

    private int nodeOrder;

    private int externalId;

    private int version;

    private String summary = "";

    private String preconditions = "";

    private int executionType;

    private int importance;

    private final List<TestStep> stepSet = new ArrayList<TestStep>();

    private TestSuite parent;

    private final List<String> keywordList = new ArrayList<String>();

    private ImpasseNodes impasseNodes;

    public void addTestStep(final TestStep node) {
        stepSet.add(node);
    }

    public int getInternalId() {
        return internalId;
    }

    public void setInternalId(final int internalId) {
        this.internalId = internalId;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    @Override
    public int getNodeOrder() {
        return nodeOrder;
    }

    @Override
    public void setNodeOrder(final int nodeOrder) {
        this.nodeOrder = nodeOrder;
    }

    public int getExternalId() {
        return externalId;
    }

    public void setExternalId(final int externalId) {
        this.externalId = externalId;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(final int version) {
        this.version = version;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(final String summary) {
        this.summary = summary;
    }

    public String getPreconditions() {
        return preconditions;
    }

    public void setPreconditions(final String preconditions) {
        this.preconditions = preconditions;
    }

    public int getExecutionType() {
        return executionType;
    }

    public void setExecutionType(final int executionType) {
        this.executionType = executionType;
    }

    public int getImportance() {
        return importance;
    }

    public void setImportance(final int importance) {
        this.importance = importance;
    }

    public void setParent(final TestSuite parent) {
        this.parent = parent;
    }

    @Override
    public void addKeyword(final String name) {
        keywordList.add(name);
    }

    public List<String> getKeywordList() {
        return keywordList;
    }

    public TestSuite getParent() {
        return parent;
    }

    public ImpasseNodes getImpasseNodes() {
        return impasseNodes;
    }

    public void setImpasseNodes(final ImpasseNodes impasseNodes) {
        this.impasseNodes = impasseNodes;
    }

    public List<TestStep> getChildren() {
        return stepSet;
    }

    @Override
    public String toString() {
        return "TestCase [internalId=" + internalId + ", name=" + name
                + ", nodeOrder=" + nodeOrder + ", externalId=" + externalId
                + ", version=" + version + ", summary=" + summary
                + ", preconditions=" + preconditions + ", executionType="
                + executionType + ", importance=" + importance
                + ", keywordList=" + keywordList + ", impasseNodes="
                + impasseNodes + "]";
    }

}
