package net.marevol.redmine.impasse.db.cbean.cq.bs;

import java.util.Map;

import net.marevol.redmine.impasse.db.cbean.ImpasseNodesCB;
import net.marevol.redmine.impasse.db.cbean.cq.ImpasseNodesCQ;
import net.marevol.redmine.impasse.db.cbean.cq.ciq.ImpasseNodesCIQ;

import org.seasar.dbflute.cbean.ConditionQuery;
import org.seasar.dbflute.cbean.cvalue.ConditionValue;
import org.seasar.dbflute.cbean.sqlclause.SqlClause;
import org.seasar.dbflute.exception.IllegalConditionBeanOperationException;

/**
 * The base condition-query of impasse_nodes.
 * @author DBFlute(AutoGenerator)
 */
public class BsImpasseNodesCQ extends AbstractBsImpasseNodesCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected ImpasseNodesCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsImpasseNodesCQ(final ConditionQuery childQuery,
            final SqlClause sqlClause, final String aliasName,
            final int nestLevel) {
        super(childQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br />
     * {select ... from ... left outer join (select * from impasse_nodes) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #FD4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public ImpasseNodesCIQ inline() {
        if (_inlineQuery == null) {
            _inlineQuery = xcreateCIQ();
        }
        _inlineQuery.xsetOnClause(false);
        return _inlineQuery;
    }

    protected ImpasseNodesCIQ xcreateCIQ() {
        final ImpasseNodesCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected ImpasseNodesCIQ xnewCIQ() {
        return new ImpasseNodesCIQ(xgetReferrerQuery(), xgetSqlClause(),
                xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br />
     * {select ... from ... left outer join impasse_nodes on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #FD4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public ImpasseNodesCIQ on() {
        if (isBaseQuery()) {
            throw new IllegalConditionBeanOperationException(
                    "OnClause for local table is unavailable!");
        }
        final ImpasseNodesCIQ inlineQuery = inline();
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
    public BsImpasseNodesCQ addOrderBy_Id_Asc() {
        regOBA("id");
        return this;
    }

    /**
     * Add order-by as descend. <br />
     * id: {PK, ID, NotNull, INT(10)}
     * @return this. (NotNull)
     */
    public BsImpasseNodesCQ addOrderBy_Id_Desc() {
        regOBD("id");
        return this;
    }

    protected ConditionValue _name;

    public ConditionValue getName() {
        if (_name == null) {
            _name = nCV();
        }
        return _name;
    }

    @Override
    protected ConditionValue getCValueName() {
        return getName();
    }

    /** 
     * Add order-by as ascend. <br />
     * name: {VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsImpasseNodesCQ addOrderBy_Name_Asc() {
        regOBA("name");
        return this;
    }

    /**
     * Add order-by as descend. <br />
     * name: {VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsImpasseNodesCQ addOrderBy_Name_Desc() {
        regOBD("name");
        return this;
    }

    protected ConditionValue _nodeTypeId;

    public ConditionValue getNodeTypeId() {
        if (_nodeTypeId == null) {
            _nodeTypeId = nCV();
        }
        return _nodeTypeId;
    }

    @Override
    protected ConditionValue getCValueNodeTypeId() {
        return getNodeTypeId();
    }

    /** 
     * Add order-by as ascend. <br />
     * node_type_id: {NotNull, INT(10)}
     * @return this. (NotNull)
     */
    public BsImpasseNodesCQ addOrderBy_NodeTypeId_Asc() {
        regOBA("node_type_id");
        return this;
    }

    /**
     * Add order-by as descend. <br />
     * node_type_id: {NotNull, INT(10)}
     * @return this. (NotNull)
     */
    public BsImpasseNodesCQ addOrderBy_NodeTypeId_Desc() {
        regOBD("node_type_id");
        return this;
    }

    protected ConditionValue _parentId;

    public ConditionValue getParentId() {
        if (_parentId == null) {
            _parentId = nCV();
        }
        return _parentId;
    }

    @Override
    protected ConditionValue getCValueParentId() {
        return getParentId();
    }

    /** 
     * Add order-by as ascend. <br />
     * parent_id: {IX, INT(10)}
     * @return this. (NotNull)
     */
    public BsImpasseNodesCQ addOrderBy_ParentId_Asc() {
        regOBA("parent_id");
        return this;
    }

    /**
     * Add order-by as descend. <br />
     * parent_id: {IX, INT(10)}
     * @return this. (NotNull)
     */
    public BsImpasseNodesCQ addOrderBy_ParentId_Desc() {
        regOBD("parent_id");
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
    public BsImpasseNodesCQ addOrderBy_NodeOrder_Asc() {
        regOBA("node_order");
        return this;
    }

    /**
     * Add order-by as descend. <br />
     * node_order: {INT(10)}
     * @return this. (NotNull)
     */
    public BsImpasseNodesCQ addOrderBy_NodeOrder_Desc() {
        regOBD("node_order");
        return this;
    }

    protected ConditionValue _path;

    public ConditionValue getPath() {
        if (_path == null) {
            _path = nCV();
        }
        return _path;
    }

    @Override
    protected ConditionValue getCValuePath() {
        return getPath();
    }

    /** 
     * Add order-by as ascend. <br />
     * path: {IX, NotNull, VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsImpasseNodesCQ addOrderBy_Path_Asc() {
        regOBA("path");
        return this;
    }

    /**
     * Add order-by as descend. <br />
     * path: {IX, NotNull, VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsImpasseNodesCQ addOrderBy_Path_Desc() {
        regOBD("path");
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
    public BsImpasseNodesCQ addSpecifiedDerivedOrderBy_Asc(
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
    public BsImpasseNodesCQ addSpecifiedDerivedOrderBy_Desc(
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
    protected Map<String, ImpasseNodesCQ> _scalarConditionMap;

    public Map<String, ImpasseNodesCQ> getScalarCondition() {
        return _scalarConditionMap;
    }

    @Override
    public String keepScalarCondition(final ImpasseNodesCQ subQuery) {
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
    protected Map<String, ImpasseNodesCQ> _specifyMyselfDerivedMap;

    public Map<String, ImpasseNodesCQ> getSpecifyMyselfDerived() {
        return _specifyMyselfDerivedMap;
    }

    @Override
    public String keepSpecifyMyselfDerived(final ImpasseNodesCQ subQuery) {
        if (_specifyMyselfDerivedMap == null) {
            _specifyMyselfDerivedMap = newLinkedHashMap();
        }
        final String key = "subQueryMapKey"
                + (_specifyMyselfDerivedMap.size() + 1);
        _specifyMyselfDerivedMap.put(key, subQuery);
        return "specifyMyselfDerived." + key;
    }

    protected Map<String, ImpasseNodesCQ> _queryMyselfDerivedMap;

    public Map<String, ImpasseNodesCQ> getQueryMyselfDerived() {
        return _queryMyselfDerivedMap;
    }

    @Override
    public String keepQueryMyselfDerived(final ImpasseNodesCQ subQuery) {
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
    protected Map<String, ImpasseNodesCQ> _myselfExistsMap;

    public Map<String, ImpasseNodesCQ> getMyselfExists() {
        return _myselfExistsMap;
    }

    @Override
    public String keepMyselfExists(final ImpasseNodesCQ subQuery) {
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
    protected Map<String, ImpasseNodesCQ> _myselfInScopeMap;

    public Map<String, ImpasseNodesCQ> getMyselfInScope() {
        return _myselfInScopeMap;
    }

    @Override
    public String keepMyselfInScope(final ImpasseNodesCQ subQuery) {
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
        return ImpasseNodesCB.class.getName();
    }

    protected String xCQ() {
        return ImpasseNodesCQ.class.getName();
    }

    protected String xMap() {
        return Map.class.getName();
    }
}
