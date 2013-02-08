package net.marevol.redmine.impasse.db.cbean.nss;

import net.marevol.redmine.impasse.db.cbean.cq.ImpasseTestPlanCasesCQ;

/**
 * The nest select set-upper of impasse_test_plan_cases.
 * @author DBFlute(AutoGenerator)
 */
public class ImpasseTestPlanCasesNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected ImpasseTestPlanCasesCQ _query;

    public ImpasseTestPlanCasesNss(final ImpasseTestPlanCasesCQ query) {
        _query = query;
    }

    public boolean hasConditionQuery() {
        return _query != null;
    }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============

}
