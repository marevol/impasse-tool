package net.marevol.redmine.impasse.db.cbean.cq.bs;

import java.util.Collection;

import net.marevol.redmine.impasse.db.allcommon.DBMetaInstanceHandler;
import net.marevol.redmine.impasse.db.cbean.ImpasseTestPlanCasesCB;
import net.marevol.redmine.impasse.db.cbean.cq.ImpasseTestPlanCasesCQ;

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
 * The abstract condition-query of impasse_test_plan_cases.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsImpasseTestPlanCasesCQ extends
        AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsImpasseTestPlanCasesCQ(final ConditionQuery childQuery,
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
        return "impasse_test_plan_cases";
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
     * test_plan_id: {IX, INT(10)}
     * @param testPlanId The value of testPlanId as equal.
     */
    public void setTestPlanId_Equal(final Integer testPlanId) {
        doSetTestPlanId_Equal(testPlanId);
    }

    protected void doSetTestPlanId_Equal(final Integer testPlanId) {
        regTestPlanId(CK_EQ, testPlanId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * test_plan_id: {IX, INT(10)}
     * @param testPlanId The value of testPlanId as notEqual.
     */
    public void setTestPlanId_NotEqual(final Integer testPlanId) {
        doSetTestPlanId_NotEqual(testPlanId);
    }

    protected void doSetTestPlanId_NotEqual(final Integer testPlanId) {
        regTestPlanId(CK_NES, testPlanId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * test_plan_id: {IX, INT(10)}
     * @param testPlanId The value of testPlanId as greaterThan.
     */
    public void setTestPlanId_GreaterThan(final Integer testPlanId) {
        regTestPlanId(CK_GT, testPlanId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * test_plan_id: {IX, INT(10)}
     * @param testPlanId The value of testPlanId as lessThan.
     */
    public void setTestPlanId_LessThan(final Integer testPlanId) {
        regTestPlanId(CK_LT, testPlanId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * test_plan_id: {IX, INT(10)}
     * @param testPlanId The value of testPlanId as greaterEqual.
     */
    public void setTestPlanId_GreaterEqual(final Integer testPlanId) {
        regTestPlanId(CK_GE, testPlanId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * test_plan_id: {IX, INT(10)}
     * @param testPlanId The value of testPlanId as lessEqual.
     */
    public void setTestPlanId_LessEqual(final Integer testPlanId) {
        regTestPlanId(CK_LE, testPlanId);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * test_plan_id: {IX, INT(10)}
     * @param minNumber The min number of testPlanId. (NullAllowed)
     * @param maxNumber The max number of testPlanId. (NullAllowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setTestPlanId_RangeOf(final Integer minNumber,
            final Integer maxNumber, final RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueTestPlanId(), "test_plan_id",
                rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * test_plan_id: {IX, INT(10)}
     * @param testPlanIdList The collection of testPlanId as inScope.
     */
    public void setTestPlanId_InScope(final Collection<Integer> testPlanIdList) {
        doSetTestPlanId_InScope(testPlanIdList);
    }

    protected void doSetTestPlanId_InScope(
            final Collection<Integer> testPlanIdList) {
        regINS(CK_INS, cTL(testPlanIdList), getCValueTestPlanId(),
                "test_plan_id");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * test_plan_id: {IX, INT(10)}
     * @param testPlanIdList The collection of testPlanId as notInScope.
     */
    public void setTestPlanId_NotInScope(
            final Collection<Integer> testPlanIdList) {
        doSetTestPlanId_NotInScope(testPlanIdList);
    }

    protected void doSetTestPlanId_NotInScope(
            final Collection<Integer> testPlanIdList) {
        regINS(CK_NINS, cTL(testPlanIdList), getCValueTestPlanId(),
                "test_plan_id");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * test_plan_id: {IX, INT(10)}
     */
    public void setTestPlanId_IsNull() {
        regTestPlanId(CK_ISN, DOBJ);
    }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * test_plan_id: {IX, INT(10)}
     */
    public void setTestPlanId_IsNotNull() {
        regTestPlanId(CK_ISNN, DOBJ);
    }

    protected void regTestPlanId(final ConditionKey k, final Object v) {
        regQ(k, v, getCValueTestPlanId(), "test_plan_id");
    }

    abstract protected ConditionValue getCValueTestPlanId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * test_case_id: {IX+, INT(10)}
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
     * test_case_id: {IX+, INT(10)}
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
     * test_case_id: {IX+, INT(10)}
     * @param testCaseId The value of testCaseId as greaterThan.
     */
    public void setTestCaseId_GreaterThan(final Integer testCaseId) {
        regTestCaseId(CK_GT, testCaseId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * test_case_id: {IX+, INT(10)}
     * @param testCaseId The value of testCaseId as lessThan.
     */
    public void setTestCaseId_LessThan(final Integer testCaseId) {
        regTestCaseId(CK_LT, testCaseId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * test_case_id: {IX+, INT(10)}
     * @param testCaseId The value of testCaseId as greaterEqual.
     */
    public void setTestCaseId_GreaterEqual(final Integer testCaseId) {
        regTestCaseId(CK_GE, testCaseId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * test_case_id: {IX+, INT(10)}
     * @param testCaseId The value of testCaseId as lessEqual.
     */
    public void setTestCaseId_LessEqual(final Integer testCaseId) {
        regTestCaseId(CK_LE, testCaseId);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * test_case_id: {IX+, INT(10)}
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
     * test_case_id: {IX+, INT(10)}
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
     * test_case_id: {IX+, INT(10)}
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

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * test_case_id: {IX+, INT(10)}
     */
    public void setTestCaseId_IsNull() {
        regTestCaseId(CK_ISN, DOBJ);
    }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * test_case_id: {IX+, INT(10)}
     */
    public void setTestCaseId_IsNotNull() {
        regTestCaseId(CK_ISNN, DOBJ);
    }

    protected void regTestCaseId(final ConditionKey k, final Object v) {
        regQ(k, v, getCValueTestCaseId(), "test_case_id");
    }

    abstract protected ConditionValue getCValueTestCaseId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * node_order: {INT(10)}
     * @param nodeOrder The value of nodeOrder as equal.
     */
    public void setNodeOrder_Equal(final Integer nodeOrder) {
        doSetNodeOrder_Equal(nodeOrder);
    }

    protected void doSetNodeOrder_Equal(final Integer nodeOrder) {
        regNodeOrder(CK_EQ, nodeOrder);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * node_order: {INT(10)}
     * @param nodeOrder The value of nodeOrder as notEqual.
     */
    public void setNodeOrder_NotEqual(final Integer nodeOrder) {
        doSetNodeOrder_NotEqual(nodeOrder);
    }

    protected void doSetNodeOrder_NotEqual(final Integer nodeOrder) {
        regNodeOrder(CK_NES, nodeOrder);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * node_order: {INT(10)}
     * @param nodeOrder The value of nodeOrder as greaterThan.
     */
    public void setNodeOrder_GreaterThan(final Integer nodeOrder) {
        regNodeOrder(CK_GT, nodeOrder);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * node_order: {INT(10)}
     * @param nodeOrder The value of nodeOrder as lessThan.
     */
    public void setNodeOrder_LessThan(final Integer nodeOrder) {
        regNodeOrder(CK_LT, nodeOrder);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * node_order: {INT(10)}
     * @param nodeOrder The value of nodeOrder as greaterEqual.
     */
    public void setNodeOrder_GreaterEqual(final Integer nodeOrder) {
        regNodeOrder(CK_GE, nodeOrder);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * node_order: {INT(10)}
     * @param nodeOrder The value of nodeOrder as lessEqual.
     */
    public void setNodeOrder_LessEqual(final Integer nodeOrder) {
        regNodeOrder(CK_LE, nodeOrder);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * node_order: {INT(10)}
     * @param minNumber The min number of nodeOrder. (NullAllowed)
     * @param maxNumber The max number of nodeOrder. (NullAllowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setNodeOrder_RangeOf(final Integer minNumber,
            final Integer maxNumber, final RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueNodeOrder(), "node_order",
                rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * node_order: {INT(10)}
     * @param nodeOrderList The collection of nodeOrder as inScope.
     */
    public void setNodeOrder_InScope(final Collection<Integer> nodeOrderList) {
        doSetNodeOrder_InScope(nodeOrderList);
    }

    protected void doSetNodeOrder_InScope(
            final Collection<Integer> nodeOrderList) {
        regINS(CK_INS, cTL(nodeOrderList), getCValueNodeOrder(), "node_order");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * node_order: {INT(10)}
     * @param nodeOrderList The collection of nodeOrder as notInScope.
     */
    public void setNodeOrder_NotInScope(final Collection<Integer> nodeOrderList) {
        doSetNodeOrder_NotInScope(nodeOrderList);
    }

    protected void doSetNodeOrder_NotInScope(
            final Collection<Integer> nodeOrderList) {
        regINS(CK_NINS, cTL(nodeOrderList), getCValueNodeOrder(), "node_order");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * node_order: {INT(10)}
     */
    public void setNodeOrder_IsNull() {
        regNodeOrder(CK_ISN, DOBJ);
    }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * node_order: {INT(10)}
     */
    public void setNodeOrder_IsNotNull() {
        regNodeOrder(CK_ISNN, DOBJ);
    }

    protected void regNodeOrder(final ConditionKey k, final Object v) {
        regQ(k, v, getCValueNodeOrder(), "node_order");
    }

    abstract protected ConditionValue getCValueNodeOrder();

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO = (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_Equal()</span>.max(new SubQuery&lt;ImpasseTestPlanCasesCB&gt;() {
     *     public void query(ImpasseTestPlanCasesCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<ImpasseTestPlanCasesCB> scalar_Equal() {
        return xcreateSSQFunction(CK_EQ.getOperand());
    }

    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO &lt;&gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_NotEqual()</span>.max(new SubQuery&lt;ImpasseTestPlanCasesCB&gt;() {
     *     public void query(ImpasseTestPlanCasesCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<ImpasseTestPlanCasesCB> scalar_NotEqual() {
        return xcreateSSQFunction(CK_NES.getOperand());
    }

    /**
     * Prepare ScalarCondition as greaterThan. <br />
     * {where FOO &gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_GreaterThan()</span>.max(new SubQuery&lt;ImpasseTestPlanCasesCB&gt;() {
     *     public void query(ImpasseTestPlanCasesCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<ImpasseTestPlanCasesCB> scalar_GreaterThan() {
        return xcreateSSQFunction(CK_GT.getOperand());
    }

    /**
     * Prepare ScalarCondition as lessThan. <br />
     * {where FOO &lt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_LessThan()</span>.max(new SubQuery&lt;ImpasseTestPlanCasesCB&gt;() {
     *     public void query(ImpasseTestPlanCasesCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<ImpasseTestPlanCasesCB> scalar_LessThan() {
        return xcreateSSQFunction(CK_LT.getOperand());
    }

    /**
     * Prepare ScalarCondition as greaterEqual. <br />
     * {where FOO &gt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_GreaterEqual()</span>.max(new SubQuery&lt;ImpasseTestPlanCasesCB&gt;() {
     *     public void query(ImpasseTestPlanCasesCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<ImpasseTestPlanCasesCB> scalar_GreaterEqual() {
        return xcreateSSQFunction(CK_GE.getOperand());
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br />
     * {where FOO &lt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_LessEqual()</span>.max(new SubQuery&lt;ImpasseTestPlanCasesCB&gt;() {
     *     public void query(ImpasseTestPlanCasesCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<ImpasseTestPlanCasesCB> scalar_LessEqual() {
        return xcreateSSQFunction(CK_LE.getOperand());
    }

    protected HpSSQFunction<ImpasseTestPlanCasesCB> xcreateSSQFunction(
            final String operand) {
        return new HpSSQFunction<ImpasseTestPlanCasesCB>(
                new HpSSQSetupper<ImpasseTestPlanCasesCB>() {
                    @Override
                    public void setup(final String function,
                            final SubQuery<ImpasseTestPlanCasesCB> subQuery,
                            final HpSSQOption<ImpasseTestPlanCasesCB> option) {
                        xscalarCondition(function, subQuery, operand, option);
                    }
                });
    }

    protected void xscalarCondition(final String function,
            final SubQuery<ImpasseTestPlanCasesCB> subQuery,
            final String operand,
            final HpSSQOption<ImpasseTestPlanCasesCB> option) {
        assertObjectNotNull("subQuery<ImpasseTestPlanCasesCB>", subQuery);
        final ImpasseTestPlanCasesCB cb = xcreateScalarConditionCB();
        subQuery.query(cb);
        final String subQueryPropertyName = keepScalarCondition(cb.query()); // for saving query-value
        option.setPartitionByCBean(xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(function, cb.query(), subQueryPropertyName,
                operand, option);
    }

    public abstract String keepScalarCondition(ImpasseTestPlanCasesCQ subQuery);

    protected ImpasseTestPlanCasesCB xcreateScalarConditionCB() {
        final ImpasseTestPlanCasesCB cb = new ImpasseTestPlanCasesCB();
        cb.xsetupForScalarCondition(this);
        return cb;
    }

    protected ImpasseTestPlanCasesCB xcreateScalarConditionPartitionByCB() {
        final ImpasseTestPlanCasesCB cb = new ImpasseTestPlanCasesCB();
        cb.xsetupForScalarConditionPartitionBy(this);
        return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(final String function,
            final SubQuery<ImpasseTestPlanCasesCB> subQuery,
            final String aliasName, final DerivedReferrerOption option) {
        assertObjectNotNull("subQuery<ImpasseTestPlanCasesCB>", subQuery);
        final ImpasseTestPlanCasesCB cb = new ImpasseTestPlanCasesCB();
        cb.xsetupForDerivedReferrer(this);
        subQuery.query(cb);
        final String subQueryPropertyName = keepSpecifyMyselfDerived(cb.query()); // for saving query-value.
        registerSpecifyMyselfDerived(function, cb.query(), "id", "id",
                subQueryPropertyName, "myselfDerived", aliasName, option);
    }

    public abstract String keepSpecifyMyselfDerived(
            ImpasseTestPlanCasesCQ subQuery);

    /**
     * Prepare for (Query)MyselfDerived (SubQuery).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<ImpasseTestPlanCasesCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived();
    }

    protected HpQDRFunction<ImpasseTestPlanCasesCB> xcreateQDRFunctionMyselfDerived() {
        return new HpQDRFunction<ImpasseTestPlanCasesCB>(
                new HpQDRSetupper<ImpasseTestPlanCasesCB>() {
                    @Override
                    public void setup(final String function,
                            final SubQuery<ImpasseTestPlanCasesCB> subQuery,
                            final String operand, final Object value,
                            final DerivedReferrerOption option) {
                        xqderiveMyselfDerived(function, subQuery, operand,
                                value, option);
                    }
                });
    }

    public void xqderiveMyselfDerived(final String function,
            final SubQuery<ImpasseTestPlanCasesCB> subQuery,
            final String operand, final Object value,
            final DerivedReferrerOption option) {
        assertObjectNotNull("subQuery<ImpasseTestPlanCasesCB>", subQuery);
        final ImpasseTestPlanCasesCB cb = new ImpasseTestPlanCasesCB();
        cb.xsetupForDerivedReferrer(this);
        subQuery.query(cb);
        final String subQueryPropertyName = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        final String parameterPropertyName = keepQueryMyselfDerivedParameter(value);
        registerQueryMyselfDerived(function, cb.query(), "id", "id",
                subQueryPropertyName, "myselfDerived", operand, value,
                parameterPropertyName, option);
    }

    public abstract String keepQueryMyselfDerived(
            ImpasseTestPlanCasesCQ subQuery);

    public abstract String keepQueryMyselfDerivedParameter(Object parameterValue);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (SubQuery).
     * @param subQuery The implementation of sub query. (NotNull)
     */
    public void myselfExists(final SubQuery<ImpasseTestPlanCasesCB> subQuery) {
        assertObjectNotNull("subQuery<ImpasseTestPlanCasesCB>", subQuery);
        final ImpasseTestPlanCasesCB cb = new ImpasseTestPlanCasesCB();
        cb.xsetupForMyselfExists(this);
        subQuery.query(cb);
        final String subQueryPropertyName = keepMyselfExists(cb.query()); // for saving query-value.
        registerMyselfExists(cb.query(), subQueryPropertyName);
    }

    public abstract String keepMyselfExists(ImpasseTestPlanCasesCQ subQuery);

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    /**
     * Prepare for MyselfInScope (SubQuery).
     * @param subQuery The implementation of sub query. (NotNull)
     */
    public void myselfInScope(final SubQuery<ImpasseTestPlanCasesCB> subQuery) {
        assertObjectNotNull("subQuery<ImpasseTestPlanCasesCB>", subQuery);
        final ImpasseTestPlanCasesCB cb = new ImpasseTestPlanCasesCB();
        cb.xsetupForMyselfInScope(this);
        subQuery.query(cb);
        final String subQueryPropertyName = keepMyselfInScope(cb.query()); // for saving query-value.
        registerMyselfInScope(cb.query(), subQueryPropertyName);
    }

    public abstract String keepMyselfInScope(ImpasseTestPlanCasesCQ subQuery);

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabCB() {
        return ImpasseTestPlanCasesCB.class.getName();
    }

    protected String xabCQ() {
        return ImpasseTestPlanCasesCQ.class.getName();
    }

    protected String xabLSO() {
        return LikeSearchOption.class.getName();
    }

    protected String xabSSQS() {
        return HpSSQSetupper.class.getName();
    }
}
