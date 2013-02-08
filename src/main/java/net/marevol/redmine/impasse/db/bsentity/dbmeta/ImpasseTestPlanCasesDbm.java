package net.marevol.redmine.impasse.db.bsentity.dbmeta;

import java.util.List;
import java.util.Map;

import net.marevol.redmine.impasse.db.allcommon.DBCurrent;
import net.marevol.redmine.impasse.db.allcommon.DBFluteConfig;
import net.marevol.redmine.impasse.db.exentity.ImpasseTestPlanCases;

import org.seasar.dbflute.DBDef;
import org.seasar.dbflute.Entity;
import org.seasar.dbflute.dbmeta.AbstractDBMeta;
import org.seasar.dbflute.dbmeta.PropertyGateway;
import org.seasar.dbflute.dbmeta.info.ColumnInfo;
import org.seasar.dbflute.dbmeta.info.UniqueInfo;
import org.seasar.dbflute.dbmeta.name.TableSqlName;

/**
 * The DB meta of impasse_test_plan_cases. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class ImpasseTestPlanCasesDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final ImpasseTestPlanCasesDbm _instance = new ImpasseTestPlanCasesDbm();

    private ImpasseTestPlanCasesDbm() {
    }

    public static ImpasseTestPlanCasesDbm getInstance() {
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
        setupEpg(_epgMap, new EpgTestPlanId(), "testPlanId");
        setupEpg(_epgMap, new EpgTestCaseId(), "testCaseId");
        setupEpg(_epgMap, new EpgNodeOrder(), "nodeOrder");
    }

    @Override
    public PropertyGateway findPropertyGateway(final String propertyName) {
        return doFindEpg(_epgMap, propertyName);
    }

    public static class EpgId implements PropertyGateway {
        @Override
        public Object read(final Entity e) {
            return ((ImpasseTestPlanCases) e).getId();
        }

        @Override
        public void write(final Entity e, final Object v) {
            ((ImpasseTestPlanCases) e).setId(cti(v));
        }
    }

    public static class EpgTestPlanId implements PropertyGateway {
        @Override
        public Object read(final Entity e) {
            return ((ImpasseTestPlanCases) e).getTestPlanId();
        }

        @Override
        public void write(final Entity e, final Object v) {
            ((ImpasseTestPlanCases) e).setTestPlanId(cti(v));
        }
    }

    public static class EpgTestCaseId implements PropertyGateway {
        @Override
        public Object read(final Entity e) {
            return ((ImpasseTestPlanCases) e).getTestCaseId();
        }

        @Override
        public void write(final Entity e, final Object v) {
            ((ImpasseTestPlanCases) e).setTestCaseId(cti(v));
        }
    }

    public static class EpgNodeOrder implements PropertyGateway {
        @Override
        public Object read(final Entity e) {
            return ((ImpasseTestPlanCases) e).getNodeOrder();
        }

        @Override
        public void write(final Entity e, final Object v) {
            ((ImpasseTestPlanCases) e).setNodeOrder(cti(v));
        }
    }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "impasse_test_plan_cases";

    protected final String _tablePropertyName = "impasseTestPlanCases";

    protected final TableSqlName _tableSqlName = new TableSqlName(
            "impasse_test_plan_cases", _tableDbName);
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

    protected final ColumnInfo _columnTestPlanId = cci("test_plan_id",
            "test_plan_id", null, null, false, "testPlanId", Integer.class,
            false, false, "INT", 10, 0, null, false, null, null, null, null,
            null);

    protected final ColumnInfo _columnTestCaseId = cci("test_case_id",
            "test_case_id", null, null, false, "testCaseId", Integer.class,
            false, false, "INT", 10, 0, null, false, null, null, null, null,
            null);

    protected final ColumnInfo _columnNodeOrder = cci("node_order",
            "node_order", null, null, false, "nodeOrder", Integer.class, false,
            false, "INT", 10, 0, null, false, null, null, null, null, null);

    public ColumnInfo columnId() {
        return _columnId;
    }

    public ColumnInfo columnTestPlanId() {
        return _columnTestPlanId;
    }

    public ColumnInfo columnTestCaseId() {
        return _columnTestCaseId;
    }

    public ColumnInfo columnNodeOrder() {
        return _columnNodeOrder;
    }

    @Override
    protected List<ColumnInfo> ccil() {
        final List<ColumnInfo> ls = newArrayList();
        ls.add(columnId());
        ls.add(columnTestPlanId());
        ls.add(columnTestCaseId());
        ls.add(columnNodeOrder());
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
        return "net.marevol.redmine.impasse.db.exentity.ImpasseTestPlanCases";
    }

    @Override
    public String getConditionBeanTypeName() {
        return "net.marevol.redmine.impasse.db.cbean.ImpasseTestPlanCasesCB";
    }

    @Override
    public String getDaoTypeName() {
        return "${glPackageExtendedDao}.ImpasseTestPlanCasesDao";
    }

    @Override
    public String getBehaviorTypeName() {
        return "net.marevol.redmine.impasse.db.exbhv.ImpasseTestPlanCasesBhv";
    }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    @Override
    public Class<ImpasseTestPlanCases> getEntityType() {
        return ImpasseTestPlanCases.class;
    }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    @Override
    public Entity newEntity() {
        return newMyEntity();
    }

    public ImpasseTestPlanCases newMyEntity() {
        return new ImpasseTestPlanCases();
    }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    @Override
    public void acceptPrimaryKeyMap(final Entity e,
            final Map<String, ? extends Object> m) {
        doAcceptPrimaryKeyMap((ImpasseTestPlanCases) e, m);
    }

    @Override
    public void acceptAllColumnMap(final Entity e,
            final Map<String, ? extends Object> m) {
        doAcceptAllColumnMap((ImpasseTestPlanCases) e, m);
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
