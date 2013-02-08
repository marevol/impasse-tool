package net.marevol.redmine.impasse.db.bsbhv;

import java.util.List;

import net.marevol.redmine.impasse.db.bsentity.dbmeta.ImpasseSettingsDbm;
import net.marevol.redmine.impasse.db.cbean.ImpasseSettingsCB;
import net.marevol.redmine.impasse.db.exbhv.ImpasseSettingsBhv;
import net.marevol.redmine.impasse.db.exentity.ImpasseSettings;

import org.seasar.dbflute.Entity;
import org.seasar.dbflute.bhv.AbstractBehaviorWritable;
import org.seasar.dbflute.bhv.DeleteOption;
import org.seasar.dbflute.bhv.InsertOption;
import org.seasar.dbflute.bhv.QueryInsertSetupper;
import org.seasar.dbflute.bhv.UpdateOption;
import org.seasar.dbflute.cbean.ConditionBean;
import org.seasar.dbflute.cbean.EntityRowHandler;
import org.seasar.dbflute.cbean.ListResultBean;
import org.seasar.dbflute.cbean.PagingResultBean;
import org.seasar.dbflute.cbean.SpecifyQuery;
import org.seasar.dbflute.dbmeta.DBMeta;
import org.seasar.dbflute.outsidesql.executor.OutsideSqlBasicExecutor;

