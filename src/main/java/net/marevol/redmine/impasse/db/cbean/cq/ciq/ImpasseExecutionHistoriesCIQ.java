package net.marevol.redmine.impasse.db.cbean.cq.ciq;

import net.marevol.redmine.impasse.db.cbean.ImpasseExecutionHistoriesCB;
import net.marevol.redmine.impasse.db.cbean.cq.ImpasseExecutionHistoriesCQ;
import net.marevol.redmine.impasse.db.cbean.cq.bs.AbstractBsImpasseExecutionHistoriesCQ;
import net.marevol.redmine.impasse.db.cbean.cq.bs.BsImpasseExecutionHistoriesCQ;

import org.seasar.dbflute.cbean.ConditionQuery;
import org.seasar.dbflute.cbean.ckey.ConditionKey;
import org.seasar.dbflute.cbean.coption.ConditionOption;
import org.seasar.dbflute.cbean.cvalue.ConditionValue;
import org.seasar.dbflute.cbean.sqlclause.SqlClause;
import org.seasar.dbflute.exception.IllegalConditionBeanOperationException;

/**
 * The condition-query for in-line of impasse_execution_histories.
 * @author DBFlute(AutoGenerator)
 */
public class ImpasseExecutionHistoriesCIQ extends
        AbstractBsImpasseExecutionHistoriesCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BsImpasseExecutionHistoriesCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public ImpasseExecutionHistoriesCIQ(final ConditionQuery childQuery,
            final SqlClause sqlClause, final String aliasName,
            final int nestLevel, final BsImpasseExecutionHistoriesCQ myCQ) {
        super(childQuery, sqlClause, aliasName, nestLevel);
        _myCQ = myCQ;
        _foreignPropertyName = _myCQ.xgetForeignPropertyName(); // accept foreign property name
        _relationPath = _myCQ.xgetRelationPath(); // accept relation path
        _inline = true;
    }

    // ===================================================================================
    //                                                             Override about Register
    //                                                             =======================
    @Override
    protected void reflectRelationOnUnionQuery(final ConditionQuery bq,
            final ConditionQuery uq) {
        final String msg = "InlineView must not need UNION method: " + bq
                + " : " + uq;
        throw new IllegalConditionBeanOperationException(msg);
    }

    @Override
    protected void setupConditionValueAndRegisterWhereClause(
            final ConditionKey k, final Object v, final ConditionValue cv,
            final String col) {
        regIQ(k, v, cv, col);
    }

    @Override
    protected void setupConditionValueAndRegisterWhereClause(
            final ConditionKey k, final Object v, final ConditionValue cv,
            final String col, final ConditionOption op) {
        regIQ(k, v, cv, col, op);
    }

    @Override
    protected void registerWhereClause(final String wc) {
        registerInlineWhereClause(wc);
    }

    @Override
    protected boolean isInScopeRelationSuppressLocalAliasName() {
        if (_onClause) {
            throw new IllegalConditionBeanOperationException(
                    "InScopeRelation on OnClause is unsupported.");
        }
        return true;
    }

    // ===================================================================================
    //                                                                Override about Query
    //                                                                ====================
    @Override
    protected ConditionValue getCValueId() {
        return _myCQ.getId();
    }

    @Override
    protected ConditionValue getCValueTestPlanCaseId() {
        return _myCQ.getTestPlanCaseId();
    }

    @Override
    protected ConditionValue getCValueTesterId() {
        return _myCQ.getTesterId();
    }

    @Override
    protected ConditionValue getCValueBuildId() {
        return _myCQ.getBuildId();
    }

    @Override
    protected ConditionValue getCValueExpectedDate() {
        return _myCQ.getExpectedDate();
    }

    @Override
    protected ConditionValue getCValueStatus() {
        return _myCQ.getStatus();
    }

    @Override
    protected ConditionValue getCValueExecutionTs() {
        return _myCQ.getExecutionTs();
    }

    @Override
    protected ConditionValue getCValueExecutorId() {
        return _myCQ.getExecutorId();
    }

    @Override
    protected ConditionValue getCValueNotes() {
        return _myCQ.getNotes();
    }

    @Override
    public String keepScalarCondition(final ImpasseExecutionHistoriesCQ subQuery) {
        throwIICBOE("ScalarCondition");
        return null;
    }

    @Override
    public String keepSpecifyMyselfDerived(
            final ImpasseExecutionHistoriesCQ subQuery) {
        throwIICBOE("(Specify)MyselfDerived");
        return null;
    }

    @Override
    public String keepQueryMyselfDerived(
            final ImpasseExecutionHistoriesCQ subQuery) {
        throwIICBOE("(Query)MyselfDerived");
        return null;
    }

    @Override
    public String keepQueryMyselfDerivedParameter(final Object parameterValue) {
        throwIICBOE("(Query)MyselfDerived");
        return null;
    }

    @Override
    public String keepMyselfExists(final ImpasseExecutionHistoriesCQ subQuery) {
        throwIICBOE("MyselfExists");
        return null;
    }

    @Override
    public String keepMyselfInScope(final ImpasseExecutionHistoriesCQ subQuery) {
        throwIICBOE("MyselfInScope");
        return null;
    }

    protected void throwIICBOE(final String name) { // throwInlineIllegalConditionBeanOperationException()
        throw new IllegalConditionBeanOperationException(name
                + " at InlineView is unsupported.");
    }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use TestLinkImport')
    protected String xinCB() {
        return ImpasseExecutionHistoriesCB.class.getName();
    }

    protected String xinCQ() {
        return ImpasseExecutionHistoriesCQ.class.getName();
    }
}
