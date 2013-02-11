package net.marevol.redmine.impasse.db.cbean.cq.bs;

import java.util.Map;

import net.marevol.redmine.impasse.db.cbean.ImpasseRequirementIssuesCB;
import net.marevol.redmine.impasse.db.cbean.cq.ImpasseRequirementIssuesCQ;
import net.marevol.redmine.impasse.db.cbean.cq.ciq.ImpasseRequirementIssuesCIQ;

import org.seasar.dbflute.cbean.ConditionQuery;
import org.seasar.dbflute.cbean.cvalue.ConditionValue;
import org.seasar.dbflute.cbean.sqlclause.SqlClause;
import org.seasar.dbflute.exception.IllegalConditionBeanOperationException;

/**
 * The base condition-query of impasse_requirement_issues.
 * @author DBFlute(AutoGenerator)
 */
public class BsImpasseRequirementIssuesCQ extends
        AbstractBsImpasseRequirementIssuesCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected ImpasseRequirementIssuesCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsImpasseRequirementIssuesCQ(final ConditionQuery childQuery,
            final SqlClause sqlClause, final String aliasName,
            final int nestLevel) {
        super(childQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br />
     * {select ... from ... left outer join (select * from impasse_requirement_issues) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #FD4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public ImpasseRequirementIssuesCIQ inline() {
        if (_inlineQuery == null) {
            _inlineQuery = xcreateCIQ();
        }
        _inlineQuery.xsetOnClause(false);
        return _inlineQuery;
    }

    protected ImpasseRequirementIssuesCIQ xcreateCIQ() {
        final ImpasseRequirementIssuesCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected ImpasseRequirementIssuesCIQ xnewCIQ() {
        return new ImpasseRequirementIssuesCIQ(xgetReferrerQuery(),
                xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br />
     * {select ... from ... left outer join impasse_requirement_issues on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #FD4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public ImpasseRequirementIssuesCIQ on() {
        if (isBaseQuery()) {
            throw new IllegalConditionBeanOperationException(
                    "OnClause for local table is unavailable!");
        }
        final ImpasseRequirementIssuesCIQ inlineQuery = inline();
        inlineQuery.xsetOnClause(true);
        return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====

    protected ConditionValue _id;

    public ConditionValue getId() {
        if (_id == null) {
            _id = nCV();
        }
        return _id;
    }

    @Override
    protected ConditionValue getCValueId() {
        return getId();
    }

    /** 
     * Add order-by as ascend. <br />
     * id: {PK, ID, NotNull, INT(10)}
     * @return this. (NotNull)
     */
    public BsImpasseRequirementIssuesCQ addOrderBy_Id_Asc() {
        regOBA("id");
        return this;
    }

    /**
     * Add order-by as descend. <br />
     * id: {PK, ID, NotNull, INT(10)}
     * @return this. (NotNull)
     */
    public BsImpasseRequirementIssuesCQ addOrderBy_Id_Desc() {
        regOBD("id");
        return this;
    }

    protected ConditionValue _issueId;

    public ConditionValue getIssueId() {
        if (_issueId == null) {
            _issueId = nCV();
        }
        return _issueId;
    }

    @Override
    protected ConditionValue getCValueIssueId() {
        return getIssueId();
    }

    /** 
     * Add order-by as ascend. <br />
     * issue_id: {NotNull, INT(10)}
     * @return this. (NotNull)
     */
    public BsImpasseRequirementIssuesCQ addOrderBy_IssueId_Asc() {
        regOBA("issue_id");
        return this;
    }

    /**
     * Add order-by as descend. <br />
     * issue_id: {NotNull, INT(10)}
     * @return this. (NotNull)
     */
    public BsImpasseRequirementIssuesCQ addOrderBy_IssueId_Desc() {
        regOBD("issue_id");
        return this;
    }

    protected ConditionValue _numOfCases;

    public ConditionValue getNumOfCases() {
        if (_numOfCases == null) {
            _numOfCases = nCV();
        }
        return _numOfCases;
    }

    @Override
    protected ConditionValue getCValueNumOfCases() {
        return getNumOfCases();
    }

    /** 
     * Add order-by as ascend. <br />
     * num_of_cases: {INT(10), default=[0]}
     * @return this. (NotNull)
     */
    public BsImpasseRequirementIssuesCQ addOrderBy_NumOfCases_Asc() {
        regOBA("num_of_cases");
        return this;
    }

    /**
     * Add order-by as descend. <br />
     * num_of_cases: {INT(10), default=[0]}
     * @return this. (NotNull)
     */
    public BsImpasseRequirementIssuesCQ addOrderBy_NumOfCases_Desc() {
        regOBD("num_of_cases");
        return this;
    }

    // ===================================================================================
    //                                                             SpecifiedDerivedOrderBy
    //                                                             =======================
    /**
     * Add order-by for specified derived column as ascend.
     * <pre>
     * cb.specify().derivedPurchaseList().max(new SubQuery&lt;PurchaseCB&gt;() {
     *     public void query(PurchaseCB subCB) {
     *         subCB.specify().columnPurchaseDatetime();
     *     }
     * }, <span style="color: #FD4747">aliasName</span>);
     * <span style="color: #3F7E5E">// order by [alias-name] asc</span>
     * cb.<span style="color: #FD4747">addSpecifiedDerivedOrderBy_Asc</span>(<span style="color: #FD4747">aliasName</span>);
     * </pre>
     * @param aliasName The alias name specified at (Specify)DerivedReferrer. (NotNull)
     * @return this. (NotNull)
     */
    public BsImpasseRequirementIssuesCQ addSpecifiedDerivedOrderBy_Asc(
            final String aliasName) {
        registerSpecifiedDerivedOrderBy_Asc(aliasName);
        return this;
    }

    /**
     * Add order-by for specified derived column as descend.
     * <pre>
     * cb.specify().derivedPurchaseList().max(new SubQuery&lt;PurchaseCB&gt;() {
     *     public void query(PurchaseCB subCB) {
     *         subCB.specify().columnPurchaseDatetime();
     *     }
     * }, <span style="color: #FD4747">aliasName</span>);
     * <span style="color: #3F7E5E">// order by [alias-name] desc</span>
     * cb.<span style="color: #FD4747">addSpecifiedDerivedOrderBy_Desc</span>(<span style="color: #FD4747">aliasName</span>);
     * </pre>
     * @param aliasName The alias name specified at (Specify)DerivedReferrer. (NotNull)
     * @return this. (NotNull)
     */
    public BsImpasseRequirementIssuesCQ addSpecifiedDerivedOrderBy_Desc(
            final String aliasName) {
        registerSpecifiedDerivedOrderBy_Desc(aliasName);
        return this;
    }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    @Override
    protected void reflectRelationOnUnionQuery(
            final ConditionQuery baseQueryAsSuper,
            final ConditionQuery unionQueryAsSuper) {
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    protected Map<String, ImpasseRequirementIssuesCQ> _scalarConditionMap;

    public Map<String, ImpasseRequirementIssuesCQ> getScalarCondition() {
        return _scalarConditionMap;
    }

    @Override
    public String keepScalarCondition(final ImpasseRequirementIssuesCQ subQuery) {
        if (_scalarConditionMap == null) {
            _scalarConditionMap = newLinkedHashMap();
        }
        final String key = "subQueryMapKey" + (_scalarConditionMap.size() + 1);
        _scalarConditionMap.put(key, subQuery);
        return "scalarCondition." + key;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    protected Map<String, ImpasseRequirementIssuesCQ> _specifyMyselfDerivedMap;

    public Map<String, ImpasseRequirementIssuesCQ> getSpecifyMyselfDerived() {
        return _specifyMyselfDerivedMap;
    }

    @Override
    public String keepSpecifyMyselfDerived(
            final ImpasseRequirementIssuesCQ subQuery) {
        if (_specifyMyselfDerivedMap == null) {
            _specifyMyselfDerivedMap = newLinkedHashMap();
        }
        final String key = "subQueryMapKey"
                + (_specifyMyselfDerivedMap.size() + 1);
        _specifyMyselfDerivedMap.put(key, subQuery);
        return "specifyMyselfDerived." + key;
    }

    protected Map<String, ImpasseRequirementIssuesCQ> _queryMyselfDerivedMap;

    public Map<String, ImpasseRequirementIssuesCQ> getQueryMyselfDerived() {
        return _queryMyselfDerivedMap;
    }

    @Override
    public String keepQueryMyselfDerived(
            final ImpasseRequirementIssuesCQ subQuery) {
        if (_queryMyselfDerivedMap == null) {
            _queryMyselfDerivedMap = newLinkedHashMap();
        }
        final String key = "subQueryMapKey"
                + (_queryMyselfDerivedMap.size() + 1);
        _queryMyselfDerivedMap.put(key, subQuery);
        return "queryMyselfDerived." + key;
    }

    protected Map<String, Object> _qyeryMyselfDerivedParameterMap;

    public Map<String, Object> getQueryMyselfDerivedParameter() {
        return _qyeryMyselfDerivedParameterMap;
    }

    @Override
    public String keepQueryMyselfDerivedParameter(final Object parameterValue) {
        if (_qyeryMyselfDerivedParameterMap == null) {
            _qyeryMyselfDerivedParameterMap = newLinkedHashMap();
        }
        final String key = "subQueryParameterKey"
                + (_qyeryMyselfDerivedParameterMap.size() + 1);
        _qyeryMyselfDerivedParameterMap.put(key, parameterValue);
        return "queryMyselfDerivedParameter." + key;
    }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, ImpasseRequirementIssuesCQ> _myselfExistsMap;

    public Map<String, ImpasseRequirementIssuesCQ> getMyselfExists() {
        return _myselfExistsMap;
    }

    @Override
    public String keepMyselfExists(final ImpasseRequirementIssuesCQ subQuery) {
        if (_myselfExistsMap == null) {
            _myselfExistsMap = newLinkedHashMap();
        }
        final String key = "subQueryMapKey" + (_myselfExistsMap.size() + 1);
        _myselfExistsMap.put(key, subQuery);
        return "myselfExists." + key;
    }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    protected Map<String, ImpasseRequirementIssuesCQ> _myselfInScopeMap;

    public Map<String, ImpasseRequirementIssuesCQ> getMyselfInScope() {
        return _myselfInScopeMap;
    }

    @Override
    public String keepMyselfInScope(final ImpasseRequirementIssuesCQ subQuery) {
        if (_myselfInScopeMap == null) {
            _myselfInScopeMap = newLinkedHashMap();
        }
        final String key = "subQueryMapKey" + (_myselfInScopeMap.size() + 1);
        _myselfInScopeMap.put(key, subQuery);
        return "myselfInScope." + key;
    }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() {
        return ImpasseRequirementIssuesCB.class.getName();
    }

    protected String xCQ() {
        return ImpasseRequirementIssuesCQ.class.getName();
    }

    protected String xMap() {
        return Map.class.getName();
    }
}
