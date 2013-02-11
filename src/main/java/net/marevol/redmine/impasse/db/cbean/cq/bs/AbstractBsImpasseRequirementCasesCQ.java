package net.marevol.redmine.impasse.db.cbean.cq.bs;

import java.util.Collection;

import net.marevol.redmine.impasse.db.allcommon.DBMetaInstanceHandler;
import net.marevol.redmine.impasse.db.cbean.ImpasseRequirementCasesCB;
import net.marevol.redmine.impasse.db.cbean.cq.ImpasseRequirementCasesCQ;

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
 * The abstract condition-query of impasse_requirement_cases.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsImpasseRequirementCasesCQ extends
        AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsImpasseRequirementCasesCQ(final ConditionQuery childQuery,
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
        return "impasse_requirement_cases";
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
     * requirement_id: {NotNull, INT(10)}
     * @param requirementId The value of requirementId as equal.
     */
    public void setRequirementId_Equal(final Integer requirementId) {
        doSetRequirementId_Equal(requirementId);
    }

    protected void doSetRequirementId_Equal(final Integer requirementId) {
        regRequirementId(CK_EQ, requirementId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * requirement_id: {NotNull, INT(10)}
     * @param requirementId The value of requirementId as notEqual.
     */
    public void setRequirementId_NotEqual(final Integer requirementId) {
        doSetRequirementId_NotEqual(requirementId);
    }

    protected void doSetRequirementId_NotEqual(final Integer requirementId) {
        regRequirementId(CK_NES, requirementId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * requirement_id: {NotNull, INT(10)}
     * @param requirementId The value of requirementId as greaterThan.
     */
    public void setRequirementId_GreaterThan(final Integer requirementId) {
        regRequirementId(CK_GT, requirementId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * requirement_id: {NotNull, INT(10)}
     * @param requirementId The value of requirementId as lessThan.
     */
    public void setRequirementId_LessThan(final Integer requirementId) {
        regRequirementId(CK_LT, requirementId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * requirement_id: {NotNull, INT(10)}
     * @param requirementId The value of requirementId as greaterEqual.
     */
    public void setRequirementId_GreaterEqual(final Integer requirementId) {
        regRequirementId(CK_GE, requirementId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * requirement_id: {NotNull, INT(10)}
     * @param requirementId The value of requirementId as lessEqual.
     */
    public void setRequirementId_LessEqual(final Integer requirementId) {
        regRequirementId(CK_LE, requirementId);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * requirement_id: {NotNull, INT(10)}
     * @param minNumber The min number of requirementId. (NullAllowed)
     * @param maxNumber The max number of requirementId. (NullAllowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setRequirementId_RangeOf(final Integer minNumber,
            final Integer maxNumber, final RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueRequirementId(),
                "requirement_id", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * requirement_id: {NotNull, INT(10)}
     * @param requirementIdList The collection of requirementId as inScope.
     */
    public void setRequirementId_InScope(
            final Collection<Integer> requirementIdList) {
        doSetRequirementId_InScope(requirementIdList);
    }

    protected void doSetRequirementId_InScope(
            final Collection<Integer> requirementIdList) {
        regINS(CK_INS, cTL(requirementIdList), getCValueRequirementId(),
                "requirement_id");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * requirement_id: {NotNull, INT(10)}
     * @param requirementIdList The collection of requirementId as notInScope.
     */
    public void setRequirementId_NotInScope(
            final Collection<Integer> requirementIdList) {
        doSetRequirementId_NotInScope(requirementIdList);
    }

    protected void doSetRequirementId_NotInScope(
            final Collection<Integer> requirementIdList) {
        regINS(CK_NINS, cTL(requirementIdList), getCValueRequirementId(),
                "requirement_id");
    }

    protected void regRequirementId(final ConditionKey k, final Object v) {
        regQ(k, v, getCValueRequirementId(), "requirement_id");
    }

    abstract protected ConditionValue getCValueRequirementId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * test_case_id: {NotNull, INT(10)}
     * @param testCaseId The value of testCaseId as equal.
     */
    public void setTestCaseId_Equal(final Integer testCaseId) {
        doSetTestCaseId_Equal(testCaseId);
    }

    protected void doSetTestCaseId_Equal(final Integer testCaseId) {
        regTestCaseId(CK_EQ, testCaseId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * test_case_id: {NotNull, INT(10)}
     * @param testCaseId The value of testCaseId as notEqual.
     */
    public void setTestCaseId_NotEqual(final Integer testCaseId) {
        doSetTestCaseId_NotEqual(testCaseId);
    }

    protected void doSetTestCaseId_NotEqual(final Integer testCaseId) {
        regTestCaseId(CK_NES, testCaseId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * test_case_id: {NotNull, INT(10)}
     * @param testCaseId The value of testCaseId as greaterThan.
     */
    public void setTestCaseId_GreaterThan(final Integer testCaseId) {
        regTestCaseId(CK_GT, testCaseId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * test_case_id: {NotNull, INT(10)}
     * @param testCaseId The value of testCaseId as lessThan.
     */
    public void setTestCaseId_LessThan(final Integer testCaseId) {
        regTestCaseId(CK_LT, testCaseId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * test_case_id: {NotNull, INT(10)}
     * @param testCaseId The value of testCaseId as greaterEqual.
     */
    public void setTestCaseId_GreaterEqual(final Integer testCaseId) {
        regTestCaseId(CK_GE, testCaseId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * test_case_id: {NotNull, INT(10)}
     * @param testCaseId The value of testCaseId as lessEqual.
     */
    public void setTestCaseId_LessEqual(final Integer testCaseId) {
        regTestCaseId(CK_LE, testCaseId);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * test_case_id: {NotNull, INT(10)}
     * @param minNumber The min number of testCaseId. (NullAllowed)
     * @param maxNumber The max number of testCaseId. (NullAllowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setTestCaseId_RangeOf(final Integer minNumber,
            final Integer maxNumber, final RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueTestCaseId(), "test_case_id",
                rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * test_case_id: {NotNull, INT(10)}
     * @param testCaseIdList The collection of testCaseId as inScope.
     */
    public void setTestCaseId_InScope(final Collection<Integer> testCaseIdList) {
        doSetTestCaseId_InScope(testCaseIdList);
    }

    protected void doSetTestCaseId_InScope(
            final Collection<Integer> testCaseIdList) {
        regINS(CK_INS, cTL(testCaseIdList), getCValueTestCaseId(),
                "test_case_id");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * test_case_id: {NotNull, INT(10)}
     * @param testCaseIdList The collection of testCaseId as notInScope.
     */
    public void setTestCaseId_NotInScope(
            final Collection<Integer> testCaseIdList) {
        doSetTestCaseId_NotInScope(testCaseIdList);
    }

    protected void doSetTestCaseId_NotInScope(
            final Collection<Integer> testCaseIdList) {
        regINS(CK_NINS, cTL(testCaseIdList), getCValueTestCaseId(),
                "test_case_id");
    }

    protected void regTestCaseId(final ConditionKey k, final Object v) {
        regQ(k, v, getCValueTestCaseId(), "test_case_id");
    }

    abstract protected ConditionValue getCValueTestCaseId();

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO = (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_Equal()</span>.max(new SubQuery&lt;ImpasseRequirementCasesCB&gt;() {
     *     public void query(ImpasseRequirementCasesCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<ImpasseRequirementCasesCB> scalar_Equal() {
        return xcreateSSQFunction(CK_EQ.getOperand());
    }

    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO &lt;&gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_NotEqual()</span>.max(new SubQuery&lt;ImpasseRequirementCasesCB&gt;() {
     *     public void query(ImpasseRequirementCasesCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<ImpasseRequirementCasesCB> scalar_NotEqual() {
        return xcreateSSQFunction(CK_NES.getOperand());
    }

    /**
     * Prepare ScalarCondition as greaterThan. <br />
     * {where FOO &gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_GreaterThan()</span>.max(new SubQuery&lt;ImpasseRequirementCasesCB&gt;() {
     *     public void query(ImpasseRequirementCasesCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<ImpasseRequirementCasesCB> scalar_GreaterThan() {
        return xcreateSSQFunction(CK_GT.getOperand());
    }

    /**
     * Prepare ScalarCondition as lessThan. <br />
     * {where FOO &lt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_LessThan()</span>.max(new SubQuery&lt;ImpasseRequirementCasesCB&gt;() {
     *     public void query(ImpasseRequirementCasesCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<ImpasseRequirementCasesCB> scalar_LessThan() {
        return xcreateSSQFunction(CK_LT.getOperand());
    }

    /**
     * Prepare ScalarCondition as greaterEqual. <br />
     * {where FOO &gt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_GreaterEqual()</span>.max(new SubQuery&lt;ImpasseRequirementCasesCB&gt;() {
     *     public void query(ImpasseRequirementCasesCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<ImpasseRequirementCasesCB> scalar_GreaterEqual() {
        return xcreateSSQFunction(CK_GE.getOperand());
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br />
     * {where FOO &lt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_LessEqual()</span>.max(new SubQuery&lt;ImpasseRequirementCasesCB&gt;() {
     *     public void query(ImpasseRequirementCasesCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<ImpasseRequirementCasesCB> scalar_LessEqual() {
        return xcreateSSQFunction(CK_LE.getOperand());
    }

    protected HpSSQFunction<ImpasseRequirementCasesCB> xcreateSSQFunction(
            final String operand) {
        return new HpSSQFunction<ImpasseRequirementCasesCB>(
                new HpSSQSetupper<ImpasseRequirementCasesCB>() {
                    @Override
                    public void setup(final String function,
                            final SubQuery<ImpasseRequirementCasesCB> subQuery,
                            final HpSSQOption<ImpasseRequirementCasesCB> option) {
                        xscalarCondition(function, subQuery, operand, option);
                    }
                });
    }

    protected void xscalarCondition(final String function,
            final SubQuery<ImpasseRequirementCasesCB> subQuery,
            final String operand,
            final HpSSQOption<ImpasseRequirementCasesCB> option) {
        assertObjectNotNull("subQuery<ImpasseRequirementCasesCB>", subQuery);
        final ImpasseRequirementCasesCB cb = xcreateScalarConditionCB();
        subQuery.query(cb);
        final String subQueryPropertyName = keepScalarCondition(cb.query()); // for saving query-value
        option.setPartitionByCBean(xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(function, cb.query(), subQueryPropertyName,
                operand, option);
    }

    public abstract String keepScalarCondition(
            ImpasseRequirementCasesCQ subQuery);

    protected ImpasseRequirementCasesCB xcreateScalarConditionCB() {
        final ImpasseRequirementCasesCB cb = new ImpasseRequirementCasesCB();
        cb.xsetupForScalarCondition(this);
        return cb;
    }

    protected ImpasseRequirementCasesCB xcreateScalarConditionPartitionByCB() {
        final ImpasseRequirementCasesCB cb = new ImpasseRequirementCasesCB();
        cb.xsetupForScalarConditionPartitionBy(this);
        return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(final String function,
            final SubQuery<ImpasseRequirementCasesCB> subQuery,
            final String aliasName, final DerivedReferrerOption option) {
        assertObjectNotNull("subQuery<ImpasseRequirementCasesCB>", subQuery);
        final ImpasseRequirementCasesCB cb = new ImpasseRequirementCasesCB();
        cb.xsetupForDerivedReferrer(this);
        subQuery.query(cb);
        final String subQueryPropertyName = keepSpecifyMyselfDerived(cb.query()); // for saving query-value.
        registerSpecifyMyselfDerived(function, cb.query(), "id", "id",
                subQueryPropertyName, "myselfDerived", aliasName, option);
    }

    public abstract String keepSpecifyMyselfDerived(
            ImpasseRequirementCasesCQ subQuery);

    /**
     * Prepare for (Query)MyselfDerived (SubQuery).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<ImpasseRequirementCasesCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived();
    }

    protected HpQDRFunction<ImpasseRequirementCasesCB> xcreateQDRFunctionMyselfDerived() {
        return new HpQDRFunction<ImpasseRequirementCasesCB>(
                new HpQDRSetupper<ImpasseRequirementCasesCB>() {
                    @Override
                    public void setup(final String function,
                            final SubQuery<ImpasseRequirementCasesCB> subQuery,
                            final String operand, final Object value,
                            final DerivedReferrerOption option) {
                        xqderiveMyselfDerived(function, subQuery, operand,
                                value, option);
                    }
                });
    }

    public void xqderiveMyselfDerived(final String function,
            final SubQuery<ImpasseRequirementCasesCB> subQuery,
            final String operand, final Object value,
            final DerivedReferrerOption option) {
        assertObjectNotNull("subQuery<ImpasseRequirementCasesCB>", subQuery);
        final ImpasseRequirementCasesCB cb = new ImpasseRequirementCasesCB();
        cb.xsetupForDerivedReferrer(this);
        subQuery.query(cb);
        final String subQueryPropertyName = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        final String parameterPropertyName = keepQueryMyselfDerivedParameter(value);
        registerQueryMyselfDerived(function, cb.query(), "id", "id",
                subQueryPropertyName, "myselfDerived", operand, value,
                parameterPropertyName, option);
    }

    public abstract String keepQueryMyselfDerived(
            ImpasseRequirementCasesCQ subQuery);

    public abstract String keepQueryMyselfDerivedParameter(Object parameterValue);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (SubQuery).
     * @param subQuery The implementation of sub query. (NotNull)
     */
    public void myselfExists(final SubQuery<ImpasseRequirementCasesCB> subQuery) {
        assertObjectNotNull("subQuery<ImpasseRequirementCasesCB>", subQuery);
        final ImpasseRequirementCasesCB cb = new ImpasseRequirementCasesCB();
        cb.xsetupForMyselfExists(this);
        subQuery.query(cb);
        final String subQueryPropertyName = keepMyselfExists(cb.query()); // for saving query-value.
        registerMyselfExists(cb.query(), subQueryPropertyName);
    }

    public abstract String keepMyselfExists(ImpasseRequirementCasesCQ subQuery);

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    /**
     * Prepare for MyselfInScope (SubQuery).
     * @param subQuery The implementation of sub query. (NotNull)
     */
    public void myselfInScope(final SubQuery<ImpasseRequirementCasesCB> subQuery) {
        assertObjectNotNull("subQuery<ImpasseRequirementCasesCB>", subQuery);
        final ImpasseRequirementCasesCB cb = new ImpasseRequirementCasesCB();
        cb.xsetupForMyselfInScope(this);
        subQuery.query(cb);
        final String subQueryPropertyName = keepMyselfInScope(cb.query()); // for saving query-value.
        registerMyselfInScope(cb.query(), subQueryPropertyName);
    }

    public abstract String keepMyselfInScope(ImpasseRequirementCasesCQ subQuery);

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabCB() {
        return ImpasseRequirementCasesCB.class.getName();
    }

    protected String xabCQ() {
        return ImpasseRequirementCasesCQ.class.getName();
    }

    protected String xabLSO() {
        return LikeSearchOption.class.getName();
    }

    protected String xabSSQS() {
        return HpSSQSetupper.class.getName();
    }
}
