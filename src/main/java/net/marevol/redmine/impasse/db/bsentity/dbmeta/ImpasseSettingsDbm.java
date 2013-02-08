package net.marevol.redmine.impasse.db.bsentity.dbmeta;

import java.util.List;
import java.util.Map;

import net.marevol.redmine.impasse.db.allcommon.DBCurrent;
import net.marevol.redmine.impasse.db.allcommon.DBFluteConfig;
import net.marevol.redmine.impasse.db.exentity.ImpasseSettings;

import org.seasar.dbflute.DBDef;
import org.seasar.dbflute.Entity;
import org.seasar.dbflute.dbmeta.AbstractDBMeta;
import org.seasar.dbflute.dbmeta.PropertyGateway;
import org.seasar.dbflute.dbmeta.info.ColumnInfo;
import org.seasar.dbflute.dbmeta.info.UniqueInfo;
import org.seasar.dbflute.dbmeta.name.TableSqlName;

/**
 * The DB meta of impasse_settings. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class ImpasseSettingsDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final ImpasseSettingsDbm _instance = new ImpasseSettingsDbm();

    private ImpasseSettingsDbm() {
    }

    public static ImpasseSettingsDbm getInstance() {
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
        setupEpg(_epgMap, new EpgProjectId(), "projectId");
        setupEpg(_epgMap, new EpgBugTrackerId(), "bugTrackerId");
        setupEpg(_epgMap, new EpgRequirementTracker(), "requirementTracker");
    }

    @Override
    public PropertyGateway findPropertyGateway(final String propertyName) {
        return doFindEpg(_epgMap, propertyName);
    }

    public static class EpgId implements PropertyGateway {
        @Override
        public Object read(final Entity e) {
            return ((ImpasseSettings) e).getId();
        }

        @Override
        public void write(final Entity e, final Object v) {
            ((ImpasseSettings) e).setId(cti(v));
        }
    }

    public static class EpgProjectId implements PropertyGateway {
        @Override
        public Object read(final Entity e) {
            return ((ImpasseSettings) e).getProjectId();
        }

        @Override
        public void write(final Entity e, final Object v) {
            ((ImpasseSettings) e).setProjectId(cti(v));
        }
    }

    public static class EpgBugTrackerId implements PropertyGateway {
        @Override
        public Object read(final Entity e) {
            return ((ImpasseSettings) e).getBugTrackerId();
        }

        @Override
        public void write(final Entity e, final Object v) {
            ((ImpasseSettings) e).setBugTrackerId(cti(v));
        }
    }

    public static class EpgRequirementTracker implements PropertyGateway {
        @Override
        public Object read(final Entity e) {
            return ((ImpasseSettings) e).getRequirementTracker();
        }

        @Override
        public void write(final Entity e, final Object v) {
            ((ImpasseSettings) e).setRequirementTracker((String) v);
        }
    }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "impasse_settings";

    protected final String _tablePropertyName = "impasseSettings";

    protected final TableSqlName _tableSqlName = new TableSqlName(
            "impasse_settings", _tableDbName);
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

    protected final ColumnInfo _columnProjectId = cci("project_id",
            "project_id", null, null, true, "projectId", Integer.class, false,
            false, "INT", 10, 0, null, false, null, null, null, null, null);

    protected final ColumnInfo _columnBugTrackerId = cci("bug_tracker_id",
            "bug_tracker_id", null, null, false, "bugTrackerId", Integer.class,
            false, false, "INT", 10, 0, null, false, null, null, null, null,
            null);

    protected final ColumnInfo _columnRequirementTracker = cci(
            "requirement_tracker", "requirement_tracker", null, null, false,
            "requirementTracker", String.class, false, false, "VARCHAR", 255,
            0, null, false, null, null, null, null, null);

    public ColumnInfo columnId() {
        return _columnId;
    }

    public ColumnInfo columnProjectId() {
        return _columnProjectId;
    }

    public ColumnInfo columnBugTrackerId() {
        return _columnBugTrackerId;
    }

    public ColumnInfo columnRequirementTracker() {
        return _columnRequirementTracker;
    }

    @Override
    protected List<ColumnInfo> ccil() {
        final List<ColumnInfo> ls = newArrayList();
        ls.add(columnId());
        ls.add(columnProjectId());
        ls.add(columnBugTrackerId());
        ls.add(columnRequirementTracker());
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
        return "net.marevol.redmine.impasse.db.exentity.ImpasseSettings";
    }

    @Override
    public String getConditionBeanTypeName() {
        return "net.marevol.redmine.impasse.db.cbean.ImpasseSettingsCB";
    }

    @Override
    public String getDaoTypeName() {
        return "${glPackageExtendedDao}.ImpasseSettingsDao";
    }

    @Override
    public String getBehaviorTypeName() {
        return "net.marevol.redmine.impasse.db.exbhv.ImpasseSettingsBhv";
    }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    @Override
    public Class<ImpasseSettings> getEntityType() {
        return ImpasseSettings.class;
    }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    @Override
    public Entity newEntity() {
        return newMyEntity();
    }

    public ImpasseSettings newMyEntity() {
        return new ImpasseSettings();
    }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    @Override
    public void acceptPrimaryKeyMap(final Entity e,
            final Map<String, ? extends Object> m) {
        doAcceptPrimaryKeyMap((ImpasseSettings) e, m);
    }

    @Override
    public void acceptAllColumnMap(final Entity e,
            final Map<String, ? extends Object> m) {
        doAcceptAllColumnMap((ImpasseSettings) e, m);
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
