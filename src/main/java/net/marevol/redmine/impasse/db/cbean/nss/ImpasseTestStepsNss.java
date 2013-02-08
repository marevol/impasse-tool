package net.marevol.redmine.impasse.db.cbean.nss;

import net.marevol.redmine.impasse.db.cbean.cq.ImpasseTestStepsCQ;

/**
 * The nest select set-upper of impasse_test_steps.
 * @author DBFlute(AutoGenerator)
 */
public class ImpasseTestStepsNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected ImpasseTestStepsCQ _query;

    public ImpasseTestStepsNss(final ImpasseTestStepsCQ query) {
        _query = query;
    }

    public boolean hasConditionQuery() {
        return _query != null;
    }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============

}
