package net.marevol.redmine.impasse.db.cbean.cq.bs;

import java.util.Map;

import net.marevol.redmine.impasse.db.cbean.ImpasseTestStepsCB;
import net.marevol.redmine.impasse.db.cbean.cq.ImpasseTestStepsCQ;
import net.marevol.redmine.impasse.db.cbean.cq.ciq.ImpasseTestStepsCIQ;

import org.seasar.dbflute.cbean.ConditionQuery;
import org.seasar.dbflute.cbean.cvalue.ConditionValue;
import org.seasar.dbflute.cbean.sqlclause.SqlClause;
import org.seasar.dbflute.exception.IllegalConditionBeanOperationException;

/**
 * The base condition-query of impasse_test_steps.
 * @author DBFlute(AutoGenerator)
 */
public class BsImpasseTestStepsCQ extends AbstractBsImpasseTestStepsCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected ImpasseTestStepsCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsImpasseTestStepsCQ(final ConditionQuery childQuery,
            final SqlClause sqlClause, final String aliasName,
            final int nestLevel) {
        super(childQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br />
     * {select ... from ... left outer join (select * from impasse_test_steps) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #FD4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public ImpasseTestStepsCIQ inline() {
        if (_inlineQuery == null) {
            _inlineQuery = xcreateCIQ();
        }
        _inlineQuery.xsetOnClause(false);
        return _inlineQuery;
    }

    protected ImpasseTestStepsCIQ xcreateCIQ() {
        final ImpasseTestStepsCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected ImpasseTestStepsCIQ xnewCIQ() {
        return new ImpasseTestStepsCIQ(xgetReferrerQuery(), xgetSqlClause(),
                xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br />
     * {select ... from ... left outer join impasse_test_steps on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #FD4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public ImpasseTestStepsCIQ on() {
        if (isBaseQuery()) {
            throw new IllegalConditionBeanOperationException(
                    "OnClause for local table is unavailable!");
        }
        final ImpasseTestStepsCIQ inlineQuery = inline();
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
    public BsImpasseTestStepsCQ addOrderBy_Id_Asc() {
        regOBA("id");
        return this;
    }

    /**
     * Add order-by as descend. <br />
     * id: {PK, ID, NotNull, INT(10)}
     * @return this. (NotNull)
     */
    public BsImpasseTestStepsCQ addOrderBy_Id_Desc() {
        regOBD("id");
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
     * test_case_id: {IX, NotNull, INT(10)}
     * @return this. (NotNull)
     */
    public BsImpasseTestStepsCQ addOrderBy_TestCaseId_Asc() {
        regOBA("test_case_id");
        return this;
    }

    /**
     * Add order-by as descend. <br />
     * test_case_id: {IX, NotNull, INT(10)}
     * @return this. (NotNull)
     */
    public BsImpasseTestStepsCQ addOrderBy_TestCaseId_Desc() {
        regOBD("test_case_id");
        return this;
    }

    protected ConditionValue _stepNumber;

    public ConditionValue getStepNumber() {
        if (_stepNumber == null) {
            _stepNumber = nCV();
        }
        return _stepNumber;
    }

    @Override
    protected ConditionValue getCValueStepNumber() {
        return getStepNumber();
    }

    /** 
     * Add order-by as ascend. <br />
     * step_number: {INT(10)}
     * @return this. (NotNull)
     */
    public BsImpasseTestStepsCQ addOrderBy_StepNumber_Asc() {
        regOBA("step_number");
        return this;
    }

    /**
     * Add order-by as descend. <br />
     * step_number: {INT(10)}
     * @return this. (NotNull)
     */
    public BsImpasseTestStepsCQ addOrderBy_StepNumber_Desc() {
        regOBD("step_number");
        return this;
    }

    protected ConditionValue _actions;

    public ConditionValue getActions() {
        if (_actions == null) {
            _actions = nCV();
        }
        return _actions;
    }

    @Override
    protected ConditionValue getCValueActions() {
        return getActions();
    }

    /** 
     * Add order-by as ascend. <br />
     * actions: {TEXT(65535)}
     * @return this. (NotNull)
     */
    public BsImpasseTestStepsCQ addOrderBy_Actions_Asc() {
        regOBA("actions");
        return this;
    }

    /**
     * Add order-by as descend. <br />
     * actions: {TEXT(65535)}
     * @return this. (NotNull)
     */
    public BsImpasseTestStepsCQ addOrderBy_Actions_Desc() {
        regOBD("actions");
        return this;
    }

    protected ConditionValue _expectedResults;

    public ConditionValue getExpectedResults() {
        if (_expectedResults == null) {
            _expectedResults = nCV();
        }
        return _expectedResults;
    }

    @Override
    protected ConditionValue getCValueExpectedResults() {
        return getExpectedResults();
    }

    /** 
     * Add order-by as ascend. <br />
     * expected_results: {TEXT(65535)}
     * @return this. (NotNull)
     */
    public BsImpasseTestStepsCQ addOrderBy_ExpectedResults_Asc() {
        regOBA("expected_results");
        return this;
    }

    /**
     * Add order-by as descend. <br />
     * expected_results: {TEXT(65535)}
     * @return this. (NotNull)
     */
    public BsImpasseTestStepsCQ addOrderBy_ExpectedResults_Desc() {
        regOBD("expected_results");
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
    public BsImpasseTestStepsCQ addSpecifiedDerivedOrderBy_Asc(
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
    public BsImpasseTestStepsCQ addSpecifiedDerivedOrderBy_Desc(
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
    protected Map<String, ImpasseTestStepsCQ> _scalarConditionMap;

    public Map<String, ImpasseTestStepsCQ> getScalarCondition() {
        return _scalarConditionMap;
    }

    @Override
    public String keepScalarCondition(final ImpasseTestStepsCQ subQuery) {
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
    protected Map<String, ImpasseTestStepsCQ> _specifyMyselfDerivedMap;

    public Map<String, ImpasseTestStepsCQ> getSpecifyMyselfDerived() {
        return _specifyMyselfDerivedMap;
    }

    @Override
    public String keepSpecifyMyselfDerived(final ImpasseTestStepsCQ subQuery) {
        if (_specifyMyselfDerivedMap == null) {
            _specifyMyselfDerivedMap = newLinkedHashMap();
        }
        final String key = "subQueryMapKey"
                + (_specifyMyselfDerivedMap.size() + 1);
        _specifyMyselfDerivedMap.put(key, subQuery);
        return "specifyMyselfDerived." + key;
    }

    protected Map<String, ImpasseTestStepsCQ> _queryMyselfDerivedMap;

    public Map<String, ImpasseTestStepsCQ> getQueryMyselfDerived() {
        return _queryMyselfDerivedMap;
    }

    @Override
    public String keepQueryMyselfDerived(final ImpasseTestStepsCQ subQuery) {
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
    protected Map<String, ImpasseTestStepsCQ> _myselfExistsMap;

    public Map<String, ImpasseTestStepsCQ> getMyselfExists() {
        return _myselfExistsMap;
    }

    @Override
    public String keepMyselfExists(final ImpasseTestStepsCQ subQuery) {
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
    protected Map<String, ImpasseTestStepsCQ> _myselfInScopeMap;

    public Map<String, ImpasseTestStepsCQ> getMyselfInScope() {
        return _myselfInScopeMap;
    }

    @Override
    public String keepMyselfInScope(final ImpasseTestStepsCQ subQuery) {
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
        return ImpasseTestStepsCB.class.getName();
    }

    protected String xCQ() {
        return ImpasseTestStepsCQ.class.getName();
    }

    protected String xMap() {
        return Map.class.getName();
    }
}
