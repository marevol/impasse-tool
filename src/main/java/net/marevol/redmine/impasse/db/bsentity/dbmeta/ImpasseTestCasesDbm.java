package net.marevol.redmine.impasse.db.bsentity.dbmeta;

import java.util.List;
import java.util.Map;

import net.marevol.redmine.impasse.db.allcommon.DBCurrent;
import net.marevol.redmine.impasse.db.allcommon.DBFluteConfig;
import net.marevol.redmine.impasse.db.exentity.ImpasseTestCases;

import org.seasar.dbflute.DBDef;
import org.seasar.dbflute.Entity;
import org.seasar.dbflute.dbmeta.AbstractDBMeta;
import org.seasar.dbflute.dbmeta.PropertyGateway;
import org.seasar.dbflute.dbmeta.info.ColumnInfo;
import org.seasar.dbflute.dbmeta.info.UniqueInfo;
import org.seasar.dbflute.dbmeta.name.TableSqlName;

/**
 * The DB meta of impasse_test_cases. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class ImpasseTestCasesDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final ImpasseTestCasesDbm _instance = new ImpasseTestCasesDbm();

    private ImpasseTestCasesDbm() {
    }

    public static ImpasseTestCasesDbm getInstance() {
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
        setupEpg(_epgMap, new EpgSummary(), "summary");
        setupEpg(_epgMap, new EpgPreconditions(), "preconditions");
        setupEpg(_epgMap, new EpgImportance(), "importance");
        setupEpg(_epgMap, new EpgActive(), "active");
    }

    @Override
    public PropertyGateway findPropertyGateway(final String propertyName) {
        return doFindEpg(_epgMap, propertyName);
    }

    public static class EpgId implements PropertyGateway {
        @Override
        public Object read(final Entity e) {
            return ((ImpasseTestCases) e).getId();
        }

        @Override
        public void write(final Entity e, final Object v) {
            ((ImpasseTestCases) e).setId(cti(v));
        }
    }

    public static class EpgSummary implements PropertyGateway {
        @Override
        public Object read(final Entity e) {
            return ((ImpasseTestCases) e).getSummary();
        }

        @Override
        public void write(final Entity e, final Object v) {
            ((ImpasseTestCases) e).setSummary((String) v);
        }
    }

    public static class EpgPreconditions implements PropertyGateway {
        @Override
        public Object read(final Entity e) {
            return ((ImpasseTestCases) e).getPreconditions();
        }

        @Override
        public void write(final Entity e, final Object v) {
            ((ImpasseTestCases) e).setPreconditions((String) v);
        }
    }

    public static class EpgImportance implements PropertyGateway {
        @Override
        public Object read(final Entity e) {
            return ((ImpasseTestCases) e).getImportance();
        }

        @Override
        public void write(final Entity e, final Object v) {
            ((ImpasseTestCases) e).setImportance(cti(v));
        }
    }

    public static class EpgActive implements PropertyGateway {
        @Override
        public Object read(final Entity e) {
            return ((ImpasseTestCases) e).getActive();
        }

        @Override
        public void write(final Entity e, final Object v) {
            ((ImpasseTestCases) e).setActive((Boolean) v);
        }
    }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "impasse_test_cases";

    protected final String _tablePropertyName = "impasseTestCases";

    protected final TableSqlName _tableSqlName = new TableSqlName(
            "impasse_test_cases", _tableDbName);
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

    protected final ColumnInfo _columnSummary = cci("summary", "summary", null,
            null, false, "summary", String.class, false, false, "TEXT", 65535,
            0, null, false, null, null, null, null, null);

    protected final ColumnInfo _columnPreconditions = cci("preconditions",
            "preconditions", null, null, false, "preconditions", String.class,
            false, false, "TEXT", 65535, 0, null, false, null, null, null,
            null, null);

    protected final ColumnInfo _columnImportance = cci("importance",
            "importance", null, null, false, "importance", Integer.class,
            false, false, "INT", 10, 0, null, false, null, null, null, null,
            null);

    protected final ColumnInfo _columnActive = cci("active", "active", null,
            null, false, "active", Boolean.class, false, false, "BIT", null,
            null, "1", false, null, null, null, null, null);

    public ColumnInfo columnId() {
        return _columnId;
    }

    public ColumnInfo columnSummary() {
        return _columnSummary;
    }

    public ColumnInfo columnPreconditions() {
        return _columnPreconditions;
    }

    public ColumnInfo columnImportance() {
        return _columnImportance;
    }

    public ColumnInfo columnActive() {
        return _columnActive;
    }

    @Override
    protected List<ColumnInfo> ccil() {
        final List<ColumnInfo> ls = newArrayList();
        ls.add(columnId());
        ls.add(columnSummary());
        ls.add(columnPreconditions());
        ls.add(columnImportance());
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
        return "net.marevol.redmine.impasse.db.exentity.ImpasseTestCases";
    }

    @Override
    public String getConditionBeanTypeName() {
        return "net.marevol.redmine.impasse.db.cbean.ImpasseTestCasesCB";
    }

    @Override
    public String getDaoTypeName() {
        return "${glPackageExtendedDao}.ImpasseTestCasesDao";
    }

    @Override
    public String getBehaviorTypeName() {
        return "net.marevol.redmine.impasse.db.exbhv.ImpasseTestCasesBhv";
    }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    @Override
    public Class<ImpasseTestCases> getEntityType() {
        return ImpasseTestCases.class;
    }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    @Override
    public Entity newEntity() {
        return newMyEntity();
    }

    public ImpasseTestCases newMyEntity() {
        return new ImpasseTestCases();
    }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    @Override
    public void acceptPrimaryKeyMap(final Entity e,
            final Map<String, ? extends Object> m) {
        doAcceptPrimaryKeyMap((ImpasseTestCases) e, m);
    }

    @Override
    public void acceptAllColumnMap(final Entity e,
            final Map<String, ? extends Object> m) {
        doAcceptAllColumnMap((ImpasseTestCases) e, m);
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
