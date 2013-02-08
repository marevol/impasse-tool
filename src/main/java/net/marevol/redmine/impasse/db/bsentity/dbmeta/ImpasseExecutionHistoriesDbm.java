package net.marevol.redmine.impasse.db.bsentity.dbmeta;

import java.util.List;
import java.util.Map;

import net.marevol.redmine.impasse.db.allcommon.DBCurrent;
import net.marevol.redmine.impasse.db.allcommon.DBFluteConfig;
import net.marevol.redmine.impasse.db.exentity.ImpasseExecutionHistories;

import org.seasar.dbflute.DBDef;
import org.seasar.dbflute.Entity;
import org.seasar.dbflute.dbmeta.AbstractDBMeta;
import org.seasar.dbflute.dbmeta.PropertyGateway;
import org.seasar.dbflute.dbmeta.info.ColumnInfo;
import org.seasar.dbflute.dbmeta.info.UniqueInfo;
import org.seasar.dbflute.dbmeta.name.TableSqlName;

/**
 * The DB meta of impasse_execution_histories. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class ImpasseExecutionHistoriesDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final ImpasseExecutionHistoriesDbm _instance = new ImpasseExecutionHistoriesDbm();

    private ImpasseExecutionHistoriesDbm() {
    }

    public static ImpasseExecutionHistoriesDbm getInstance() {
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
        setupEpg(_epgMap, new EpgTestPlanCaseId(), "testPlanCaseId");
        setupEpg(_epgMap, new EpgTesterId(), "testerId");
        setupEpg(_epgMap, new EpgBuildId(), "buildId");
        setupEpg(_epgMap, new EpgExpectedDate(), "expectedDate");
        setupEpg(_epgMap, new EpgStatus(), "status");
        setupEpg(_epgMap, new EpgExecutionTs(), "executionTs");
        setupEpg(_epgMap, new EpgExecutorId(), "executorId");
        setupEpg(_epgMap, new EpgNotes(), "notes");
    }

    @Override
    public PropertyGateway findPropertyGateway(final String propertyName) {
        return doFindEpg(_epgMap, propertyName);
    }

    public static class EpgId implements PropertyGateway {
        @Override
        public Object read(final Entity e) {
            return ((ImpasseExecutionHistories) e).getId();
        }

        @Override
        public void write(final Entity e, final Object v) {
            ((ImpasseExecutionHistories) e).setId(cti(v));
        }
    }

    public static class EpgTestPlanCaseId implements PropertyGateway {
        @Override
        public Object read(final Entity e) {
            return ((ImpasseExecutionHistories) e).getTestPlanCaseId();
        }

        @Override
        public void write(final Entity e, final Object v) {
            ((ImpasseExecutionHistories) e).setTestPlanCaseId(cti(v));
        }
    }

    public static class EpgTesterId implements PropertyGateway {
        @Override
        public Object read(final Entity e) {
            return ((ImpasseExecutionHistories) e).getTesterId();
        }

        @Override
        public void write(final Entity e, final Object v) {
            ((ImpasseExecutionHistories) e).setTesterId(cti(v));
        }
    }

    public static class EpgBuildId implements PropertyGateway {
        @Override
        public Object read(final Entity e) {
            return ((ImpasseExecutionHistories) e).getBuildId();
        }

        @Override
        public void write(final Entity e, final Object v) {
            ((ImpasseExecutionHistories) e).setBuildId(cti(v));
        }
    }

    public static class EpgExpectedDate implements PropertyGateway {
        @Override
        public Object read(final Entity e) {
            return ((ImpasseExecutionHistories) e).getExpectedDate();
        }

        @Override
        public void write(final Entity e, final Object v) {
            ((ImpasseExecutionHistories) e).setExpectedDate((java.util.Date) v);
        }
    }

    public static class EpgStatus implements PropertyGateway {
        @Override
        public Object read(final Entity e) {
            return ((ImpasseExecutionHistories) e).getStatus();
        }

        @Override
        public void write(final Entity e, final Object v) {
            ((ImpasseExecutionHistories) e).setStatus((String) v);
        }
    }

    public static class EpgExecutionTs implements PropertyGateway {
        @Override
        public Object read(final Entity e) {
            return ((ImpasseExecutionHistories) e).getExecutionTs();
        }

        @Override
        public void write(final Entity e, final Object v) {
            ((ImpasseExecutionHistories) e)
                    .setExecutionTs((java.sql.Timestamp) v);
        }
    }

    public static class EpgExecutorId implements PropertyGateway {
        @Override
        public Object read(final Entity e) {
            return ((ImpasseExecutionHistories) e).getExecutorId();
        }

        @Override
        public void write(final Entity e, final Object v) {
            ((ImpasseExecutionHistories) e).setExecutorId(cti(v));
        }
    }

    public static class EpgNotes implements PropertyGateway {
        @Override
        public Object read(final Entity e) {
            return ((ImpasseExecutionHistories) e).getNotes();
        }

        @Override
        public void write(final Entity e, final Object v) {
            ((ImpasseExecutionHistories) e).setNotes((String) v);
        }
    }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "impasse_execution_histories";

    protected final String _tablePropertyName = "impasseExecutionHistories";

    protected final TableSqlName _tableSqlName = new TableSqlName(
            "impasse_execution_histories", _tableDbName);
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

    protected final ColumnInfo _columnTestPlanCaseId = cci("test_plan_case_id",
            "test_plan_case_id", null, null, true, "testPlanCaseId",
            Integer.class, false, false, "INT", 10, 0, null, false, null, null,
            null, null, null);

    protected final ColumnInfo _columnTesterId = cci("tester_id", "tester_id",
            null, null, false, "testerId", Integer.class, false, false, "INT",
            10, 0, null, false, null, null, null, null, null);

    protected final ColumnInfo _columnBuildId = cci("build_id", "build_id",
            null, null, false, "buildId", Integer.class, false, false, "INT",
            10, 0, null, false, null, null, null, null, null);

    protected final ColumnInfo _columnExpectedDate = cci("expected_date",
            "expected_date", null, null, false, "expectedDate",
            java.util.Date.class, false, false, "DATE", 10, 0, null, false,
            null, null, null, null, null);

    protected final ColumnInfo _columnStatus = cci("status", "status", null,
            null, true, "status", String.class, false, false, "VARCHAR", 255,
            0, null, false, null, null, null, null, null);

    protected final ColumnInfo _columnExecutionTs = cci("execution_ts",
            "execution_ts", null, null, true, "executionTs",
            java.sql.Timestamp.class, false, false, "DATETIME", 19, 0, null,
            false, null, null, null, null, null);

    protected final ColumnInfo _columnExecutorId = cci("executor_id",
            "executor_id", null, null, true, "executorId", Integer.class,
            false, false, "INT", 10, 0, null, false, null, null, null, null,
            null);

    protected final ColumnInfo _columnNotes = cci("notes", "notes", null, null,
            false, "notes", String.class, false, false, "TEXT", 65535, 0, null,
            false, null, null, null, null, null);

    public ColumnInfo columnId() {
        return _columnId;
    }

    public ColumnInfo columnTestPlanCaseId() {
        return _columnTestPlanCaseId;
    }

    public ColumnInfo columnTesterId() {
        return _columnTesterId;
    }

    public ColumnInfo columnBuildId() {
        return _columnBuildId;
    }

    public ColumnInfo columnExpectedDate() {
        return _columnExpectedDate;
    }

    public ColumnInfo columnStatus() {
        return _columnStatus;
    }

    public ColumnInfo columnExecutionTs() {
        return _columnExecutionTs;
    }

    public ColumnInfo columnExecutorId() {
        return _columnExecutorId;
    }

    public ColumnInfo columnNotes() {
        return _columnNotes;
    }

    @Override
    protected List<ColumnInfo> ccil() {
        final List<ColumnInfo> ls = newArrayList();
        ls.add(columnId());
        ls.add(columnTestPlanCaseId());
        ls.add(columnTesterId());
        ls.add(columnBuildId());
        ls.add(columnExpectedDate());
        ls.add(columnStatus());
        ls.add(columnExecutionTs());
        ls.add(columnExecutorId());
        ls.add(columnNotes());
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
        return "net.marevol.redmine.impasse.db.exentity.ImpasseExecutionHistories";
    }

    @Override
    public String getConditionBeanTypeName() {
        return "net.marevol.redmine.impasse.db.cbean.ImpasseExecutionHistoriesCB";
    }

    @Override
    public String getDaoTypeName() {
        return "${glPackageExtendedDao}.ImpasseExecutionHistoriesDao";
    }

    @Override
    public String getBehaviorTypeName() {
        return "net.marevol.redmine.impasse.db.exbhv.ImpasseExecutionHistoriesBhv";
    }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    @Override
    public Class<ImpasseExecutionHistories> getEntityType() {
        return ImpasseExecutionHistories.class;
    }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    @Override
    public Entity newEntity() {
        return newMyEntity();
    }

    public ImpasseExecutionHistories newMyEntity() {
        return new ImpasseExecutionHistories();
    }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    @Override
    public void acceptPrimaryKeyMap(final Entity e,
            final Map<String, ? extends Object> m) {
        doAcceptPrimaryKeyMap((ImpasseExecutionHistories) e, m);
    }

    @Override
    public void acceptAllColumnMap(final Entity e,
            final Map<String, ? extends Object> m) {
        doAcceptAllColumnMap((ImpasseExecutionHistories) e, m);
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
