package net.marevol.redmine.impasse.db.cbean.cq.bs;

import java.util.Map;

import net.marevol.redmine.impasse.db.cbean.ImpasseNodeKeywordsCB;
import net.marevol.redmine.impasse.db.cbean.cq.ImpasseNodeKeywordsCQ;
import net.marevol.redmine.impasse.db.cbean.cq.ciq.ImpasseNodeKeywordsCIQ;

import org.seasar.dbflute.cbean.ConditionQuery;
import org.seasar.dbflute.cbean.cvalue.ConditionValue;
import org.seasar.dbflute.cbean.sqlclause.SqlClause;
import org.seasar.dbflute.exception.IllegalConditionBeanOperationException;

/**
 * The base condition-query of impasse_node_keywords.
 * @author DBFlute(AutoGenerator)
 */
public class BsImpasseNodeKeywordsCQ extends AbstractBsImpasseNodeKeywordsCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected ImpasseNodeKeywordsCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsImpasseNodeKeywordsCQ(final ConditionQuery childQuery,
            final SqlClause sqlClause, final String aliasName,
            final int nestLevel) {
        super(childQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br />
     * {select ... from ... left outer join (select * from impasse_node_keywords) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #FD4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public ImpasseNodeKeywordsCIQ inline() {
        if (_inlineQuery == null) {
            _inlineQuery = xcreateCIQ();
        }
        _inlineQuery.xsetOnClause(false);
        return _inlineQuery;
    }

    protected ImpasseNodeKeywordsCIQ xcreateCIQ() {
        final ImpasseNodeKeywordsCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected ImpasseNodeKeywordsCIQ xnewCIQ() {
        return new ImpasseNodeKeywordsCIQ(xgetReferrerQuery(), xgetSqlClause(),
                xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br />
     * {select ... from ... left outer join impasse_node_keywords on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #FD4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public ImpasseNodeKeywordsCIQ on() {
        if (isBaseQuery()) {
            throw new IllegalConditionBeanOperationException(
                    "OnClause for local table is unavailable!");
        }
        final ImpasseNodeKeywordsCIQ inlineQuery = inline();
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
    public BsImpasseNodeKeywordsCQ addOrderBy_Id_Asc() {
        regOBA("id");
        return this;
    }

    /**
     * Add order-by as descend. <br />
     * id: {PK, ID, NotNull, INT(10)}
     * @return this. (NotNull)
     */
    public BsImpasseNodeKeywordsCQ addOrderBy_Id_Desc() {
        regOBD("id");
        return this;
    }

    protected ConditionValue _nodeId;

    public ConditionValue getNodeId() {
        if (_nodeId == null) {
            _nodeId = nCV();
        }
        return _nodeId;
    }

    @Override
    protected ConditionValue getCValueNodeId() {
        return getNodeId();
    }

    /** 
     * Add order-by as ascend. <br />
     * node_id: {IX, NotNull, INT(10)}
     * @return this. (NotNull)
     */
    public BsImpasseNodeKeywordsCQ addOrderBy_NodeId_Asc() {
        regOBA("node_id");
        return this;
    }

    /**
     * Add order-by as descend. <br />
     * node_id: {IX, NotNull, INT(10)}
     * @return this. (NotNull)
     */
    public BsImpasseNodeKeywordsCQ addOrderBy_NodeId_Desc() {
        regOBD("node_id");
        return this;
    }

    protected ConditionValue _keywordId;

    public ConditionValue getKeywordId() {
        if (_keywordId == null) {
            _keywordId = nCV();
        }
        return _keywordId;
    }

    @Override
    protected ConditionValue getCValueKeywordId() {
        return getKeywordId();
    }

    /** 
     * Add order-by as ascend. <br />
     * keyword_id: {IX+, NotNull, INT(10)}
     * @return this. (NotNull)
     */
    public BsImpasseNodeKeywordsCQ addOrderBy_KeywordId_Asc() {
        regOBA("keyword_id");
        return this;
    }

    /**
     * Add order-by as descend. <br />
     * keyword_id: {IX+, NotNull, INT(10)}
     * @return this. (NotNull)
     */
    public BsImpasseNodeKeywordsCQ addOrderBy_KeywordId_Desc() {
        regOBD("keyword_id");
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
    public BsImpasseNodeKeywordsCQ addSpecifiedDerivedOrderBy_Asc(
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
    public BsImpasseNodeKeywordsCQ addSpecifiedDerivedOrderBy_Desc(
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
    protected Map<String, ImpasseNodeKeywordsCQ> _scalarConditionMap;

    public Map<String, ImpasseNodeKeywordsCQ> getScalarCondition() {
        return _scalarConditionMap;
    }

    @Override
    public String keepScalarCondition(final ImpasseNodeKeywordsCQ subQuery) {
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
    protected Map<String, ImpasseNodeKeywordsCQ> _specifyMyselfDerivedMap;

    public Map<String, ImpasseNodeKeywordsCQ> getSpecifyMyselfDerived() {
        return _specifyMyselfDerivedMap;
    }

    @Override
    public String keepSpecifyMyselfDerived(final ImpasseNodeKeywordsCQ subQuery) {
        if (_specifyMyselfDerivedMap == null) {
            _specifyMyselfDerivedMap = newLinkedHashMap();
        }
        final String key = "subQueryMapKey"
                + (_specifyMyselfDerivedMap.size() + 1);
        _specifyMyselfDerivedMap.put(key, subQuery);
        return "specifyMyselfDerived." + key;
    }

    protected Map<String, ImpasseNodeKeywordsCQ> _queryMyselfDerivedMap;

    public Map<String, ImpasseNodeKeywordsCQ> getQueryMyselfDerived() {
        return _queryMyselfDerivedMap;
    }

    @Override
    public String keepQueryMyselfDerived(final ImpasseNodeKeywordsCQ subQuery) {
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
    protected Map<String, ImpasseNodeKeywordsCQ> _myselfExistsMap;

    public Map<String, ImpasseNodeKeywordsCQ> getMyselfExists() {
        return _myselfExistsMap;
    }

    @Override
    public String keepMyselfExists(final ImpasseNodeKeywordsCQ subQuery) {
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
    protected Map<String, ImpasseNodeKeywordsCQ> _myselfInScopeMap;

    public Map<String, ImpasseNodeKeywordsCQ> getMyselfInScope() {
        return _myselfInScopeMap;
    }

    @Override
    public String keepMyselfInScope(final ImpasseNodeKeywordsCQ subQuery) {
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
        return ImpasseNodeKeywordsCB.class.getName();
    }

    protected String xCQ() {
        return ImpasseNodeKeywordsCQ.class.getName();
    }

    protected String xMap() {
        return Map.class.getName();
    }
}
