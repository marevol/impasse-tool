package net.marevol.redmine.impasse.db.cbean.cq.bs;

import java.util.Collection;

import net.marevol.redmine.impasse.db.allcommon.DBMetaInstanceHandler;
import net.marevol.redmine.impasse.db.cbean.ImpasseTestStepsCB;
import net.marevol.redmine.impasse.db.cbean.cq.ImpasseTestStepsCQ;

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
 * The abstract condition-query of impasse_test_steps.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsImpasseTestStepsCQ extends
        AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsImpasseTestStepsCQ(final ConditionQuery childQuery,
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
        return "impasse_test_steps";
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
     * test_case_id: {IX, NotNull, INT(10)}
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
     * test_case_id: {IX, NotNull, INT(10)}
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
     * test_case_id: {IX, NotNull, INT(10)}
     * @param testCaseId The value of testCaseId as greaterThan.
     */
    public void setTestCaseId_GreaterThan(final Integer testCaseId) {
        regTestCaseId(CK_GT, testCaseId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * test_case_id: {IX, NotNull, INT(10)}
     * @param testCaseId The value of testCaseId as lessThan.
     */
    public void setTestCaseId_LessThan(final Integer testCaseId) {
        regTestCaseId(CK_LT, testCaseId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * test_case_id: {IX, NotNull, INT(10)}
     * @param testCaseId The value of testCaseId as greaterEqual.
     */
    public void setTestCaseId_GreaterEqual(final Integer testCaseId) {
        regTestCaseId(CK_GE, testCaseId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * test_case_id: {IX, NotNull, INT(10)}
     * @param testCaseId The value of testCaseId as lessEqual.
     */
    public void setTestCaseId_LessEqual(final Integer testCaseId) {
        regTestCaseId(CK_LE, testCaseId);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * test_case_id: {IX, NotNull, INT(10)}
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
     * test_case_id: {IX, NotNull, INT(10)}
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
     * test_case_id: {IX, NotNull, INT(10)}
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

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * step_number: {INT(10)}
     * @param stepNumber The value of stepNumber as equal.
     */
    public void setStepNumber_Equal(final Integer stepNumber) {
        doSetStepNumber_Equal(stepNumber);
    }

    protected void doSetStepNumber_Equal(final Integer stepNumber) {
        regStepNumber(CK_EQ, stepNumber);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * step_number: {INT(10)}
     * @param stepNumber The value of stepNumber as notEqual.
     */
    public void setStepNumber_NotEqual(final Integer stepNumber) {
        doSetStepNumber_NotEqual(stepNumber);
    }

    protected void doSetStepNumber_NotEqual(final Integer stepNumber) {
        regStepNumber(CK_NES, stepNumber);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * step_number: {INT(10)}
     * @param stepNumber The value of stepNumber as greaterThan.
     */
    public void setStepNumber_GreaterThan(final Integer stepNumber) {
        regStepNumber(CK_GT, stepNumber);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * step_number: {INT(10)}
     * @param stepNumber The value of stepNumber as lessThan.
     */
    public void setStepNumber_LessThan(final Integer stepNumber) {
        regStepNumber(CK_LT, stepNumber);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * step_number: {INT(10)}
     * @param stepNumber The value of stepNumber as greaterEqual.
     */
    public void setStepNumber_GreaterEqual(final Integer stepNumber) {
        regStepNumber(CK_GE, stepNumber);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * step_number: {INT(10)}
     * @param stepNumber The value of stepNumber as lessEqual.
     */
    public void setStepNumber_LessEqual(final Integer stepNumber) {
        regStepNumber(CK_LE, stepNumber);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * step_number: {INT(10)}
     * @param minNumber The min number of stepNumber. (NullAllowed)
     * @param maxNumber The max number of stepNumber. (NullAllowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setStepNumber_RangeOf(final Integer minNumber,
            final Integer maxNumber, final RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueStepNumber(), "step_number",
                rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * step_number: {INT(10)}
     * @param stepNumberList The collection of stepNumber as inScope.
     */
    public void setStepNumber_InScope(final Collection<Integer> stepNumberList) {
        doSetStepNumber_InScope(stepNumberList);
    }

    protected void doSetStepNumber_InScope(
            final Collection<Integer> stepNumberList) {
        regINS(CK_INS, cTL(stepNumberList), getCValueStepNumber(),
                "step_number");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * step_number: {INT(10)}
     * @param stepNumberList The collection of stepNumber as notInScope.
     */
    public void setStepNumber_NotInScope(
            final Collection<Integer> stepNumberList) {
        doSetStepNumber_NotInScope(stepNumberList);
    }

    protected void doSetStepNumber_NotInScope(
            final Collection<Integer> stepNumberList) {
        regINS(CK_NINS, cTL(stepNumberList), getCValueStepNumber(),
                "step_number");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * step_number: {INT(10)}
     */
    public void setStepNumber_IsNull() {
        regStepNumber(CK_ISN, DOBJ);
    }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * step_number: {INT(10)}
     */
    public void setStepNumber_IsNotNull() {
        regStepNumber(CK_ISNN, DOBJ);
    }

    protected void regStepNumber(final ConditionKey k, final Object v) {
        regQ(k, v, getCValueStepNumber(), "step_number");
    }

    abstract protected ConditionValue getCValueStepNumber();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * actions: {TEXT(65535)}
     * @param actions The value of actions as equal.
     */
    public void setActions_Equal(final String actions) {
        doSetActions_Equal(fRES(actions));
    }

    protected void doSetActions_Equal(final String actions) {
        regActions(CK_EQ, actions);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * actions: {TEXT(65535)}
     * @param actions The value of actions as notEqual.
     */
    public void setActions_NotEqual(final String actions) {
        doSetActions_NotEqual(fRES(actions));
    }

    protected void doSetActions_NotEqual(final String actions) {
        regActions(CK_NES, actions);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * actions: {TEXT(65535)}
     * @param actions The value of actions as greaterThan.
     */
    public void setActions_GreaterThan(final String actions) {
        regActions(CK_GT, fRES(actions));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * actions: {TEXT(65535)}
     * @param actions The value of actions as lessThan.
     */
    public void setActions_LessThan(final String actions) {
        regActions(CK_LT, fRES(actions));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * actions: {TEXT(65535)}
     * @param actions The value of actions as greaterEqual.
     */
    public void setActions_GreaterEqual(final String actions) {
        regActions(CK_GE, fRES(actions));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * actions: {TEXT(65535)}
     * @param actions The value of actions as lessEqual.
     */
    public void setActions_LessEqual(final String actions) {
        regActions(CK_LE, fRES(actions));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * actions: {TEXT(65535)}
     * @param actionsList The collection of actions as inScope.
     */
    public void setActions_InScope(final Collection<String> actionsList) {
        doSetActions_InScope(actionsList);
    }

    public void doSetActions_InScope(final Collection<String> actionsList) {
        regINS(CK_INS, cTL(actionsList), getCValueActions(), "actions");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * actions: {TEXT(65535)}
     * @param actionsList The collection of actions as notInScope.
     */
    public void setActions_NotInScope(final Collection<String> actionsList) {
        doSetActions_NotInScope(actionsList);
    }

    public void doSetActions_NotInScope(final Collection<String> actionsList) {
        regINS(CK_NINS, cTL(actionsList), getCValueActions(), "actions");
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * actions: {TEXT(65535)}
     * @param actions The value of actions as prefixSearch.
     */
    public void setActions_PrefixSearch(final String actions) {
        setActions_LikeSearch(actions, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * actions: {TEXT(65535)}
     * @param actions The value of actions as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setActions_LikeSearch(final String actions,
            final LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(actions), getCValueActions(), "actions",
                likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * actions: {TEXT(65535)}
     * @param actions The value of actions as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setActions_NotLikeSearch(final String actions,
            final LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(actions), getCValueActions(), "actions",
                likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * actions: {TEXT(65535)}
     */
    public void setActions_IsNull() {
        regActions(CK_ISN, DOBJ);
    }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br />
     * actions: {TEXT(65535)}
     */
    public void setActions_IsNullOrEmpty() {
        regActions(CK_ISNOE, DOBJ);
    }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * actions: {TEXT(65535)}
     */
    public void setActions_IsNotNull() {
        regActions(CK_ISNN, DOBJ);
    }

    protected void regActions(final ConditionKey k, final Object v) {
        regQ(k, v, getCValueActions(), "actions");
    }

    abstract protected ConditionValue getCValueActions();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * expected_results: {TEXT(65535)}
     * @param expectedResults The value of expectedResults as equal.
     */
    public void setExpectedResults_Equal(final String expectedResults) {
        doSetExpectedResults_Equal(fRES(expectedResults));
    }

    protected void doSetExpectedResults_Equal(final String expectedResults) {
        regExpectedResults(CK_EQ, expectedResults);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * expected_results: {TEXT(65535)}
     * @param expectedResults The value of expectedResults as notEqual.
     */
    public void setExpectedResults_NotEqual(final String expectedResults) {
        doSetExpectedResults_NotEqual(fRES(expectedResults));
    }

    protected void doSetExpectedResults_NotEqual(final String expectedResults) {
        regExpectedResults(CK_NES, expectedResults);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * expected_results: {TEXT(65535)}
     * @param expectedResults The value of expectedResults as greaterThan.
     */
    public void setExpectedResults_GreaterThan(final String expectedResults) {
        regExpectedResults(CK_GT, fRES(expectedResults));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * expected_results: {TEXT(65535)}
     * @param expectedResults The value of expectedResults as lessThan.
     */
    public void setExpectedResults_LessThan(final String expectedResults) {
        regExpectedResults(CK_LT, fRES(expectedResults));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * expected_results: {TEXT(65535)}
     * @param expectedResults The value of expectedResults as greaterEqual.
     */
    public void setExpectedResults_GreaterEqual(final String expectedResults) {
        regExpectedResults(CK_GE, fRES(expectedResults));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * expected_results: {TEXT(65535)}
     * @param expectedResults The value of expectedResults as lessEqual.
     */
    public void setExpectedResults_LessEqual(final String expectedResults) {
        regExpectedResults(CK_LE, fRES(expectedResults));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * expected_results: {TEXT(65535)}
     * @param expectedResultsList The collection of expectedResults as inScope.
     */
    public void setExpectedResults_InScope(
            final Collection<String> expectedResultsList) {
        doSetExpectedResults_InScope(expectedResultsList);
    }

    public void doSetExpectedResults_InScope(
            final Collection<String> expectedResultsList) {
        regINS(CK_INS, cTL(expectedResultsList), getCValueExpectedResults(),
                "expected_results");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * expected_results: {TEXT(65535)}
     * @param expectedResultsList The collection of expectedResults as notInScope.
     */
    public void setExpectedResults_NotInScope(
            final Collection<String> expectedResultsList) {
        doSetExpectedResults_NotInScope(expectedResultsList);
    }

    public void doSetExpectedResults_NotInScope(
            final Collection<String> expectedResultsList) {
        regINS(CK_NINS, cTL(expectedResultsList), getCValueExpectedResults(),
                "expected_results");
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * expected_results: {TEXT(65535)}
     * @param expectedResults The value of expectedResults as prefixSearch.
     */
    public void setExpectedResults_PrefixSearch(final String expectedResults) {
        setExpectedResults_LikeSearch(expectedResults, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * expected_results: {TEXT(65535)}
     * @param expectedResults The value of expectedResults as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setExpectedResults_LikeSearch(final String expectedResults,
            final LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(expectedResults), getCValueExpectedResults(),
                "expected_results", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * expected_results: {TEXT(65535)}
     * @param expectedResults The value of expectedResults as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setExpectedResults_NotLikeSearch(final String expectedResults,
            final LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(expectedResults), getCValueExpectedResults(),
                "expected_results", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * expected_results: {TEXT(65535)}
     */
    public void setExpectedResults_IsNull() {
        regExpectedResults(CK_ISN, DOBJ);
    }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br />
     * expected_results: {TEXT(65535)}
     */
    public void setExpectedResults_IsNullOrEmpty() {
        regExpectedResults(CK_ISNOE, DOBJ);
    }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * expected_results: {TEXT(65535)}
     */
    public void setExpectedResults_IsNotNull() {
        regExpectedResults(CK_ISNN, DOBJ);
    }

    protected void regExpectedResults(final ConditionKey k, final Object v) {
        regQ(k, v, getCValueExpectedResults(), "expected_results");
    }

    abstract protected ConditionValue getCValueExpectedResults();

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO = (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_Equal()</span>.max(new SubQuery&lt;ImpasseTestStepsCB&gt;() {
     *     public void query(ImpasseTestStepsCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<ImpasseTestStepsCB> scalar_Equal() {
        return xcreateSSQFunction(CK_EQ.getOperand());
    }

    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO &lt;&gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_NotEqual()</span>.max(new SubQuery&lt;ImpasseTestStepsCB&gt;() {
     *     public void query(ImpasseTestStepsCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<ImpasseTestStepsCB> scalar_NotEqual() {
        return xcreateSSQFunction(CK_NES.getOperand());
    }

    /**
     * Prepare ScalarCondition as greaterThan. <br />
     * {where FOO &gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_GreaterThan()</span>.max(new SubQuery&lt;ImpasseTestStepsCB&gt;() {
     *     public void query(ImpasseTestStepsCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<ImpasseTestStepsCB> scalar_GreaterThan() {
        return xcreateSSQFunction(CK_GT.getOperand());
    }

    /**
     * Prepare ScalarCondition as lessThan. <br />
     * {where FOO &lt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_LessThan()</span>.max(new SubQuery&lt;ImpasseTestStepsCB&gt;() {
     *     public void query(ImpasseTestStepsCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<ImpasseTestStepsCB> scalar_LessThan() {
        return xcreateSSQFunction(CK_LT.getOperand());
    }

    /**
     * Prepare ScalarCondition as greaterEqual. <br />
     * {where FOO &gt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_GreaterEqual()</span>.max(new SubQuery&lt;ImpasseTestStepsCB&gt;() {
     *     public void query(ImpasseTestStepsCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<ImpasseTestStepsCB> scalar_GreaterEqual() {
        return xcreateSSQFunction(CK_GE.getOperand());
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br />
     * {where FOO &lt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_LessEqual()</span>.max(new SubQuery&lt;ImpasseTestStepsCB&gt;() {
     *     public void query(ImpasseTestStepsCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<ImpasseTestStepsCB> scalar_LessEqual() {
        return xcreateSSQFunction(CK_LE.getOperand());
    }

    protected HpSSQFunction<ImpasseTestStepsCB> xcreateSSQFunction(
            final String operand) {
        return new HpSSQFunction<ImpasseTestStepsCB>(
                new HpSSQSetupper<ImpasseTestStepsCB>() {
                    @Override
                    public void setup(final String function,
                            final SubQuery<ImpasseTestStepsCB> subQuery,
                            final HpSSQOption<ImpasseTestStepsCB> option) {
                        xscalarCondition(function, subQuery, operand, option);
                    }
                });
    }

    protected void xscalarCondition(final String function,
            final SubQuery<ImpasseTestStepsCB> subQuery, final String operand,
            final HpSSQOption<ImpasseTestStepsCB> option) {
        assertObjectNotNull("subQuery<ImpasseTestStepsCB>", subQuery);
        final ImpasseTestStepsCB cb = xcreateScalarConditionCB();
        subQuery.query(cb);
        final String subQueryPropertyName = keepScalarCondition(cb.query()); // for saving query-value
        option.setPartitionByCBean(xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(function, cb.query(), subQueryPropertyName,
                operand, option);
    }

    public abstract String keepScalarCondition(ImpasseTestStepsCQ subQuery);

    protected ImpasseTestStepsCB xcreateScalarConditionCB() {
        final ImpasseTestStepsCB cb = new ImpasseTestStepsCB();
        cb.xsetupForScalarCondition(this);
        return cb;
    }

    protected ImpasseTestStepsCB xcreateScalarConditionPartitionByCB() {
        final ImpasseTestStepsCB cb = new ImpasseTestStepsCB();
        cb.xsetupForScalarConditionPartitionBy(this);
        return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(final String function,
            final SubQuery<ImpasseTestStepsCB> subQuery,
            final String aliasName, final DerivedReferrerOption option) {
        assertObjectNotNull("subQuery<ImpasseTestStepsCB>", subQuery);
        final ImpasseTestStepsCB cb = new ImpasseTestStepsCB();
        cb.xsetupForDerivedReferrer(this);
        subQuery.query(cb);
        final String subQueryPropertyName = keepSpecifyMyselfDerived(cb.query()); // for saving query-value.
        registerSpecifyMyselfDerived(function, cb.query(), "id", "id",
                subQueryPropertyName, "myselfDerived", aliasName, option);
    }

    public abstract String keepSpecifyMyselfDerived(ImpasseTestStepsCQ subQuery);

    /**
     * Prepare for (Query)MyselfDerived (SubQuery).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<ImpasseTestStepsCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived();
    }

    protected HpQDRFunction<ImpasseTestStepsCB> xcreateQDRFunctionMyselfDerived() {
        return new HpQDRFunction<ImpasseTestStepsCB>(
                new HpQDRSetupper<ImpasseTestStepsCB>() {
                    @Override
                    public void setup(final String function,
                            final SubQuery<ImpasseTestStepsCB> subQuery,
                            final String operand, final Object value,
                            final DerivedReferrerOption option) {
                        xqderiveMyselfDerived(function, subQuery, operand,
                                value, option);
                    }
                });
    }

    public void xqderiveMyselfDerived(final String function,
            final SubQuery<ImpasseTestStepsCB> subQuery, final String operand,
            final Object value, final DerivedReferrerOption option) {
        assertObjectNotNull("subQuery<ImpasseTestStepsCB>", subQuery);
        final ImpasseTestStepsCB cb = new ImpasseTestStepsCB();
        cb.xsetupForDerivedReferrer(this);
        subQuery.query(cb);
        final String subQueryPropertyName = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        final String parameterPropertyName = keepQueryMyselfDerivedParameter(value);
        registerQueryMyselfDerived(function, cb.query(), "id", "id",
                subQueryPropertyName, "myselfDerived", operand, value,
                parameterPropertyName, option);
    }

    public abstract String keepQueryMyselfDerived(ImpasseTestStepsCQ subQuery);

    public abstract String keepQueryMyselfDerivedParameter(Object parameterValue);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (SubQuery).
     * @param subQuery The implementation of sub query. (NotNull)
     */
    public void myselfExists(final SubQuery<ImpasseTestStepsCB> subQuery) {
        assertObjectNotNull("subQuery<ImpasseTestStepsCB>", subQuery);
        final ImpasseTestStepsCB cb = new ImpasseTestStepsCB();
        cb.xsetupForMyselfExists(this);
        subQuery.query(cb);
        final String subQueryPropertyName = keepMyselfExists(cb.query()); // for saving query-value.
        registerMyselfExists(cb.query(), subQueryPropertyName);
    }

    public abstract String keepMyselfExists(ImpasseTestStepsCQ subQuery);

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    /**
     * Prepare for MyselfInScope (SubQuery).
     * @param subQuery The implementation of sub query. (NotNull)
     */
    public void myselfInScope(final SubQuery<ImpasseTestStepsCB> subQuery) {
        assertObjectNotNull("subQuery<ImpasseTestStepsCB>", subQuery);
        final ImpasseTestStepsCB cb = new ImpasseTestStepsCB();
        cb.xsetupForMyselfInScope(this);
        subQuery.query(cb);
        final String subQueryPropertyName = keepMyselfInScope(cb.query()); // for saving query-value.
        registerMyselfInScope(cb.query(), subQueryPropertyName);
    }

    public abstract String keepMyselfInScope(ImpasseTestStepsCQ subQuery);

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use TestLinkImport')
    protected String xabCB() {
        return ImpasseTestStepsCB.class.getName();
    }

    protected String xabCQ() {
        return ImpasseTestStepsCQ.class.getName();
    }

    protected String xabLSO() {
        return LikeSearchOption.class.getName();
    }

    protected String xabSSQS() {
        return HpSSQSetupper.class.getName();
    }
}
