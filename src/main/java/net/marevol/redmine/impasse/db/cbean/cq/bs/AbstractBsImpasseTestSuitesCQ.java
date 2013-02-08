package net.marevol.redmine.impasse.db.cbean.cq.bs;

import java.util.Collection;

import net.marevol.redmine.impasse.db.allcommon.DBMetaInstanceHandler;
import net.marevol.redmine.impasse.db.cbean.ImpasseTestSuitesCB;
import net.marevol.redmine.impasse.db.cbean.cq.ImpasseTestSuitesCQ;

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
 * The abstract condition-query of impasse_test_suites.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsImpasseTestSuitesCQ extends
        AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsImpasseTestSuitesCQ(final ConditionQuery childQuery,
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
        return "impasse_test_suites";
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
     * details: {TEXT(65535)}
     * @param details The value of details as equal.
     */
    public void setDetails_Equal(final String details) {
        doSetDetails_Equal(fRES(details));
    }

    protected void doSetDetails_Equal(final String details) {
        regDetails(CK_EQ, details);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * details: {TEXT(65535)}
     * @param details The value of details as notEqual.
     */
    public void setDetails_NotEqual(final String details) {
        doSetDetails_NotEqual(fRES(details));
    }

    protected void doSetDetails_NotEqual(final String details) {
        regDetails(CK_NES, details);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * details: {TEXT(65535)}
     * @param details The value of details as greaterThan.
     */
    public void setDetails_GreaterThan(final String details) {
        regDetails(CK_GT, fRES(details));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * details: {TEXT(65535)}
     * @param details The value of details as lessThan.
     */
    public void setDetails_LessThan(final String details) {
        regDetails(CK_LT, fRES(details));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * details: {TEXT(65535)}
     * @param details The value of details as greaterEqual.
     */
    public void setDetails_GreaterEqual(final String details) {
        regDetails(CK_GE, fRES(details));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * details: {TEXT(65535)}
     * @param details The value of details as lessEqual.
     */
    public void setDetails_LessEqual(final String details) {
        regDetails(CK_LE, fRES(details));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * details: {TEXT(65535)}
     * @param detailsList The collection of details as inScope.
     */
    public void setDetails_InScope(final Collection<String> detailsList) {
        doSetDetails_InScope(detailsList);
    }

    public void doSetDetails_InScope(final Collection<String> detailsList) {
        regINS(CK_INS, cTL(detailsList), getCValueDetails(), "details");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * details: {TEXT(65535)}
     * @param detailsList The collection of details as notInScope.
     */
    public void setDetails_NotInScope(final Collection<String> detailsList) {
        doSetDetails_NotInScope(detailsList);
    }

    public void doSetDetails_NotInScope(final Collection<String> detailsList) {
        regINS(CK_NINS, cTL(detailsList), getCValueDetails(), "details");
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * details: {TEXT(65535)}
     * @param details The value of details as prefixSearch.
     */
    public void setDetails_PrefixSearch(final String details) {
        setDetails_LikeSearch(details, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * details: {TEXT(65535)}
     * @param details The value of details as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDetails_LikeSearch(final String details,
            final LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(details), getCValueDetails(), "details",
                likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * details: {TEXT(65535)}
     * @param details The value of details as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDetails_NotLikeSearch(final String details,
            final LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(details), getCValueDetails(), "details",
                likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * details: {TEXT(65535)}
     */
    public void setDetails_IsNull() {
        regDetails(CK_ISN, DOBJ);
    }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br />
     * details: {TEXT(65535)}
     */
    public void setDetails_IsNullOrEmpty() {
        regDetails(CK_ISNOE, DOBJ);
    }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * details: {TEXT(65535)}
     */
    public void setDetails_IsNotNull() {
        regDetails(CK_ISNN, DOBJ);
    }

    protected void regDetails(final ConditionKey k, final Object v) {
        regQ(k, v, getCValueDetails(), "details");
    }

    abstract protected ConditionValue getCValueDetails();

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO = (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_Equal()</span>.max(new SubQuery&lt;ImpasseTestSuitesCB&gt;() {
     *     public void query(ImpasseTestSuitesCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<ImpasseTestSuitesCB> scalar_Equal() {
        return xcreateSSQFunction(CK_EQ.getOperand());
    }

    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO &lt;&gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_NotEqual()</span>.max(new SubQuery&lt;ImpasseTestSuitesCB&gt;() {
     *     public void query(ImpasseTestSuitesCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<ImpasseTestSuitesCB> scalar_NotEqual() {
        return xcreateSSQFunction(CK_NES.getOperand());
    }

    /**
     * Prepare ScalarCondition as greaterThan. <br />
     * {where FOO &gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_GreaterThan()</span>.max(new SubQuery&lt;ImpasseTestSuitesCB&gt;() {
     *     public void query(ImpasseTestSuitesCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<ImpasseTestSuitesCB> scalar_GreaterThan() {
        return xcreateSSQFunction(CK_GT.getOperand());
    }

    /**
     * Prepare ScalarCondition as lessThan. <br />
     * {where FOO &lt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_LessThan()</span>.max(new SubQuery&lt;ImpasseTestSuitesCB&gt;() {
     *     public void query(ImpasseTestSuitesCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<ImpasseTestSuitesCB> scalar_LessThan() {
        return xcreateSSQFunction(CK_LT.getOperand());
    }

    /**
     * Prepare ScalarCondition as greaterEqual. <br />
     * {where FOO &gt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_GreaterEqual()</span>.max(new SubQuery&lt;ImpasseTestSuitesCB&gt;() {
     *     public void query(ImpasseTestSuitesCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<ImpasseTestSuitesCB> scalar_GreaterEqual() {
        return xcreateSSQFunction(CK_GE.getOperand());
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br />
     * {where FOO &lt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_LessEqual()</span>.max(new SubQuery&lt;ImpasseTestSuitesCB&gt;() {
     *     public void query(ImpasseTestSuitesCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<ImpasseTestSuitesCB> scalar_LessEqual() {
        return xcreateSSQFunction(CK_LE.getOperand());
    }

    protected HpSSQFunction<ImpasseTestSuitesCB> xcreateSSQFunction(
            final String operand) {
        return new HpSSQFunction<ImpasseTestSuitesCB>(
                new HpSSQSetupper<ImpasseTestSuitesCB>() {
                    @Override
                    public void setup(final String function,
                            final SubQuery<ImpasseTestSuitesCB> subQuery,
                            final HpSSQOption<ImpasseTestSuitesCB> option) {
                        xscalarCondition(function, subQuery, operand, option);
                    }
                });
    }

    protected void xscalarCondition(final String function,
            final SubQuery<ImpasseTestSuitesCB> subQuery, final String operand,
            final HpSSQOption<ImpasseTestSuitesCB> option) {
        assertObjectNotNull("subQuery<ImpasseTestSuitesCB>", subQuery);
        final ImpasseTestSuitesCB cb = xcreateScalarConditionCB();
        subQuery.query(cb);
        final String subQueryPropertyName = keepScalarCondition(cb.query()); // for saving query-value
        option.setPartitionByCBean(xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(function, cb.query(), subQueryPropertyName,
                operand, option);
    }

    public abstract String keepScalarCondition(ImpasseTestSuitesCQ subQuery);

    protected ImpasseTestSuitesCB xcreateScalarConditionCB() {
        final ImpasseTestSuitesCB cb = new ImpasseTestSuitesCB();
        cb.xsetupForScalarCondition(this);
        return cb;
    }

    protected ImpasseTestSuitesCB xcreateScalarConditionPartitionByCB() {
        final ImpasseTestSuitesCB cb = new ImpasseTestSuitesCB();
        cb.xsetupForScalarConditionPartitionBy(this);
        return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(final String function,
            final SubQuery<ImpasseTestSuitesCB> subQuery,
            final String aliasName, final DerivedReferrerOption option) {
        assertObjectNotNull("subQuery<ImpasseTestSuitesCB>", subQuery);
        final ImpasseTestSuitesCB cb = new ImpasseTestSuitesCB();
        cb.xsetupForDerivedReferrer(this);
        subQuery.query(cb);
        final String subQueryPropertyName = keepSpecifyMyselfDerived(cb.query()); // for saving query-value.
        registerSpecifyMyselfDerived(function, cb.query(), "id", "id",
                subQueryPropertyName, "myselfDerived", aliasName, option);
    }

    public abstract String keepSpecifyMyselfDerived(ImpasseTestSuitesCQ subQuery);

    /**
     * Prepare for (Query)MyselfDerived (SubQuery).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<ImpasseTestSuitesCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived();
    }

    protected HpQDRFunction<ImpasseTestSuitesCB> xcreateQDRFunctionMyselfDerived() {
        return new HpQDRFunction<ImpasseTestSuitesCB>(
                new HpQDRSetupper<ImpasseTestSuitesCB>() {
                    @Override
                    public void setup(final String function,
                            final SubQuery<ImpasseTestSuitesCB> subQuery,
                            final String operand, final Object value,
                            final DerivedReferrerOption option) {
                        xqderiveMyselfDerived(function, subQuery, operand,
                                value, option);
                    }
                });
    }

    public void xqderiveMyselfDerived(final String function,
            final SubQuery<ImpasseTestSuitesCB> subQuery, final String operand,
            final Object value, final DerivedReferrerOption option) {
        assertObjectNotNull("subQuery<ImpasseTestSuitesCB>", subQuery);
        final ImpasseTestSuitesCB cb = new ImpasseTestSuitesCB();
        cb.xsetupForDerivedReferrer(this);
        subQuery.query(cb);
        final String subQueryPropertyName = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        final String parameterPropertyName = keepQueryMyselfDerivedParameter(value);
        registerQueryMyselfDerived(function, cb.query(), "id", "id",
                subQueryPropertyName, "myselfDerived", operand, value,
                parameterPropertyName, option);
    }

    public abstract String keepQueryMyselfDerived(ImpasseTestSuitesCQ subQuery);

    public abstract String keepQueryMyselfDerivedParameter(Object parameterValue);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (SubQuery).
     * @param subQuery The implementation of sub query. (NotNull)
     */
    public void myselfExists(final SubQuery<ImpasseTestSuitesCB> subQuery) {
        assertObjectNotNull("subQuery<ImpasseTestSuitesCB>", subQuery);
        final ImpasseTestSuitesCB cb = new ImpasseTestSuitesCB();
        cb.xsetupForMyselfExists(this);
        subQuery.query(cb);
        final String subQueryPropertyName = keepMyselfExists(cb.query()); // for saving query-value.
        registerMyselfExists(cb.query(), subQueryPropertyName);
    }

    public abstract String keepMyselfExists(ImpasseTestSuitesCQ subQuery);

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    /**
     * Prepare for MyselfInScope (SubQuery).
     * @param subQuery The implementation of sub query. (NotNull)
     */
    public void myselfInScope(final SubQuery<ImpasseTestSuitesCB> subQuery) {
        assertObjectNotNull("subQuery<ImpasseTestSuitesCB>", subQuery);
        final ImpasseTestSuitesCB cb = new ImpasseTestSuitesCB();
        cb.xsetupForMyselfInScope(this);
        subQuery.query(cb);
        final String subQueryPropertyName = keepMyselfInScope(cb.query()); // for saving query-value.
        registerMyselfInScope(cb.query(), subQueryPropertyName);
    }

    public abstract String keepMyselfInScope(ImpasseTestSuitesCQ subQuery);

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use TestLinkImport')
    protected String xabCB() {
        return ImpasseTestSuitesCB.class.getName();
    }

    protected String xabCQ() {
        return ImpasseTestSuitesCQ.class.getName();
    }

    protected String xabLSO() {
        return LikeSearchOption.class.getName();
    }

    protected String xabSSQS() {
        return HpSSQSetupper.class.getName();
    }
}
