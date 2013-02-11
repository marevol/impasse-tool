package net.marevol.redmine.impasse.report;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

public class ReporterFactory {
    protected Map<String, Reporter> reporterMap = new HashMap<String, Reporter>();

    public void add(final String extention, final Reporter reporter) {
        reporterMap.put(extention, reporter);
    }

    public Reporter get(final File file) {
        if (file == null) {
            return null;
        }

        final String name = file.getName();
        final String[] split = name.split("\\.");
        return reporterMap.get(split[split.length - 1]);
    }
}
