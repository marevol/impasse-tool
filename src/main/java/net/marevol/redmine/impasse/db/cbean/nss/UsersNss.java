package net.marevol.redmine.impasse.db.cbean.nss;

import net.marevol.redmine.impasse.db.cbean.cq.UsersCQ;

/**
 * The nest select set-upper of users.
 * @author DBFlute(AutoGenerator)
 */
public class UsersNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected UsersCQ _query;

    public UsersNss(final UsersCQ query) {
        _query = query;
    }

    public boolean hasConditionQuery() {
        return _query != null;
    }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============

}
