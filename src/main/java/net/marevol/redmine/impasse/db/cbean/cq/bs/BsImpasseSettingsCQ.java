package net.marevol.redmine.impasse.db.cbean.cq.bs;

import java.util.Map;

import net.marevol.redmine.impasse.db.cbean.ImpasseSettingsCB;
import net.marevol.redmine.impasse.db.cbean.cq.ImpasseSettingsCQ;
import net.marevol.redmine.impasse.db.cbean.cq.ciq.ImpasseSettingsCIQ;

import org.seasar.dbflute.cbean.ConditionQuery;
import org.seasar.dbflute.cbean.cvalue.ConditionValue;
import org.seasar.dbflute.cbean.sqlclause.SqlClause;
import org.seasar.dbflute.exception.IllegalConditionBeanOperationException;

/**
 * The base condition-query of impasse_settings.
 * @author DBFlute(AutoGenerator)
 */
public class BsImpasseSettingsCQ extends AbstractBsImpasseSettingsCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected ImpasseSettingsCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsImpasseSettingsCQ(final ConditionQuery childQuery,
            final SqlClause sqlClause, final String aliasName,
            final int nestLevel) {
        super(childQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br />
     * {select ... from ... left outer join (select * from impasse_settings) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #FD4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public ImpasseSettingsCIQ inline() {
        if (_inlineQuery == null) {
            _inlineQuery = xcreateCIQ();
        }
        _inlineQuery.xsetOnClause(false);
        return _inlineQuery;
    }

    protected ImpasseSettingsCIQ xcreateCIQ() {
        final ImpasseSettingsCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected ImpasseSettingsCIQ xnewCIQ() {
        return new ImpasseSettingsCIQ(xgetReferrerQuery(), xgetSqlClause(),
                xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br />
     * {select ... from ... left outer join impasse_settings on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #FD4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public ImpasseSettingsCIQ on() {
        if (isBaseQuery()) {
            throw new IllegalConditionBeanOperationException(
                    "OnClause for local table is unavailable!");
        }
        final ImpasseSettingsCIQ inlineQuery = inline();
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
    public BsImpasseSettingsCQ addOrderBy_Id_Asc() {
        regOBA("id");
        return this;
    }

    /**
     * Add order-by as descend. <br />
     * id: {PK, ID, NotNull, INT(10)}
     * @return this. (NotNull)
     */
    public BsImpasseSettingsCQ addOrderBy_Id_Desc() {
        regOBD("id");
        return this;
    }

    protected ConditionValue _projectId;

    public ConditionValue getProjectId() {
        if (_projectId == null) {
            _projectId = nCV();
        }
        return _projectId;
    }

    @Override
    protected ConditionValue getCValueProjectId() {
        return getProjectId();
    }

    /** 
     * Add order-by as ascend. <br />
     * project_id: {IX, NotNull, INT(10)}
     * @return this. (NotNull)
     */
    public BsImpasseSettingsCQ addOrderBy_ProjectId_Asc() {
        regOBA("project_id");
        return this;
    }

    /**
     * Add order-by as descend. <br />
     * project_id: {IX, NotNull, INT(10)}
     * @return this. (NotNull)
     */
    public BsImpasseSettingsCQ addOrderBy_ProjectId_Desc() {
        regOBD("project_id");
        return this;
    }

    protected ConditionValue _bugTrackerId;

    public ConditionValue getBugTrackerId() {
        if (_bugTrackerId == null) {
            _bugTrackerId = nCV();
        }
        return _bugTrackerId;
    }

    @Override
    protected ConditionValue getCValueBugTrackerId() {
        return getBugTrackerId();
    }

    /** 
     * Add order-by as ascend. <br />
     * bug_tracker_id: {INT(10)}
     * @return this. (NotNull)
     */
    public BsImpasseSettingsCQ addOrderBy_BugTrackerId_Asc() {
        regOBA("bug_tracker_id");
        return this;
    }

    /**
     * Add order-by as descend. <br />
     * bug_tracker_id: {INT(10)}
     * @return this. (NotNull)
     */
    public BsImpasseSettingsCQ addOrderBy_BugTrackerId_Desc() {
        regOBD("bug_tracker_id");
        return this;
    }

    protected ConditionValue _requirementTracker;

    public ConditionValue getRequirementTracker() {
        if (_requirementTracker == null) {
            _requirementTracker = nCV();
        }
        return _requirementTracker;
    }

    @Override
    protected ConditionValue getCValueRequirementTracker() {
        return getRequirementTracker();
    }

    /** 
     * Add order-by as ascend. <br />
     * requirement_tracker: {VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsImpasseSettingsCQ addOrderBy_RequirementTracker_Asc() {
        regOBA("requirement_tracker");
        return this;
    }

    /**
     * Add order-by as descend. <br />
     * requirement_tracker: {VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsImpasseSettingsCQ addOrderBy_RequirementTracker_Desc() {
        regOBD("requirement_tracker");
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
    public BsImpasseSettingsCQ addSpecifiedDerivedOrderBy_Asc(
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
    public BsImpasseSettingsCQ addSpecifiedDerivedOrderBy_Desc(
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
    protected Map<String, ImpasseSettingsCQ> _scalarConditionMap;

    public Map<String, ImpasseSettingsCQ> getScalarCondition() {
        return _scalarConditionMap;
    }

    @Override
    public String keepScalarCondition(final ImpasseSettingsCQ subQuery) {
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
    protected Map<String, ImpasseSettingsCQ> _specifyMyselfDerivedMap;

    public Map<String, ImpasseSettingsCQ> getSpecifyMyselfDerived() {
        return _specifyMyselfDerivedMap;
    }

    @Override
    public String keepSpecifyMyselfDerived(final ImpasseSettingsCQ subQuery) {
        if (_specifyMyselfDerivedMap == null) {
            _specifyMyselfDerivedMap = newLinkedHashMap();
        }
        final String key = "subQueryMapKey"
                + (_specifyMyselfDerivedMap.size() + 1);
        _specifyMyselfDerivedMap.put(key, subQuery);
        return "specifyMyselfDerived." + key;
    }

    protected Map<String, ImpasseSettingsCQ> _queryMyselfDerivedMap;

    public Map<String, ImpasseSettingsCQ> getQueryMyselfDerived() {
        return _queryMyselfDerivedMap;
    }

    @Override
    public String keepQueryMyselfDerived(final ImpasseSettingsCQ subQuery) {
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
    protected Map<String, ImpasseSettingsCQ> _myselfExistsMap;

    public Map<String, ImpasseSettingsCQ> getMyselfExists() {
        return _myselfExistsMap;
    }

    @Override
    public String keepMyselfExists(final ImpasseSettingsCQ subQuery) {
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
    protected Map<String, ImpasseSettingsCQ> _myselfInScopeMap;

    public Map<String, ImpasseSettingsCQ> getMyselfInScope() {
        return _myselfInScopeMap;
    }

    @Override
    public String keepMyselfInScope(final ImpasseSettingsCQ subQuery) {
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
        return ImpasseSettingsCB.class.getName();
    }

    protected String xCQ() {
        return ImpasseSettingsCQ.class.getName();
    }

    protected String xMap() {
        return Map.class.getName();
    }
}
