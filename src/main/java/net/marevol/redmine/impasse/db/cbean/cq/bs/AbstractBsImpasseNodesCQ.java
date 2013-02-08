package net.marevol.redmine.impasse.db.cbean.cq.bs;

import java.util.Collection;

import net.marevol.redmine.impasse.db.allcommon.DBMetaInstanceHandler;
import net.marevol.redmine.impasse.db.cbean.ImpasseNodesCB;
import net.marevol.redmine.impasse.db.cbean.cq.ImpasseNodesCQ;

import org.seasar.dbflute.cbean.AbstractConditionQuery;
import org.seasar.dbflute.cbean.ConditionQuery;
import org.seasar.dbflute.cbean.SubQuery;
import org.seasar.dbflute.cbean.chelper.HpQDRFunction;
import org.seasar.dbflute.cbean.chelper.HpQDRSetupper;
import org.seasar.dbflute.cbean.chelper.HpSSQFunction;
import org.seasar.dbflute.cbean.chelper.HpSSQOption;
import org.seasar.dbflute.cbean.chelper.HpSSQSetupper;
import org.seasar.dbflute.cbean.ckey.ConditionKey;
import org.seasar.dbflute.cbean.coption.DerivedReferrerOption;
import org.seasar.dbflute.cbean.coption.LikeSearchOption;
import org.seasar.dbflute.cbean.coption.RangeOfOption;
import org.seasar.dbflute.cbean.cvalue.ConditionValue;
import org.seasar.dbflute.cbean.sqlclause.SqlClause;
import org.seasar.dbflute.dbmeta.DBMetaProvider;

