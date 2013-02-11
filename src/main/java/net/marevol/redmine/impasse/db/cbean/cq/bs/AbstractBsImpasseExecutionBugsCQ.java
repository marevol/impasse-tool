package net.marevol.redmine.impasse.db.cbean.cq.bs;

import java.util.Collection;

import net.marevol.redmine.impasse.db.allcommon.DBMetaInstanceHandler;
import net.marevol.redmine.impasse.db.cbean.ImpasseExecutionBugsCB;
import net.marevol.redmine.impasse.db.cbean.cq.ImpasseExecutionBugsCQ;

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
 * The abstract condition-query of impasse_execution_bugs.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsImpasseExecutionBugsCQ extends
        AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsImpasseExecutionBugsCQ(final ConditionQuery childQuery,
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
        return "impasse_execution_bugs";
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
     * execution_id: {IX, INT(10)}
     * @param executionId The value of executionId as equal.
     */
    public void setExecutionId_Equal(final Integer executionId) {
        doSetExecutionId_Equal(executionId);
    }

    protected void doSetExecutionId_Equal(final Integer executionId) {
        regExecutionId(CK_EQ, executionId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * execution_id: {IX, INT(10)}
     * @param executionId The value of executionId as notEqual.
     */
    public void setExecutionId_NotEqual(final Integer executionId) {
        doSetExecutionId_NotEqual(executionId);
    }

    protected void doSetExecutionId_NotEqual(final Integer executionId) {
        regExecutionId(CK_NES, executionId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * execution_id: {IX, INT(10)}
     * @param executionId The value of executionId as greaterThan.
     */
    public void setExecutionId_GreaterThan(final Integer executionId) {
        regExecutionId(CK_GT, executionId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * execution_id: {IX, INT(10)}
     * @param executionId The value of executionId as lessThan.
     */
    public void setExecutionId_LessThan(final Integer executionId) {
        regExecutionId(CK_LT, executionId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * execution_id: {IX, INT(10)}
     * @param executionId The value of executionId as greaterEqual.
     */
    public void setExecutionId_GreaterEqual(final Integer executionId) {
        regExecutionId(CK_GE, executionId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * execution_id: {IX, INT(10)}
     * @param executionId The value of executionId as lessEqual.
     */
    public void setExecutionId_LessEqual(final Integer executionId) {
        regExecutionId(CK_LE, executionId);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * execution_id: {IX, INT(10)}
     * @param minNumber The min number of executionId. (NullAllowed)
     * @param maxNumber The max number of executionId. (NullAllowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setExecutionId_RangeOf(final Integer minNumber,
            final Integer maxNumber, final RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueExecutionId(), "execution_id",
                rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * execution_id: {IX, INT(10)}
     * @param executionIdList The collection of executionId as inScope.
     */
    public void setExecutionId_InScope(final Collection<Integer> executionIdList) {
        doSetExecutionId_InScope(executionIdList);
    }

    protected void doSetExecutionId_InScope(
            final Collection<Integer> executionIdList) {
        regINS(CK_INS, cTL(executionIdList), getCValueExecutionId(),
                "execution_id");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * execution_id: {IX, INT(10)}
     * @param executionIdList The collection of executionId as notInScope.
     */
    public void setExecutionId_NotInScope(
            final Collection<Integer> executionIdList) {
        doSetExecutionId_NotInScope(executionIdList);
    }

    protected void doSetExecutionId_NotInScope(
            final Collection<Integer> executionIdList) {
        regINS(CK_NINS, cTL(executionIdList), getCValueExecutionId(),
                "execution_id");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * execution_id: {IX, INT(10)}
     */
    public void setExecutionId_IsNull() {
        regExecutionId(CK_ISN, DOBJ);
    }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * execution_id: {IX, INT(10)}
     */
    public void setExecutionId_IsNotNull() {
        regExecutionId(CK_ISNN, DOBJ);
    }

    protected void regExecutionId(final ConditionKey k, final Object v) {
        regQ(k, v, getCValueExecutionId(), "execution_id");
    }

    abstract protected ConditionValue getCValueExecutionId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * bug_id: {IX, INT(10)}
     * @param bugId The value of bugId as equal.
     */
    public void setBugId_Equal(final Integer bugId) {
        doSetBugId_Equal(bugId);
    }

    protected void doSetBugId_Equal(final Integer bugId) {
        regBugId(CK_EQ, bugId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * bug_id: {IX, INT(10)}
     * @param bugId The value of bugId as notEqual.
     */
    public void setBugId_NotEqual(final Integer bugId) {
        doSetBugId_NotEqual(bugId);
    }

    protected void doSetBugId_NotEqual(final Integer bugId) {
        regBugId(CK_NES, bugId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * bug_id: {IX, INT(10)}
     * @param bugId The value of bugId as greaterThan.
     */
    public void setBugId_GreaterThan(final Integer bugId) {
        regBugId(CK_GT, bugId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * bug_id: {IX, INT(10)}
     * @param bugId The value of bugId as lessThan.
     */
    public void setBugId_LessThan(final Integer bugId) {
        regBugId(CK_LT, bugId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * bug_id: {IX, INT(10)}
     * @param bugId The value of bugId as greaterEqual.
     */
    public void setBugId_GreaterEqual(final Integer bugId) {
        regBugId(CK_GE, bugId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * bug_id: {IX, INT(10)}
     * @param bugId The value of bugId as lessEqual.
     */
    public void setBugId_LessEqual(final Integer bugId) {
        regBugId(CK_LE, bugId);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * bug_id: {IX, INT(10)}
     * @param minNumber The min number of bugId. (NullAllowed)
     * @param maxNumber The max number of bugId. (NullAllowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setBugId_RangeOf(final Integer minNumber,
            final Integer maxNumber, final RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueBugId(), "bug_id", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * bug_id: {IX, INT(10)}
     * @param bugIdList The collection of bugId as inScope.
     */
    public void setBugId_InScope(final Collection<Integer> bugIdList) {
        doSetBugId_InScope(bugIdList);
    }

    protected void doSetBugId_InScope(final Collection<Integer> bugIdList) {
        regINS(CK_INS, cTL(bugIdList), getCValueBugId(), "bug_id");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * bug_id: {IX, INT(10)}
     * @param bugIdList The collection of bugId as notInScope.
     */
    public void setBugId_NotInScope(final Collection<Integer> bugIdList) {
        doSetBugId_NotInScope(bugIdList);
    }

    protected void doSetBugId_NotInScope(final Collection<Integer> bugIdList) {
        regINS(CK_NINS, cTL(bugIdList), getCValueBugId(), "bug_id");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * bug_id: {IX, INT(10)}
     */
    public void setBugId_IsNull() {
        regBugId(CK_ISN, DOBJ);
    }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * bug_id: {IX, INT(10)}
     */
    public void setBugId_IsNotNull() {
        regBugId(CK_ISNN, DOBJ);
    }

    protected void regBugId(final ConditionKey k, final Object v) {
        regQ(k, v, getCValueBugId(), "bug_id");
    }

    abstract protected ConditionValue getCValueBugId();

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO = (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_Equal()</span>.max(new SubQuery&lt;ImpasseExecutionBugsCB&gt;() {
     *     public void query(ImpasseExecutionBugsCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<ImpasseExecutionBugsCB> scalar_Equal() {
        return xcreateSSQFunction(CK_EQ.getOperand());
    }

    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO &lt;&gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_NotEqual()</span>.max(new SubQuery&lt;ImpasseExecutionBugsCB&gt;() {
     *     public void query(ImpasseExecutionBugsCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<ImpasseExecutionBugsCB> scalar_NotEqual() {
        return xcreateSSQFunction(CK_NES.getOperand());
    }

    /**
     * Prepare ScalarCondition as greaterThan. <br />
     * {where FOO &gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_GreaterThan()</span>.max(new SubQuery&lt;ImpasseExecutionBugsCB&gt;() {
     *     public void query(ImpasseExecutionBugsCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<ImpasseExecutionBugsCB> scalar_GreaterThan() {
        return xcreateSSQFunction(CK_GT.getOperand());
    }

    /**
     * Prepare ScalarCondition as lessThan. <br />
     * {where FOO &lt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_LessThan()</span>.max(new SubQuery&lt;ImpasseExecutionBugsCB&gt;() {
     *     public void query(ImpasseExecutionBugsCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<ImpasseExecutionBugsCB> scalar_LessThan() {
        return xcreateSSQFunction(CK_LT.getOperand());
    }

    /**
     * Prepare ScalarCondition as greaterEqual. <br />
     * {where FOO &gt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_GreaterEqual()</span>.max(new SubQuery&lt;ImpasseExecutionBugsCB&gt;() {
     *     public void query(ImpasseExecutionBugsCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<ImpasseExecutionBugsCB> scalar_GreaterEqual() {
        return xcreateSSQFunction(CK_GE.getOperand());
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br />
     * {where FOO &lt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_LessEqual()</span>.max(new SubQuery&lt;ImpasseExecutionBugsCB&gt;() {
     *     public void query(ImpasseExecutionBugsCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<ImpasseExecutionBugsCB> scalar_LessEqual() {
        return xcreateSSQFunction(CK_LE.getOperand());
    }

    protected HpSSQFunction<ImpasseExecutionBugsCB> xcreateSSQFunction(
            final String operand) {
        return new HpSSQFunction<ImpasseExecutionBugsCB>(
                new HpSSQSetupper<ImpasseExecutionBugsCB>() {
                    @Override
                    public void setup(final String function,
                            final SubQuery<ImpasseExecutionBugsCB> subQuery,
                            final HpSSQOption<ImpasseExecutionBugsCB> option) {
                        xscalarCondition(function, subQuery, operand, option);
                    }
                });
    }

    protected void xscalarCondition(final String function,
            final SubQuery<ImpasseExecutionBugsCB> subQuery,
            final String operand,
            final HpSSQOption<ImpasseExecutionBugsCB> option) {
        assertObjectNotNull("subQuery<ImpasseExecutionBugsCB>", subQuery);
        final ImpasseExecutionBugsCB cb = xcreateScalarConditionCB();
        subQuery.query(cb);
        final String subQueryPropertyName = keepScalarCondition(cb.query()); // for saving query-value
        option.setPartitionByCBean(xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(function, cb.query(), subQueryPropertyName,
                operand, option);
    }

    public abstract String keepScalarCondition(ImpasseExecutionBugsCQ subQuery);

    protected ImpasseExecutionBugsCB xcreateScalarConditionCB() {
        final ImpasseExecutionBugsCB cb = new ImpasseExecutionBugsCB();
        cb.xsetupForScalarCondition(this);
        return cb;
    }

    protected ImpasseExecutionBugsCB xcreateScalarConditionPartitionByCB() {
        final ImpasseExecutionBugsCB cb = new ImpasseExecutionBugsCB();
        cb.xsetupForScalarConditionPartitionBy(this);
        return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(final String function,
            final SubQuery<ImpasseExecutionBugsCB> subQuery,
            final String aliasName, final DerivedReferrerOption option) {
        assertObjectNotNull("subQuery<ImpasseExecutionBugsCB>", subQuery);
        final ImpasseExecutionBugsCB cb = new ImpasseExecutionBugsCB();
        cb.xsetupForDerivedReferrer(this);
        subQuery.query(cb);
        final String subQueryPropertyName = keepSpecifyMyselfDerived(cb.query()); // for saving query-value.
        registerSpecifyMyselfDerived(function, cb.query(), "id", "id",
                subQueryPropertyName, "myselfDerived", aliasName, option);
    }

    public abstract String keepSpecifyMyselfDerived(
            ImpasseExecutionBugsCQ subQuery);

    /**
     * Prepare for (Query)MyselfDerived (SubQuery).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<ImpasseExecutionBugsCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived();
    }

    protected HpQDRFunction<ImpasseExecutionBugsCB> xcreateQDRFunctionMyselfDerived() {
        return new HpQDRFunction<ImpasseExecutionBugsCB>(
                new HpQDRSetupper<ImpasseExecutionBugsCB>() {
                    @Override
                    public void setup(final String function,
                            final SubQuery<ImpasseExecutionBugsCB> subQuery,
                            final String operand, final Object value,
                            final DerivedReferrerOption option) {
                        xqderiveMyselfDerived(function, subQuery, operand,
                                value, option);
                    }
                });
    }

    public void xqderiveMyselfDerived(final String function,
            final SubQuery<ImpasseExecutionBugsCB> subQuery,
            final String operand, final Object value,
            final DerivedReferrerOption option) {
        assertObjectNotNull("subQuery<ImpasseExecutionBugsCB>", subQuery);
        final ImpasseExecutionBugsCB cb = new ImpasseExecutionBugsCB();
        cb.xsetupForDerivedReferrer(this);
        subQuery.query(cb);
        final String subQueryPropertyName = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        final String parameterPropertyName = keepQueryMyselfDerivedParameter(value);
        registerQueryMyselfDerived(function, cb.query(), "id", "id",
                subQueryPropertyName, "myselfDerived", operand, value,
                parameterPropertyName, option);
    }

    public abstract String keepQueryMyselfDerived(
            ImpasseExecutionBugsCQ subQuery);

    public abstract String keepQueryMyselfDerivedParameter(Object parameterValue);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (SubQuery).
     * @param subQuery The implementation of sub query. (NotNull)
     */
    public void myselfExists(final SubQuery<ImpasseExecutionBugsCB> subQuery) {
        assertObjectNotNull("subQuery<ImpasseExecutionBugsCB>", subQuery);
        final ImpasseExecutionBugsCB cb = new ImpasseExecutionBugsCB();
        cb.xsetupForMyselfExists(this);
        subQuery.query(cb);
        final String subQueryPropertyName = keepMyselfExists(cb.query()); // for saving query-value.
        registerMyselfExists(cb.query(), subQueryPropertyName);
    }

    public abstract String keepMyselfExists(ImpasseExecutionBugsCQ subQuery);

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    /**
     * Prepare for MyselfInScope (SubQuery).
     * @param subQuery The implementation of sub query. (NotNull)
     */
    public void myselfInScope(final SubQuery<ImpasseExecutionBugsCB> subQuery) {
        assertObjectNotNull("subQuery<ImpasseExecutionBugsCB>", subQuery);
        final ImpasseExecutionBugsCB cb = new ImpasseExecutionBugsCB();
        cb.xsetupForMyselfInScope(this);
        subQuery.query(cb);
        final String subQueryPropertyName = keepMyselfInScope(cb.query()); // for saving query-value.
        registerMyselfInScope(cb.query(), subQueryPropertyName);
    }

    public abstract String keepMyselfInScope(ImpasseExecutionBugsCQ subQuery);

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabCB() {
        return ImpasseExecutionBugsCB.class.getName();
    }

    protected String xabCQ() {
        return ImpasseExecutionBugsCQ.class.getName();
    }

    protected String xabLSO() {
        return LikeSearchOption.class.getName();
    }

    protected String xabSSQS() {
        return HpSSQSetupper.class.getName();
    }
}
