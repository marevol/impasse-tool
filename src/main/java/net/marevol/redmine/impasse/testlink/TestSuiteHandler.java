package net.marevol.redmine.impasse.testlink;

import java.util.LinkedList;

import net.marevol.redmine.impasse.testlink.entity.TestCase;
import net.marevol.redmine.impasse.testlink.entity.TestNode;
import net.marevol.redmine.impasse.testlink.entity.TestStep;
import net.marevol.redmine.impasse.testlink.entity.TestSuite;

import org.seasar.framework.util.StringUtil;
import org.xml.sax.Attributes;
import org.xml.sax.helpers.DefaultHandler;

/**
 * SAX handler implement to parse TestLink's XML file.
 * 
 * @author shinsuke
 *
 */
public class TestSuiteHandler extends DefaultHandler {

    private static final Object EMPTY_OBJ = new Object();

    LinkedList<Object> queue = new LinkedList<Object>();

    TestSuite rootNode;

    public TestSuite getTestSuite() {
        return rootNode;
    }

    @Override
    public void startDocument() {
    }

    @Override
    public void endDocument() {
    }

    @Override
    public void startElement(final String namespaceURI, final String localName,
            final String qName, final Attributes attrs) {
        if ("testsuite".equals(qName)) {
            final TestSuite node = new TestSuite();
            node.setName(attrs.getValue("name"));

            final TestSuite parentNode = getParentTestSuite();
            if (parentNode != null) {
                parentNode.addTestNode(node);
                node.setParent(parentNode);
            }

            if (rootNode == null) {
                rootNode = node;
            }

            queue.add(node);
        } else if ("testcase".equals(qName)) {
            final TestCase node = new TestCase();
            node.setName(attrs.getValue("name"));
            node.setInternalId(Integer.parseInt(attrs.getValue("internalid")));

            final TestSuite parentNode = getParentTestSuite();
            if (parentNode != null) {
                parentNode.addTestNode(node);
                node.setParent(parentNode);
            }

            queue.add(node);
        } else if ("step".equals(qName)) {
            final TestStep node = new TestStep();

            final TestCase parentNode = getParentTestCase();
            if (parentNode != null) {
                parentNode.addTestStep(node);
                node.setParent(parentNode);
            }

            queue.add(node);
        } else if ("keyword".equals(qName)) {
            final TestNode testNode = getCurrentTestNode();
            if (testNode != null) {
                final String name = attrs.getValue("name");
                if (StringUtil.isNotBlank(name)) {
                    testNode.addKeyword(name);
                }
            }

            queue.add(EMPTY_OBJ);
        } else if ("node_order".equals(qName) //
                || "details".equals(qName) //
                || "externalid".equals(qName) //
                || "version".equals(qName) //
                || "summary".equals(qName) //
                || "preconditions".equals(qName) //
                || "execution_type".equals(qName) //
                || "importance".equals(qName) //
                || "step_number".equals(qName) //
                || "actions".equals(qName) //
                || "expectedresults".equals(qName) //
                || "execution_type".equals(qName) //
        ) {
            queue.add(new StringBuilder(100));
        } else {
            queue.add(EMPTY_OBJ);
        }
        // TODO notes
    }

    @Override
    public void endElement(final String namespaceURI, final String localName,
            final String qName) {
        if ("testsuite".equals(qName)) {
            // nothing
        } else if ("testcase".equals(qName)) {
            // nothing
        } else if ("step".equals(qName)) {
            // nothing
        } else if ("node_order".equals(qName)) {
            final TestNode node = getParentTestNode();
            if (node != null) {
                node.setNodeOrder(getTextValueAsInt());
            }
        } else if ("details".equals(qName)) {
            final TestSuite node = getParentTestSuite();
            if (node != null) {
                node.setDetails(getTextValue());
            }
        } else if ("externalid".equals(qName)) {
            final TestCase node = getParentTestCase();
            if (node != null) {
                node.setExternalId(getTextValueAsInt());
            }
        } else if ("version".equals(qName)) {
            final TestCase node = getParentTestCase();
            if (node != null) {
                node.setVersion(getTextValueAsInt());
            }
        } else if ("summary".equals(qName)) {
            final TestCase node = getParentTestCase();
            if (node != null) {
                node.setSummary(getTextValue());
            }
        } else if ("preconditions".equals(qName)) {
            final TestCase node = getParentTestCase();
            if (node != null) {
                node.setPreconditions(getTextValue());
            }
        } else if ("execution_type".equals(qName)) {
            final TestCase node = getParentTestCase();
            if (node != null) {
                node.setExecutionType(getTextValueAsInt());
            }
        } else if ("importance".equals(qName)) {
            final TestCase node = getParentTestCase();
            if (node != null) {
                node.setImportance(getTextValueAsInt());
            }
        } else if ("step_number".equals(qName)) {
            final TestStep node = getParentTestStep();
            if (node != null) {
                node.setStepNumber(getTextValueAsInt());
            }
        } else if ("actions".equals(qName)) {
            final TestStep node = getParentTestStep();
            if (node != null) {
                node.setActions(getTextValue());
            }
        } else if ("expectedresults".equals(qName)) {
            final TestStep node = getParentTestStep();
            if (node != null) {
                node.setExpectedResults(getTextValue());
            }
        } else if ("execution_type".equals(qName)) {
            final TestStep node = getParentTestStep();
            if (node != null) {
                node.setExecutionType(getTextValueAsInt());
            }
        }
        queue.removeLast();
    }

    @Override
    public void characters(final char[] ch, final int start, final int length) {
        final StringBuilder buffer = getBuffer();
        if (buffer != null) {
            buffer.append(new String(ch, start, length));
        }

    }

    private String getTextValue() {
        return getBuffer().toString().trim();
    }

    private int getTextValueAsInt() {
        final String text = getTextValue();
        if (StringUtil.isNotEmpty(text)) {
            return Integer.parseInt(text);
        }
        return 0;
    }

    private TestNode getParentTestNode() {
        final Object obj = queue.peekLast();
        if (obj instanceof TestNode) {
            return (TestNode) obj;
        }
        return null;
    }

    private TestSuite getParentTestSuite() {
        for (int i = queue.size() - 1; i >= 0; i--) {
            final Object obj = queue.get(i);
            if (obj instanceof TestSuite) {
                return (TestSuite) obj;
            }
        }
        return null;
    }

    private TestCase getParentTestCase() {
        for (int i = queue.size() - 1; i >= 0; i--) {
            final Object obj = queue.get(i);
            if (obj instanceof TestCase) {
                return (TestCase) obj;
            }
        }
        return null;
    }

    private TestStep getParentTestStep() {
        for (int i = queue.size() - 1; i >= 0; i--) {
            final Object obj = queue.get(i);
            if (obj instanceof TestStep) {
                return (TestStep) obj;
            }
        }
        return null;
    }

    private StringBuilder getBuffer() {
        final Object obj = queue.peekLast();
        if (obj instanceof StringBuilder) {
            return (StringBuilder) obj;
        }
        return null;
    }

    private TestNode getCurrentTestNode() {
        for (int i = queue.size() - 1; i >= 0; i--) {
            final Object obj = queue.get(i);
            if (obj instanceof TestNode) {
                return (TestNode) obj;
            }
        }
        return null;
    }
}
