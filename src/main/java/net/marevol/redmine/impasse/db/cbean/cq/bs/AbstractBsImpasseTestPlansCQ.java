package net.marevol.redmine.impasse.db.cbean.cq.bs;

import java.util.Collection;

import net.marevol.redmine.impasse.db.allcommon.DBMetaInstanceHandler;
import net.marevol.redmine.impasse.db.cbean.ImpasseTestPlansCB;
import net.marevol.redmine.impasse.db.cbean.cq.ImpasseTestPlansCQ;

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
 * The abstract condition-query of impasse_test_plans.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsImpasseTestPlansCQ extends
        AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsImpasseTestPlansCQ(final ConditionQuery childQuery,
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
        return "impasse_test_plans";
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
     * version_id: {IX, NotNull, INT(10)}
     * @param versionId The value of versionId as equal.
     */
    public void setVersionId_Equal(final Integer versionId) {
        doSetVersionId_Equal(versionId);
    }

    protected void doSetVersionId_Equal(final Integer versionId) {
        regVersionId(CK_EQ, versionId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * version_id: {IX, NotNull, INT(10)}
     * @param versionId The value of versionId as notEqual.
     */
    public void setVersionId_NotEqual(final Integer versionId) {
        doSetVersionId_NotEqual(versionId);
    }

    protected void doSetVersionId_NotEqual(final Integer versionId) {
        regVersionId(CK_NES, versionId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * version_id: {IX, NotNull, INT(10)}
     * @param versionId The value of versionId as greaterThan.
     */
    public void setVersionId_GreaterThan(final Integer versionId) {
        regVersionId(CK_GT, versionId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * version_id: {IX, NotNull, INT(10)}
     * @param versionId The value of versionId as lessThan.
     */
    public void setVersionId_LessThan(final Integer versionId) {
        regVersionId(CK_LT, versionId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * version_id: {IX, NotNull, INT(10)}
     * @param versionId The value of versionId as greaterEqual.
     */
    public void setVersionId_GreaterEqual(final Integer versionId) {
        regVersionId(CK_GE, versionId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * version_id: {IX, NotNull, INT(10)}
     * @param versionId The value of versionId as lessEqual.
     */
    public void setVersionId_LessEqual(final Integer versionId) {
        regVersionId(CK_LE, versionId);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * version_id: {IX, NotNull, INT(10)}
     * @param minNumber The min number of versionId. (NullAllowed)
     * @param maxNumber The max number of versionId. (NullAllowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setVersionId_RangeOf(final Integer minNumber,
            final Integer maxNumber, final RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueVersionId(), "version_id",
                rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * version_id: {IX, NotNull, INT(10)}
     * @param versionIdList The collection of versionId as inScope.
     */
    public void setVersionId_InScope(final Collection<Integer> versionIdList) {
        doSetVersionId_InScope(versionIdList);
    }

    protected void doSetVersionId_InScope(
            final Collection<Integer> versionIdList) {
        regINS(CK_INS, cTL(versionIdList), getCValueVersionId(), "version_id");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * version_id: {IX, NotNull, INT(10)}
     * @param versionIdList The collection of versionId as notInScope.
     */
    public void setVersionId_NotInScope(final Collection<Integer> versionIdList) {
        doSetVersionId_NotInScope(versionIdList);
    }

    protected void doSetVersionId_NotInScope(
            final Collection<Integer> versionIdList) {
        regINS(CK_NINS, cTL(versionIdList), getCValueVersionId(), "version_id");
    }

    protected void regVersionId(final ConditionKey k, final Object v) {
        regQ(k, v, getCValueVersionId(), "version_id");
    }

    abstract protected ConditionValue getCValueVersionId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * name: {NotNull, VARCHAR(255)}
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
     * name: {NotNull, VARCHAR(255)}
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
     * name: {NotNull, VARCHAR(255)}
     * @param name The value of name as greaterThan.
     */
    public void setName_GreaterThan(final String name) {
        regName(CK_GT, fRES(name));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * name: {NotNull, VARCHAR(255)}
     * @param name The value of name as lessThan.
     */
    public void setName_LessThan(final String name) {
        regName(CK_LT, fRES(name));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * name: {NotNull, VARCHAR(255)}
     * @param name The value of name as greaterEqual.
     */
    public void setName_GreaterEqual(final String name) {
        regName(CK_GE, fRES(name));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * name: {NotNull, VARCHAR(255)}
     * @param name The value of name as lessEqual.
     */
    public void setName_LessEqual(final String name) {
        regName(CK_LE, fRES(name));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * name: {NotNull, VARCHAR(255)}
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
     * name: {NotNull, VARCHAR(255)}
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
     * name: {NotNull, VARCHAR(255)}
     * @param name The value of name as prefixSearch.
     */
    public void setName_PrefixSearch(final String name) {
        setName_LikeSearch(name, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * name: {NotNull, VARCHAR(255)}
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
     * name: {NotNull, VARCHAR(255)}
     * @param name The value of name as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setName_NotLikeSearch(final String name,
            final LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(name), getCValueName(), "name", likeSearchOption);
    }

    protected void regName(final ConditionKey k, final Object v) {
        regQ(k, v, getCValueName(), "name");
    }

    abstract protected ConditionValue getCValueName();

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

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * active: {BIT}
     * @param active The value of active as equal.
     */
    public void setActive_Equal(final Boolean active) {
        regActive(CK_EQ, active);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * active: {BIT}
     */
    public void setActive_IsNull() {
        regActive(CK_ISN, DOBJ);
    }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * active: {BIT}
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
     * cb.query().<span style="color: #FD4747">scalar_Equal()</span>.max(new SubQuery&lt;ImpasseTestPlansCB&gt;() {
     *     public void query(ImpasseTestPlansCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<ImpasseTestPlansCB> scalar_Equal() {
        return xcreateSSQFunction(CK_EQ.getOperand());
    }

    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO &lt;&gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_NotEqual()</span>.max(new SubQuery&lt;ImpasseTestPlansCB&gt;() {
     *     public void query(ImpasseTestPlansCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<ImpasseTestPlansCB> scalar_NotEqual() {
        return xcreateSSQFunction(CK_NES.getOperand());
    }

    /**
     * Prepare ScalarCondition as greaterThan. <br />
     * {where FOO &gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_GreaterThan()</span>.max(new SubQuery&lt;ImpasseTestPlansCB&gt;() {
     *     public void query(ImpasseTestPlansCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<ImpasseTestPlansCB> scalar_GreaterThan() {
        return xcreateSSQFunction(CK_GT.getOperand());
    }

    /**
     * Prepare ScalarCondition as lessThan. <br />
     * {where FOO &lt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_LessThan()</span>.max(new SubQuery&lt;ImpasseTestPlansCB&gt;() {
     *     public void query(ImpasseTestPlansCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<ImpasseTestPlansCB> scalar_LessThan() {
        return xcreateSSQFunction(CK_LT.getOperand());
    }

    /**
     * Prepare ScalarCondition as greaterEqual. <br />
     * {where FOO &gt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_GreaterEqual()</span>.max(new SubQuery&lt;ImpasseTestPlansCB&gt;() {
     *     public void query(ImpasseTestPlansCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<ImpasseTestPlansCB> scalar_GreaterEqual() {
        return xcreateSSQFunction(CK_GE.getOperand());
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br />
     * {where FOO &lt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_LessEqual()</span>.max(new SubQuery&lt;ImpasseTestPlansCB&gt;() {
     *     public void query(ImpasseTestPlansCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<ImpasseTestPlansCB> scalar_LessEqual() {
        return xcreateSSQFunction(CK_LE.getOperand());
    }

    protected HpSSQFunction<ImpasseTestPlansCB> xcreateSSQFunction(
            final String operand) {
        return new HpSSQFunction<ImpasseTestPlansCB>(
                new HpSSQSetupper<ImpasseTestPlansCB>() {
                    @Override
                    public void setup(final String function,
                            final SubQuery<ImpasseTestPlansCB> subQuery,
                            final HpSSQOption<ImpasseTestPlansCB> option) {
                        xscalarCondition(function, subQuery, operand, option);
                    }
                });
    }

    protected void xscalarCondition(final String function,
            final SubQuery<ImpasseTestPlansCB> subQuery, final String operand,
            final HpSSQOption<ImpasseTestPlansCB> option) {
        assertObjectNotNull("subQuery<ImpasseTestPlansCB>", subQuery);
        final ImpasseTestPlansCB cb = xcreateScalarConditionCB();
        subQuery.query(cb);
        final String subQueryPropertyName = keepScalarCondition(cb.query()); // for saving query-value
        option.setPartitionByCBean(xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(function, cb.query(), subQueryPropertyName,
                operand, option);
    }

    public abstract String keepScalarCondition(ImpasseTestPlansCQ subQuery);

    protected ImpasseTestPlansCB xcreateScalarConditionCB() {
        final ImpasseTestPlansCB cb = new ImpasseTestPlansCB();
        cb.xsetupForScalarCondition(this);
        return cb;
    }

    protected ImpasseTestPlansCB xcreateScalarConditionPartitionByCB() {
        final ImpasseTestPlansCB cb = new ImpasseTestPlansCB();
        cb.xsetupForScalarConditionPartitionBy(this);
        return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(final String function,
            final SubQuery<ImpasseTestPlansCB> subQuery,
            final String aliasName, final DerivedReferrerOption option) {
        assertObjectNotNull("subQuery<ImpasseTestPlansCB>", subQuery);
        final ImpasseTestPlansCB cb = new ImpasseTestPlansCB();
        cb.xsetupForDerivedReferrer(this);
        subQuery.query(cb);
        final String subQueryPropertyName = keepSpecifyMyselfDerived(cb.query()); // for saving query-value.
        registerSpecifyMyselfDerived(function, cb.query(), "id", "id",
                subQueryPropertyName, "myselfDerived", aliasName, option);
    }

    public abstract String keepSpecifyMyselfDerived(ImpasseTestPlansCQ subQuery);

    /**
     * Prepare for (Query)MyselfDerived (SubQuery).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<ImpasseTestPlansCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived();
    }

    protected HpQDRFunction<ImpasseTestPlansCB> xcreateQDRFunctionMyselfDerived() {
        return new HpQDRFunction<ImpasseTestPlansCB>(
                new HpQDRSetupper<ImpasseTestPlansCB>() {
                    @Override
                    public void setup(final String function,
                            final SubQuery<ImpasseTestPlansCB> subQuery,
                            final String operand, final Object value,
                            final DerivedReferrerOption option) {
                        xqderiveMyselfDerived(function, subQuery, operand,
                                value, option);
                    }
                });
    }

    public void xqderiveMyselfDerived(final String function,
            final SubQuery<ImpasseTestPlansCB> subQuery, final String operand,
            final Object value, final DerivedReferrerOption option) {
        assertObjectNotNull("subQuery<ImpasseTestPlansCB>", subQuery);
        final ImpasseTestPlansCB cb = new ImpasseTestPlansCB();
        cb.xsetupForDerivedReferrer(this);
        subQuery.query(cb);
        final String subQueryPropertyName = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        final String parameterPropertyName = keepQueryMyselfDerivedParameter(value);
        registerQueryMyselfDerived(function, cb.query(), "id", "id",
                subQueryPropertyName, "myselfDerived", operand, value,
                parameterPropertyName, option);
    }

    public abstract String keepQueryMyselfDerived(ImpasseTestPlansCQ subQuery);

    public abstract String keepQueryMyselfDerivedParameter(Object parameterValue);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (SubQuery).
     * @param subQuery The implementation of sub query. (NotNull)
     */
    public void myselfExists(final SubQuery<ImpasseTestPlansCB> subQuery) {
        assertObjectNotNull("subQuery<ImpasseTestPlansCB>", subQuery);
        final ImpasseTestPlansCB cb = new ImpasseTestPlansCB();
        cb.xsetupForMyselfExists(this);
        subQuery.query(cb);
        final String subQueryPropertyName = keepMyselfExists(cb.query()); // for saving query-value.
        registerMyselfExists(cb.query(), subQueryPropertyName);
    }

    public abstract String keepMyselfExists(ImpasseTestPlansCQ subQuery);

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    /**
     * Prepare for MyselfInScope (SubQuery).
     * @param subQuery The implementation of sub query. (NotNull)
     */
    public void myselfInScope(final SubQuery<ImpasseTestPlansCB> subQuery) {
        assertObjectNotNull("subQuery<ImpasseTestPlansCB>", subQuery);
        final ImpasseTestPlansCB cb = new ImpasseTestPlansCB();
        cb.xsetupForMyselfInScope(this);
        subQuery.query(cb);
        final String subQueryPropertyName = keepMyselfInScope(cb.query()); // for saving query-value.
        registerMyselfInScope(cb.query(), subQueryPropertyName);
    }

    public abstract String keepMyselfInScope(ImpasseTestPlansCQ subQuery);

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabCB() {
        return ImpasseTestPlansCB.class.getName();
    }

    protected String xabCQ() {
        return ImpasseTestPlansCQ.class.getName();
    }

    protected String xabLSO() {
        return LikeSearchOption.class.getName();
    }

    protected String xabSSQS() {
        return HpSSQSetupper.class.getName();
    }
}
