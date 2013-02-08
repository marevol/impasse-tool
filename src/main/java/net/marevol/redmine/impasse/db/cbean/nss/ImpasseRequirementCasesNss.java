package net.marevol.redmine.impasse.db.cbean.nss;

import net.marevol.redmine.impasse.db.cbean.cq.ImpasseRequirementCasesCQ;

/**
 * The nest select set-upper of impasse_requirement_cases.
 * @author DBFlute(AutoGenerator)
 */
public class ImpasseRequirementCasesNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected ImpasseRequirementCasesCQ _query;

    public ImpasseRequirementCasesNss(final ImpasseRequirementCasesCQ query) {
        _query = query;
    }

    public boolean hasConditionQuery() {
        return _query != null;
    }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============

}
