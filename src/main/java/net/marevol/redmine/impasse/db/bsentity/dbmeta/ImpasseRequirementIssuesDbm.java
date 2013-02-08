package net.marevol.redmine.impasse.db.bsentity.dbmeta;

import java.util.List;
import java.util.Map;

import net.marevol.redmine.impasse.db.allcommon.DBCurrent;
import net.marevol.redmine.impasse.db.allcommon.DBFluteConfig;
import net.marevol.redmine.impasse.db.exentity.ImpasseRequirementIssues;

import org.seasar.dbflute.DBDef;
import org.seasar.dbflute.Entity;
import org.seasar.dbflute.dbmeta.AbstractDBMeta;
import org.seasar.dbflute.dbmeta.PropertyGateway;
import org.seasar.dbflute.dbmeta.info.ColumnInfo;
import org.seasar.dbflute.dbmeta.info.UniqueInfo;
import org.seasar.dbflute.dbmeta.name.TableSqlName;

/**
 * The DB meta of impasse_requirement_issues. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class ImpasseRequirementIssuesDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final ImpasseRequirementIssuesDbm _instance = new ImpasseRequirementIssuesDbm();

    private ImpasseRequirementIssuesDbm() {
    }

    public static ImpasseRequirementIssuesDbm getInstance() {
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
        setupEpg(_epgMap, new EpgIssueId(), "issueId");
        setupEpg(_epgMap, new EpgNumOfCases(), "numOfCases");
    }

    @Override
    public PropertyGateway findPropertyGateway(final String propertyName) {
        return doFindEpg(_epgMap, propertyName);
    }

    public static class EpgId implements PropertyGateway {
        @Override
        public Object read(final Entity e) {
            return ((ImpasseRequirementIssues) e).getId();
        }

        @Override
        public void write(final Entity e, final Object v) {
            ((ImpasseRequirementIssues) e).setId(cti(v));
        }
    }

    public static class EpgIssueId implements PropertyGateway {
        @Override
        public Object read(final Entity e) {
            return ((ImpasseRequirementIssues) e).getIssueId();
        }

        @Override
        public void write(final Entity e, final Object v) {
            ((ImpasseRequirementIssues) e).setIssueId(cti(v));
        }
    }

    public static class EpgNumOfCases implements PropertyGateway {
        @Override
        public Object read(final Entity e) {
            return ((ImpasseRequirementIssues) e).getNumOfCases();
        }

        @Override
        public void write(final Entity e, final Object v) {
            ((ImpasseRequirementIssues) e).setNumOfCases(cti(v));
        }
    }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "impasse_requirement_issues";

    protected final String _tablePropertyName = "impasseRequirementIssues";

    protected final TableSqlName _tableSqlName = new TableSqlName(
            "impasse_requirement_issues", _tableDbName);
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

    protected final ColumnInfo _columnIssueId = cci("issue_id", "issue_id",
            null, null, true, "issueId", Integer.class, false, false, "INT",
            10, 0, null, false, null, null, null, null, null);

    protected final ColumnInfo _columnNumOfCases = cci("num_of_cases",
            "num_of_cases", null, null, false, "numOfCases", Integer.class,
            false, false, "INT", 10, 0, "0", false, null, null, null, null,
            null);

    public ColumnInfo columnId() {
        return _columnId;
    }

    public ColumnInfo columnIssueId() {
        return _columnIssueId;
    }

    public ColumnInfo columnNumOfCases() {
        return _columnNumOfCases;
    }

    @Override
    protected List<ColumnInfo> ccil() {
        final List<ColumnInfo> ls = newArrayList();
        ls.add(columnId());
        ls.add(columnIssueId());
        ls.add(columnNumOfCases());
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
        return "net.marevol.redmine.impasse.db.exentity.ImpasseRequirementIssues";
    }

    @Override
    public String getConditionBeanTypeName() {
        return "net.marevol.redmine.impasse.db.cbean.ImpasseRequirementIssuesCB";
    }

    @Override
    public String getDaoTypeName() {
        return "${glPackageExtendedDao}.ImpasseRequirementIssuesDao";
    }

    @Override
    public String getBehaviorTypeName() {
        return "net.marevol.redmine.impasse.db.exbhv.ImpasseRequirementIssuesBhv";
    }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    @Override
    public Class<ImpasseRequirementIssues> getEntityType() {
        return ImpasseRequirementIssues.class;
    }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    @Override
    public Entity newEntity() {
        return newMyEntity();
    }

    public ImpasseRequirementIssues newMyEntity() {
        return new ImpasseRequirementIssues();
    }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    @Override
    public void acceptPrimaryKeyMap(final Entity e,
            final Map<String, ? extends Object> m) {
        doAcceptPrimaryKeyMap((ImpasseRequirementIssues) e, m);
    }

    @Override
    public void acceptAllColumnMap(final Entity e,
            final Map<String, ? extends Object> m) {
        doAcceptAllColumnMap((ImpasseRequirementIssues) e, m);
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
