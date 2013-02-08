package net.marevol.redmine.impasse.db.bsentity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import net.marevol.redmine.impasse.db.allcommon.DBMetaInstanceHandler;
import net.marevol.redmine.impasse.db.exentity.ImpasseTestSteps;

import org.seasar.dbflute.Entity;
import org.seasar.dbflute.dbmeta.DBMeta;

/**
 * The entity of impasse_test_steps as TABLE. <br />
 * <pre>
 * [primary-key]
 *     id
 * 
 * [column]
 *     id, test_case_id, step_number, actions, expected_results
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
 * Integer testCaseId = entity.getTestCaseId();
 * Integer stepNumber = entity.getStepNumber();
 * String actions = entity.getActions();
 * String expectedResults = entity.getExpectedResults();
 * entity.setId(id);
 * entity.setTestCaseId(testCaseId);
 * entity.setStepNumber(stepNumber);
 * entity.setActions(actions);
 * entity.setExpectedResults(expectedResults);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsImpasseTestSteps implements Entity, Serializable,
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

    /** test_case_id: {IX, NotNull, INT(10)} */
    protected Integer _testCaseId;

    /** step_number: {INT(10)} */
    protected Integer _stepNumber;

    /** actions: {TEXT(65535)} */
    protected String _actions;

    /** expected_results: {TEXT(65535)} */
    protected String _expectedResults;

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
        return "impasse_test_steps";
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getTablePropertyName() { // according to Java Beans rule
        return "impasseTestSteps";
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
        if (other == null || !(other instanceof BsImpasseTestSteps)) {
            return false;
        }
        final BsImpasseTestSteps otherEntity = (BsImpasseTestSteps) other;
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
        sb.append(delimiter).append(getTestCaseId());
        sb.append(delimiter).append(getStepNumber());
        sb.append(delimiter).append(getActions());
        sb.append(delimiter).append(getExpectedResults());
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
    public ImpasseTestSteps clone() {
        try {
            return (ImpasseTestSteps) super.clone();
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
     * [get] test_case_id: {IX, NotNull, INT(10)} <br />
     * @return The value of the column 'test_case_id'. (NullAllowed)
     */
    public Integer getTestCaseId() {
        return _testCaseId;
    }

    /**
     * [set] test_case_id: {IX, NotNull, INT(10)} <br />
     * @param testCaseId The value of the column 'test_case_id'. (NullAllowed)
     */
    public void setTestCaseId(final Integer testCaseId) {
        __modifiedProperties.addPropertyName("testCaseId");
        _testCaseId = testCaseId;
    }

    /**
     * [get] step_number: {INT(10)} <br />
     * @return The value of the column 'step_number'. (NullAllowed)
     */
    public Integer getStepNumber() {
        return _stepNumber;
    }

    /**
     * [set] step_number: {INT(10)} <br />
     * @param stepNumber The value of the column 'step_number'. (NullAllowed)
     */
    public void setStepNumber(final Integer stepNumber) {
        __modifiedProperties.addPropertyName("stepNumber");
        _stepNumber = stepNumber;
    }

    /**
     * [get] actions: {TEXT(65535)} <br />
     * @return The value of the column 'actions'. (NullAllowed)
     */
    public String getActions() {
        return _actions;
    }

    /**
     * [set] actions: {TEXT(65535)} <br />
     * @param actions The value of the column 'actions'. (NullAllowed)
     */
    public void setActions(final String actions) {
        __modifiedProperties.addPropertyName("actions");
        _actions = actions;
    }

    /**
     * [get] expected_results: {TEXT(65535)} <br />
     * @return The value of the column 'expected_results'. (NullAllowed)
     */
    public String getExpectedResults() {
        return _expectedResults;
    }

    /**
     * [set] expected_results: {TEXT(65535)} <br />
     * @param expectedResults The value of the column 'expected_results'. (NullAllowed)
     */
    public void setExpectedResults(final String expectedResults) {
        __modifiedProperties.addPropertyName("expectedResults");
        _expectedResults = expectedResults;
    }
}
