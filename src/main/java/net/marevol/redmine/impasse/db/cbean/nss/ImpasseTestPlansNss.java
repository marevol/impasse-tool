package net.marevol.redmine.impasse.db.cbean.nss;

import net.marevol.redmine.impasse.db.cbean.cq.ImpasseTestPlansCQ;

/**
 * The nest select set-upper of impasse_test_plans.
 * @author DBFlute(AutoGenerator)
 */
public class ImpasseTestPlansNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected ImpasseTestPlansCQ _query;

    public ImpasseTestPlansNss(final ImpasseTestPlansCQ query) {
        _query = query;
    }

    public boolean hasConditionQuery() {
        return _query != null;
    }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============

}
