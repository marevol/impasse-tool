package net.marevol.redmine.impasse.testlink.entity;

import java.util.ArrayList;
import java.util.List;

import net.marevol.redmine.impasse.db.exentity.ImpasseNodes;

/**
 * TestLink's test suite.
 * 
 * @author shinsuke
 *
 */
public class TestSuite implements TestNode {
    private String name = "";

    private int nodeOrder = 0;

    private String details = "";

    private final List<TestNode> nodeSet = new ArrayList<TestNode>();

    private TestSuite parent;

    private final List<String> keywordList = new ArrayList<String>();

    private ImpasseNodes impasseNodes;

    public void addTestNode(final TestNode node) {
        nodeSet.add(node);
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

    public String getDetails() {
        return details;
    }

    public void setDetails(final String details) {
        this.details = details;
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

    public List<TestNode> getChildren() {
        return nodeSet;
    }

    @Override
    public String toString() {
        return "TestSuite [name=" + name + ", nodeOrder=" + nodeOrder
                + ", details=" + details + ", keywordList=" + keywordList
                + ", impasseNodes=" + impasseNodes + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + (details == null ? 0 : details.hashCode());
        result = prime * result
                + (keywordList == null ? 0 : keywordList.hashCode());
        result = prime * result + (name == null ? 0 : name.hashCode());
        result = prime * result + nodeOrder;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final TestSuite other = (TestSuite) obj;
        if (details == null) {
            if (other.details != null) {
                return false;
            }
        } else if (!details.equals(other.details)) {
            return false;
        }
        if (keywordList == null) {
            if (other.keywordList != null) {
                return false;
            }
        } else if (!keywordList.equals(other.keywordList)) {
            return false;
        }
        if (name == null) {
            if (other.name != null) {
                return false;
            }
        } else if (!name.equals(other.name)) {
            return false;
        }
        if (nodeOrder != other.nodeOrder) {
            return false;
        }
        return true;
    }

}
