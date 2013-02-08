package net.marevol.redmine.impasse.db.cbean.nss;

import net.marevol.redmine.impasse.db.cbean.cq.ImpasseExecutionHistoriesCQ;

/**
 * The nest select set-upper of impasse_execution_histories.
 * @author DBFlute(AutoGenerator)
 */
public class ImpasseExecutionHistoriesNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected ImpasseExecutionHistoriesCQ _query;

    public ImpasseExecutionHistoriesNss(final ImpasseExecutionHistoriesCQ query) {
        _query = query;
    }

    public boolean hasConditionQuery() {
        return _query != null;
    }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============

}
