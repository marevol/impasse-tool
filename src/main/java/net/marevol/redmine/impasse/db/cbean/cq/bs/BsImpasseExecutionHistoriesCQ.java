package net.marevol.redmine.impasse.db.cbean.cq.bs;

import java.util.Map;

import net.marevol.redmine.impasse.db.cbean.ImpasseExecutionHistoriesCB;
import net.marevol.redmine.impasse.db.cbean.cq.ImpasseExecutionHistoriesCQ;
import net.marevol.redmine.impasse.db.cbean.cq.ciq.ImpasseExecutionHistoriesCIQ;

import org.seasar.dbflute.cbean.ConditionQuery;
import org.seasar.dbflute.cbean.cvalue.ConditionValue;
import org.seasar.dbflute.cbean.sqlclause.SqlClause;
import org.seasar.dbflute.exception.IllegalConditionBeanOperationException;

/**
 * The base condition-query of impasse_execution_histories.
 * @author DBFlute(AutoGenerator)
 */
public class BsImpasseExecutionHistoriesCQ extends
        AbstractBsImpasseExecutionHistoriesCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected ImpasseExecutionHistoriesCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsImpasseExecutionHistoriesCQ(final ConditionQuery childQuery,
            final SqlClause sqlClause, final String aliasName,
            final int nestLevel) {
        super(childQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br />
     * {select ... from ... left outer join (select * from impasse_execution_histories) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #FD4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public ImpasseExecutionHistoriesCIQ inline() {
        if (_inlineQuery == null) {
            _inlineQuery = xcreateCIQ();
        }
        _inlineQuery.xsetOnClause(false);
        return _inlineQuery;
    }

    protected ImpasseExecutionHistoriesCIQ xcreateCIQ() {
        final ImpasseExecutionHistoriesCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected ImpasseExecutionHistoriesCIQ xnewCIQ() {
        return new ImpasseExecutionHistoriesCIQ(xgetReferrerQuery(),
                xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br />
     * {select ... from ... left outer join impasse_execution_histories on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #FD4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public ImpasseExecutionHistoriesCIQ on() {
        if (isBaseQuery()) {
            throw new IllegalConditionBeanOperationException(
                    "OnClause for local table is unavailable!");
        }
        final ImpasseExecutionHistoriesCIQ inlineQuery = inline();
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
    public BsImpasseExecutionHistoriesCQ addOrderBy_Id_Asc() {
        regOBA("id");
        return this;
    }

    /**
     * Add order-by as descend. <br />
     * id: {PK, ID, NotNull, INT(10)}
     * @return this. (NotNull)
     */
    public BsImpasseExecutionHistoriesCQ addOrderBy_Id_Desc() {
        regOBD("id");
        return this;
    }

    protected ConditionValue _testPlanCaseId;

    public ConditionValue getTestPlanCaseId() {
        if (_testPlanCaseId == null) {
            _testPlanCaseId = nCV();
        }
        return _testPlanCaseId;
    }

    @Override
    protected ConditionValue getCValueTestPlanCaseId() {
        return getTestPlanCaseId();
    }

    /** 
     * Add order-by as ascend. <br />
     * test_plan_case_id: {IX, NotNull, INT(10)}
     * @return this. (NotNull)
     */
    public BsImpasseExecutionHistoriesCQ addOrderBy_TestPlanCaseId_Asc() {
        regOBA("test_plan_case_id");
        return this;
    }

    /**
     * Add order-by as descend. <br />
     * test_plan_case_id: {IX, NotNull, INT(10)}
     * @return this. (NotNull)
     */
    public BsImpasseExecutionHistoriesCQ addOrderBy_TestPlanCaseId_Desc() {
        regOBD("test_plan_case_id");
        return this;
    }

    protected ConditionValue _testerId;

    public ConditionValue getTesterId() {
        if (_testerId == null) {
            _testerId = nCV();
        }
        return _testerId;
    }

    @Override
    protected ConditionValue getCValueTesterId() {
        return getTesterId();
    }

    /** 
     * Add order-by as ascend. <br />
     * tester_id: {INT(10)}
     * @return this. (NotNull)
     */
    public BsImpasseExecutionHistoriesCQ addOrderBy_TesterId_Asc() {
        regOBA("tester_id");
        return this;
    }

    /**
     * Add order-by as descend. <br />
     * tester_id: {INT(10)}
     * @return this. (NotNull)
     */
    public BsImpasseExecutionHistoriesCQ addOrderBy_TesterId_Desc() {
        regOBD("tester_id");
        return this;
    }

    protected ConditionValue _buildId;

    public ConditionValue getBuildId() {
        if (_buildId == null) {
            _buildId = nCV();
        }
        return _buildId;
    }

    @Override
    protected ConditionValue getCValueBuildId() {
        return getBuildId();
    }

    /** 
     * Add order-by as ascend. <br />
     * build_id: {INT(10)}
     * @return this. (NotNull)
     */
    public BsImpasseExecutionHistoriesCQ addOrderBy_BuildId_Asc() {
        regOBA("build_id");
        return this;
    }

    /**
     * Add order-by as descend. <br />
     * build_id: {INT(10)}
     * @return this. (NotNull)
     */
    public BsImpasseExecutionHistoriesCQ addOrderBy_BuildId_Desc() {
        regOBD("build_id");
        return this;
    }

    protected ConditionValue _expectedDate;

    public ConditionValue getExpectedDate() {
        if (_expectedDate == null) {
            _expectedDate = nCV();
        }
        return _expectedDate;
    }

    @Override
    protected ConditionValue getCValueExpectedDate() {
        return getExpectedDate();
    }

    /** 
     * Add order-by as ascend. <br />
     * expected_date: {DATE(10)}
     * @return this. (NotNull)
     */
    public BsImpasseExecutionHistoriesCQ addOrderBy_ExpectedDate_Asc() {
        regOBA("expected_date");
        return this;
    }

    /**
     * Add order-by as descend. <br />
     * expected_date: {DATE(10)}
     * @return this. (NotNull)
     */
    public BsImpasseExecutionHistoriesCQ addOrderBy_ExpectedDate_Desc() {
        regOBD("expected_date");
        return this;
    }

    protected ConditionValue _status;

    public ConditionValue getStatus() {
        if (_status == null) {
            _status = nCV();
        }
        return _status;
    }

    @Override
    protected ConditionValue getCValueStatus() {
        return getStatus();
    }

    /** 
     * Add order-by as ascend. <br />
     * status: {NotNull, VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsImpasseExecutionHistoriesCQ addOrderBy_Status_Asc() {
        regOBA("status");
        return this;
    }

    /**
     * Add order-by as descend. <br />
     * status: {NotNull, VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsImpasseExecutionHistoriesCQ addOrderBy_Status_Desc() {
        regOBD("status");
        return this;
    }

    protected ConditionValue _executionTs;

    public ConditionValue getExecutionTs() {
        if (_executionTs == null) {
            _executionTs = nCV();
        }
        return _executionTs;
    }

    @Override
    protected ConditionValue getCValueExecutionTs() {
        return getExecutionTs();
    }

    /** 
     * Add order-by as ascend. <br />
     * execution_ts: {NotNull, DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsImpasseExecutionHistoriesCQ addOrderBy_ExecutionTs_Asc() {
        regOBA("execution_ts");
        return this;
    }

    /**
     * Add order-by as descend. <br />
     * execution_ts: {NotNull, DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsImpasseExecutionHistoriesCQ addOrderBy_ExecutionTs_Desc() {
        regOBD("execution_ts");
        return this;
    }

    protected ConditionValue _executorId;

    public ConditionValue getExecutorId() {
        if (_executorId == null) {
            _executorId = nCV();
        }
        return _executorId;
    }

    @Override
    protected ConditionValue getCValueExecutorId() {
        return getExecutorId();
    }

    /** 
     * Add order-by as ascend. <br />
     * executor_id: {NotNull, INT(10)}
     * @return this. (NotNull)
     */
    public BsImpasseExecutionHistoriesCQ addOrderBy_ExecutorId_Asc() {
        regOBA("executor_id");
        return this;
    }

    /**
     * Add order-by as descend. <br />
     * executor_id: {NotNull, INT(10)}
     * @return this. (NotNull)
     */
    public BsImpasseExecutionHistoriesCQ addOrderBy_ExecutorId_Desc() {
        regOBD("executor_id");
        return this;
    }

    protected ConditionValue _notes;

    public ConditionValue getNotes() {
        if (_notes == null) {
            _notes = nCV();
        }
        return _notes;
    }

    @Override
    protected ConditionValue getCValueNotes() {
        return getNotes();
    }

    /** 
     * Add order-by as ascend. <br />
     * notes: {TEXT(65535)}
     * @return this. (NotNull)
     */
    public BsImpasseExecutionHistoriesCQ addOrderBy_Notes_Asc() {
        regOBA("notes");
        return this;
    }

    /**
     * Add order-by as descend. <br />
     * notes: {TEXT(65535)}
     * @return this. (NotNull)
     */
    public BsImpasseExecutionHistoriesCQ addOrderBy_Notes_Desc() {
        regOBD("notes");
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
    public BsImpasseExecutionHistoriesCQ addSpecifiedDerivedOrderBy_Asc(
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
    public BsImpasseExecutionHistoriesCQ addSpecifiedDerivedOrderBy_Desc(
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
    protected Map<String, ImpasseExecutionHistoriesCQ> _scalarConditionMap;

    public Map<String, ImpasseExecutionHistoriesCQ> getScalarCondition() {
        return _scalarConditionMap;
    }

    @Override
    public String keepScalarCondition(final ImpasseExecutionHistoriesCQ subQuery) {
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
    protected Map<String, ImpasseExecutionHistoriesCQ> _specifyMyselfDerivedMap;

    public Map<String, ImpasseExecutionHistoriesCQ> getSpecifyMyselfDerived() {
        return _specifyMyselfDerivedMap;
    }

    @Override
    public String keepSpecifyMyselfDerived(
            final ImpasseExecutionHistoriesCQ subQuery) {
        if (_specifyMyselfDerivedMap == null) {
            _specifyMyselfDerivedMap = newLinkedHashMap();
        }
        final String key = "subQueryMapKey"
                + (_specifyMyselfDerivedMap.size() + 1);
        _specifyMyselfDerivedMap.put(key, subQuery);
        return "specifyMyselfDerived." + key;
    }

    protected Map<String, ImpasseExecutionHistoriesCQ> _queryMyselfDerivedMap;

    public Map<String, ImpasseExecutionHistoriesCQ> getQueryMyselfDerived() {
        return _queryMyselfDerivedMap;
    }

    @Override
    public String keepQueryMyselfDerived(
            final ImpasseExecutionHistoriesCQ subQuery) {
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
    protected Map<String, ImpasseExecutionHistoriesCQ> _myselfExistsMap;

    public Map<String, ImpasseExecutionHistoriesCQ> getMyselfExists() {
        return _myselfExistsMap;
    }

    @Override
    public String keepMyselfExists(final ImpasseExecutionHistoriesCQ subQuery) {
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
    protected Map<String, ImpasseExecutionHistoriesCQ> _myselfInScopeMap;

    public Map<String, ImpasseExecutionHistoriesCQ> getMyselfInScope() {
        return _myselfInScopeMap;
    }

    @Override
    public String keepMyselfInScope(final ImpasseExecutionHistoriesCQ subQuery) {
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
        return ImpasseExecutionHistoriesCB.class.getName();
    }

    protected String xCQ() {
        return ImpasseExecutionHistoriesCQ.class.getName();
    }

    protected String xMap() {
        return Map.class.getName();
    }
}
