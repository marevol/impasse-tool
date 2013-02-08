package net.marevol.redmine.impasse.db.bsbhv;

import java.util.List;

import net.marevol.redmine.impasse.db.bsentity.dbmeta.ImpasseExecutionHistoriesDbm;
import net.marevol.redmine.impasse.db.cbean.ImpasseExecutionHistoriesCB;
import net.marevol.redmine.impasse.db.exbhv.ImpasseExecutionHistoriesBhv;
import net.marevol.redmine.impasse.db.exentity.ImpasseExecutionHistories;

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
 * The behavior of impasse_execution_histories as TABLE. <br />
 * <pre>
 * [primary key]
 *     id
 * 
 * [column]
 *     id, test_plan_case_id, tester_id, build_id, expected_date, status, execution_ts, executor_id, notes
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
public abstract class BsImpasseExecutionHistoriesBhv extends
        AbstractBehaviorWritable {

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
        return "impasse_execution_histories";
    }

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** @return The instance of DBMeta. (NotNull) */
    @Override
    public DBMeta getDBMeta() {
        return ImpasseExecutionHistoriesDbm.getInstance();
    }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public ImpasseExecutionHistoriesDbm getMyDBMeta() {
        return ImpasseExecutionHistoriesDbm.getInstance();
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
    public ImpasseExecutionHistories newMyEntity() {
        return new ImpasseExecutionHistories();
    }

    /** @return The instance of new condition-bean as my table type. (NotNull) */
    public ImpasseExecutionHistoriesCB newMyConditionBean() {
        return new ImpasseExecutionHistoriesCB();
    }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br />
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * ImpasseExecutionHistoriesCB cb = new ImpasseExecutionHistoriesCB();
     * cb.query().setFoo...(value);
     * int count = impasseExecutionHistoriesBhv.<span style="color: #FD4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of ImpasseExecutionHistories. (NotNull)
     * @return The selected count.
     */
    public int selectCount(final ImpasseExecutionHistoriesCB cb) {
        return doSelectCountUniquely(cb);
    }

    protected int doSelectCountUniquely(final ImpasseExecutionHistoriesCB cb) { // called by selectCount(cb) 
        assertCBStateValid(cb);
        return delegateSelectCountUniquely(cb);
    }

    protected int doSelectCountPlainly(final ImpasseExecutionHistoriesCB cb) { // called by selectPage(cb)
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
     * ImpasseExecutionHistoriesCB cb = new ImpasseExecutionHistoriesCB();
     * cb.query().setFoo...(value);
     * impasseExecutionHistoriesBhv.<span style="color: #FD4747">selectCursor</span>(cb, new EntityRowHandler&lt;ImpasseExecutionHistories&gt;() {
     *     public void handle(ImpasseExecutionHistories entity) {
     *         ... = entity.getFoo...();
     *     }
     * });
     * </pre>
     * @param cb The condition-bean of ImpasseExecutionHistories. (NotNull)
     * @param entityRowHandler The handler of entity row of ImpasseExecutionHistories. (NotNull)
     */
    public void selectCursor(final ImpasseExecutionHistoriesCB cb,
            final EntityRowHandler<ImpasseExecutionHistories> entityRowHandler) {
        doSelectCursor(cb, entityRowHandler, ImpasseExecutionHistories.class);
    }

    protected <ENTITY extends ImpasseExecutionHistories> void doSelectCursor(
            final ImpasseExecutionHistoriesCB cb,
            final EntityRowHandler<ENTITY> entityRowHandler,
            final Class<ENTITY> entityType) {
        assertCBStateValid(cb);
        assertObjectNotNull("entityRowHandler<ImpasseExecutionHistories>",
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
     * ImpasseExecutionHistoriesCB cb = new ImpasseExecutionHistoriesCB();
     * cb.query().setFoo...(value);
     * ImpasseExecutionHistories impasseExecutionHistories = impasseExecutionHistoriesBhv.<span style="color: #FD4747">selectEntity</span>(cb);
     * if (impasseExecutionHistories != null) {
     *     ... = impasseExecutionHistories.get...();
     * } else {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of ImpasseExecutionHistories. (NotNull)
     * @return The selected entity. (NullAllowed: If the condition has no data, it returns null)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public ImpasseExecutionHistories selectEntity(
            final ImpasseExecutionHistoriesCB cb) {
        return doSelectEntity(cb, ImpasseExecutionHistories.class);
    }

    protected <ENTITY extends ImpasseExecutionHistories> ENTITY doSelectEntity(
            final ImpasseExecutionHistoriesCB cb, final Class<ENTITY> entityType) {
        assertCBStateValid(cb);
        return helpSelectEntityInternally(
                cb,
                new InternalSelectEntityCallback<ENTITY, ImpasseExecutionHistoriesCB>() {
                    @Override
                    public List<ENTITY> callbackSelectList(
                            final ImpasseExecutionHistoriesCB cb) {
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
     * ImpasseExecutionHistoriesCB cb = new ImpasseExecutionHistoriesCB();
     * cb.query().setFoo...(value);
     * ImpasseExecutionHistories impasseExecutionHistories = impasseExecutionHistoriesBhv.<span style="color: #FD4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = impasseExecutionHistories.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of ImpasseExecutionHistories. (NotNull)
     * @return The selected entity. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public ImpasseExecutionHistories selectEntityWithDeletedCheck(
            final ImpasseExecutionHistoriesCB cb) {
        return doSelectEntityWithDeletedCheck(cb,
                ImpasseExecutionHistories.class);
    }

    protected <ENTITY extends ImpasseExecutionHistories> ENTITY doSelectEntityWithDeletedCheck(
            final ImpasseExecutionHistoriesCB cb, final Class<ENTITY> entityType) {
        assertCBStateValid(cb);
        return helpSelectEntityWithDeletedCheckInternally(
                cb,
                new InternalSelectEntityWithDeletedCheckCallback<ENTITY, ImpasseExecutionHistoriesCB>() {
                    @Override
                    public List<ENTITY> callbackSelectList(
                            final ImpasseExecutionHistoriesCB cb) {
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
    public ImpasseExecutionHistories selectByPKValue(final Integer id) {
        return doSelectByPKValue(id, ImpasseExecutionHistories.class);
    }

    protected <ENTITY extends ImpasseExecutionHistories> ENTITY doSelectByPKValue(
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
    public ImpasseExecutionHistories selectByPKValueWithDeletedCheck(
            final Integer id) {
        return doSelectByPKValueWithDeletedCheck(id,
                ImpasseExecutionHistories.class);
    }

    protected <ENTITY extends ImpasseExecutionHistories> ENTITY doSelectByPKValueWithDeletedCheck(
            final Integer id, final Class<ENTITY> entityType) {
        return doSelectEntityWithDeletedCheck(buildPKCB(id), entityType);
    }

    private ImpasseExecutionHistoriesCB buildPKCB(final Integer id) {
        assertObjectNotNull("id", id);
        final ImpasseExecutionHistoriesCB cb = newMyConditionBean();
        cb.query().setId_Equal(id);
        return cb;
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * ImpasseExecutionHistoriesCB cb = new ImpasseExecutionHistoriesCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * ListResultBean&lt;ImpasseExecutionHistories&gt; impasseExecutionHistoriesList = impasseExecutionHistoriesBhv.<span style="color: #FD4747">selectList</span>(cb);
     * for (ImpasseExecutionHistories impasseExecutionHistories : impasseExecutionHistoriesList) {
     *     ... = impasseExecutionHistories.get...();
     * }
     * </pre>
     * @param cb The condition-bean of ImpasseExecutionHistories. (NotNull)
     * @return The result bean of selected list. (NotNull)
     * @exception org.seasar.dbflute.exception.DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<ImpasseExecutionHistories> selectList(
            final ImpasseExecutionHistoriesCB cb) {
        return doSelectList(cb, ImpasseExecutionHistories.class);
    }

    protected <ENTITY extends ImpasseExecutionHistories> ListResultBean<ENTITY> doSelectList(
            final ImpasseExecutionHistoriesCB cb, final Class<ENTITY> entityType) {
        assertCBStateValid(cb);
        assertObjectNotNull("entityType", entityType);
        assertSpecifyDerivedReferrerEntityProperty(cb, entityType);
        return helpSelectListInternally(
                cb,
                entityType,
                new InternalSelectListCallback<ENTITY, ImpasseExecutionHistoriesCB>() {
                    @Override
                    public List<ENTITY> callbackSelectList(
                            final ImpasseExecutionHistoriesCB cb,
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
     * ImpasseExecutionHistoriesCB cb = new ImpasseExecutionHistoriesCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #FD4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;ImpasseExecutionHistories&gt; page = impasseExecutionHistoriesBhv.<span style="color: #FD4747">selectPage</span>(cb);
     * int allRecordCount = page.getAllRecordCount();
     * int allPageCount = page.getAllPageCount();
     * boolean isExistPrePage = page.isExistPrePage();
     * boolean isExistNextPage = page.isExistNextPage();
     * ...
     * for (ImpasseExecutionHistories impasseExecutionHistories : page) {
     *     ... = impasseExecutionHistories.get...();
     * }
     * </pre>
     * @param cb The condition-bean of ImpasseExecutionHistories. (NotNull)
     * @return The result bean of selected page. (NotNull)
     * @exception org.seasar.dbflute.exception.DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<ImpasseExecutionHistories> selectPage(
            final ImpasseExecutionHistoriesCB cb) {
        return doSelectPage(cb, ImpasseExecutionHistories.class);
    }

    protected <ENTITY extends ImpasseExecutionHistories> PagingResultBean<ENTITY> doSelectPage(
            final ImpasseExecutionHistoriesCB cb, final Class<ENTITY> entityType) {
        assertCBStateValid(cb);
        assertObjectNotNull("entityType", entityType);
        return helpSelectPageInternally(
                cb,
                entityType,
                new InternalSelectPageCallback<ENTITY, ImpasseExecutionHistoriesCB>() {
                    @Override
                    public int callbackSelectCount(
                            final ImpasseExecutionHistoriesCB cb) {
                        return doSelectCountPlainly(cb);
                    }

                    @Override
                    public List<ENTITY> callbackSelectList(
                            final ImpasseExecutionHistoriesCB cb,
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
     * impasseExecutionHistoriesBhv.<span style="color: #FD4747">scalarSelect</span>(Date.class).max(new ScalarQuery() {
     *     public void query(ImpasseExecutionHistoriesCB cb) {
     *         cb.specify().<span style="color: #FD4747">columnFooDatetime()</span>; <span style="color: #3F7E5E">// required for a function</span>
     *         cb.query().setBarName_PrefixSearch("S");
     *     }
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar value derived by a function. (NullAllowed)
     */
    public <RESULT> SLFunction<ImpasseExecutionHistoriesCB, RESULT> scalarSelect(
            final Class<RESULT> resultType) {
        return doScalarSelect(resultType, newMyConditionBean());
    }

    protected <RESULT, CB extends ImpasseExecutionHistoriesCB> SLFunction<CB, RESULT> doScalarSelect(
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
     * @param impasseExecutionHistoriesList The list of impasseExecutionHistories. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Integer> extractIdList(
            final List<ImpasseExecutionHistories> impasseExecutionHistoriesList) {
        return helpExtractListInternally(
                impasseExecutionHistoriesList,
                new InternalExtractCallback<ImpasseExecutionHistories, Integer>() {
                    @Override
                    public Integer getCV(final ImpasseExecutionHistories e) {
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
     * ImpasseExecutionHistories impasseExecutionHistories = new ImpasseExecutionHistories();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * impasseExecutionHistories.setFoo...(value);
     * impasseExecutionHistories.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//impasseExecutionHistories.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//impasseExecutionHistories.set...;</span>
     * impasseExecutionHistoriesBhv.<span style="color: #FD4747">insert</span>(impasseExecutionHistories);
     * ... = impasseExecutionHistories.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param impasseExecutionHistories The entity of insert target. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(final ImpasseExecutionHistories impasseExecutionHistories) {
        doInsert(impasseExecutionHistories, null);
    }

    protected void doInsert(
            final ImpasseExecutionHistories impasseExecutionHistories,
            final InsertOption<ImpasseExecutionHistoriesCB> option) {
        assertObjectNotNull("impasseExecutionHistories",
                impasseExecutionHistories);
        prepareInsertOption(option);
        delegateInsert(impasseExecutionHistories, option);
    }

    protected void prepareInsertOption(
            final InsertOption<ImpasseExecutionHistoriesCB> option) {
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
     * ImpasseExecutionHistories impasseExecutionHistories = new ImpasseExecutionHistories();
     * impasseExecutionHistories.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * impasseExecutionHistories.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//impasseExecutionHistories.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//impasseExecutionHistories.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * impasseExecutionHistories.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     impasseExecutionHistoriesBhv.<span style="color: #FD4747">update</span>(impasseExecutionHistories);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * } 
     * </pre>
     * @param impasseExecutionHistories The entity of update target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(final ImpasseExecutionHistories impasseExecutionHistories) {
        doUpdate(impasseExecutionHistories, null);
    }

    protected void doUpdate(
            final ImpasseExecutionHistories impasseExecutionHistories,
            final UpdateOption<ImpasseExecutionHistoriesCB> option) {
        assertObjectNotNull("impasseExecutionHistories",
                impasseExecutionHistories);
        prepareUpdateOption(option);
        helpUpdateInternally(impasseExecutionHistories,
                new InternalUpdateCallback<ImpasseExecutionHistories>() {
                    @Override
                    public int callbackDelegateUpdate(
                            final ImpasseExecutionHistories entity) {
                        return delegateUpdate(entity, option);
                    }
                });
    }

    protected void prepareUpdateOption(
            final UpdateOption<ImpasseExecutionHistoriesCB> option) {
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

    protected ImpasseExecutionHistoriesCB createCBForVaryingUpdate() {
        final ImpasseExecutionHistoriesCB cb = newMyConditionBean();
        cb.xsetupForVaryingUpdate();
        return cb;
    }

    protected ImpasseExecutionHistoriesCB createCBForSpecifiedUpdate() {
        final ImpasseExecutionHistoriesCB cb = newMyConditionBean();
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
     * @param impasseExecutionHistories The entity of insert or update target. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(
            final ImpasseExecutionHistories impasseExecutionHistories) {
        doInesrtOrUpdate(impasseExecutionHistories, null, null);
    }

    protected void doInesrtOrUpdate(
            final ImpasseExecutionHistories impasseExecutionHistories,
            final InsertOption<ImpasseExecutionHistoriesCB> insertOption,
            final UpdateOption<ImpasseExecutionHistoriesCB> updateOption) {
        helpInsertOrUpdateInternally(
                impasseExecutionHistories,
                new InternalInsertOrUpdateCallback<ImpasseExecutionHistories, ImpasseExecutionHistoriesCB>() {
                    @Override
                    public void callbackInsert(
                            final ImpasseExecutionHistories entity) {
                        doInsert(entity, insertOption);
                    }

                    @Override
                    public void callbackUpdate(
                            final ImpasseExecutionHistories entity) {
                        doUpdate(entity, updateOption);
                    }

                    @Override
                    public ImpasseExecutionHistoriesCB callbackNewMyConditionBean() {
                        return newMyConditionBean();
                    }

                    @Override
                    public int callbackSelectCount(
                            final ImpasseExecutionHistoriesCB cb) {
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
            insertOption = insertOption == null ? new InsertOption<ImpasseExecutionHistoriesCB>()
                    : insertOption;
            updateOption = updateOption == null ? new UpdateOption<ImpasseExecutionHistoriesCB>()
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
     * ImpasseExecutionHistories impasseExecutionHistories = new ImpasseExecutionHistories();
     * impasseExecutionHistories.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * impasseExecutionHistories.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     impasseExecutionHistoriesBhv.<span style="color: #FD4747">delete</span>(impasseExecutionHistories);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * } 
     * </pre>
     * @param impasseExecutionHistories The entity of delete target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(final ImpasseExecutionHistories impasseExecutionHistories) {
        doDelete(impasseExecutionHistories, null);
    }

    protected void doDelete(
            final ImpasseExecutionHistories impasseExecutionHistories,
            final DeleteOption<ImpasseExecutionHistoriesCB> option) {
        assertObjectNotNull("impasseExecutionHistories",
                impasseExecutionHistories);
        prepareDeleteOption(option);
        helpDeleteInternally(impasseExecutionHistories,
                new InternalDeleteCallback<ImpasseExecutionHistories>() {
                    @Override
                    public int callbackDelegateDelete(
                            final ImpasseExecutionHistories entity) {
                        return delegateDelete(entity, option);
                    }
                });
    }

    protected void prepareDeleteOption(
            final DeleteOption<ImpasseExecutionHistoriesCB> option) {
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
     * @param impasseExecutionHistoriesList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(
            final List<ImpasseExecutionHistories> impasseExecutionHistoriesList) {
        return doBatchInsert(impasseExecutionHistoriesList, null);
    }

    protected int[] doBatchInsert(
            final List<ImpasseExecutionHistories> impasseExecutionHistoriesList,
            final InsertOption<ImpasseExecutionHistoriesCB> option) {
        assertObjectNotNull("impasseExecutionHistoriesList",
                impasseExecutionHistoriesList);
        prepareInsertOption(option);
        return delegateBatchInsert(impasseExecutionHistoriesList, option);
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
     * impasseExecutionHistoriesBhv.<span style="color: #FD4747">batchUpdate</span>(impasseExecutionHistoriesList, new SpecifyQuery<ImpasseExecutionHistoriesCB>() {
     *     public void specify(ImpasseExecutionHistoriesCB cb) { <span style="color: #3F7E5E">// FOO_STATUS_CODE, BAR_DATE only updated</span>
     *         cb.specify().columnFooStatusCode();
     *         cb.specify().columnBarDate();
     *     }
     * });
     * </pre>
     * @param impasseExecutionHistoriesList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(
            final List<ImpasseExecutionHistories> impasseExecutionHistoriesList) {
        return doBatchUpdate(impasseExecutionHistoriesList, null);
    }

    protected int[] doBatchUpdate(
            final List<ImpasseExecutionHistories> impasseExecutionHistoriesList,
            final UpdateOption<ImpasseExecutionHistoriesCB> option) {
        assertObjectNotNull("impasseExecutionHistoriesList",
                impasseExecutionHistoriesList);
        prepareUpdateOption(option);
        return delegateBatchUpdate(impasseExecutionHistoriesList, option);
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
     * impasseExecutionHistoriesBhv.<span style="color: #FD4747">batchUpdate</span>(impasseExecutionHistoriesList, new SpecifyQuery<ImpasseExecutionHistoriesCB>() {
     *     public void specify(ImpasseExecutionHistoriesCB cb) { <span style="color: #3F7E5E">// FOO_STATUS_CODE, BAR_DATE only updated</span>
     *         cb.specify().columnFooStatusCode();
     *         cb.specify().columnBarDate();
     *     }
     * });
     * </pre>
     * @param impasseExecutionHistoriesList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param updateColumnSpec The specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(
            final List<ImpasseExecutionHistories> impasseExecutionHistoriesList,
            final SpecifyQuery<ImpasseExecutionHistoriesCB> updateColumnSpec) {
        return doBatchUpdate(impasseExecutionHistoriesList,
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
     * @param impasseExecutionHistoriesList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDelete(
            final List<ImpasseExecutionHistories> impasseExecutionHistoriesList) {
        return doBatchDelete(impasseExecutionHistoriesList, null);
    }

    protected int[] doBatchDelete(
            final List<ImpasseExecutionHistories> impasseExecutionHistoriesList,
            final DeleteOption<ImpasseExecutionHistoriesCB> option) {
        assertObjectNotNull("impasseExecutionHistoriesList",
                impasseExecutionHistoriesList);
        prepareDeleteOption(option);
        return delegateBatchDelete(impasseExecutionHistoriesList, option);
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
     * impasseExecutionHistoriesBhv.<span style="color: #FD4747">queryInsert</span>(new QueryInsertSetupper&lt;ImpasseExecutionHistories, ImpasseExecutionHistoriesCB&gt;() {
     *     public ConditionBean setup(impasseExecutionHistories entity, ImpasseExecutionHistoriesCB intoCB) {
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
            final QueryInsertSetupper<ImpasseExecutionHistories, ImpasseExecutionHistoriesCB> setupper) {
        return doQueryInsert(setupper, null);
    }

    protected int doQueryInsert(
            final QueryInsertSetupper<ImpasseExecutionHistories, ImpasseExecutionHistoriesCB> setupper,
            final InsertOption<ImpasseExecutionHistoriesCB> option) {
        assertObjectNotNull("setupper", setupper);
        prepareInsertOption(option);
        final ImpasseExecutionHistories entity = new ImpasseExecutionHistories();
        final ImpasseExecutionHistoriesCB intoCB = createCBForQueryInsert();
        final ConditionBean resourceCB = setupper.setup(entity, intoCB);
        return delegateQueryInsert(entity, intoCB, resourceCB, option);
    }

    protected ImpasseExecutionHistoriesCB createCBForQueryInsert() {
        final ImpasseExecutionHistoriesCB cb = newMyConditionBean();
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
     * ImpasseExecutionHistories impasseExecutionHistories = new ImpasseExecutionHistories();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//impasseExecutionHistories.setPK...(value);</span>
     * impasseExecutionHistories.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//impasseExecutionHistories.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//impasseExecutionHistories.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//impasseExecutionHistories.setVersionNo(value);</span>
     * ImpasseExecutionHistoriesCB cb = new ImpasseExecutionHistoriesCB();
     * cb.query().setFoo...(value);
     * impasseExecutionHistoriesBhv.<span style="color: #FD4747">queryUpdate</span>(impasseExecutionHistories, cb);
     * </pre>
     * @param impasseExecutionHistories The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of ImpasseExecutionHistories. (NotNull)
     * @return The updated count.
     * @exception org.seasar.dbflute.exception.NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(
            final ImpasseExecutionHistories impasseExecutionHistories,
            final ImpasseExecutionHistoriesCB cb) {
        return doQueryUpdate(impasseExecutionHistories, cb, null);
    }

    protected int doQueryUpdate(
            final ImpasseExecutionHistories impasseExecutionHistories,
            final ImpasseExecutionHistoriesCB cb,
            final UpdateOption<ImpasseExecutionHistoriesCB> option) {
        assertObjectNotNull("impasseExecutionHistories",
                impasseExecutionHistories);
        assertCBStateValid(cb);
        prepareUpdateOption(option);
        return delegateQueryUpdate(impasseExecutionHistories, cb, option);
    }

    @Override
    protected int doRangeModify(final Entity entity, final ConditionBean cb,
            final UpdateOption<? extends ConditionBean> option) {
        if (option == null) {
            return queryUpdate(downcast(entity),
                    (ImpasseExecutionHistoriesCB) cb);
        } else {
            return varyingQueryUpdate(downcast(entity),
                    (ImpasseExecutionHistoriesCB) cb, downcast(option));
        }
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * ImpasseExecutionHistoriesCB cb = new ImpasseExecutionHistoriesCB();
     * cb.query().setFoo...(value);
     * impasseExecutionHistoriesBhv.<span style="color: #FD4747">queryDelete</span>(impasseExecutionHistories, cb);
     * </pre>
     * @param cb The condition-bean of ImpasseExecutionHistories. (NotNull)
     * @return The deleted count.
     * @exception org.seasar.dbflute.exception.NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(final ImpasseExecutionHistoriesCB cb) {
        return doQueryDelete(cb, null);
    }

    protected int doQueryDelete(final ImpasseExecutionHistoriesCB cb,
            final DeleteOption<ImpasseExecutionHistoriesCB> option) {
        assertCBStateValid(cb);
        prepareDeleteOption(option);
        return delegateQueryDelete(cb, option);
    }

    @Override
    protected int doRangeRemove(final ConditionBean cb,
            final DeleteOption<? extends ConditionBean> option) {
        if (option == null) {
            return queryDelete((ImpasseExecutionHistoriesCB) cb);
        } else {
            return varyingQueryDelete((ImpasseExecutionHistoriesCB) cb,
                    downcast(option));
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
     * ImpasseExecutionHistories impasseExecutionHistories = new ImpasseExecutionHistories();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * impasseExecutionHistories.setFoo...(value);
     * impasseExecutionHistories.setBar...(value);
     * InsertOption<ImpasseExecutionHistoriesCB> option = new InsertOption<ImpasseExecutionHistoriesCB>();
     * <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     * option.disableCommonColumnAutoSetup();
     * impasseExecutionHistoriesBhv.<span style="color: #FD4747">varyingInsert</span>(impasseExecutionHistories, option);
     * ... = impasseExecutionHistories.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param impasseExecutionHistories The entity of insert target. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param option The option of insert for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(
            final ImpasseExecutionHistories impasseExecutionHistories,
            final InsertOption<ImpasseExecutionHistoriesCB> option) {
        assertInsertOptionNotNull(option);
        doInsert(impasseExecutionHistories, option);
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, NonExclusiveControl) <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br />
     * Other specifications are same as update(entity).
     * <pre>
     * ImpasseExecutionHistories impasseExecutionHistories = new ImpasseExecutionHistories();
     * impasseExecutionHistories.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * impasseExecutionHistories.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * impasseExecutionHistories.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     <span style="color: #3F7E5E">// you can update by self calculation values</span>
     *     UpdateOption&lt;ImpasseExecutionHistoriesCB&gt; option = new UpdateOption&lt;ImpasseExecutionHistoriesCB&gt;();
     *     option.self(new SpecifyQuery&lt;ImpasseExecutionHistoriesCB&gt;() {
     *         public void specify(ImpasseExecutionHistoriesCB cb) {
     *             cb.specify().<span style="color: #FD4747">columnXxxCount()</span>;
     *         }
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     *     impasseExecutionHistoriesBhv.<span style="color: #FD4747">varyingUpdate</span>(impasseExecutionHistories, option);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param impasseExecutionHistories The entity of update target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @param option The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(
            final ImpasseExecutionHistories impasseExecutionHistories,
            final UpdateOption<ImpasseExecutionHistoriesCB> option) {
        assertUpdateOptionNotNull(option);
        doUpdate(impasseExecutionHistories, option);
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br />
     * Other specifications are same as insertOrUpdate(entity).
     * @param impasseExecutionHistories The entity of insert or update target. (NotNull)
     * @param insertOption The option of insert for varying requests. (NotNull)
     * @param updateOption The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(
            final ImpasseExecutionHistories impasseExecutionHistories,
            final InsertOption<ImpasseExecutionHistoriesCB> insertOption,
            final UpdateOption<ImpasseExecutionHistoriesCB> updateOption) {
        assertInsertOptionNotNull(insertOption);
        assertUpdateOptionNotNull(updateOption);
        doInesrtOrUpdate(impasseExecutionHistories, insertOption, updateOption);
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, NonExclusiveControl) <br />
     * Now a valid option does not exist. <br />
     * Other specifications are same as delete(entity).
     * @param impasseExecutionHistories The entity of delete target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @param option The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(
            final ImpasseExecutionHistories impasseExecutionHistories,
            final DeleteOption<ImpasseExecutionHistoriesCB> option) {
        assertDeleteOptionNotNull(option);
        doDelete(impasseExecutionHistories, option);
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br />
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br />
     * Other specifications are same as batchInsert(entityList).
     * @param impasseExecutionHistoriesList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(
            final List<ImpasseExecutionHistories> impasseExecutionHistoriesList,
            final InsertOption<ImpasseExecutionHistoriesCB> option) {
        assertInsertOptionNotNull(option);
        return doBatchInsert(impasseExecutionHistoriesList, option);
    }

    /**
     * Batch-update the list with varying requests. <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br />
     * Other specifications are same as batchUpdate(entityList).
     * @param impasseExecutionHistoriesList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(
            final List<ImpasseExecutionHistories> impasseExecutionHistoriesList,
            final UpdateOption<ImpasseExecutionHistoriesCB> option) {
        assertUpdateOptionNotNull(option);
        return doBatchUpdate(impasseExecutionHistoriesList, option);
    }

    /**
     * Batch-delete the list with varying requests. <br />
     * For example, limitBatchDeleteLogging(). <br />
     * Other specifications are same as batchDelete(entityList).
     * @param impasseExecutionHistoriesList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(
            final List<ImpasseExecutionHistories> impasseExecutionHistoriesList,
            final DeleteOption<ImpasseExecutionHistoriesCB> option) {
        assertDeleteOptionNotNull(option);
        return doBatchDelete(impasseExecutionHistoriesList, option);
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
            final QueryInsertSetupper<ImpasseExecutionHistories, ImpasseExecutionHistoriesCB> setupper,
            final InsertOption<ImpasseExecutionHistoriesCB> option) {
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
     * ImpasseExecutionHistories impasseExecutionHistories = new ImpasseExecutionHistories();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//impasseExecutionHistories.setPK...(value);</span>
     * impasseExecutionHistories.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//impasseExecutionHistories.setVersionNo(value);</span>
     * ImpasseExecutionHistoriesCB cb = new ImpasseExecutionHistoriesCB();
     * cb.query().setFoo...(value);
     * UpdateOption&lt;ImpasseExecutionHistoriesCB&gt; option = new UpdateOption&lt;ImpasseExecutionHistoriesCB&gt;();
     * option.self(new SpecifyQuery&lt;ImpasseExecutionHistoriesCB&gt;() {
     *     public void specify(ImpasseExecutionHistoriesCB cb) {
     *         cb.specify().<span style="color: #FD4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * impasseExecutionHistoriesBhv.<span style="color: #FD4747">varyingQueryUpdate</span>(impasseExecutionHistories, cb, option);
     * </pre>
     * @param impasseExecutionHistories The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of ImpasseExecutionHistories. (NotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The updated count.
     * @exception org.seasar.dbflute.exception.NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(
            final ImpasseExecutionHistories impasseExecutionHistories,
            final ImpasseExecutionHistoriesCB cb,
            final UpdateOption<ImpasseExecutionHistoriesCB> option) {
        assertUpdateOptionNotNull(option);
        return doQueryUpdate(impasseExecutionHistories, cb, option);
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br />
     * For example, allowNonQueryDelete(). <br />
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param cb The condition-bean of ImpasseExecutionHistories. (NotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @exception org.seasar.dbflute.exception.NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(final ImpasseExecutionHistoriesCB cb,
            final DeleteOption<ImpasseExecutionHistoriesCB> option) {
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
    public OutsideSqlBasicExecutor<ImpasseExecutionHistoriesBhv> outsideSql() {
        return doOutsideSql();
    }

    // ===================================================================================
    //                                                                     Delegate Method
    //                                                                     ===============
    // [Behavior Command]
    // -----------------------------------------------------
    //                                                Select
    //                                                ------
    protected int delegateSelectCountUniquely(
            final ImpasseExecutionHistoriesCB cb) {
        return invoke(createSelectCountCBCommand(cb, true));
    }

    protected int delegateSelectCountPlainly(
            final ImpasseExecutionHistoriesCB cb) {
        return invoke(createSelectCountCBCommand(cb, false));
    }

    protected <ENTITY extends ImpasseExecutionHistories> void delegateSelectCursor(
            final ImpasseExecutionHistoriesCB cb,
            final EntityRowHandler<ENTITY> erh, final Class<ENTITY> et) {
        invoke(createSelectCursorCBCommand(cb, erh, et));
    }

    protected <ENTITY extends ImpasseExecutionHistories> List<ENTITY> delegateSelectList(
            final ImpasseExecutionHistoriesCB cb, final Class<ENTITY> et) {
        return invoke(createSelectListCBCommand(cb, et));
    }

    // -----------------------------------------------------
    //                                                Update
    //                                                ------
    protected int delegateInsert(final ImpasseExecutionHistories e,
            final InsertOption<ImpasseExecutionHistoriesCB> op) {
        if (!processBeforeInsert(e, op)) {
            return 0;
        }
        return invoke(createInsertEntityCommand(e, op));
    }

    protected int delegateUpdate(final ImpasseExecutionHistories e,
            final UpdateOption<ImpasseExecutionHistoriesCB> op) {
        if (!processBeforeUpdate(e, op)) {
            return 0;
        }
        return delegateUpdateNonstrict(e, op);
    }

    protected int delegateUpdateNonstrict(final ImpasseExecutionHistories e,
            final UpdateOption<ImpasseExecutionHistoriesCB> op) {
        if (!processBeforeUpdate(e, op)) {
            return 0;
        }
        return invoke(createUpdateNonstrictEntityCommand(e, op));
    }

    protected int delegateDelete(final ImpasseExecutionHistories e,
            final DeleteOption<ImpasseExecutionHistoriesCB> op) {
        if (!processBeforeDelete(e, op)) {
            return 0;
        }
        return delegateDeleteNonstrict(e, op);
    }

    protected int delegateDeleteNonstrict(final ImpasseExecutionHistories e,
            final DeleteOption<ImpasseExecutionHistoriesCB> op) {
        if (!processBeforeDelete(e, op)) {
            return 0;
        }
        return invoke(createDeleteNonstrictEntityCommand(e, op));
    }

    protected int[] delegateBatchInsert(
            final List<ImpasseExecutionHistories> ls,
            final InsertOption<ImpasseExecutionHistoriesCB> op) {
        if (ls.isEmpty()) {
            return new int[] {};
        }
        return invoke(createBatchInsertCommand(processBatchInternally(ls, op),
                op));
    }

    protected int[] delegateBatchUpdate(
            final List<ImpasseExecutionHistories> ls,
            final UpdateOption<ImpasseExecutionHistoriesCB> op) {
        if (ls.isEmpty()) {
            return new int[] {};
        }
        return delegateBatchUpdateNonstrict(ls, op);
    }

    protected int[] delegateBatchUpdateNonstrict(
            final List<ImpasseExecutionHistories> ls,
            final UpdateOption<ImpasseExecutionHistoriesCB> op) {
        if (ls.isEmpty()) {
            return new int[] {};
        }
        return invoke(createBatchUpdateNonstrictCommand(
                processBatchInternally(ls, op, true), op));
    }

    protected int[] delegateBatchDelete(
            final List<ImpasseExecutionHistories> ls,
            final DeleteOption<ImpasseExecutionHistoriesCB> op) {
        if (ls.isEmpty()) {
            return new int[] {};
        }
        return delegateBatchDeleteNonstrict(ls, op);
    }

    protected int[] delegateBatchDeleteNonstrict(
            final List<ImpasseExecutionHistories> ls,
            final DeleteOption<ImpasseExecutionHistoriesCB> op) {
        if (ls.isEmpty()) {
            return new int[] {};
        }
        return invoke(createBatchDeleteNonstrictCommand(
                processBatchInternally(ls, op, true), op));
    }

    protected int delegateQueryInsert(final ImpasseExecutionHistories e,
            final ImpasseExecutionHistoriesCB inCB, final ConditionBean resCB,
            final InsertOption<ImpasseExecutionHistoriesCB> op) {
        if (!processBeforeQueryInsert(e, inCB, resCB, op)) {
            return 0;
        }
        return invoke(createQueryInsertCBCommand(e, inCB, resCB, op));
    }

    protected int delegateQueryUpdate(final ImpasseExecutionHistories e,
            final ImpasseExecutionHistoriesCB cb,
            final UpdateOption<ImpasseExecutionHistoriesCB> op) {
        if (!processBeforeQueryUpdate(e, cb, op)) {
            return 0;
        }
        return invoke(createQueryUpdateCBCommand(e, cb, op));
    }

    protected int delegateQueryDelete(final ImpasseExecutionHistoriesCB cb,
            final DeleteOption<ImpasseExecutionHistoriesCB> op) {
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
    protected ImpasseExecutionHistories downcast(final Entity entity) {
        return helpEntityDowncastInternally(entity,
                ImpasseExecutionHistories.class);
    }

    protected ImpasseExecutionHistoriesCB downcast(final ConditionBean cb) {
        return helpConditionBeanDowncastInternally(cb,
                ImpasseExecutionHistoriesCB.class);
    }

    @SuppressWarnings("unchecked")
    protected List<ImpasseExecutionHistories> downcast(
            final List<? extends Entity> entityList) {
        return (List<ImpasseExecutionHistories>) entityList;
    }

    @SuppressWarnings("unchecked")
    protected InsertOption<ImpasseExecutionHistoriesCB> downcast(
            final InsertOption<? extends ConditionBean> option) {
        return (InsertOption<ImpasseExecutionHistoriesCB>) option;
    }

    @SuppressWarnings("unchecked")
    protected UpdateOption<ImpasseExecutionHistoriesCB> downcast(
            final UpdateOption<? extends ConditionBean> option) {
        return (UpdateOption<ImpasseExecutionHistoriesCB>) option;
    }

    @SuppressWarnings("unchecked")
    protected DeleteOption<ImpasseExecutionHistoriesCB> downcast(
            final DeleteOption<? extends ConditionBean> option) {
        return (DeleteOption<ImpasseExecutionHistoriesCB>) option;
    }

    @SuppressWarnings("unchecked")
    protected QueryInsertSetupper<ImpasseExecutionHistories, ImpasseExecutionHistoriesCB> downcast(
            final QueryInsertSetupper<? extends Entity, ? extends ConditionBean> option) {
        return (QueryInsertSetupper<ImpasseExecutionHistories, ImpasseExecutionHistoriesCB>) option;
    }
}
