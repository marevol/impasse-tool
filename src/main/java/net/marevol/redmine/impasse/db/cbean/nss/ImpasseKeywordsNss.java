package net.marevol.redmine.impasse.db.cbean.nss;

import net.marevol.redmine.impasse.db.cbean.cq.ImpasseKeywordsCQ;

/**
 * The nest select set-upper of impasse_keywords.
 * @author DBFlute(AutoGenerator)
 */
public class ImpasseKeywordsNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected ImpasseKeywordsCQ _query;

    public ImpasseKeywordsNss(final ImpasseKeywordsCQ query) {
        _query = query;
    }

    public boolean hasConditionQuery() {
        return _query != null;
    }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============

}
