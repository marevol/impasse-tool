package net.marevol.redmine.impasse.db.bsentity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import net.marevol.redmine.impasse.db.allcommon.DBMetaInstanceHandler;
import net.marevol.redmine.impasse.db.exentity.ImpasseNodes;

import org.seasar.dbflute.Entity;
import org.seasar.dbflute.dbmeta.DBMeta;

/**
 * The entity of impasse_nodes as TABLE. <br />
 * <pre>
 * [primary-key]
 *     id
 * 
 * [column]
 *     id, name, node_type_id, parent_id, node_order, path
 * 
 * [sequence]
 *     
 * 
 * [identity]
 *     id
 * 
 * [version-no]
 *     
 * 
 * [foreign table]
 *     
 * 
 * [referrer table]
 *     
 * 
 * [foreign property]
 *     
 * 
 * [referrer property]
 *     
 * 
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Integer id = entity.getId();
 * String name = entity.getName();
 * Integer nodeTypeId = entity.getNodeTypeId();
 * Integer parentId = entity.getParentId();
 * Integer nodeOrder = entity.getNodeOrder();
 * String path = entity.getPath();
 * entity.setId(id);
 * entity.setName(name);
 * entity.setNodeTypeId(nodeTypeId);
 * entity.setParentId(parentId);
 * entity.setNodeOrder(nodeOrder);
 * entity.setPath(path);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsImpasseNodes implements Entity, Serializable, Cloneable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** Serial version UID. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    // -----------------------------------------------------
    //                                                Column
    //                                                ------
    /** id: {PK, ID, NotNull, INT(10)} */
    protected Integer _id;

    /** name: {VARCHAR(255)} */
    protected String _name;

    /** node_type_id: {NotNull, INT(10)} */
    protected Integer _nodeTypeId;

    /** parent_id: {IX, INT(10)} */
    protected Integer _parentId;

    /** node_order: {INT(10)} */
    protected Integer _nodeOrder;

    /** path: {IX, NotNull, VARCHAR(255)} */
    protected String _path;

    // -----------------------------------------------------
    //                                              Internal
    //                                              --------
    /** The modified properties for this entity. (NotNull) */
    protected final EntityModifiedProperties __modifiedProperties = newModifiedProperties();

    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    /**
     * {@inheritDoc}
     */
    @Override
    public String getTableDbName() {
        return "impasse_nodes";
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getTablePropertyName() { // according to Java Beans rule
        return "impasseNodes";
    }

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /**
     * {@inheritDoc}
     */
    @Override
    public DBMeta getDBMeta() {
        return DBMetaInstanceHandler.findDBMeta(getTableDbName());
    }

    // ===================================================================================
    //                                                                         Primary Key
    //                                                                         ===========
    /**
     * {@inheritDoc}
     */
    @Override
    public boolean hasPrimaryKeyValue() {
        if (getId() == null) {
            return false;
        }
        return true;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    protected <ELEMENT> List<ELEMENT> newReferrerList() {
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                 Modified Properties
    //                                                                 ===================
    /**
     * {@inheritDoc}
     */
    @Override
    public Set<String> modifiedProperties() {
        return __modifiedProperties.getPropertyNames();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void clearModifiedInfo() {
        __modifiedProperties.clear();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean hasModification() {
        return !__modifiedProperties.isEmpty();
    }

    protected EntityModifiedProperties newModifiedProperties() {
        return new EntityModifiedProperties();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    /**
     * Determine the object is equal with this. <br />
     * If primary-keys or columns of the other are same as this one, returns true.
     * @param other The other entity. (NullAllowed)
     * @return Comparing result.
     */
    @Override
    public boolean equals(final Object other) {
        if (other == null || !(other instanceof BsImpasseNodes)) {
            return false;
        }
        final BsImpasseNodes otherEntity = (BsImpasseNodes) other;
        if (!xSV(getId(), otherEntity.getId())) {
            return false;
        }
        return true;
    }

    protected boolean xSV(final Object value1, final Object value2) { // isSameValue()
        return InternalUtil.isSameValue(value1, value2);
    }

    /**
     * Calculate the hash-code from primary-keys or columns.
     * @return The hash-code from primary-key or columns.
     */
    @Override
    public int hashCode() {
        int result = 17;
        result = xCH(result, getTableDbName());
        result = xCH(result, getId());
        return result;
    }

    protected int xCH(final int result, final Object value) { // calculateHashcode()
        return InternalUtil.calculateHashcode(result, value);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int instanceHash() {
        return super.hashCode();
    }

    /**
     * Convert to display string of entity's data. (no relation data)
     * @return The display string of all columns and relation existences. (NotNull)
     */
    @Override
    public String toString() {
        return buildDisplayString(InternalUtil.toClassTitle(this), true, true);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String toStringWithRelation() {
        final StringBuilder sb = new StringBuilder();
        sb.append(toString());
        return sb.toString();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String buildDisplayString(final String name, final boolean column,
            final boolean relation) {
        final StringBuilder sb = new StringBuilder();
        if (name != null) {
            sb.append(name).append(column || relation ? ":" : "");
        }
        if (column) {
            sb.append(buildColumnString());
        }
        if (relation) {
            sb.append(buildRelationString());
        }
        sb.append("@").append(Integer.toHexString(hashCode()));
        return sb.toString();
    }

    protected String buildColumnString() {
        final StringBuilder sb = new StringBuilder();
        final String delimiter = ", ";
        sb.append(delimiter).append(getId());
        sb.append(delimiter).append(getName());
        sb.append(delimiter).append(getNodeTypeId());
        sb.append(delimiter).append(getParentId());
        sb.append(delimiter).append(getNodeOrder());
        sb.append(delimiter).append(getPath());
        if (sb.length() > delimiter.length()) {
            sb.delete(0, delimiter.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    protected String buildRelationString() {
        return "";
    }

    /**
     * Clone entity instance using super.clone(). (shallow copy) 
     * @return The cloned instance of this entity. (NotNull)
     */
    @Override
    public ImpasseNodes clone() {
        try {
            return (ImpasseNodes) super.clone();
        } catch (final CloneNotSupportedException e) {
            throw new IllegalStateException("Failed to clone the entity: "
                    + toString(), e);
        }
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] id: {PK, ID, NotNull, INT(10)} <br />
     * @return The value of the column 'id'. (NullAllowed)
     */
    public Integer getId() {
        return _id;
    }

    /**
     * [set] id: {PK, ID, NotNull, INT(10)} <br />
     * @param id The value of the column 'id'. (NullAllowed)
     */
    public void setId(final Integer id) {
        __modifiedProperties.addPropertyName("id");
        _id = id;
    }

    /**
     * [get] name: {VARCHAR(255)} <br />
     * @return The value of the column 'name'. (NullAllowed)
     */
    public String getName() {
        return _name;
    }

    /**
     * [set] name: {VARCHAR(255)} <br />
     * @param name The value of the column 'name'. (NullAllowed)
     */
    public void setName(final String name) {
        __modifiedProperties.addPropertyName("name");
        _name = name;
    }

    /**
     * [get] node_type_id: {NotNull, INT(10)} <br />
     * @return The value of the column 'node_type_id'. (NullAllowed)
     */
    public Integer getNodeTypeId() {
        return _nodeTypeId;
    }

    /**
     * [set] node_type_id: {NotNull, INT(10)} <br />
     * @param nodeTypeId The value of the column 'node_type_id'. (NullAllowed)
     */
    public void setNodeTypeId(final Integer nodeTypeId) {
        __modifiedProperties.addPropertyName("nodeTypeId");
        _nodeTypeId = nodeTypeId;
    }

    /**
     * [get] parent_id: {IX, INT(10)} <br />
     * @return The value of the column 'parent_id'. (NullAllowed)
     */
    public Integer getParentId() {
        return _parentId;
    }

    /**
     * [set] parent_id: {IX, INT(10)} <br />
     * @param parentId The value of the column 'parent_id'. (NullAllowed)
     */
    public void setParentId(final Integer parentId) {
        __modifiedProperties.addPropertyName("parentId");
        _parentId = parentId;
    }

    /**
     * [get] node_order: {INT(10)} <br />
     * @return The value of the column 'node_order'. (NullAllowed)
     */
    public Integer getNodeOrder() {
        return _nodeOrder;
    }

    /**
     * [set] node_order: {INT(10)} <br />
     * @param nodeOrder The value of the column 'node_order'. (NullAllowed)
     */
    public void setNodeOrder(final Integer nodeOrder) {
        __modifiedProperties.addPropertyName("nodeOrder");
        _nodeOrder = nodeOrder;
    }

    /**
     * [get] path: {IX, NotNull, VARCHAR(255)} <br />
     * @return The value of the column 'path'. (NullAllowed)
     */
    public String getPath() {
        return _path;
    }

    /**
     * [set] path: {IX, NotNull, VARCHAR(255)} <br />
     * @param path The value of the column 'path'. (NullAllowed)
     */
    public void setPath(final String path) {
        __modifiedProperties.addPropertyName("path");
        _path = path;
    }
}
