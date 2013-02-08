package net.marevol.redmine.impasse.db.cbean.nss;

import net.marevol.redmine.impasse.db.cbean.cq.ImpasseSettingsCQ;

/**
 * The nest select set-upper of impasse_settings.
 * @author DBFlute(AutoGenerator)
 */
public class ImpasseSettingsNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected ImpasseSettingsCQ _query;

    public ImpasseSettingsNss(final ImpasseSettingsCQ query) {
        _query = query;
    }

    public boolean hasConditionQuery() {
        return _query != null;
    }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============

}
