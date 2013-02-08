package net.marevol.redmine.impasse.db.bsentity.dbmeta;

import java.util.List;
import java.util.Map;

import net.marevol.redmine.impasse.db.allcommon.DBCurrent;
import net.marevol.redmine.impasse.db.allcommon.DBFluteConfig;
import net.marevol.redmine.impasse.db.exentity.ImpasseRequirementCases;

import org.seasar.dbflute.DBDef;
import org.seasar.dbflute.Entity;
import org.seasar.dbflute.dbmeta.AbstractDBMeta;
import org.seasar.dbflute.dbmeta.PropertyGateway;
import org.seasar.dbflute.dbmeta.info.ColumnInfo;
import org.seasar.dbflute.dbmeta.info.UniqueInfo;
import org.seasar.dbflute.dbmeta.name.TableSqlName;

/**
 * The DB meta of impasse_requirement_cases. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class ImpasseRequirementCasesDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final ImpasseRequirementCasesDbm _instance = new ImpasseRequirementCasesDbm();

    private ImpasseRequirementCasesDbm() {
    }

    public static ImpasseRequirementCasesDbm getInstance() {
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
        setupEpg(_epgMap, new EpgRequirementId(), "requirementId");
        setupEpg(_epgMap, new EpgTestCaseId(), "testCaseId");
    }

    @Override
    public PropertyGateway findPropertyGateway(final String propertyName) {
        return doFindEpg(_epgMap, propertyName);
    }

    public static class EpgId implements PropertyGateway {
        @Override
        public Object read(final Entity e) {
            return ((ImpasseRequirementCases) e).getId();
        }

        @Override
        public void write(final Entity e, final Object v) {
            ((ImpasseRequirementCases) e).setId(cti(v));
        }
    }

    public static class EpgRequirementId implements PropertyGateway {
        @Override
        public Object read(final Entity e) {
            return ((ImpasseRequirementCases) e).getRequirementId();
        }

        @Override
        public void write(final Entity e, final Object v) {
            ((ImpasseRequirementCases) e).setRequirementId(cti(v));
        }
    }

    public static class EpgTestCaseId implements PropertyGateway {
        @Override
        public Object read(final Entity e) {
            return ((ImpasseRequirementCases) e).getTestCaseId();
        }

        @Override
        public void write(final Entity e, final Object v) {
            ((ImpasseRequirementCases) e).setTestCaseId(cti(v));
        }
    }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "impasse_requirement_cases";

    protected final String _tablePropertyName = "impasseRequirementCases";

    protected final TableSqlName _tableSqlName = new TableSqlName(
            "impasse_requirement_cases", _tableDbName);
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

    protected final ColumnInfo _columnRequirementId = cci("requirement_id",
            "requirement_id", null, null, true, "requirementId", Integer.class,
            false, false, "INT", 10, 0, null, false, null, null, null, null,
            null);

    protected final ColumnInfo _columnTestCaseId = cci("test_case_id",
            "test_case_id", null, null, true, "testCaseId", Integer.class,
            false, false, "INT", 10, 0, null, false, null, null, null, null,
            null);

    public ColumnInfo columnId() {
        return _columnId;
    }

    public ColumnInfo columnRequirementId() {
        return _columnRequirementId;
    }

    public ColumnInfo columnTestCaseId() {
        return _columnTestCaseId;
    }

    @Override
    protected List<ColumnInfo> ccil() {
        final List<ColumnInfo> ls = newArrayList();
        ls.add(columnId());
        ls.add(columnRequirementId());
        ls.add(columnTestCaseId());
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
        return "net.marevol.redmine.impasse.db.exentity.ImpasseRequirementCases";
    }

    @Override
    public String getConditionBeanTypeName() {
        return "net.marevol.redmine.impasse.db.cbean.ImpasseRequirementCasesCB";
    }

    @Override
    public String getDaoTypeName() {
        return "${glPackageExtendedDao}.ImpasseRequirementCasesDao";
    }

    @Override
    public String getBehaviorTypeName() {
        return "net.marevol.redmine.impasse.db.exbhv.ImpasseRequirementCasesBhv";
    }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    @Override
    public Class<ImpasseRequirementCases> getEntityType() {
        return ImpasseRequirementCases.class;
    }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    @Override
    public Entity newEntity() {
        return newMyEntity();
    }

    public ImpasseRequirementCases newMyEntity() {
        return new ImpasseRequirementCases();
    }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    @Override
    public void acceptPrimaryKeyMap(final Entity e,
            final Map<String, ? extends Object> m) {
        doAcceptPrimaryKeyMap((ImpasseRequirementCases) e, m);
    }

    @Override
    public void acceptAllColumnMap(final Entity e,
            final Map<String, ? extends Object> m) {
        doAcceptAllColumnMap((ImpasseRequirementCases) e, m);
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
