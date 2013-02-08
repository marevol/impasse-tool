package net.marevol.redmine.impasse.db.cbean.cq.bs;

import java.util.Collection;

import net.marevol.redmine.impasse.db.allcommon.DBMetaInstanceHandler;
import net.marevol.redmine.impasse.db.cbean.ImpasseExecutionHistoriesCB;
import net.marevol.redmine.impasse.db.cbean.cq.ImpasseExecutionHistoriesCQ;

import org.seasar.dbflute.cbean.AbstractConditionQuery;
import org.seasar.dbflute.cbean.ConditionQuery;
import org.seasar.dbflute.cbean.SubQuery;
import org.seasar.dbflute.cbean.chelper.HpQDRFunction;
import org.seasar.dbflute.cbean.chelper.HpQDRSetupper;
import org.seasar.dbflute.cbean.chelper.HpSSQFunction;
import org.seasar.dbflute.cbean.chelper.HpSSQOption;
import org.seasar.dbflute.cbean.chelper.HpSSQSetupper;
import org.seasar.dbflute.cbean.ckey.ConditionKey;
import org.seasar.dbflute.cbean.coption.DateFromToOption;
import org.seasar.dbflute.cbean.coption.DerivedReferrerOption;
import org.seasar.dbflute.cbean.coption.FromToOption;
import org.seasar.dbflute.cbean.coption.LikeSearchOption;
import org.seasar.dbflute.cbean.coption.RangeOfOption;
import org.seasar.dbflute.cbean.cvalue.ConditionValue;
import org.seasar.dbflute.cbean.sqlclause.SqlClause;
import org.seasar.dbflute.dbmeta.DBMetaProvider;

