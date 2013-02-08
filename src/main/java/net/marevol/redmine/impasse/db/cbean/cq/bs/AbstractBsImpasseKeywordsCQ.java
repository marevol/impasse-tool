package net.marevol.redmine.impasse.db.cbean.cq.bs;

import java.util.Collection;

import net.marevol.redmine.impasse.db.allcommon.DBMetaInstanceHandler;
import net.marevol.redmine.impasse.db.cbean.ImpasseKeywordsCB;
import net.marevol.redmine.impasse.db.cbean.cq.ImpasseKeywordsCQ;

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
 * The abstract condition-query of impasse_keywords.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsImpasseKeywordsCQ extends
        AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsImpasseKeywordsCQ(final ConditionQuery childQuery,
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
        return "impasse_keywords";
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
     * keyword: {NotNull, VARCHAR(255)}
     * @param keyword The value of keyword as equal.
     */
    public void setKeyword_Equal(final String keyword) {
        doSetKeyword_Equal(fRES(keyword));
    }

    protected void doSetKeyword_Equal(final String keyword) {
        regKeyword(CK_EQ, keyword);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * keyword: {NotNull, VARCHAR(255)}
     * @param keyword The value of keyword as notEqual.
     */
    public void setKeyword_NotEqual(final String keyword) {
        doSetKeyword_NotEqual(fRES(keyword));
    }

    protected void doSetKeyword_NotEqual(final String keyword) {
        regKeyword(CK_NES, keyword);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * keyword: {NotNull, VARCHAR(255)}
     * @param keyword The value of keyword as greaterThan.
     */
    public void setKeyword_GreaterThan(final String keyword) {
        regKeyword(CK_GT, fRES(keyword));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * keyword: {NotNull, VARCHAR(255)}
     * @param keyword The value of keyword as lessThan.
     */
    public void setKeyword_LessThan(final String keyword) {
        regKeyword(CK_LT, fRES(keyword));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * keyword: {NotNull, VARCHAR(255)}
     * @param keyword The value of keyword as greaterEqual.
     */
    public void setKeyword_GreaterEqual(final String keyword) {
        regKeyword(CK_GE, fRES(keyword));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * keyword: {NotNull, VARCHAR(255)}
     * @param keyword The value of keyword as lessEqual.
     */
    public void setKeyword_LessEqual(final String keyword) {
        regKeyword(CK_LE, fRES(keyword));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * keyword: {NotNull, VARCHAR(255)}
     * @param keywordList The collection of keyword as inScope.
     */
    public void setKeyword_InScope(final Collection<String> keywordList) {
        doSetKeyword_InScope(keywordList);
    }

    public void doSetKeyword_InScope(final Collection<String> keywordList) {
        regINS(CK_INS, cTL(keywordList), getCValueKeyword(), "keyword");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * keyword: {NotNull, VARCHAR(255)}
     * @param keywordList The collection of keyword as notInScope.
     */
    public void setKeyword_NotInScope(final Collection<String> keywordList) {
        doSetKeyword_NotInScope(keywordList);
    }

    public void doSetKeyword_NotInScope(final Collection<String> keywordList) {
        regINS(CK_NINS, cTL(keywordList), getCValueKeyword(), "keyword");
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * keyword: {NotNull, VARCHAR(255)}
     * @param keyword The value of keyword as prefixSearch.
     */
    public void setKeyword_PrefixSearch(final String keyword) {
        setKeyword_LikeSearch(keyword, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * keyword: {NotNull, VARCHAR(255)}
     * @param keyword The value of keyword as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setKeyword_LikeSearch(final String keyword,
            final LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(keyword), getCValueKeyword(), "keyword",
                likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * keyword: {NotNull, VARCHAR(255)}
     * @param keyword The value of keyword as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setKeyword_NotLikeSearch(final String keyword,
            final LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(keyword), getCValueKeyword(), "keyword",
                likeSearchOption);
    }

    protected void regKeyword(final ConditionKey k, final Object v) {
        regQ(k, v, getCValueKeyword(), "keyword");
    }

    abstract protected ConditionValue getCValueKeyword();

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

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO = (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_Equal()</span>.max(new SubQuery&lt;ImpasseKeywordsCB&gt;() {
     *     public void query(ImpasseKeywordsCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<ImpasseKeywordsCB> scalar_Equal() {
        return xcreateSSQFunction(CK_EQ.getOperand());
    }

    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO &lt;&gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_NotEqual()</span>.max(new SubQuery&lt;ImpasseKeywordsCB&gt;() {
     *     public void query(ImpasseKeywordsCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<ImpasseKeywordsCB> scalar_NotEqual() {
        return xcreateSSQFunction(CK_NES.getOperand());
    }

    /**
     * Prepare ScalarCondition as greaterThan. <br />
     * {where FOO &gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_GreaterThan()</span>.max(new SubQuery&lt;ImpasseKeywordsCB&gt;() {
     *     public void query(ImpasseKeywordsCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<ImpasseKeywordsCB> scalar_GreaterThan() {
        return xcreateSSQFunction(CK_GT.getOperand());
    }

    /**
     * Prepare ScalarCondition as lessThan. <br />
     * {where FOO &lt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_LessThan()</span>.max(new SubQuery&lt;ImpasseKeywordsCB&gt;() {
     *     public void query(ImpasseKeywordsCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<ImpasseKeywordsCB> scalar_LessThan() {
        return xcreateSSQFunction(CK_LT.getOperand());
    }

    /**
     * Prepare ScalarCondition as greaterEqual. <br />
     * {where FOO &gt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_GreaterEqual()</span>.max(new SubQuery&lt;ImpasseKeywordsCB&gt;() {
     *     public void query(ImpasseKeywordsCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<ImpasseKeywordsCB> scalar_GreaterEqual() {
        return xcreateSSQFunction(CK_GE.getOperand());
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br />
     * {where FOO &lt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_LessEqual()</span>.max(new SubQuery&lt;ImpasseKeywordsCB&gt;() {
     *     public void query(ImpasseKeywordsCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<ImpasseKeywordsCB> scalar_LessEqual() {
        return xcreateSSQFunction(CK_LE.getOperand());
    }

    protected HpSSQFunction<ImpasseKeywordsCB> xcreateSSQFunction(
            final String operand) {
        return new HpSSQFunction<ImpasseKeywordsCB>(
                new HpSSQSetupper<ImpasseKeywordsCB>() {
                    @Override
                    public void setup(final String function,
                            final SubQuery<ImpasseKeywordsCB> subQuery,
                            final HpSSQOption<ImpasseKeywordsCB> option) {
                        xscalarCondition(function, subQuery, operand, option);
                    }
                });
    }

    protected void xscalarCondition(final String function,
            final SubQuery<ImpasseKeywordsCB> subQuery, final String operand,
            final HpSSQOption<ImpasseKeywordsCB> option) {
        assertObjectNotNull("subQuery<ImpasseKeywordsCB>", subQuery);
        final ImpasseKeywordsCB cb = xcreateScalarConditionCB();
        subQuery.query(cb);
        final String subQueryPropertyName = keepScalarCondition(cb.query()); // for saving query-value
        option.setPartitionByCBean(xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(function, cb.query(), subQueryPropertyName,
                operand, option);
    }

    public abstract String keepScalarCondition(ImpasseKeywordsCQ subQuery);

    protected ImpasseKeywordsCB xcreateScalarConditionCB() {
        final ImpasseKeywordsCB cb = new ImpasseKeywordsCB();
        cb.xsetupForScalarCondition(this);
        return cb;
    }

    protected ImpasseKeywordsCB xcreateScalarConditionPartitionByCB() {
        final ImpasseKeywordsCB cb = new ImpasseKeywordsCB();
        cb.xsetupForScalarConditionPartitionBy(this);
        return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(final String function,
            final SubQuery<ImpasseKeywordsCB> subQuery, final String aliasName,
            final DerivedReferrerOption option) {
        assertObjectNotNull("subQuery<ImpasseKeywordsCB>", subQuery);
        final ImpasseKeywordsCB cb = new ImpasseKeywordsCB();
        cb.xsetupForDerivedReferrer(this);
        subQuery.query(cb);
        final String subQueryPropertyName = keepSpecifyMyselfDerived(cb.query()); // for saving query-value.
        registerSpecifyMyselfDerived(function, cb.query(), "id", "id",
                subQueryPropertyName, "myselfDerived", aliasName, option);
    }

    public abstract String keepSpecifyMyselfDerived(ImpasseKeywordsCQ subQuery);

    /**
     * Prepare for (Query)MyselfDerived (SubQuery).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<ImpasseKeywordsCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived();
    }

    protected HpQDRFunction<ImpasseKeywordsCB> xcreateQDRFunctionMyselfDerived() {
        return new HpQDRFunction<ImpasseKeywordsCB>(
                new HpQDRSetupper<ImpasseKeywordsCB>() {
                    @Override
                    public void setup(final String function,
                            final SubQuery<ImpasseKeywordsCB> subQuery,
                            final String operand, final Object value,
                            final DerivedReferrerOption option) {
                        xqderiveMyselfDerived(function, subQuery, operand,
                                value, option);
                    }
                });
    }

    public void xqderiveMyselfDerived(final String function,
            final SubQuery<ImpasseKeywordsCB> subQuery, final String operand,
            final Object value, final DerivedReferrerOption option) {
        assertObjectNotNull("subQuery<ImpasseKeywordsCB>", subQuery);
        final ImpasseKeywordsCB cb = new ImpasseKeywordsCB();
        cb.xsetupForDerivedReferrer(this);
        subQuery.query(cb);
        final String subQueryPropertyName = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        final String parameterPropertyName = keepQueryMyselfDerivedParameter(value);
        registerQueryMyselfDerived(function, cb.query(), "id", "id",
                subQueryPropertyName, "myselfDerived", operand, value,
                parameterPropertyName, option);
    }

    public abstract String keepQueryMyselfDerived(ImpasseKeywordsCQ subQuery);

    public abstract String keepQueryMyselfDerivedParameter(Object parameterValue);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (SubQuery).
     * @param subQuery The implementation of sub query. (NotNull)
     */
    public void myselfExists(final SubQuery<ImpasseKeywordsCB> subQuery) {
        assertObjectNotNull("subQuery<ImpasseKeywordsCB>", subQuery);
        final ImpasseKeywordsCB cb = new ImpasseKeywordsCB();
        cb.xsetupForMyselfExists(this);
        subQuery.query(cb);
        final String subQueryPropertyName = keepMyselfExists(cb.query()); // for saving query-value.
        registerMyselfExists(cb.query(), subQueryPropertyName);
    }

    public abstract String keepMyselfExists(ImpasseKeywordsCQ subQuery);

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    /**
     * Prepare for MyselfInScope (SubQuery).
     * @param subQuery The implementation of sub query. (NotNull)
     */
    public void myselfInScope(final SubQuery<ImpasseKeywordsCB> subQuery) {
        assertObjectNotNull("subQuery<ImpasseKeywordsCB>", subQuery);
        final ImpasseKeywordsCB cb = new ImpasseKeywordsCB();
        cb.xsetupForMyselfInScope(this);
        subQuery.query(cb);
        final String subQueryPropertyName = keepMyselfInScope(cb.query()); // for saving query-value.
        registerMyselfInScope(cb.query(), subQueryPropertyName);
    }

    public abstract String keepMyselfInScope(ImpasseKeywordsCQ subQuery);

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use TestLinkImport')
    protected String xabCB() {
        return ImpasseKeywordsCB.class.getName();
    }

    protected String xabCQ() {
        return ImpasseKeywordsCQ.class.getName();
    }

    protected String xabLSO() {
        return LikeSearchOption.class.getName();
    }

    protected String xabSSQS() {
        return HpSSQSetupper.class.getName();
    }
}
