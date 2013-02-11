package net.marevol.redmine.impasse.report;

import java.io.File;

public interface Reporter {

    Reporter projectName(String name);

    Reporter outputFile(File outputFile);

    Reporter includeResults(boolean includeResults);

    Reporter planName(String planName);

    void execute();

}
