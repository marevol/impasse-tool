package net.marevol.redmine.impasse.db.bsentity.dbmeta;

import java.util.List;
import java.util.Map;

import net.marevol.redmine.impasse.db.allcommon.DBCurrent;
import net.marevol.redmine.impasse.db.allcommon.DBFluteConfig;
import net.marevol.redmine.impasse.db.exentity.ImpasseNodes;

import org.seasar.dbflute.DBDef;
import org.seasar.dbflute.Entity;
import org.seasar.dbflute.dbmeta.AbstractDBMeta;
import org.seasar.dbflute.dbmeta.PropertyGateway;
import org.seasar.dbflute.dbmeta.info.ColumnInfo;
import org.seasar.dbflute.dbmeta.info.UniqueInfo;
import org.seasar.dbflute.dbmeta.name.TableSqlName;

/**
 * The DB meta of impasse_nodes. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class ImpasseNodesDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final ImpasseNodesDbm _instance = new ImpasseNodesDbm();

    private ImpasseNodesDbm() {
    }

    public static ImpasseNodesDbm getInstance() {
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
        setupEpg(_epgMap, new EpgName(), "name");
        setupEpg(_epgMap, new EpgNodeTypeId(), "nodeTypeId");
        setupEpg(_epgMap, new EpgParentId(), "parentId");
        setupEpg(_epgMap, new EpgNodeOrder(), "nodeOrder");
        setupEpg(_epgMap, new EpgPath(), "path");
    }

    @Override
    public PropertyGateway findPropertyGateway(final String propertyName) {
        return doFindEpg(_epgMap, propertyName);
    }

    public static class EpgId implements PropertyGateway {
        @Override
        public Object read(final Entity e) {
            return ((ImpasseNodes) e).getId();
        }

        @Override
        public void write(final Entity e, final Object v) {
            ((ImpasseNodes) e).setId(cti(v));
        }
    }

    public static class EpgName implements PropertyGateway {
        @Override
        public Object read(final Entity e) {
            return ((ImpasseNodes) e).getName();
        }

        @Override
        public void write(final Entity e, final Object v) {
            ((ImpasseNodes) e).setName((String) v);
        }
    }

    public static class EpgNodeTypeId implements PropertyGateway {
        @Override
        public Object read(final Entity e) {
            return ((ImpasseNodes) e).getNodeTypeId();
        }

        @Override
        public void write(final Entity e, final Object v) {
            ((ImpasseNodes) e).setNodeTypeId(cti(v));
        }
    }

    public static class EpgParentId implements PropertyGateway {
        @Override
        public Object read(final Entity e) {
            return ((ImpasseNodes) e).getParentId();
        }

        @Override
        public void write(final Entity e, final Object v) {
            ((ImpasseNodes) e).setParentId(cti(v));
        }
    }

    public static class EpgNodeOrder implements PropertyGateway {
        @Override
        public Object read(final Entity e) {
            return ((ImpasseNodes) e).getNodeOrder();
        }

        @Override
        public void write(final Entity e, final Object v) {
            ((ImpasseNodes) e).setNodeOrder(cti(v));
        }
    }

    public static class EpgPath implements PropertyGateway {
        @Override
        public Object read(final Entity e) {
            return ((ImpasseNodes) e).getPath();
        }

        @Override
        public void write(final Entity e, final Object v) {
            ((ImpasseNodes) e).setPath((String) v);
        }
    }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "impasse_nodes";

    protected final String _tablePropertyName = "impasseNodes";

    protected final TableSqlName _tableSqlName = new TableSqlName(
            "impasse_nodes", _tableDbName);
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

    protected final ColumnInfo _columnName = cci("name", "name", null, null,
            false, "name", String.class, false, false, "VARCHAR", 255, 0, null,
            false, null, null, null, null, null);

    protected final ColumnInfo _columnNodeTypeId = cci("node_type_id",
            "node_type_id", null, null, true, "nodeTypeId", Integer.class,
            false, false, "INT", 10, 0, null, false, null, null, null, null,
            null);

    protected final ColumnInfo _columnParentId = cci("parent_id", "parent_id",
            null, null, false, "parentId", Integer.class, false, false, "INT",
            10, 0, null, false, null, null, null, null, null);

    protected final ColumnInfo _columnNodeOrder = cci("node_order",
            "node_order", null, null, false, "nodeOrder", Integer.class, false,
            false, "INT", 10, 0, null, false, null, null, null, null, null);

    protected final ColumnInfo _columnPath = cci("path", "path", null, null,
            true, "path", String.class, false, false, "VARCHAR", 255, 0, null,
            false, null, null, null, null, null);

    public ColumnInfo columnId() {
        return _columnId;
    }

    public ColumnInfo columnName() {
        return _columnName;
    }

    public ColumnInfo columnNodeTypeId() {
        return _columnNodeTypeId;
    }

    public ColumnInfo columnParentId() {
        return _columnParentId;
    }

    public ColumnInfo columnNodeOrder() {
        return _columnNodeOrder;
    }

    public ColumnInfo columnPath() {
        return _columnPath;
    }

    @Override
    protected List<ColumnInfo> ccil() {
        final List<ColumnInfo> ls = newArrayList();
        ls.add(columnId());
        ls.add(columnName());
        ls.add(columnNodeTypeId());
        ls.add(columnParentId());
        ls.add(columnNodeOrder());
        ls.add(columnPath());
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
        return "net.marevol.redmine.impasse.db.exentity.ImpasseNodes";
    }

    @Override
    public String getConditionBeanTypeName() {
        return "net.marevol.redmine.impasse.db.cbean.ImpasseNodesCB";
    }

    @Override
    public String getDaoTypeName() {
        return "${glPackageExtendedDao}.ImpasseNodesDao";
    }

    @Override
    public String getBehaviorTypeName() {
        return "net.marevol.redmine.impasse.db.exbhv.ImpasseNodesBhv";
    }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    @Override
    public Class<ImpasseNodes> getEntityType() {
        return ImpasseNodes.class;
    }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    @Override
    public Entity newEntity() {
        return newMyEntity();
    }

    public ImpasseNodes newMyEntity() {
        return new ImpasseNodes();
    }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    @Override
    public void acceptPrimaryKeyMap(final Entity e,
            final Map<String, ? extends Object> m) {
        doAcceptPrimaryKeyMap((ImpasseNodes) e, m);
    }

    @Override
    public void acceptAllColumnMap(final Entity e,
            final Map<String, ? extends Object> m) {
        doAcceptAllColumnMap((ImpasseNodes) e, m);
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
