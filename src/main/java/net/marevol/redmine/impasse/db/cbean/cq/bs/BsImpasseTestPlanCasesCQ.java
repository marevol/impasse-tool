package net.marevol.redmine.impasse.db.cbean.cq.bs;

import java.util.Map;

import net.marevol.redmine.impasse.db.cbean.ImpasseTestPlanCasesCB;
import net.marevol.redmine.impasse.db.cbean.cq.ImpasseTestPlanCasesCQ;
import net.marevol.redmine.impasse.db.cbean.cq.ciq.ImpasseTestPlanCasesCIQ;

import org.seasar.dbflute.cbean.ConditionQuery;
import org.seasar.dbflute.cbean.cvalue.ConditionValue;
import org.seasar.dbflute.cbean.sqlclause.SqlClause;
import org.seasar.dbflute.exception.IllegalConditionBeanOperationException;

/**
 * The base condition-query of impasse_test_plan_cases.
 * @author DBFlute(AutoGenerator)
 */
public class BsImpasseTestPlanCasesCQ extends AbstractBsImpasseTestPlanCasesCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected ImpasseTestPlanCasesCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsImpasseTestPlanCasesCQ(final ConditionQuery childQuery,
            final SqlClause sqlClause, final String aliasName,
            final int nestLevel) {
        super(childQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br />
     * {select ... from ... left outer join (select * from impasse_test_plan_cases) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #FD4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public ImpasseTestPlanCasesCIQ inline() {
        if (_inlineQuery == null) {
            _inlineQuery = xcreateCIQ();
        }
        _inlineQuery.xsetOnClause(false);
        return _inlineQuery;
    }

    protected ImpasseTestPlanCasesCIQ xcreateCIQ() {
        final ImpasseTestPlanCasesCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected ImpasseTestPlanCasesCIQ xnewCIQ() {
        return new ImpasseTestPlanCasesCIQ(xgetReferrerQuery(),
                xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br />
     * {select ... from ... left outer join impasse_test_plan_cases on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #FD4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public ImpasseTestPlanCasesCIQ on() {
        if (isBaseQuery()) {
            throw new IllegalConditionBeanOperationException(
                    "OnClause for local table is unavailable!");
        }
        final ImpasseTestPlanCasesCIQ inlineQuery = inline();
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
    public BsImpasseTestPlanCasesCQ addOrderBy_Id_Asc() {
        regOBA("id");
        return this;
    }

    /**
     * Add order-by as descend. <br />
     * id: {PK, ID, NotNull, INT(10)}
     * @return this. (NotNull)
     */
    public BsImpasseTestPlanCasesCQ addOrderBy_Id_Desc() {
        regOBD("id");
        return this;
    }

    protected ConditionValue _testPlanId;

    public ConditionValue getTestPlanId() {
        if (_testPlanId == null) {
            _testPlanId = nCV();
        }
        return _testPlanId;
    }

    @Override
    protected ConditionValue getCValueTestPlanId() {
        return getTestPlanId();
    }

    /** 
     * Add order-by as ascend. <br />
     * test_plan_id: {IX, INT(10)}
     * @return this. (NotNull)
     */
    public BsImpasseTestPlanCasesCQ addOrderBy_TestPlanId_Asc() {
        regOBA("test_plan_id");
        return this;
    }

    /**
     * Add order-by as descend. <br />
     * test_plan_id: {IX, INT(10)}
     * @return this. (NotNull)
     */
    public BsImpasseTestPlanCasesCQ addOrderBy_TestPlanId_Desc() {
        regOBD("test_plan_id");
        return this;
    }

    protected ConditionValue _testCaseId;

    public ConditionValue getTestCaseId() {
        if (_testCaseId == null) {
            _testCaseId = nCV();
        }
        return _testCaseId;
    }

    @Override
    protected ConditionValue getCValueTestCaseId() {
        return getTestCaseId();
    }

    /** 
     * Add order-by as ascend. <br />
     * test_case_id: {IX+, INT(10)}
     * @return this. (NotNull)
     */
    public BsImpasseTestPlanCasesCQ addOrderBy_TestCaseId_Asc() {
        regOBA("test_case_id");
        return this;
    }

    /**
     * Add order-by as descend. <br />
     * test_case_id: {IX+, INT(10)}
     * @return this. (NotNull)
     */
    public BsImpasseTestPlanCasesCQ addOrderBy_TestCaseId_Desc() {
        regOBD("test_case_id");
        return this;
    }

    protected ConditionValue _nodeOrder;

    public ConditionValue getNodeOrder() {
        if (_nodeOrder == null) {
            _nodeOrder = nCV();
        }
        return _nodeOrder;
    }

    @Override
    protected ConditionValue getCValueNodeOrder() {
        return getNodeOrder();
    }

    /** 
     * Add order-by as ascend. <br />
     * node_order: {INT(10)}
     * @return this. (NotNull)
     */
    public BsImpasseTestPlanCasesCQ addOrderBy_NodeOrder_Asc() {
        regOBA("node_order");
        return this;
    }

    /**
     * Add order-by as descend. <br />
     * node_order: {INT(10)}
     * @return this. (NotNull)
     */
    public BsImpasseTestPlanCasesCQ addOrderBy_NodeOrder_Desc() {
        regOBD("node_order");
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
    public BsImpasseTestPlanCasesCQ addSpecifiedDerivedOrderBy_Asc(
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
    public BsImpasseTestPlanCasesCQ addSpecifiedDerivedOrderBy_Desc(
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
    protected Map<String, ImpasseTestPlanCasesCQ> _scalarConditionMap;

    public Map<String, ImpasseTestPlanCasesCQ> getScalarCondition() {
        return _scalarConditionMap;
    }

    @Override
    public String keepScalarCondition(final ImpasseTestPlanCasesCQ subQuery) {
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
    protected Map<String, ImpasseTestPlanCasesCQ> _specifyMyselfDerivedMap;

    public Map<String, ImpasseTestPlanCasesCQ> getSpecifyMyselfDerived() {
        return _specifyMyselfDerivedMap;
    }

    @Override
    public String keepSpecifyMyselfDerived(final ImpasseTestPlanCasesCQ subQuery) {
        if (_specifyMyselfDerivedMap == null) {
            _specifyMyselfDerivedMap = newLinkedHashMap();
        }
        final String key = "subQueryMapKey"
                + (_specifyMyselfDerivedMap.size() + 1);
        _specifyMyselfDerivedMap.put(key, subQuery);
        return "specifyMyselfDerived." + key;
    }

    protected Map<String, ImpasseTestPlanCasesCQ> _queryMyselfDerivedMap;

    public Map<String, ImpasseTestPlanCasesCQ> getQueryMyselfDerived() {
        return _queryMyselfDerivedMap;
    }

    @Override
    public String keepQueryMyselfDerived(final ImpasseTestPlanCasesCQ subQuery) {
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
    protected Map<String, ImpasseTestPlanCasesCQ> _myselfExistsMap;

    public Map<String, ImpasseTestPlanCasesCQ> getMyselfExists() {
        return _myselfExistsMap;
    }

    @Override
    public String keepMyselfExists(final ImpasseTestPlanCasesCQ subQuery) {
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
    protected Map<String, ImpasseTestPlanCasesCQ> _myselfInScopeMap;

    public Map<String, ImpasseTestPlanCasesCQ> getMyselfInScope() {
        return _myselfInScopeMap;
    }

    @Override
    public String keepMyselfInScope(final ImpasseTestPlanCasesCQ subQuery) {
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
        return ImpasseTestPlanCasesCB.class.getName();
    }

    protected String xCQ() {
        return ImpasseTestPlanCasesCQ.class.getName();
    }

    protected String xMap() {
        return Map.class.getName();
    }
}
