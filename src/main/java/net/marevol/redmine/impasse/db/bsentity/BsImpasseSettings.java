package net.marevol.redmine.impasse.db.bsentity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import net.marevol.redmine.impasse.db.allcommon.DBMetaInstanceHandler;
import net.marevol.redmine.impasse.db.exentity.ImpasseSettings;

import org.seasar.dbflute.Entity;
import org.seasar.dbflute.dbmeta.DBMeta;

/**
 * The entity of impasse_settings as TABLE. <br />
 * <pre>
 * [primary-key]
 *     id
 * 
 * [column]
 *     id, project_id, bug_tracker_id, requirement_tracker
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
 * Integer projectId = entity.getProjectId();
 * Integer bugTrackerId = entity.getBugTrackerId();
 * String requirementTracker = entity.getRequirementTracker();
 * entity.setId(id);
 * entity.setProjectId(projectId);
 * entity.setBugTrackerId(bugTrackerId);
 * entity.setRequirementTracker(requirementTracker);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsImpasseSettings implements Entity, Serializable,
        Cloneable {

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

    /** project_id: {IX, NotNull, INT(10)} */
    protected Integer _projectId;

    /** bug_tracker_id: {INT(10)} */
    protected Integer _bugTrackerId;

    /** requirement_tracker: {VARCHAR(255)} */
    protected String _requirementTracker;

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
        return "impasse_settings";
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getTablePropertyName() { // according to Java Beans rule
        return "impasseSettings";
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
        if (other == null || !(other instanceof BsImpasseSettings)) {
            return false;
        }
        final BsImpasseSettings otherEntity = (BsImpasseSettings) other;
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
        sb.append(delimiter).append(getProjectId());
        sb.append(delimiter).append(getBugTrackerId());
        sb.append(delimiter).append(getRequirementTracker());
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
    public ImpasseSettings clone() {
        try {
            return (ImpasseSettings) super.clone();
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
     * [get] project_id: {IX, NotNull, INT(10)} <br />
     * @return The value of the column 'project_id'. (NullAllowed)
     */
    public Integer getProjectId() {
        return _projectId;
    }

    /**
     * [set] project_id: {IX, NotNull, INT(10)} <br />
     * @param projectId The value of the column 'project_id'. (NullAllowed)
     */
    public void setProjectId(final Integer projectId) {
        __modifiedProperties.addPropertyName("projectId");
        _projectId = projectId;
    }

    /**
     * [get] bug_tracker_id: {INT(10)} <br />
     * @return The value of the column 'bug_tracker_id'. (NullAllowed)
     */
    public Integer getBugTrackerId() {
        return _bugTrackerId;
    }

    /**
     * [set] bug_tracker_id: {INT(10)} <br />
     * @param bugTrackerId The value of the column 'bug_tracker_id'. (NullAllowed)
     */
    public void setBugTrackerId(final Integer bugTrackerId) {
        __modifiedProperties.addPropertyName("bugTrackerId");
        _bugTrackerId = bugTrackerId;
    }

    /**
     * [get] requirement_tracker: {VARCHAR(255)} <br />
     * @return The value of the column 'requirement_tracker'. (NullAllowed)
     */
    public String getRequirementTracker() {
        return _requirementTracker;
    }

    /**
     * [set] requirement_tracker: {VARCHAR(255)} <br />
     * @param requirementTracker The value of the column 'requirement_tracker'. (NullAllowed)
     */
    public void setRequirementTracker(final String requirementTracker) {
        __modifiedProperties.addPropertyName("requirementTracker");
        _requirementTracker = requirementTracker;
    }
}
