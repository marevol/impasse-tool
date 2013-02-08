package net.marevol.redmine.impasse.db.cbean.nss;

import net.marevol.redmine.impasse.db.cbean.cq.ImpasseNodeKeywordsCQ;

/**
 * The nest select set-upper of impasse_node_keywords.
 * @author DBFlute(AutoGenerator)
 */
public class ImpasseNodeKeywordsNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected ImpasseNodeKeywordsCQ _query;

    public ImpasseNodeKeywordsNss(final ImpasseNodeKeywordsCQ query) {
        _query = query;
    }

    public boolean hasConditionQuery() {
        return _query != null;
    }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============

}
