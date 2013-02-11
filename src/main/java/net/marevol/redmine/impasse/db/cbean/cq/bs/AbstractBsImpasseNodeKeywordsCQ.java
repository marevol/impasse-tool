package net.marevol.redmine.impasse.db.cbean.cq.bs;

import java.util.Collection;

import net.marevol.redmine.impasse.db.allcommon.DBMetaInstanceHandler;
import net.marevol.redmine.impasse.db.cbean.ImpasseNodeKeywordsCB;
import net.marevol.redmine.impasse.db.cbean.cq.ImpasseNodeKeywordsCQ;

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
 * The abstract condition-query of impasse_node_keywords.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsImpasseNodeKeywordsCQ extends
        AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsImpasseNodeKeywordsCQ(final ConditionQuery childQuery,
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
        return "impasse_node_keywords";
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
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * node_id: {IX, NotNull, INT(10)}
     * @param nodeId The value of nodeId as equal.
     */
    public void setNodeId_Equal(final Integer nodeId) {
        doSetNodeId_Equal(nodeId);
    }

    protected void doSetNodeId_Equal(final Integer nodeId) {
        regNodeId(CK_EQ, nodeId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * node_id: {IX, NotNull, INT(10)}
     * @param nodeId The value of nodeId as notEqual.
     */
    public void setNodeId_NotEqual(final Integer nodeId) {
        doSetNodeId_NotEqual(nodeId);
    }

    protected void doSetNodeId_NotEqual(final Integer nodeId) {
        regNodeId(CK_NES, nodeId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * node_id: {IX, NotNull, INT(10)}
     * @param nodeId The value of nodeId as greaterThan.
     */
    public void setNodeId_GreaterThan(final Integer nodeId) {
        regNodeId(CK_GT, nodeId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * node_id: {IX, NotNull, INT(10)}
     * @param nodeId The value of nodeId as lessThan.
     */
    public void setNodeId_LessThan(final Integer nodeId) {
        regNodeId(CK_LT, nodeId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * node_id: {IX, NotNull, INT(10)}
     * @param nodeId The value of nodeId as greaterEqual.
     */
    public void setNodeId_GreaterEqual(final Integer nodeId) {
        regNodeId(CK_GE, nodeId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * node_id: {IX, NotNull, INT(10)}
     * @param nodeId The value of nodeId as lessEqual.
     */
    public void setNodeId_LessEqual(final Integer nodeId) {
        regNodeId(CK_LE, nodeId);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * node_id: {IX, NotNull, INT(10)}
     * @param minNumber The min number of nodeId. (NullAllowed)
     * @param maxNumber The max number of nodeId. (NullAllowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setNodeId_RangeOf(final Integer minNumber,
            final Integer maxNumber, final RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueNodeId(), "node_id",
                rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * node_id: {IX, NotNull, INT(10)}
     * @param nodeIdList The collection of nodeId as inScope.
     */
    public void setNodeId_InScope(final Collection<Integer> nodeIdList) {
        doSetNodeId_InScope(nodeIdList);
    }

    protected void doSetNodeId_InScope(final Collection<Integer> nodeIdList) {
        regINS(CK_INS, cTL(nodeIdList), getCValueNodeId(), "node_id");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * node_id: {IX, NotNull, INT(10)}
     * @param nodeIdList The collection of nodeId as notInScope.
     */
    public void setNodeId_NotInScope(final Collection<Integer> nodeIdList) {
        doSetNodeId_NotInScope(nodeIdList);
    }

    protected void doSetNodeId_NotInScope(final Collection<Integer> nodeIdList) {
        regINS(CK_NINS, cTL(nodeIdList), getCValueNodeId(), "node_id");
    }

    protected void regNodeId(final ConditionKey k, final Object v) {
        regQ(k, v, getCValueNodeId(), "node_id");
    }

    abstract protected ConditionValue getCValueNodeId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * keyword_id: {IX+, NotNull, INT(10)}
     * @param keywordId The value of keywordId as equal.
     */
    public void setKeywordId_Equal(final Integer keywordId) {
        doSetKeywordId_Equal(keywordId);
    }

    protected void doSetKeywordId_Equal(final Integer keywordId) {
        regKeywordId(CK_EQ, keywordId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * keyword_id: {IX+, NotNull, INT(10)}
     * @param keywordId The value of keywordId as notEqual.
     */
    public void setKeywordId_NotEqual(final Integer keywordId) {
        doSetKeywordId_NotEqual(keywordId);
    }

    protected void doSetKeywordId_NotEqual(final Integer keywordId) {
        regKeywordId(CK_NES, keywordId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * keyword_id: {IX+, NotNull, INT(10)}
     * @param keywordId The value of keywordId as greaterThan.
     */
    public void setKeywordId_GreaterThan(final Integer keywordId) {
        regKeywordId(CK_GT, keywordId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * keyword_id: {IX+, NotNull, INT(10)}
     * @param keywordId The value of keywordId as lessThan.
     */
    public void setKeywordId_LessThan(final Integer keywordId) {
        regKeywordId(CK_LT, keywordId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * keyword_id: {IX+, NotNull, INT(10)}
     * @param keywordId The value of keywordId as greaterEqual.
     */
    public void setKeywordId_GreaterEqual(final Integer keywordId) {
        regKeywordId(CK_GE, keywordId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * keyword_id: {IX+, NotNull, INT(10)}
     * @param keywordId The value of keywordId as lessEqual.
     */
    public void setKeywordId_LessEqual(final Integer keywordId) {
        regKeywordId(CK_LE, keywordId);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * keyword_id: {IX+, NotNull, INT(10)}
     * @param minNumber The min number of keywordId. (NullAllowed)
     * @param maxNumber The max number of keywordId. (NullAllowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setKeywordId_RangeOf(final Integer minNumber,
            final Integer maxNumber, final RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueKeywordId(), "keyword_id",
                rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * keyword_id: {IX+, NotNull, INT(10)}
     * @param keywordIdList The collection of keywordId as inScope.
     */
    public void setKeywordId_InScope(final Collection<Integer> keywordIdList) {
        doSetKeywordId_InScope(keywordIdList);
    }

    protected void doSetKeywordId_InScope(
            final Collection<Integer> keywordIdList) {
        regINS(CK_INS, cTL(keywordIdList), getCValueKeywordId(), "keyword_id");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * keyword_id: {IX+, NotNull, INT(10)}
     * @param keywordIdList The collection of keywordId as notInScope.
     */
    public void setKeywordId_NotInScope(final Collection<Integer> keywordIdList) {
        doSetKeywordId_NotInScope(keywordIdList);
    }

    protected void doSetKeywordId_NotInScope(
            final Collection<Integer> keywordIdList) {
        regINS(CK_NINS, cTL(keywordIdList), getCValueKeywordId(), "keyword_id");
    }

    protected void regKeywordId(final ConditionKey k, final Object v) {
        regQ(k, v, getCValueKeywordId(), "keyword_id");
    }

    abstract protected ConditionValue getCValueKeywordId();

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO = (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_Equal()</span>.max(new SubQuery&lt;ImpasseNodeKeywordsCB&gt;() {
     *     public void query(ImpasseNodeKeywordsCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<ImpasseNodeKeywordsCB> scalar_Equal() {
        return xcreateSSQFunction(CK_EQ.getOperand());
    }

    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO &lt;&gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_NotEqual()</span>.max(new SubQuery&lt;ImpasseNodeKeywordsCB&gt;() {
     *     public void query(ImpasseNodeKeywordsCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<ImpasseNodeKeywordsCB> scalar_NotEqual() {
        return xcreateSSQFunction(CK_NES.getOperand());
    }

    /**
     * Prepare ScalarCondition as greaterThan. <br />
     * {where FOO &gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_GreaterThan()</span>.max(new SubQuery&lt;ImpasseNodeKeywordsCB&gt;() {
     *     public void query(ImpasseNodeKeywordsCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<ImpasseNodeKeywordsCB> scalar_GreaterThan() {
        return xcreateSSQFunction(CK_GT.getOperand());
    }

    /**
     * Prepare ScalarCondition as lessThan. <br />
     * {where FOO &lt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_LessThan()</span>.max(new SubQuery&lt;ImpasseNodeKeywordsCB&gt;() {
     *     public void query(ImpasseNodeKeywordsCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<ImpasseNodeKeywordsCB> scalar_LessThan() {
        return xcreateSSQFunction(CK_LT.getOperand());
    }

    /**
     * Prepare ScalarCondition as greaterEqual. <br />
     * {where FOO &gt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_GreaterEqual()</span>.max(new SubQuery&lt;ImpasseNodeKeywordsCB&gt;() {
     *     public void query(ImpasseNodeKeywordsCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<ImpasseNodeKeywordsCB> scalar_GreaterEqual() {
        return xcreateSSQFunction(CK_GE.getOperand());
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br />
     * {where FOO &lt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_LessEqual()</span>.max(new SubQuery&lt;ImpasseNodeKeywordsCB&gt;() {
     *     public void query(ImpasseNodeKeywordsCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<ImpasseNodeKeywordsCB> scalar_LessEqual() {
        return xcreateSSQFunction(CK_LE.getOperand());
    }

    protected HpSSQFunction<ImpasseNodeKeywordsCB> xcreateSSQFunction(
            final String operand) {
        return new HpSSQFunction<ImpasseNodeKeywordsCB>(
                new HpSSQSetupper<ImpasseNodeKeywordsCB>() {
                    @Override
                    public void setup(final String function,
                            final SubQuery<ImpasseNodeKeywordsCB> subQuery,
                            final HpSSQOption<ImpasseNodeKeywordsCB> option) {
                        xscalarCondition(function, subQuery, operand, option);
                    }
                });
    }

    protected void xscalarCondition(final String function,
            final SubQuery<ImpasseNodeKeywordsCB> subQuery,
            final String operand,
            final HpSSQOption<ImpasseNodeKeywordsCB> option) {
        assertObjectNotNull("subQuery<ImpasseNodeKeywordsCB>", subQuery);
        final ImpasseNodeKeywordsCB cb = xcreateScalarConditionCB();
        subQuery.query(cb);
        final String subQueryPropertyName = keepScalarCondition(cb.query()); // for saving query-value
        option.setPartitionByCBean(xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(function, cb.query(), subQueryPropertyName,
                operand, option);
    }

    public abstract String keepScalarCondition(ImpasseNodeKeywordsCQ subQuery);

    protected ImpasseNodeKeywordsCB xcreateScalarConditionCB() {
        final ImpasseNodeKeywordsCB cb = new ImpasseNodeKeywordsCB();
        cb.xsetupForScalarCondition(this);
        return cb;
    }

    protected ImpasseNodeKeywordsCB xcreateScalarConditionPartitionByCB() {
        final ImpasseNodeKeywordsCB cb = new ImpasseNodeKeywordsCB();
        cb.xsetupForScalarConditionPartitionBy(this);
        return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(final String function,
            final SubQuery<ImpasseNodeKeywordsCB> subQuery,
            final String aliasName, final DerivedReferrerOption option) {
        assertObjectNotNull("subQuery<ImpasseNodeKeywordsCB>", subQuery);
        final ImpasseNodeKeywordsCB cb = new ImpasseNodeKeywordsCB();
        cb.xsetupForDerivedReferrer(this);
        subQuery.query(cb);
        final String subQueryPropertyName = keepSpecifyMyselfDerived(cb.query()); // for saving query-value.
        registerSpecifyMyselfDerived(function, cb.query(), "id", "id",
                subQueryPropertyName, "myselfDerived", aliasName, option);
    }

    public abstract String keepSpecifyMyselfDerived(
            ImpasseNodeKeywordsCQ subQuery);

    /**
     * Prepare for (Query)MyselfDerived (SubQuery).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<ImpasseNodeKeywordsCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived();
    }

    protected HpQDRFunction<ImpasseNodeKeywordsCB> xcreateQDRFunctionMyselfDerived() {
        return new HpQDRFunction<ImpasseNodeKeywordsCB>(
                new HpQDRSetupper<ImpasseNodeKeywordsCB>() {
                    @Override
                    public void setup(final String function,
                            final SubQuery<ImpasseNodeKeywordsCB> subQuery,
                            final String operand, final Object value,
                            final DerivedReferrerOption option) {
                        xqderiveMyselfDerived(function, subQuery, operand,
                                value, option);
                    }
                });
    }

    public void xqderiveMyselfDerived(final String function,
            final SubQuery<ImpasseNodeKeywordsCB> subQuery,
            final String operand, final Object value,
            final DerivedReferrerOption option) {
        assertObjectNotNull("subQuery<ImpasseNodeKeywordsCB>", subQuery);
        final ImpasseNodeKeywordsCB cb = new ImpasseNodeKeywordsCB();
        cb.xsetupForDerivedReferrer(this);
        subQuery.query(cb);
        final String subQueryPropertyName = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        final String parameterPropertyName = keepQueryMyselfDerivedParameter(value);
        registerQueryMyselfDerived(function, cb.query(), "id", "id",
                subQueryPropertyName, "myselfDerived", operand, value,
                parameterPropertyName, option);
    }

    public abstract String keepQueryMyselfDerived(ImpasseNodeKeywordsCQ subQuery);

    public abstract String keepQueryMyselfDerivedParameter(Object parameterValue);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (SubQuery).
     * @param subQuery The implementation of sub query. (NotNull)
     */
    public void myselfExists(final SubQuery<ImpasseNodeKeywordsCB> subQuery) {
        assertObjectNotNull("subQuery<ImpasseNodeKeywordsCB>", subQuery);
        final ImpasseNodeKeywordsCB cb = new ImpasseNodeKeywordsCB();
        cb.xsetupForMyselfExists(this);
        subQuery.query(cb);
        final String subQueryPropertyName = keepMyselfExists(cb.query()); // for saving query-value.
        registerMyselfExists(cb.query(), subQueryPropertyName);
    }

    public abstract String keepMyselfExists(ImpasseNodeKeywordsCQ subQuery);

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    /**
     * Prepare for MyselfInScope (SubQuery).
     * @param subQuery The implementation of sub query. (NotNull)
     */
    public void myselfInScope(final SubQuery<ImpasseNodeKeywordsCB> subQuery) {
        assertObjectNotNull("subQuery<ImpasseNodeKeywordsCB>", subQuery);
        final ImpasseNodeKeywordsCB cb = new ImpasseNodeKeywordsCB();
        cb.xsetupForMyselfInScope(this);
        subQuery.query(cb);
        final String subQueryPropertyName = keepMyselfInScope(cb.query()); // for saving query-value.
        registerMyselfInScope(cb.query(), subQueryPropertyName);
    }

    public abstract String keepMyselfInScope(ImpasseNodeKeywordsCQ subQuery);

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabCB() {
        return ImpasseNodeKeywordsCB.class.getName();
    }

    protected String xabCQ() {
        return ImpasseNodeKeywordsCQ.class.getName();
    }

    protected String xabLSO() {
        return LikeSearchOption.class.getName();
    }

    protected String xabSSQS() {
        return HpSSQSetupper.class.getName();
    }
}
