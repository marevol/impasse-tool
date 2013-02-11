package net.marevol.redmine.impasse.db.cbean.cq.bs;

import java.util.Collection;

import net.marevol.redmine.impasse.db.allcommon.DBMetaInstanceHandler;
import net.marevol.redmine.impasse.db.cbean.ImpasseSettingsCB;
import net.marevol.redmine.impasse.db.cbean.cq.ImpasseSettingsCQ;

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
 * The abstract condition-query of impasse_settings.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsImpasseSettingsCQ extends
        AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsImpasseSettingsCQ(final ConditionQuery childQuery,
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
        return "impasse_settings";
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
     * project_id: {IX, NotNull, INT(10)}
     * @param projectId The value of projectId as equal.
     */
    public void setProjectId_Equal(final Integer projectId) {
        doSetProjectId_Equal(projectId);
    }

    protected void doSetProjectId_Equal(final Integer projectId) {
        regProjectId(CK_EQ, projectId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * project_id: {IX, NotNull, INT(10)}
     * @param projectId The value of projectId as notEqual.
     */
    public void setProjectId_NotEqual(final Integer projectId) {
        doSetProjectId_NotEqual(projectId);
    }

    protected void doSetProjectId_NotEqual(final Integer projectId) {
        regProjectId(CK_NES, projectId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * project_id: {IX, NotNull, INT(10)}
     * @param projectId The value of projectId as greaterThan.
     */
    public void setProjectId_GreaterThan(final Integer projectId) {
        regProjectId(CK_GT, projectId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * project_id: {IX, NotNull, INT(10)}
     * @param projectId The value of projectId as lessThan.
     */
    public void setProjectId_LessThan(final Integer projectId) {
        regProjectId(CK_LT, projectId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * project_id: {IX, NotNull, INT(10)}
     * @param projectId The value of projectId as greaterEqual.
     */
    public void setProjectId_GreaterEqual(final Integer projectId) {
        regProjectId(CK_GE, projectId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * project_id: {IX, NotNull, INT(10)}
     * @param projectId The value of projectId as lessEqual.
     */
    public void setProjectId_LessEqual(final Integer projectId) {
        regProjectId(CK_LE, projectId);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * project_id: {IX, NotNull, INT(10)}
     * @param minNumber The min number of projectId. (NullAllowed)
     * @param maxNumber The max number of projectId. (NullAllowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setProjectId_RangeOf(final Integer minNumber,
            final Integer maxNumber, final RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueProjectId(), "project_id",
                rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * project_id: {IX, NotNull, INT(10)}
     * @param projectIdList The collection of projectId as inScope.
     */
    public void setProjectId_InScope(final Collection<Integer> projectIdList) {
        doSetProjectId_InScope(projectIdList);
    }

    protected void doSetProjectId_InScope(
            final Collection<Integer> projectIdList) {
        regINS(CK_INS, cTL(projectIdList), getCValueProjectId(), "project_id");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * project_id: {IX, NotNull, INT(10)}
     * @param projectIdList The collection of projectId as notInScope.
     */
    public void setProjectId_NotInScope(final Collection<Integer> projectIdList) {
        doSetProjectId_NotInScope(projectIdList);
    }

    protected void doSetProjectId_NotInScope(
            final Collection<Integer> projectIdList) {
        regINS(CK_NINS, cTL(projectIdList), getCValueProjectId(), "project_id");
    }

    protected void regProjectId(final ConditionKey k, final Object v) {
        regQ(k, v, getCValueProjectId(), "project_id");
    }

    abstract protected ConditionValue getCValueProjectId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * bug_tracker_id: {INT(10)}
     * @param bugTrackerId The value of bugTrackerId as equal.
     */
    public void setBugTrackerId_Equal(final Integer bugTrackerId) {
        doSetBugTrackerId_Equal(bugTrackerId);
    }

    protected void doSetBugTrackerId_Equal(final Integer bugTrackerId) {
        regBugTrackerId(CK_EQ, bugTrackerId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * bug_tracker_id: {INT(10)}
     * @param bugTrackerId The value of bugTrackerId as notEqual.
     */
    public void setBugTrackerId_NotEqual(final Integer bugTrackerId) {
        doSetBugTrackerId_NotEqual(bugTrackerId);
    }

    protected void doSetBugTrackerId_NotEqual(final Integer bugTrackerId) {
        regBugTrackerId(CK_NES, bugTrackerId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * bug_tracker_id: {INT(10)}
     * @param bugTrackerId The value of bugTrackerId as greaterThan.
     */
    public void setBugTrackerId_GreaterThan(final Integer bugTrackerId) {
        regBugTrackerId(CK_GT, bugTrackerId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * bug_tracker_id: {INT(10)}
     * @param bugTrackerId The value of bugTrackerId as lessThan.
     */
    public void setBugTrackerId_LessThan(final Integer bugTrackerId) {
        regBugTrackerId(CK_LT, bugTrackerId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * bug_tracker_id: {INT(10)}
     * @param bugTrackerId The value of bugTrackerId as greaterEqual.
     */
    public void setBugTrackerId_GreaterEqual(final Integer bugTrackerId) {
        regBugTrackerId(CK_GE, bugTrackerId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * bug_tracker_id: {INT(10)}
     * @param bugTrackerId The value of bugTrackerId as lessEqual.
     */
    public void setBugTrackerId_LessEqual(final Integer bugTrackerId) {
        regBugTrackerId(CK_LE, bugTrackerId);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * bug_tracker_id: {INT(10)}
     * @param minNumber The min number of bugTrackerId. (NullAllowed)
     * @param maxNumber The max number of bugTrackerId. (NullAllowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setBugTrackerId_RangeOf(final Integer minNumber,
            final Integer maxNumber, final RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueBugTrackerId(), "bug_tracker_id",
                rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * bug_tracker_id: {INT(10)}
     * @param bugTrackerIdList The collection of bugTrackerId as inScope.
     */
    public void setBugTrackerId_InScope(
            final Collection<Integer> bugTrackerIdList) {
        doSetBugTrackerId_InScope(bugTrackerIdList);
    }

    protected void doSetBugTrackerId_InScope(
            final Collection<Integer> bugTrackerIdList) {
        regINS(CK_INS, cTL(bugTrackerIdList), getCValueBugTrackerId(),
                "bug_tracker_id");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * bug_tracker_id: {INT(10)}
     * @param bugTrackerIdList The collection of bugTrackerId as notInScope.
     */
    public void setBugTrackerId_NotInScope(
            final Collection<Integer> bugTrackerIdList) {
        doSetBugTrackerId_NotInScope(bugTrackerIdList);
    }

    protected void doSetBugTrackerId_NotInScope(
            final Collection<Integer> bugTrackerIdList) {
        regINS(CK_NINS, cTL(bugTrackerIdList), getCValueBugTrackerId(),
                "bug_tracker_id");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * bug_tracker_id: {INT(10)}
     */
    public void setBugTrackerId_IsNull() {
        regBugTrackerId(CK_ISN, DOBJ);
    }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * bug_tracker_id: {INT(10)}
     */
    public void setBugTrackerId_IsNotNull() {
        regBugTrackerId(CK_ISNN, DOBJ);
    }

    protected void regBugTrackerId(final ConditionKey k, final Object v) {
        regQ(k, v, getCValueBugTrackerId(), "bug_tracker_id");
    }

    abstract protected ConditionValue getCValueBugTrackerId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * requirement_tracker: {VARCHAR(255)}
     * @param requirementTracker The value of requirementTracker as equal.
     */
    public void setRequirementTracker_Equal(final String requirementTracker) {
        doSetRequirementTracker_Equal(fRES(requirementTracker));
    }

    protected void doSetRequirementTracker_Equal(final String requirementTracker) {
        regRequirementTracker(CK_EQ, requirementTracker);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * requirement_tracker: {VARCHAR(255)}
     * @param requirementTracker The value of requirementTracker as notEqual.
     */
    public void setRequirementTracker_NotEqual(final String requirementTracker) {
        doSetRequirementTracker_NotEqual(fRES(requirementTracker));
    }

    protected void doSetRequirementTracker_NotEqual(
            final String requirementTracker) {
        regRequirementTracker(CK_NES, requirementTracker);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * requirement_tracker: {VARCHAR(255)}
     * @param requirementTracker The value of requirementTracker as greaterThan.
     */
    public void setRequirementTracker_GreaterThan(
            final String requirementTracker) {
        regRequirementTracker(CK_GT, fRES(requirementTracker));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * requirement_tracker: {VARCHAR(255)}
     * @param requirementTracker The value of requirementTracker as lessThan.
     */
    public void setRequirementTracker_LessThan(final String requirementTracker) {
        regRequirementTracker(CK_LT, fRES(requirementTracker));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * requirement_tracker: {VARCHAR(255)}
     * @param requirementTracker The value of requirementTracker as greaterEqual.
     */
    public void setRequirementTracker_GreaterEqual(
            final String requirementTracker) {
        regRequirementTracker(CK_GE, fRES(requirementTracker));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * requirement_tracker: {VARCHAR(255)}
     * @param requirementTracker The value of requirementTracker as lessEqual.
     */
    public void setRequirementTracker_LessEqual(final String requirementTracker) {
        regRequirementTracker(CK_LE, fRES(requirementTracker));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * requirement_tracker: {VARCHAR(255)}
     * @param requirementTrackerList The collection of requirementTracker as inScope.
     */
    public void setRequirementTracker_InScope(
            final Collection<String> requirementTrackerList) {
        doSetRequirementTracker_InScope(requirementTrackerList);
    }

    public void doSetRequirementTracker_InScope(
            final Collection<String> requirementTrackerList) {
        regINS(CK_INS, cTL(requirementTrackerList),
                getCValueRequirementTracker(), "requirement_tracker");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * requirement_tracker: {VARCHAR(255)}
     * @param requirementTrackerList The collection of requirementTracker as notInScope.
     */
    public void setRequirementTracker_NotInScope(
            final Collection<String> requirementTrackerList) {
        doSetRequirementTracker_NotInScope(requirementTrackerList);
    }

    public void doSetRequirementTracker_NotInScope(
            final Collection<String> requirementTrackerList) {
        regINS(CK_NINS, cTL(requirementTrackerList),
                getCValueRequirementTracker(), "requirement_tracker");
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * requirement_tracker: {VARCHAR(255)}
     * @param requirementTracker The value of requirementTracker as prefixSearch.
     */
    public void setRequirementTracker_PrefixSearch(
            final String requirementTracker) {
        setRequirementTracker_LikeSearch(requirementTracker, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * requirement_tracker: {VARCHAR(255)}
     * @param requirementTracker The value of requirementTracker as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setRequirementTracker_LikeSearch(
            final String requirementTracker,
            final LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(requirementTracker), getCValueRequirementTracker(),
                "requirement_tracker", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * requirement_tracker: {VARCHAR(255)}
     * @param requirementTracker The value of requirementTracker as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setRequirementTracker_NotLikeSearch(
            final String requirementTracker,
            final LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(requirementTracker), getCValueRequirementTracker(),
                "requirement_tracker", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * requirement_tracker: {VARCHAR(255)}
     */
    public void setRequirementTracker_IsNull() {
        regRequirementTracker(CK_ISN, DOBJ);
    }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br />
     * requirement_tracker: {VARCHAR(255)}
     */
    public void setRequirementTracker_IsNullOrEmpty() {
        regRequirementTracker(CK_ISNOE, DOBJ);
    }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * requirement_tracker: {VARCHAR(255)}
     */
    public void setRequirementTracker_IsNotNull() {
        regRequirementTracker(CK_ISNN, DOBJ);
    }

    protected void regRequirementTracker(final ConditionKey k, final Object v) {
        regQ(k, v, getCValueRequirementTracker(), "requirement_tracker");
    }

    abstract protected ConditionValue getCValueRequirementTracker();

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO = (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_Equal()</span>.max(new SubQuery&lt;ImpasseSettingsCB&gt;() {
     *     public void query(ImpasseSettingsCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<ImpasseSettingsCB> scalar_Equal() {
        return xcreateSSQFunction(CK_EQ.getOperand());
    }

    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO &lt;&gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_NotEqual()</span>.max(new SubQuery&lt;ImpasseSettingsCB&gt;() {
     *     public void query(ImpasseSettingsCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<ImpasseSettingsCB> scalar_NotEqual() {
        return xcreateSSQFunction(CK_NES.getOperand());
    }

    /**
     * Prepare ScalarCondition as greaterThan. <br />
     * {where FOO &gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_GreaterThan()</span>.max(new SubQuery&lt;ImpasseSettingsCB&gt;() {
     *     public void query(ImpasseSettingsCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<ImpasseSettingsCB> scalar_GreaterThan() {
        return xcreateSSQFunction(CK_GT.getOperand());
    }

    /**
     * Prepare ScalarCondition as lessThan. <br />
     * {where FOO &lt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_LessThan()</span>.max(new SubQuery&lt;ImpasseSettingsCB&gt;() {
     *     public void query(ImpasseSettingsCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<ImpasseSettingsCB> scalar_LessThan() {
        return xcreateSSQFunction(CK_LT.getOperand());
    }

    /**
     * Prepare ScalarCondition as greaterEqual. <br />
     * {where FOO &gt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_GreaterEqual()</span>.max(new SubQuery&lt;ImpasseSettingsCB&gt;() {
     *     public void query(ImpasseSettingsCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<ImpasseSettingsCB> scalar_GreaterEqual() {
        return xcreateSSQFunction(CK_GE.getOperand());
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br />
     * {where FOO &lt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_LessEqual()</span>.max(new SubQuery&lt;ImpasseSettingsCB&gt;() {
     *     public void query(ImpasseSettingsCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<ImpasseSettingsCB> scalar_LessEqual() {
        return xcreateSSQFunction(CK_LE.getOperand());
    }

    protected HpSSQFunction<ImpasseSettingsCB> xcreateSSQFunction(
            final String operand) {
        return new HpSSQFunction<ImpasseSettingsCB>(
                new HpSSQSetupper<ImpasseSettingsCB>() {
                    @Override
                    public void setup(final String function,
                            final SubQuery<ImpasseSettingsCB> subQuery,
                            final HpSSQOption<ImpasseSettingsCB> option) {
                        xscalarCondition(function, subQuery, operand, option);
                    }
                });
    }

    protected void xscalarCondition(final String function,
            final SubQuery<ImpasseSettingsCB> subQuery, final String operand,
            final HpSSQOption<ImpasseSettingsCB> option) {
        assertObjectNotNull("subQuery<ImpasseSettingsCB>", subQuery);
        final ImpasseSettingsCB cb = xcreateScalarConditionCB();
        subQuery.query(cb);
        final String subQueryPropertyName = keepScalarCondition(cb.query()); // for saving query-value
        option.setPartitionByCBean(xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(function, cb.query(), subQueryPropertyName,
                operand, option);
    }

    public abstract String keepScalarCondition(ImpasseSettingsCQ subQuery);

    protected ImpasseSettingsCB xcreateScalarConditionCB() {
        final ImpasseSettingsCB cb = new ImpasseSettingsCB();
        cb.xsetupForScalarCondition(this);
        return cb;
    }

    protected ImpasseSettingsCB xcreateScalarConditionPartitionByCB() {
        final ImpasseSettingsCB cb = new ImpasseSettingsCB();
        cb.xsetupForScalarConditionPartitionBy(this);
        return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(final String function,
            final SubQuery<ImpasseSettingsCB> subQuery, final String aliasName,
            final DerivedReferrerOption option) {
        assertObjectNotNull("subQuery<ImpasseSettingsCB>", subQuery);
        final ImpasseSettingsCB cb = new ImpasseSettingsCB();
        cb.xsetupForDerivedReferrer(this);
        subQuery.query(cb);
        final String subQueryPropertyName = keepSpecifyMyselfDerived(cb.query()); // for saving query-value.
        registerSpecifyMyselfDerived(function, cb.query(), "id", "id",
                subQueryPropertyName, "myselfDerived", aliasName, option);
    }

    public abstract String keepSpecifyMyselfDerived(ImpasseSettingsCQ subQuery);

    /**
     * Prepare for (Query)MyselfDerived (SubQuery).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<ImpasseSettingsCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived();
    }

    protected HpQDRFunction<ImpasseSettingsCB> xcreateQDRFunctionMyselfDerived() {
        return new HpQDRFunction<ImpasseSettingsCB>(
                new HpQDRSetupper<ImpasseSettingsCB>() {
                    @Override
                    public void setup(final String function,
                            final SubQuery<ImpasseSettingsCB> subQuery,
                            final String operand, final Object value,
                            final DerivedReferrerOption option) {
                        xqderiveMyselfDerived(function, subQuery, operand,
                                value, option);
                    }
                });
    }

    public void xqderiveMyselfDerived(final String function,
            final SubQuery<ImpasseSettingsCB> subQuery, final String operand,
            final Object value, final DerivedReferrerOption option) {
        assertObjectNotNull("subQuery<ImpasseSettingsCB>", subQuery);
        final ImpasseSettingsCB cb = new ImpasseSettingsCB();
        cb.xsetupForDerivedReferrer(this);
        subQuery.query(cb);
        final String subQueryPropertyName = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        final String parameterPropertyName = keepQueryMyselfDerivedParameter(value);
        registerQueryMyselfDerived(function, cb.query(), "id", "id",
                subQueryPropertyName, "myselfDerived", operand, value,
                parameterPropertyName, option);
    }

    public abstract String keepQueryMyselfDerived(ImpasseSettingsCQ subQuery);

    public abstract String keepQueryMyselfDerivedParameter(Object parameterValue);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (SubQuery).
     * @param subQuery The implementation of sub query. (NotNull)
     */
    public void myselfExists(final SubQuery<ImpasseSettingsCB> subQuery) {
        assertObjectNotNull("subQuery<ImpasseSettingsCB>", subQuery);
        final ImpasseSettingsCB cb = new ImpasseSettingsCB();
        cb.xsetupForMyselfExists(this);
        subQuery.query(cb);
        final String subQueryPropertyName = keepMyselfExists(cb.query()); // for saving query-value.
        registerMyselfExists(cb.query(), subQueryPropertyName);
    }

    public abstract String keepMyselfExists(ImpasseSettingsCQ subQuery);

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    /**
     * Prepare for MyselfInScope (SubQuery).
     * @param subQuery The implementation of sub query. (NotNull)
     */
    public void myselfInScope(final SubQuery<ImpasseSettingsCB> subQuery) {
        assertObjectNotNull("subQuery<ImpasseSettingsCB>", subQuery);
        final ImpasseSettingsCB cb = new ImpasseSettingsCB();
        cb.xsetupForMyselfInScope(this);
        subQuery.query(cb);
        final String subQueryPropertyName = keepMyselfInScope(cb.query()); // for saving query-value.
        registerMyselfInScope(cb.query(), subQueryPropertyName);
    }

    public abstract String keepMyselfInScope(ImpasseSettingsCQ subQuery);

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabCB() {
        return ImpasseSettingsCB.class.getName();
    }

    protected String xabCQ() {
        return ImpasseSettingsCQ.class.getName();
    }

    protected String xabLSO() {
        return LikeSearchOption.class.getName();
    }

    protected String xabSSQS() {
        return HpSSQSetupper.class.getName();
    }
}
