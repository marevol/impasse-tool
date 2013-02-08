package net.marevol.redmine.impasse.db.bsbhv;

import java.util.List;

import net.marevol.redmine.impasse.db.bsentity.dbmeta.ImpasseTestPlanCasesDbm;
import net.marevol.redmine.impasse.db.cbean.ImpasseTestPlanCasesCB;
import net.marevol.redmine.impasse.db.exbhv.ImpasseTestPlanCasesBhv;
import net.marevol.redmine.impasse.db.exentity.ImpasseTestPlanCases;

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
 * The behavior of impasse_test_plan_cases as TABLE. <br />
 * <pre>
 * [primary key]
 *     id
 * 
 * [column]
 *     id, test_plan_id, test_case_id, node_order
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
public abstract class BsImpasseTestPlanCasesBhv extends
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
        return "impasse_test_plan_cases";
    }

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** @return The instance of DBMeta. (NotNull) */
    @Override
    public DBMeta getDBMeta() {
        return ImpasseTestPlanCasesDbm.getInstance();
    }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public ImpasseTestPlanCasesDbm getMyDBMeta() {
        return ImpasseTestPlanCasesDbm.getInstance();
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
    public ImpasseTestPlanCases newMyEntity() {
        return new ImpasseTestPlanCases();
    }

    /** @return The instance of new condition-bean as my table type. (NotNull) */
    public ImpasseTestPlanCasesCB newMyConditionBean() {
        return new ImpasseTestPlanCasesCB();
    }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br />
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * ImpasseTestPlanCasesCB cb = new ImpasseTestPlanCasesCB();
     * cb.query().setFoo...(value);
     * int count = impasseTestPlanCasesBhv.<span style="color: #FD4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of ImpasseTestPlanCases. (NotNull)
     * @return The selected count.
     */
    public int selectCount(final ImpasseTestPlanCasesCB cb) {
        return doSelectCountUniquely(cb);
    }

    protected int doSelectCountUniquely(final ImpasseTestPlanCasesCB cb) { // called by selectCount(cb) 
        assertCBStateValid(cb);
        return delegateSelectCountUniquely(cb);
    }

    protected int doSelectCountPlainly(final ImpasseTestPlanCasesCB cb) { // called by selectPage(cb)
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
     * ImpasseTestPlanCasesCB cb = new ImpasseTestPlanCasesCB();
     * cb.query().setFoo...(value);
     * impasseTestPlanCasesBhv.<span style="color: #FD4747">selectCursor</span>(cb, new EntityRowHandler&lt;ImpasseTestPlanCases&gt;() {
     *     public void handle(ImpasseTestPlanCases entity) {
     *         ... = entity.getFoo...();
     *     }
     * });
     * </pre>
     * @param cb The condition-bean of ImpasseTestPlanCases. (NotNull)
     * @param entityRowHandler The handler of entity row of ImpasseTestPlanCases. (NotNull)
     */
    public void selectCursor(final ImpasseTestPlanCasesCB cb,
            final EntityRowHandler<ImpasseTestPlanCases> entityRowHandler) {
        doSelectCursor(cb, entityRowHandler, ImpasseTestPlanCases.class);
    }

    protected <ENTITY extends ImpasseTestPlanCases> void doSelectCursor(
            final ImpasseTestPlanCasesCB cb,
            final EntityRowHandler<ENTITY> entityRowHandler,
            final Class<ENTITY> entityType) {
        assertCBStateValid(cb);
        assertObjectNotNull("entityRowHandler<ImpasseTestPlanCases>",
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
     * ImpasseTestPlanCasesCB cb = new ImpasseTestPlanCasesCB();
     * cb.query().setFoo...(value);
     * ImpasseTestPlanCases impasseTestPlanCases = impasseTestPlanCasesBhv.<span style="color: #FD4747">selectEntity</span>(cb);
     * if (impasseTestPlanCases != null) {
     *     ... = impasseTestPlanCases.get...();
     * } else {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of ImpasseTestPlanCases. (NotNull)
     * @return The selected entity. (NullAllowed: If the condition has no data, it returns null)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public ImpasseTestPlanCases selectEntity(final ImpasseTestPlanCasesCB cb) {
        return doSelectEntity(cb, ImpasseTestPlanCases.class);
    }

    protected <ENTITY extends ImpasseTestPlanCases> ENTITY doSelectEntity(
            final ImpasseTestPlanCasesCB cb, final Class<ENTITY> entityType) {
        assertCBStateValid(cb);
        return helpSelectEntityInternally(
                cb,
                new InternalSelectEntityCallback<ENTITY, ImpasseTestPlanCasesCB>() {
                    @Override
                    public List<ENTITY> callbackSelectList(
                            final ImpasseTestPlanCasesCB cb) {
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
     * ImpasseTestPlanCasesCB cb = new ImpasseTestPlanCasesCB();
     * cb.query().setFoo...(value);
     * ImpasseTestPlanCases impasseTestPlanCases = impasseTestPlanCasesBhv.<span style="color: #FD4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = impasseTestPlanCases.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of ImpasseTestPlanCases. (NotNull)
     * @return The selected entity. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public ImpasseTestPlanCases selectEntityWithDeletedCheck(
            final ImpasseTestPlanCasesCB cb) {
        return doSelectEntityWithDeletedCheck(cb, ImpasseTestPlanCases.class);
    }

    protected <ENTITY extends ImpasseTestPlanCases> ENTITY doSelectEntityWithDeletedCheck(
            final ImpasseTestPlanCasesCB cb, final Class<ENTITY> entityType) {
        assertCBStateValid(cb);
        return helpSelectEntityWithDeletedCheckInternally(
                cb,
                new InternalSelectEntityWithDeletedCheckCallback<ENTITY, ImpasseTestPlanCasesCB>() {
                    @Override
                    public List<ENTITY> callbackSelectList(
                            final ImpasseTestPlanCasesCB cb) {
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
    public ImpasseTestPlanCases selectByPKValue(final Integer id) {
        return doSelectByPKValue(id, ImpasseTestPlanCases.class);
    }

    protected <ENTITY extends ImpasseTestPlanCases> ENTITY doSelectByPKValue(
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
    public ImpasseTestPlanCases selectByPKValueWithDeletedCheck(final Integer id) {
        return doSelectByPKValueWithDeletedCheck(id, ImpasseTestPlanCases.class);
    }

    protected <ENTITY extends ImpasseTestPlanCases> ENTITY doSelectByPKValueWithDeletedCheck(
            final Integer id, final Class<ENTITY> entityType) {
        return doSelectEntityWithDeletedCheck(buildPKCB(id), entityType);
    }

    private ImpasseTestPlanCasesCB buildPKCB(final Integer id) {
        assertObjectNotNull("id", id);
        final ImpasseTestPlanCasesCB cb = newMyConditionBean();
        cb.query().setId_Equal(id);
        return cb;
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * ImpasseTestPlanCasesCB cb = new ImpasseTestPlanCasesCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * ListResultBean&lt;ImpasseTestPlanCases&gt; impasseTestPlanCasesList = impasseTestPlanCasesBhv.<span style="color: #FD4747">selectList</span>(cb);
     * for (ImpasseTestPlanCases impasseTestPlanCases : impasseTestPlanCasesList) {
     *     ... = impasseTestPlanCases.get...();
     * }
     * </pre>
     * @param cb The condition-bean of ImpasseTestPlanCases. (NotNull)
     * @return The result bean of selected list. (NotNull)
     * @exception org.seasar.dbflute.exception.DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<ImpasseTestPlanCases> selectList(
            final ImpasseTestPlanCasesCB cb) {
        return doSelectList(cb, ImpasseTestPlanCases.class);
    }

    protected <ENTITY extends ImpasseTestPlanCases> ListResultBean<ENTITY> doSelectList(
            final ImpasseTestPlanCasesCB cb, final Class<ENTITY> entityType) {
        assertCBStateValid(cb);
        assertObjectNotNull("entityType", entityType);
        assertSpecifyDerivedReferrerEntityProperty(cb, entityType);
        return helpSelectListInternally(
                cb,
                entityType,
                new InternalSelectListCallback<ENTITY, ImpasseTestPlanCasesCB>() {
                    @Override
                    public List<ENTITY> callbackSelectList(
                            final ImpasseTestPlanCasesCB cb,
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
     * ImpasseTestPlanCasesCB cb = new ImpasseTestPlanCasesCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #FD4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;ImpasseTestPlanCases&gt; page = impasseTestPlanCasesBhv.<span style="color: #FD4747">selectPage</span>(cb);
     * int allRecordCount = page.getAllRecordCount();
     * int allPageCount = page.getAllPageCount();
     * boolean isExistPrePage = page.isExistPrePage();
     * boolean isExistNextPage = page.isExistNextPage();
     * ...
     * for (ImpasseTestPlanCases impasseTestPlanCases : page) {
     *     ... = impasseTestPlanCases.get...();
     * }
     * </pre>
     * @param cb The condition-bean of ImpasseTestPlanCases. (NotNull)
     * @return The result bean of selected page. (NotNull)
     * @exception org.seasar.dbflute.exception.DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<ImpasseTestPlanCases> selectPage(
            final ImpasseTestPlanCasesCB cb) {
        return doSelectPage(cb, ImpasseTestPlanCases.class);
    }

    protected <ENTITY extends ImpasseTestPlanCases> PagingResultBean<ENTITY> doSelectPage(
            final ImpasseTestPlanCasesCB cb, final Class<ENTITY> entityType) {
        assertCBStateValid(cb);
        assertObjectNotNull("entityType", entityType);
        return helpSelectPageInternally(
                cb,
                entityType,
                new InternalSelectPageCallback<ENTITY, ImpasseTestPlanCasesCB>() {
                    @Override
                    public int callbackSelectCount(
                            final ImpasseTestPlanCasesCB cb) {
                        return doSelectCountPlainly(cb);
                    }

                    @Override
                    public List<ENTITY> callbackSelectList(
                            final ImpasseTestPlanCasesCB cb,
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
     * impasseTestPlanCasesBhv.<span style="color: #FD4747">scalarSelect</span>(Date.class).max(new ScalarQuery() {
     *     public void query(ImpasseTestPlanCasesCB cb) {
     *         cb.specify().<span style="color: #FD4747">columnFooDatetime()</span>; <span style="color: #3F7E5E">// required for a function</span>
     *         cb.query().setBarName_PrefixSearch("S");
     *     }
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar value derived by a function. (NullAllowed)
     */
    public <RESULT> SLFunction<ImpasseTestPlanCasesCB, RESULT> scalarSelect(
            final Class<RESULT> resultType) {
        return doScalarSelect(resultType, newMyConditionBean());
    }

    protected <RESULT, CB extends ImpasseTestPlanCasesCB> SLFunction<CB, RESULT> doScalarSelect(
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
     * @param impasseTestPlanCasesList The list of impasseTestPlanCases. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Integer> extractIdList(
            final List<ImpasseTestPlanCases> impasseTestPlanCasesList) {
        return helpExtractListInternally(impasseTestPlanCasesList,
                new InternalExtractCallback<ImpasseTestPlanCases, Integer>() {
                    @Override
                    public Integer getCV(final ImpasseTestPlanCases e) {
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
     * ImpasseTestPlanCases impasseTestPlanCases = new ImpasseTestPlanCases();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * impasseTestPlanCases.setFoo...(value);
     * impasseTestPlanCases.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//impasseTestPlanCases.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//impasseTestPlanCases.set...;</span>
     * impasseTestPlanCasesBhv.<span style="color: #FD4747">insert</span>(impasseTestPlanCases);
     * ... = impasseTestPlanCases.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param impasseTestPlanCases The entity of insert target. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(final ImpasseTestPlanCases impasseTestPlanCases) {
        doInsert(impasseTestPlanCases, null);
    }

    protected void doInsert(final ImpasseTestPlanCases impasseTestPlanCases,
            final InsertOption<ImpasseTestPlanCasesCB> option) {
        assertObjectNotNull("impasseTestPlanCases", impasseTestPlanCases);
        prepareInsertOption(option);
        delegateInsert(impasseTestPlanCases, option);
    }

    protected void prepareInsertOption(
            final InsertOption<ImpasseTestPlanCasesCB> option) {
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
     * ImpasseTestPlanCases impasseTestPlanCases = new ImpasseTestPlanCases();
     * impasseTestPlanCases.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * impasseTestPlanCases.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//impasseTestPlanCases.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//impasseTestPlanCases.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * impasseTestPlanCases.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     impasseTestPlanCasesBhv.<span style="color: #FD4747">update</span>(impasseTestPlanCases);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * } 
     * </pre>
     * @param impasseTestPlanCases The entity of update target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(final ImpasseTestPlanCases impasseTestPlanCases) {
        doUpdate(impasseTestPlanCases, null);
    }

    protected void doUpdate(final ImpasseTestPlanCases impasseTestPlanCases,
            final UpdateOption<ImpasseTestPlanCasesCB> option) {
        assertObjectNotNull("impasseTestPlanCases", impasseTestPlanCases);
        prepareUpdateOption(option);
        helpUpdateInternally(impasseTestPlanCases,
                new InternalUpdateCallback<ImpasseTestPlanCases>() {
                    @Override
                    public int callbackDelegateUpdate(
                            final ImpasseTestPlanCases entity) {
                        return delegateUpdate(entity, option);
                    }
                });
    }

    protected void prepareUpdateOption(
            final UpdateOption<ImpasseTestPlanCasesCB> option) {
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

    protected ImpasseTestPlanCasesCB createCBForVaryingUpdate() {
        final ImpasseTestPlanCasesCB cb = newMyConditionBean();
        cb.xsetupForVaryingUpdate();
        return cb;
    }

    protected ImpasseTestPlanCasesCB createCBForSpecifiedUpdate() {
        final ImpasseTestPlanCasesCB cb = newMyConditionBean();
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
     * @param impasseTestPlanCases The entity of insert or update target. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(final ImpasseTestPlanCases impasseTestPlanCases) {
        doInesrtOrUpdate(impasseTestPlanCases, null, null);
    }

    protected void doInesrtOrUpdate(
            final ImpasseTestPlanCases impasseTestPlanCases,
            final InsertOption<ImpasseTestPlanCasesCB> insertOption,
            final UpdateOption<ImpasseTestPlanCasesCB> updateOption) {
        helpInsertOrUpdateInternally(
                impasseTestPlanCases,
                new InternalInsertOrUpdateCallback<ImpasseTestPlanCases, ImpasseTestPlanCasesCB>() {
                    @Override
                    public void callbackInsert(final ImpasseTestPlanCases entity) {
                        doInsert(entity, insertOption);
                    }

                    @Override
                    public void callbackUpdate(final ImpasseTestPlanCases entity) {
                        doUpdate(entity, updateOption);
                    }

                    @Override
                    public ImpasseTestPlanCasesCB callbackNewMyConditionBean() {
                        return newMyConditionBean();
                    }

                    @Override
                    public int callbackSelectCount(
                            final ImpasseTestPlanCasesCB cb) {
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
            insertOption = insertOption == null ? new InsertOption<ImpasseTestPlanCasesCB>()
                    : insertOption;
            updateOption = updateOption == null ? new UpdateOption<ImpasseTestPlanCasesCB>()
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
     * ImpasseTestPlanCases impasseTestPlanCases = new ImpasseTestPlanCases();
     * impasseTestPlanCases.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * impasseTestPlanCases.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     impasseTestPlanCasesBhv.<span style="color: #FD4747">delete</span>(impasseTestPlanCases);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * } 
     * </pre>
     * @param impasseTestPlanCases The entity of delete target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(final ImpasseTestPlanCases impasseTestPlanCases) {
        doDelete(impasseTestPlanCases, null);
    }

    protected void doDelete(final ImpasseTestPlanCases impasseTestPlanCases,
            final DeleteOption<ImpasseTestPlanCasesCB> option) {
        assertObjectNotNull("impasseTestPlanCases", impasseTestPlanCases);
        prepareDeleteOption(option);
        helpDeleteInternally(impasseTestPlanCases,
                new InternalDeleteCallback<ImpasseTestPlanCases>() {
                    @Override
                    public int callbackDelegateDelete(
                            final ImpasseTestPlanCases entity) {
                        return delegateDelete(entity, option);
                    }
                });
    }

    protected void prepareDeleteOption(
            final DeleteOption<ImpasseTestPlanCasesCB> option) {
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
     * @param impasseTestPlanCasesList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(
            final List<ImpasseTestPlanCases> impasseTestPlanCasesList) {
        return doBatchInsert(impasseTestPlanCasesList, null);
    }

    protected int[] doBatchInsert(
            final List<ImpasseTestPlanCases> impasseTestPlanCasesList,
            final InsertOption<ImpasseTestPlanCasesCB> option) {
        assertObjectNotNull("impasseTestPlanCasesList",
                impasseTestPlanCasesList);
        prepareInsertOption(option);
        return delegateBatchInsert(impasseTestPlanCasesList, option);
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
     * impasseTestPlanCasesBhv.<span style="color: #FD4747">batchUpdate</span>(impasseTestPlanCasesList, new SpecifyQuery<ImpasseTestPlanCasesCB>() {
     *     public void specify(ImpasseTestPlanCasesCB cb) { <span style="color: #3F7E5E">// FOO_STATUS_CODE, BAR_DATE only updated</span>
     *         cb.specify().columnFooStatusCode();
     *         cb.specify().columnBarDate();
     *     }
     * });
     * </pre>
     * @param impasseTestPlanCasesList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(
            final List<ImpasseTestPlanCases> impasseTestPlanCasesList) {
        return doBatchUpdate(impasseTestPlanCasesList, null);
    }

    protected int[] doBatchUpdate(
            final List<ImpasseTestPlanCases> impasseTestPlanCasesList,
            final UpdateOption<ImpasseTestPlanCasesCB> option) {
        assertObjectNotNull("impasseTestPlanCasesList",
                impasseTestPlanCasesList);
        prepareUpdateOption(option);
        return delegateBatchUpdate(impasseTestPlanCasesList, option);
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
     * impasseTestPlanCasesBhv.<span style="color: #FD4747">batchUpdate</span>(impasseTestPlanCasesList, new SpecifyQuery<ImpasseTestPlanCasesCB>() {
     *     public void specify(ImpasseTestPlanCasesCB cb) { <span style="color: #3F7E5E">// FOO_STATUS_CODE, BAR_DATE only updated</span>
     *         cb.specify().columnFooStatusCode();
     *         cb.specify().columnBarDate();
     *     }
     * });
     * </pre>
     * @param impasseTestPlanCasesList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param updateColumnSpec The specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(
            final List<ImpasseTestPlanCases> impasseTestPlanCasesList,
            final SpecifyQuery<ImpasseTestPlanCasesCB> updateColumnSpec) {
        return doBatchUpdate(impasseTestPlanCasesList,
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
     * @param impasseTestPlanCasesList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDelete(
            final List<ImpasseTestPlanCases> impasseTestPlanCasesList) {
        return doBatchDelete(impasseTestPlanCasesList, null);
    }

    protected int[] doBatchDelete(
            final List<ImpasseTestPlanCases> impasseTestPlanCasesList,
            final DeleteOption<ImpasseTestPlanCasesCB> option) {
        assertObjectNotNull("impasseTestPlanCasesList",
                impasseTestPlanCasesList);
        prepareDeleteOption(option);
        return delegateBatchDelete(impasseTestPlanCasesList, option);
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
     * impasseTestPlanCasesBhv.<span style="color: #FD4747">queryInsert</span>(new QueryInsertSetupper&lt;ImpasseTestPlanCases, ImpasseTestPlanCasesCB&gt;() {
     *     public ConditionBean setup(impasseTestPlanCases entity, ImpasseTestPlanCasesCB intoCB) {
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
            final QueryInsertSetupper<ImpasseTestPlanCases, ImpasseTestPlanCasesCB> setupper) {
        return doQueryInsert(setupper, null);
    }

    protected int doQueryInsert(
            final QueryInsertSetupper<ImpasseTestPlanCases, ImpasseTestPlanCasesCB> setupper,
            final InsertOption<ImpasseTestPlanCasesCB> option) {
        assertObjectNotNull("setupper", setupper);
        prepareInsertOption(option);
        final ImpasseTestPlanCases entity = new ImpasseTestPlanCases();
        final ImpasseTestPlanCasesCB intoCB = createCBForQueryInsert();
        final ConditionBean resourceCB = setupper.setup(entity, intoCB);
        return delegateQueryInsert(entity, intoCB, resourceCB, option);
    }

    protected ImpasseTestPlanCasesCB createCBForQueryInsert() {
        final ImpasseTestPlanCasesCB cb = newMyConditionBean();
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
     * ImpasseTestPlanCases impasseTestPlanCases = new ImpasseTestPlanCases();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//impasseTestPlanCases.setPK...(value);</span>
     * impasseTestPlanCases.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//impasseTestPlanCases.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//impasseTestPlanCases.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//impasseTestPlanCases.setVersionNo(value);</span>
     * ImpasseTestPlanCasesCB cb = new ImpasseTestPlanCasesCB();
     * cb.query().setFoo...(value);
     * impasseTestPlanCasesBhv.<span style="color: #FD4747">queryUpdate</span>(impasseTestPlanCases, cb);
     * </pre>
     * @param impasseTestPlanCases The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of ImpasseTestPlanCases. (NotNull)
     * @return The updated count.
     * @exception org.seasar.dbflute.exception.NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(final ImpasseTestPlanCases impasseTestPlanCases,
            final ImpasseTestPlanCasesCB cb) {
        return doQueryUpdate(impasseTestPlanCases, cb, null);
    }

    protected int doQueryUpdate(
            final ImpasseTestPlanCases impasseTestPlanCases,
            final ImpasseTestPlanCasesCB cb,
            final UpdateOption<ImpasseTestPlanCasesCB> option) {
        assertObjectNotNull("impasseTestPlanCases", impasseTestPlanCases);
        assertCBStateValid(cb);
        prepareUpdateOption(option);
        return delegateQueryUpdate(impasseTestPlanCases, cb, option);
    }

    @Override
    protected int doRangeModify(final Entity entity, final ConditionBean cb,
            final UpdateOption<? extends ConditionBean> option) {
        if (option == null) {
            return queryUpdate(downcast(entity), (ImpasseTestPlanCasesCB) cb);
        } else {
            return varyingQueryUpdate(downcast(entity),
                    (ImpasseTestPlanCasesCB) cb, downcast(option));
        }
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * ImpasseTestPlanCasesCB cb = new ImpasseTestPlanCasesCB();
     * cb.query().setFoo...(value);
     * impasseTestPlanCasesBhv.<span style="color: #FD4747">queryDelete</span>(impasseTestPlanCases, cb);
     * </pre>
     * @param cb The condition-bean of ImpasseTestPlanCases. (NotNull)
     * @return The deleted count.
     * @exception org.seasar.dbflute.exception.NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(final ImpasseTestPlanCasesCB cb) {
        return doQueryDelete(cb, null);
    }

    protected int doQueryDelete(final ImpasseTestPlanCasesCB cb,
            final DeleteOption<ImpasseTestPlanCasesCB> option) {
        assertCBStateValid(cb);
        prepareDeleteOption(option);
        return delegateQueryDelete(cb, option);
    }

    @Override
    protected int doRangeRemove(final ConditionBean cb,
            final DeleteOption<? extends ConditionBean> option) {
        if (option == null) {
            return queryDelete((ImpasseTestPlanCasesCB) cb);
        } else {
            return varyingQueryDelete((ImpasseTestPlanCasesCB) cb,
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
     * ImpasseTestPlanCases impasseTestPlanCases = new ImpasseTestPlanCases();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * impasseTestPlanCases.setFoo...(value);
     * impasseTestPlanCases.setBar...(value);
     * InsertOption<ImpasseTestPlanCasesCB> option = new InsertOption<ImpasseTestPlanCasesCB>();
     * <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     * option.disableCommonColumnAutoSetup();
     * impasseTestPlanCasesBhv.<span style="color: #FD4747">varyingInsert</span>(impasseTestPlanCases, option);
     * ... = impasseTestPlanCases.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param impasseTestPlanCases The entity of insert target. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param option The option of insert for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(final ImpasseTestPlanCases impasseTestPlanCases,
            final InsertOption<ImpasseTestPlanCasesCB> option) {
        assertInsertOptionNotNull(option);
        doInsert(impasseTestPlanCases, option);
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, NonExclusiveControl) <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br />
     * Other specifications are same as update(entity).
     * <pre>
     * ImpasseTestPlanCases impasseTestPlanCases = new ImpasseTestPlanCases();
     * impasseTestPlanCases.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * impasseTestPlanCases.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * impasseTestPlanCases.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     <span style="color: #3F7E5E">// you can update by self calculation values</span>
     *     UpdateOption&lt;ImpasseTestPlanCasesCB&gt; option = new UpdateOption&lt;ImpasseTestPlanCasesCB&gt;();
     *     option.self(new SpecifyQuery&lt;ImpasseTestPlanCasesCB&gt;() {
     *         public void specify(ImpasseTestPlanCasesCB cb) {
     *             cb.specify().<span style="color: #FD4747">columnXxxCount()</span>;
     *         }
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     *     impasseTestPlanCasesBhv.<span style="color: #FD4747">varyingUpdate</span>(impasseTestPlanCases, option);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param impasseTestPlanCases The entity of update target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @param option The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(final ImpasseTestPlanCases impasseTestPlanCases,
            final UpdateOption<ImpasseTestPlanCasesCB> option) {
        assertUpdateOptionNotNull(option);
        doUpdate(impasseTestPlanCases, option);
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br />
     * Other specifications are same as insertOrUpdate(entity).
     * @param impasseTestPlanCases The entity of insert or update target. (NotNull)
     * @param insertOption The option of insert for varying requests. (NotNull)
     * @param updateOption The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(
            final ImpasseTestPlanCases impasseTestPlanCases,
            final InsertOption<ImpasseTestPlanCasesCB> insertOption,
            final UpdateOption<ImpasseTestPlanCasesCB> updateOption) {
        assertInsertOptionNotNull(insertOption);
        assertUpdateOptionNotNull(updateOption);
        doInesrtOrUpdate(impasseTestPlanCases, insertOption, updateOption);
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, NonExclusiveControl) <br />
     * Now a valid option does not exist. <br />
     * Other specifications are same as delete(entity).
     * @param impasseTestPlanCases The entity of delete target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @param option The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(final ImpasseTestPlanCases impasseTestPlanCases,
            final DeleteOption<ImpasseTestPlanCasesCB> option) {
        assertDeleteOptionNotNull(option);
        doDelete(impasseTestPlanCases, option);
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br />
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br />
     * Other specifications are same as batchInsert(entityList).
     * @param impasseTestPlanCasesList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(
            final List<ImpasseTestPlanCases> impasseTestPlanCasesList,
            final InsertOption<ImpasseTestPlanCasesCB> option) {
        assertInsertOptionNotNull(option);
        return doBatchInsert(impasseTestPlanCasesList, option);
    }

    /**
     * Batch-update the list with varying requests. <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br />
     * Other specifications are same as batchUpdate(entityList).
     * @param impasseTestPlanCasesList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(
            final List<ImpasseTestPlanCases> impasseTestPlanCasesList,
            final UpdateOption<ImpasseTestPlanCasesCB> option) {
        assertUpdateOptionNotNull(option);
        return doBatchUpdate(impasseTestPlanCasesList, option);
    }

    /**
     * Batch-delete the list with varying requests. <br />
     * For example, limitBatchDeleteLogging(). <br />
     * Other specifications are same as batchDelete(entityList).
     * @param impasseTestPlanCasesList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(
            final List<ImpasseTestPlanCases> impasseTestPlanCasesList,
            final DeleteOption<ImpasseTestPlanCasesCB> option) {
        assertDeleteOptionNotNull(option);
        return doBatchDelete(impasseTestPlanCasesList, option);
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
            final QueryInsertSetupper<ImpasseTestPlanCases, ImpasseTestPlanCasesCB> setupper,
            final InsertOption<ImpasseTestPlanCasesCB> option) {
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
     * ImpasseTestPlanCases impasseTestPlanCases = new ImpasseTestPlanCases();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//impasseTestPlanCases.setPK...(value);</span>
     * impasseTestPlanCases.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//impasseTestPlanCases.setVersionNo(value);</span>
     * ImpasseTestPlanCasesCB cb = new ImpasseTestPlanCasesCB();
     * cb.query().setFoo...(value);
     * UpdateOption&lt;ImpasseTestPlanCasesCB&gt; option = new UpdateOption&lt;ImpasseTestPlanCasesCB&gt;();
     * option.self(new SpecifyQuery&lt;ImpasseTestPlanCasesCB&gt;() {
     *     public void specify(ImpasseTestPlanCasesCB cb) {
     *         cb.specify().<span style="color: #FD4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * impasseTestPlanCasesBhv.<span style="color: #FD4747">varyingQueryUpdate</span>(impasseTestPlanCases, cb, option);
     * </pre>
     * @param impasseTestPlanCases The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of ImpasseTestPlanCases. (NotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The updated count.
     * @exception org.seasar.dbflute.exception.NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(
            final ImpasseTestPlanCases impasseTestPlanCases,
            final ImpasseTestPlanCasesCB cb,
            final UpdateOption<ImpasseTestPlanCasesCB> option) {
        assertUpdateOptionNotNull(option);
        return doQueryUpdate(impasseTestPlanCases, cb, option);
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br />
     * For example, allowNonQueryDelete(). <br />
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param cb The condition-bean of ImpasseTestPlanCases. (NotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @exception org.seasar.dbflute.exception.NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(final ImpasseTestPlanCasesCB cb,
            final DeleteOption<ImpasseTestPlanCasesCB> option) {
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
    public OutsideSqlBasicExecutor<ImpasseTestPlanCasesBhv> outsideSql() {
        return doOutsideSql();
    }

    // ===================================================================================
    //                                                                     Delegate Method
    //                                                                     ===============
    // [Behavior Command]
    // -----------------------------------------------------
    //                                                Select
    //                                                ------
    protected int delegateSelectCountUniquely(final ImpasseTestPlanCasesCB cb) {
        return invoke(createSelectCountCBCommand(cb, true));
    }

    protected int delegateSelectCountPlainly(final ImpasseTestPlanCasesCB cb) {
        return invoke(createSelectCountCBCommand(cb, false));
    }

    protected <ENTITY extends ImpasseTestPlanCases> void delegateSelectCursor(
            final ImpasseTestPlanCasesCB cb,
            final EntityRowHandler<ENTITY> erh, final Class<ENTITY> et) {
        invoke(createSelectCursorCBCommand(cb, erh, et));
    }

    protected <ENTITY extends ImpasseTestPlanCases> List<ENTITY> delegateSelectList(
            final ImpasseTestPlanCasesCB cb, final Class<ENTITY> et) {
        return invoke(createSelectListCBCommand(cb, et));
    }

    // -----------------------------------------------------
    //                                                Update
    //                                                ------
    protected int delegateInsert(final ImpasseTestPlanCases e,
            final InsertOption<ImpasseTestPlanCasesCB> op) {
        if (!processBeforeInsert(e, op)) {
            return 0;
        }
        return invoke(createInsertEntityCommand(e, op));
    }

    protected int delegateUpdate(final ImpasseTestPlanCases e,
            final UpdateOption<ImpasseTestPlanCasesCB> op) {
        if (!processBeforeUpdate(e, op)) {
            return 0;
        }
        return delegateUpdateNonstrict(e, op);
    }

    protected int delegateUpdateNonstrict(final ImpasseTestPlanCases e,
            final UpdateOption<ImpasseTestPlanCasesCB> op) {
        if (!processBeforeUpdate(e, op)) {
            return 0;
        }
        return invoke(createUpdateNonstrictEntityCommand(e, op));
    }

    protected int delegateDelete(final ImpasseTestPlanCases e,
            final DeleteOption<ImpasseTestPlanCasesCB> op) {
        if (!processBeforeDelete(e, op)) {
            return 0;
        }
        return delegateDeleteNonstrict(e, op);
    }

    protected int delegateDeleteNonstrict(final ImpasseTestPlanCases e,
            final DeleteOption<ImpasseTestPlanCasesCB> op) {
        if (!processBeforeDelete(e, op)) {
            return 0;
        }
        return invoke(createDeleteNonstrictEntityCommand(e, op));
    }

    protected int[] delegateBatchInsert(final List<ImpasseTestPlanCases> ls,
            final InsertOption<ImpasseTestPlanCasesCB> op) {
        if (ls.isEmpty()) {
            return new int[] {};
        }
        return invoke(createBatchInsertCommand(processBatchInternally(ls, op),
                op));
    }

    protected int[] delegateBatchUpdate(final List<ImpasseTestPlanCases> ls,
            final UpdateOption<ImpasseTestPlanCasesCB> op) {
        if (ls.isEmpty()) {
            return new int[] {};
        }
        return delegateBatchUpdateNonstrict(ls, op);
    }

    protected int[] delegateBatchUpdateNonstrict(
            final List<ImpasseTestPlanCases> ls,
            final UpdateOption<ImpasseTestPlanCasesCB> op) {
        if (ls.isEmpty()) {
            return new int[] {};
        }
        return invoke(createBatchUpdateNonstrictCommand(
                processBatchInternally(ls, op, true), op));
    }

    protected int[] delegateBatchDelete(final List<ImpasseTestPlanCases> ls,
            final DeleteOption<ImpasseTestPlanCasesCB> op) {
        if (ls.isEmpty()) {
            return new int[] {};
        }
        return delegateBatchDeleteNonstrict(ls, op);
    }

    protected int[] delegateBatchDeleteNonstrict(
            final List<ImpasseTestPlanCases> ls,
            final DeleteOption<ImpasseTestPlanCasesCB> op) {
        if (ls.isEmpty()) {
            return new int[] {};
        }
        return invoke(createBatchDeleteNonstrictCommand(
                processBatchInternally(ls, op, true), op));
    }

    protected int delegateQueryInsert(final ImpasseTestPlanCases e,
            final ImpasseTestPlanCasesCB inCB, final ConditionBean resCB,
            final InsertOption<ImpasseTestPlanCasesCB> op) {
        if (!processBeforeQueryInsert(e, inCB, resCB, op)) {
            return 0;
        }
        return invoke(createQueryInsertCBCommand(e, inCB, resCB, op));
    }

    protected int delegateQueryUpdate(final ImpasseTestPlanCases e,
            final ImpasseTestPlanCasesCB cb,
            final UpdateOption<ImpasseTestPlanCasesCB> op) {
        if (!processBeforeQueryUpdate(e, cb, op)) {
            return 0;
        }
        return invoke(createQueryUpdateCBCommand(e, cb, op));
    }

    protected int delegateQueryDelete(final ImpasseTestPlanCasesCB cb,
            final DeleteOption<ImpasseTestPlanCasesCB> op) {
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
    protected ImpasseTestPlanCases downcast(final Entity entity) {
        return helpEntityDowncastInternally(entity, ImpasseTestPlanCases.class);
    }

    protected ImpasseTestPlanCasesCB downcast(final ConditionBean cb) {
        return helpConditionBeanDowncastInternally(cb,
                ImpasseTestPlanCasesCB.class);
    }

    @SuppressWarnings("unchecked")
    protected List<ImpasseTestPlanCases> downcast(
            final List<? extends Entity> entityList) {
        return (List<ImpasseTestPlanCases>) entityList;
    }

    @SuppressWarnings("unchecked")
    protected InsertOption<ImpasseTestPlanCasesCB> downcast(
            final InsertOption<? extends ConditionBean> option) {
        return (InsertOption<ImpasseTestPlanCasesCB>) option;
    }

    @SuppressWarnings("unchecked")
    protected UpdateOption<ImpasseTestPlanCasesCB> downcast(
            final UpdateOption<? extends ConditionBean> option) {
        return (UpdateOption<ImpasseTestPlanCasesCB>) option;
    }

    @SuppressWarnings("unchecked")
    protected DeleteOption<ImpasseTestPlanCasesCB> downcast(
            final DeleteOption<? extends ConditionBean> option) {
        return (DeleteOption<ImpasseTestPlanCasesCB>) option;
    }

    @SuppressWarnings("unchecked")
    protected QueryInsertSetupper<ImpasseTestPlanCases, ImpasseTestPlanCasesCB> downcast(
            final QueryInsertSetupper<? extends Entity, ? extends ConditionBean> option) {
        return (QueryInsertSetupper<ImpasseTestPlanCases, ImpasseTestPlanCasesCB>) option;
    }
}
