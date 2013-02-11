package net.marevol.redmine.impasse.db.bsentity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import net.marevol.redmine.impasse.db.allcommon.DBMetaInstanceHandler;
import net.marevol.redmine.impasse.db.exentity.Users;

import org.seasar.dbflute.Entity;
import org.seasar.dbflute.dbmeta.DBMeta;

/**
 * The entity of users as TABLE. <br />
 * <pre>
 * [primary-key]
 *     id
 * 
 * [column]
 *     id, login, hashed_password, firstname, lastname, mail, admin, status, last_login_on, language, auth_source_id, created_on, updated_on, type, identity_url, mail_notification, salt
 * 
 * [sequence]
 *     
 * 
 * [identity]
 *     id
 * 
 * [version-no]
 *     
 * 
 * [foreign table]
 *     
 * 
 * [referrer table]
 *     
 * 
 * [foreign property]
 *     
 * 
 * [referrer property]
 *     
 * 
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Integer id = entity.getId();
 * String login = entity.getLogin();
 * String hashedPassword = entity.getHashedPassword();
 * String firstname = entity.getFirstname();
 * String lastname = entity.getLastname();
 * String mail = entity.getMail();
 * Boolean admin = entity.getAdmin();
 * Integer status = entity.getStatus();
 * java.sql.Timestamp lastLoginOn = entity.getLastLoginOn();
 * String language = entity.getLanguage();
 * Integer authSourceId = entity.getAuthSourceId();
 * java.sql.Timestamp createdOn = entity.getCreatedOn();
 * java.sql.Timestamp updatedOn = entity.getUpdatedOn();
 * String type = entity.getType();
 * String identityUrl = entity.getIdentityUrl();
 * String mailNotification = entity.getMailNotification();
 * String salt = entity.getSalt();
 * entity.setId(id);
 * entity.setLogin(login);
 * entity.setHashedPassword(hashedPassword);
 * entity.setFirstname(firstname);
 * entity.setLastname(lastname);
 * entity.setMail(mail);
 * entity.setAdmin(admin);
 * entity.setStatus(status);
 * entity.setLastLoginOn(lastLoginOn);
 * entity.setLanguage(language);
 * entity.setAuthSourceId(authSourceId);
 * entity.setCreatedOn(createdOn);
 * entity.setUpdatedOn(updatedOn);
 * entity.setType(type);
 * entity.setIdentityUrl(identityUrl);
 * entity.setMailNotification(mailNotification);
 * entity.setSalt(salt);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsUsers implements Entity, Serializable, Cloneable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** Serial version UID. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    // -----------------------------------------------------
    //                                                Column
    //                                                ------
    /** id: {PK, ID, IX, NotNull, INT(10)} */
    protected Integer _id;

    /** login: {NotNull, VARCHAR(255)} */
    protected String _login;

    /** hashed_password: {NotNull, VARCHAR(40)} */
    protected String _hashedPassword;

    /** firstname: {NotNull, VARCHAR(30)} */
    protected String _firstname;

    /** lastname: {NotNull, VARCHAR(30)} */
    protected String _lastname;

    /** mail: {NotNull, VARCHAR(60)} */
    protected String _mail;

    /** admin: {NotNull, BIT, default=[0]} */
    protected Boolean _admin;

    /** status: {NotNull, INT(10), default=[1]} */
    protected Integer _status;

    /** last_login_on: {DATETIME(19)} */
    protected java.sql.Timestamp _lastLoginOn;

    /** language: {VARCHAR(5)} */
    protected String _language;

    /** auth_source_id: {IX, INT(10)} */
    protected Integer _authSourceId;

    /** created_on: {DATETIME(19)} */
    protected java.sql.Timestamp _createdOn;

    /** updated_on: {DATETIME(19)} */
    protected java.sql.Timestamp _updatedOn;

    /** type: {IX, VARCHAR(255)} */
    protected String _type;

    /** identity_url: {VARCHAR(255)} */
    protected String _identityUrl;

    /** mail_notification: {NotNull, VARCHAR(255)} */
    protected String _mailNotification;

    /** salt: {VARCHAR(64)} */
    protected String _salt;

    // -----------------------------------------------------
    //                                              Internal
    //                                              --------
    /** The modified properties for this entity. (NotNull) */
    protected final EntityModifiedProperties __modifiedProperties = newModifiedProperties();

    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    /**
     * {@inheritDoc}
     */
    @Override
    public String getTableDbName() {
        return "users";
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getTablePropertyName() { // according to Java Beans rule
        return "users";
    }

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /**
     * {@inheritDoc}
     */
    @Override
    public DBMeta getDBMeta() {
        return DBMetaInstanceHandler.findDBMeta(getTableDbName());
    }

    // ===================================================================================
    //                                                                         Primary Key
    //                                                                         ===========
    /**
     * {@inheritDoc}
     */
    @Override
    public boolean hasPrimaryKeyValue() {
        if (getId() == null) {
            return false;
        }
        return true;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    protected <ELEMENT> List<ELEMENT> newReferrerList() {
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                 Modified Properties
    //                                                                 ===================
    /**
     * {@inheritDoc}
     */
    @Override
    public Set<String> modifiedProperties() {
        return __modifiedProperties.getPropertyNames();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void clearModifiedInfo() {
        __modifiedProperties.clear();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean hasModification() {
        return !__modifiedProperties.isEmpty();
    }

    protected EntityModifiedProperties newModifiedProperties() {
        return new EntityModifiedProperties();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    /**
     * Determine the object is equal with this. <br />
     * If primary-keys or columns of the other are same as this one, returns true.
     * @param other The other entity. (NullAllowed)
     * @return Comparing result.
     */
    @Override
    public boolean equals(final Object other) {
        if (other == null || !(other instanceof BsUsers)) {
            return false;
        }
        final BsUsers otherEntity = (BsUsers) other;
        if (!xSV(getId(), otherEntity.getId())) {
            return false;
        }
        return true;
    }

    protected boolean xSV(final Object value1, final Object value2) { // isSameValue()
        return InternalUtil.isSameValue(value1, value2);
    }

    /**
     * Calculate the hash-code from primary-keys or columns.
     * @return The hash-code from primary-key or columns.
     */
    @Override
    public int hashCode() {
        int result = 17;
        result = xCH(result, getTableDbName());
        result = xCH(result, getId());
        return result;
    }

    protected int xCH(final int result, final Object value) { // calculateHashcode()
        return InternalUtil.calculateHashcode(result, value);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int instanceHash() {
        return super.hashCode();
    }

    /**
     * Convert to display string of entity's data. (no relation data)
     * @return The display string of all columns and relation existences. (NotNull)
     */
    @Override
    public String toString() {
        return buildDisplayString(InternalUtil.toClassTitle(this), true, true);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String toStringWithRelation() {
        final StringBuilder sb = new StringBuilder();
        sb.append(toString());
        return sb.toString();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String buildDisplayString(final String name, final boolean column,
            final boolean relation) {
        final StringBuilder sb = new StringBuilder();
        if (name != null) {
            sb.append(name).append(column || relation ? ":" : "");
        }
        if (column) {
            sb.append(buildColumnString());
        }
        if (relation) {
            sb.append(buildRelationString());
        }
        sb.append("@").append(Integer.toHexString(hashCode()));
        return sb.toString();
    }

    protected String buildColumnString() {
        final StringBuilder sb = new StringBuilder();
        final String delimiter = ", ";
        sb.append(delimiter).append(getId());
        sb.append(delimiter).append(getLogin());
        sb.append(delimiter).append(getHashedPassword());
        sb.append(delimiter).append(getFirstname());
        sb.append(delimiter).append(getLastname());
        sb.append(delimiter).append(getMail());
        sb.append(delimiter).append(getAdmin());
        sb.append(delimiter).append(getStatus());
        sb.append(delimiter).append(getLastLoginOn());
        sb.append(delimiter).append(getLanguage());
        sb.append(delimiter).append(getAuthSourceId());
        sb.append(delimiter).append(getCreatedOn());
        sb.append(delimiter).append(getUpdatedOn());
        sb.append(delimiter).append(getType());
        sb.append(delimiter).append(getIdentityUrl());
        sb.append(delimiter).append(getMailNotification());
        sb.append(delimiter).append(getSalt());
        if (sb.length() > delimiter.length()) {
            sb.delete(0, delimiter.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    protected String buildRelationString() {
        return "";
    }

    /**
     * Clone entity instance using super.clone(). (shallow copy) 
     * @return The cloned instance of this entity. (NotNull)
     */
    @Override
    public Users clone() {
        try {
            return (Users) super.clone();
        } catch (final CloneNotSupportedException e) {
            throw new IllegalStateException("Failed to clone the entity: "
                    + toString(), e);
        }
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] id: {PK, ID, IX, NotNull, INT(10)} <br />
     * @return The value of the column 'id'. (NullAllowed)
     */
    public Integer getId() {
        return _id;
    }

    /**
     * [set] id: {PK, ID, IX, NotNull, INT(10)} <br />
     * @param id The value of the column 'id'. (NullAllowed)
     */
    public void setId(final Integer id) {
        __modifiedProperties.addPropertyName("id");
        _id = id;
    }

    /**
     * [get] login: {NotNull, VARCHAR(255)} <br />
     * @return The value of the column 'login'. (NullAllowed)
     */
    public String getLogin() {
        return _login;
    }

    /**
     * [set] login: {NotNull, VARCHAR(255)} <br />
     * @param login The value of the column 'login'. (NullAllowed)
     */
    public void setLogin(final String login) {
        __modifiedProperties.addPropertyName("login");
        _login = login;
    }

    /**
     * [get] hashed_password: {NotNull, VARCHAR(40)} <br />
     * @return The value of the column 'hashed_password'. (NullAllowed)
     */
    public String getHashedPassword() {
        return _hashedPassword;
    }

    /**
     * [set] hashed_password: {NotNull, VARCHAR(40)} <br />
     * @param hashedPassword The value of the column 'hashed_password'. (NullAllowed)
     */
    public void setHashedPassword(final String hashedPassword) {
        __modifiedProperties.addPropertyName("hashedPassword");
        _hashedPassword = hashedPassword;
    }

    /**
     * [get] firstname: {NotNull, VARCHAR(30)} <br />
     * @return The value of the column 'firstname'. (NullAllowed)
     */
    public String getFirstname() {
        return _firstname;
    }

    /**
     * [set] firstname: {NotNull, VARCHAR(30)} <br />
     * @param firstname The value of the column 'firstname'. (NullAllowed)
     */
    public void setFirstname(final String firstname) {
        __modifiedProperties.addPropertyName("firstname");
        _firstname = firstname;
    }

    /**
     * [get] lastname: {NotNull, VARCHAR(30)} <br />
     * @return The value of the column 'lastname'. (NullAllowed)
     */
    public String getLastname() {
        return _lastname;
    }

    /**
     * [set] lastname: {NotNull, VARCHAR(30)} <br />
     * @param lastname The value of the column 'lastname'. (NullAllowed)
     */
    public void setLastname(final String lastname) {
        __modifiedProperties.addPropertyName("lastname");
        _lastname = lastname;
    }

    /**
     * [get] mail: {NotNull, VARCHAR(60)} <br />
     * @return The value of the column 'mail'. (NullAllowed)
     */
    public String getMail() {
        return _mail;
    }

    /**
     * [set] mail: {NotNull, VARCHAR(60)} <br />
     * @param mail The value of the column 'mail'. (NullAllowed)
     */
    public void setMail(final String mail) {
        __modifiedProperties.addPropertyName("mail");
        _mail = mail;
    }

    /**
     * [get] admin: {NotNull, BIT, default=[0]} <br />
     * @return The value of the column 'admin'. (NullAllowed)
     */
    public Boolean getAdmin() {
        return _admin;
    }

    /**
     * [set] admin: {NotNull, BIT, default=[0]} <br />
     * @param admin The value of the column 'admin'. (NullAllowed)
     */
    public void setAdmin(final Boolean admin) {
        __modifiedProperties.addPropertyName("admin");
        _admin = admin;
    }

    /**
     * [get] status: {NotNull, INT(10), default=[1]} <br />
     * @return The value of the column 'status'. (NullAllowed)
     */
    public Integer getStatus() {
        return _status;
    }

    /**
     * [set] status: {NotNull, INT(10), default=[1]} <br />
     * @param status The value of the column 'status'. (NullAllowed)
     */
    public void setStatus(final Integer status) {
        __modifiedProperties.addPropertyName("status");
        _status = status;
    }

    /**
     * [get] last_login_on: {DATETIME(19)} <br />
     * @return The value of the column 'last_login_on'. (NullAllowed)
     */
    public java.sql.Timestamp getLastLoginOn() {
        return _lastLoginOn;
    }

    /**
     * [set] last_login_on: {DATETIME(19)} <br />
     * @param lastLoginOn The value of the column 'last_login_on'. (NullAllowed)
     */
    public void setLastLoginOn(final java.sql.Timestamp lastLoginOn) {
        __modifiedProperties.addPropertyName("lastLoginOn");
        _lastLoginOn = lastLoginOn;
    }

    /**
     * [get] language: {VARCHAR(5)} <br />
     * @return The value of the column 'language'. (NullAllowed)
     */
    public String getLanguage() {
        return _language;
    }

    /**
     * [set] language: {VARCHAR(5)} <br />
     * @param language The value of the column 'language'. (NullAllowed)
     */
    public void setLanguage(final String language) {
        __modifiedProperties.addPropertyName("language");
        _language = language;
    }

    /**
     * [get] auth_source_id: {IX, INT(10)} <br />
     * @return The value of the column 'auth_source_id'. (NullAllowed)
     */
    public Integer getAuthSourceId() {
        return _authSourceId;
    }

    /**
     * [set] auth_source_id: {IX, INT(10)} <br />
     * @param authSourceId The value of the column 'auth_source_id'. (NullAllowed)
     */
    public void setAuthSourceId(final Integer authSourceId) {
        __modifiedProperties.addPropertyName("authSourceId");
        _authSourceId = authSourceId;
    }

    /**
     * [get] created_on: {DATETIME(19)} <br />
     * @return The value of the column 'created_on'. (NullAllowed)
     */
    public java.sql.Timestamp getCreatedOn() {
        return _createdOn;
    }

    /**
     * [set] created_on: {DATETIME(19)} <br />
     * @param createdOn The value of the column 'created_on'. (NullAllowed)
     */
    public void setCreatedOn(final java.sql.Timestamp createdOn) {
        __modifiedProperties.addPropertyName("createdOn");
        _createdOn = createdOn;
    }

    /**
     * [get] updated_on: {DATETIME(19)} <br />
     * @return The value of the column 'updated_on'. (NullAllowed)
     */
    public java.sql.Timestamp getUpdatedOn() {
        return _updatedOn;
    }

    /**
     * [set] updated_on: {DATETIME(19)} <br />
     * @param updatedOn The value of the column 'updated_on'. (NullAllowed)
     */
    public void setUpdatedOn(final java.sql.Timestamp updatedOn) {
        __modifiedProperties.addPropertyName("updatedOn");
        _updatedOn = updatedOn;
    }

    /**
     * [get] type: {IX, VARCHAR(255)} <br />
     * @return The value of the column 'type'. (NullAllowed)
     */
    public String getType() {
        return _type;
    }

    /**
     * [set] type: {IX, VARCHAR(255)} <br />
     * @param type The value of the column 'type'. (NullAllowed)
     */
    public void setType(final String type) {
        __modifiedProperties.addPropertyName("type");
        _type = type;
    }

    /**
     * [get] identity_url: {VARCHAR(255)} <br />
     * @return The value of the column 'identity_url'. (NullAllowed)
     */
    public String getIdentityUrl() {
        return _identityUrl;
    }

    /**
     * [set] identity_url: {VARCHAR(255)} <br />
     * @param identityUrl The value of the column 'identity_url'. (NullAllowed)
     */
    public void setIdentityUrl(final String identityUrl) {
        __modifiedProperties.addPropertyName("identityUrl");
        _identityUrl = identityUrl;
    }

    /**
     * [get] mail_notification: {NotNull, VARCHAR(255)} <br />
     * @return The value of the column 'mail_notification'. (NullAllowed)
     */
    public String getMailNotification() {
        return _mailNotification;
    }

    /**
     * [set] mail_notification: {NotNull, VARCHAR(255)} <br />
     * @param mailNotification The value of the column 'mail_notification'. (NullAllowed)
     */
    public void setMailNotification(final String mailNotification) {
        __modifiedProperties.addPropertyName("mailNotification");
        _mailNotification = mailNotification;
    }

    /**
     * [get] salt: {VARCHAR(64)} <br />
     * @return The value of the column 'salt'. (NullAllowed)
     */
    public String getSalt() {
        return _salt;
    }

    /**
     * [set] salt: {VARCHAR(64)} <br />
     * @param salt The value of the column 'salt'. (NullAllowed)
     */
    public void setSalt(final String salt) {
        __modifiedProperties.addPropertyName("salt");
        _salt = salt;
    }
}
