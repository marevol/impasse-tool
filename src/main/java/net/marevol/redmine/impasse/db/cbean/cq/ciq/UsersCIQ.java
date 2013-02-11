package net.marevol.redmine.impasse.db.cbean.cq.ciq;

import net.marevol.redmine.impasse.db.cbean.UsersCB;
import net.marevol.redmine.impasse.db.cbean.cq.UsersCQ;
import net.marevol.redmine.impasse.db.cbean.cq.bs.AbstractBsUsersCQ;
import net.marevol.redmine.impasse.db.cbean.cq.bs.BsUsersCQ;

import org.seasar.dbflute.cbean.ConditionQuery;
import org.seasar.dbflute.cbean.ckey.ConditionKey;
import org.seasar.dbflute.cbean.coption.ConditionOption;
import org.seasar.dbflute.cbean.cvalue.ConditionValue;
import org.seasar.dbflute.cbean.sqlclause.SqlClause;
import org.seasar.dbflute.exception.IllegalConditionBeanOperationException;

/**
 * The condition-query for in-line of users.
 * @author DBFlute(AutoGenerator)
 */
public class UsersCIQ extends AbstractBsUsersCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BsUsersCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public UsersCIQ(final ConditionQuery childQuery, final SqlClause sqlClause,
            final String aliasName, final int nestLevel, final BsUsersCQ myCQ) {
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
    protected ConditionValue getCValueLogin() {
        return _myCQ.getLogin();
    }

    @Override
    protected ConditionValue getCValueHashedPassword() {
        return _myCQ.getHashedPassword();
    }

    @Override
    protected ConditionValue getCValueFirstname() {
        return _myCQ.getFirstname();
    }

    @Override
    protected ConditionValue getCValueLastname() {
        return _myCQ.getLastname();
    }

    @Override
    protected ConditionValue getCValueMail() {
        return _myCQ.getMail();
    }

    @Override
    protected ConditionValue getCValueAdmin() {
        return _myCQ.getAdmin();
    }

    @Override
    protected ConditionValue getCValueStatus() {
        return _myCQ.getStatus();
    }

    @Override
    protected ConditionValue getCValueLastLoginOn() {
        return _myCQ.getLastLoginOn();
    }

    @Override
    protected ConditionValue getCValueLanguage() {
        return _myCQ.getLanguage();
    }

    @Override
    protected ConditionValue getCValueAuthSourceId() {
        return _myCQ.getAuthSourceId();
    }

    @Override
    protected ConditionValue getCValueCreatedOn() {
        return _myCQ.getCreatedOn();
    }

    @Override
    protected ConditionValue getCValueUpdatedOn() {
        return _myCQ.getUpdatedOn();
    }

    @Override
    protected ConditionValue getCValueType() {
        return _myCQ.getType();
    }

    @Override
    protected ConditionValue getCValueIdentityUrl() {
        return _myCQ.getIdentityUrl();
    }

    @Override
    protected ConditionValue getCValueMailNotification() {
        return _myCQ.getMailNotification();
    }

    @Override
    protected ConditionValue getCValueSalt() {
        return _myCQ.getSalt();
    }

    @Override
    public String keepScalarCondition(final UsersCQ subQuery) {
        throwIICBOE("ScalarCondition");
        return null;
    }

    @Override
    public String keepSpecifyMyselfDerived(final UsersCQ subQuery) {
        throwIICBOE("(Specify)MyselfDerived");
        return null;
    }

    @Override
    public String keepQueryMyselfDerived(final UsersCQ subQuery) {
        throwIICBOE("(Query)MyselfDerived");
        return null;
    }

    @Override
    public String keepQueryMyselfDerivedParameter(final Object parameterValue) {
        throwIICBOE("(Query)MyselfDerived");
        return null;
    }

    @Override
    public String keepMyselfExists(final UsersCQ subQuery) {
        throwIICBOE("MyselfExists");
        return null;
    }

    @Override
    public String keepMyselfInScope(final UsersCQ subQuery) {
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
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xinCB() {
        return UsersCB.class.getName();
    }

    protected String xinCQ() {
        return UsersCQ.class.getName();
    }
}
