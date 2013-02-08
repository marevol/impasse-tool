package net.marevol.redmine.impasse.db.cbean.nss;

import net.marevol.redmine.impasse.db.cbean.cq.ImpasseExecutionsCQ;

/**
 * The nest select set-upper of impasse_executions.
 * @author DBFlute(AutoGenerator)
 */
public class ImpasseExecutionsNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected ImpasseExecutionsCQ _query;

    public ImpasseExecutionsNss(final ImpasseExecutionsCQ query) {
        _query = query;
    }

    public boolean hasConditionQuery() {
        return _query != null;
    }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============

}
