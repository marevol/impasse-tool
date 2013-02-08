package net.marevol.redmine.impasse.db.cbean.cq.bs;

import java.util.Map;

import net.marevol.redmine.impasse.db.cbean.ImpasseTestCasesCB;
import net.marevol.redmine.impasse.db.cbean.cq.ImpasseTestCasesCQ;
import net.marevol.redmine.impasse.db.cbean.cq.ciq.ImpasseTestCasesCIQ;

import org.seasar.dbflute.cbean.ConditionQuery;
import org.seasar.dbflute.cbean.cvalue.ConditionValue;
import org.seasar.dbflute.cbean.sqlclause.SqlClause;
import org.seasar.dbflute.exception.IllegalConditionBeanOperationException;

/**
 * The base condition-query of impasse_test_cases.
 * @author DBFlute(AutoGenerator)
 */
public class BsImpasseTestCasesCQ extends AbstractBsImpasseTestCasesCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected ImpasseTestCasesCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsImpasseTestCasesCQ(final ConditionQuery childQuery,
            final SqlClause sqlClause, final String aliasName,
            final int nestLevel) {
        super(childQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br />
     * {select ... from ... left outer join (select * from impasse_test_cases) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #FD4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public ImpasseTestCasesCIQ inline() {
        if (_inlineQuery == null) {
            _inlineQuery = xcreateCIQ();
        }
        _inlineQuery.xsetOnClause(false);
        return _inlineQuery;
    }

    protected ImpasseTestCasesCIQ xcreateCIQ() {
        final ImpasseTestCasesCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected ImpasseTestCasesCIQ xnewCIQ() {
        return new ImpasseTestCasesCIQ(xgetReferrerQuery(), xgetSqlClause(),
                xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br />
     * {select ... from ... left outer join impasse_test_cases on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #FD4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public ImpasseTestCasesCIQ on() {
        if (isBaseQuery()) {
            throw new IllegalConditionBeanOperationException(
                    "OnClause for local table is unavailable!");
        }
        final ImpasseTestCasesCIQ inlineQuery = inline();
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
    public BsImpasseTestCasesCQ addOrderBy_Id_Asc() {
        regOBA("id");
        return this;
    }

    /**
     * Add order-by as descend. <br />
     * id: {PK, ID, NotNull, INT(10)}
     * @return this. (NotNull)
     */
    public BsImpasseTestCasesCQ addOrderBy_Id_Desc() {
        regOBD("id");
        return this;
    }

    protected ConditionValue _summary;

    public ConditionValue getSummary() {
        if (_summary == null) {
            _summary = nCV();
        }
        return _summary;
    }

    @Override
    protected ConditionValue getCValueSummary() {
        return getSummary();
    }

    /** 
     * Add order-by as ascend. <br />
     * summary: {TEXT(65535)}
     * @return this. (NotNull)
     */
    public BsImpasseTestCasesCQ addOrderBy_Summary_Asc() {
        regOBA("summary");
        return this;
    }

    /**
     * Add order-by as descend. <br />
     * summary: {TEXT(65535)}
     * @return this. (NotNull)
     */
    public BsImpasseTestCasesCQ addOrderBy_Summary_Desc() {
        regOBD("summary");
        return this;
    }

    protected ConditionValue _preconditions;

    public ConditionValue getPreconditions() {
        if (_preconditions == null) {
            _preconditions = nCV();
        }
        return _preconditions;
    }

    @Override
    protected ConditionValue getCValuePreconditions() {
        return getPreconditions();
    }

    /** 
     * Add order-by as ascend. <br />
     * preconditions: {TEXT(65535)}
     * @return this. (NotNull)
     */
    public BsImpasseTestCasesCQ addOrderBy_Preconditions_Asc() {
        regOBA("preconditions");
        return this;
    }

    /**
     * Add order-by as descend. <br />
     * preconditions: {TEXT(65535)}
     * @return this. (NotNull)
     */
    public BsImpasseTestCasesCQ addOrderBy_Preconditions_Desc() {
        regOBD("preconditions");
        return this;
    }

    protected ConditionValue _importance;

    public ConditionValue getImportance() {
        if (_importance == null) {
            _importance = nCV();
        }
        return _importance;
    }

    @Override
    protected ConditionValue getCValueImportance() {
        return getImportance();
    }

    /** 
     * Add order-by as ascend. <br />
     * importance: {INT(10)}
     * @return this. (NotNull)
     */
    public BsImpasseTestCasesCQ addOrderBy_Importance_Asc() {
        regOBA("importance");
        return this;
    }

    /**
     * Add order-by as descend. <br />
     * importance: {INT(10)}
     * @return this. (NotNull)
     */
    public BsImpasseTestCasesCQ addOrderBy_Importance_Desc() {
        regOBD("importance");
        return this;
    }

    protected ConditionValue _active;

    public ConditionValue getActive() {
        if (_active == null) {
            _active = nCV();
        }
        return _active;
    }

    @Override
    protected ConditionValue getCValueActive() {
        return getActive();
    }

    /** 
     * Add order-by as ascend. <br />
     * active: {BIT, default=[1]}
     * @return this. (NotNull)
     */
    public BsImpasseTestCasesCQ addOrderBy_Active_Asc() {
        regOBA("active");
        return this;
    }

    /**
     * Add order-by as descend. <br />
     * active: {BIT, default=[1]}
     * @return this. (NotNull)
     */
    public BsImpasseTestCasesCQ addOrderBy_Active_Desc() {
        regOBD("active");
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
    public BsImpasseTestCasesCQ addSpecifiedDerivedOrderBy_Asc(
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
    public BsImpasseTestCasesCQ addSpecifiedDerivedOrderBy_Desc(
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
    protected Map<String, ImpasseTestCasesCQ> _scalarConditionMap;

    public Map<String, ImpasseTestCasesCQ> getScalarCondition() {
        return _scalarConditionMap;
    }

    @Override
    public String keepScalarCondition(final ImpasseTestCasesCQ subQuery) {
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
    protected Map<String, ImpasseTestCasesCQ> _specifyMyselfDerivedMap;

    public Map<String, ImpasseTestCasesCQ> getSpecifyMyselfDerived() {
        return _specifyMyselfDerivedMap;
    }

    @Override
    public String keepSpecifyMyselfDerived(final ImpasseTestCasesCQ subQuery) {
        if (_specifyMyselfDerivedMap == null) {
            _specifyMyselfDerivedMap = newLinkedHashMap();
        }
        final String key = "subQueryMapKey"
                + (_specifyMyselfDerivedMap.size() + 1);
        _specifyMyselfDerivedMap.put(key, subQuery);
        return "specifyMyselfDerived." + key;
    }

    protected Map<String, ImpasseTestCasesCQ> _queryMyselfDerivedMap;

    public Map<String, ImpasseTestCasesCQ> getQueryMyselfDerived() {
        return _queryMyselfDerivedMap;
    }

    @Override
    public String keepQueryMyselfDerived(final ImpasseTestCasesCQ subQuery) {
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
    protected Map<String, ImpasseTestCasesCQ> _myselfExistsMap;

    public Map<String, ImpasseTestCasesCQ> getMyselfExists() {
        return _myselfExistsMap;
    }

    @Override
    public String keepMyselfExists(final ImpasseTestCasesCQ subQuery) {
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
    protected Map<String, ImpasseTestCasesCQ> _myselfInScopeMap;

    public Map<String, ImpasseTestCasesCQ> getMyselfInScope() {
        return _myselfInScopeMap;
    }

    @Override
    public String keepMyselfInScope(final ImpasseTestCasesCQ subQuery) {
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
    // very internal (for suppressing warn about 'Not Use TestLinkImport')
    protected String xCB() {
        return ImpasseTestCasesCB.class.getName();
    }

    protected String xCQ() {
        return ImpasseTestCasesCQ.class.getName();
    }

    protected String xMap() {
        return Map.class.getName();
    }
}
