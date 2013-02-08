package net.marevol.redmine.impasse.db.bsentity.dbmeta;

import java.util.List;
import java.util.Map;

import net.marevol.redmine.impasse.db.allcommon.DBCurrent;
import net.marevol.redmine.impasse.db.allcommon.DBFluteConfig;
import net.marevol.redmine.impasse.db.exentity.ImpasseTestPlans;

import org.seasar.dbflute.DBDef;
import org.seasar.dbflute.Entity;
import org.seasar.dbflute.dbmeta.AbstractDBMeta;
import org.seasar.dbflute.dbmeta.PropertyGateway;
import org.seasar.dbflute.dbmeta.info.ColumnInfo;
import org.seasar.dbflute.dbmeta.info.UniqueInfo;
import org.seasar.dbflute.dbmeta.name.TableSqlName;

/**
 * The DB meta of impasse_test_plans. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class ImpasseTestPlansDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final ImpasseTestPlansDbm _instance = new ImpasseTestPlansDbm();

    private ImpasseTestPlansDbm() {
    }

    public static ImpasseTestPlansDbm getInstance() {
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
        setupEpg(_epgMap, new EpgVersionId(), "versionId");
        setupEpg(_epgMap, new EpgName(), "name");
        setupEpg(_epgMap, new EpgNotes(), "notes");
        setupEpg(_epgMap, new EpgActive(), "active");
    }

    @Override
    public PropertyGateway findPropertyGateway(final String propertyName) {
        return doFindEpg(_epgMap, propertyName);
    }

    public static class EpgId implements PropertyGateway {
        @Override
        public Object read(final Entity e) {
            return ((ImpasseTestPlans) e).getId();
        }

        @Override
        public void write(final Entity e, final Object v) {
            ((ImpasseTestPlans) e).setId(cti(v));
        }
    }

    public static class EpgVersionId implements PropertyGateway {
        @Override
        public Object read(final Entity e) {
            return ((ImpasseTestPlans) e).getVersionId();
        }

        @Override
        public void write(final Entity e, final Object v) {
            ((ImpasseTestPlans) e).setVersionId(cti(v));
        }
    }

    public static class EpgName implements PropertyGateway {
        @Override
        public Object read(final Entity e) {
            return ((ImpasseTestPlans) e).getName();
        }

        @Override
        public void write(final Entity e, final Object v) {
            ((ImpasseTestPlans) e).setName((String) v);
        }
    }

    public static class EpgNotes implements PropertyGateway {
        @Override
        public Object read(final Entity e) {
            return ((ImpasseTestPlans) e).getNotes();
        }

        @Override
        public void write(final Entity e, final Object v) {
            ((ImpasseTestPlans) e).setNotes((String) v);
        }
    }

    public static class EpgActive implements PropertyGateway {
        @Override
        public Object read(final Entity e) {
            return ((ImpasseTestPlans) e).getActive();
        }

        @Override
        public void write(final Entity e, final Object v) {
            ((ImpasseTestPlans) e).setActive((Boolean) v);
        }
    }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "impasse_test_plans";

    protected final String _tablePropertyName = "impasseTestPlans";

    protected final TableSqlName _tableSqlName = new TableSqlName(
            "impasse_test_plans", _tableDbName);
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

    protected final ColumnInfo _columnVersionId = cci("version_id",
            "version_id", null, null, true, "versionId", Integer.class, false,
            false, "INT", 10, 0, null, false, null, null, null, null, null);

    protected final ColumnInfo _columnName = cci("name", "name", null, null,
            true, "name", String.class, false, false, "VARCHAR", 255, 0, null,
            false, null, null, null, null, null);

    protected final ColumnInfo _columnNotes = cci("notes", "notes", null, null,
            false, "notes", String.class, false, false, "TEXT", 65535, 0, null,
            false, null, null, null, null, null);

    protected final ColumnInfo _columnActive = cci("active", "active", null,
            null, false, "active", Boolean.class, false, false, "BIT", null,
            null, null, false, null, null, null, null, null);

    public ColumnInfo columnId() {
        return _columnId;
    }

    public ColumnInfo columnVersionId() {
        return _columnVersionId;
    }

    public ColumnInfo columnName() {
        return _columnName;
    }

    public ColumnInfo columnNotes() {
        return _columnNotes;
    }

    public ColumnInfo columnActive() {
        return _columnActive;
    }

    @Override
    protected List<ColumnInfo> ccil() {
        final List<ColumnInfo> ls = newArrayList();
        ls.add(columnId());
        ls.add(columnVersionId());
        ls.add(columnName());
        ls.add(columnNotes());
        ls.add(columnActive());
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
        return "net.marevol.redmine.impasse.db.exentity.ImpasseTestPlans";
    }

    @Override
    public String getConditionBeanTypeName() {
        return "net.marevol.redmine.impasse.db.cbean.ImpasseTestPlansCB";
    }

    @Override
    public String getDaoTypeName() {
        return "${glPackageExtendedDao}.ImpasseTestPlansDao";
    }

    @Override
    public String getBehaviorTypeName() {
        return "net.marevol.redmine.impasse.db.exbhv.ImpasseTestPlansBhv";
    }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    @Override
    public Class<ImpasseTestPlans> getEntityType() {
        return ImpasseTestPlans.class;
    }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    @Override
    public Entity newEntity() {
        return newMyEntity();
    }

    public ImpasseTestPlans newMyEntity() {
        return new ImpasseTestPlans();
    }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    @Override
    public void acceptPrimaryKeyMap(final Entity e,
            final Map<String, ? extends Object> m) {
        doAcceptPrimaryKeyMap((ImpasseTestPlans) e, m);
    }

    @Override
    public void acceptAllColumnMap(final Entity e,
            final Map<String, ? extends Object> m) {
        doAcceptAllColumnMap((ImpasseTestPlans) e, m);
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
