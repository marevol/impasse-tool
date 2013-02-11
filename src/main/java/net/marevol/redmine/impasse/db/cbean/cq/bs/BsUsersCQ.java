package net.marevol.redmine.impasse.db.cbean.cq.bs;

import java.util.Map;

import net.marevol.redmine.impasse.db.cbean.UsersCB;
import net.marevol.redmine.impasse.db.cbean.cq.UsersCQ;
import net.marevol.redmine.impasse.db.cbean.cq.ciq.UsersCIQ;

import org.seasar.dbflute.cbean.ConditionQuery;
import org.seasar.dbflute.cbean.cvalue.ConditionValue;
import org.seasar.dbflute.cbean.sqlclause.SqlClause;
import org.seasar.dbflute.exception.IllegalConditionBeanOperationException;

/**
 * The base condition-query of users.
 * @author DBFlute(AutoGenerator)
 */
public class BsUsersCQ extends AbstractBsUsersCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected UsersCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsUsersCQ(final ConditionQuery childQuery,
            final SqlClause sqlClause, final String aliasName,
            final int nestLevel) {
        super(childQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br />
     * {select ... from ... left outer join (select * from users) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #FD4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public UsersCIQ inline() {
        if (_inlineQuery == null) {
            _inlineQuery = xcreateCIQ();
        }
        _inlineQuery.xsetOnClause(false);
        return _inlineQuery;
    }

    protected UsersCIQ xcreateCIQ() {
        final UsersCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected UsersCIQ xnewCIQ() {
        return new UsersCIQ(xgetReferrerQuery(), xgetSqlClause(),
                xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br />
     * {select ... from ... left outer join users on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #FD4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public UsersCIQ on() {
        if (isBaseQuery()) {
            throw new IllegalConditionBeanOperationException(
                    "OnClause for local table is unavailable!");
        }
        final UsersCIQ inlineQuery = inline();
        inlineQuery.xsetOnClause(true);
        return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====

    protected ConditionValue _id;

    public ConditionValue getId() {
        if (_id == null) {
            _id = nCV();
        }
        return _id;
    }

    @Override
    protected ConditionValue getCValueId() {
        return getId();
    }

    /** 
     * Add order-by as ascend. <br />
     * id: {PK, ID, IX, NotNull, INT(10)}
     * @return this. (NotNull)
     */
    public BsUsersCQ addOrderBy_Id_Asc() {
        regOBA("id");
        return this;
    }

    /**
     * Add order-by as descend. <br />
     * id: {PK, ID, IX, NotNull, INT(10)}
     * @return this. (NotNull)
     */
    public BsUsersCQ addOrderBy_Id_Desc() {
        regOBD("id");
        return this;
    }

    protected ConditionValue _login;

    public ConditionValue getLogin() {
        if (_login == null) {
            _login = nCV();
        }
        return _login;
    }

    @Override
    protected ConditionValue getCValueLogin() {
        return getLogin();
    }

    /** 
     * Add order-by as ascend. <br />
     * login: {NotNull, VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsUsersCQ addOrderBy_Login_Asc() {
        regOBA("login");
        return this;
    }

    /**
     * Add order-by as descend. <br />
     * login: {NotNull, VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsUsersCQ addOrderBy_Login_Desc() {
        regOBD("login");
        return this;
    }

    protected ConditionValue _hashedPassword;

    public ConditionValue getHashedPassword() {
        if (_hashedPassword == null) {
            _hashedPassword = nCV();
        }
        return _hashedPassword;
    }

    @Override
    protected ConditionValue getCValueHashedPassword() {
        return getHashedPassword();
    }

    /** 
     * Add order-by as ascend. <br />
     * hashed_password: {NotNull, VARCHAR(40)}
     * @return this. (NotNull)
     */
    public BsUsersCQ addOrderBy_HashedPassword_Asc() {
        regOBA("hashed_password");
        return this;
    }

    /**
     * Add order-by as descend. <br />
     * hashed_password: {NotNull, VARCHAR(40)}
     * @return this. (NotNull)
     */
    public BsUsersCQ addOrderBy_HashedPassword_Desc() {
        regOBD("hashed_password");
        return this;
    }

    protected ConditionValue _firstname;

    public ConditionValue getFirstname() {
        if (_firstname == null) {
            _firstname = nCV();
        }
        return _firstname;
    }

    @Override
    protected ConditionValue getCValueFirstname() {
        return getFirstname();
    }

    /** 
     * Add order-by as ascend. <br />
     * firstname: {NotNull, VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsUsersCQ addOrderBy_Firstname_Asc() {
        regOBA("firstname");
        return this;
    }

    /**
     * Add order-by as descend. <br />
     * firstname: {NotNull, VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsUsersCQ addOrderBy_Firstname_Desc() {
        regOBD("firstname");
        return this;
    }

    protected ConditionValue _lastname;

    public ConditionValue getLastname() {
        if (_lastname == null) {
            _lastname = nCV();
        }
        return _lastname;
    }

    @Override
    protected ConditionValue getCValueLastname() {
        return getLastname();
    }

    /** 
     * Add order-by as ascend. <br />
     * lastname: {NotNull, VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsUsersCQ addOrderBy_Lastname_Asc() {
        regOBA("lastname");
        return this;
    }

    /**
     * Add order-by as descend. <br />
     * lastname: {NotNull, VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsUsersCQ addOrderBy_Lastname_Desc() {
        regOBD("lastname");
        return this;
    }

    protected ConditionValue _mail;

    public ConditionValue getMail() {
        if (_mail == null) {
            _mail = nCV();
        }
        return _mail;
    }

    @Override
    protected ConditionValue getCValueMail() {
        return getMail();
    }

    /** 
     * Add order-by as ascend. <br />
     * mail: {NotNull, VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsUsersCQ addOrderBy_Mail_Asc() {
        regOBA("mail");
        return this;
    }

    /**
     * Add order-by as descend. <br />
     * mail: {NotNull, VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsUsersCQ addOrderBy_Mail_Desc() {
        regOBD("mail");
        return this;
    }

    protected ConditionValue _admin;

    public ConditionValue getAdmin() {
        if (_admin == null) {
            _admin = nCV();
        }
        return _admin;
    }

    @Override
    protected ConditionValue getCValueAdmin() {
        return getAdmin();
    }

    /** 
     * Add order-by as ascend. <br />
     * admin: {NotNull, BIT, default=[0]}
     * @return this. (NotNull)
     */
    public BsUsersCQ addOrderBy_Admin_Asc() {
        regOBA("admin");
        return this;
    }

    /**
     * Add order-by as descend. <br />
     * admin: {NotNull, BIT, default=[0]}
     * @return this. (NotNull)
     */
    public BsUsersCQ addOrderBy_Admin_Desc() {
        regOBD("admin");
        return this;
    }

    protected ConditionValue _status;

    public ConditionValue getStatus() {
        if (_status == null) {
            _status = nCV();
        }
        return _status;
    }

    @Override
    protected ConditionValue getCValueStatus() {
        return getStatus();
    }

    /** 
     * Add order-by as ascend. <br />
     * status: {NotNull, INT(10), default=[1]}
     * @return this. (NotNull)
     */
    public BsUsersCQ addOrderBy_Status_Asc() {
        regOBA("status");
        return this;
    }

    /**
     * Add order-by as descend. <br />
     * status: {NotNull, INT(10), default=[1]}
     * @return this. (NotNull)
     */
    public BsUsersCQ addOrderBy_Status_Desc() {
        regOBD("status");
        return this;
    }

    protected ConditionValue _lastLoginOn;

    public ConditionValue getLastLoginOn() {
        if (_lastLoginOn == null) {
            _lastLoginOn = nCV();
        }
        return _lastLoginOn;
    }

    @Override
    protected ConditionValue getCValueLastLoginOn() {
        return getLastLoginOn();
    }

    /** 
     * Add order-by as ascend. <br />
     * last_login_on: {DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsUsersCQ addOrderBy_LastLoginOn_Asc() {
        regOBA("last_login_on");
        return this;
    }

    /**
     * Add order-by as descend. <br />
     * last_login_on: {DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsUsersCQ addOrderBy_LastLoginOn_Desc() {
        regOBD("last_login_on");
        return this;
    }

    protected ConditionValue _language;

    public ConditionValue getLanguage() {
        if (_language == null) {
            _language = nCV();
        }
        return _language;
    }

    @Override
    protected ConditionValue getCValueLanguage() {
        return getLanguage();
    }

    /** 
     * Add order-by as ascend. <br />
     * language: {VARCHAR(5)}
     * @return this. (NotNull)
     */
    public BsUsersCQ addOrderBy_Language_Asc() {
        regOBA("language");
        return this;
    }

    /**
     * Add order-by as descend. <br />
     * language: {VARCHAR(5)}
     * @return this. (NotNull)
     */
    public BsUsersCQ addOrderBy_Language_Desc() {
        regOBD("language");
        return this;
    }

    protected ConditionValue _authSourceId;

    public ConditionValue getAuthSourceId() {
        if (_authSourceId == null) {
            _authSourceId = nCV();
        }
        return _authSourceId;
    }

    @Override
    protected ConditionValue getCValueAuthSourceId() {
        return getAuthSourceId();
    }

    /** 
     * Add order-by as ascend. <br />
     * auth_source_id: {IX, INT(10)}
     * @return this. (NotNull)
     */
    public BsUsersCQ addOrderBy_AuthSourceId_Asc() {
        regOBA("auth_source_id");
        return this;
    }

    /**
     * Add order-by as descend. <br />
     * auth_source_id: {IX, INT(10)}
     * @return this. (NotNull)
     */
    public BsUsersCQ addOrderBy_AuthSourceId_Desc() {
        regOBD("auth_source_id");
        return this;
    }

    protected ConditionValue _createdOn;

    public ConditionValue getCreatedOn() {
        if (_createdOn == null) {
            _createdOn = nCV();
        }
        return _createdOn;
    }

    @Override
    protected ConditionValue getCValueCreatedOn() {
        return getCreatedOn();
    }

    /** 
     * Add order-by as ascend. <br />
     * created_on: {DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsUsersCQ addOrderBy_CreatedOn_Asc() {
        regOBA("created_on");
        return this;
    }

    /**
     * Add order-by as descend. <br />
     * created_on: {DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsUsersCQ addOrderBy_CreatedOn_Desc() {
        regOBD("created_on");
        return this;
    }

    protected ConditionValue _updatedOn;

    public ConditionValue getUpdatedOn() {
        if (_updatedOn == null) {
            _updatedOn = nCV();
        }
        return _updatedOn;
    }

    @Override
    protected ConditionValue getCValueUpdatedOn() {
        return getUpdatedOn();
    }

    /** 
     * Add order-by as ascend. <br />
     * updated_on: {DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsUsersCQ addOrderBy_UpdatedOn_Asc() {
        regOBA("updated_on");
        return this;
    }

    /**
     * Add order-by as descend. <br />
     * updated_on: {DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsUsersCQ addOrderBy_UpdatedOn_Desc() {
        regOBD("updated_on");
        return this;
    }

    protected ConditionValue _type;

    public ConditionValue getType() {
        if (_type == null) {
            _type = nCV();
        }
        return _type;
    }

    @Override
    protected ConditionValue getCValueType() {
        return getType();
    }

    /** 
     * Add order-by as ascend. <br />
     * type: {IX, VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsUsersCQ addOrderBy_Type_Asc() {
        regOBA("type");
        return this;
    }

    /**
     * Add order-by as descend. <br />
     * type: {IX, VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsUsersCQ addOrderBy_Type_Desc() {
        regOBD("type");
        return this;
    }

    protected ConditionValue _identityUrl;

    public ConditionValue getIdentityUrl() {
        if (_identityUrl == null) {
            _identityUrl = nCV();
        }
        return _identityUrl;
    }

    @Override
    protected ConditionValue getCValueIdentityUrl() {
        return getIdentityUrl();
    }

    /** 
     * Add order-by as ascend. <br />
     * identity_url: {VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsUsersCQ addOrderBy_IdentityUrl_Asc() {
        regOBA("identity_url");
        return this;
    }

    /**
     * Add order-by as descend. <br />
     * identity_url: {VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsUsersCQ addOrderBy_IdentityUrl_Desc() {
        regOBD("identity_url");
        return this;
    }

    protected ConditionValue _mailNotification;

    public ConditionValue getMailNotification() {
        if (_mailNotification == null) {
            _mailNotification = nCV();
        }
        return _mailNotification;
    }

    @Override
    protected ConditionValue getCValueMailNotification() {
        return getMailNotification();
    }

    /** 
     * Add order-by as ascend. <br />
     * mail_notification: {NotNull, VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsUsersCQ addOrderBy_MailNotification_Asc() {
        regOBA("mail_notification");
        return this;
    }

    /**
     * Add order-by as descend. <br />
     * mail_notification: {NotNull, VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsUsersCQ addOrderBy_MailNotification_Desc() {
        regOBD("mail_notification");
        return this;
    }

    protected ConditionValue _salt;

    public ConditionValue getSalt() {
        if (_salt == null) {
            _salt = nCV();
        }
        return _salt;
    }

    @Override
    protected ConditionValue getCValueSalt() {
        return getSalt();
    }

    /** 
     * Add order-by as ascend. <br />
     * salt: {VARCHAR(64)}
     * @return this. (NotNull)
     */
    public BsUsersCQ addOrderBy_Salt_Asc() {
        regOBA("salt");
        return this;
    }

    /**
     * Add order-by as descend. <br />
     * salt: {VARCHAR(64)}
     * @return this. (NotNull)
     */
    public BsUsersCQ addOrderBy_Salt_Desc() {
        regOBD("salt");
        return this;
    }

    // ===================================================================================
    //                                                             SpecifiedDerivedOrderBy
    //                                                             =======================
    /**
     * Add order-by for specified derived column as ascend.
     * <pre>
     * cb.specify().derivedPurchaseList().max(new SubQuery&lt;PurchaseCB&gt;() {
     *     public void query(PurchaseCB subCB) {
     *         subCB.specify().columnPurchaseDatetime();
     *     }
     * }, <span style="color: #FD4747">aliasName</span>);
     * <span style="color: #3F7E5E">// order by [alias-name] asc</span>
     * cb.<span style="color: #FD4747">addSpecifiedDerivedOrderBy_Asc</span>(<span style="color: #FD4747">aliasName</span>);
     * </pre>
     * @param aliasName The alias name specified at (Specify)DerivedReferrer. (NotNull)
     * @return this. (NotNull)
     */
    public BsUsersCQ addSpecifiedDerivedOrderBy_Asc(final String aliasName) {
        registerSpecifiedDerivedOrderBy_Asc(aliasName);
        return this;
    }

    /**
     * Add order-by for specified derived column as descend.
     * <pre>
     * cb.specify().derivedPurchaseList().max(new SubQuery&lt;PurchaseCB&gt;() {
     *     public void query(PurchaseCB subCB) {
     *         subCB.specify().columnPurchaseDatetime();
     *     }
     * }, <span style="color: #FD4747">aliasName</span>);
     * <span style="color: #3F7E5E">// order by [alias-name] desc</span>
     * cb.<span style="color: #FD4747">addSpecifiedDerivedOrderBy_Desc</span>(<span style="color: #FD4747">aliasName</span>);
     * </pre>
     * @param aliasName The alias name specified at (Specify)DerivedReferrer. (NotNull)
     * @return this. (NotNull)
     */
    public BsUsersCQ addSpecifiedDerivedOrderBy_Desc(final String aliasName) {
        registerSpecifiedDerivedOrderBy_Desc(aliasName);
        return this;
    }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    @Override
    protected void reflectRelationOnUnionQuery(
            final ConditionQuery baseQueryAsSuper,
            final ConditionQuery unionQueryAsSuper) {
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    protected Map<String, UsersCQ> _scalarConditionMap;

    public Map<String, UsersCQ> getScalarCondition() {
        return _scalarConditionMap;
    }

    @Override
    public String keepScalarCondition(final UsersCQ subQuery) {
        if (_scalarConditionMap == null) {
            _scalarConditionMap = newLinkedHashMap();
        }
        final String key = "subQueryMapKey" + (_scalarConditionMap.size() + 1);
        _scalarConditionMap.put(key, subQuery);
        return "scalarCondition." + key;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    protected Map<String, UsersCQ> _specifyMyselfDerivedMap;

    public Map<String, UsersCQ> getSpecifyMyselfDerived() {
        return _specifyMyselfDerivedMap;
    }

    @Override
    public String keepSpecifyMyselfDerived(final UsersCQ subQuery) {
        if (_specifyMyselfDerivedMap == null) {
            _specifyMyselfDerivedMap = newLinkedHashMap();
        }
        final String key = "subQueryMapKey"
                + (_specifyMyselfDerivedMap.size() + 1);
        _specifyMyselfDerivedMap.put(key, subQuery);
        return "specifyMyselfDerived." + key;
    }

    protected Map<String, UsersCQ> _queryMyselfDerivedMap;

    public Map<String, UsersCQ> getQueryMyselfDerived() {
        return _queryMyselfDerivedMap;
    }

    @Override
    public String keepQueryMyselfDerived(final UsersCQ subQuery) {
        if (_queryMyselfDerivedMap == null) {
            _queryMyselfDerivedMap = newLinkedHashMap();
        }
        final String key = "subQueryMapKey"
                + (_queryMyselfDerivedMap.size() + 1);
        _queryMyselfDerivedMap.put(key, subQuery);
        return "queryMyselfDerived." + key;
    }

    protected Map<String, Object> _qyeryMyselfDerivedParameterMap;

    public Map<String, Object> getQueryMyselfDerivedParameter() {
        return _qyeryMyselfDerivedParameterMap;
    }

    @Override
    public String keepQueryMyselfDerivedParameter(final Object parameterValue) {
        if (_qyeryMyselfDerivedParameterMap == null) {
            _qyeryMyselfDerivedParameterMap = newLinkedHashMap();
        }
        final String key = "subQueryParameterKey"
                + (_qyeryMyselfDerivedParameterMap.size() + 1);
        _qyeryMyselfDerivedParameterMap.put(key, parameterValue);
        return "queryMyselfDerivedParameter." + key;
    }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, UsersCQ> _myselfExistsMap;

    public Map<String, UsersCQ> getMyselfExists() {
        return _myselfExistsMap;
    }

    @Override
    public String keepMyselfExists(final UsersCQ subQuery) {
        if (_myselfExistsMap == null) {
            _myselfExistsMap = newLinkedHashMap();
        }
        final String key = "subQueryMapKey" + (_myselfExistsMap.size() + 1);
        _myselfExistsMap.put(key, subQuery);
        return "myselfExists." + key;
    }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    protected Map<String, UsersCQ> _myselfInScopeMap;

    public Map<String, UsersCQ> getMyselfInScope() {
        return _myselfInScopeMap;
    }

    @Override
    public String keepMyselfInScope(final UsersCQ subQuery) {
        if (_myselfInScopeMap == null) {
            _myselfInScopeMap = newLinkedHashMap();
        }
        final String key = "subQueryMapKey" + (_myselfInScopeMap.size() + 1);
        _myselfInScopeMap.put(key, subQuery);
        return "myselfInScope." + key;
    }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() {
        return UsersCB.class.getName();
    }

    protected String xCQ() {
        return UsersCQ.class.getName();
    }

    protected String xMap() {
        return Map.class.getName();
    }
}
