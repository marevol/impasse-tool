package net.marevol.redmine.impasse.db.bsentity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;

import net.marevol.redmine.impasse.db.allcommon.DBMetaInstanceHandler;
import net.marevol.redmine.impasse.db.exentity.ImpasseExecutions;

import org.seasar.dbflute.Entity;
import org.seasar.dbflute.dbmeta.DBMeta;

/**
 * The entity of impasse_executions as TABLE. <br />
 * <pre>
 * [primary-key]
 *     id
 * 
 * [column]
 *     id, test_plan_case_id, tester_id, build_id, expected_date, status, execution_ts, notes, executor_id
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
 * Integer testPlanCaseId = entity.getTestPlanCaseId();
 * Integer testerId = entity.getTesterId();
 * Integer buildId = entity.getBuildId();
 * java.util.Date expectedDate = entity.getExpectedDate();
 * String status = entity.getStatus();
 * java.sql.Timestamp executionTs = entity.getExecutionTs();
 * String notes = entity.getNotes();
 * Integer executorId = entity.getExecutorId();
 * entity.setId(id);
 * entity.setTestPlanCaseId(testPlanCaseId);
 * entity.setTesterId(testerId);
 * entity.setBuildId(buildId);
 * entity.setExpectedDate(expectedDate);
 * entity.setStatus(status);
 * entity.setExecutionTs(executionTs);
 * entity.setNotes(notes);
 * entity.setExecutorId(executorId);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsImpasseExecutions implements Entity, Serializable,
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

    /** test_plan_case_id: {IX, NotNull, INT(10)} */
    protected Integer _testPlanCaseId;

    /** tester_id: {IX, INT(10)} */
    protected Integer _testerId;

    /** build_id: {INT(10)} */
    protected Integer _buildId;

    /** expected_date: {DATE(10)} */
    protected java.util.Date _expectedDate;

    /** status: {VARCHAR(255), default=[0]} */
    protected String _status;

    /** execution_ts: {IX, DATETIME(19)} */
    protected java.sql.Timestamp _executionTs;

    /** notes: {TEXT(65535)} */
    protected String _notes;

    /** executor_id: {INT(10)} */
    protected Integer _executorId;

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
        return "impasse_executions";
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getTablePropertyName() { // according to Java Beans rule
        return "impasseExecutions";
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
        if (other == null || !(other instanceof BsImpasseExecutions)) {
            return false;
        }
        final BsImpasseExecutions otherEntity = (BsImpasseExecutions) other;
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
        sb.append(delimiter).append(getTestPlanCaseId());
        sb.append(delimiter).append(getTesterId());
        sb.append(delimiter).append(getBuildId());
        sb.append(delimiter).append(xfUD(getExpectedDate()));
        sb.append(delimiter).append(getStatus());
        sb.append(delimiter).append(getExecutionTs());
        sb.append(delimiter).append(getNotes());
        sb.append(delimiter).append(getExecutorId());
        if (sb.length() > delimiter.length()) {
            sb.delete(0, delimiter.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    protected String xfUD(final Date date) { // formatUtilDate()
        return InternalUtil.toString(date, xgDP());
    }

    protected String xgDP() { // getDatePattern
        return "yyyy-MM-dd";
    }

    protected String buildRelationString() {
        return "";
    }

    /**
     * Clone entity instance using super.clone(). (shallow copy) 
     * @return The cloned instance of this entity. (NotNull)
     */
    @Override
    public ImpasseExecutions clone() {
        try {
            return (ImpasseExecutions) super.clone();
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
     * [get] test_plan_case_id: {IX, NotNull, INT(10)} <br />
     * @return The value of the column 'test_plan_case_id'. (NullAllowed)
     */
    public Integer getTestPlanCaseId() {
        return _testPlanCaseId;
    }

    /**
     * [set] test_plan_case_id: {IX, NotNull, INT(10)} <br />
     * @param testPlanCaseId The value of the column 'test_plan_case_id'. (NullAllowed)
     */
    public void setTestPlanCaseId(final Integer testPlanCaseId) {
        __modifiedProperties.addPropertyName("testPlanCaseId");
        _testPlanCaseId = testPlanCaseId;
    }

    /**
     * [get] tester_id: {IX, INT(10)} <br />
     * @return The value of the column 'tester_id'. (NullAllowed)
     */
    public Integer getTesterId() {
        return _testerId;
    }

    /**
     * [set] tester_id: {IX, INT(10)} <br />
     * @param testerId The value of the column 'tester_id'. (NullAllowed)
     */
    public void setTesterId(final Integer testerId) {
        __modifiedProperties.addPropertyName("testerId");
        _testerId = testerId;
    }

    /**
     * [get] build_id: {INT(10)} <br />
     * @return The value of the column 'build_id'. (NullAllowed)
     */
    public Integer getBuildId() {
        return _buildId;
    }

    /**
     * [set] build_id: {INT(10)} <br />
     * @param buildId The value of the column 'build_id'. (NullAllowed)
     */
    public void setBuildId(final Integer buildId) {
        __modifiedProperties.addPropertyName("buildId");
        _buildId = buildId;
    }

    /**
     * [get] expected_date: {DATE(10)} <br />
     * @return The value of the column 'expected_date'. (NullAllowed)
     */
    public java.util.Date getExpectedDate() {
        return _expectedDate;
    }

    /**
     * [set] expected_date: {DATE(10)} <br />
     * @param expectedDate The value of the column 'expected_date'. (NullAllowed)
     */
    public void setExpectedDate(final java.util.Date expectedDate) {
        __modifiedProperties.addPropertyName("expectedDate");
        _expectedDate = expectedDate;
    }

    /**
     * [get] status: {VARCHAR(255), default=[0]} <br />
     * @return The value of the column 'status'. (NullAllowed)
     */
    public String getStatus() {
        return _status;
    }

    /**
     * [set] status: {VARCHAR(255), default=[0]} <br />
     * @param status The value of the column 'status'. (NullAllowed)
     */
    public void setStatus(final String status) {
        __modifiedProperties.addPropertyName("status");
        _status = status;
    }

    /**
     * [get] execution_ts: {IX, DATETIME(19)} <br />
     * @return The value of the column 'execution_ts'. (NullAllowed)
     */
    public java.sql.Timestamp getExecutionTs() {
        return _executionTs;
    }

    /**
     * [set] execution_ts: {IX, DATETIME(19)} <br />
     * @param executionTs The value of the column 'execution_ts'. (NullAllowed)
     */
    public void setExecutionTs(final java.sql.Timestamp executionTs) {
        __modifiedProperties.addPropertyName("executionTs");
        _executionTs = executionTs;
    }

    /**
     * [get] notes: {TEXT(65535)} <br />
     * @return The value of the column 'notes'. (NullAllowed)
     */
    public String getNotes() {
        return _notes;
    }

    /**
     * [set] notes: {TEXT(65535)} <br />
     * @param notes The value of the column 'notes'. (NullAllowed)
     */
    public void setNotes(final String notes) {
        __modifiedProperties.addPropertyName("notes");
        _notes = notes;
    }

    /**
     * [get] executor_id: {INT(10)} <br />
     * @return The value of the column 'executor_id'. (NullAllowed)
     */
    public Integer getExecutorId() {
        return _executorId;
    }

    /**
     * [set] executor_id: {INT(10)} <br />
     * @param executorId The value of the column 'executor_id'. (NullAllowed)
     */
    public void setExecutorId(final Integer executorId) {
        __modifiedProperties.addPropertyName("executorId");
        _executorId = executorId;
    }
}
