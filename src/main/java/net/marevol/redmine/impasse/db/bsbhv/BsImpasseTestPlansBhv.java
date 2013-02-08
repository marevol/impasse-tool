package net.marevol.redmine.impasse.db.bsbhv;

import java.util.List;

import net.marevol.redmine.impasse.db.bsentity.dbmeta.ImpasseTestPlansDbm;
import net.marevol.redmine.impasse.db.cbean.ImpasseTestPlansCB;
import net.marevol.redmine.impasse.db.exbhv.ImpasseTestPlansBhv;
import net.marevol.redmine.impasse.db.exentity.ImpasseTestPlans;

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
 * The behavior of impasse_test_plans as TABLE. <br />
 * <pre>
 * [primary key]
 *     id
 * 
 * [column]
 *     id, version_id, name, notes, active
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
public abstract class BsImpasseTestPlansBhv extends AbstractBehaviorWritable {

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
        return "impasse_test_plans";
    }

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** @return The instance of DBMeta. (NotNull) */
    @Override
    public DBMeta getDBMeta() {
        return ImpasseTestPlansDbm.getInstance();
    }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public ImpasseTestPlansDbm getMyDBMeta() {
        return ImpasseTestPlansDbm.getInstance();
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
    public ImpasseTestPlans newMyEntity() {
        return new ImpasseTestPlans();
    }

    /** @return The instance of new condition-bean as my table type. (NotNull) */
    public ImpasseTestPlansCB newMyConditionBean() {
        return new ImpasseTestPlansCB();
    }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br />
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * ImpasseTestPlansCB cb = new ImpasseTestPlansCB();
     * cb.query().setFoo...(value);
     * int count = impasseTestPlansBhv.<span style="color: #FD4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of ImpasseTestPlans. (NotNull)
     * @return The selected count.
     */
    public int selectCount(final ImpasseTestPlansCB cb) {
        return doSelectCountUniquely(cb);
    }

    protected int doSelectCountUniquely(final ImpasseTestPlansCB cb) { // called by selectCount(cb) 
        assertCBStateValid(cb);
        return delegateSelectCountUniquely(cb);
    }

    protected int doSelectCountPlainly(final ImpasseTestPlansCB cb) { // called by selectPage(cb)
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
     * ImpasseTestPlansCB cb = new ImpasseTestPlansCB();
     * cb.query().setFoo...(value);
     * impasseTestPlansBhv.<span style="color: #FD4747">selectCursor</span>(cb, new EntityRowHandler&lt;ImpasseTestPlans&gt;() {
     *     public void handle(ImpasseTestPlans entity) {
     *         ... = entity.getFoo...();
     *     }
     * });
     * </pre>
     * @param cb The condition-bean of ImpasseTestPlans. (NotNull)
     * @param entityRowHandler The handler of entity row of ImpasseTestPlans. (NotNull)
     */
    public void selectCursor(final ImpasseTestPlansCB cb,
            final EntityRowHandler<ImpasseTestPlans> entityRowHandler) {
        doSelectCursor(cb, entityRowHandler, ImpasseTestPlans.class);
    }

    protected <ENTITY extends ImpasseTestPlans> void doSelectCursor(
            final ImpasseTestPlansCB cb,
            final EntityRowHandler<ENTITY> entityRowHandler,
            final Class<ENTITY> entityType) {
        assertCBStateValid(cb);
        assertObjectNotNull("entityRowHandler<ImpasseTestPlans>",
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
     * ImpasseTestPlansCB cb = new ImpasseTestPlansCB();
     * cb.query().setFoo...(value);
     * ImpasseTestPlans impasseTestPlans = impasseTestPlansBhv.<span style="color: #FD4747">selectEntity</span>(cb);
     * if (impasseTestPlans != null) {
     *     ... = impasseTestPlans.get...();
     * } else {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of ImpasseTestPlans. (NotNull)
     * @return The selected entity. (NullAllowed: If the condition has no data, it returns null)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public ImpasseTestPlans selectEntity(final ImpasseTestPlansCB cb) {
        return doSelectEntity(cb, ImpasseTestPlans.class);
    }

    protected <ENTITY extends ImpasseTestPlans> ENTITY doSelectEntity(
            final ImpasseTestPlansCB cb, final Class<ENTITY> entityType) {
        assertCBStateValid(cb);
        return helpSelectEntityInternally(cb,
                new InternalSelectEntityCallback<ENTITY, ImpasseTestPlansCB>() {
                    @Override
                    public List<ENTITY> callbackSelectList(
                            final ImpasseTestPlansCB cb) {
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
     * ImpasseTestPlansCB cb = new ImpasseTestPlansCB();
     * cb.query().setFoo...(value);
     * ImpasseTestPlans impasseTestPlans = impasseTestPlansBhv.<span style="color: #FD4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = impasseTestPlans.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of ImpasseTestPlans. (NotNull)
     * @return The selected entity. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public ImpasseTestPlans selectEntityWithDeletedCheck(
            final ImpasseTestPlansCB cb) {
        return doSelectEntityWithDeletedCheck(cb, ImpasseTestPlans.class);
    }

    protected <ENTITY extends ImpasseTestPlans> ENTITY doSelectEntityWithDeletedCheck(
            final ImpasseTestPlansCB cb, final Class<ENTITY> entityType) {
        assertCBStateValid(cb);
        return helpSelectEntityWithDeletedCheckInternally(
                cb,
                new InternalSelectEntityWithDeletedCheckCallback<ENTITY, ImpasseTestPlansCB>() {
                    @Override
                    public List<ENTITY> callbackSelectList(
                            final ImpasseTestPlansCB cb) {
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
    public ImpasseTestPlans selectByPKValue(final Integer id) {
        return doSelectByPKValue(id, ImpasseTestPlans.class);
    }

    protected <ENTITY extends ImpasseTestPlans> ENTITY doSelectByPKValue(
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
    public ImpasseTestPlans selectByPKValueWithDeletedCheck(final Integer id) {
        return doSelectByPKValueWithDeletedCheck(id, ImpasseTestPlans.class);
    }

    protected <ENTITY extends ImpasseTestPlans> ENTITY doSelectByPKValueWithDeletedCheck(
            final Integer id, final Class<ENTITY> entityType) {
        return doSelectEntityWithDeletedCheck(buildPKCB(id), entityType);
    }

    private ImpasseTestPlansCB buildPKCB(final Integer id) {
        assertObjectNotNull("id", id);
        final ImpasseTestPlansCB cb = newMyConditionBean();
        cb.query().setId_Equal(id);
        return cb;
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * ImpasseTestPlansCB cb = new ImpasseTestPlansCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * ListResultBean&lt;ImpasseTestPlans&gt; impasseTestPlansList = impasseTestPlansBhv.<span style="color: #FD4747">selectList</span>(cb);
     * for (ImpasseTestPlans impasseTestPlans : impasseTestPlansList) {
     *     ... = impasseTestPlans.get...();
     * }
     * </pre>
     * @param cb The condition-bean of ImpasseTestPlans. (NotNull)
     * @return The result bean of selected list. (NotNull)
     * @exception org.seasar.dbflute.exception.DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<ImpasseTestPlans> selectList(
            final ImpasseTestPlansCB cb) {
        return doSelectList(cb, ImpasseTestPlans.class);
    }

    protected <ENTITY extends ImpasseTestPlans> ListResultBean<ENTITY> doSelectList(
            final ImpasseTestPlansCB cb, final Class<ENTITY> entityType) {
        assertCBStateValid(cb);
        assertObjectNotNull("entityType", entityType);
        assertSpecifyDerivedReferrerEntityProperty(cb, entityType);
        return helpSelectListInternally(cb, entityType,
                new InternalSelectListCallback<ENTITY, ImpasseTestPlansCB>() {
                    @Override
                    public List<ENTITY> callbackSelectList(
                            final ImpasseTestPlansCB cb,
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
     * ImpasseTestPlansCB cb = new ImpasseTestPlansCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #FD4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;ImpasseTestPlans&gt; page = impasseTestPlansBhv.<span style="color: #FD4747">selectPage</span>(cb);
     * int allRecordCount = page.getAllRecordCount();
     * int allPageCount = page.getAllPageCount();
     * boolean isExistPrePage = page.isExistPrePage();
     * boolean isExistNextPage = page.isExistNextPage();
     * ...
     * for (ImpasseTestPlans impasseTestPlans : page) {
     *     ... = impasseTestPlans.get...();
     * }
     * </pre>
     * @param cb The condition-bean of ImpasseTestPlans. (NotNull)
     * @return The result bean of selected page. (NotNull)
     * @exception org.seasar.dbflute.exception.DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<ImpasseTestPlans> selectPage(
            final ImpasseTestPlansCB cb) {
        return doSelectPage(cb, ImpasseTestPlans.class);
    }

    protected <ENTITY extends ImpasseTestPlans> PagingResultBean<ENTITY> doSelectPage(
            final ImpasseTestPlansCB cb, final Class<ENTITY> entityType) {
        assertCBStateValid(cb);
        assertObjectNotNull("entityType", entityType);
        return helpSelectPageInternally(cb, entityType,
                new InternalSelectPageCallback<ENTITY, ImpasseTestPlansCB>() {
                    @Override
                    public int callbackSelectCount(final ImpasseTestPlansCB cb) {
                        return doSelectCountPlainly(cb);
                    }

                    @Override
                    public List<ENTITY> callbackSelectList(
                            final ImpasseTestPlansCB cb,
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
     * impasseTestPlansBhv.<span style="color: #FD4747">scalarSelect</span>(Date.class).max(new ScalarQuery() {
     *     public void query(ImpasseTestPlansCB cb) {
     *         cb.specify().<span style="color: #FD4747">columnFooDatetime()</span>; <span style="color: #3F7E5E">// required for a function</span>
     *         cb.query().setBarName_PrefixSearch("S");
     *     }
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar value derived by a function. (NullAllowed)
     */
    public <RESULT> SLFunction<ImpasseTestPlansCB, RESULT> scalarSelect(
            final Class<RESULT> resultType) {
        return doScalarSelect(resultType, newMyConditionBean());
    }

    protected <RESULT, CB extends ImpasseTestPlansCB> SLFunction<CB, RESULT> doScalarSelect(
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
     * @param impasseTestPlansList The list of impasseTestPlans. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Integer> extractIdList(
            final List<ImpasseTestPlans> impasseTestPlansList) {
        return helpExtractListInternally(impasseTestPlansList,
                new InternalExtractCallback<ImpasseTestPlans, Integer>() {
                    @Override
                    public Integer getCV(final ImpasseTestPlans e) {
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
     * ImpasseTestPlans impasseTestPlans = new ImpasseTestPlans();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * impasseTestPlans.setFoo...(value);
     * impasseTestPlans.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//impasseTestPlans.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//impasseTestPlans.set...;</span>
     * impasseTestPlansBhv.<span style="color: #FD4747">insert</span>(impasseTestPlans);
     * ... = impasseTestPlans.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param impasseTestPlans The entity of insert target. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(final ImpasseTestPlans impasseTestPlans) {
        doInsert(impasseTestPlans, null);
    }

    protected void doInsert(final ImpasseTestPlans impasseTestPlans,
            final InsertOption<ImpasseTestPlansCB> option) {
        assertObjectNotNull("impasseTestPlans", impasseTestPlans);
        prepareInsertOption(option);
        delegateInsert(impasseTestPlans, option);
    }

    protected void prepareInsertOption(
            final InsertOption<ImpasseTestPlansCB> option) {
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
     * ImpasseTestPlans impasseTestPlans = new ImpasseTestPlans();
     * impasseTestPlans.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * impasseTestPlans.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//impasseTestPlans.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//impasseTestPlans.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * impasseTestPlans.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     impasseTestPlansBhv.<span style="color: #FD4747">update</span>(impasseTestPlans);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * } 
     * </pre>
     * @param impasseTestPlans The entity of update target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(final ImpasseTestPlans impasseTestPlans) {
        doUpdate(impasseTestPlans, null);
    }

    protected void doUpdate(final ImpasseTestPlans impasseTestPlans,
            final UpdateOption<ImpasseTestPlansCB> option) {
        assertObjectNotNull("impasseTestPlans", impasseTestPlans);
        prepareUpdateOption(option);
        helpUpdateInternally(impasseTestPlans,
                new InternalUpdateCallback<ImpasseTestPlans>() {
                    @Override
                    public int callbackDelegateUpdate(
                            final ImpasseTestPlans entity) {
                        return delegateUpdate(entity, option);
                    }
                });
    }

    protected void prepareUpdateOption(
            final UpdateOption<ImpasseTestPlansCB> option) {
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

    protected ImpasseTestPlansCB createCBForVaryingUpdate() {
        final ImpasseTestPlansCB cb = newMyConditionBean();
        cb.xsetupForVaryingUpdate();
        return cb;
    }

    protected ImpasseTestPlansCB createCBForSpecifiedUpdate() {
        final ImpasseTestPlansCB cb = newMyConditionBean();
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
     * @param impasseTestPlans The entity of insert or update target. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(final ImpasseTestPlans impasseTestPlans) {
        doInesrtOrUpdate(impasseTestPlans, null, null);
    }

    protected void doInesrtOrUpdate(final ImpasseTestPlans impasseTestPlans,
            final InsertOption<ImpasseTestPlansCB> insertOption,
            final UpdateOption<ImpasseTestPlansCB> updateOption) {
        helpInsertOrUpdateInternally(
                impasseTestPlans,
                new InternalInsertOrUpdateCallback<ImpasseTestPlans, ImpasseTestPlansCB>() {
                    @Override
                    public void callbackInsert(final ImpasseTestPlans entity) {
                        doInsert(entity, insertOption);
                    }

                    @Override
                    public void callbackUpdate(final ImpasseTestPlans entity) {
                        doUpdate(entity, updateOption);
                    }

                    @Override
                    public ImpasseTestPlansCB callbackNewMyConditionBean() {
                        return newMyConditionBean();
                    }

                    @Override
                    public int callbackSelectCount(final ImpasseTestPlansCB cb) {
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
            insertOption = insertOption == null ? new InsertOption<ImpasseTestPlansCB>()
                    : insertOption;
            updateOption = updateOption == null ? new UpdateOption<ImpasseTestPlansCB>()
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
     * ImpasseTestPlans impasseTestPlans = new ImpasseTestPlans();
     * impasseTestPlans.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * impasseTestPlans.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     impasseTestPlansBhv.<span style="color: #FD4747">delete</span>(impasseTestPlans);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * } 
     * </pre>
     * @param impasseTestPlans The entity of delete target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(final ImpasseTestPlans impasseTestPlans) {
        doDelete(impasseTestPlans, null);
    }

    protected void doDelete(final ImpasseTestPlans impasseTestPlans,
            final DeleteOption<ImpasseTestPlansCB> option) {
        assertObjectNotNull("impasseTestPlans", impasseTestPlans);
        prepareDeleteOption(option);
        helpDeleteInternally(impasseTestPlans,
                new InternalDeleteCallback<ImpasseTestPlans>() {
                    @Override
                    public int callbackDelegateDelete(
                            final ImpasseTestPlans entity) {
                        return delegateDelete(entity, option);
                    }
                });
    }

    protected void prepareDeleteOption(
            final DeleteOption<ImpasseTestPlansCB> option) {
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
     * @param impasseTestPlansList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(final List<ImpasseTestPlans> impasseTestPlansList) {
        return doBatchInsert(impasseTestPlansList, null);
    }

    protected int[] doBatchInsert(
            final List<ImpasseTestPlans> impasseTestPlansList,
            final InsertOption<ImpasseTestPlansCB> option) {
        assertObjectNotNull("impasseTestPlansList", impasseTestPlansList);
        prepareInsertOption(option);
        return delegateBatchInsert(impasseTestPlansList, option);
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
     * impasseTestPlansBhv.<span style="color: #FD4747">batchUpdate</span>(impasseTestPlansList, new SpecifyQuery<ImpasseTestPlansCB>() {
     *     public void specify(ImpasseTestPlansCB cb) { <span style="color: #3F7E5E">// FOO_STATUS_CODE, BAR_DATE only updated</span>
     *         cb.specify().columnFooStatusCode();
     *         cb.specify().columnBarDate();
     *     }
     * });
     * </pre>
     * @param impasseTestPlansList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(final List<ImpasseTestPlans> impasseTestPlansList) {
        return doBatchUpdate(impasseTestPlansList, null);
    }

    protected int[] doBatchUpdate(
            final List<ImpasseTestPlans> impasseTestPlansList,
            final UpdateOption<ImpasseTestPlansCB> option) {
        assertObjectNotNull("impasseTestPlansList", impasseTestPlansList);
        prepareUpdateOption(option);
        return delegateBatchUpdate(impasseTestPlansList, option);
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
     * impasseTestPlansBhv.<span style="color: #FD4747">batchUpdate</span>(impasseTestPlansList, new SpecifyQuery<ImpasseTestPlansCB>() {
     *     public void specify(ImpasseTestPlansCB cb) { <span style="color: #3F7E5E">// FOO_STATUS_CODE, BAR_DATE only updated</span>
     *         cb.specify().columnFooStatusCode();
     *         cb.specify().columnBarDate();
     *     }
     * });
     * </pre>
     * @param impasseTestPlansList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param updateColumnSpec The specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(final List<ImpasseTestPlans> impasseTestPlansList,
            final SpecifyQuery<ImpasseTestPlansCB> updateColumnSpec) {
        return doBatchUpdate(impasseTestPlansList,
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
     * @param impasseTestPlansList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDelete(final List<ImpasseTestPlans> impasseTestPlansList) {
        return doBatchDelete(impasseTestPlansList, null);
    }

    protected int[] doBatchDelete(
            final List<ImpasseTestPlans> impasseTestPlansList,
            final DeleteOption<ImpasseTestPlansCB> option) {
        assertObjectNotNull("impasseTestPlansList", impasseTestPlansList);
        prepareDeleteOption(option);
        return delegateBatchDelete(impasseTestPlansList, option);
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
     * impasseTestPlansBhv.<span style="color: #FD4747">queryInsert</span>(new QueryInsertSetupper&lt;ImpasseTestPlans, ImpasseTestPlansCB&gt;() {
     *     public ConditionBean setup(impasseTestPlans entity, ImpasseTestPlansCB intoCB) {
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
            final QueryInsertSetupper<ImpasseTestPlans, ImpasseTestPlansCB> setupper) {
        return doQueryInsert(setupper, null);
    }

    protected int doQueryInsert(
            final QueryInsertSetupper<ImpasseTestPlans, ImpasseTestPlansCB> setupper,
            final InsertOption<ImpasseTestPlansCB> option) {
        assertObjectNotNull("setupper", setupper);
        prepareInsertOption(option);
        final ImpasseTestPlans entity = new ImpasseTestPlans();
        final ImpasseTestPlansCB intoCB = createCBForQueryInsert();
        final ConditionBean resourceCB = setupper.setup(entity, intoCB);
        return delegateQueryInsert(entity, intoCB, resourceCB, option);
    }

    protected ImpasseTestPlansCB createCBForQueryInsert() {
        final ImpasseTestPlansCB cb = newMyConditionBean();
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
     * ImpasseTestPlans impasseTestPlans = new ImpasseTestPlans();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//impasseTestPlans.setPK...(value);</span>
     * impasseTestPlans.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//impasseTestPlans.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//impasseTestPlans.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//impasseTestPlans.setVersionNo(value);</span>
     * ImpasseTestPlansCB cb = new ImpasseTestPlansCB();
     * cb.query().setFoo...(value);
     * impasseTestPlansBhv.<span style="color: #FD4747">queryUpdate</span>(impasseTestPlans, cb);
     * </pre>
     * @param impasseTestPlans The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of ImpasseTestPlans. (NotNull)
     * @return The updated count.
     * @exception org.seasar.dbflute.exception.NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(final ImpasseTestPlans impasseTestPlans,
            final ImpasseTestPlansCB cb) {
        return doQueryUpdate(impasseTestPlans, cb, null);
    }

    protected int doQueryUpdate(final ImpasseTestPlans impasseTestPlans,
            final ImpasseTestPlansCB cb,
            final UpdateOption<ImpasseTestPlansCB> option) {
        assertObjectNotNull("impasseTestPlans", impasseTestPlans);
        assertCBStateValid(cb);
        prepareUpdateOption(option);
        return delegateQueryUpdate(impasseTestPlans, cb, option);
    }

    @Override
    protected int doRangeModify(final Entity entity, final ConditionBean cb,
            final UpdateOption<? extends ConditionBean> option) {
        if (option == null) {
            return queryUpdate(downcast(entity), (ImpasseTestPlansCB) cb);
        } else {
            return varyingQueryUpdate(downcast(entity),
                    (ImpasseTestPlansCB) cb, downcast(option));
        }
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * ImpasseTestPlansCB cb = new ImpasseTestPlansCB();
     * cb.query().setFoo...(value);
     * impasseTestPlansBhv.<span style="color: #FD4747">queryDelete</span>(impasseTestPlans, cb);
     * </pre>
     * @param cb The condition-bean of ImpasseTestPlans. (NotNull)
     * @return The deleted count.
     * @exception org.seasar.dbflute.exception.NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(final ImpasseTestPlansCB cb) {
        return doQueryDelete(cb, null);
    }

    protected int doQueryDelete(final ImpasseTestPlansCB cb,
            final DeleteOption<ImpasseTestPlansCB> option) {
        assertCBStateValid(cb);
        prepareDeleteOption(option);
        return delegateQueryDelete(cb, option);
    }

    @Override
    protected int doRangeRemove(final ConditionBean cb,
            final DeleteOption<? extends ConditionBean> option) {
        if (option == null) {
            return queryDelete((ImpasseTestPlansCB) cb);
        } else {
            return varyingQueryDelete((ImpasseTestPlansCB) cb, downcast(option));
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
     * ImpasseTestPlans impasseTestPlans = new ImpasseTestPlans();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * impasseTestPlans.setFoo...(value);
     * impasseTestPlans.setBar...(value);
     * InsertOption<ImpasseTestPlansCB> option = new InsertOption<ImpasseTestPlansCB>();
     * <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     * option.disableCommonColumnAutoSetup();
     * impasseTestPlansBhv.<span style="color: #FD4747">varyingInsert</span>(impasseTestPlans, option);
     * ... = impasseTestPlans.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param impasseTestPlans The entity of insert target. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param option The option of insert for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(final ImpasseTestPlans impasseTestPlans,
            final InsertOption<ImpasseTestPlansCB> option) {
        assertInsertOptionNotNull(option);
        doInsert(impasseTestPlans, option);
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, NonExclusiveControl) <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br />
     * Other specifications are same as update(entity).
     * <pre>
     * ImpasseTestPlans impasseTestPlans = new ImpasseTestPlans();
     * impasseTestPlans.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * impasseTestPlans.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * impasseTestPlans.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     <span style="color: #3F7E5E">// you can update by self calculation values</span>
     *     UpdateOption&lt;ImpasseTestPlansCB&gt; option = new UpdateOption&lt;ImpasseTestPlansCB&gt;();
     *     option.self(new SpecifyQuery&lt;ImpasseTestPlansCB&gt;() {
     *         public void specify(ImpasseTestPlansCB cb) {
     *             cb.specify().<span style="color: #FD4747">columnXxxCount()</span>;
     *         }
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     *     impasseTestPlansBhv.<span style="color: #FD4747">varyingUpdate</span>(impasseTestPlans, option);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param impasseTestPlans The entity of update target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @param option The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(final ImpasseTestPlans impasseTestPlans,
            final UpdateOption<ImpasseTestPlansCB> option) {
        assertUpdateOptionNotNull(option);
        doUpdate(impasseTestPlans, option);
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br />
     * Other specifications are same as insertOrUpdate(entity).
     * @param impasseTestPlans The entity of insert or update target. (NotNull)
     * @param insertOption The option of insert for varying requests. (NotNull)
     * @param updateOption The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(final ImpasseTestPlans impasseTestPlans,
            final InsertOption<ImpasseTestPlansCB> insertOption,
            final UpdateOption<ImpasseTestPlansCB> updateOption) {
        assertInsertOptionNotNull(insertOption);
        assertUpdateOptionNotNull(updateOption);
        doInesrtOrUpdate(impasseTestPlans, insertOption, updateOption);
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, NonExclusiveControl) <br />
     * Now a valid option does not exist. <br />
     * Other specifications are same as delete(entity).
     * @param impasseTestPlans The entity of delete target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @param option The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(final ImpasseTestPlans impasseTestPlans,
            final DeleteOption<ImpasseTestPlansCB> option) {
        assertDeleteOptionNotNull(option);
        doDelete(impasseTestPlans, option);
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br />
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br />
     * Other specifications are same as batchInsert(entityList).
     * @param impasseTestPlansList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(
            final List<ImpasseTestPlans> impasseTestPlansList,
            final InsertOption<ImpasseTestPlansCB> option) {
        assertInsertOptionNotNull(option);
        return doBatchInsert(impasseTestPlansList, option);
    }

    /**
     * Batch-update the list with varying requests. <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br />
     * Other specifications are same as batchUpdate(entityList).
     * @param impasseTestPlansList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(
            final List<ImpasseTestPlans> impasseTestPlansList,
            final UpdateOption<ImpasseTestPlansCB> option) {
        assertUpdateOptionNotNull(option);
        return doBatchUpdate(impasseTestPlansList, option);
    }

    /**
     * Batch-delete the list with varying requests. <br />
     * For example, limitBatchDeleteLogging(). <br />
     * Other specifications are same as batchDelete(entityList).
     * @param impasseTestPlansList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(
            final List<ImpasseTestPlans> impasseTestPlansList,
            final DeleteOption<ImpasseTestPlansCB> option) {
        assertDeleteOptionNotNull(option);
        return doBatchDelete(impasseTestPlansList, option);
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
            final QueryInsertSetupper<ImpasseTestPlans, ImpasseTestPlansCB> setupper,
            final InsertOption<ImpasseTestPlansCB> option) {
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
     * ImpasseTestPlans impasseTestPlans = new ImpasseTestPlans();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//impasseTestPlans.setPK...(value);</span>
     * impasseTestPlans.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//impasseTestPlans.setVersionNo(value);</span>
     * ImpasseTestPlansCB cb = new ImpasseTestPlansCB();
     * cb.query().setFoo...(value);
     * UpdateOption&lt;ImpasseTestPlansCB&gt; option = new UpdateOption&lt;ImpasseTestPlansCB&gt;();
     * option.self(new SpecifyQuery&lt;ImpasseTestPlansCB&gt;() {
     *     public void specify(ImpasseTestPlansCB cb) {
     *         cb.specify().<span style="color: #FD4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * impasseTestPlansBhv.<span style="color: #FD4747">varyingQueryUpdate</span>(impasseTestPlans, cb, option);
     * </pre>
     * @param impasseTestPlans The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of ImpasseTestPlans. (NotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The updated count.
     * @exception org.seasar.dbflute.exception.NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(final ImpasseTestPlans impasseTestPlans,
            final ImpasseTestPlansCB cb,
            final UpdateOption<ImpasseTestPlansCB> option) {
        assertUpdateOptionNotNull(option);
        return doQueryUpdate(impasseTestPlans, cb, option);
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br />
     * For example, allowNonQueryDelete(). <br />
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param cb The condition-bean of ImpasseTestPlans. (NotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @exception org.seasar.dbflute.exception.NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(final ImpasseTestPlansCB cb,
            final DeleteOption<ImpasseTestPlansCB> option) {
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
    public OutsideSqlBasicExecutor<ImpasseTestPlansBhv> outsideSql() {
        return doOutsideSql();
    }

    // ===================================================================================
    //                                                                     Delegate Method
    //                                                                     ===============
    // [Behavior Command]
    // -----------------------------------------------------
    //                                                Select
    //                                                ------
    protected int delegateSelectCountUniquely(final ImpasseTestPlansCB cb) {
        return invoke(createSelectCountCBCommand(cb, true));
    }

    protected int delegateSelectCountPlainly(final ImpasseTestPlansCB cb) {
        return invoke(createSelectCountCBCommand(cb, false));
    }

    protected <ENTITY extends ImpasseTestPlans> void delegateSelectCursor(
            final ImpasseTestPlansCB cb, final EntityRowHandler<ENTITY> erh,
            final Class<ENTITY> et) {
        invoke(createSelectCursorCBCommand(cb, erh, et));
    }

    protected <ENTITY extends ImpasseTestPlans> List<ENTITY> delegateSelectList(
            final ImpasseTestPlansCB cb, final Class<ENTITY> et) {
        return invoke(createSelectListCBCommand(cb, et));
    }

    // -----------------------------------------------------
    //                                                Update
    //                                                ------
    protected int delegateInsert(final ImpasseTestPlans e,
            final InsertOption<ImpasseTestPlansCB> op) {
        if (!processBeforeInsert(e, op)) {
            return 0;
        }
        return invoke(createInsertEntityCommand(e, op));
    }

    protected int delegateUpdate(final ImpasseTestPlans e,
            final UpdateOption<ImpasseTestPlansCB> op) {
        if (!processBeforeUpdate(e, op)) {
            return 0;
        }
        return delegateUpdateNonstrict(e, op);
    }

    protected int delegateUpdateNonstrict(final ImpasseTestPlans e,
            final UpdateOption<ImpasseTestPlansCB> op) {
        if (!processBeforeUpdate(e, op)) {
            return 0;
        }
        return invoke(createUpdateNonstrictEntityCommand(e, op));
    }

    protected int delegateDelete(final ImpasseTestPlans e,
            final DeleteOption<ImpasseTestPlansCB> op) {
        if (!processBeforeDelete(e, op)) {
            return 0;
        }
        return delegateDeleteNonstrict(e, op);
    }

    protected int delegateDeleteNonstrict(final ImpasseTestPlans e,
            final DeleteOption<ImpasseTestPlansCB> op) {
        if (!processBeforeDelete(e, op)) {
            return 0;
        }
        return invoke(createDeleteNonstrictEntityCommand(e, op));
    }

    protected int[] delegateBatchInsert(final List<ImpasseTestPlans> ls,
            final InsertOption<ImpasseTestPlansCB> op) {
        if (ls.isEmpty()) {
            return new int[] {};
        }
        return invoke(createBatchInsertCommand(processBatchInternally(ls, op),
                op));
    }

    protected int[] delegateBatchUpdate(final List<ImpasseTestPlans> ls,
            final UpdateOption<ImpasseTestPlansCB> op) {
        if (ls.isEmpty()) {
            return new int[] {};
        }
        return delegateBatchUpdateNonstrict(ls, op);
    }

    protected int[] delegateBatchUpdateNonstrict(
            final List<ImpasseTestPlans> ls,
            final UpdateOption<ImpasseTestPlansCB> op) {
        if (ls.isEmpty()) {
            return new int[] {};
        }
        return invoke(createBatchUpdateNonstrictCommand(
                processBatchInternally(ls, op, true), op));
    }

    protected int[] delegateBatchDelete(final List<ImpasseTestPlans> ls,
            final DeleteOption<ImpasseTestPlansCB> op) {
        if (ls.isEmpty()) {
            return new int[] {};
        }
        return delegateBatchDeleteNonstrict(ls, op);
    }

    protected int[] delegateBatchDeleteNonstrict(
            final List<ImpasseTestPlans> ls,
            final DeleteOption<ImpasseTestPlansCB> op) {
        if (ls.isEmpty()) {
            return new int[] {};
        }
        return invoke(createBatchDeleteNonstrictCommand(
                processBatchInternally(ls, op, true), op));
    }

    protected int delegateQueryInsert(final ImpasseTestPlans e,
            final ImpasseTestPlansCB inCB, final ConditionBean resCB,
            final InsertOption<ImpasseTestPlansCB> op) {
        if (!processBeforeQueryInsert(e, inCB, resCB, op)) {
            return 0;
        }
        return invoke(createQueryInsertCBCommand(e, inCB, resCB, op));
    }

    protected int delegateQueryUpdate(final ImpasseTestPlans e,
            final ImpasseTestPlansCB cb,
            final UpdateOption<ImpasseTestPlansCB> op) {
        if (!processBeforeQueryUpdate(e, cb, op)) {
            return 0;
        }
        return invoke(createQueryUpdateCBCommand(e, cb, op));
    }

    protected int delegateQueryDelete(final ImpasseTestPlansCB cb,
            final DeleteOption<ImpasseTestPlansCB> op) {
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
    protected ImpasseTestPlans downcast(final Entity entity) {
        return helpEntityDowncastInternally(entity, ImpasseTestPlans.class);
    }

    protected ImpasseTestPlansCB downcast(final ConditionBean cb) {
        return helpConditionBeanDowncastInternally(cb, ImpasseTestPlansCB.class);
    }

    @SuppressWarnings("unchecked")
    protected List<ImpasseTestPlans> downcast(
            final List<? extends Entity> entityList) {
        return (List<ImpasseTestPlans>) entityList;
    }

    @SuppressWarnings("unchecked")
    protected InsertOption<ImpasseTestPlansCB> downcast(
            final InsertOption<? extends ConditionBean> option) {
        return (InsertOption<ImpasseTestPlansCB>) option;
    }

    @SuppressWarnings("unchecked")
    protected UpdateOption<ImpasseTestPlansCB> downcast(
            final UpdateOption<? extends ConditionBean> option) {
        return (UpdateOption<ImpasseTestPlansCB>) option;
    }

    @SuppressWarnings("unchecked")
    protected DeleteOption<ImpasseTestPlansCB> downcast(
            final DeleteOption<? extends ConditionBean> option) {
        return (DeleteOption<ImpasseTestPlansCB>) option;
    }

    @SuppressWarnings("unchecked")
    protected QueryInsertSetupper<ImpasseTestPlans, ImpasseTestPlansCB> downcast(
            final QueryInsertSetupper<? extends Entity, ? extends ConditionBean> option) {
        return (QueryInsertSetupper<ImpasseTestPlans, ImpasseTestPlansCB>) option;
    }
}
