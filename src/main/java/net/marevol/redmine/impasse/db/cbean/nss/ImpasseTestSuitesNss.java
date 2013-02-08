package net.marevol.redmine.impasse.db.cbean.nss;

import net.marevol.redmine.impasse.db.cbean.cq.ImpasseTestSuitesCQ;

/**
 * The nest select set-upper of impasse_test_suites.
 * @author DBFlute(AutoGenerator)
 */
public class ImpasseTestSuitesNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected ImpasseTestSuitesCQ _query;

    public ImpasseTestSuitesNss(final ImpasseTestSuitesCQ query) {
        _query = query;
    }

    public boolean hasConditionQuery() {
        return _query != null;
    }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============

}
