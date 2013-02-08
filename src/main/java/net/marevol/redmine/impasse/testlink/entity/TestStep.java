package net.marevol.redmine.impasse.testlink.entity;

import net.marevol.redmine.impasse.db.exentity.ImpasseNodes;

/**
 * TestLink's test step.
 * 
 * @author shinsuke
 *
 */
public class TestStep {
    private int stepNumber = 0;

    private String actions = "";

    private String expectedResults = "";

    private int executionType = 0;

    private TestCase parent;

    private ImpasseNodes impasseNodes;

    public int getStepNumber() {
        return stepNumber;
    }

    public void setStepNumber(final int stepNumber) {
        this.stepNumber = stepNumber;
    }

    public String getActions() {
        return actions;
    }

    public void setActions(final String actions) {
        this.actions = actions;
    }

    public String getExpectedResults() {
        return expectedResults;
    }

    public void setExpectedResults(final String expectedResults) {
        this.expectedResults = expectedResults;
    }

    public int getExecutionType() {
        return executionType;
    }

    public void setExecutionType(final int executionType) {
        this.executionType = executionType;
    }

    public void setParent(final TestCase parent) {
        this.parent = parent;
    }

    public TestCase getParent() {
        return parent;
    }

    public ImpasseNodes getImpasseNodes() {
        return impasseNodes;
    }

    public void setImpasseNodes(final ImpasseNodes impasseNodes) {
        this.impasseNodes = impasseNodes;
    }

    @Override
    public String toString() {
        return "TestStep [stepNumber=" + stepNumber + ", actions=" + actions
                + ", expectedResults=" + expectedResults + ", executionType="
                + executionType + ", impasseNodes=" + impasseNodes + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + (actions == null ? 0 : actions.hashCode());
        result = prime * result + executionType;
        result = prime * result
                + (expectedResults == null ? 0 : expectedResults.hashCode());
        result = prime * result + stepNumber;
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
        final TestStep other = (TestStep) obj;
        if (actions == null) {
            if (other.actions != null) {
                return false;
            }
        } else if (!actions.equals(other.actions)) {
            return false;
        }
        if (executionType != other.executionType) {
            return false;
        }
        if (expectedResults == null) {
            if (other.expectedResults != null) {
                return false;
            }
        } else if (!expectedResults.equals(other.expectedResults)) {
            return false;
        }
        if (stepNumber != other.stepNumber) {
            return false;
        }
        return true;
    }

}
