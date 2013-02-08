package net.marevol.redmine.impasse.testlink.entity;

/**
 * A test node interface is represented by TestSuite and TestCase.
 * 
 * @author shinsuke
 *
 */
public interface TestNode {

    int getNodeOrder();

    void setNodeOrder(int order);

    void addKeyword(String name);

}
