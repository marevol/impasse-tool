package net.marevol.redmine.impasse.db.cbean.cq;

import net.marevol.redmine.impasse.db.cbean.cq.bs.BsImpasseKeywordsCQ;

import org.seasar.dbflute.cbean.ConditionQuery;
import org.seasar.dbflute.cbean.sqlclause.SqlClause;

/**
 * The condition-query of impasse_keywords.
 * <p>
 * You can implement your original methods here.
 * This class remains when re-generating.
 * </p>
 * @author DBFlute(AutoGenerator)
 */
public class ImpasseKeywordsCQ extends BsImpasseKeywordsCQ {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    // You should NOT touch with this constructor.
    /**
     * Constructor.
     * @param referrerQuery The instance of referrer query. (NullAllowed: If null, this is base query)
     * @param sqlClause The instance of SQL clause. (NotNull)
     * @param aliasName The alias projectName for this query. (NotNull)
     * @param nestLevel The nest level of this query. (If zero, this is base query)
     */
    public ImpasseKeywordsCQ(final ConditionQuery referrerQuery,
            final SqlClause sqlClause, final String aliasName,
            final int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                       Arrange Query
    //                                                                       =============
    // You can make your arranged query methods here.
    //public void arrangeXxx() {
    //    ...
    //}
}
