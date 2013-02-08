package net.marevol.redmine.impasse.db.bsentity.dbmeta;

import java.util.List;
import java.util.Map;

import net.marevol.redmine.impasse.db.allcommon.DBCurrent;
import net.marevol.redmine.impasse.db.allcommon.DBFluteConfig;
import net.marevol.redmine.impasse.db.exentity.ImpasseTestSteps;

import org.seasar.dbflute.DBDef;
import org.seasar.dbflute.Entity;
import org.seasar.dbflute.dbmeta.AbstractDBMeta;
import org.seasar.dbflute.dbmeta.PropertyGateway;
import org.seasar.dbflute.dbmeta.info.ColumnInfo;
import org.seasar.dbflute.dbmeta.info.UniqueInfo;
import org.seasar.dbflute.dbmeta.name.TableSqlName;

/**
 * The DB meta of impasse_test_steps. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class ImpasseTestStepsDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final ImpasseTestStepsDbm _instance = new ImpasseTestStepsDbm();

    private ImpasseTestStepsDbm() {
    }

    public static ImpasseTestStepsDbm getInstance() {
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
        setupEpg(_epgMap, new EpgTestCaseId(), "testCaseId");
        setupEpg(_epgMap, new EpgStepNumber(), "stepNumber");
        setupEpg(_epgMap, new EpgActions(), "actions");
        setupEpg(_epgMap, new EpgExpectedResults(), "expectedResults");
    }

    @Override
    public PropertyGateway findPropertyGateway(final String propertyName) {
        return doFindEpg(_epgMap, propertyName);
    }

    public static class EpgId implements PropertyGateway {
        @Override
        public Object read(final Entity e) {
            return ((ImpasseTestSteps) e).getId();
        }

        @Override
        public void write(final Entity e, final Object v) {
            ((ImpasseTestSteps) e).setId(cti(v));
        }
    }

    public static class EpgTestCaseId implements PropertyGateway {
        @Override
        public Object read(final Entity e) {
            return ((ImpasseTestSteps) e).getTestCaseId();
        }

        @Override
        public void write(final Entity e, final Object v) {
            ((ImpasseTestSteps) e).setTestCaseId(cti(v));
        }
    }

    public static class EpgStepNumber implements PropertyGateway {
        @Override
        public Object read(final Entity e) {
            return ((ImpasseTestSteps) e).getStepNumber();
        }

        @Override
        public void write(final Entity e, final Object v) {
            ((ImpasseTestSteps) e).setStepNumber(cti(v));
        }
    }

    public static class EpgActions implements PropertyGateway {
        @Override
        public Object read(final Entity e) {
            return ((ImpasseTestSteps) e).getActions();
        }

        @Override
        public void write(final Entity e, final Object v) {
            ((ImpasseTestSteps) e).setActions((String) v);
        }
    }

    public static class EpgExpectedResults implements PropertyGateway {
        @Override
        public Object read(final Entity e) {
            return ((ImpasseTestSteps) e).getExpectedResults();
        }

        @Override
        public void write(final Entity e, final Object v) {
            ((ImpasseTestSteps) e).setExpectedResults((String) v);
        }
    }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "impasse_test_steps";

    protected final String _tablePropertyName = "impasseTestSteps";

    protected final TableSqlName _tableSqlName = new TableSqlName(
            "impasse_test_steps", _tableDbName);
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

    protected final ColumnInfo _columnTestCaseId = cci("test_case_id",
            "test_case_id", null, null, true, "testCaseId", Integer.class,
            false, false, "INT", 10, 0, null, false, null, null, null, null,
            null);

    protected final ColumnInfo _columnStepNumber = cci("step_number",
            "step_number", null, null, false, "stepNumber", Integer.class,
            false, false, "INT", 10, 0, null, false, null, null, null, null,
            null);

    protected final ColumnInfo _columnActions = cci("actions", "actions", null,
            null, false, "actions", String.class, false, false, "TEXT", 65535,
            0, null, false, null, null, null, null, null);

    protected final ColumnInfo _columnExpectedResults = cci("expected_results",
            "expected_results", null, null, false, "expectedResults",
            String.class, false, false, "TEXT", 65535, 0, null, false, null,
            null, null, null, null);

    public ColumnInfo columnId() {
        return _columnId;
    }

    public ColumnInfo columnTestCaseId() {
        return _columnTestCaseId;
    }

    public ColumnInfo columnStepNumber() {
        return _columnStepNumber;
    }

    public ColumnInfo columnActions() {
        return _columnActions;
    }

    public ColumnInfo columnExpectedResults() {
        return _columnExpectedResults;
    }

    @Override
    protected List<ColumnInfo> ccil() {
        final List<ColumnInfo> ls = newArrayList();
        ls.add(columnId());
        ls.add(columnTestCaseId());
        ls.add(columnStepNumber());
        ls.add(columnActions());
        ls.add(columnExpectedResults());
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
        return "net.marevol.redmine.impasse.db.exentity.ImpasseTestSteps";
    }

    @Override
    public String getConditionBeanTypeName() {
        return "net.marevol.redmine.impasse.db.cbean.ImpasseTestStepsCB";
    }

    @Override
    public String getDaoTypeName() {
        return "${glPackageExtendedDao}.ImpasseTestStepsDao";
    }

    @Override
    public String getBehaviorTypeName() {
        return "net.marevol.redmine.impasse.db.exbhv.ImpasseTestStepsBhv";
    }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    @Override
    public Class<ImpasseTestSteps> getEntityType() {
        return ImpasseTestSteps.class;
    }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    @Override
    public Entity newEntity() {
        return newMyEntity();
    }

    public ImpasseTestSteps newMyEntity() {
        return new ImpasseTestSteps();
    }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    @Override
    public void acceptPrimaryKeyMap(final Entity e,
            final Map<String, ? extends Object> m) {
        doAcceptPrimaryKeyMap((ImpasseTestSteps) e, m);
    }

    @Override
    public void acceptAllColumnMap(final Entity e,
            final Map<String, ? extends Object> m) {
        doAcceptAllColumnMap((ImpasseTestSteps) e, m);
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
