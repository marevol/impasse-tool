package net.marevol.redmine.impasse.db.bsbhv;

import java.util.List;

import net.marevol.redmine.impasse.db.bsentity.dbmeta.ImpasseExecutionsDbm;
import net.marevol.redmine.impasse.db.cbean.ImpasseExecutionsCB;
import net.marevol.redmine.impasse.db.exbhv.ImpasseExecutionsBhv;
import net.marevol.redmine.impasse.db.exentity.ImpasseExecutions;

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
 * The behavior of impasse_executions as TABLE. <br />
 * <pre>
 * [primary key]
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
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsImpasseExecutionsBhv extends AbstractBehaviorWritable {

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
        return "impasse_executions";
    }

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** @return The instance of DBMeta. (NotNull) */
    @Override
    public DBMeta getDBMeta() {
        return ImpasseExecutionsDbm.getInstance();
    }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public ImpasseExecutionsDbm getMyDBMeta() {
        return ImpasseExecutionsDbm.getInstance();
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
    public ImpasseExecutions newMyEntity() {
        return new ImpasseExecutions();
    }

    /** @return The instance of new condition-bean as my table type. (NotNull) */
    public ImpasseExecutionsCB newMyConditionBean() {
        return new ImpasseExecutionsCB();
    }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br />
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * ImpasseExecutionsCB cb = new ImpasseExecutionsCB();
     * cb.query().setFoo...(value);
     * int count = impasseExecutionsBhv.<span style="color: #FD4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of ImpasseExecutions. (NotNull)
     * @return The selected count.
     */
    public int selectCount(final ImpasseExecutionsCB cb) {
        return doSelectCountUniquely(cb);
    }

    protected int doSelectCountUniquely(final ImpasseExecutionsCB cb) { // called by selectCount(cb) 
        assertCBStateValid(cb);
        return delegateSelectCountUniquely(cb);
    }

    protected int doSelectCountPlainly(final ImpasseExecutionsCB cb) { // called by selectPage(cb)
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
     * ImpasseExecutionsCB cb = new ImpasseExecutionsCB();
     * cb.query().setFoo...(value);
     * impasseExecutionsBhv.<span style="color: #FD4747">selectCursor</span>(cb, new EntityRowHandler&lt;ImpasseExecutions&gt;() {
     *     public void handle(ImpasseExecutions entity) {
     *         ... = entity.getFoo...();
     *     }
     * });
     * </pre>
     * @param cb The condition-bean of ImpasseExecutions. (NotNull)
     * @param entityRowHandler The handler of entity row of ImpasseExecutions. (NotNull)
     */
    public void selectCursor(final ImpasseExecutionsCB cb,
            final EntityRowHandler<ImpasseExecutions> entityRowHandler) {
        doSelectCursor(cb, entityRowHandler, ImpasseExecutions.class);
    }

    protected <ENTITY extends ImpasseExecutions> void doSelectCursor(
            final ImpasseExecutionsCB cb,
            final EntityRowHandler<ENTITY> entityRowHandler,
            final Class<ENTITY> entityType) {
        assertCBStateValid(cb);
        assertObjectNotNull("entityRowHandler<ImpasseExecutions>",
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
     * ImpasseExecutionsCB cb = new ImpasseExecutionsCB();
     * cb.query().setFoo...(value);
     * ImpasseExecutions impasseExecutions = impasseExecutionsBhv.<span style="color: #FD4747">selectEntity</span>(cb);
     * if (impasseExecutions != null) {
     *     ... = impasseExecutions.get...();
     * } else {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of ImpasseExecutions. (NotNull)
     * @return The selected entity. (NullAllowed: If the condition has no data, it returns null)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public ImpasseExecutions selectEntity(final ImpasseExecutionsCB cb) {
        return doSelectEntity(cb, ImpasseExecutions.class);
    }

    protected <ENTITY extends ImpasseExecutions> ENTITY doSelectEntity(
            final ImpasseExecutionsCB cb, final Class<ENTITY> entityType) {
        assertCBStateValid(cb);
        return helpSelectEntityInternally(
                cb,
                new InternalSelectEntityCallback<ENTITY, ImpasseExecutionsCB>() {
                    @Override
                    public List<ENTITY> callbackSelectList(
                            final ImpasseExecutionsCB cb) {
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
     * ImpasseExecutionsCB cb = new ImpasseExecutionsCB();
     * cb.query().setFoo...(value);
     * ImpasseExecutions impasseExecutions = impasseExecutionsBhv.<span style="color: #FD4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = impasseExecutions.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of ImpasseExecutions. (NotNull)
     * @return The selected entity. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public ImpasseExecutions selectEntityWithDeletedCheck(
            final ImpasseExecutionsCB cb) {
        return doSelectEntityWithDeletedCheck(cb, ImpasseExecutions.class);
    }

    protected <ENTITY extends ImpasseExecutions> ENTITY doSelectEntityWithDeletedCheck(
            final ImpasseExecutionsCB cb, final Class<ENTITY> entityType) {
        assertCBStateValid(cb);
        return helpSelectEntityWithDeletedCheckInternally(
                cb,
                new InternalSelectEntityWithDeletedCheckCallback<ENTITY, ImpasseExecutionsCB>() {
                    @Override
                    public List<ENTITY> callbackSelectList(
                            final ImpasseExecutionsCB cb) {
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
    public ImpasseExecutions selectByPKValue(final Integer id) {
        return doSelectByPKValue(id, ImpasseExecutions.class);
    }

    protected <ENTITY extends ImpasseExecutions> ENTITY doSelectByPKValue(
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
    public ImpasseExecutions selectByPKValueWithDeletedCheck(final Integer id) {
        return doSelectByPKValueWithDeletedCheck(id, ImpasseExecutions.class);
    }

    protected <ENTITY extends ImpasseExecutions> ENTITY doSelectByPKValueWithDeletedCheck(
            final Integer id, final Class<ENTITY> entityType) {
        return doSelectEntityWithDeletedCheck(buildPKCB(id), entityType);
    }

    private ImpasseExecutionsCB buildPKCB(final Integer id) {
        assertObjectNotNull("id", id);
        final ImpasseExecutionsCB cb = newMyConditionBean();
        cb.query().setId_Equal(id);
        return cb;
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * ImpasseExecutionsCB cb = new ImpasseExecutionsCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * ListResultBean&lt;ImpasseExecutions&gt; impasseExecutionsList = impasseExecutionsBhv.<span style="color: #FD4747">selectList</span>(cb);
     * for (ImpasseExecutions impasseExecutions : impasseExecutionsList) {
     *     ... = impasseExecutions.get...();
     * }
     * </pre>
     * @param cb The condition-bean of ImpasseExecutions. (NotNull)
     * @return The result bean of selected list. (NotNull)
     * @exception org.seasar.dbflute.exception.DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<ImpasseExecutions> selectList(
            final ImpasseExecutionsCB cb) {
        return doSelectList(cb, ImpasseExecutions.class);
    }

    protected <ENTITY extends ImpasseExecutions> ListResultBean<ENTITY> doSelectList(
            final ImpasseExecutionsCB cb, final Class<ENTITY> entityType) {
        assertCBStateValid(cb);
        assertObjectNotNull("entityType", entityType);
        assertSpecifyDerivedReferrerEntityProperty(cb, entityType);
        return helpSelectListInternally(cb, entityType,
                new InternalSelectListCallback<ENTITY, ImpasseExecutionsCB>() {
                    @Override
                    public List<ENTITY> callbackSelectList(
                            final ImpasseExecutionsCB cb,
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
     * ImpasseExecutionsCB cb = new ImpasseExecutionsCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #FD4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;ImpasseExecutions&gt; page = impasseExecutionsBhv.<span style="color: #FD4747">selectPage</span>(cb);
     * int allRecordCount = page.getAllRecordCount();
     * int allPageCount = page.getAllPageCount();
     * boolean isExistPrePage = page.isExistPrePage();
     * boolean isExistNextPage = page.isExistNextPage();
     * ...
     * for (ImpasseExecutions impasseExecutions : page) {
     *     ... = impasseExecutions.get...();
     * }
     * </pre>
     * @param cb The condition-bean of ImpasseExecutions. (NotNull)
     * @return The result bean of selected page. (NotNull)
     * @exception org.seasar.dbflute.exception.DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<ImpasseExecutions> selectPage(
            final ImpasseExecutionsCB cb) {
        return doSelectPage(cb, ImpasseExecutions.class);
    }

    protected <ENTITY extends ImpasseExecutions> PagingResultBean<ENTITY> doSelectPage(
            final ImpasseExecutionsCB cb, final Class<ENTITY> entityType) {
        assertCBStateValid(cb);
        assertObjectNotNull("entityType", entityType);
        return helpSelectPageInternally(cb, entityType,
                new InternalSelectPageCallback<ENTITY, ImpasseExecutionsCB>() {
                    @Override
                    public int callbackSelectCount(final ImpasseExecutionsCB cb) {
                        return doSelectCountPlainly(cb);
                    }

                    @Override
                    public List<ENTITY> callbackSelectList(
                            final ImpasseExecutionsCB cb,
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
     * impasseExecutionsBhv.<span style="color: #FD4747">scalarSelect</span>(Date.class).max(new ScalarQuery() {
     *     public void query(ImpasseExecutionsCB cb) {
     *         cb.specify().<span style="color: #FD4747">columnFooDatetime()</span>; <span style="color: #3F7E5E">// required for a function</span>
     *         cb.query().setBarName_PrefixSearch("S");
     *     }
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar value derived by a function. (NullAllowed)
     */
    public <RESULT> SLFunction<ImpasseExecutionsCB, RESULT> scalarSelect(
            final Class<RESULT> resultType) {
        return doScalarSelect(resultType, newMyConditionBean());
    }

    protected <RESULT, CB extends ImpasseExecutionsCB> SLFunction<CB, RESULT> doScalarSelect(
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
     * @param impasseExecutionsList The list of impasseExecutions. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Integer> extractIdList(
            final List<ImpasseExecutions> impasseExecutionsList) {
        return helpExtractListInternally(impasseExecutionsList,
                new InternalExtractCallback<ImpasseExecutions, Integer>() {
                    @Override
                    public Integer getCV(final ImpasseExecutions e) {
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
     * ImpasseExecutions impasseExecutions = new ImpasseExecutions();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * impasseExecutions.setFoo...(value);
     * impasseExecutions.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//impasseExecutions.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//impasseExecutions.set...;</span>
     * impasseExecutionsBhv.<span style="color: #FD4747">insert</span>(impasseExecutions);
     * ... = impasseExecutions.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param impasseExecutions The entity of insert target. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(final ImpasseExecutions impasseExecutions) {
        doInsert(impasseExecutions, null);
    }

    protected void doInsert(final ImpasseExecutions impasseExecutions,
            final InsertOption<ImpasseExecutionsCB> option) {
        assertObjectNotNull("impasseExecutions", impasseExecutions);
        prepareInsertOption(option);
        delegateInsert(impasseExecutions, option);
    }

    protected void prepareInsertOption(
            final InsertOption<ImpasseExecutionsCB> option) {
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
     * ImpasseExecutions impasseExecutions = new ImpasseExecutions();
     * impasseExecutions.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * impasseExecutions.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//impasseExecutions.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//impasseExecutions.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * impasseExecutions.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     impasseExecutionsBhv.<span style="color: #FD4747">update</span>(impasseExecutions);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * } 
     * </pre>
     * @param impasseExecutions The entity of update target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(final ImpasseExecutions impasseExecutions) {
        doUpdate(impasseExecutions, null);
    }

    protected void doUpdate(final ImpasseExecutions impasseExecutions,
            final UpdateOption<ImpasseExecutionsCB> option) {
        assertObjectNotNull("impasseExecutions", impasseExecutions);
        prepareUpdateOption(option);
        helpUpdateInternally(impasseExecutions,
                new InternalUpdateCallback<ImpasseExecutions>() {
                    @Override
                    public int callbackDelegateUpdate(
                            final ImpasseExecutions entity) {
                        return delegateUpdate(entity, option);
                    }
                });
    }

    protected void prepareUpdateOption(
            final UpdateOption<ImpasseExecutionsCB> option) {
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

    protected ImpasseExecutionsCB createCBForVaryingUpdate() {
        final ImpasseExecutionsCB cb = newMyConditionBean();
        cb.xsetupForVaryingUpdate();
        return cb;
    }

    protected ImpasseExecutionsCB createCBForSpecifiedUpdate() {
        final ImpasseExecutionsCB cb = newMyConditionBean();
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
     * @param impasseExecutions The entity of insert or update target. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(final ImpasseExecutions impasseExecutions) {
        doInesrtOrUpdate(impasseExecutions, null, null);
    }

    protected void doInesrtOrUpdate(final ImpasseExecutions impasseExecutions,
            final InsertOption<ImpasseExecutionsCB> insertOption,
            final UpdateOption<ImpasseExecutionsCB> updateOption) {
        helpInsertOrUpdateInternally(
                impasseExecutions,
                new InternalInsertOrUpdateCallback<ImpasseExecutions, ImpasseExecutionsCB>() {
                    @Override
                    public void callbackInsert(final ImpasseExecutions entity) {
                        doInsert(entity, insertOption);
                    }

                    @Override
                    public void callbackUpdate(final ImpasseExecutions entity) {
                        doUpdate(entity, updateOption);
                    }

                    @Override
                    public ImpasseExecutionsCB callbackNewMyConditionBean() {
                        return newMyConditionBean();
                    }

                    @Override
                    public int callbackSelectCount(final ImpasseExecutionsCB cb) {
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
            insertOption = insertOption == null ? new InsertOption<ImpasseExecutionsCB>()
                    : insertOption;
            updateOption = updateOption == null ? new UpdateOption<ImpasseExecutionsCB>()
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
     * ImpasseExecutions impasseExecutions = new ImpasseExecutions();
     * impasseExecutions.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * impasseExecutions.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     impasseExecutionsBhv.<span style="color: #FD4747">delete</span>(impasseExecutions);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * } 
     * </pre>
     * @param impasseExecutions The entity of delete target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(final ImpasseExecutions impasseExecutions) {
        doDelete(impasseExecutions, null);
    }

    protected void doDelete(final ImpasseExecutions impasseExecutions,
            final DeleteOption<ImpasseExecutionsCB> option) {
        assertObjectNotNull("impasseExecutions", impasseExecutions);
        prepareDeleteOption(option);
        helpDeleteInternally(impasseExecutions,
                new InternalDeleteCallback<ImpasseExecutions>() {
                    @Override
                    public int callbackDelegateDelete(
                            final ImpasseExecutions entity) {
                        return delegateDelete(entity, option);
                    }
                });
    }

    protected void prepareDeleteOption(
            final DeleteOption<ImpasseExecutionsCB> option) {
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
     * @param impasseExecutionsList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(final List<ImpasseExecutions> impasseExecutionsList) {
        return doBatchInsert(impasseExecutionsList, null);
    }

    protected int[] doBatchInsert(
            final List<ImpasseExecutions> impasseExecutionsList,
            final InsertOption<ImpasseExecutionsCB> option) {
        assertObjectNotNull("impasseExecutionsList", impasseExecutionsList);
        prepareInsertOption(option);
        return delegateBatchInsert(impasseExecutionsList, option);
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
     * impasseExecutionsBhv.<span style="color: #FD4747">batchUpdate</span>(impasseExecutionsList, new SpecifyQuery<ImpasseExecutionsCB>() {
     *     public void specify(ImpasseExecutionsCB cb) { <span style="color: #3F7E5E">// FOO_STATUS_CODE, BAR_DATE only updated</span>
     *         cb.specify().columnFooStatusCode();
     *         cb.specify().columnBarDate();
     *     }
     * });
     * </pre>
     * @param impasseExecutionsList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(final List<ImpasseExecutions> impasseExecutionsList) {
        return doBatchUpdate(impasseExecutionsList, null);
    }

    protected int[] doBatchUpdate(
            final List<ImpasseExecutions> impasseExecutionsList,
            final UpdateOption<ImpasseExecutionsCB> option) {
        assertObjectNotNull("impasseExecutionsList", impasseExecutionsList);
        prepareUpdateOption(option);
        return delegateBatchUpdate(impasseExecutionsList, option);
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
     * impasseExecutionsBhv.<span style="color: #FD4747">batchUpdate</span>(impasseExecutionsList, new SpecifyQuery<ImpasseExecutionsCB>() {
     *     public void specify(ImpasseExecutionsCB cb) { <span style="color: #3F7E5E">// FOO_STATUS_CODE, BAR_DATE only updated</span>
     *         cb.specify().columnFooStatusCode();
     *         cb.specify().columnBarDate();
     *     }
     * });
     * </pre>
     * @param impasseExecutionsList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param updateColumnSpec The specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(
            final List<ImpasseExecutions> impasseExecutionsList,
            final SpecifyQuery<ImpasseExecutionsCB> updateColumnSpec) {
        return doBatchUpdate(impasseExecutionsList,
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
     * @param impasseExecutionsList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDelete(final List<ImpasseExecutions> impasseExecutionsList) {
        return doBatchDelete(impasseExecutionsList, null);
    }

    protected int[] doBatchDelete(
            final List<ImpasseExecutions> impasseExecutionsList,
            final DeleteOption<ImpasseExecutionsCB> option) {
        assertObjectNotNull("impasseExecutionsList", impasseExecutionsList);
        prepareDeleteOption(option);
        return delegateBatchDelete(impasseExecutionsList, option);
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
     * impasseExecutionsBhv.<span style="color: #FD4747">queryInsert</span>(new QueryInsertSetupper&lt;ImpasseExecutions, ImpasseExecutionsCB&gt;() {
     *     public ConditionBean setup(impasseExecutions entity, ImpasseExecutionsCB intoCB) {
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
            final QueryInsertSetupper<ImpasseExecutions, ImpasseExecutionsCB> setupper) {
        return doQueryInsert(setupper, null);
    }

    protected int doQueryInsert(
            final QueryInsertSetupper<ImpasseExecutions, ImpasseExecutionsCB> setupper,
            final InsertOption<ImpasseExecutionsCB> option) {
        assertObjectNotNull("setupper", setupper);
        prepareInsertOption(option);
        final ImpasseExecutions entity = new ImpasseExecutions();
        final ImpasseExecutionsCB intoCB = createCBForQueryInsert();
        final ConditionBean resourceCB = setupper.setup(entity, intoCB);
        return delegateQueryInsert(entity, intoCB, resourceCB, option);
    }

    protected ImpasseExecutionsCB createCBForQueryInsert() {
        final ImpasseExecutionsCB cb = newMyConditionBean();
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
     * ImpasseExecutions impasseExecutions = new ImpasseExecutions();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//impasseExecutions.setPK...(value);</span>
     * impasseExecutions.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//impasseExecutions.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//impasseExecutions.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//impasseExecutions.setVersionNo(value);</span>
     * ImpasseExecutionsCB cb = new ImpasseExecutionsCB();
     * cb.query().setFoo...(value);
     * impasseExecutionsBhv.<span style="color: #FD4747">queryUpdate</span>(impasseExecutions, cb);
     * </pre>
     * @param impasseExecutions The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of ImpasseExecutions. (NotNull)
     * @return The updated count.
     * @exception org.seasar.dbflute.exception.NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(final ImpasseExecutions impasseExecutions,
            final ImpasseExecutionsCB cb) {
        return doQueryUpdate(impasseExecutions, cb, null);
    }

    protected int doQueryUpdate(final ImpasseExecutions impasseExecutions,
            final ImpasseExecutionsCB cb,
            final UpdateOption<ImpasseExecutionsCB> option) {
        assertObjectNotNull("impasseExecutions", impasseExecutions);
        assertCBStateValid(cb);
        prepareUpdateOption(option);
        return delegateQueryUpdate(impasseExecutions, cb, option);
    }

    @Override
    protected int doRangeModify(final Entity entity, final ConditionBean cb,
            final UpdateOption<? extends ConditionBean> option) {
        if (option == null) {
            return queryUpdate(downcast(entity), (ImpasseExecutionsCB) cb);
        } else {
            return varyingQueryUpdate(downcast(entity),
                    (ImpasseExecutionsCB) cb, downcast(option));
        }
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * ImpasseExecutionsCB cb = new ImpasseExecutionsCB();
     * cb.query().setFoo...(value);
     * impasseExecutionsBhv.<span style="color: #FD4747">queryDelete</span>(impasseExecutions, cb);
     * </pre>
     * @param cb The condition-bean of ImpasseExecutions. (NotNull)
     * @return The deleted count.
     * @exception org.seasar.dbflute.exception.NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(final ImpasseExecutionsCB cb) {
        return doQueryDelete(cb, null);
    }

    protected int doQueryDelete(final ImpasseExecutionsCB cb,
            final DeleteOption<ImpasseExecutionsCB> option) {
        assertCBStateValid(cb);
        prepareDeleteOption(option);
        return delegateQueryDelete(cb, option);
    }

    @Override
    protected int doRangeRemove(final ConditionBean cb,
            final DeleteOption<? extends ConditionBean> option) {
        if (option == null) {
            return queryDelete((ImpasseExecutionsCB) cb);
        } else {
            return varyingQueryDelete((ImpasseExecutionsCB) cb,
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
     * ImpasseExecutions impasseExecutions = new ImpasseExecutions();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * impasseExecutions.setFoo...(value);
     * impasseExecutions.setBar...(value);
     * InsertOption<ImpasseExecutionsCB> option = new InsertOption<ImpasseExecutionsCB>();
     * <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     * option.disableCommonColumnAutoSetup();
     * impasseExecutionsBhv.<span style="color: #FD4747">varyingInsert</span>(impasseExecutions, option);
     * ... = impasseExecutions.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param impasseExecutions The entity of insert target. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param option The option of insert for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(final ImpasseExecutions impasseExecutions,
            final InsertOption<ImpasseExecutionsCB> option) {
        assertInsertOptionNotNull(option);
        doInsert(impasseExecutions, option);
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, NonExclusiveControl) <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br />
     * Other specifications are same as update(entity).
     * <pre>
     * ImpasseExecutions impasseExecutions = new ImpasseExecutions();
     * impasseExecutions.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * impasseExecutions.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * impasseExecutions.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     <span style="color: #3F7E5E">// you can update by self calculation values</span>
     *     UpdateOption&lt;ImpasseExecutionsCB&gt; option = new UpdateOption&lt;ImpasseExecutionsCB&gt;();
     *     option.self(new SpecifyQuery&lt;ImpasseExecutionsCB&gt;() {
     *         public void specify(ImpasseExecutionsCB cb) {
     *             cb.specify().<span style="color: #FD4747">columnXxxCount()</span>;
     *         }
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     *     impasseExecutionsBhv.<span style="color: #FD4747">varyingUpdate</span>(impasseExecutions, option);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param impasseExecutions The entity of update target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @param option The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(final ImpasseExecutions impasseExecutions,
            final UpdateOption<ImpasseExecutionsCB> option) {
        assertUpdateOptionNotNull(option);
        doUpdate(impasseExecutions, option);
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br />
     * Other specifications are same as insertOrUpdate(entity).
     * @param impasseExecutions The entity of insert or update target. (NotNull)
     * @param insertOption The option of insert for varying requests. (NotNull)
     * @param updateOption The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(
            final ImpasseExecutions impasseExecutions,
            final InsertOption<ImpasseExecutionsCB> insertOption,
            final UpdateOption<ImpasseExecutionsCB> updateOption) {
        assertInsertOptionNotNull(insertOption);
        assertUpdateOptionNotNull(updateOption);
        doInesrtOrUpdate(impasseExecutions, insertOption, updateOption);
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, NonExclusiveControl) <br />
     * Now a valid option does not exist. <br />
     * Other specifications are same as delete(entity).
     * @param impasseExecutions The entity of delete target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @param option The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(final ImpasseExecutions impasseExecutions,
            final DeleteOption<ImpasseExecutionsCB> option) {
        assertDeleteOptionNotNull(option);
        doDelete(impasseExecutions, option);
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br />
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br />
     * Other specifications are same as batchInsert(entityList).
     * @param impasseExecutionsList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(
            final List<ImpasseExecutions> impasseExecutionsList,
            final InsertOption<ImpasseExecutionsCB> option) {
        assertInsertOptionNotNull(option);
        return doBatchInsert(impasseExecutionsList, option);
    }

    /**
     * Batch-update the list with varying requests. <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br />
     * Other specifications are same as batchUpdate(entityList).
     * @param impasseExecutionsList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(
            final List<ImpasseExecutions> impasseExecutionsList,
            final UpdateOption<ImpasseExecutionsCB> option) {
        assertUpdateOptionNotNull(option);
        return doBatchUpdate(impasseExecutionsList, option);
    }

    /**
     * Batch-delete the list with varying requests. <br />
     * For example, limitBatchDeleteLogging(). <br />
     * Other specifications are same as batchDelete(entityList).
     * @param impasseExecutionsList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(
            final List<ImpasseExecutions> impasseExecutionsList,
            final DeleteOption<ImpasseExecutionsCB> option) {
        assertDeleteOptionNotNull(option);
        return doBatchDelete(impasseExecutionsList, option);
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
            final QueryInsertSetupper<ImpasseExecutions, ImpasseExecutionsCB> setupper,
            final InsertOption<ImpasseExecutionsCB> option) {
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
     * ImpasseExecutions impasseExecutions = new ImpasseExecutions();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//impasseExecutions.setPK...(value);</span>
     * impasseExecutions.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//impasseExecutions.setVersionNo(value);</span>
     * ImpasseExecutionsCB cb = new ImpasseExecutionsCB();
     * cb.query().setFoo...(value);
     * UpdateOption&lt;ImpasseExecutionsCB&gt; option = new UpdateOption&lt;ImpasseExecutionsCB&gt;();
     * option.self(new SpecifyQuery&lt;ImpasseExecutionsCB&gt;() {
     *     public void specify(ImpasseExecutionsCB cb) {
     *         cb.specify().<span style="color: #FD4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * impasseExecutionsBhv.<span style="color: #FD4747">varyingQueryUpdate</span>(impasseExecutions, cb, option);
     * </pre>
     * @param impasseExecutions The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of ImpasseExecutions. (NotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The updated count.
     * @exception org.seasar.dbflute.exception.NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(final ImpasseExecutions impasseExecutions,
            final ImpasseExecutionsCB cb,
            final UpdateOption<ImpasseExecutionsCB> option) {
        assertUpdateOptionNotNull(option);
        return doQueryUpdate(impasseExecutions, cb, option);
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br />
     * For example, allowNonQueryDelete(). <br />
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param cb The condition-bean of ImpasseExecutions. (NotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @exception org.seasar.dbflute.exception.NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(final ImpasseExecutionsCB cb,
            final DeleteOption<ImpasseExecutionsCB> option) {
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
    public OutsideSqlBasicExecutor<ImpasseExecutionsBhv> outsideSql() {
        return doOutsideSql();
    }

    // ===================================================================================
    //                                                                     Delegate Method
    //                                                                     ===============
    // [Behavior Command]
    // -----------------------------------------------------
    //                                                Select
    //                                                ------
    protected int delegateSelectCountUniquely(final ImpasseExecutionsCB cb) {
        return invoke(createSelectCountCBCommand(cb, true));
    }

    protected int delegateSelectCountPlainly(final ImpasseExecutionsCB cb) {
        return invoke(createSelectCountCBCommand(cb, false));
    }

    protected <ENTITY extends ImpasseExecutions> void delegateSelectCursor(
            final ImpasseExecutionsCB cb, final EntityRowHandler<ENTITY> erh,
            final Class<ENTITY> et) {
        invoke(createSelectCursorCBCommand(cb, erh, et));
    }

    protected <ENTITY extends ImpasseExecutions> List<ENTITY> delegateSelectList(
            final ImpasseExecutionsCB cb, final Class<ENTITY> et) {
        return invoke(createSelectListCBCommand(cb, et));
    }

    // -----------------------------------------------------
    //                                                Update
    //                                                ------
    protected int delegateInsert(final ImpasseExecutions e,
            final InsertOption<ImpasseExecutionsCB> op) {
        if (!processBeforeInsert(e, op)) {
            return 0;
        }
        return invoke(createInsertEntityCommand(e, op));
    }

    protected int delegateUpdate(final ImpasseExecutions e,
            final UpdateOption<ImpasseExecutionsCB> op) {
        if (!processBeforeUpdate(e, op)) {
            return 0;
        }
        return delegateUpdateNonstrict(e, op);
    }

    protected int delegateUpdateNonstrict(final ImpasseExecutions e,
            final UpdateOption<ImpasseExecutionsCB> op) {
        if (!processBeforeUpdate(e, op)) {
            return 0;
        }
        return invoke(createUpdateNonstrictEntityCommand(e, op));
    }

    protected int delegateDelete(final ImpasseExecutions e,
            final DeleteOption<ImpasseExecutionsCB> op) {
        if (!processBeforeDelete(e, op)) {
            return 0;
        }
        return delegateDeleteNonstrict(e, op);
    }

    protected int delegateDeleteNonstrict(final ImpasseExecutions e,
            final DeleteOption<ImpasseExecutionsCB> op) {
        if (!processBeforeDelete(e, op)) {
            return 0;
        }
        return invoke(createDeleteNonstrictEntityCommand(e, op));
    }

    protected int[] delegateBatchInsert(final List<ImpasseExecutions> ls,
            final InsertOption<ImpasseExecutionsCB> op) {
        if (ls.isEmpty()) {
            return new int[] {};
        }
        return invoke(createBatchInsertCommand(processBatchInternally(ls, op),
                op));
    }

    protected int[] delegateBatchUpdate(final List<ImpasseExecutions> ls,
            final UpdateOption<ImpasseExecutionsCB> op) {
        if (ls.isEmpty()) {
            return new int[] {};
        }
        return delegateBatchUpdateNonstrict(ls, op);
    }

    protected int[] delegateBatchUpdateNonstrict(
            final List<ImpasseExecutions> ls,
            final UpdateOption<ImpasseExecutionsCB> op) {
        if (ls.isEmpty()) {
            return new int[] {};
        }
        return invoke(createBatchUpdateNonstrictCommand(
                processBatchInternally(ls, op, true), op));
    }

    protected int[] delegateBatchDelete(final List<ImpasseExecutions> ls,
            final DeleteOption<ImpasseExecutionsCB> op) {
        if (ls.isEmpty()) {
            return new int[] {};
        }
        return delegateBatchDeleteNonstrict(ls, op);
    }

    protected int[] delegateBatchDeleteNonstrict(
            final List<ImpasseExecutions> ls,
            final DeleteOption<ImpasseExecutionsCB> op) {
        if (ls.isEmpty()) {
            return new int[] {};
        }
        return invoke(createBatchDeleteNonstrictCommand(
                processBatchInternally(ls, op, true), op));
    }

    protected int delegateQueryInsert(final ImpasseExecutions e,
            final ImpasseExecutionsCB inCB, final ConditionBean resCB,
            final InsertOption<ImpasseExecutionsCB> op) {
        if (!processBeforeQueryInsert(e, inCB, resCB, op)) {
            return 0;
        }
        return invoke(createQueryInsertCBCommand(e, inCB, resCB, op));
    }

    protected int delegateQueryUpdate(final ImpasseExecutions e,
            final ImpasseExecutionsCB cb,
            final UpdateOption<ImpasseExecutionsCB> op) {
        if (!processBeforeQueryUpdate(e, cb, op)) {
            return 0;
        }
        return invoke(createQueryUpdateCBCommand(e, cb, op));
    }

    protected int delegateQueryDelete(final ImpasseExecutionsCB cb,
            final DeleteOption<ImpasseExecutionsCB> op) {
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
    protected ImpasseExecutions downcast(final Entity entity) {
        return helpEntityDowncastInternally(entity, ImpasseExecutions.class);
    }

    protected ImpasseExecutionsCB downcast(final ConditionBean cb) {
        return helpConditionBeanDowncastInternally(cb,
                ImpasseExecutionsCB.class);
    }

    @SuppressWarnings("unchecked")
    protected List<ImpasseExecutions> downcast(
            final List<? extends Entity> entityList) {
        return (List<ImpasseExecutions>) entityList;
    }

    @SuppressWarnings("unchecked")
    protected InsertOption<ImpasseExecutionsCB> downcast(
            final InsertOption<? extends ConditionBean> option) {
        return (InsertOption<ImpasseExecutionsCB>) option;
    }

    @SuppressWarnings("unchecked")
    protected UpdateOption<ImpasseExecutionsCB> downcast(
            final UpdateOption<? extends ConditionBean> option) {
        return (UpdateOption<ImpasseExecutionsCB>) option;
    }

    @SuppressWarnings("unchecked")
    protected DeleteOption<ImpasseExecutionsCB> downcast(
            final DeleteOption<? extends ConditionBean> option) {
        return (DeleteOption<ImpasseExecutionsCB>) option;
    }

    @SuppressWarnings("unchecked")
    protected QueryInsertSetupper<ImpasseExecutions, ImpasseExecutionsCB> downcast(
            final QueryInsertSetupper<? extends Entity, ? extends ConditionBean> option) {
        return (QueryInsertSetupper<ImpasseExecutions, ImpasseExecutionsCB>) option;
    }
}
