package net.marevol.redmine.impasse.db.cbean.cq.bs;

import java.util.Collection;

import net.marevol.redmine.impasse.db.allcommon.DBMetaInstanceHandler;
import net.marevol.redmine.impasse.db.cbean.ImpasseRequirementIssuesCB;
import net.marevol.redmine.impasse.db.cbean.cq.ImpasseRequirementIssuesCQ;

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
 * The abstract condition-query of impasse_requirement_issues.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsImpasseRequirementIssuesCQ extends
        AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsImpasseRequirementIssuesCQ(
            final ConditionQuery childQuery, final SqlClause sqlClause,
            final String aliasName, final int nestLevel) {
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
        return "impasse_requirement_issues";
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
     * issue_id: {NotNull, INT(10)}
     * @param issueId The value of issueId as equal.
     */
    public void setIssueId_Equal(final Integer issueId) {
        doSetIssueId_Equal(issueId);
    }

    protected void doSetIssueId_Equal(final Integer issueId) {
        regIssueId(CK_EQ, issueId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * issue_id: {NotNull, INT(10)}
     * @param issueId The value of issueId as notEqual.
     */
    public void setIssueId_NotEqual(final Integer issueId) {
        doSetIssueId_NotEqual(issueId);
    }

    protected void doSetIssueId_NotEqual(final Integer issueId) {
        regIssueId(CK_NES, issueId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * issue_id: {NotNull, INT(10)}
     * @param issueId The value of issueId as greaterThan.
     */
    public void setIssueId_GreaterThan(final Integer issueId) {
        regIssueId(CK_GT, issueId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * issue_id: {NotNull, INT(10)}
     * @param issueId The value of issueId as lessThan.
     */
    public void setIssueId_LessThan(final Integer issueId) {
        regIssueId(CK_LT, issueId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * issue_id: {NotNull, INT(10)}
     * @param issueId The value of issueId as greaterEqual.
     */
    public void setIssueId_GreaterEqual(final Integer issueId) {
        regIssueId(CK_GE, issueId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * issue_id: {NotNull, INT(10)}
     * @param issueId The value of issueId as lessEqual.
     */
    public void setIssueId_LessEqual(final Integer issueId) {
        regIssueId(CK_LE, issueId);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * issue_id: {NotNull, INT(10)}
     * @param minNumber The min number of issueId. (NullAllowed)
     * @param maxNumber The max number of issueId. (NullAllowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setIssueId_RangeOf(final Integer minNumber,
            final Integer maxNumber, final RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueIssueId(), "issue_id",
                rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * issue_id: {NotNull, INT(10)}
     * @param issueIdList The collection of issueId as inScope.
     */
    public void setIssueId_InScope(final Collection<Integer> issueIdList) {
        doSetIssueId_InScope(issueIdList);
    }

    protected void doSetIssueId_InScope(final Collection<Integer> issueIdList) {
        regINS(CK_INS, cTL(issueIdList), getCValueIssueId(), "issue_id");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * issue_id: {NotNull, INT(10)}
     * @param issueIdList The collection of issueId as notInScope.
     */
    public void setIssueId_NotInScope(final Collection<Integer> issueIdList) {
        doSetIssueId_NotInScope(issueIdList);
    }

    protected void doSetIssueId_NotInScope(final Collection<Integer> issueIdList) {
        regINS(CK_NINS, cTL(issueIdList), getCValueIssueId(), "issue_id");
    }

    protected void regIssueId(final ConditionKey k, final Object v) {
        regQ(k, v, getCValueIssueId(), "issue_id");
    }

    abstract protected ConditionValue getCValueIssueId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * num_of_cases: {INT(10), default=[0]}
     * @param numOfCases The value of numOfCases as equal.
     */
    public void setNumOfCases_Equal(final Integer numOfCases) {
        doSetNumOfCases_Equal(numOfCases);
    }

    protected void doSetNumOfCases_Equal(final Integer numOfCases) {
        regNumOfCases(CK_EQ, numOfCases);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * num_of_cases: {INT(10), default=[0]}
     * @param numOfCases The value of numOfCases as notEqual.
     */
    public void setNumOfCases_NotEqual(final Integer numOfCases) {
        doSetNumOfCases_NotEqual(numOfCases);
    }

    protected void doSetNumOfCases_NotEqual(final Integer numOfCases) {
        regNumOfCases(CK_NES, numOfCases);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * num_of_cases: {INT(10), default=[0]}
     * @param numOfCases The value of numOfCases as greaterThan.
     */
    public void setNumOfCases_GreaterThan(final Integer numOfCases) {
        regNumOfCases(CK_GT, numOfCases);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * num_of_cases: {INT(10), default=[0]}
     * @param numOfCases The value of numOfCases as lessThan.
     */
    public void setNumOfCases_LessThan(final Integer numOfCases) {
        regNumOfCases(CK_LT, numOfCases);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * num_of_cases: {INT(10), default=[0]}
     * @param numOfCases The value of numOfCases as greaterEqual.
     */
    public void setNumOfCases_GreaterEqual(final Integer numOfCases) {
        regNumOfCases(CK_GE, numOfCases);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * num_of_cases: {INT(10), default=[0]}
     * @param numOfCases The value of numOfCases as lessEqual.
     */
    public void setNumOfCases_LessEqual(final Integer numOfCases) {
        regNumOfCases(CK_LE, numOfCases);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * num_of_cases: {INT(10), default=[0]}
     * @param minNumber The min number of numOfCases. (NullAllowed)
     * @param maxNumber The max number of numOfCases. (NullAllowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setNumOfCases_RangeOf(final Integer minNumber,
            final Integer maxNumber, final RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueNumOfCases(), "num_of_cases",
                rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * num_of_cases: {INT(10), default=[0]}
     * @param numOfCasesList The collection of numOfCases as inScope.
     */
    public void setNumOfCases_InScope(final Collection<Integer> numOfCasesList) {
        doSetNumOfCases_InScope(numOfCasesList);
    }

    protected void doSetNumOfCases_InScope(
            final Collection<Integer> numOfCasesList) {
        regINS(CK_INS, cTL(numOfCasesList), getCValueNumOfCases(),
                "num_of_cases");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * num_of_cases: {INT(10), default=[0]}
     * @param numOfCasesList The collection of numOfCases as notInScope.
     */
    public void setNumOfCases_NotInScope(
            final Collection<Integer> numOfCasesList) {
        doSetNumOfCases_NotInScope(numOfCasesList);
    }

    protected void doSetNumOfCases_NotInScope(
            final Collection<Integer> numOfCasesList) {
        regINS(CK_NINS, cTL(numOfCasesList), getCValueNumOfCases(),
                "num_of_cases");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * num_of_cases: {INT(10), default=[0]}
     */
    public void setNumOfCases_IsNull() {
        regNumOfCases(CK_ISN, DOBJ);
    }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * num_of_cases: {INT(10), default=[0]}
     */
    public void setNumOfCases_IsNotNull() {
        regNumOfCases(CK_ISNN, DOBJ);
    }

    protected void regNumOfCases(final ConditionKey k, final Object v) {
        regQ(k, v, getCValueNumOfCases(), "num_of_cases");
    }

    abstract protected ConditionValue getCValueNumOfCases();

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO = (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_Equal()</span>.max(new SubQuery&lt;ImpasseRequirementIssuesCB&gt;() {
     *     public void query(ImpasseRequirementIssuesCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<ImpasseRequirementIssuesCB> scalar_Equal() {
        return xcreateSSQFunction(CK_EQ.getOperand());
    }

    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO &lt;&gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_NotEqual()</span>.max(new SubQuery&lt;ImpasseRequirementIssuesCB&gt;() {
     *     public void query(ImpasseRequirementIssuesCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<ImpasseRequirementIssuesCB> scalar_NotEqual() {
        return xcreateSSQFunction(CK_NES.getOperand());
    }

    /**
     * Prepare ScalarCondition as greaterThan. <br />
     * {where FOO &gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_GreaterThan()</span>.max(new SubQuery&lt;ImpasseRequirementIssuesCB&gt;() {
     *     public void query(ImpasseRequirementIssuesCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<ImpasseRequirementIssuesCB> scalar_GreaterThan() {
        return xcreateSSQFunction(CK_GT.getOperand());
    }

    /**
     * Prepare ScalarCondition as lessThan. <br />
     * {where FOO &lt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_LessThan()</span>.max(new SubQuery&lt;ImpasseRequirementIssuesCB&gt;() {
     *     public void query(ImpasseRequirementIssuesCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<ImpasseRequirementIssuesCB> scalar_LessThan() {
        return xcreateSSQFunction(CK_LT.getOperand());
    }

    /**
     * Prepare ScalarCondition as greaterEqual. <br />
     * {where FOO &gt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_GreaterEqual()</span>.max(new SubQuery&lt;ImpasseRequirementIssuesCB&gt;() {
     *     public void query(ImpasseRequirementIssuesCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<ImpasseRequirementIssuesCB> scalar_GreaterEqual() {
        return xcreateSSQFunction(CK_GE.getOperand());
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br />
     * {where FOO &lt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_LessEqual()</span>.max(new SubQuery&lt;ImpasseRequirementIssuesCB&gt;() {
     *     public void query(ImpasseRequirementIssuesCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<ImpasseRequirementIssuesCB> scalar_LessEqual() {
        return xcreateSSQFunction(CK_LE.getOperand());
    }

    protected HpSSQFunction<ImpasseRequirementIssuesCB> xcreateSSQFunction(
            final String operand) {
        return new HpSSQFunction<ImpasseRequirementIssuesCB>(
                new HpSSQSetupper<ImpasseRequirementIssuesCB>() {
                    @Override
                    public void setup(
                            final String function,
                            final SubQuery<ImpasseRequirementIssuesCB> subQuery,
                            final HpSSQOption<ImpasseRequirementIssuesCB> option) {
                        xscalarCondition(function, subQuery, operand, option);
                    }
                });
    }

    protected void xscalarCondition(final String function,
            final SubQuery<ImpasseRequirementIssuesCB> subQuery,
            final String operand,
            final HpSSQOption<ImpasseRequirementIssuesCB> option) {
        assertObjectNotNull("subQuery<ImpasseRequirementIssuesCB>", subQuery);
        final ImpasseRequirementIssuesCB cb = xcreateScalarConditionCB();
        subQuery.query(cb);
        final String subQueryPropertyName = keepScalarCondition(cb.query()); // for saving query-value
        option.setPartitionByCBean(xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(function, cb.query(), subQueryPropertyName,
                operand, option);
    }

    public abstract String keepScalarCondition(
            ImpasseRequirementIssuesCQ subQuery);

    protected ImpasseRequirementIssuesCB xcreateScalarConditionCB() {
        final ImpasseRequirementIssuesCB cb = new ImpasseRequirementIssuesCB();
        cb.xsetupForScalarCondition(this);
        return cb;
    }

    protected ImpasseRequirementIssuesCB xcreateScalarConditionPartitionByCB() {
        final ImpasseRequirementIssuesCB cb = new ImpasseRequirementIssuesCB();
        cb.xsetupForScalarConditionPartitionBy(this);
        return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(final String function,
            final SubQuery<ImpasseRequirementIssuesCB> subQuery,
            final String aliasName, final DerivedReferrerOption option) {
        assertObjectNotNull("subQuery<ImpasseRequirementIssuesCB>", subQuery);
        final ImpasseRequirementIssuesCB cb = new ImpasseRequirementIssuesCB();
        cb.xsetupForDerivedReferrer(this);
        subQuery.query(cb);
        final String subQueryPropertyName = keepSpecifyMyselfDerived(cb.query()); // for saving query-value.
        registerSpecifyMyselfDerived(function, cb.query(), "id", "id",
                subQueryPropertyName, "myselfDerived", aliasName, option);
    }

    public abstract String keepSpecifyMyselfDerived(
            ImpasseRequirementIssuesCQ subQuery);

    /**
     * Prepare for (Query)MyselfDerived (SubQuery).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<ImpasseRequirementIssuesCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived();
    }

    protected HpQDRFunction<ImpasseRequirementIssuesCB> xcreateQDRFunctionMyselfDerived() {
        return new HpQDRFunction<ImpasseRequirementIssuesCB>(
                new HpQDRSetupper<ImpasseRequirementIssuesCB>() {
                    @Override
                    public void setup(
                            final String function,
                            final SubQuery<ImpasseRequirementIssuesCB> subQuery,
                            final String operand, final Object value,
                            final DerivedReferrerOption option) {
                        xqderiveMyselfDerived(function, subQuery, operand,
                                value, option);
                    }
                });
    }

    public void xqderiveMyselfDerived(final String function,
            final SubQuery<ImpasseRequirementIssuesCB> subQuery,
            final String operand, final Object value,
            final DerivedReferrerOption option) {
        assertObjectNotNull("subQuery<ImpasseRequirementIssuesCB>", subQuery);
        final ImpasseRequirementIssuesCB cb = new ImpasseRequirementIssuesCB();
        cb.xsetupForDerivedReferrer(this);
        subQuery.query(cb);
        final String subQueryPropertyName = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        final String parameterPropertyName = keepQueryMyselfDerivedParameter(value);
        registerQueryMyselfDerived(function, cb.query(), "id", "id",
                subQueryPropertyName, "myselfDerived", operand, value,
                parameterPropertyName, option);
    }

    public abstract String keepQueryMyselfDerived(
            ImpasseRequirementIssuesCQ subQuery);

    public abstract String keepQueryMyselfDerivedParameter(Object parameterValue);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (SubQuery).
     * @param subQuery The implementation of sub query. (NotNull)
     */
    public void myselfExists(final SubQuery<ImpasseRequirementIssuesCB> subQuery) {
        assertObjectNotNull("subQuery<ImpasseRequirementIssuesCB>", subQuery);
        final ImpasseRequirementIssuesCB cb = new ImpasseRequirementIssuesCB();
        cb.xsetupForMyselfExists(this);
        subQuery.query(cb);
        final String subQueryPropertyName = keepMyselfExists(cb.query()); // for saving query-value.
        registerMyselfExists(cb.query(), subQueryPropertyName);
    }

    public abstract String keepMyselfExists(ImpasseRequirementIssuesCQ subQuery);

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    /**
     * Prepare for MyselfInScope (SubQuery).
     * @param subQuery The implementation of sub query. (NotNull)
     */
    public void myselfInScope(
            final SubQuery<ImpasseRequirementIssuesCB> subQuery) {
        assertObjectNotNull("subQuery<ImpasseRequirementIssuesCB>", subQuery);
        final ImpasseRequirementIssuesCB cb = new ImpasseRequirementIssuesCB();
        cb.xsetupForMyselfInScope(this);
        subQuery.query(cb);
        final String subQueryPropertyName = keepMyselfInScope(cb.query()); // for saving query-value.
        registerMyselfInScope(cb.query(), subQueryPropertyName);
    }

    public abstract String keepMyselfInScope(ImpasseRequirementIssuesCQ subQuery);

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use TestLinkImport')
    protected String xabCB() {
        return ImpasseRequirementIssuesCB.class.getName();
    }

    protected String xabCQ() {
        return ImpasseRequirementIssuesCQ.class.getName();
    }

    protected String xabLSO() {
        return LikeSearchOption.class.getName();
    }

    protected String xabSSQS() {
        return HpSSQSetupper.class.getName();
    }
}
