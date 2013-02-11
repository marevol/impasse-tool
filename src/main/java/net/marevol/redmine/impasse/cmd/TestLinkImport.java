package net.marevol.redmine.impasse.cmd;

import java.io.File;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import net.marevol.redmine.impasse.ImpasseSystemException;
import net.marevol.redmine.impasse.testlink.TestLinkImporter;
import net.marevol.redmine.impasse.testlink.TestSuiteHandler;
import net.marevol.redmine.impasse.testlink.entity.TestSuite;

import org.seasar.framework.container.S2Container;
import org.seasar.framework.container.factory.SingletonS2ContainerFactory;
import org.seasar.framework.util.StringUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * A command to import test data from TestLink.
 * <p>
 * java net.marevol.redmine.impasse.cmd.TestLinkImport &lt;Redmine Project Name&gt; &lt;TestLink XML File&gt;
 * </p>
 * 
 * @author shinsuke
 *
 */
public class TestLinkImport {
    static final Logger logger = LoggerFactory // NOPMD
            .getLogger(TestLinkImport.class);

    public static void main(final String[] args) {

        if (args.length == 0) {
            System.err.println("No args.");
            System.exit(1);
        }

        final String projectId = args[0];
        if (StringUtil.isEmpty(projectId)) {
            System.err.println("No project ID.");
            System.exit(1);
        }

        final String testCaseFilePath = args[1];
        if (StringUtil.isEmpty(testCaseFilePath)) {
            System.err.println("No XML file.");
            System.exit(1);
        }
        final File testCaseFile = new File(testCaseFilePath);

        TestLinkImport.execute(projectId, testCaseFile);

    }

    private static void execute(final String projectId, final File testCaseFile) {
        SingletonS2ContainerFactory.init();
        final S2Container container = SingletonS2ContainerFactory
                .getContainer();

        try {
            final TestLinkImporter testLinkImporter = (TestLinkImporter) container
                    .getComponent("testLinkImporter");

            final SAXParserFactory factory = SAXParserFactory.newInstance();
            final SAXParser parser = factory.newSAXParser();

            final TestSuiteHandler handler = new TestSuiteHandler();

            parser.parse(testCaseFile, handler);

            final TestSuite testSuite = handler.getTestSuite();
            testLinkImporter.importData(projectId, testSuite);
        } catch (final Exception e) {
            throw new ImpasseSystemException(e);
        } finally {
            container.destroy();
        }

    }
}
