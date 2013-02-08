package net.marevol.redmine.impasse.db.cbean.cq.bs;

import java.util.Collection;

import net.marevol.redmine.impasse.db.allcommon.DBMetaInstanceHandler;
import net.marevol.redmine.impasse.db.cbean.ImpasseTestCasesCB;
import net.marevol.redmine.impasse.db.cbean.cq.ImpasseTestCasesCQ;

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
 * The abstract condition-query of impasse_test_cases.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsImpasseTestCasesCQ extends
        AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsImpasseTestCasesCQ(final ConditionQuery childQuery,
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
        return "impasse_test_cases";
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
     * summary: {TEXT(65535)}
     * @param summary The value of summary as equal.
     */
    public void setSummary_Equal(final String summary) {
        doSetSummary_Equal(fRES(summary));
    }

    protected void doSetSummary_Equal(final String summary) {
        regSummary(CK_EQ, summary);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * summary: {TEXT(65535)}
     * @param summary The value of summary as notEqual.
     */
    public void setSummary_NotEqual(final String summary) {
        doSetSummary_NotEqual(fRES(summary));
    }

    protected void doSetSummary_NotEqual(final String summary) {
        regSummary(CK_NES, summary);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * summary: {TEXT(65535)}
     * @param summary The value of summary as greaterThan.
     */
    public void setSummary_GreaterThan(final String summary) {
        regSummary(CK_GT, fRES(summary));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * summary: {TEXT(65535)}
     * @param summary The value of summary as lessThan.
     */
    public void setSummary_LessThan(final String summary) {
        regSummary(CK_LT, fRES(summary));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * summary: {TEXT(65535)}
     * @param summary The value of summary as greaterEqual.
     */
    public void setSummary_GreaterEqual(final String summary) {
        regSummary(CK_GE, fRES(summary));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * summary: {TEXT(65535)}
     * @param summary The value of summary as lessEqual.
     */
    public void setSummary_LessEqual(final String summary) {
        regSummary(CK_LE, fRES(summary));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * summary: {TEXT(65535)}
     * @param summaryList The collection of summary as inScope.
     */
    public void setSummary_InScope(final Collection<String> summaryList) {
        doSetSummary_InScope(summaryList);
    }

    public void doSetSummary_InScope(final Collection<String> summaryList) {
        regINS(CK_INS, cTL(summaryList), getCValueSummary(), "summary");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * summary: {TEXT(65535)}
     * @param summaryList The collection of summary as notInScope.
     */
    public void setSummary_NotInScope(final Collection<String> summaryList) {
        doSetSummary_NotInScope(summaryList);
    }

    public void doSetSummary_NotInScope(final Collection<String> summaryList) {
        regINS(CK_NINS, cTL(summaryList), getCValueSummary(), "summary");
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * summary: {TEXT(65535)}
     * @param summary The value of summary as prefixSearch.
     */
    public void setSummary_PrefixSearch(final String summary) {
        setSummary_LikeSearch(summary, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * summary: {TEXT(65535)}
     * @param summary The value of summary as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSummary_LikeSearch(final String summary,
            final LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(summary), getCValueSummary(), "summary",
                likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * summary: {TEXT(65535)}
     * @param summary The value of summary as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSummary_NotLikeSearch(final String summary,
            final LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(summary), getCValueSummary(), "summary",
                likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * summary: {TEXT(65535)}
     */
    public void setSummary_IsNull() {
        regSummary(CK_ISN, DOBJ);
    }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br />
     * summary: {TEXT(65535)}
     */
    public void setSummary_IsNullOrEmpty() {
        regSummary(CK_ISNOE, DOBJ);
    }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * summary: {TEXT(65535)}
     */
    public void setSummary_IsNotNull() {
        regSummary(CK_ISNN, DOBJ);
    }

    protected void regSummary(final ConditionKey k, final Object v) {
        regQ(k, v, getCValueSummary(), "summary");
    }

    abstract protected ConditionValue getCValueSummary();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * preconditions: {TEXT(65535)}
     * @param preconditions The value of preconditions as equal.
     */
    public void setPreconditions_Equal(final String preconditions) {
        doSetPreconditions_Equal(fRES(preconditions));
    }

    protected void doSetPreconditions_Equal(final String preconditions) {
        regPreconditions(CK_EQ, preconditions);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * preconditions: {TEXT(65535)}
     * @param preconditions The value of preconditions as notEqual.
     */
    public void setPreconditions_NotEqual(final String preconditions) {
        doSetPreconditions_NotEqual(fRES(preconditions));
    }

    protected void doSetPreconditions_NotEqual(final String preconditions) {
        regPreconditions(CK_NES, preconditions);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * preconditions: {TEXT(65535)}
     * @param preconditions The value of preconditions as greaterThan.
     */
    public void setPreconditions_GreaterThan(final String preconditions) {
        regPreconditions(CK_GT, fRES(preconditions));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * preconditions: {TEXT(65535)}
     * @param preconditions The value of preconditions as lessThan.
     */
    public void setPreconditions_LessThan(final String preconditions) {
        regPreconditions(CK_LT, fRES(preconditions));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * preconditions: {TEXT(65535)}
     * @param preconditions The value of preconditions as greaterEqual.
     */
    public void setPreconditions_GreaterEqual(final String preconditions) {
        regPreconditions(CK_GE, fRES(preconditions));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * preconditions: {TEXT(65535)}
     * @param preconditions The value of preconditions as lessEqual.
     */
    public void setPreconditions_LessEqual(final String preconditions) {
        regPreconditions(CK_LE, fRES(preconditions));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * preconditions: {TEXT(65535)}
     * @param preconditionsList The collection of preconditions as inScope.
     */
    public void setPreconditions_InScope(
            final Collection<String> preconditionsList) {
        doSetPreconditions_InScope(preconditionsList);
    }

    public void doSetPreconditions_InScope(
            final Collection<String> preconditionsList) {
        regINS(CK_INS, cTL(preconditionsList), getCValuePreconditions(),
                "preconditions");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * preconditions: {TEXT(65535)}
     * @param preconditionsList The collection of preconditions as notInScope.
     */
    public void setPreconditions_NotInScope(
            final Collection<String> preconditionsList) {
        doSetPreconditions_NotInScope(preconditionsList);
    }

    public void doSetPreconditions_NotInScope(
            final Collection<String> preconditionsList) {
        regINS(CK_NINS, cTL(preconditionsList), getCValuePreconditions(),
                "preconditions");
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * preconditions: {TEXT(65535)}
     * @param preconditions The value of preconditions as prefixSearch.
     */
    public void setPreconditions_PrefixSearch(final String preconditions) {
        setPreconditions_LikeSearch(preconditions, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * preconditions: {TEXT(65535)}
     * @param preconditions The value of preconditions as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setPreconditions_LikeSearch(final String preconditions,
            final LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(preconditions), getCValuePreconditions(),
                "preconditions", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * preconditions: {TEXT(65535)}
     * @param preconditions The value of preconditions as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setPreconditions_NotLikeSearch(final String preconditions,
            final LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(preconditions), getCValuePreconditions(),
                "preconditions", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * preconditions: {TEXT(65535)}
     */
    public void setPreconditions_IsNull() {
        regPreconditions(CK_ISN, DOBJ);
    }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br />
     * preconditions: {TEXT(65535)}
     */
    public void setPreconditions_IsNullOrEmpty() {
        regPreconditions(CK_ISNOE, DOBJ);
    }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * preconditions: {TEXT(65535)}
     */
    public void setPreconditions_IsNotNull() {
        regPreconditions(CK_ISNN, DOBJ);
    }

    protected void regPreconditions(final ConditionKey k, final Object v) {
        regQ(k, v, getCValuePreconditions(), "preconditions");
    }

    abstract protected ConditionValue getCValuePreconditions();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * importance: {INT(10)}
     * @param importance The value of importance as equal.
     */
    public void setImportance_Equal(final Integer importance) {
        doSetImportance_Equal(importance);
    }

    protected void doSetImportance_Equal(final Integer importance) {
        regImportance(CK_EQ, importance);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * importance: {INT(10)}
     * @param importance The value of importance as notEqual.
     */
    public void setImportance_NotEqual(final Integer importance) {
        doSetImportance_NotEqual(importance);
    }

    protected void doSetImportance_NotEqual(final Integer importance) {
        regImportance(CK_NES, importance);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * importance: {INT(10)}
     * @param importance The value of importance as greaterThan.
     */
    public void setImportance_GreaterThan(final Integer importance) {
        regImportance(CK_GT, importance);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * importance: {INT(10)}
     * @param importance The value of importance as lessThan.
     */
    public void setImportance_LessThan(final Integer importance) {
        regImportance(CK_LT, importance);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * importance: {INT(10)}
     * @param importance The value of importance as greaterEqual.
     */
    public void setImportance_GreaterEqual(final Integer importance) {
        regImportance(CK_GE, importance);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * importance: {INT(10)}
     * @param importance The value of importance as lessEqual.
     */
    public void setImportance_LessEqual(final Integer importance) {
        regImportance(CK_LE, importance);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * importance: {INT(10)}
     * @param minNumber The min number of importance. (NullAllowed)
     * @param maxNumber The max number of importance. (NullAllowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setImportance_RangeOf(final Integer minNumber,
            final Integer maxNumber, final RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueImportance(), "importance",
                rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * importance: {INT(10)}
     * @param importanceList The collection of importance as inScope.
     */
    public void setImportance_InScope(final Collection<Integer> importanceList) {
        doSetImportance_InScope(importanceList);
    }

    protected void doSetImportance_InScope(
            final Collection<Integer> importanceList) {
        regINS(CK_INS, cTL(importanceList), getCValueImportance(), "importance");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * importance: {INT(10)}
     * @param importanceList The collection of importance as notInScope.
     */
    public void setImportance_NotInScope(
            final Collection<Integer> importanceList) {
        doSetImportance_NotInScope(importanceList);
    }

    protected void doSetImportance_NotInScope(
            final Collection<Integer> importanceList) {
        regINS(CK_NINS, cTL(importanceList), getCValueImportance(),
                "importance");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * importance: {INT(10)}
     */
    public void setImportance_IsNull() {
        regImportance(CK_ISN, DOBJ);
    }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * importance: {INT(10)}
     */
    public void setImportance_IsNotNull() {
        regImportance(CK_ISNN, DOBJ);
    }

    protected void regImportance(final ConditionKey k, final Object v) {
        regQ(k, v, getCValueImportance(), "importance");
    }

    abstract protected ConditionValue getCValueImportance();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * active: {BIT, default=[1]}
     * @param active The value of active as equal.
     */
    public void setActive_Equal(final Boolean active) {
        regActive(CK_EQ, active);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * active: {BIT, default=[1]}
     */
    public void setActive_IsNull() {
        regActive(CK_ISN, DOBJ);
    }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * active: {BIT, default=[1]}
     */
    public void setActive_IsNotNull() {
        regActive(CK_ISNN, DOBJ);
    }

    protected void regActive(final ConditionKey k, final Object v) {
        regQ(k, v, getCValueActive(), "active");
    }

    abstract protected ConditionValue getCValueActive();

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO = (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_Equal()</span>.max(new SubQuery&lt;ImpasseTestCasesCB&gt;() {
     *     public void query(ImpasseTestCasesCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<ImpasseTestCasesCB> scalar_Equal() {
        return xcreateSSQFunction(CK_EQ.getOperand());
    }

    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO &lt;&gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_NotEqual()</span>.max(new SubQuery&lt;ImpasseTestCasesCB&gt;() {
     *     public void query(ImpasseTestCasesCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<ImpasseTestCasesCB> scalar_NotEqual() {
        return xcreateSSQFunction(CK_NES.getOperand());
    }

    /**
     * Prepare ScalarCondition as greaterThan. <br />
     * {where FOO &gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_GreaterThan()</span>.max(new SubQuery&lt;ImpasseTestCasesCB&gt;() {
     *     public void query(ImpasseTestCasesCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<ImpasseTestCasesCB> scalar_GreaterThan() {
        return xcreateSSQFunction(CK_GT.getOperand());
    }

    /**
     * Prepare ScalarCondition as lessThan. <br />
     * {where FOO &lt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_LessThan()</span>.max(new SubQuery&lt;ImpasseTestCasesCB&gt;() {
     *     public void query(ImpasseTestCasesCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<ImpasseTestCasesCB> scalar_LessThan() {
        return xcreateSSQFunction(CK_LT.getOperand());
    }

    /**
     * Prepare ScalarCondition as greaterEqual. <br />
     * {where FOO &gt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_GreaterEqual()</span>.max(new SubQuery&lt;ImpasseTestCasesCB&gt;() {
     *     public void query(ImpasseTestCasesCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<ImpasseTestCasesCB> scalar_GreaterEqual() {
        return xcreateSSQFunction(CK_GE.getOperand());
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br />
     * {where FOO &lt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_LessEqual()</span>.max(new SubQuery&lt;ImpasseTestCasesCB&gt;() {
     *     public void query(ImpasseTestCasesCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<ImpasseTestCasesCB> scalar_LessEqual() {
        return xcreateSSQFunction(CK_LE.getOperand());
    }

    protected HpSSQFunction<ImpasseTestCasesCB> xcreateSSQFunction(
            final String operand) {
        return new HpSSQFunction<ImpasseTestCasesCB>(
                new HpSSQSetupper<ImpasseTestCasesCB>() {
                    @Override
                    public void setup(final String function,
                            final SubQuery<ImpasseTestCasesCB> subQuery,
                            final HpSSQOption<ImpasseTestCasesCB> option) {
                        xscalarCondition(function, subQuery, operand, option);
                    }
                });
    }

    protected void xscalarCondition(final String function,
            final SubQuery<ImpasseTestCasesCB> subQuery, final String operand,
            final HpSSQOption<ImpasseTestCasesCB> option) {
        assertObjectNotNull("subQuery<ImpasseTestCasesCB>", subQuery);
        final ImpasseTestCasesCB cb = xcreateScalarConditionCB();
        subQuery.query(cb);
        final String subQueryPropertyName = keepScalarCondition(cb.query()); // for saving query-value
        option.setPartitionByCBean(xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(function, cb.query(), subQueryPropertyName,
                operand, option);
    }

    public abstract String keepScalarCondition(ImpasseTestCasesCQ subQuery);

    protected ImpasseTestCasesCB xcreateScalarConditionCB() {
        final ImpasseTestCasesCB cb = new ImpasseTestCasesCB();
        cb.xsetupForScalarCondition(this);
        return cb;
    }

    protected ImpasseTestCasesCB xcreateScalarConditionPartitionByCB() {
        final ImpasseTestCasesCB cb = new ImpasseTestCasesCB();
        cb.xsetupForScalarConditionPartitionBy(this);
        return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(final String function,
            final SubQuery<ImpasseTestCasesCB> subQuery,
            final String aliasName, final DerivedReferrerOption option) {
        assertObjectNotNull("subQuery<ImpasseTestCasesCB>", subQuery);
        final ImpasseTestCasesCB cb = new ImpasseTestCasesCB();
        cb.xsetupForDerivedReferrer(this);
        subQuery.query(cb);
        final String subQueryPropertyName = keepSpecifyMyselfDerived(cb.query()); // for saving query-value.
        registerSpecifyMyselfDerived(function, cb.query(), "id", "id",
                subQueryPropertyName, "myselfDerived", aliasName, option);
    }

    public abstract String keepSpecifyMyselfDerived(ImpasseTestCasesCQ subQuery);

    /**
     * Prepare for (Query)MyselfDerived (SubQuery).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<ImpasseTestCasesCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived();
    }

    protected HpQDRFunction<ImpasseTestCasesCB> xcreateQDRFunctionMyselfDerived() {
        return new HpQDRFunction<ImpasseTestCasesCB>(
                new HpQDRSetupper<ImpasseTestCasesCB>() {
                    @Override
                    public void setup(final String function,
                            final SubQuery<ImpasseTestCasesCB> subQuery,
                            final String operand, final Object value,
                            final DerivedReferrerOption option) {
                        xqderiveMyselfDerived(function, subQuery, operand,
                                value, option);
                    }
                });
    }

    public void xqderiveMyselfDerived(final String function,
            final SubQuery<ImpasseTestCasesCB> subQuery, final String operand,
            final Object value, final DerivedReferrerOption option) {
        assertObjectNotNull("subQuery<ImpasseTestCasesCB>", subQuery);
        final ImpasseTestCasesCB cb = new ImpasseTestCasesCB();
        cb.xsetupForDerivedReferrer(this);
        subQuery.query(cb);
        final String subQueryPropertyName = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        final String parameterPropertyName = keepQueryMyselfDerivedParameter(value);
        registerQueryMyselfDerived(function, cb.query(), "id", "id",
                subQueryPropertyName, "myselfDerived", operand, value,
                parameterPropertyName, option);
    }

    public abstract String keepQueryMyselfDerived(ImpasseTestCasesCQ subQuery);

    public abstract String keepQueryMyselfDerivedParameter(Object parameterValue);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (SubQuery).
     * @param subQuery The implementation of sub query. (NotNull)
     */
    public void myselfExists(final SubQuery<ImpasseTestCasesCB> subQuery) {
        assertObjectNotNull("subQuery<ImpasseTestCasesCB>", subQuery);
        final ImpasseTestCasesCB cb = new ImpasseTestCasesCB();
        cb.xsetupForMyselfExists(this);
        subQuery.query(cb);
        final String subQueryPropertyName = keepMyselfExists(cb.query()); // for saving query-value.
        registerMyselfExists(cb.query(), subQueryPropertyName);
    }

    public abstract String keepMyselfExists(ImpasseTestCasesCQ subQuery);

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    /**
     * Prepare for MyselfInScope (SubQuery).
     * @param subQuery The implementation of sub query. (NotNull)
     */
    public void myselfInScope(final SubQuery<ImpasseTestCasesCB> subQuery) {
        assertObjectNotNull("subQuery<ImpasseTestCasesCB>", subQuery);
        final ImpasseTestCasesCB cb = new ImpasseTestCasesCB();
        cb.xsetupForMyselfInScope(this);
        subQuery.query(cb);
        final String subQueryPropertyName = keepMyselfInScope(cb.query()); // for saving query-value.
        registerMyselfInScope(cb.query(), subQueryPropertyName);
    }

    public abstract String keepMyselfInScope(ImpasseTestCasesCQ subQuery);

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use TestLinkImport')
    protected String xabCB() {
        return ImpasseTestCasesCB.class.getName();
    }

    protected String xabCQ() {
        return ImpasseTestCasesCQ.class.getName();
    }

    protected String xabLSO() {
        return LikeSearchOption.class.getName();
    }

    protected String xabSSQS() {
        return HpSSQSetupper.class.getName();
    }
}
