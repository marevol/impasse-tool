package net.marevol.redmine.impasse.db.cbean.nss;

import net.marevol.redmine.impasse.db.cbean.cq.ImpasseNodesCQ;

/**
 * The nest select set-upper of impasse_nodes.
 * @author DBFlute(AutoGenerator)
 */
public class ImpasseNodesNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected ImpasseNodesCQ _query;

    public ImpasseNodesNss(final ImpasseNodesCQ query) {
        _query = query;
    }

    public boolean hasConditionQuery() {
        return _query != null;
    }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============

}
