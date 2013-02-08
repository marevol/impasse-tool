package net.marevol.redmine.impasse.db.cbean.nss;

import net.marevol.redmine.impasse.db.cbean.cq.ImpasseExecutionBugsCQ;

/**
 * The nest select set-upper of impasse_execution_bugs.
 * @author DBFlute(AutoGenerator)
 */
public class ImpasseExecutionBugsNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected ImpasseExecutionBugsCQ _query;

    public ImpasseExecutionBugsNss(final ImpasseExecutionBugsCQ query) {
        _query = query;
    }

    public boolean hasConditionQuery() {
        return _query != null;
    }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============

}