/**
 * The behavior of impasse_settings as TABLE. <br />
 * <pre>
 * [primary key]
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
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsImpasseSettingsBhv extends AbstractBehaviorWritable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                          Table name
    //                                                                          ==========
    /** @return The name on database of table. (NotNull) */
    @Override
    public String getTableDbName() {
        return "impasse_settings";
    }

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** @return The instance of DBMeta. (NotNull) */
    @Override
    public DBMeta getDBMeta() {
        return ImpasseSettingsDbm.getInstance();
    }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public ImpasseSettingsDbm getMyDBMeta() {
        return ImpasseSettingsDbm.getInstance();
    }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    @Override
    public Entity newEntity() {
        return newMyEntity();
    }

    /** {@inheritDoc} */
    @Override
    public ConditionBean newConditionBean() {
        return newMyConditionBean();
    }

    /** @return The instance of new entity as my table type. (NotNull) */
    public ImpasseSettings newMyEntity() {
        return new ImpasseSettings();
    }

    /** @return The instance of new condition-bean as my table type. (NotNull) */
    public ImpasseSettingsCB newMyConditionBean() {
        return new ImpasseSettingsCB();
    }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br />
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * ImpasseSettingsCB cb = new ImpasseSettingsCB();
     * cb.query().setFoo...(value);
     * int count = impasseSettingsBhv.<span style="color: #FD4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of ImpasseSettings. (NotNull)
     * @return The selected count.
     */
    public int selectCount(final ImpasseSettingsCB cb) {
        return doSelectCountUniquely(cb);
    }

    protected int doSelectCountUniquely(final ImpasseSettingsCB cb) { // called by selectCount(cb) 
        assertCBStateValid(cb);
        return delegateSelectCountUniquely(cb);
    }

    protected int doSelectCountPlainly(final ImpasseSettingsCB cb) { // called by selectPage(cb)
        assertCBStateValid(cb);
        return delegateSelectCountPlainly(cb);
    }

    @Override
    protected int doReadCount(final ConditionBean cb) {
        return selectCount(downcast(cb));
    }

    // ===================================================================================
    //                                                                       Cursor Select
    //                                                                       =============
    /**
     * Select the cursor by the condition-bean.
     * <pre>
     * ImpasseSettingsCB cb = new ImpasseSettingsCB();
     * cb.query().setFoo...(value);
     * impasseSettingsBhv.<span style="color: #FD4747">selectCursor</span>(cb, new EntityRowHandler&lt;ImpasseSettings&gt;() {
     *     public void handle(ImpasseSettings entity) {
     *         ... = entity.getFoo...();
     *     }
     * });
     * </pre>
     * @param cb The condition-bean of ImpasseSettings. (NotNull)
     * @param entityRowHandler The handler of entity row of ImpasseSettings. (NotNull)
     */
    public void selectCursor(final ImpasseSettingsCB cb,
            final EntityRowHandler<ImpasseSettings> entityRowHandler) {
        doSelectCursor(cb, entityRowHandler, ImpasseSettings.class);
    }

    protected <ENTITY extends ImpasseSettings> void doSelectCursor(
            final ImpasseSettingsCB cb,
            final EntityRowHandler<ENTITY> entityRowHandler,
            final Class<ENTITY> entityType) {
        assertCBStateValid(cb);
        assertObjectNotNull("entityRowHandler<ImpasseSettings>",
                entityRowHandler);
        assertObjectNotNull("entityType", entityType);
        assertSpecifyDerivedReferrerEntityProperty(cb, entityType);
        delegateSelectCursor(cb, entityRowHandler, entityType);
    }

    // ===================================================================================
    //                                                                       Entity Select
    //                                                                       =============
    /**
     * Select the entity by the condition-bean.
     * <pre>
     * ImpasseSettingsCB cb = new ImpasseSettingsCB();
     * cb.query().setFoo...(value);
     * ImpasseSettings impasseSettings = impasseSettingsBhv.<span style="color: #FD4747">selectEntity</span>(cb);
     * if (impasseSettings != null) {
     *     ... = impasseSettings.get...();
     * } else {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of ImpasseSettings. (NotNull)
     * @return The selected entity. (NullAllowed: If the condition has no data, it returns null)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public ImpasseSettings selectEntity(final ImpasseSettingsCB cb) {
        return doSelectEntity(cb, ImpasseSettings.class);
    }

    protected <ENTITY extends ImpasseSettings> ENTITY doSelectEntity(
            final ImpasseSettingsCB cb, final Class<ENTITY> entityType) {
        assertCBStateValid(cb);
        return helpSelectEntityInternally(cb,
                new InternalSelectEntityCallback<ENTITY, ImpasseSettingsCB>() {
                    @Override
                    public List<ENTITY> callbackSelectList(
                            final ImpasseSettingsCB cb) {
                        return doSelectList(cb, entityType);
                    }
                });
    }

    @Override
    protected Entity doReadEntity(final ConditionBean cb) {
        return selectEntity(downcast(cb));
    }

    /**
     * Select the entity by the condition-bean with deleted check.
     * <pre>
     * ImpasseSettingsCB cb = new ImpasseSettingsCB();
     * cb.query().setFoo...(value);
     * ImpasseSettings impasseSettings = impasseSettingsBhv.<span style="color: #FD4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = impasseSettings.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of ImpasseSettings. (NotNull)
     * @return The selected entity. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public ImpasseSettings selectEntityWithDeletedCheck(
            final ImpasseSettingsCB cb) {
        return doSelectEntityWithDeletedCheck(cb, ImpasseSettings.class);
    }

    protected <ENTITY extends ImpasseSettings> ENTITY doSelectEntityWithDeletedCheck(
            final ImpasseSettingsCB cb, final Class<ENTITY> entityType) {
        assertCBStateValid(cb);
        return helpSelectEntityWithDeletedCheckInternally(
                cb,
                new InternalSelectEntityWithDeletedCheckCallback<ENTITY, ImpasseSettingsCB>() {
                    @Override
                    public List<ENTITY> callbackSelectList(
                            final ImpasseSettingsCB cb) {
                        return doSelectList(cb, entityType);
                    }
                });
    }

    @Override
    protected Entity doReadEntityWithDeletedCheck(final ConditionBean cb) {
        return selectEntityWithDeletedCheck(downcast(cb));
    }

    /**
     * Select the entity by the primary-key value.
     * @param id The one of primary key. (NotNull)
     * @return The selected entity. (NullAllowed: If the primary-key value has no data, it returns null)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public ImpasseSettings selectByPKValue(final Integer id) {
        return doSelectByPKValue(id, ImpasseSettings.class);
    }

    protected <ENTITY extends ImpasseSettings> ENTITY doSelectByPKValue(
            final Integer id, final Class<ENTITY> entityType) {
        return doSelectEntity(buildPKCB(id), entityType);
    }

    /**
     * Select the entity by the primary-key value with deleted check.
     * @param id The one of primary key. (NotNull)
     * @return The selected entity. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public ImpasseSettings selectByPKValueWithDeletedCheck(final Integer id) {
        return doSelectByPKValueWithDeletedCheck(id, ImpasseSettings.class);
    }

    protected <ENTITY extends ImpasseSettings> ENTITY doSelectByPKValueWithDeletedCheck(
            final Integer id, final Class<ENTITY> entityType) {
        return doSelectEntityWithDeletedCheck(buildPKCB(id), entityType);
    }

    private ImpasseSettingsCB buildPKCB(final Integer id) {
        assertObjectNotNull("id", id);
        final ImpasseSettingsCB cb = newMyConditionBean();
        cb.query().setId_Equal(id);
        return cb;
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * ImpasseSettingsCB cb = new ImpasseSettingsCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * ListResultBean&lt;ImpasseSettings&gt; impasseSettingsList = impasseSettingsBhv.<span style="color: #FD4747">selectList</span>(cb);
     * for (ImpasseSettings impasseSettings : impasseSettingsList) {
     *     ... = impasseSettings.get...();
     * }
     * </pre>
     * @param cb The condition-bean of ImpasseSettings. (NotNull)
     * @return The result bean of selected list. (NotNull)
     * @exception org.seasar.dbflute.exception.DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<ImpasseSettings> selectList(final ImpasseSettingsCB cb) {
        return doSelectList(cb, ImpasseSettings.class);
    }

    protected <ENTITY extends ImpasseSettings> ListResultBean<ENTITY> doSelectList(
            final ImpasseSettingsCB cb, final Class<ENTITY> entityType) {
        assertCBStateValid(cb);
        assertObjectNotNull("entityType", entityType);
        assertSpecifyDerivedReferrerEntityProperty(cb, entityType);
        return helpSelectListInternally(cb, entityType,
                new InternalSelectListCallback<ENTITY, ImpasseSettingsCB>() {
                    @Override
                    public List<ENTITY> callbackSelectList(
                            final ImpasseSettingsCB cb,
                            final Class<ENTITY> entityType) {
                        return delegateSelectList(cb, entityType);
                    }
                });
    }

    @Override
    protected ListResultBean<? extends Entity> doReadList(final ConditionBean cb) {
        return selectList(downcast(cb));
    }

    // ===================================================================================
    //                                                                         Page Select
    //                                                                         ===========
    /**
     * Select the page as result bean. <br />
     * (both count-select and paging-select are executed)
     * <pre>
     * ImpasseSettingsCB cb = new ImpasseSettingsCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #FD4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;ImpasseSettings&gt; page = impasseSettingsBhv.<span style="color: #FD4747">selectPage</span>(cb);
     * int allRecordCount = page.getAllRecordCount();
     * int allPageCount = page.getAllPageCount();
     * boolean isExistPrePage = page.isExistPrePage();
     * boolean isExistNextPage = page.isExistNextPage();
     * ...
     * for (ImpasseSettings impasseSettings : page) {
     *     ... = impasseSettings.get...();
     * }
     * </pre>
     * @param cb The condition-bean of ImpasseSettings. (NotNull)
     * @return The result bean of selected page. (NotNull)
     * @exception org.seasar.dbflute.exception.DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<ImpasseSettings> selectPage(
            final ImpasseSettingsCB cb) {
        return doSelectPage(cb, ImpasseSettings.class);
    }

    protected <ENTITY extends ImpasseSettings> PagingResultBean<ENTITY> doSelectPage(
            final ImpasseSettingsCB cb, final Class<ENTITY> entityType) {
        assertCBStateValid(cb);
        assertObjectNotNull("entityType", entityType);
        return helpSelectPageInternally(cb, entityType,
                new InternalSelectPageCallback<ENTITY, ImpasseSettingsCB>() {
                    @Override
                    public int callbackSelectCount(final ImpasseSettingsCB cb) {
                        return doSelectCountPlainly(cb);
                    }

                    @Override
                    public List<ENTITY> callbackSelectList(
                            final ImpasseSettingsCB cb,
                            final Class<ENTITY> entityType) {
                        return doSelectList(cb, entityType);
                    }
                });
    }

    @Override
    protected PagingResultBean<? extends Entity> doReadPage(
            final ConditionBean cb) {
        return selectPage(downcast(cb));
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br />
     * You should call a function method after this method called like as follows:
     * <pre>
     * impasseSettingsBhv.<span style="color: #FD4747">scalarSelect</span>(Date.class).max(new ScalarQuery() {
     *     public void query(ImpasseSettingsCB cb) {
     *         cb.specify().<span style="color: #FD4747">columnFooDatetime()</span>; <span style="color: #3F7E5E">// required for a function</span>
     *         cb.query().setBarName_PrefixSearch("S");
     *     }
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar value derived by a function. (NullAllowed)
     */
    public <RESULT> SLFunction<ImpasseSettingsCB, RESULT> scalarSelect(
            final Class<RESULT> resultType) {
        return doScalarSelect(resultType, newMyConditionBean());
    }

    protected <RESULT, CB extends ImpasseSettingsCB> SLFunction<CB, RESULT> doScalarSelect(
            final Class<RESULT> resultType, final CB cb) {
        assertObjectNotNull("resultType", resultType);
        assertCBStateValid(cb);
        cb.xsetupForScalarSelect();
        cb.getSqlClause().disableSelectIndex(); // for when you use union
        return new SLFunction<CB, RESULT>(cb, resultType);
    }

    // ===================================================================================
    //                                                                            Sequence
    //                                                                            ========
    @Override
    protected Number doReadNextVal() {
        final String msg = "This table is NOT related to sequence: "
                + getTableDbName();
        throw new UnsupportedOperationException(msg);
    }

    // ===================================================================================
    //                                                                   Pull out Relation
    //                                                                   =================

    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key id.
     * @param impasseSettingsList The list of impasseSettings. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Integer> extractIdList(
            final List<ImpasseSettings> impasseSettingsList) {
        return helpExtractListInternally(impasseSettingsList,
                new InternalExtractCallback<ImpasseSettings, Integer>() {
                    @Override
                    public Integer getCV(final ImpasseSettings e) {
                        return e.getId();
                    }
                });
    }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity. (DefaultConstraintsEnabled)
     * <pre>
     * ImpasseSettings impasseSettings = new ImpasseSettings();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * impasseSettings.setFoo...(value);
     * impasseSettings.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//impasseSettings.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//impasseSettings.set...;</span>
     * impasseSettingsBhv.<span style="color: #FD4747">insert</span>(impasseSettings);
     * ... = impasseSettings.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param impasseSettings The entity of insert target. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(final ImpasseSettings impasseSettings) {
        doInsert(impasseSettings, null);
    }

    protected void doInsert(final ImpasseSettings impasseSettings,
            final InsertOption<ImpasseSettingsCB> option) {
        assertObjectNotNull("impasseSettings", impasseSettings);
        prepareInsertOption(option);
        delegateInsert(impasseSettings, option);
    }

    protected void prepareInsertOption(
            final InsertOption<ImpasseSettingsCB> option) {
        if (option == null) {
            return;
        }
        assertInsertOptionStatus(option);
    }

    @Override
    protected void doCreate(final Entity entity,
            final InsertOption<? extends ConditionBean> option) {
        if (option == null) {
            insert(downcast(entity));
        } else {
            varyingInsert(downcast(entity), downcast(option));
        }
    }

    /**
     * Update the entity modified-only. (ZeroUpdateException, NonExclusiveControl)
     * <pre>
     * ImpasseSettings impasseSettings = new ImpasseSettings();
     * impasseSettings.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * impasseSettings.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//impasseSettings.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//impasseSettings.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * impasseSettings.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     impasseSettingsBhv.<span style="color: #FD4747">update</span>(impasseSettings);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * } 
     * </pre>
     * @param impasseSettings The entity of update target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(final ImpasseSettings impasseSettings) {
        doUpdate(impasseSettings, null);
    }

    protected void doUpdate(final ImpasseSettings impasseSettings,
            final UpdateOption<ImpasseSettingsCB> option) {
        assertObjectNotNull("impasseSettings", impasseSettings);
        prepareUpdateOption(option);
        helpUpdateInternally(impasseSettings,
                new InternalUpdateCallback<ImpasseSettings>() {
                    @Override
                    public int callbackDelegateUpdate(
                            final ImpasseSettings entity) {
                        return delegateUpdate(entity, option);
                    }
                });
    }

    protected void prepareUpdateOption(
            final UpdateOption<ImpasseSettingsCB> option) {
        if (option == null) {
            return;
        }
        assertUpdateOptionStatus(option);
        if (option.hasSelfSpecification()) {
            option.resolveSelfSpecification(createCBForVaryingUpdate());
        }
        if (option.hasSpecifiedUpdateColumn()) {
            option.resolveUpdateColumnSpecification(createCBForSpecifiedUpdate());
        }
    }

    protected ImpasseSettingsCB createCBForVaryingUpdate() {
        final ImpasseSettingsCB cb = newMyConditionBean();
        cb.xsetupForVaryingUpdate();
        return cb;
    }

    protected ImpasseSettingsCB createCBForSpecifiedUpdate() {
        final ImpasseSettingsCB cb = newMyConditionBean();
        cb.xsetupForSpecifiedUpdate();
        return cb;
    }

    @Override
    protected void doModify(final Entity entity,
            final UpdateOption<? extends ConditionBean> option) {
        if (option == null) {
            update(downcast(entity));
        } else {
            varyingUpdate(downcast(entity), downcast(option));
        }
    }

    @Override
    protected void doModifyNonstrict(final Entity entity,
            final UpdateOption<? extends ConditionBean> option) {
        doModify(entity, option);
    }

    /**
     * Insert or update the entity modified-only. (DefaultConstraintsEnabled, NonExclusiveControl)
     * @param impasseSettings The entity of insert or update target. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(final ImpasseSettings impasseSettings) {
        doInesrtOrUpdate(impasseSettings, null, null);
    }

    protected void doInesrtOrUpdate(final ImpasseSettings impasseSettings,
            final InsertOption<ImpasseSettingsCB> insertOption,
            final UpdateOption<ImpasseSettingsCB> updateOption) {
        helpInsertOrUpdateInternally(
                impasseSettings,
                new InternalInsertOrUpdateCallback<ImpasseSettings, ImpasseSettingsCB>() {
                    @Override
                    public void callbackInsert(final ImpasseSettings entity) {
                        doInsert(entity, insertOption);
                    }

                    @Override
                    public void callbackUpdate(final ImpasseSettings entity) {
                        doUpdate(entity, updateOption);
                    }

                    @Override
                    public ImpasseSettingsCB callbackNewMyConditionBean() {
                        return newMyConditionBean();
                    }

                    @Override
                    public int callbackSelectCount(final ImpasseSettingsCB cb) {
                        return selectCount(cb);
                    }
                });
    }

    @Override
    protected void doCreateOrModify(final Entity entity,
            InsertOption<? extends ConditionBean> insertOption,
            UpdateOption<? extends ConditionBean> updateOption) {
        if (insertOption == null && updateOption == null) {
            insertOrUpdate(downcast(entity));
        } else {
            insertOption = insertOption == null ? new InsertOption<ImpasseSettingsCB>()
                    : insertOption;
            updateOption = updateOption == null ? new UpdateOption<ImpasseSettingsCB>()
                    : updateOption;
            varyingInsertOrUpdate(downcast(entity), downcast(insertOption),
                    downcast(updateOption));
        }
    }

    @Override
    protected void doCreateOrModifyNonstrict(final Entity entity,
            final InsertOption<? extends ConditionBean> insertOption,
            final UpdateOption<? extends ConditionBean> updateOption) {
        doCreateOrModify(entity, insertOption, updateOption);
    }

    /**
     * Delete the entity. (ZeroUpdateException, NonExclusiveControl)
     * <pre>
     * ImpasseSettings impasseSettings = new ImpasseSettings();
     * impasseSettings.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * impasseSettings.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     impasseSettingsBhv.<span style="color: #FD4747">delete</span>(impasseSettings);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * } 
     * </pre>
     * @param impasseSettings The entity of delete target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(final ImpasseSettings impasseSettings) {
        doDelete(impasseSettings, null);
    }

    protected void doDelete(final ImpasseSettings impasseSettings,
            final DeleteOption<ImpasseSettingsCB> option) {
        assertObjectNotNull("impasseSettings", impasseSettings);
        prepareDeleteOption(option);
        helpDeleteInternally(impasseSettings,
                new InternalDeleteCallback<ImpasseSettings>() {
                    @Override
                    public int callbackDelegateDelete(
                            final ImpasseSettings entity) {
                        return delegateDelete(entity, option);
                    }
                });
    }

    protected void prepareDeleteOption(
            final DeleteOption<ImpasseSettingsCB> option) {
        if (option == null) {
            return;
        }
        assertDeleteOptionStatus(option);
    }

    @Override
    protected void doRemove(final Entity entity,
            final DeleteOption<? extends ConditionBean> option) {
        if (option == null) {
            delete(downcast(entity));
        } else {
            varyingDelete(downcast(entity), downcast(option));
        }
    }

    @Override
    protected void doRemoveNonstrict(final Entity entity,
            final DeleteOption<? extends ConditionBean> option) {
        doRemove(entity, option);
    }

    // ===================================================================================
    //                                                                        Batch Update
    //                                                                        ============
    /**
     * Batch-insert the entity list. (DefaultConstraintsDisabled) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement. <br />
     * <span style="color: #FD4747">All columns are insert target. (so default constraints are not available in this method)</span> <br />
     * And if the table has an identity, entities after the process don't have incremented values.
     * When you use the (normal) insert(), an entity after the process has an incremented value.
     * @param impasseSettingsList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(final List<ImpasseSettings> impasseSettingsList) {
        return doBatchInsert(impasseSettingsList, null);
    }

    protected int[] doBatchInsert(
            final List<ImpasseSettings> impasseSettingsList,
            final InsertOption<ImpasseSettingsCB> option) {
        assertObjectNotNull("impasseSettingsList", impasseSettingsList);
        prepareInsertOption(option);
        return delegateBatchInsert(impasseSettingsList, option);
    }

    @Override
    protected int[] doLumpCreate(final List<Entity> ls,
            final InsertOption<? extends ConditionBean> option) {
        if (option == null) {
            return batchInsert(downcast(ls));
        } else {
            return varyingBatchInsert(downcast(ls), downcast(option));
        }
    }

    /**
     * Batch-update the entity list. (AllColumnsUpdated, NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement. <br />
     * <span style="color: #FD4747">All columns are update target. {NOT modified only}</span>
     * So you should the other batchUpdate() method, which you can specify update columns like this:
     * <pre>
     * impasseSettingsBhv.<span style="color: #FD4747">batchUpdate</span>(impasseSettingsList, new SpecifyQuery<ImpasseSettingsCB>() {
     *     public void specify(ImpasseSettingsCB cb) { <span style="color: #3F7E5E">// FOO_STATUS_CODE, BAR_DATE only updated</span>
     *         cb.specify().columnFooStatusCode();
     *         cb.specify().columnBarDate();
     *     }
     * });
     * </pre>
     * @param impasseSettingsList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(final List<ImpasseSettings> impasseSettingsList) {
        return doBatchUpdate(impasseSettingsList, null);
    }

    protected int[] doBatchUpdate(
            final List<ImpasseSettings> impasseSettingsList,
            final UpdateOption<ImpasseSettingsCB> option) {
        assertObjectNotNull("impasseSettingsList", impasseSettingsList);
        prepareUpdateOption(option);
        return delegateBatchUpdate(impasseSettingsList, option);
    }

    @Override
    protected int[] doLumpModify(final List<Entity> ls,
            final UpdateOption<? extends ConditionBean> option) {
        if (option == null) {
            return batchUpdate(downcast(ls));
        } else {
            return varyingBatchUpdate(downcast(ls), downcast(option));
        }
    }

    /**
     * Batch-update the entity list. (SpecifiedColumnsUpdated, NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement. <br />
     * You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistick lock column because they are specified implicitly.
     * <pre>
     * impasseSettingsBhv.<span style="color: #FD4747">batchUpdate</span>(impasseSettingsList, new SpecifyQuery<ImpasseSettingsCB>() {
     *     public void specify(ImpasseSettingsCB cb) { <span style="color: #3F7E5E">// FOO_STATUS_CODE, BAR_DATE only updated</span>
     *         cb.specify().columnFooStatusCode();
     *         cb.specify().columnBarDate();
     *     }
     * });
     * </pre>
     * @param impasseSettingsList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param updateColumnSpec The specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(final List<ImpasseSettings> impasseSettingsList,
            final SpecifyQuery<ImpasseSettingsCB> updateColumnSpec) {
        return doBatchUpdate(impasseSettingsList,
                createSpecifiedUpdateOption(updateColumnSpec));
    }

    @Override
    protected int[] doLumpModifyNonstrict(final List<Entity> ls,
            final UpdateOption<? extends ConditionBean> option) {
        return doLumpModify(ls, option);
    }

    /**
     * Batch-delete the entity list. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param impasseSettingsList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDelete(final List<ImpasseSettings> impasseSettingsList) {
        return doBatchDelete(impasseSettingsList, null);
    }

    protected int[] doBatchDelete(
            final List<ImpasseSettings> impasseSettingsList,
            final DeleteOption<ImpasseSettingsCB> option) {
        assertObjectNotNull("impasseSettingsList", impasseSettingsList);
        prepareDeleteOption(option);
        return delegateBatchDelete(impasseSettingsList, option);
    }

    @Override
    protected int[] doLumpRemove(final List<Entity> ls,
            final DeleteOption<? extends ConditionBean> option) {
        if (option == null) {
            return batchDelete(downcast(ls));
        } else {
            return varyingBatchDelete(downcast(ls), downcast(option));
        }
    }

    @Override
    protected int[] doLumpRemoveNonstrict(final List<Entity> ls,
            final DeleteOption<? extends ConditionBean> option) {
        return doLumpRemove(ls, option);
    }

    // ===================================================================================
    //                                                                        Query Update
    //                                                                        ============
    /**
     * Insert the several entities by query (modified-only for fixed value).
     * <pre>
     * impasseSettingsBhv.<span style="color: #FD4747">queryInsert</span>(new QueryInsertSetupper&lt;ImpasseSettings, ImpasseSettingsCB&gt;() {
     *     public ConditionBean setup(impasseSettings entity, ImpasseSettingsCB intoCB) {
     *         FooCB cb = FooCB();
     *         cb.setupSelect_Bar();
     * 
     *         <span style="color: #3F7E5E">// mapping</span>
     *         intoCB.specify().columnMyName().mappedFrom(cb.specify().columnFooName());
     *         intoCB.specify().columnMyCount().mappedFrom(cb.specify().columnFooCount());
     *         intoCB.specify().columnMyDate().mappedFrom(cb.specify().specifyBar().columnBarDate());
     *         entity.setMyFixedValue("foo"); <span style="color: #3F7E5E">// fixed value</span>
     *         <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     *         <span style="color: #3F7E5E">//entity.setRegisterUser(value);</span>
     *         <span style="color: #3F7E5E">//entity.set...;</span>
     *         <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     *         <span style="color: #3F7E5E">//entity.setVersionNo(value);</span>
     * 
     *         return cb;
     *     }
     * });
     * </pre>
     * @param setupper The setup-per of query-insert. (NotNull)
     * @return The inserted count.
     */
    public int queryInsert(
            final QueryInsertSetupper<ImpasseSettings, ImpasseSettingsCB> setupper) {
        return doQueryInsert(setupper, null);
    }

    protected int doQueryInsert(
            final QueryInsertSetupper<ImpasseSettings, ImpasseSettingsCB> setupper,
            final InsertOption<ImpasseSettingsCB> option) {
        assertObjectNotNull("setupper", setupper);
        prepareInsertOption(option);
        final ImpasseSettings entity = new ImpasseSettings();
        final ImpasseSettingsCB intoCB = createCBForQueryInsert();
        final ConditionBean resourceCB = setupper.setup(entity, intoCB);
        return delegateQueryInsert(entity, intoCB, resourceCB, option);
    }

    protected ImpasseSettingsCB createCBForQueryInsert() {
        final ImpasseSettingsCB cb = newMyConditionBean();
        cb.xsetupForQueryInsert();
        return cb;
    }

    @Override
    protected int doRangeCreate(
            final QueryInsertSetupper<? extends Entity, ? extends ConditionBean> setupper,
            final InsertOption<? extends ConditionBean> option) {
        if (option == null) {
            return queryInsert(downcast(setupper));
        } else {
            return varyingQueryInsert(downcast(setupper), downcast(option));
        }
    }

    /**
     * Update the several entities by query non-strictly modified-only. (NonExclusiveControl)
     * <pre>
     * ImpasseSettings impasseSettings = new ImpasseSettings();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//impasseSettings.setPK...(value);</span>
     * impasseSettings.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//impasseSettings.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//impasseSettings.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//impasseSettings.setVersionNo(value);</span>
     * ImpasseSettingsCB cb = new ImpasseSettingsCB();
     * cb.query().setFoo...(value);
     * impasseSettingsBhv.<span style="color: #FD4747">queryUpdate</span>(impasseSettings, cb);
     * </pre>
     * @param impasseSettings The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of ImpasseSettings. (NotNull)
     * @return The updated count.
     * @exception org.seasar.dbflute.exception.NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(final ImpasseSettings impasseSettings,
            final ImpasseSettingsCB cb) {
        return doQueryUpdate(impasseSettings, cb, null);
    }

    protected int doQueryUpdate(final ImpasseSettings impasseSettings,
            final ImpasseSettingsCB cb,
            final UpdateOption<ImpasseSettingsCB> option) {
        assertObjectNotNull("impasseSettings", impasseSettings);
        assertCBStateValid(cb);
        prepareUpdateOption(option);
        return delegateQueryUpdate(impasseSettings, cb, option);
    }

    @Override
    protected int doRangeModify(final Entity entity, final ConditionBean cb,
            final UpdateOption<? extends ConditionBean> option) {
        if (option == null) {
            return queryUpdate(downcast(entity), (ImpasseSettingsCB) cb);
        } else {
            return varyingQueryUpdate(downcast(entity), (ImpasseSettingsCB) cb,
                    downcast(option));
        }
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * ImpasseSettingsCB cb = new ImpasseSettingsCB();
     * cb.query().setFoo...(value);
     * impasseSettingsBhv.<span style="color: #FD4747">queryDelete</span>(impasseSettings, cb);
     * </pre>
     * @param cb The condition-bean of ImpasseSettings. (NotNull)
     * @return The deleted count.
     * @exception org.seasar.dbflute.exception.NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(final ImpasseSettingsCB cb) {
        return doQueryDelete(cb, null);
    }

    protected int doQueryDelete(final ImpasseSettingsCB cb,
            final DeleteOption<ImpasseSettingsCB> option) {
        assertCBStateValid(cb);
        prepareDeleteOption(option);
        return delegateQueryDelete(cb, option);
    }

    @Override
    protected int doRangeRemove(final ConditionBean cb,
            final DeleteOption<? extends ConditionBean> option) {
        if (option == null) {
            return queryDelete((ImpasseSettingsCB) cb);
        } else {
            return varyingQueryDelete((ImpasseSettingsCB) cb, downcast(option));
        }
    }

    // ===================================================================================
    //                                                                      Varying Update
    //                                                                      ==============
    // -----------------------------------------------------
    //                                         Entity Update
    //                                         -------------
    /**
     * Insert the entity with varying requests. <br />
     * For example, disableCommonColumnAutoSetup(), disablePrimaryKeyIdentity(). <br />
     * Other specifications are same as insert(entity).
     * <pre>
     * ImpasseSettings impasseSettings = new ImpasseSettings();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * impasseSettings.setFoo...(value);
     * impasseSettings.setBar...(value);
     * InsertOption<ImpasseSettingsCB> option = new InsertOption<ImpasseSettingsCB>();
     * <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     * option.disableCommonColumnAutoSetup();
     * impasseSettingsBhv.<span style="color: #FD4747">varyingInsert</span>(impasseSettings, option);
     * ... = impasseSettings.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param impasseSettings The entity of insert target. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param option The option of insert for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(final ImpasseSettings impasseSettings,
            final InsertOption<ImpasseSettingsCB> option) {
        assertInsertOptionNotNull(option);
        doInsert(impasseSettings, option);
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, NonExclusiveControl) <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br />
     * Other specifications are same as update(entity).
     * <pre>
     * ImpasseSettings impasseSettings = new ImpasseSettings();
     * impasseSettings.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * impasseSettings.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * impasseSettings.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     <span style="color: #3F7E5E">// you can update by self calculation values</span>
     *     UpdateOption&lt;ImpasseSettingsCB&gt; option = new UpdateOption&lt;ImpasseSettingsCB&gt;();
     *     option.self(new SpecifyQuery&lt;ImpasseSettingsCB&gt;() {
     *         public void specify(ImpasseSettingsCB cb) {
     *             cb.specify().<span style="color: #FD4747">columnXxxCount()</span>;
     *         }
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     *     impasseSettingsBhv.<span style="color: #FD4747">varyingUpdate</span>(impasseSettings, option);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param impasseSettings The entity of update target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @param option The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(final ImpasseSettings impasseSettings,
            final UpdateOption<ImpasseSettingsCB> option) {
        assertUpdateOptionNotNull(option);
        doUpdate(impasseSettings, option);
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br />
     * Other specifications are same as insertOrUpdate(entity).
     * @param impasseSettings The entity of insert or update target. (NotNull)
     * @param insertOption The option of insert for varying requests. (NotNull)
     * @param updateOption The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(final ImpasseSettings impasseSettings,
            final InsertOption<ImpasseSettingsCB> insertOption,
            final UpdateOption<ImpasseSettingsCB> updateOption) {
        assertInsertOptionNotNull(insertOption);
        assertUpdateOptionNotNull(updateOption);
        doInesrtOrUpdate(impasseSettings, insertOption, updateOption);
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, NonExclusiveControl) <br />
     * Now a valid option does not exist. <br />
     * Other specifications are same as delete(entity).
     * @param impasseSettings The entity of delete target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @param option The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(final ImpasseSettings impasseSettings,
            final DeleteOption<ImpasseSettingsCB> option) {
        assertDeleteOptionNotNull(option);
        doDelete(impasseSettings, option);
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br />
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br />
     * Other specifications are same as batchInsert(entityList).
     * @param impasseSettingsList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(
            final List<ImpasseSettings> impasseSettingsList,
            final InsertOption<ImpasseSettingsCB> option) {
        assertInsertOptionNotNull(option);
        return doBatchInsert(impasseSettingsList, option);
    }

    /**
     * Batch-update the list with varying requests. <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br />
     * Other specifications are same as batchUpdate(entityList).
     * @param impasseSettingsList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(
            final List<ImpasseSettings> impasseSettingsList,
            final UpdateOption<ImpasseSettingsCB> option) {
        assertUpdateOptionNotNull(option);
        return doBatchUpdate(impasseSettingsList, option);
    }

    /**
     * Batch-delete the list with varying requests. <br />
     * For example, limitBatchDeleteLogging(). <br />
     * Other specifications are same as batchDelete(entityList).
     * @param impasseSettingsList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(
            final List<ImpasseSettings> impasseSettingsList,
            final DeleteOption<ImpasseSettingsCB> option) {
        assertDeleteOptionNotNull(option);
        return doBatchDelete(impasseSettingsList, option);
    }

    // -----------------------------------------------------
    //                                          Query Update
    //                                          ------------
    /**
     * Insert the several entities by query with varying requests (modified-only for fixed value). <br />
     * For example, disableCommonColumnAutoSetup(), disablePrimaryKeyIdentity(). <br />
     * Other specifications are same as queryInsert(entity, setupper). 
     * @param setupper The setup-per of query-insert. (NotNull)
     * @param option The option of insert for varying requests. (NotNull)
     * @return The inserted count.
     */
    public int varyingQueryInsert(
            final QueryInsertSetupper<ImpasseSettings, ImpasseSettingsCB> setupper,
            final InsertOption<ImpasseSettingsCB> option) {
        assertInsertOptionNotNull(option);
        return doQueryInsert(setupper, option);
    }

    /**
     * Update the several entities by query with varying requests non-strictly modified-only. {NonExclusiveControl} <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), allowNonQueryUpdate(). <br />
     * Other specifications are same as queryUpdate(entity, cb). 
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * ImpasseSettings impasseSettings = new ImpasseSettings();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//impasseSettings.setPK...(value);</span>
     * impasseSettings.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//impasseSettings.setVersionNo(value);</span>
     * ImpasseSettingsCB cb = new ImpasseSettingsCB();
     * cb.query().setFoo...(value);
     * UpdateOption&lt;ImpasseSettingsCB&gt; option = new UpdateOption&lt;ImpasseSettingsCB&gt;();
     * option.self(new SpecifyQuery&lt;ImpasseSettingsCB&gt;() {
     *     public void specify(ImpasseSettingsCB cb) {
     *         cb.specify().<span style="color: #FD4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * impasseSettingsBhv.<span style="color: #FD4747">varyingQueryUpdate</span>(impasseSettings, cb, option);
     * </pre>
     * @param impasseSettings The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of ImpasseSettings. (NotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The updated count.
     * @exception org.seasar.dbflute.exception.NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(final ImpasseSettings impasseSettings,
            final ImpasseSettingsCB cb,
            final UpdateOption<ImpasseSettingsCB> option) {
        assertUpdateOptionNotNull(option);
        return doQueryUpdate(impasseSettings, cb, option);
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br />
     * For example, allowNonQueryDelete(). <br />
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param cb The condition-bean of ImpasseSettings. (NotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @exception org.seasar.dbflute.exception.NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(final ImpasseSettingsCB cb,
            final DeleteOption<ImpasseSettingsCB> option) {
        assertDeleteOptionNotNull(option);
        return doQueryDelete(cb, option);
    }

    // ===================================================================================
    //                                                                          OutsideSql
    //                                                                          ==========
    /**
     * Prepare the basic executor of outside-SQL to execute it. <br />
     * The invoker of behavior command should be not null when you call this method.
     * <pre>
     * You can use the methods for outside-SQL are as follows:
     * {Basic}
     *   o selectList()
     *   o execute()
     *   o call()
     * 
     * {Entity}
     *   o entityHandling().selectEntity()
     *   o entityHandling().selectEntityWithDeletedCheck()
     * 
     * {Paging}
     *   o autoPaging().selectList()
     *   o autoPaging().selectPage()
     *   o manualPaging().selectList()
     *   o manualPaging().selectPage()
     * 
     * {Cursor}
     *   o cursorHandling().selectCursor()
     * 
     * {Option}
     *   o dynamicBinding().selectList()
     *   o removeBlockComment().selectList()
     *   o removeLineComment().selectList()
     *   o formatSql().selectList()
     * </pre>
     * @return The basic executor of outside-SQL. (NotNull) 
     */
    public OutsideSqlBasicExecutor<ImpasseSettingsBhv> outsideSql() {
        return doOutsideSql();
    }

    // ===================================================================================
    //                                                                     Delegate Method
    //                                                                     ===============
    // [Behavior Command]
    // -----------------------------------------------------
    //                                                Select
    //                                                ------
    protected int delegateSelectCountUniquely(final ImpasseSettingsCB cb) {
        return invoke(createSelectCountCBCommand(cb, true));
    }

    protected int delegateSelectCountPlainly(final ImpasseSettingsCB cb) {
        return invoke(createSelectCountCBCommand(cb, false));
    }

    protected <ENTITY extends ImpasseSettings> void delegateSelectCursor(
            final ImpasseSettingsCB cb, final EntityRowHandler<ENTITY> erh,
            final Class<ENTITY> et) {
        invoke(createSelectCursorCBCommand(cb, erh, et));
    }

    protected <ENTITY extends ImpasseSettings> List<ENTITY> delegateSelectList(
            final ImpasseSettingsCB cb, final Class<ENTITY> et) {
        return invoke(createSelectListCBCommand(cb, et));
    }

    // -----------------------------------------------------
    //                                                Update
    //                                                ------
    protected int delegateInsert(final ImpasseSettings e,
            final InsertOption<ImpasseSettingsCB> op) {
        if (!processBeforeInsert(e, op)) {
            return 0;
        }
        return invoke(createInsertEntityCommand(e, op));
    }

    protected int delegateUpdate(final ImpasseSettings e,
            final UpdateOption<ImpasseSettingsCB> op) {
        if (!processBeforeUpdate(e, op)) {
            return 0;
        }
        return delegateUpdateNonstrict(e, op);
    }

    protected int delegateUpdateNonstrict(final ImpasseSettings e,
            final UpdateOption<ImpasseSettingsCB> op) {
        if (!processBeforeUpdate(e, op)) {
            return 0;
        }
        return invoke(createUpdateNonstrictEntityCommand(e, op));
    }

    protected int delegateDelete(final ImpasseSettings e,
            final DeleteOption<ImpasseSettingsCB> op) {
        if (!processBeforeDelete(e, op)) {
            return 0;
        }
        return delegateDeleteNonstrict(e, op);
    }

    protected int delegateDeleteNonstrict(final ImpasseSettings e,
            final DeleteOption<ImpasseSettingsCB> op) {
        if (!processBeforeDelete(e, op)) {
            return 0;
        }
        return invoke(createDeleteNonstrictEntityCommand(e, op));
    }

    protected int[] delegateBatchInsert(final List<ImpasseSettings> ls,
            final InsertOption<ImpasseSettingsCB> op) {
        if (ls.isEmpty()) {
            return new int[] {};
        }
        return invoke(createBatchInsertCommand(processBatchInternally(ls, op),
                op));
    }

    protected int[] delegateBatchUpdate(final List<ImpasseSettings> ls,
            final UpdateOption<ImpasseSettingsCB> op) {
        if (ls.isEmpty()) {
            return new int[] {};
        }
        return delegateBatchUpdateNonstrict(ls, op);
    }

    protected int[] delegateBatchUpdateNonstrict(
            final List<ImpasseSettings> ls,
            final UpdateOption<ImpasseSettingsCB> op) {
        if (ls.isEmpty()) {
            return new int[] {};
        }
        return invoke(createBatchUpdateNonstrictCommand(
                processBatchInternally(ls, op, true), op));
    }

    protected int[] delegateBatchDelete(final List<ImpasseSettings> ls,
            final DeleteOption<ImpasseSettingsCB> op) {
        if (ls.isEmpty()) {
            return new int[] {};
        }
        return delegateBatchDeleteNonstrict(ls, op);
    }

    protected int[] delegateBatchDeleteNonstrict(
            final List<ImpasseSettings> ls,
            final DeleteOption<ImpasseSettingsCB> op) {
        if (ls.isEmpty()) {
            return new int[] {};
        }
        return invoke(createBatchDeleteNonstrictCommand(
                processBatchInternally(ls, op, true), op));
    }

    protected int delegateQueryInsert(final ImpasseSettings e,
            final ImpasseSettingsCB inCB, final ConditionBean resCB,
            final InsertOption<ImpasseSettingsCB> op) {
        if (!processBeforeQueryInsert(e, inCB, resCB, op)) {
            return 0;
        }
        return invoke(createQueryInsertCBCommand(e, inCB, resCB, op));
    }

    protected int delegateQueryUpdate(final ImpasseSettings e,
            final ImpasseSettingsCB cb, final UpdateOption<ImpasseSettingsCB> op) {
        if (!processBeforeQueryUpdate(e, cb, op)) {
            return 0;
        }
        return invoke(createQueryUpdateCBCommand(e, cb, op));
    }

    protected int delegateQueryDelete(final ImpasseSettingsCB cb,
            final DeleteOption<ImpasseSettingsCB> op) {
        if (!processBeforeQueryDelete(cb, op)) {
            return 0;
        }
        return invoke(createQueryDeleteCBCommand(cb, op));
    }

    // ===================================================================================
    //                                                                Optimistic Lock Info
    //                                                                ====================
    /**
     * {@inheritDoc}
     */
    @Override
    protected boolean hasVersionNoValue(final Entity entity) {
        return false;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected boolean hasUpdateDateValue(final Entity entity) {
        return false;
    }

    // ===================================================================================
    //                                                                     Downcast Helper
    //                                                                     ===============
    protected ImpasseSettings downcast(final Entity entity) {
        return helpEntityDowncastInternally(entity, ImpasseSettings.class);
    }

    protected ImpasseSettingsCB downcast(final ConditionBean cb) {
        return helpConditionBeanDowncastInternally(cb, ImpasseSettingsCB.class);
    }

    @SuppressWarnings("unchecked")
    protected List<ImpasseSettings> downcast(
            final List<? extends Entity> entityList) {
        return (List<ImpasseSettings>) entityList;
    }

    @SuppressWarnings("unchecked")
    protected InsertOption<ImpasseSettingsCB> downcast(
            final InsertOption<? extends ConditionBean> option) {
        return (InsertOption<ImpasseSettingsCB>) option;
    }

    @SuppressWarnings("unchecked")
    protected UpdateOption<ImpasseSettingsCB> downcast(
            final UpdateOption<? extends ConditionBean> option) {
        return (UpdateOption<ImpasseSettingsCB>) option;
    }

    @SuppressWarnings("unchecked")
    protected DeleteOption<ImpasseSettingsCB> downcast(
            final DeleteOption<? extends ConditionBean> option) {
        return (DeleteOption<ImpasseSettingsCB>) option;
    }

    @SuppressWarnings("unchecked")
    protected QueryInsertSetupper<ImpasseSettings, ImpasseSettingsCB> downcast(
            final QueryInsertSetupper<? extends Entity, ? extends ConditionBean> option) {
        return (QueryInsertSetupper<ImpasseSettings, ImpasseSettingsCB>) option;
    }
}