/**
 * The abstract condition-query of impasse_nodes.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsImpasseNodesCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsImpasseNodesCQ(final ConditionQuery childQuery,
            final SqlClause sqlClause, final String aliasName,
            final int nestLevel) {
        super(childQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                     DBMeta Provider
    //                                                                     ===============
    @Override
    protected DBMetaProvider xgetDBMetaProvider() {
        return DBMetaInstanceHandler.getProvider();
    }

    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    @Override
    public String getTableDbName() {
        return "impasse_nodes";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * id: {PK, ID, NotNull, INT(10)}
     * @param id The value of id as equal.
     */
    public void setId_Equal(final Integer id) {
        doSetId_Equal(id);
    }

    protected void doSetId_Equal(final Integer id) {
        regId(CK_EQ, id);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * id: {PK, ID, NotNull, INT(10)}
     * @param id The value of id as notEqual.
     */
    public void setId_NotEqual(final Integer id) {
        doSetId_NotEqual(id);
    }

    protected void doSetId_NotEqual(final Integer id) {
        regId(CK_NES, id);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * id: {PK, ID, NotNull, INT(10)}
     * @param id The value of id as greaterThan.
     */
    public void setId_GreaterThan(final Integer id) {
        regId(CK_GT, id);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * id: {PK, ID, NotNull, INT(10)}
     * @param id The value of id as lessThan.
     */
    public void setId_LessThan(final Integer id) {
        regId(CK_LT, id);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * id: {PK, ID, NotNull, INT(10)}
     * @param id The value of id as greaterEqual.
     */
    public void setId_GreaterEqual(final Integer id) {
        regId(CK_GE, id);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * id: {PK, ID, NotNull, INT(10)}
     * @param id The value of id as lessEqual.
     */
    public void setId_LessEqual(final Integer id) {
        regId(CK_LE, id);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * id: {PK, ID, NotNull, INT(10)}
     * @param minNumber The min number of id. (NullAllowed)
     * @param maxNumber The max number of id. (NullAllowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setId_RangeOf(final Integer minNumber, final Integer maxNumber,
            final RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueId(), "id", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * id: {PK, ID, NotNull, INT(10)}
     * @param idList The collection of id as inScope.
     */
    public void setId_InScope(final Collection<Integer> idList) {
        doSetId_InScope(idList);
    }

    protected void doSetId_InScope(final Collection<Integer> idList) {
        regINS(CK_INS, cTL(idList), getCValueId(), "id");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * id: {PK, ID, NotNull, INT(10)}
     * @param idList The collection of id as notInScope.
     */
    public void setId_NotInScope(final Collection<Integer> idList) {
        doSetId_NotInScope(idList);
    }

    protected void doSetId_NotInScope(final Collection<Integer> idList) {
        regINS(CK_NINS, cTL(idList), getCValueId(), "id");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * id: {PK, ID, NotNull, INT(10)}
     */
    public void setId_IsNull() {
        regId(CK_ISN, DOBJ);
    }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * id: {PK, ID, NotNull, INT(10)}
     */
    public void setId_IsNotNull() {
        regId(CK_ISNN, DOBJ);
    }

    protected void regId(final ConditionKey k, final Object v) {
        regQ(k, v, getCValueId(), "id");
    }

    abstract protected ConditionValue getCValueId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * name: {VARCHAR(255)}
     * @param name The value of name as equal.
     */
    public void setName_Equal(final String name) {
        doSetName_Equal(fRES(name));
    }

    protected void doSetName_Equal(final String name) {
        regName(CK_EQ, name);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * name: {VARCHAR(255)}
     * @param name The value of name as notEqual.
     */
    public void setName_NotEqual(final String name) {
        doSetName_NotEqual(fRES(name));
    }

    protected void doSetName_NotEqual(final String name) {
        regName(CK_NES, name);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * name: {VARCHAR(255)}
     * @param name The value of name as greaterThan.
     */
    public void setName_GreaterThan(final String name) {
        regName(CK_GT, fRES(name));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * name: {VARCHAR(255)}
     * @param name The value of name as lessThan.
     */
    public void setName_LessThan(final String name) {
        regName(CK_LT, fRES(name));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * name: {VARCHAR(255)}
     * @param name The value of name as greaterEqual.
     */
    public void setName_GreaterEqual(final String name) {
        regName(CK_GE, fRES(name));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * name: {VARCHAR(255)}
     * @param name The value of name as lessEqual.
     */
    public void setName_LessEqual(final String name) {
        regName(CK_LE, fRES(name));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * name: {VARCHAR(255)}
     * @param nameList The collection of name as inScope.
     */
    public void setName_InScope(final Collection<String> nameList) {
        doSetName_InScope(nameList);
    }

    public void doSetName_InScope(final Collection<String> nameList) {
        regINS(CK_INS, cTL(nameList), getCValueName(), "name");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * name: {VARCHAR(255)}
     * @param nameList The collection of name as notInScope.
     */
    public void setName_NotInScope(final Collection<String> nameList) {
        doSetName_NotInScope(nameList);
    }

    public void doSetName_NotInScope(final Collection<String> nameList) {
        regINS(CK_NINS, cTL(nameList), getCValueName(), "name");
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * name: {VARCHAR(255)}
     * @param name The value of name as prefixSearch.
     */
    public void setName_PrefixSearch(final String name) {
        setName_LikeSearch(name, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * name: {VARCHAR(255)}
     * @param name The value of name as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setName_LikeSearch(final String name,
            final LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(name), getCValueName(), "name", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * name: {VARCHAR(255)}
     * @param name The value of name as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setName_NotLikeSearch(final String name,
            final LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(name), getCValueName(), "name", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * name: {VARCHAR(255)}
     */
    public void setName_IsNull() {
        regName(CK_ISN, DOBJ);
    }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br />
     * name: {VARCHAR(255)}
     */
    public void setName_IsNullOrEmpty() {
        regName(CK_ISNOE, DOBJ);
    }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * name: {VARCHAR(255)}
     */
    public void setName_IsNotNull() {
        regName(CK_ISNN, DOBJ);
    }

    protected void regName(final ConditionKey k, final Object v) {
        regQ(k, v, getCValueName(), "name");
    }

    abstract protected ConditionValue getCValueName();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * node_type_id: {NotNull, INT(10)}
     * @param nodeTypeId The value of nodeTypeId as equal.
     */
    public void setNodeTypeId_Equal(final Integer nodeTypeId) {
        doSetNodeTypeId_Equal(nodeTypeId);
    }

    protected void doSetNodeTypeId_Equal(final Integer nodeTypeId) {
        regNodeTypeId(CK_EQ, nodeTypeId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * node_type_id: {NotNull, INT(10)}
     * @param nodeTypeId The value of nodeTypeId as notEqual.
     */
    public void setNodeTypeId_NotEqual(final Integer nodeTypeId) {
        doSetNodeTypeId_NotEqual(nodeTypeId);
    }

    protected void doSetNodeTypeId_NotEqual(final Integer nodeTypeId) {
        regNodeTypeId(CK_NES, nodeTypeId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * node_type_id: {NotNull, INT(10)}
     * @param nodeTypeId The value of nodeTypeId as greaterThan.
     */
    public void setNodeTypeId_GreaterThan(final Integer nodeTypeId) {
        regNodeTypeId(CK_GT, nodeTypeId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * node_type_id: {NotNull, INT(10)}
     * @param nodeTypeId The value of nodeTypeId as lessThan.
     */
    public void setNodeTypeId_LessThan(final Integer nodeTypeId) {
        regNodeTypeId(CK_LT, nodeTypeId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * node_type_id: {NotNull, INT(10)}
     * @param nodeTypeId The value of nodeTypeId as greaterEqual.
     */
    public void setNodeTypeId_GreaterEqual(final Integer nodeTypeId) {
        regNodeTypeId(CK_GE, nodeTypeId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * node_type_id: {NotNull, INT(10)}
     * @param nodeTypeId The value of nodeTypeId as lessEqual.
     */
    public void setNodeTypeId_LessEqual(final Integer nodeTypeId) {
        regNodeTypeId(CK_LE, nodeTypeId);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * node_type_id: {NotNull, INT(10)}
     * @param minNumber The min number of nodeTypeId. (NullAllowed)
     * @param maxNumber The max number of nodeTypeId. (NullAllowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setNodeTypeId_RangeOf(final Integer minNumber,
            final Integer maxNumber, final RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueNodeTypeId(), "node_type_id",
                rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * node_type_id: {NotNull, INT(10)}
     * @param nodeTypeIdList The collection of nodeTypeId as inScope.
     */
    public void setNodeTypeId_InScope(final Collection<Integer> nodeTypeIdList) {
        doSetNodeTypeId_InScope(nodeTypeIdList);
    }

    protected void doSetNodeTypeId_InScope(
            final Collection<Integer> nodeTypeIdList) {
        regINS(CK_INS, cTL(nodeTypeIdList), getCValueNodeTypeId(),
                "node_type_id");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * node_type_id: {NotNull, INT(10)}
     * @param nodeTypeIdList The collection of nodeTypeId as notInScope.
     */
    public void setNodeTypeId_NotInScope(
            final Collection<Integer> nodeTypeIdList) {
        doSetNodeTypeId_NotInScope(nodeTypeIdList);
    }

    protected void doSetNodeTypeId_NotInScope(
            final Collection<Integer> nodeTypeIdList) {
        regINS(CK_NINS, cTL(nodeTypeIdList), getCValueNodeTypeId(),
                "node_type_id");
    }

    protected void regNodeTypeId(final ConditionKey k, final Object v) {
        regQ(k, v, getCValueNodeTypeId(), "node_type_id");
    }

    abstract protected ConditionValue getCValueNodeTypeId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * parent_id: {IX, INT(10)}
     * @param parentId The value of parentId as equal.
     */
    public void setParentId_Equal(final Integer parentId) {
        doSetParentId_Equal(parentId);
    }

    protected void doSetParentId_Equal(final Integer parentId) {
        regParentId(CK_EQ, parentId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * parent_id: {IX, INT(10)}
     * @param parentId The value of parentId as notEqual.
     */
    public void setParentId_NotEqual(final Integer parentId) {
        doSetParentId_NotEqual(parentId);
    }

    protected void doSetParentId_NotEqual(final Integer parentId) {
        regParentId(CK_NES, parentId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * parent_id: {IX, INT(10)}
     * @param parentId The value of parentId as greaterThan.
     */
    public void setParentId_GreaterThan(final Integer parentId) {
        regParentId(CK_GT, parentId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * parent_id: {IX, INT(10)}
     * @param parentId The value of parentId as lessThan.
     */
    public void setParentId_LessThan(final Integer parentId) {
        regParentId(CK_LT, parentId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * parent_id: {IX, INT(10)}
     * @param parentId The value of parentId as greaterEqual.
     */
    public void setParentId_GreaterEqual(final Integer parentId) {
        regParentId(CK_GE, parentId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * parent_id: {IX, INT(10)}
     * @param parentId The value of parentId as lessEqual.
     */
    public void setParentId_LessEqual(final Integer parentId) {
        regParentId(CK_LE, parentId);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * parent_id: {IX, INT(10)}
     * @param minNumber The min number of parentId. (NullAllowed)
     * @param maxNumber The max number of parentId. (NullAllowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setParentId_RangeOf(final Integer minNumber,
            final Integer maxNumber, final RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueParentId(), "parent_id",
                rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * parent_id: {IX, INT(10)}
     * @param parentIdList The collection of parentId as inScope.
     */
    public void setParentId_InScope(final Collection<Integer> parentIdList) {
        doSetParentId_InScope(parentIdList);
    }

    protected void doSetParentId_InScope(final Collection<Integer> parentIdList) {
        regINS(CK_INS, cTL(parentIdList), getCValueParentId(), "parent_id");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * parent_id: {IX, INT(10)}
     * @param parentIdList The collection of parentId as notInScope.
     */
    public void setParentId_NotInScope(final Collection<Integer> parentIdList) {
        doSetParentId_NotInScope(parentIdList);
    }

    protected void doSetParentId_NotInScope(
            final Collection<Integer> parentIdList) {
        regINS(CK_NINS, cTL(parentIdList), getCValueParentId(), "parent_id");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * parent_id: {IX, INT(10)}
     */
    public void setParentId_IsNull() {
        regParentId(CK_ISN, DOBJ);
    }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * parent_id: {IX, INT(10)}
     */
    public void setParentId_IsNotNull() {
        regParentId(CK_ISNN, DOBJ);
    }

    protected void regParentId(final ConditionKey k, final Object v) {
        regQ(k, v, getCValueParentId(), "parent_id");
    }

    abstract protected ConditionValue getCValueParentId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * node_order: {INT(10)}
     * @param nodeOrder The value of nodeOrder as equal.
     */
    public void setNodeOrder_Equal(final Integer nodeOrder) {
        doSetNodeOrder_Equal(nodeOrder);
    }

    protected void doSetNodeOrder_Equal(final Integer nodeOrder) {
        regNodeOrder(CK_EQ, nodeOrder);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * node_order: {INT(10)}
     * @param nodeOrder The value of nodeOrder as notEqual.
     */
    public void setNodeOrder_NotEqual(final Integer nodeOrder) {
        doSetNodeOrder_NotEqual(nodeOrder);
    }

    protected void doSetNodeOrder_NotEqual(final Integer nodeOrder) {
        regNodeOrder(CK_NES, nodeOrder);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * node_order: {INT(10)}
     * @param nodeOrder The value of nodeOrder as greaterThan.
     */
    public void setNodeOrder_GreaterThan(final Integer nodeOrder) {
        regNodeOrder(CK_GT, nodeOrder);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * node_order: {INT(10)}
     * @param nodeOrder The value of nodeOrder as lessThan.
     */
    public void setNodeOrder_LessThan(final Integer nodeOrder) {
        regNodeOrder(CK_LT, nodeOrder);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * node_order: {INT(10)}
     * @param nodeOrder The value of nodeOrder as greaterEqual.
     */
    public void setNodeOrder_GreaterEqual(final Integer nodeOrder) {
        regNodeOrder(CK_GE, nodeOrder);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * node_order: {INT(10)}
     * @param nodeOrder The value of nodeOrder as lessEqual.
     */
    public void setNodeOrder_LessEqual(final Integer nodeOrder) {
        regNodeOrder(CK_LE, nodeOrder);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * node_order: {INT(10)}
     * @param minNumber The min number of nodeOrder. (NullAllowed)
     * @param maxNumber The max number of nodeOrder. (NullAllowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setNodeOrder_RangeOf(final Integer minNumber,
            final Integer maxNumber, final RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueNodeOrder(), "node_order",
                rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * node_order: {INT(10)}
     * @param nodeOrderList The collection of nodeOrder as inScope.
     */
    public void setNodeOrder_InScope(final Collection<Integer> nodeOrderList) {
        doSetNodeOrder_InScope(nodeOrderList);
    }

    protected void doSetNodeOrder_InScope(
            final Collection<Integer> nodeOrderList) {
        regINS(CK_INS, cTL(nodeOrderList), getCValueNodeOrder(), "node_order");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * node_order: {INT(10)}
     * @param nodeOrderList The collection of nodeOrder as notInScope.
     */
    public void setNodeOrder_NotInScope(final Collection<Integer> nodeOrderList) {
        doSetNodeOrder_NotInScope(nodeOrderList);
    }

    protected void doSetNodeOrder_NotInScope(
            final Collection<Integer> nodeOrderList) {
        regINS(CK_NINS, cTL(nodeOrderList), getCValueNodeOrder(), "node_order");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * node_order: {INT(10)}
     */
    public void setNodeOrder_IsNull() {
        regNodeOrder(CK_ISN, DOBJ);
    }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * node_order: {INT(10)}
     */
    public void setNodeOrder_IsNotNull() {
        regNodeOrder(CK_ISNN, DOBJ);
    }

    protected void regNodeOrder(final ConditionKey k, final Object v) {
        regQ(k, v, getCValueNodeOrder(), "node_order");
    }

    abstract protected ConditionValue getCValueNodeOrder();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * path: {IX, NotNull, VARCHAR(255)}
     * @param path The value of path as equal.
     */
    public void setPath_Equal(final String path) {
        doSetPath_Equal(fRES(path));
    }

    protected void doSetPath_Equal(final String path) {
        regPath(CK_EQ, path);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * path: {IX, NotNull, VARCHAR(255)}
     * @param path The value of path as notEqual.
     */
    public void setPath_NotEqual(final String path) {
        doSetPath_NotEqual(fRES(path));
    }

    protected void doSetPath_NotEqual(final String path) {
        regPath(CK_NES, path);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * path: {IX, NotNull, VARCHAR(255)}
     * @param path The value of path as greaterThan.
     */
    public void setPath_GreaterThan(final String path) {
        regPath(CK_GT, fRES(path));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * path: {IX, NotNull, VARCHAR(255)}
     * @param path The value of path as lessThan.
     */
    public void setPath_LessThan(final String path) {
        regPath(CK_LT, fRES(path));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * path: {IX, NotNull, VARCHAR(255)}
     * @param path The value of path as greaterEqual.
     */
    public void setPath_GreaterEqual(final String path) {
        regPath(CK_GE, fRES(path));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * path: {IX, NotNull, VARCHAR(255)}
     * @param path The value of path as lessEqual.
     */
    public void setPath_LessEqual(final String path) {
        regPath(CK_LE, fRES(path));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * path: {IX, NotNull, VARCHAR(255)}
     * @param pathList The collection of path as inScope.
     */
    public void setPath_InScope(final Collection<String> pathList) {
        doSetPath_InScope(pathList);
    }

    public void doSetPath_InScope(final Collection<String> pathList) {
        regINS(CK_INS, cTL(pathList), getCValuePath(), "path");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * path: {IX, NotNull, VARCHAR(255)}
     * @param pathList The collection of path as notInScope.
     */
    public void setPath_NotInScope(final Collection<String> pathList) {
        doSetPath_NotInScope(pathList);
    }

    public void doSetPath_NotInScope(final Collection<String> pathList) {
        regINS(CK_NINS, cTL(pathList), getCValuePath(), "path");
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * path: {IX, NotNull, VARCHAR(255)}
     * @param path The value of path as prefixSearch.
     */
    public void setPath_PrefixSearch(final String path) {
        setPath_LikeSearch(path, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * path: {IX, NotNull, VARCHAR(255)}
     * @param path The value of path as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setPath_LikeSearch(final String path,
            final LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(path), getCValuePath(), "path", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * path: {IX, NotNull, VARCHAR(255)}
     * @param path The value of path as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setPath_NotLikeSearch(final String path,
            final LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(path), getCValuePath(), "path", likeSearchOption);
    }

    protected void regPath(final ConditionKey k, final Object v) {
        regQ(k, v, getCValuePath(), "path");
    }

    abstract protected ConditionValue getCValuePath();

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO = (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_Equal()</span>.max(new SubQuery&lt;ImpasseNodesCB&gt;() {
     *     public void query(ImpasseNodesCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<ImpasseNodesCB> scalar_Equal() {
        return xcreateSSQFunction(CK_EQ.getOperand());
    }

    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO &lt;&gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_NotEqual()</span>.max(new SubQuery&lt;ImpasseNodesCB&gt;() {
     *     public void query(ImpasseNodesCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<ImpasseNodesCB> scalar_NotEqual() {
        return xcreateSSQFunction(CK_NES.getOperand());
    }

    /**
     * Prepare ScalarCondition as greaterThan. <br />
     * {where FOO &gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_GreaterThan()</span>.max(new SubQuery&lt;ImpasseNodesCB&gt;() {
     *     public void query(ImpasseNodesCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<ImpasseNodesCB> scalar_GreaterThan() {
        return xcreateSSQFunction(CK_GT.getOperand());
    }

    /**
     * Prepare ScalarCondition as lessThan. <br />
     * {where FOO &lt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_LessThan()</span>.max(new SubQuery&lt;ImpasseNodesCB&gt;() {
     *     public void query(ImpasseNodesCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<ImpasseNodesCB> scalar_LessThan() {
        return xcreateSSQFunction(CK_LT.getOperand());
    }

    /**
     * Prepare ScalarCondition as greaterEqual. <br />
     * {where FOO &gt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_GreaterEqual()</span>.max(new SubQuery&lt;ImpasseNodesCB&gt;() {
     *     public void query(ImpasseNodesCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<ImpasseNodesCB> scalar_GreaterEqual() {
        return xcreateSSQFunction(CK_GE.getOperand());
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br />
     * {where FOO &lt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_LessEqual()</span>.max(new SubQuery&lt;ImpasseNodesCB&gt;() {
     *     public void query(ImpasseNodesCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<ImpasseNodesCB> scalar_LessEqual() {
        return xcreateSSQFunction(CK_LE.getOperand());
    }

    protected HpSSQFunction<ImpasseNodesCB> xcreateSSQFunction(
            final String operand) {
        return new HpSSQFunction<ImpasseNodesCB>(
                new HpSSQSetupper<ImpasseNodesCB>() {
                    @Override
                    public void setup(final String function,
                            final SubQuery<ImpasseNodesCB> subQuery,
                            final HpSSQOption<ImpasseNodesCB> option) {
                        xscalarCondition(function, subQuery, operand, option);
                    }
                });
    }

    protected void xscalarCondition(final String function,
            final SubQuery<ImpasseNodesCB> subQuery, final String operand,
            final HpSSQOption<ImpasseNodesCB> option) {
        assertObjectNotNull("subQuery<ImpasseNodesCB>", subQuery);
        final ImpasseNodesCB cb = xcreateScalarConditionCB();
        subQuery.query(cb);
        final String subQueryPropertyName = keepScalarCondition(cb.query()); // for saving query-value
        option.setPartitionByCBean(xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(function, cb.query(), subQueryPropertyName,
                operand, option);
    }

    public abstract String keepScalarCondition(ImpasseNodesCQ subQuery);

    protected ImpasseNodesCB xcreateScalarConditionCB() {
        final ImpasseNodesCB cb = new ImpasseNodesCB();
        cb.xsetupForScalarCondition(this);
        return cb;
    }

    protected ImpasseNodesCB xcreateScalarConditionPartitionByCB() {
        final ImpasseNodesCB cb = new ImpasseNodesCB();
        cb.xsetupForScalarConditionPartitionBy(this);
        return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(final String function,
            final SubQuery<ImpasseNodesCB> subQuery, final String aliasName,
            final DerivedReferrerOption option) {
        assertObjectNotNull("subQuery<ImpasseNodesCB>", subQuery);
        final ImpasseNodesCB cb = new ImpasseNodesCB();
        cb.xsetupForDerivedReferrer(this);
        subQuery.query(cb);
        final String subQueryPropertyName = keepSpecifyMyselfDerived(cb.query()); // for saving query-value.
        registerSpecifyMyselfDerived(function, cb.query(), "id", "id",
                subQueryPropertyName, "myselfDerived", aliasName, option);
    }

    public abstract String keepSpecifyMyselfDerived(ImpasseNodesCQ subQuery);

    /**
     * Prepare for (Query)MyselfDerived (SubQuery).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<ImpasseNodesCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived();
    }

    protected HpQDRFunction<ImpasseNodesCB> xcreateQDRFunctionMyselfDerived() {
        return new HpQDRFunction<ImpasseNodesCB>(
                new HpQDRSetupper<ImpasseNodesCB>() {
                    @Override
                    public void setup(final String function,
                            final SubQuery<ImpasseNodesCB> subQuery,
                            final String operand, final Object value,
                            final DerivedReferrerOption option) {
                        xqderiveMyselfDerived(function, subQuery, operand,
                                value, option);
                    }
                });
    }

    public void xqderiveMyselfDerived(final String function,
            final SubQuery<ImpasseNodesCB> subQuery, final String operand,
            final Object value, final DerivedReferrerOption option) {
        assertObjectNotNull("subQuery<ImpasseNodesCB>", subQuery);
        final ImpasseNodesCB cb = new ImpasseNodesCB();
        cb.xsetupForDerivedReferrer(this);
        subQuery.query(cb);
        final String subQueryPropertyName = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        final String parameterPropertyName = keepQueryMyselfDerivedParameter(value);
        registerQueryMyselfDerived(function, cb.query(), "id", "id",
                subQueryPropertyName, "myselfDerived", operand, value,
                parameterPropertyName, option);
    }

    public abstract String keepQueryMyselfDerived(ImpasseNodesCQ subQuery);

    public abstract String keepQueryMyselfDerivedParameter(Object parameterValue);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (SubQuery).
     * @param subQuery The implementation of sub query. (NotNull)
     */
    public void myselfExists(final SubQuery<ImpasseNodesCB> subQuery) {
        assertObjectNotNull("subQuery<ImpasseNodesCB>", subQuery);
        final ImpasseNodesCB cb = new ImpasseNodesCB();
        cb.xsetupForMyselfExists(this);
        subQuery.query(cb);
        final String subQueryPropertyName = keepMyselfExists(cb.query()); // for saving query-value.
        registerMyselfExists(cb.query(), subQueryPropertyName);
    }

    public abstract String keepMyselfExists(ImpasseNodesCQ subQuery);

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    /**
     * Prepare for MyselfInScope (SubQuery).
     * @param subQuery The implementation of sub query. (NotNull)
     */
    public void myselfInScope(final SubQuery<ImpasseNodesCB> subQuery) {
        assertObjectNotNull("subQuery<ImpasseNodesCB>", subQuery);
        final ImpasseNodesCB cb = new ImpasseNodesCB();
        cb.xsetupForMyselfInScope(this);
        subQuery.query(cb);
        final String subQueryPropertyName = keepMyselfInScope(cb.query()); // for saving query-value.
        registerMyselfInScope(cb.query(), subQueryPropertyName);
    }

    public abstract String keepMyselfInScope(ImpasseNodesCQ subQuery);

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use TestLinkImport')
    protected String xabCB() {
        return ImpasseNodesCB.class.getName();
    }

    protected String xabCQ() {
        return ImpasseNodesCQ.class.getName();
    }

    protected String xabLSO() {
        return LikeSearchOption.class.getName();
    }

    protected String xabSSQS() {
        return HpSSQSetupper.class.getName();
    }
}
