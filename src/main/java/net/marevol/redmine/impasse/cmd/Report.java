package net.marevol.redmine.impasse.cmd;

import java.io.File;

import net.marevol.redmine.impasse.ImpasseSystemException;
import net.marevol.redmine.impasse.report.Reporter;
import net.marevol.redmine.impasse.report.ReporterFactory;

import org.kohsuke.args4j.CmdLineException;
import org.kohsuke.args4j.CmdLineParser;
import org.kohsuke.args4j.Option;
import org.seasar.framework.container.S2Container;
import org.seasar.framework.container.factory.SingletonS2ContainerFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * A command to print a report.
 * <p>
 * java net.marevol.redmine.impasse.cmd.Report &lt;Redmine Project Name&gt;
 * </p>
 * 
 * @author shinsuke
 *
 */
public class Report {
    static final Logger logger = LoggerFactory // NOPMD
            .getLogger(Report.class);

    protected static class Options {

        @Option(name = "-n", aliases = "--project-name", metaVar = "ProjectName", usage = "Project Name", required = true)
        protected String projectName;

        @Option(name = "-p", aliases = "--plan-name", metaVar = "PlanName", usage = "Test Plan Name")
        protected String planName;

        @Option(name = "-r", aliases = "--include-result", usage = "")
        protected boolean includeResult;

        @Option(name = "-s", aliases = "--skip-empty-testsuite", usage = "")
        protected boolean skipEmptyTestsuite;

        @Option(name = "-o", aliases = "--out", metaVar = "OutputFile", usage = "Output File", required = true)
        protected File outputFile;
    }

    public static void main(final String[] args) {
        final Options options = new Options();

        final CmdLineParser parser = new CmdLineParser(options);
        try {
            parser.parseArgument(args);
        } catch (final CmdLineException e) {
            System.err.println(e.getMessage());
            System.err.println("java " + Report.class.getCanonicalName()
                    + " [options...] arguments...");
            parser.printUsage(System.err);
            return;
        }

        execute(options);

    }

    private static void execute(final Options options) {
        SingletonS2ContainerFactory.init();
        final S2Container container = SingletonS2ContainerFactory
                .getContainer();

        try {
            final ReporterFactory reporterFactory = (ReporterFactory) container
                    .getComponent("reporterFactory");
            final Reporter reporter = reporterFactory.get(options.outputFile);
            if (reporter == null) {
                System.err.println("Unsupported output file: "
                        + options.outputFile);
                return;
            }

            reporter.projectName(options.projectName)
                    .planName(options.planName).outputFile(options.outputFile)
                    .includeResults(options.includeResult)
                    .skipEmptyTestsuite(options.skipEmptyTestsuite)
                    .execute();

        } catch (final Exception e) {
            throw new ImpasseSystemException(e);
        } finally {
            container.destroy();
        }

    }
}
