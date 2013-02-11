package net.marevol.redmine.impasse.db.bsentity.dbmeta;

import java.util.List;
import java.util.Map;

import net.marevol.redmine.impasse.db.allcommon.DBCurrent;
import net.marevol.redmine.impasse.db.allcommon.DBFluteConfig;
import net.marevol.redmine.impasse.db.exentity.Users;

import org.seasar.dbflute.DBDef;
import org.seasar.dbflute.Entity;
import org.seasar.dbflute.dbmeta.AbstractDBMeta;
import org.seasar.dbflute.dbmeta.PropertyGateway;
import org.seasar.dbflute.dbmeta.info.ColumnInfo;
import org.seasar.dbflute.dbmeta.info.UniqueInfo;
import org.seasar.dbflute.dbmeta.name.TableSqlName;

/**
 * The DB meta of users. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class UsersDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final UsersDbm _instance = new UsersDbm();

    private UsersDbm() {
    }

    public static UsersDbm getInstance() {
        return _instance;
    }

    // ===================================================================================
    //                                                                       Current DBDef
    //                                                                       =============
    @Override
    public DBDef getCurrentDBDef() {
        return DBCurrent.getInstance().currentDBDef();
    }

    // ===================================================================================
    //                                                                    Property Gateway
    //                                                                    ================
    protected final Map<String, PropertyGateway> _epgMap = newHashMap();
    {
        setupEpg(_epgMap, new EpgId(), "id");
        setupEpg(_epgMap, new EpgLogin(), "login");
        setupEpg(_epgMap, new EpgHashedPassword(), "hashedPassword");
        setupEpg(_epgMap, new EpgFirstname(), "firstname");
        setupEpg(_epgMap, new EpgLastname(), "lastname");
        setupEpg(_epgMap, new EpgMail(), "mail");
        setupEpg(_epgMap, new EpgAdmin(), "admin");
        setupEpg(_epgMap, new EpgStatus(), "status");
        setupEpg(_epgMap, new EpgLastLoginOn(), "lastLoginOn");
        setupEpg(_epgMap, new EpgLanguage(), "language");
        setupEpg(_epgMap, new EpgAuthSourceId(), "authSourceId");
        setupEpg(_epgMap, new EpgCreatedOn(), "createdOn");
        setupEpg(_epgMap, new EpgUpdatedOn(), "updatedOn");
        setupEpg(_epgMap, new EpgType(), "type");
        setupEpg(_epgMap, new EpgIdentityUrl(), "identityUrl");
        setupEpg(_epgMap, new EpgMailNotification(), "mailNotification");
        setupEpg(_epgMap, new EpgSalt(), "salt");
    }

    @Override
    public PropertyGateway findPropertyGateway(final String propertyName) {
        return doFindEpg(_epgMap, propertyName);
    }

    public static class EpgId implements PropertyGateway {
        @Override
        public Object read(final Entity e) {
            return ((Users) e).getId();
        }

        @Override
        public void write(final Entity e, final Object v) {
            ((Users) e).setId(cti(v));
        }
    }

    public static class EpgLogin implements PropertyGateway {
        @Override
        public Object read(final Entity e) {
            return ((Users) e).getLogin();
        }

        @Override
        public void write(final Entity e, final Object v) {
            ((Users) e).setLogin((String) v);
        }
    }

    public static class EpgHashedPassword implements PropertyGateway {
        @Override
        public Object read(final Entity e) {
            return ((Users) e).getHashedPassword();
        }

        @Override
        public void write(final Entity e, final Object v) {
            ((Users) e).setHashedPassword((String) v);
        }
    }

    public static class EpgFirstname implements PropertyGateway {
        @Override
        public Object read(final Entity e) {
            return ((Users) e).getFirstname();
        }

        @Override
        public void write(final Entity e, final Object v) {
            ((Users) e).setFirstname((String) v);
        }
    }

    public static class EpgLastname implements PropertyGateway {
        @Override
        public Object read(final Entity e) {
            return ((Users) e).getLastname();
        }

        @Override
        public void write(final Entity e, final Object v) {
            ((Users) e).setLastname((String) v);
        }
    }

    public static class EpgMail implements PropertyGateway {
        @Override
        public Object read(final Entity e) {
            return ((Users) e).getMail();
        }

        @Override
        public void write(final Entity e, final Object v) {
            ((Users) e).setMail((String) v);
        }
    }

    public static class EpgAdmin implements PropertyGateway {
        @Override
        public Object read(final Entity e) {
            return ((Users) e).getAdmin();
        }

        @Override
        public void write(final Entity e, final Object v) {
            ((Users) e).setAdmin((Boolean) v);
        }
    }

    public static class EpgStatus implements PropertyGateway {
        @Override
        public Object read(final Entity e) {
            return ((Users) e).getStatus();
        }

        @Override
        public void write(final Entity e, final Object v) {
            ((Users) e).setStatus(cti(v));
        }
    }

    public static class EpgLastLoginOn implements PropertyGateway {
        @Override
        public Object read(final Entity e) {
            return ((Users) e).getLastLoginOn();
        }

        @Override
        public void write(final Entity e, final Object v) {
            ((Users) e).setLastLoginOn((java.sql.Timestamp) v);
        }
    }

    public static class EpgLanguage implements PropertyGateway {
        @Override
        public Object read(final Entity e) {
            return ((Users) e).getLanguage();
        }

        @Override
        public void write(final Entity e, final Object v) {
            ((Users) e).setLanguage((String) v);
        }
    }

    public static class EpgAuthSourceId implements PropertyGateway {
        @Override
        public Object read(final Entity e) {
            return ((Users) e).getAuthSourceId();
        }

        @Override
        public void write(final Entity e, final Object v) {
            ((Users) e).setAuthSourceId(cti(v));
        }
    }

    public static class EpgCreatedOn implements PropertyGateway {
        @Override
        public Object read(final Entity e) {
            return ((Users) e).getCreatedOn();
        }

        @Override
        public void write(final Entity e, final Object v) {
            ((Users) e).setCreatedOn((java.sql.Timestamp) v);
        }
    }

    public static class EpgUpdatedOn implements PropertyGateway {
        @Override
        public Object read(final Entity e) {
            return ((Users) e).getUpdatedOn();
        }

        @Override
        public void write(final Entity e, final Object v) {
            ((Users) e).setUpdatedOn((java.sql.Timestamp) v);
        }
    }

    public static class EpgType implements PropertyGateway {
        @Override
        public Object read(final Entity e) {
            return ((Users) e).getType();
        }

        @Override
        public void write(final Entity e, final Object v) {
            ((Users) e).setType((String) v);
        }
    }

    public static class EpgIdentityUrl implements PropertyGateway {
        @Override
        public Object read(final Entity e) {
            return ((Users) e).getIdentityUrl();
        }

        @Override
        public void write(final Entity e, final Object v) {
            ((Users) e).setIdentityUrl((String) v);
        }
    }

    public static class EpgMailNotification implements PropertyGateway {
        @Override
        public Object read(final Entity e) {
            return ((Users) e).getMailNotification();
        }

        @Override
        public void write(final Entity e, final Object v) {
            ((Users) e).setMailNotification((String) v);
        }
    }

    public static class EpgSalt implements PropertyGateway {
        @Override
        public Object read(final Entity e) {
            return ((Users) e).getSalt();
        }

        @Override
        public void write(final Entity e, final Object v) {
            ((Users) e).setSalt((String) v);
        }
    }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "users";

    protected final String _tablePropertyName = "users";

    protected final TableSqlName _tableSqlName = new TableSqlName("users",
            _tableDbName);
    {
        _tableSqlName.xacceptFilter(DBFluteConfig.getInstance()
                .getTableSqlNameFilter());
    }

    @Override
    public String getTableDbName() {
        return _tableDbName;
    }

    @Override
    public String getTablePropertyName() {
        return _tablePropertyName;
    }

    @Override
    public TableSqlName getTableSqlName() {
        return _tableSqlName;
    }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnId = cci("id", "id", null, null, true,
            "id", Integer.class, true, true, "INT", 10, 0, null, false, null,
            null, null, null, null);

    protected final ColumnInfo _columnLogin = cci("login", "login", null, null,
            true, "login", String.class, false, false, "VARCHAR", 255, 0, "",
            false, null, null, null, null, null);

    protected final ColumnInfo _columnHashedPassword = cci("hashed_password",
            "hashed_password", null, null, true, "hashedPassword",
            String.class, false, false, "VARCHAR", 40, 0, "", false, null,
            null, null, null, null);

    protected final ColumnInfo _columnFirstname = cci("firstname", "firstname",
            null, null, true, "firstname", String.class, false, false,
            "VARCHAR", 30, 0, "", false, null, null, null, null, null);

    protected final ColumnInfo _columnLastname = cci("lastname", "lastname",
            null, null, true, "lastname", String.class, false, false,
            "VARCHAR", 30, 0, "", false, null, null, null, null, null);

    protected final ColumnInfo _columnMail = cci("mail", "mail", null, null,
            true, "mail", String.class, false, false, "VARCHAR", 60, 0, "",
            false, null, null, null, null, null);

    protected final ColumnInfo _columnAdmin = cci("admin", "admin", null, null,
            true, "admin", Boolean.class, false, false, "BIT", null, null, "0",
            false, null, null, null, null, null);

    protected final ColumnInfo _columnStatus = cci("status", "status", null,
            null, true, "status", Integer.class, false, false, "INT", 10, 0,
            "1", false, null, null, null, null, null);

    protected final ColumnInfo _columnLastLoginOn = cci("last_login_on",
            "last_login_on", null, null, false, "lastLoginOn",
            java.sql.Timestamp.class, false, false, "DATETIME", 19, 0, null,
            false, null, null, null, null, null);

    protected final ColumnInfo _columnLanguage = cci("language", "language",
            null, null, false, "language", String.class, false, false,
            "VARCHAR", 5, 0, "", false, null, null, null, null, null);

    protected final ColumnInfo _columnAuthSourceId = cci("auth_source_id",
            "auth_source_id", null, null, false, "authSourceId", Integer.class,
            false, false, "INT", 10, 0, null, false, null, null, null, null,
            null);

    protected final ColumnInfo _columnCreatedOn = cci("created_on",
            "created_on", null, null, false, "createdOn",
            java.sql.Timestamp.class, false, false, "DATETIME", 19, 0, null,
            false, null, null, null, null, null);

    protected final ColumnInfo _columnUpdatedOn = cci("updated_on",
            "updated_on", null, null, false, "updatedOn",
            java.sql.Timestamp.class, false, false, "DATETIME", 19, 0, null,
            false, null, null, null, null, null);

    protected final ColumnInfo _columnType = cci("type", "type", null, null,
            false, "type", String.class, false, false, "VARCHAR", 255, 0, null,
            false, null, null, null, null, null);

    protected final ColumnInfo _columnIdentityUrl = cci("identity_url",
            "identity_url", null, null, false, "identityUrl", String.class,
            false, false, "VARCHAR", 255, 0, null, false, null, null, null,
            null, null);

    protected final ColumnInfo _columnMailNotification = cci(
            "mail_notification", "mail_notification", null, null, true,
            "mailNotification", String.class, false, false, "VARCHAR", 255, 0,
            "", false, null, null, null, null, null);

    protected final ColumnInfo _columnSalt = cci("salt", "salt", null, null,
            false, "salt", String.class, false, false, "VARCHAR", 64, 0, null,
            false, null, null, null, null, null);

    public ColumnInfo columnId() {
        return _columnId;
    }

    public ColumnInfo columnLogin() {
        return _columnLogin;
    }

    public ColumnInfo columnHashedPassword() {
        return _columnHashedPassword;
    }

    public ColumnInfo columnFirstname() {
        return _columnFirstname;
    }

    public ColumnInfo columnLastname() {
        return _columnLastname;
    }

    public ColumnInfo columnMail() {
        return _columnMail;
    }

    public ColumnInfo columnAdmin() {
        return _columnAdmin;
    }

    public ColumnInfo columnStatus() {
        return _columnStatus;
    }

    public ColumnInfo columnLastLoginOn() {
        return _columnLastLoginOn;
    }

    public ColumnInfo columnLanguage() {
        return _columnLanguage;
    }

    public ColumnInfo columnAuthSourceId() {
        return _columnAuthSourceId;
    }

    public ColumnInfo columnCreatedOn() {
        return _columnCreatedOn;
    }

    public ColumnInfo columnUpdatedOn() {
        return _columnUpdatedOn;
    }

    public ColumnInfo columnType() {
        return _columnType;
    }

    public ColumnInfo columnIdentityUrl() {
        return _columnIdentityUrl;
    }

    public ColumnInfo columnMailNotification() {
        return _columnMailNotification;
    }

    public ColumnInfo columnSalt() {
        return _columnSalt;
    }

    @Override
    protected List<ColumnInfo> ccil() {
        final List<ColumnInfo> ls = newArrayList();
        ls.add(columnId());
        ls.add(columnLogin());
        ls.add(columnHashedPassword());
        ls.add(columnFirstname());
        ls.add(columnLastname());
        ls.add(columnMail());
        ls.add(columnAdmin());
        ls.add(columnStatus());
        ls.add(columnLastLoginOn());
        ls.add(columnLanguage());
        ls.add(columnAuthSourceId());
        ls.add(columnCreatedOn());
        ls.add(columnUpdatedOn());
        ls.add(columnType());
        ls.add(columnIdentityUrl());
        ls.add(columnMailNotification());
        ls.add(columnSalt());
        return ls;
    }

    {
        initializeInformationResource();
    }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    @Override
    protected UniqueInfo cpui() {
        return hpcpui(columnId());
    }

    @Override
    public boolean hasPrimaryKey() {
        return true;
    }

    @Override
    public boolean hasCompoundPrimaryKey() {
        return false;
    }

    // ===================================================================================
    //                                                                       Relation Info
    //                                                                       =============
    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============
    @Override
    public boolean hasIdentity() {
        return true;
    }

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    @Override
    public String getEntityTypeName() {
        return "net.marevol.redmine.impasse.db.exentity.Users";
    }

    @Override
    public String getConditionBeanTypeName() {
        return "net.marevol.redmine.impasse.db.cbean.UsersCB";
    }

    @Override
    public String getDaoTypeName() {
        return "${glPackageExtendedDao}.UsersDao";
    }

    @Override
    public String getBehaviorTypeName() {
        return "net.marevol.redmine.impasse.db.exbhv.UsersBhv";
    }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    @Override
    public Class<Users> getEntityType() {
        return Users.class;
    }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    @Override
    public Entity newEntity() {
        return newMyEntity();
    }

    public Users newMyEntity() {
        return new Users();
    }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    @Override
    public void acceptPrimaryKeyMap(final Entity e,
            final Map<String, ? extends Object> m) {
        doAcceptPrimaryKeyMap((Users) e, m);
    }

    @Override
    public void acceptAllColumnMap(final Entity e,
            final Map<String, ? extends Object> m) {
        doAcceptAllColumnMap((Users) e, m);
    }

    @Override
    public Map<String, Object> extractPrimaryKeyMap(final Entity e) {
        return doExtractPrimaryKeyMap(e);
    }

    @Override
    public Map<String, Object> extractAllColumnMap(final Entity e) {
        return doExtractAllColumnMap(e);
    }
}
