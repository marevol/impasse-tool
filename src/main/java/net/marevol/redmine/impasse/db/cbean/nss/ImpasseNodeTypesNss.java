package net.marevol.redmine.impasse.db.cbean.nss;

import net.marevol.redmine.impasse.db.cbean.cq.ImpasseNodeTypesCQ;

/**
 * The nest select set-upper of impasse_node_types.
 * @author DBFlute(AutoGenerator)
 */
public class ImpasseNodeTypesNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected ImpasseNodeTypesCQ _query;

    public ImpasseNodeTypesNss(final ImpasseNodeTypesCQ query) {
        _query = query;
    }

    public boolean hasConditionQuery() {
        return _query != null;
    }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============

}
