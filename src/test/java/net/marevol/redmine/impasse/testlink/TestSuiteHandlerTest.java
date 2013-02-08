package net.marevol.redmine.impasse.testlink;

import java.util.List;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import net.marevol.redmine.impasse.testlink.entity.TestCase;
import net.marevol.redmine.impasse.testlink.entity.TestNode;
import net.marevol.redmine.impasse.testlink.entity.TestStep;
import net.marevol.redmine.impasse.testlink.entity.TestSuite;

import org.seasar.extension.unit.S2TestCase;
import org.seasar.framework.util.ResourceUtil;

public class TestSuiteHandlerTest extends S2TestCase {
    public void test_parse() throws Exception {
        final SAXParserFactory factory = SAXParserFactory.newInstance();
        final SAXParser parser = factory.newSAXParser();

        final TestSuiteHandler handler = new TestSuiteHandler();

        parser.parse(
                ResourceUtil.getResourceAsStream("testlink/testsuites.xml"),
                handler);

        final TestSuite testSuite = handler.getTestSuite();

        assertNotNull(testSuite);
        assertEquals("", testSuite.getName());
        assertEquals("", testSuite.getDetails());
        assertEquals(0, testSuite.getNodeOrder());
        assertNull(testSuite.getParent());
        final List<TestNode> children = testSuite.getChildren();
        assertEquals(2, children.size());

        final TestSuite testSuite1 = (TestSuite) children.get(0);
        assertEquals("基本機能", testSuite1.getName());
        assertEquals("<p>製品の基本機能についてのテスト仕様</p>", testSuite1.getDetails());
        assertEquals(0, testSuite1.getNodeOrder());
        assertEquals(testSuite, testSuite1.getParent());

        final TestSuite testSuite2 = (TestSuite) children.get(1);
        assertEquals("拡張機能", testSuite2.getName());
        assertEquals("確認する", testSuite2.getDetails());
        assertEquals(0, testSuite2.getNodeOrder());
        assertEquals(testSuite, testSuite2.getParent());

        final TestCase testCase = (TestCase) getChild(
                getChild(getChild(testSuite1, 1), 0), 0);
        assertEquals("機能１", testCase.getName());
        assertEquals("<p>&nbsp;なし</p>", testCase.getPreconditions());
        assertEquals("<p>&nbsp;機能１の確認</p>", testCase.getSummary());
        final List<TestStep> children2 = testCase.getChildren();
        assertEquals(2, children2.size());

        final TestStep testStep = children2.get(0);
        assertEquals("<p>&nbsp;http://www.chazine.com/ へアクセスする。</p>",
                testStep.getActions());
        assertEquals("<p>&nbsp;画面ページが表示される。</p>", testStep.getExpectedResults());
        assertEquals(1, testStep.getStepNumber());
        assertEquals(0, testStep.getExecutionType());

    }

    private TestNode getChild(final TestNode testNode, final int index) {
        return ((TestSuite) testNode).getChildren().get(index);
    }
}
