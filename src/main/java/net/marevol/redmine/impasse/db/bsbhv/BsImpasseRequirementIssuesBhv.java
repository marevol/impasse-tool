package net.marevol.redmine.impasse.db.bsbhv;

import java.util.List;

import net.marevol.redmine.impasse.db.bsentity.dbmeta.ImpasseRequirementIssuesDbm;
import net.marevol.redmine.impasse.db.cbean.ImpasseRequirementIssuesCB;
import net.marevol.redmine.impasse.db.exbhv.ImpasseRequirementIssuesBhv;
import net.marevol.redmine.impasse.db.exentity.ImpasseRequirementIssues;

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
 * The behavior of impasse_requirement_issues as TABLE. <br />
 * <pre>
 * [primary key]
 *     id
 * 
 * [column]
 *     id, issue_id, num_of_cases
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
public abstract class BsImpasseRequirementIssuesBhv extends
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
        return "impasse_requirement_issues";
    }

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** @return The instance of DBMeta. (NotNull) */
    @Override
    public DBMeta getDBMeta() {
        return ImpasseRequirementIssuesDbm.getInstance();
    }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public ImpasseRequirementIssuesDbm getMyDBMeta() {
        return ImpasseRequirementIssuesDbm.getInstance();
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
    public ImpasseRequirementIssues newMyEntity() {
        return new ImpasseRequirementIssues();
    }

    /** @return The instance of new condition-bean as my table type. (NotNull) */
    public ImpasseRequirementIssuesCB newMyConditionBean() {
        return new ImpasseRequirementIssuesCB();
    }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br />
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * ImpasseRequirementIssuesCB cb = new ImpasseRequirementIssuesCB();
     * cb.query().setFoo...(value);
     * int count = impasseRequirementIssuesBhv.<span style="color: #FD4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of ImpasseRequirementIssues. (NotNull)
     * @return The selected count.
     */
    public int selectCount(final ImpasseRequirementIssuesCB cb) {
        return doSelectCountUniquely(cb);
    }

    protected int doSelectCountUniquely(final ImpasseRequirementIssuesCB cb) { // called by selectCount(cb) 
        assertCBStateValid(cb);
        return delegateSelectCountUniquely(cb);
    }

    protected int doSelectCountPlainly(final ImpasseRequirementIssuesCB cb) { // called by selectPage(cb)
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
     * ImpasseRequirementIssuesCB cb = new ImpasseRequirementIssuesCB();
     * cb.query().setFoo...(value);
     * impasseRequirementIssuesBhv.<span style="color: #FD4747">selectCursor</span>(cb, new EntityRowHandler&lt;ImpasseRequirementIssues&gt;() {
     *     public void handle(ImpasseRequirementIssues entity) {
     *         ... = entity.getFoo...();
     *     }
     * });
     * </pre>
     * @param cb The condition-bean of ImpasseRequirementIssues. (NotNull)
     * @param entityRowHandler The handler of entity row of ImpasseRequirementIssues. (NotNull)
     */
    public void selectCursor(final ImpasseRequirementIssuesCB cb,
            final EntityRowHandler<ImpasseRequirementIssues> entityRowHandler) {
        doSelectCursor(cb, entityRowHandler, ImpasseRequirementIssues.class);
    }

    protected <ENTITY extends ImpasseRequirementIssues> void doSelectCursor(
            final ImpasseRequirementIssuesCB cb,
            final EntityRowHandler<ENTITY> entityRowHandler,
            final Class<ENTITY> entityType) {
        assertCBStateValid(cb);
        assertObjectNotNull("entityRowHandler<ImpasseRequirementIssues>",
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
     * ImpasseRequirementIssuesCB cb = new ImpasseRequirementIssuesCB();
     * cb.query().setFoo...(value);
     * ImpasseRequirementIssues impasseRequirementIssues = impasseRequirementIssuesBhv.<span style="color: #FD4747">selectEntity</span>(cb);
     * if (impasseRequirementIssues != null) {
     *     ... = impasseRequirementIssues.get...();
     * } else {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of ImpasseRequirementIssues. (NotNull)
     * @return The selected entity. (NullAllowed: If the condition has no data, it returns null)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public ImpasseRequirementIssues selectEntity(
            final ImpasseRequirementIssuesCB cb) {
        return doSelectEntity(cb, ImpasseRequirementIssues.class);
    }

    protected <ENTITY extends ImpasseRequirementIssues> ENTITY doSelectEntity(
            final ImpasseRequirementIssuesCB cb, final Class<ENTITY> entityType) {
        assertCBStateValid(cb);
        return helpSelectEntityInternally(
                cb,
                new InternalSelectEntityCallback<ENTITY, ImpasseRequirementIssuesCB>() {
                    @Override
                    public List<ENTITY> callbackSelectList(
                            final ImpasseRequirementIssuesCB cb) {
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
     * ImpasseRequirementIssuesCB cb = new ImpasseRequirementIssuesCB();
     * cb.query().setFoo...(value);
     * ImpasseRequirementIssues impasseRequirementIssues = impasseRequirementIssuesBhv.<span style="color: #FD4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = impasseRequirementIssues.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of ImpasseRequirementIssues. (NotNull)
     * @return The selected entity. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public ImpasseRequirementIssues selectEntityWithDeletedCheck(
            final ImpasseRequirementIssuesCB cb) {
        return doSelectEntityWithDeletedCheck(cb,
                ImpasseRequirementIssues.class);
    }

    protected <ENTITY extends ImpasseRequirementIssues> ENTITY doSelectEntityWithDeletedCheck(
            final ImpasseRequirementIssuesCB cb, final Class<ENTITY> entityType) {
        assertCBStateValid(cb);
        return helpSelectEntityWithDeletedCheckInternally(
                cb,
                new InternalSelectEntityWithDeletedCheckCallback<ENTITY, ImpasseRequirementIssuesCB>() {
                    @Override
                    public List<ENTITY> callbackSelectList(
                            final ImpasseRequirementIssuesCB cb) {
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
    public ImpasseRequirementIssues selectByPKValue(final Integer id) {
        return doSelectByPKValue(id, ImpasseRequirementIssues.class);
    }

    protected <ENTITY extends ImpasseRequirementIssues> ENTITY doSelectByPKValue(
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
    public ImpasseRequirementIssues selectByPKValueWithDeletedCheck(
            final Integer id) {
        return doSelectByPKValueWithDeletedCheck(id,
                ImpasseRequirementIssues.class);
    }

    protected <ENTITY extends ImpasseRequirementIssues> ENTITY doSelectByPKValueWithDeletedCheck(
            final Integer id, final Class<ENTITY> entityType) {
        return doSelectEntityWithDeletedCheck(buildPKCB(id), entityType);
    }

    private ImpasseRequirementIssuesCB buildPKCB(final Integer id) {
        assertObjectNotNull("id", id);
        final ImpasseRequirementIssuesCB cb = newMyConditionBean();
        cb.query().setId_Equal(id);
        return cb;
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * ImpasseRequirementIssuesCB cb = new ImpasseRequirementIssuesCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * ListResultBean&lt;ImpasseRequirementIssues&gt; impasseRequirementIssuesList = impasseRequirementIssuesBhv.<span style="color: #FD4747">selectList</span>(cb);
     * for (ImpasseRequirementIssues impasseRequirementIssues : impasseRequirementIssuesList) {
     *     ... = impasseRequirementIssues.get...();
     * }
     * </pre>
     * @param cb The condition-bean of ImpasseRequirementIssues. (NotNull)
     * @return The result bean of selected list. (NotNull)
     * @exception org.seasar.dbflute.exception.DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<ImpasseRequirementIssues> selectList(
            final ImpasseRequirementIssuesCB cb) {
        return doSelectList(cb, ImpasseRequirementIssues.class);
    }

    protected <ENTITY extends ImpasseRequirementIssues> ListResultBean<ENTITY> doSelectList(
            final ImpasseRequirementIssuesCB cb, final Class<ENTITY> entityType) {
        assertCBStateValid(cb);
        assertObjectNotNull("entityType", entityType);
        assertSpecifyDerivedReferrerEntityProperty(cb, entityType);
        return helpSelectListInternally(
                cb,
                entityType,
                new InternalSelectListCallback<ENTITY, ImpasseRequirementIssuesCB>() {
                    @Override
                    public List<ENTITY> callbackSelectList(
                            final ImpasseRequirementIssuesCB cb,
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
     * ImpasseRequirementIssuesCB cb = new ImpasseRequirementIssuesCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #FD4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;ImpasseRequirementIssues&gt; page = impasseRequirementIssuesBhv.<span style="color: #FD4747">selectPage</span>(cb);
     * int allRecordCount = page.getAllRecordCount();
     * int allPageCount = page.getAllPageCount();
     * boolean isExistPrePage = page.isExistPrePage();
     * boolean isExistNextPage = page.isExistNextPage();
     * ...
     * for (ImpasseRequirementIssues impasseRequirementIssues : page) {
     *     ... = impasseRequirementIssues.get...();
     * }
     * </pre>
     * @param cb The condition-bean of ImpasseRequirementIssues. (NotNull)
     * @return The result bean of selected page. (NotNull)
     * @exception org.seasar.dbflute.exception.DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<ImpasseRequirementIssues> selectPage(
            final ImpasseRequirementIssuesCB cb) {
        return doSelectPage(cb, ImpasseRequirementIssues.class);
    }

    protected <ENTITY extends ImpasseRequirementIssues> PagingResultBean<ENTITY> doSelectPage(
            final ImpasseRequirementIssuesCB cb, final Class<ENTITY> entityType) {
        assertCBStateValid(cb);
        assertObjectNotNull("entityType", entityType);
        return helpSelectPageInternally(
                cb,
                entityType,
                new InternalSelectPageCallback<ENTITY, ImpasseRequirementIssuesCB>() {
                    @Override
                    public int callbackSelectCount(
                            final ImpasseRequirementIssuesCB cb) {
                        return doSelectCountPlainly(cb);
                    }

                    @Override
                    public List<ENTITY> callbackSelectList(
                            final ImpasseRequirementIssuesCB cb,
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
     * impasseRequirementIssuesBhv.<span style="color: #FD4747">scalarSelect</span>(Date.class).max(new ScalarQuery() {
     *     public void query(ImpasseRequirementIssuesCB cb) {
     *         cb.specify().<span style="color: #FD4747">columnFooDatetime()</span>; <span style="color: #3F7E5E">// required for a function</span>
     *         cb.query().setBarName_PrefixSearch("S");
     *     }
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar value derived by a function. (NullAllowed)
     */
    public <RESULT> SLFunction<ImpasseRequirementIssuesCB, RESULT> scalarSelect(
            final Class<RESULT> resultType) {
        return doScalarSelect(resultType, newMyConditionBean());
    }

    protected <RESULT, CB extends ImpasseRequirementIssuesCB> SLFunction<CB, RESULT> doScalarSelect(
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
     * @param impasseRequirementIssuesList The list of impasseRequirementIssues. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Integer> extractIdList(
            final List<ImpasseRequirementIssues> impasseRequirementIssuesList) {
        return helpExtractListInternally(
                impasseRequirementIssuesList,
                new InternalExtractCallback<ImpasseRequirementIssues, Integer>() {
                    @Override
                    public Integer getCV(final ImpasseRequirementIssues e) {
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
     * ImpasseRequirementIssues impasseRequirementIssues = new ImpasseRequirementIssues();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * impasseRequirementIssues.setFoo...(value);
     * impasseRequirementIssues.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//impasseRequirementIssues.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//impasseRequirementIssues.set...;</span>
     * impasseRequirementIssuesBhv.<span style="color: #FD4747">insert</span>(impasseRequirementIssues);
     * ... = impasseRequirementIssues.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param impasseRequirementIssues The entity of insert target. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(final ImpasseRequirementIssues impasseRequirementIssues) {
        doInsert(impasseRequirementIssues, null);
    }

    protected void doInsert(
            final ImpasseRequirementIssues impasseRequirementIssues,
            final InsertOption<ImpasseRequirementIssuesCB> option) {
        assertObjectNotNull("impasseRequirementIssues",
                impasseRequirementIssues);
        prepareInsertOption(option);
        delegateInsert(impasseRequirementIssues, option);
    }

    protected void prepareInsertOption(
            final InsertOption<ImpasseRequirementIssuesCB> option) {
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
     * ImpasseRequirementIssues impasseRequirementIssues = new ImpasseRequirementIssues();
     * impasseRequirementIssues.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * impasseRequirementIssues.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//impasseRequirementIssues.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//impasseRequirementIssues.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * impasseRequirementIssues.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     impasseRequirementIssuesBhv.<span style="color: #FD4747">update</span>(impasseRequirementIssues);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * } 
     * </pre>
     * @param impasseRequirementIssues The entity of update target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(final ImpasseRequirementIssues impasseRequirementIssues) {
        doUpdate(impasseRequirementIssues, null);
    }

    protected void doUpdate(
            final ImpasseRequirementIssues impasseRequirementIssues,
            final UpdateOption<ImpasseRequirementIssuesCB> option) {
        assertObjectNotNull("impasseRequirementIssues",
                impasseRequirementIssues);
        prepareUpdateOption(option);
        helpUpdateInternally(impasseRequirementIssues,
                new InternalUpdateCallback<ImpasseRequirementIssues>() {
                    @Override
                    public int callbackDelegateUpdate(
                            final ImpasseRequirementIssues entity) {
                        return delegateUpdate(entity, option);
                    }
                });
    }

    protected void prepareUpdateOption(
            final UpdateOption<ImpasseRequirementIssuesCB> option) {
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

    protected ImpasseRequirementIssuesCB createCBForVaryingUpdate() {
        final ImpasseRequirementIssuesCB cb = newMyConditionBean();
        cb.xsetupForVaryingUpdate();
        return cb;
    }

    protected ImpasseRequirementIssuesCB createCBForSpecifiedUpdate() {
        final ImpasseRequirementIssuesCB cb = newMyConditionBean();
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
     * @param impasseRequirementIssues The entity of insert or update target. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(
            final ImpasseRequirementIssues impasseRequirementIssues) {
        doInesrtOrUpdate(impasseRequirementIssues, null, null);
    }

    protected void doInesrtOrUpdate(
            final ImpasseRequirementIssues impasseRequirementIssues,
            final InsertOption<ImpasseRequirementIssuesCB> insertOption,
            final UpdateOption<ImpasseRequirementIssuesCB> updateOption) {
        helpInsertOrUpdateInternally(
                impasseRequirementIssues,
                new InternalInsertOrUpdateCallback<ImpasseRequirementIssues, ImpasseRequirementIssuesCB>() {
                    @Override
                    public void callbackInsert(
                            final ImpasseRequirementIssues entity) {
                        doInsert(entity, insertOption);
                    }

                    @Override
                    public void callbackUpdate(
                            final ImpasseRequirementIssues entity) {
                        doUpdate(entity, updateOption);
                    }

                    @Override
                    public ImpasseRequirementIssuesCB callbackNewMyConditionBean() {
                        return newMyConditionBean();
                    }

                    @Override
                    public int callbackSelectCount(
                            final ImpasseRequirementIssuesCB cb) {
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
            insertOption = insertOption == null ? new InsertOption<ImpasseRequirementIssuesCB>()
                    : insertOption;
            updateOption = updateOption == null ? new UpdateOption<ImpasseRequirementIssuesCB>()
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
     * ImpasseRequirementIssues impasseRequirementIssues = new ImpasseRequirementIssues();
     * impasseRequirementIssues.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * impasseRequirementIssues.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     impasseRequirementIssuesBhv.<span style="color: #FD4747">delete</span>(impasseRequirementIssues);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * } 
     * </pre>
     * @param impasseRequirementIssues The entity of delete target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(final ImpasseRequirementIssues impasseRequirementIssues) {
        doDelete(impasseRequirementIssues, null);
    }

    protected void doDelete(
            final ImpasseRequirementIssues impasseRequirementIssues,
            final DeleteOption<ImpasseRequirementIssuesCB> option) {
        assertObjectNotNull("impasseRequirementIssues",
                impasseRequirementIssues);
        prepareDeleteOption(option);
        helpDeleteInternally(impasseRequirementIssues,
                new InternalDeleteCallback<ImpasseRequirementIssues>() {
                    @Override
                    public int callbackDelegateDelete(
                            final ImpasseRequirementIssues entity) {
                        return delegateDelete(entity, option);
                    }
                });
    }

    protected void prepareDeleteOption(
            final DeleteOption<ImpasseRequirementIssuesCB> option) {
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
     * @param impasseRequirementIssuesList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(
            final List<ImpasseRequirementIssues> impasseRequirementIssuesList) {
        return doBatchInsert(impasseRequirementIssuesList, null);
    }

    protected int[] doBatchInsert(
            final List<ImpasseRequirementIssues> impasseRequirementIssuesList,
            final InsertOption<ImpasseRequirementIssuesCB> option) {
        assertObjectNotNull("impasseRequirementIssuesList",
                impasseRequirementIssuesList);
        prepareInsertOption(option);
        return delegateBatchInsert(impasseRequirementIssuesList, option);
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
     * impasseRequirementIssuesBhv.<span style="color: #FD4747">batchUpdate</span>(impasseRequirementIssuesList, new SpecifyQuery<ImpasseRequirementIssuesCB>() {
     *     public void specify(ImpasseRequirementIssuesCB cb) { <span style="color: #3F7E5E">// FOO_STATUS_CODE, BAR_DATE only updated</span>
     *         cb.specify().columnFooStatusCode();
     *         cb.specify().columnBarDate();
     *     }
     * });
     * </pre>
     * @param impasseRequirementIssuesList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(
            final List<ImpasseRequirementIssues> impasseRequirementIssuesList) {
        return doBatchUpdate(impasseRequirementIssuesList, null);
    }

    protected int[] doBatchUpdate(
            final List<ImpasseRequirementIssues> impasseRequirementIssuesList,
            final UpdateOption<ImpasseRequirementIssuesCB> option) {
        assertObjectNotNull("impasseRequirementIssuesList",
                impasseRequirementIssuesList);
        prepareUpdateOption(option);
        return delegateBatchUpdate(impasseRequirementIssuesList, option);
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
     * impasseRequirementIssuesBhv.<span style="color: #FD4747">batchUpdate</span>(impasseRequirementIssuesList, new SpecifyQuery<ImpasseRequirementIssuesCB>() {
     *     public void specify(ImpasseRequirementIssuesCB cb) { <span style="color: #3F7E5E">// FOO_STATUS_CODE, BAR_DATE only updated</span>
     *         cb.specify().columnFooStatusCode();
     *         cb.specify().columnBarDate();
     *     }
     * });
     * </pre>
     * @param impasseRequirementIssuesList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param updateColumnSpec The specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(
            final List<ImpasseRequirementIssues> impasseRequirementIssuesList,
            final SpecifyQuery<ImpasseRequirementIssuesCB> updateColumnSpec) {
        return doBatchUpdate(impasseRequirementIssuesList,
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
     * @param impasseRequirementIssuesList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDelete(
            final List<ImpasseRequirementIssues> impasseRequirementIssuesList) {
        return doBatchDelete(impasseRequirementIssuesList, null);
    }

    protected int[] doBatchDelete(
            final List<ImpasseRequirementIssues> impasseRequirementIssuesList,
            final DeleteOption<ImpasseRequirementIssuesCB> option) {
        assertObjectNotNull("impasseRequirementIssuesList",
                impasseRequirementIssuesList);
        prepareDeleteOption(option);
        return delegateBatchDelete(impasseRequirementIssuesList, option);
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
     * impasseRequirementIssuesBhv.<span style="color: #FD4747">queryInsert</span>(new QueryInsertSetupper&lt;ImpasseRequirementIssues, ImpasseRequirementIssuesCB&gt;() {
     *     public ConditionBean setup(impasseRequirementIssues entity, ImpasseRequirementIssuesCB intoCB) {
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
            final QueryInsertSetupper<ImpasseRequirementIssues, ImpasseRequirementIssuesCB> setupper) {
        return doQueryInsert(setupper, null);
    }

    protected int doQueryInsert(
            final QueryInsertSetupper<ImpasseRequirementIssues, ImpasseRequirementIssuesCB> setupper,
            final InsertOption<ImpasseRequirementIssuesCB> option) {
        assertObjectNotNull("setupper", setupper);
        prepareInsertOption(option);
        final ImpasseRequirementIssues entity = new ImpasseRequirementIssues();
        final ImpasseRequirementIssuesCB intoCB = createCBForQueryInsert();
        final ConditionBean resourceCB = setupper.setup(entity, intoCB);
        return delegateQueryInsert(entity, intoCB, resourceCB, option);
    }

    protected ImpasseRequirementIssuesCB createCBForQueryInsert() {
        final ImpasseRequirementIssuesCB cb = newMyConditionBean();
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
     * ImpasseRequirementIssues impasseRequirementIssues = new ImpasseRequirementIssues();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//impasseRequirementIssues.setPK...(value);</span>
     * impasseRequirementIssues.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//impasseRequirementIssues.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//impasseRequirementIssues.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//impasseRequirementIssues.setVersionNo(value);</span>
     * ImpasseRequirementIssuesCB cb = new ImpasseRequirementIssuesCB();
     * cb.query().setFoo...(value);
     * impasseRequirementIssuesBhv.<span style="color: #FD4747">queryUpdate</span>(impasseRequirementIssues, cb);
     * </pre>
     * @param impasseRequirementIssues The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of ImpasseRequirementIssues. (NotNull)
     * @return The updated count.
     * @exception org.seasar.dbflute.exception.NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(
            final ImpasseRequirementIssues impasseRequirementIssues,
            final ImpasseRequirementIssuesCB cb) {
        return doQueryUpdate(impasseRequirementIssues, cb, null);
    }

    protected int doQueryUpdate(
            final ImpasseRequirementIssues impasseRequirementIssues,
            final ImpasseRequirementIssuesCB cb,
            final UpdateOption<ImpasseRequirementIssuesCB> option) {
        assertObjectNotNull("impasseRequirementIssues",
                impasseRequirementIssues);
        assertCBStateValid(cb);
        prepareUpdateOption(option);
        return delegateQueryUpdate(impasseRequirementIssues, cb, option);
    }

    @Override
    protected int doRangeModify(final Entity entity, final ConditionBean cb,
            final UpdateOption<? extends ConditionBean> option) {
        if (option == null) {
            return queryUpdate(downcast(entity),
                    (ImpasseRequirementIssuesCB) cb);
        } else {
            return varyingQueryUpdate(downcast(entity),
                    (ImpasseRequirementIssuesCB) cb, downcast(option));
        }
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * ImpasseRequirementIssuesCB cb = new ImpasseRequirementIssuesCB();
     * cb.query().setFoo...(value);
     * impasseRequirementIssuesBhv.<span style="color: #FD4747">queryDelete</span>(impasseRequirementIssues, cb);
     * </pre>
     * @param cb The condition-bean of ImpasseRequirementIssues. (NotNull)
     * @return The deleted count.
     * @exception org.seasar.dbflute.exception.NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(final ImpasseRequirementIssuesCB cb) {
        return doQueryDelete(cb, null);
    }

    protected int doQueryDelete(final ImpasseRequirementIssuesCB cb,
            final DeleteOption<ImpasseRequirementIssuesCB> option) {
        assertCBStateValid(cb);
        prepareDeleteOption(option);
        return delegateQueryDelete(cb, option);
    }

    @Override
    protected int doRangeRemove(final ConditionBean cb,
            final DeleteOption<? extends ConditionBean> option) {
        if (option == null) {
            return queryDelete((ImpasseRequirementIssuesCB) cb);
        } else {
            return varyingQueryDelete((ImpasseRequirementIssuesCB) cb,
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
     * ImpasseRequirementIssues impasseRequirementIssues = new ImpasseRequirementIssues();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * impasseRequirementIssues.setFoo...(value);
     * impasseRequirementIssues.setBar...(value);
     * InsertOption<ImpasseRequirementIssuesCB> option = new InsertOption<ImpasseRequirementIssuesCB>();
     * <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     * option.disableCommonColumnAutoSetup();
     * impasseRequirementIssuesBhv.<span style="color: #FD4747">varyingInsert</span>(impasseRequirementIssues, option);
     * ... = impasseRequirementIssues.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param impasseRequirementIssues The entity of insert target. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param option The option of insert for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(
            final ImpasseRequirementIssues impasseRequirementIssues,
            final InsertOption<ImpasseRequirementIssuesCB> option) {
        assertInsertOptionNotNull(option);
        doInsert(impasseRequirementIssues, option);
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, NonExclusiveControl) <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br />
     * Other specifications are same as update(entity).
     * <pre>
     * ImpasseRequirementIssues impasseRequirementIssues = new ImpasseRequirementIssues();
     * impasseRequirementIssues.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * impasseRequirementIssues.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * impasseRequirementIssues.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     <span style="color: #3F7E5E">// you can update by self calculation values</span>
     *     UpdateOption&lt;ImpasseRequirementIssuesCB&gt; option = new UpdateOption&lt;ImpasseRequirementIssuesCB&gt;();
     *     option.self(new SpecifyQuery&lt;ImpasseRequirementIssuesCB&gt;() {
     *         public void specify(ImpasseRequirementIssuesCB cb) {
     *             cb.specify().<span style="color: #FD4747">columnXxxCount()</span>;
     *         }
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     *     impasseRequirementIssuesBhv.<span style="color: #FD4747">varyingUpdate</span>(impasseRequirementIssues, option);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param impasseRequirementIssues The entity of update target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @param option The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(
            final ImpasseRequirementIssues impasseRequirementIssues,
            final UpdateOption<ImpasseRequirementIssuesCB> option) {
        assertUpdateOptionNotNull(option);
        doUpdate(impasseRequirementIssues, option);
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br />
     * Other specifications are same as insertOrUpdate(entity).
     * @param impasseRequirementIssues The entity of insert or update target. (NotNull)
     * @param insertOption The option of insert for varying requests. (NotNull)
     * @param updateOption The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(
            final ImpasseRequirementIssues impasseRequirementIssues,
            final InsertOption<ImpasseRequirementIssuesCB> insertOption,
            final UpdateOption<ImpasseRequirementIssuesCB> updateOption) {
        assertInsertOptionNotNull(insertOption);
        assertUpdateOptionNotNull(updateOption);
        doInesrtOrUpdate(impasseRequirementIssues, insertOption, updateOption);
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, NonExclusiveControl) <br />
     * Now a valid option does not exist. <br />
     * Other specifications are same as delete(entity).
     * @param impasseRequirementIssues The entity of delete target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @param option The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(
            final ImpasseRequirementIssues impasseRequirementIssues,
            final DeleteOption<ImpasseRequirementIssuesCB> option) {
        assertDeleteOptionNotNull(option);
        doDelete(impasseRequirementIssues, option);
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br />
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br />
     * Other specifications are same as batchInsert(entityList).
     * @param impasseRequirementIssuesList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(
            final List<ImpasseRequirementIssues> impasseRequirementIssuesList,
            final InsertOption<ImpasseRequirementIssuesCB> option) {
        assertInsertOptionNotNull(option);
        return doBatchInsert(impasseRequirementIssuesList, option);
    }

    /**
     * Batch-update the list with varying requests. <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br />
     * Other specifications are same as batchUpdate(entityList).
     * @param impasseRequirementIssuesList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(
            final List<ImpasseRequirementIssues> impasseRequirementIssuesList,
            final UpdateOption<ImpasseRequirementIssuesCB> option) {
        assertUpdateOptionNotNull(option);
        return doBatchUpdate(impasseRequirementIssuesList, option);
    }

    /**
     * Batch-delete the list with varying requests. <br />
     * For example, limitBatchDeleteLogging(). <br />
     * Other specifications are same as batchDelete(entityList).
     * @param impasseRequirementIssuesList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(
            final List<ImpasseRequirementIssues> impasseRequirementIssuesList,
            final DeleteOption<ImpasseRequirementIssuesCB> option) {
        assertDeleteOptionNotNull(option);
        return doBatchDelete(impasseRequirementIssuesList, option);
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
            final QueryInsertSetupper<ImpasseRequirementIssues, ImpasseRequirementIssuesCB> setupper,
            final InsertOption<ImpasseRequirementIssuesCB> option) {
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
     * ImpasseRequirementIssues impasseRequirementIssues = new ImpasseRequirementIssues();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//impasseRequirementIssues.setPK...(value);</span>
     * impasseRequirementIssues.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//impasseRequirementIssues.setVersionNo(value);</span>
     * ImpasseRequirementIssuesCB cb = new ImpasseRequirementIssuesCB();
     * cb.query().setFoo...(value);
     * UpdateOption&lt;ImpasseRequirementIssuesCB&gt; option = new UpdateOption&lt;ImpasseRequirementIssuesCB&gt;();
     * option.self(new SpecifyQuery&lt;ImpasseRequirementIssuesCB&gt;() {
     *     public void specify(ImpasseRequirementIssuesCB cb) {
     *         cb.specify().<span style="color: #FD4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * impasseRequirementIssuesBhv.<span style="color: #FD4747">varyingQueryUpdate</span>(impasseRequirementIssues, cb, option);
     * </pre>
     * @param impasseRequirementIssues The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of ImpasseRequirementIssues. (NotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The updated count.
     * @exception org.seasar.dbflute.exception.NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(
            final ImpasseRequirementIssues impasseRequirementIssues,
            final ImpasseRequirementIssuesCB cb,
            final UpdateOption<ImpasseRequirementIssuesCB> option) {
        assertUpdateOptionNotNull(option);
        return doQueryUpdate(impasseRequirementIssues, cb, option);
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br />
     * For example, allowNonQueryDelete(). <br />
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param cb The condition-bean of ImpasseRequirementIssues. (NotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @exception org.seasar.dbflute.exception.NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(final ImpasseRequirementIssuesCB cb,
            final DeleteOption<ImpasseRequirementIssuesCB> option) {
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
    public OutsideSqlBasicExecutor<ImpasseRequirementIssuesBhv> outsideSql() {
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
            final ImpasseRequirementIssuesCB cb) {
        return invoke(createSelectCountCBCommand(cb, true));
    }

    protected int delegateSelectCountPlainly(final ImpasseRequirementIssuesCB cb) {
        return invoke(createSelectCountCBCommand(cb, false));
    }

    protected <ENTITY extends ImpasseRequirementIssues> void delegateSelectCursor(
            final ImpasseRequirementIssuesCB cb,
            final EntityRowHandler<ENTITY> erh, final Class<ENTITY> et) {
        invoke(createSelectCursorCBCommand(cb, erh, et));
    }

    protected <ENTITY extends ImpasseRequirementIssues> List<ENTITY> delegateSelectList(
            final ImpasseRequirementIssuesCB cb, final Class<ENTITY> et) {
        return invoke(createSelectListCBCommand(cb, et));
    }

    // -----------------------------------------------------
    //                                                Update
    //                                                ------
    protected int delegateInsert(final ImpasseRequirementIssues e,
            final InsertOption<ImpasseRequirementIssuesCB> op) {
        if (!processBeforeInsert(e, op)) {
            return 0;
        }
        return invoke(createInsertEntityCommand(e, op));
    }

    protected int delegateUpdate(final ImpasseRequirementIssues e,
            final UpdateOption<ImpasseRequirementIssuesCB> op) {
        if (!processBeforeUpdate(e, op)) {
            return 0;
        }
        return delegateUpdateNonstrict(e, op);
    }

    protected int delegateUpdateNonstrict(final ImpasseRequirementIssues e,
            final UpdateOption<ImpasseRequirementIssuesCB> op) {
        if (!processBeforeUpdate(e, op)) {
            return 0;
        }
        return invoke(createUpdateNonstrictEntityCommand(e, op));
    }

    protected int delegateDelete(final ImpasseRequirementIssues e,
            final DeleteOption<ImpasseRequirementIssuesCB> op) {
        if (!processBeforeDelete(e, op)) {
            return 0;
        }
        return delegateDeleteNonstrict(e, op);
    }

    protected int delegateDeleteNonstrict(final ImpasseRequirementIssues e,
            final DeleteOption<ImpasseRequirementIssuesCB> op) {
        if (!processBeforeDelete(e, op)) {
            return 0;
        }
        return invoke(createDeleteNonstrictEntityCommand(e, op));
    }

    protected int[] delegateBatchInsert(
            final List<ImpasseRequirementIssues> ls,
            final InsertOption<ImpasseRequirementIssuesCB> op) {
        if (ls.isEmpty()) {
            return new int[] {};
        }
        return invoke(createBatchInsertCommand(processBatchInternally(ls, op),
                op));
    }

    protected int[] delegateBatchUpdate(
            final List<ImpasseRequirementIssues> ls,
            final UpdateOption<ImpasseRequirementIssuesCB> op) {
        if (ls.isEmpty()) {
            return new int[] {};
        }
        return delegateBatchUpdateNonstrict(ls, op);
    }

    protected int[] delegateBatchUpdateNonstrict(
            final List<ImpasseRequirementIssues> ls,
            final UpdateOption<ImpasseRequirementIssuesCB> op) {
        if (ls.isEmpty()) {
            return new int[] {};
        }
        return invoke(createBatchUpdateNonstrictCommand(
                processBatchInternally(ls, op, true), op));
    }

    protected int[] delegateBatchDelete(
            final List<ImpasseRequirementIssues> ls,
            final DeleteOption<ImpasseRequirementIssuesCB> op) {
        if (ls.isEmpty()) {
            return new int[] {};
        }
        return delegateBatchDeleteNonstrict(ls, op);
    }

    protected int[] delegateBatchDeleteNonstrict(
            final List<ImpasseRequirementIssues> ls,
            final DeleteOption<ImpasseRequirementIssuesCB> op) {
        if (ls.isEmpty()) {
            return new int[] {};
        }
        return invoke(createBatchDeleteNonstrictCommand(
                processBatchInternally(ls, op, true), op));
    }

    protected int delegateQueryInsert(final ImpasseRequirementIssues e,
            final ImpasseRequirementIssuesCB inCB, final ConditionBean resCB,
            final InsertOption<ImpasseRequirementIssuesCB> op) {
        if (!processBeforeQueryInsert(e, inCB, resCB, op)) {
            return 0;
        }
        return invoke(createQueryInsertCBCommand(e, inCB, resCB, op));
    }

    protected int delegateQueryUpdate(final ImpasseRequirementIssues e,
            final ImpasseRequirementIssuesCB cb,
            final UpdateOption<ImpasseRequirementIssuesCB> op) {
        if (!processBeforeQueryUpdate(e, cb, op)) {
            return 0;
        }
        return invoke(createQueryUpdateCBCommand(e, cb, op));
    }

    protected int delegateQueryDelete(final ImpasseRequirementIssuesCB cb,
            final DeleteOption<ImpasseRequirementIssuesCB> op) {
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
    protected ImpasseRequirementIssues downcast(final Entity entity) {
        return helpEntityDowncastInternally(entity,
                ImpasseRequirementIssues.class);
    }

    protected ImpasseRequirementIssuesCB downcast(final ConditionBean cb) {
        return helpConditionBeanDowncastInternally(cb,
                ImpasseRequirementIssuesCB.class);
    }

    @SuppressWarnings("unchecked")
    protected List<ImpasseRequirementIssues> downcast(
            final List<? extends Entity> entityList) {
        return (List<ImpasseRequirementIssues>) entityList;
    }

    @SuppressWarnings("unchecked")
    protected InsertOption<ImpasseRequirementIssuesCB> downcast(
            final InsertOption<? extends ConditionBean> option) {
        return (InsertOption<ImpasseRequirementIssuesCB>) option;
    }

    @SuppressWarnings("unchecked")
    protected UpdateOption<ImpasseRequirementIssuesCB> downcast(
            final UpdateOption<? extends ConditionBean> option) {
        return (UpdateOption<ImpasseRequirementIssuesCB>) option;
    }

    @SuppressWarnings("unchecked")
    protected DeleteOption<ImpasseRequirementIssuesCB> downcast(
            final DeleteOption<? extends ConditionBean> option) {
        return (DeleteOption<ImpasseRequirementIssuesCB>) option;
    }

    @SuppressWarnings("unchecked")
    protected QueryInsertSetupper<ImpasseRequirementIssues, ImpasseRequirementIssuesCB> downcast(
            final QueryInsertSetupper<? extends Entity, ? extends ConditionBean> option) {
        return (QueryInsertSetupper<ImpasseRequirementIssues, ImpasseRequirementIssuesCB>) option;
    }
}
