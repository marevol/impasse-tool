package net.marevol.redmine.impasse.db.cbean.nss;

import net.marevol.redmine.impasse.db.cbean.cq.ImpasseTestCasesCQ;

/**
 * The nest select set-upper of impasse_test_cases.
 * @author DBFlute(AutoGenerator)
 */
public class ImpasseTestCasesNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected ImpasseTestCasesCQ _query;

    public ImpasseTestCasesNss(final ImpasseTestCasesCQ query) {
        _query = query;
    }

    public boolean hasConditionQuery() {
        return _query != null;
    }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============

}