/**
 * The abstract condition-query of impasse_execution_histories.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsImpasseExecutionHistoriesCQ extends
        AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsImpasseExecutionHistoriesCQ(
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
        return "impasse_execution_histories";
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
     * test_plan_case_id: {IX, NotNull, INT(10)}
     * @param testPlanCaseId The value of testPlanCaseId as equal.
     */
    public void setTestPlanCaseId_Equal(final Integer testPlanCaseId) {
        doSetTestPlanCaseId_Equal(testPlanCaseId);
    }

    protected void doSetTestPlanCaseId_Equal(final Integer testPlanCaseId) {
        regTestPlanCaseId(CK_EQ, testPlanCaseId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * test_plan_case_id: {IX, NotNull, INT(10)}
     * @param testPlanCaseId The value of testPlanCaseId as notEqual.
     */
    public void setTestPlanCaseId_NotEqual(final Integer testPlanCaseId) {
        doSetTestPlanCaseId_NotEqual(testPlanCaseId);
    }

    protected void doSetTestPlanCaseId_NotEqual(final Integer testPlanCaseId) {
        regTestPlanCaseId(CK_NES, testPlanCaseId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * test_plan_case_id: {IX, NotNull, INT(10)}
     * @param testPlanCaseId The value of testPlanCaseId as greaterThan.
     */
    public void setTestPlanCaseId_GreaterThan(final Integer testPlanCaseId) {
        regTestPlanCaseId(CK_GT, testPlanCaseId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * test_plan_case_id: {IX, NotNull, INT(10)}
     * @param testPlanCaseId The value of testPlanCaseId as lessThan.
     */
    public void setTestPlanCaseId_LessThan(final Integer testPlanCaseId) {
        regTestPlanCaseId(CK_LT, testPlanCaseId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * test_plan_case_id: {IX, NotNull, INT(10)}
     * @param testPlanCaseId The value of testPlanCaseId as greaterEqual.
     */
    public void setTestPlanCaseId_GreaterEqual(final Integer testPlanCaseId) {
        regTestPlanCaseId(CK_GE, testPlanCaseId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * test_plan_case_id: {IX, NotNull, INT(10)}
     * @param testPlanCaseId The value of testPlanCaseId as lessEqual.
     */
    public void setTestPlanCaseId_LessEqual(final Integer testPlanCaseId) {
        regTestPlanCaseId(CK_LE, testPlanCaseId);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * test_plan_case_id: {IX, NotNull, INT(10)}
     * @param minNumber The min number of testPlanCaseId. (NullAllowed)
     * @param maxNumber The max number of testPlanCaseId. (NullAllowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setTestPlanCaseId_RangeOf(final Integer minNumber,
            final Integer maxNumber, final RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueTestPlanCaseId(),
                "test_plan_case_id", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * test_plan_case_id: {IX, NotNull, INT(10)}
     * @param testPlanCaseIdList The collection of testPlanCaseId as inScope.
     */
    public void setTestPlanCaseId_InScope(
            final Collection<Integer> testPlanCaseIdList) {
        doSetTestPlanCaseId_InScope(testPlanCaseIdList);
    }

    protected void doSetTestPlanCaseId_InScope(
            final Collection<Integer> testPlanCaseIdList) {
        regINS(CK_INS, cTL(testPlanCaseIdList), getCValueTestPlanCaseId(),
                "test_plan_case_id");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * test_plan_case_id: {IX, NotNull, INT(10)}
     * @param testPlanCaseIdList The collection of testPlanCaseId as notInScope.
     */
    public void setTestPlanCaseId_NotInScope(
            final Collection<Integer> testPlanCaseIdList) {
        doSetTestPlanCaseId_NotInScope(testPlanCaseIdList);
    }

    protected void doSetTestPlanCaseId_NotInScope(
            final Collection<Integer> testPlanCaseIdList) {
        regINS(CK_NINS, cTL(testPlanCaseIdList), getCValueTestPlanCaseId(),
                "test_plan_case_id");
    }

    protected void regTestPlanCaseId(final ConditionKey k, final Object v) {
        regQ(k, v, getCValueTestPlanCaseId(), "test_plan_case_id");
    }

    abstract protected ConditionValue getCValueTestPlanCaseId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * tester_id: {INT(10)}
     * @param testerId The value of testerId as equal.
     */
    public void setTesterId_Equal(final Integer testerId) {
        doSetTesterId_Equal(testerId);
    }

    protected void doSetTesterId_Equal(final Integer testerId) {
        regTesterId(CK_EQ, testerId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * tester_id: {INT(10)}
     * @param testerId The value of testerId as notEqual.
     */
    public void setTesterId_NotEqual(final Integer testerId) {
        doSetTesterId_NotEqual(testerId);
    }

    protected void doSetTesterId_NotEqual(final Integer testerId) {
        regTesterId(CK_NES, testerId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * tester_id: {INT(10)}
     * @param testerId The value of testerId as greaterThan.
     */
    public void setTesterId_GreaterThan(final Integer testerId) {
        regTesterId(CK_GT, testerId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * tester_id: {INT(10)}
     * @param testerId The value of testerId as lessThan.
     */
    public void setTesterId_LessThan(final Integer testerId) {
        regTesterId(CK_LT, testerId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * tester_id: {INT(10)}
     * @param testerId The value of testerId as greaterEqual.
     */
    public void setTesterId_GreaterEqual(final Integer testerId) {
        regTesterId(CK_GE, testerId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * tester_id: {INT(10)}
     * @param testerId The value of testerId as lessEqual.
     */
    public void setTesterId_LessEqual(final Integer testerId) {
        regTesterId(CK_LE, testerId);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * tester_id: {INT(10)}
     * @param minNumber The min number of testerId. (NullAllowed)
     * @param maxNumber The max number of testerId. (NullAllowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setTesterId_RangeOf(final Integer minNumber,
            final Integer maxNumber, final RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueTesterId(), "tester_id",
                rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * tester_id: {INT(10)}
     * @param testerIdList The collection of testerId as inScope.
     */
    public void setTesterId_InScope(final Collection<Integer> testerIdList) {
        doSetTesterId_InScope(testerIdList);
    }

    protected void doSetTesterId_InScope(final Collection<Integer> testerIdList) {
        regINS(CK_INS, cTL(testerIdList), getCValueTesterId(), "tester_id");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * tester_id: {INT(10)}
     * @param testerIdList The collection of testerId as notInScope.
     */
    public void setTesterId_NotInScope(final Collection<Integer> testerIdList) {
        doSetTesterId_NotInScope(testerIdList);
    }

    protected void doSetTesterId_NotInScope(
            final Collection<Integer> testerIdList) {
        regINS(CK_NINS, cTL(testerIdList), getCValueTesterId(), "tester_id");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * tester_id: {INT(10)}
     */
    public void setTesterId_IsNull() {
        regTesterId(CK_ISN, DOBJ);
    }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * tester_id: {INT(10)}
     */
    public void setTesterId_IsNotNull() {
        regTesterId(CK_ISNN, DOBJ);
    }

    protected void regTesterId(final ConditionKey k, final Object v) {
        regQ(k, v, getCValueTesterId(), "tester_id");
    }

    abstract protected ConditionValue getCValueTesterId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * build_id: {INT(10)}
     * @param buildId The value of buildId as equal.
     */
    public void setBuildId_Equal(final Integer buildId) {
        doSetBuildId_Equal(buildId);
    }

    protected void doSetBuildId_Equal(final Integer buildId) {
        regBuildId(CK_EQ, buildId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * build_id: {INT(10)}
     * @param buildId The value of buildId as notEqual.
     */
    public void setBuildId_NotEqual(final Integer buildId) {
        doSetBuildId_NotEqual(buildId);
    }

    protected void doSetBuildId_NotEqual(final Integer buildId) {
        regBuildId(CK_NES, buildId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * build_id: {INT(10)}
     * @param buildId The value of buildId as greaterThan.
     */
    public void setBuildId_GreaterThan(final Integer buildId) {
        regBuildId(CK_GT, buildId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * build_id: {INT(10)}
     * @param buildId The value of buildId as lessThan.
     */
    public void setBuildId_LessThan(final Integer buildId) {
        regBuildId(CK_LT, buildId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * build_id: {INT(10)}
     * @param buildId The value of buildId as greaterEqual.
     */
    public void setBuildId_GreaterEqual(final Integer buildId) {
        regBuildId(CK_GE, buildId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * build_id: {INT(10)}
     * @param buildId The value of buildId as lessEqual.
     */
    public void setBuildId_LessEqual(final Integer buildId) {
        regBuildId(CK_LE, buildId);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * build_id: {INT(10)}
     * @param minNumber The min number of buildId. (NullAllowed)
     * @param maxNumber The max number of buildId. (NullAllowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setBuildId_RangeOf(final Integer minNumber,
            final Integer maxNumber, final RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueBuildId(), "build_id",
                rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * build_id: {INT(10)}
     * @param buildIdList The collection of buildId as inScope.
     */
    public void setBuildId_InScope(final Collection<Integer> buildIdList) {
        doSetBuildId_InScope(buildIdList);
    }

    protected void doSetBuildId_InScope(final Collection<Integer> buildIdList) {
        regINS(CK_INS, cTL(buildIdList), getCValueBuildId(), "build_id");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * build_id: {INT(10)}
     * @param buildIdList The collection of buildId as notInScope.
     */
    public void setBuildId_NotInScope(final Collection<Integer> buildIdList) {
        doSetBuildId_NotInScope(buildIdList);
    }

    protected void doSetBuildId_NotInScope(final Collection<Integer> buildIdList) {
        regINS(CK_NINS, cTL(buildIdList), getCValueBuildId(), "build_id");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * build_id: {INT(10)}
     */
    public void setBuildId_IsNull() {
        regBuildId(CK_ISN, DOBJ);
    }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * build_id: {INT(10)}
     */
    public void setBuildId_IsNotNull() {
        regBuildId(CK_ISNN, DOBJ);
    }

    protected void regBuildId(final ConditionKey k, final Object v) {
        regQ(k, v, getCValueBuildId(), "build_id");
    }

    abstract protected ConditionValue getCValueBuildId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * expected_date: {DATE(10)}
     * @param expectedDate The value of expectedDate as equal.
     */
    public void setExpectedDate_Equal(final java.util.Date expectedDate) {
        regExpectedDate(CK_EQ, fCTPD(expectedDate));
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * expected_date: {DATE(10)}
     * @param expectedDate The value of expectedDate as greaterThan.
     */
    public void setExpectedDate_GreaterThan(final java.util.Date expectedDate) {
        regExpectedDate(CK_GT, fCTPD(expectedDate));
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * expected_date: {DATE(10)}
     * @param expectedDate The value of expectedDate as lessThan.
     */
    public void setExpectedDate_LessThan(final java.util.Date expectedDate) {
        regExpectedDate(CK_LT, fCTPD(expectedDate));
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * expected_date: {DATE(10)}
     * @param expectedDate The value of expectedDate as greaterEqual.
     */
    public void setExpectedDate_GreaterEqual(final java.util.Date expectedDate) {
        regExpectedDate(CK_GE, fCTPD(expectedDate));
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * expected_date: {DATE(10)}
     * @param expectedDate The value of expectedDate as lessEqual.
     */
    public void setExpectedDate_LessEqual(final java.util.Date expectedDate) {
        regExpectedDate(CK_LE, fCTPD(expectedDate));
    }

    /**
     * FromTo with various options. (versatile) <br />
     * {(default) fromDatetime &lt;= column &lt;= toDatetime} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * expected_date: {DATE(10)}
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of expectedDate. (NullAllowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of expectedDate. (NullAllowed)
     * @param fromToOption The option of from-to. (NotNull)
     */
    public void setExpectedDate_FromTo(final java.util.Date fromDatetime,
            final java.util.Date toDatetime, final FromToOption fromToOption) {
        regFTQ(fCTPD(fromDatetime), fCTPD(toDatetime), getCValueExpectedDate(),
                "expected_date", fromToOption);
    }

    /**
     * DateFromTo. (Date means yyyy/MM/dd) <br />
     * {fromDate &lt;= column &lt; toDate + 1 day} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * expected_date: {DATE(10)}
     * <pre>
     * e.g. from:{2007/04/10 08:24:53} to:{2007/04/16 14:36:29}
     *  --&gt; column &gt;= '2007/04/10 00:00:00'
     *  and column <span style="color: #FD4747">&lt; '2007/04/17 00:00:00'</span>
     * </pre>
     * @param fromDate The from-date(yyyy/MM/dd) of expectedDate. (NullAllowed)
     * @param toDate The to-date(yyyy/MM/dd) of expectedDate. (NullAllowed)
     */
    public void setExpectedDate_DateFromTo(final java.util.Date fromDate,
            final java.util.Date toDate) {
        setExpectedDate_FromTo(fromDate, toDate, new DateFromToOption());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * expected_date: {DATE(10)}
     */
    public void setExpectedDate_IsNull() {
        regExpectedDate(CK_ISN, DOBJ);
    }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * expected_date: {DATE(10)}
     */
    public void setExpectedDate_IsNotNull() {
        regExpectedDate(CK_ISNN, DOBJ);
    }

    protected void regExpectedDate(final ConditionKey k, final Object v) {
        regQ(k, v, getCValueExpectedDate(), "expected_date");
    }

    abstract protected ConditionValue getCValueExpectedDate();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * status: {NotNull, VARCHAR(255)}
     * @param status The value of status as equal.
     */
    public void setStatus_Equal(final String status) {
        doSetStatus_Equal(fRES(status));
    }

    protected void doSetStatus_Equal(final String status) {
        regStatus(CK_EQ, status);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * status: {NotNull, VARCHAR(255)}
     * @param status The value of status as notEqual.
     */
    public void setStatus_NotEqual(final String status) {
        doSetStatus_NotEqual(fRES(status));
    }

    protected void doSetStatus_NotEqual(final String status) {
        regStatus(CK_NES, status);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * status: {NotNull, VARCHAR(255)}
     * @param status The value of status as greaterThan.
     */
    public void setStatus_GreaterThan(final String status) {
        regStatus(CK_GT, fRES(status));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * status: {NotNull, VARCHAR(255)}
     * @param status The value of status as lessThan.
     */
    public void setStatus_LessThan(final String status) {
        regStatus(CK_LT, fRES(status));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * status: {NotNull, VARCHAR(255)}
     * @param status The value of status as greaterEqual.
     */
    public void setStatus_GreaterEqual(final String status) {
        regStatus(CK_GE, fRES(status));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * status: {NotNull, VARCHAR(255)}
     * @param status The value of status as lessEqual.
     */
    public void setStatus_LessEqual(final String status) {
        regStatus(CK_LE, fRES(status));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * status: {NotNull, VARCHAR(255)}
     * @param statusList The collection of status as inScope.
     */
    public void setStatus_InScope(final Collection<String> statusList) {
        doSetStatus_InScope(statusList);
    }

    public void doSetStatus_InScope(final Collection<String> statusList) {
        regINS(CK_INS, cTL(statusList), getCValueStatus(), "status");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * status: {NotNull, VARCHAR(255)}
     * @param statusList The collection of status as notInScope.
     */
    public void setStatus_NotInScope(final Collection<String> statusList) {
        doSetStatus_NotInScope(statusList);
    }

    public void doSetStatus_NotInScope(final Collection<String> statusList) {
        regINS(CK_NINS, cTL(statusList), getCValueStatus(), "status");
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * status: {NotNull, VARCHAR(255)}
     * @param status The value of status as prefixSearch.
     */
    public void setStatus_PrefixSearch(final String status) {
        setStatus_LikeSearch(status, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * status: {NotNull, VARCHAR(255)}
     * @param status The value of status as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setStatus_LikeSearch(final String status,
            final LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(status), getCValueStatus(), "status",
                likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * status: {NotNull, VARCHAR(255)}
     * @param status The value of status as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setStatus_NotLikeSearch(final String status,
            final LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(status), getCValueStatus(), "status",
                likeSearchOption);
    }

    protected void regStatus(final ConditionKey k, final Object v) {
        regQ(k, v, getCValueStatus(), "status");
    }

    abstract protected ConditionValue getCValueStatus();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * execution_ts: {NotNull, DATETIME(19)}
     * @param executionTs The value of executionTs as equal.
     */
    public void setExecutionTs_Equal(final java.sql.Timestamp executionTs) {
        regExecutionTs(CK_EQ, executionTs);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * execution_ts: {NotNull, DATETIME(19)}
     * @param executionTs The value of executionTs as greaterThan.
     */
    public void setExecutionTs_GreaterThan(final java.sql.Timestamp executionTs) {
        regExecutionTs(CK_GT, executionTs);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * execution_ts: {NotNull, DATETIME(19)}
     * @param executionTs The value of executionTs as lessThan.
     */
    public void setExecutionTs_LessThan(final java.sql.Timestamp executionTs) {
        regExecutionTs(CK_LT, executionTs);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * execution_ts: {NotNull, DATETIME(19)}
     * @param executionTs The value of executionTs as greaterEqual.
     */
    public void setExecutionTs_GreaterEqual(final java.sql.Timestamp executionTs) {
        regExecutionTs(CK_GE, executionTs);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * execution_ts: {NotNull, DATETIME(19)}
     * @param executionTs The value of executionTs as lessEqual.
     */
    public void setExecutionTs_LessEqual(final java.sql.Timestamp executionTs) {
        regExecutionTs(CK_LE, executionTs);
    }

    /**
     * FromTo with various options. (versatile) <br />
     * {(default) fromDatetime &lt;= column &lt;= toDatetime} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * execution_ts: {NotNull, DATETIME(19)}
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of executionTs. (NullAllowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of executionTs. (NullAllowed)
     * @param fromToOption The option of from-to. (NotNull)
     */
    public void setExecutionTs_FromTo(final java.util.Date fromDatetime,
            final java.util.Date toDatetime, final FromToOption fromToOption) {
        regFTQ(fromDatetime != null ? new java.sql.Timestamp(
                fromDatetime.getTime()) : null,
                toDatetime != null ? new java.sql.Timestamp(toDatetime
                        .getTime()) : null, getCValueExecutionTs(),
                "execution_ts", fromToOption);
    }

    /**
     * DateFromTo. (Date means yyyy/MM/dd) <br />
     * {fromDate &lt;= column &lt; toDate + 1 day} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * execution_ts: {NotNull, DATETIME(19)}
     * <pre>
     * e.g. from:{2007/04/10 08:24:53} to:{2007/04/16 14:36:29}
     *  --&gt; column &gt;= '2007/04/10 00:00:00'
     *  and column <span style="color: #FD4747">&lt; '2007/04/17 00:00:00'</span>
     * </pre>
     * @param fromDate The from-date(yyyy/MM/dd) of executionTs. (NullAllowed)
     * @param toDate The to-date(yyyy/MM/dd) of executionTs. (NullAllowed)
     */
    public void setExecutionTs_DateFromTo(final java.util.Date fromDate,
            final java.util.Date toDate) {
        setExecutionTs_FromTo(fromDate, toDate, new DateFromToOption());
    }

    protected void regExecutionTs(final ConditionKey k, final Object v) {
        regQ(k, v, getCValueExecutionTs(), "execution_ts");
    }

    abstract protected ConditionValue getCValueExecutionTs();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * executor_id: {NotNull, INT(10)}
     * @param executorId The value of executorId as equal.
     */
    public void setExecutorId_Equal(final Integer executorId) {
        doSetExecutorId_Equal(executorId);
    }

    protected void doSetExecutorId_Equal(final Integer executorId) {
        regExecutorId(CK_EQ, executorId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * executor_id: {NotNull, INT(10)}
     * @param executorId The value of executorId as notEqual.
     */
    public void setExecutorId_NotEqual(final Integer executorId) {
        doSetExecutorId_NotEqual(executorId);
    }

    protected void doSetExecutorId_NotEqual(final Integer executorId) {
        regExecutorId(CK_NES, executorId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * executor_id: {NotNull, INT(10)}
     * @param executorId The value of executorId as greaterThan.
     */
    public void setExecutorId_GreaterThan(final Integer executorId) {
        regExecutorId(CK_GT, executorId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * executor_id: {NotNull, INT(10)}
     * @param executorId The value of executorId as lessThan.
     */
    public void setExecutorId_LessThan(final Integer executorId) {
        regExecutorId(CK_LT, executorId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * executor_id: {NotNull, INT(10)}
     * @param executorId The value of executorId as greaterEqual.
     */
    public void setExecutorId_GreaterEqual(final Integer executorId) {
        regExecutorId(CK_GE, executorId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * executor_id: {NotNull, INT(10)}
     * @param executorId The value of executorId as lessEqual.
     */
    public void setExecutorId_LessEqual(final Integer executorId) {
        regExecutorId(CK_LE, executorId);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * executor_id: {NotNull, INT(10)}
     * @param minNumber The min number of executorId. (NullAllowed)
     * @param maxNumber The max number of executorId. (NullAllowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setExecutorId_RangeOf(final Integer minNumber,
            final Integer maxNumber, final RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueExecutorId(), "executor_id",
                rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * executor_id: {NotNull, INT(10)}
     * @param executorIdList The collection of executorId as inScope.
     */
    public void setExecutorId_InScope(final Collection<Integer> executorIdList) {
        doSetExecutorId_InScope(executorIdList);
    }

    protected void doSetExecutorId_InScope(
            final Collection<Integer> executorIdList) {
        regINS(CK_INS, cTL(executorIdList), getCValueExecutorId(),
                "executor_id");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * executor_id: {NotNull, INT(10)}
     * @param executorIdList The collection of executorId as notInScope.
     */
    public void setExecutorId_NotInScope(
            final Collection<Integer> executorIdList) {
        doSetExecutorId_NotInScope(executorIdList);
    }

    protected void doSetExecutorId_NotInScope(
            final Collection<Integer> executorIdList) {
        regINS(CK_NINS, cTL(executorIdList), getCValueExecutorId(),
                "executor_id");
    }

    protected void regExecutorId(final ConditionKey k, final Object v) {
        regQ(k, v, getCValueExecutorId(), "executor_id");
    }

    abstract protected ConditionValue getCValueExecutorId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * notes: {TEXT(65535)}
     * @param notes The value of notes as equal.
     */
    public void setNotes_Equal(final String notes) {
        doSetNotes_Equal(fRES(notes));
    }

    protected void doSetNotes_Equal(final String notes) {
        regNotes(CK_EQ, notes);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * notes: {TEXT(65535)}
     * @param notes The value of notes as notEqual.
     */
    public void setNotes_NotEqual(final String notes) {
        doSetNotes_NotEqual(fRES(notes));
    }

    protected void doSetNotes_NotEqual(final String notes) {
        regNotes(CK_NES, notes);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * notes: {TEXT(65535)}
     * @param notes The value of notes as greaterThan.
     */
    public void setNotes_GreaterThan(final String notes) {
        regNotes(CK_GT, fRES(notes));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * notes: {TEXT(65535)}
     * @param notes The value of notes as lessThan.
     */
    public void setNotes_LessThan(final String notes) {
        regNotes(CK_LT, fRES(notes));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * notes: {TEXT(65535)}
     * @param notes The value of notes as greaterEqual.
     */
    public void setNotes_GreaterEqual(final String notes) {
        regNotes(CK_GE, fRES(notes));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * notes: {TEXT(65535)}
     * @param notes The value of notes as lessEqual.
     */
    public void setNotes_LessEqual(final String notes) {
        regNotes(CK_LE, fRES(notes));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * notes: {TEXT(65535)}
     * @param notesList The collection of notes as inScope.
     */
    public void setNotes_InScope(final Collection<String> notesList) {
        doSetNotes_InScope(notesList);
    }

    public void doSetNotes_InScope(final Collection<String> notesList) {
        regINS(CK_INS, cTL(notesList), getCValueNotes(), "notes");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * notes: {TEXT(65535)}
     * @param notesList The collection of notes as notInScope.
     */
    public void setNotes_NotInScope(final Collection<String> notesList) {
        doSetNotes_NotInScope(notesList);
    }

    public void doSetNotes_NotInScope(final Collection<String> notesList) {
        regINS(CK_NINS, cTL(notesList), getCValueNotes(), "notes");
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * notes: {TEXT(65535)}
     * @param notes The value of notes as prefixSearch.
     */
    public void setNotes_PrefixSearch(final String notes) {
        setNotes_LikeSearch(notes, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * notes: {TEXT(65535)}
     * @param notes The value of notes as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setNotes_LikeSearch(final String notes,
            final LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(notes), getCValueNotes(), "notes", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * notes: {TEXT(65535)}
     * @param notes The value of notes as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setNotes_NotLikeSearch(final String notes,
            final LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(notes), getCValueNotes(), "notes", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * notes: {TEXT(65535)}
     */
    public void setNotes_IsNull() {
        regNotes(CK_ISN, DOBJ);
    }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br />
     * notes: {TEXT(65535)}
     */
    public void setNotes_IsNullOrEmpty() {
        regNotes(CK_ISNOE, DOBJ);
    }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * notes: {TEXT(65535)}
     */
    public void setNotes_IsNotNull() {
        regNotes(CK_ISNN, DOBJ);
    }

    protected void regNotes(final ConditionKey k, final Object v) {
        regQ(k, v, getCValueNotes(), "notes");
    }

    abstract protected ConditionValue getCValueNotes();

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO = (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_Equal()</span>.max(new SubQuery&lt;ImpasseExecutionHistoriesCB&gt;() {
     *     public void query(ImpasseExecutionHistoriesCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<ImpasseExecutionHistoriesCB> scalar_Equal() {
        return xcreateSSQFunction(CK_EQ.getOperand());
    }

    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO &lt;&gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_NotEqual()</span>.max(new SubQuery&lt;ImpasseExecutionHistoriesCB&gt;() {
     *     public void query(ImpasseExecutionHistoriesCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<ImpasseExecutionHistoriesCB> scalar_NotEqual() {
        return xcreateSSQFunction(CK_NES.getOperand());
    }

    /**
     * Prepare ScalarCondition as greaterThan. <br />
     * {where FOO &gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_GreaterThan()</span>.max(new SubQuery&lt;ImpasseExecutionHistoriesCB&gt;() {
     *     public void query(ImpasseExecutionHistoriesCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<ImpasseExecutionHistoriesCB> scalar_GreaterThan() {
        return xcreateSSQFunction(CK_GT.getOperand());
    }

    /**
     * Prepare ScalarCondition as lessThan. <br />
     * {where FOO &lt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_LessThan()</span>.max(new SubQuery&lt;ImpasseExecutionHistoriesCB&gt;() {
     *     public void query(ImpasseExecutionHistoriesCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<ImpasseExecutionHistoriesCB> scalar_LessThan() {
        return xcreateSSQFunction(CK_LT.getOperand());
    }

    /**
     * Prepare ScalarCondition as greaterEqual. <br />
     * {where FOO &gt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_GreaterEqual()</span>.max(new SubQuery&lt;ImpasseExecutionHistoriesCB&gt;() {
     *     public void query(ImpasseExecutionHistoriesCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<ImpasseExecutionHistoriesCB> scalar_GreaterEqual() {
        return xcreateSSQFunction(CK_GE.getOperand());
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br />
     * {where FOO &lt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_LessEqual()</span>.max(new SubQuery&lt;ImpasseExecutionHistoriesCB&gt;() {
     *     public void query(ImpasseExecutionHistoriesCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<ImpasseExecutionHistoriesCB> scalar_LessEqual() {
        return xcreateSSQFunction(CK_LE.getOperand());
    }

    protected HpSSQFunction<ImpasseExecutionHistoriesCB> xcreateSSQFunction(
            final String operand) {
        return new HpSSQFunction<ImpasseExecutionHistoriesCB>(
                new HpSSQSetupper<ImpasseExecutionHistoriesCB>() {
                    @Override
                    public void setup(
                            final String function,
                            final SubQuery<ImpasseExecutionHistoriesCB> subQuery,
                            final HpSSQOption<ImpasseExecutionHistoriesCB> option) {
                        xscalarCondition(function, subQuery, operand, option);
                    }
                });
    }

    protected void xscalarCondition(final String function,
            final SubQuery<ImpasseExecutionHistoriesCB> subQuery,
            final String operand,
            final HpSSQOption<ImpasseExecutionHistoriesCB> option) {
        assertObjectNotNull("subQuery<ImpasseExecutionHistoriesCB>", subQuery);
        final ImpasseExecutionHistoriesCB cb = xcreateScalarConditionCB();
        subQuery.query(cb);
        final String subQueryPropertyName = keepScalarCondition(cb.query()); // for saving query-value
        option.setPartitionByCBean(xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(function, cb.query(), subQueryPropertyName,
                operand, option);
    }

    public abstract String keepScalarCondition(
            ImpasseExecutionHistoriesCQ subQuery);

    protected ImpasseExecutionHistoriesCB xcreateScalarConditionCB() {
        final ImpasseExecutionHistoriesCB cb = new ImpasseExecutionHistoriesCB();
        cb.xsetupForScalarCondition(this);
        return cb;
    }

    protected ImpasseExecutionHistoriesCB xcreateScalarConditionPartitionByCB() {
        final ImpasseExecutionHistoriesCB cb = new ImpasseExecutionHistoriesCB();
        cb.xsetupForScalarConditionPartitionBy(this);
        return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(final String function,
            final SubQuery<ImpasseExecutionHistoriesCB> subQuery,
            final String aliasName, final DerivedReferrerOption option) {
        assertObjectNotNull("subQuery<ImpasseExecutionHistoriesCB>", subQuery);
        final ImpasseExecutionHistoriesCB cb = new ImpasseExecutionHistoriesCB();
        cb.xsetupForDerivedReferrer(this);
        subQuery.query(cb);
        final String subQueryPropertyName = keepSpecifyMyselfDerived(cb.query()); // for saving query-value.
        registerSpecifyMyselfDerived(function, cb.query(), "id", "id",
                subQueryPropertyName, "myselfDerived", aliasName, option);
    }

    public abstract String keepSpecifyMyselfDerived(
            ImpasseExecutionHistoriesCQ subQuery);

    /**
     * Prepare for (Query)MyselfDerived (SubQuery).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<ImpasseExecutionHistoriesCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived();
    }

    protected HpQDRFunction<ImpasseExecutionHistoriesCB> xcreateQDRFunctionMyselfDerived() {
        return new HpQDRFunction<ImpasseExecutionHistoriesCB>(
                new HpQDRSetupper<ImpasseExecutionHistoriesCB>() {
                    @Override
                    public void setup(
                            final String function,
                            final SubQuery<ImpasseExecutionHistoriesCB> subQuery,
                            final String operand, final Object value,
                            final DerivedReferrerOption option) {
                        xqderiveMyselfDerived(function, subQuery, operand,
                                value, option);
                    }
                });
    }

    public void xqderiveMyselfDerived(final String function,
            final SubQuery<ImpasseExecutionHistoriesCB> subQuery,
            final String operand, final Object value,
            final DerivedReferrerOption option) {
        assertObjectNotNull("subQuery<ImpasseExecutionHistoriesCB>", subQuery);
        final ImpasseExecutionHistoriesCB cb = new ImpasseExecutionHistoriesCB();
        cb.xsetupForDerivedReferrer(this);
        subQuery.query(cb);
        final String subQueryPropertyName = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        final String parameterPropertyName = keepQueryMyselfDerivedParameter(value);
        registerQueryMyselfDerived(function, cb.query(), "id", "id",
                subQueryPropertyName, "myselfDerived", operand, value,
                parameterPropertyName, option);
    }

    public abstract String keepQueryMyselfDerived(
            ImpasseExecutionHistoriesCQ subQuery);

    public abstract String keepQueryMyselfDerivedParameter(Object parameterValue);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (SubQuery).
     * @param subQuery The implementation of sub query. (NotNull)
     */
    public void myselfExists(
            final SubQuery<ImpasseExecutionHistoriesCB> subQuery) {
        assertObjectNotNull("subQuery<ImpasseExecutionHistoriesCB>", subQuery);
        final ImpasseExecutionHistoriesCB cb = new ImpasseExecutionHistoriesCB();
        cb.xsetupForMyselfExists(this);
        subQuery.query(cb);
        final String subQueryPropertyName = keepMyselfExists(cb.query()); // for saving query-value.
        registerMyselfExists(cb.query(), subQueryPropertyName);
    }

    public abstract String keepMyselfExists(ImpasseExecutionHistoriesCQ subQuery);

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    /**
     * Prepare for MyselfInScope (SubQuery).
     * @param subQuery The implementation of sub query. (NotNull)
     */
    public void myselfInScope(
            final SubQuery<ImpasseExecutionHistoriesCB> subQuery) {
        assertObjectNotNull("subQuery<ImpasseExecutionHistoriesCB>", subQuery);
        final ImpasseExecutionHistoriesCB cb = new ImpasseExecutionHistoriesCB();
        cb.xsetupForMyselfInScope(this);
        subQuery.query(cb);
        final String subQueryPropertyName = keepMyselfInScope(cb.query()); // for saving query-value.
        registerMyselfInScope(cb.query(), subQueryPropertyName);
    }

    public abstract String keepMyselfInScope(
            ImpasseExecutionHistoriesCQ subQuery);

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use TestLinkImport')
    protected String xabCB() {
        return ImpasseExecutionHistoriesCB.class.getName();
    }

    protected String xabCQ() {
        return ImpasseExecutionHistoriesCQ.class.getName();
    }

    protected String xabLSO() {
        return LikeSearchOption.class.getName();
    }

    protected String xabSSQS() {
        return HpSSQSetupper.class.getName();
    }
}
