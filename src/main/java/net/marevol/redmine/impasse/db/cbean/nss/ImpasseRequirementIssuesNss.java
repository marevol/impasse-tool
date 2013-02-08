package net.marevol.redmine.impasse.db.cbean.nss;

import net.marevol.redmine.impasse.db.cbean.cq.ImpasseRequirementIssuesCQ;

/**
 * The nest select set-upper of impasse_requirement_issues.
 * @author DBFlute(AutoGenerator)
 */
public class ImpasseRequirementIssuesNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected ImpasseRequirementIssuesCQ _query;

    public ImpasseRequirementIssuesNss(final ImpasseRequirementIssuesCQ query) {
        _query = query;
    }

    public boolean hasConditionQuery() {
        return _query != null;
    }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============

}
