package net.marevol.redmine.impasse.db.bsbhv;

import java.util.List;

import net.marevol.redmine.impasse.db.bsentity.dbmeta.ImpasseNodeKeywordsDbm;
import net.marevol.redmine.impasse.db.cbean.ImpasseNodeKeywordsCB;
import net.marevol.redmine.impasse.db.exbhv.ImpasseNodeKeywordsBhv;
import net.marevol.redmine.impasse.db.exentity.ImpasseNodeKeywords;

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
 * The behavior of impasse_node_keywords as TABLE. <br />
 * <pre>
 * [primary key]
 *     id
 * 
 * [column]
 *     id, node_id, keyword_id
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
public abstract class BsImpasseNodeKeywordsBhv extends AbstractBehaviorWritable {

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
        return "impasse_node_keywords";
    }

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** @return The instance of DBMeta. (NotNull) */
    @Override
    public DBMeta getDBMeta() {
        return ImpasseNodeKeywordsDbm.getInstance();
    }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public ImpasseNodeKeywordsDbm getMyDBMeta() {
        return ImpasseNodeKeywordsDbm.getInstance();
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
    public ImpasseNodeKeywords newMyEntity() {
        return new ImpasseNodeKeywords();
    }

    /** @return The instance of new condition-bean as my table type. (NotNull) */
    public ImpasseNodeKeywordsCB newMyConditionBean() {
        return new ImpasseNodeKeywordsCB();
    }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br />
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * ImpasseNodeKeywordsCB cb = new ImpasseNodeKeywordsCB();
     * cb.query().setFoo...(value);
     * int count = impasseNodeKeywordsBhv.<span style="color: #FD4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of ImpasseNodeKeywords. (NotNull)
     * @return The selected count.
     */
    public int selectCount(final ImpasseNodeKeywordsCB cb) {
        return doSelectCountUniquely(cb);
    }

    protected int doSelectCountUniquely(final ImpasseNodeKeywordsCB cb) { // called by selectCount(cb) 
        assertCBStateValid(cb);
        return delegateSelectCountUniquely(cb);
    }

    protected int doSelectCountPlainly(final ImpasseNodeKeywordsCB cb) { // called by selectPage(cb)
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
     * ImpasseNodeKeywordsCB cb = new ImpasseNodeKeywordsCB();
     * cb.query().setFoo...(value);
     * impasseNodeKeywordsBhv.<span style="color: #FD4747">selectCursor</span>(cb, new EntityRowHandler&lt;ImpasseNodeKeywords&gt;() {
     *     public void handle(ImpasseNodeKeywords entity) {
     *         ... = entity.getFoo...();
     *     }
     * });
     * </pre>
     * @param cb The condition-bean of ImpasseNodeKeywords. (NotNull)
     * @param entityRowHandler The handler of entity row of ImpasseNodeKeywords. (NotNull)
     */
    public void selectCursor(final ImpasseNodeKeywordsCB cb,
            final EntityRowHandler<ImpasseNodeKeywords> entityRowHandler) {
        doSelectCursor(cb, entityRowHandler, ImpasseNodeKeywords.class);
    }

    protected <ENTITY extends ImpasseNodeKeywords> void doSelectCursor(
            final ImpasseNodeKeywordsCB cb,
            final EntityRowHandler<ENTITY> entityRowHandler,
            final Class<ENTITY> entityType) {
        assertCBStateValid(cb);
        assertObjectNotNull("entityRowHandler<ImpasseNodeKeywords>",
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
     * ImpasseNodeKeywordsCB cb = new ImpasseNodeKeywordsCB();
     * cb.query().setFoo...(value);
     * ImpasseNodeKeywords impasseNodeKeywords = impasseNodeKeywordsBhv.<span style="color: #FD4747">selectEntity</span>(cb);
     * if (impasseNodeKeywords != null) {
     *     ... = impasseNodeKeywords.get...();
     * } else {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of ImpasseNodeKeywords. (NotNull)
     * @return The selected entity. (NullAllowed: If the condition has no data, it returns null)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public ImpasseNodeKeywords selectEntity(final ImpasseNodeKeywordsCB cb) {
        return doSelectEntity(cb, ImpasseNodeKeywords.class);
    }

    protected <ENTITY extends ImpasseNodeKeywords> ENTITY doSelectEntity(
            final ImpasseNodeKeywordsCB cb, final Class<ENTITY> entityType) {
        assertCBStateValid(cb);
        return helpSelectEntityInternally(
                cb,
                new InternalSelectEntityCallback<ENTITY, ImpasseNodeKeywordsCB>() {
                    @Override
                    public List<ENTITY> callbackSelectList(
                            final ImpasseNodeKeywordsCB cb) {
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
     * ImpasseNodeKeywordsCB cb = new ImpasseNodeKeywordsCB();
     * cb.query().setFoo...(value);
     * ImpasseNodeKeywords impasseNodeKeywords = impasseNodeKeywordsBhv.<span style="color: #FD4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = impasseNodeKeywords.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of ImpasseNodeKeywords. (NotNull)
     * @return The selected entity. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public ImpasseNodeKeywords selectEntityWithDeletedCheck(
            final ImpasseNodeKeywordsCB cb) {
        return doSelectEntityWithDeletedCheck(cb, ImpasseNodeKeywords.class);
    }

    protected <ENTITY extends ImpasseNodeKeywords> ENTITY doSelectEntityWithDeletedCheck(
            final ImpasseNodeKeywordsCB cb, final Class<ENTITY> entityType) {
        assertCBStateValid(cb);
        return helpSelectEntityWithDeletedCheckInternally(
                cb,
                new InternalSelectEntityWithDeletedCheckCallback<ENTITY, ImpasseNodeKeywordsCB>() {
                    @Override
                    public List<ENTITY> callbackSelectList(
                            final ImpasseNodeKeywordsCB cb) {
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
    public ImpasseNodeKeywords selectByPKValue(final Integer id) {
        return doSelectByPKValue(id, ImpasseNodeKeywords.class);
    }

    protected <ENTITY extends ImpasseNodeKeywords> ENTITY doSelectByPKValue(
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
    public ImpasseNodeKeywords selectByPKValueWithDeletedCheck(final Integer id) {
        return doSelectByPKValueWithDeletedCheck(id, ImpasseNodeKeywords.class);
    }

    protected <ENTITY extends ImpasseNodeKeywords> ENTITY doSelectByPKValueWithDeletedCheck(
            final Integer id, final Class<ENTITY> entityType) {
        return doSelectEntityWithDeletedCheck(buildPKCB(id), entityType);
    }

    private ImpasseNodeKeywordsCB buildPKCB(final Integer id) {
        assertObjectNotNull("id", id);
        final ImpasseNodeKeywordsCB cb = newMyConditionBean();
        cb.query().setId_Equal(id);
        return cb;
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * ImpasseNodeKeywordsCB cb = new ImpasseNodeKeywordsCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * ListResultBean&lt;ImpasseNodeKeywords&gt; impasseNodeKeywordsList = impasseNodeKeywordsBhv.<span style="color: #FD4747">selectList</span>(cb);
     * for (ImpasseNodeKeywords impasseNodeKeywords : impasseNodeKeywordsList) {
     *     ... = impasseNodeKeywords.get...();
     * }
     * </pre>
     * @param cb The condition-bean of ImpasseNodeKeywords. (NotNull)
     * @return The result bean of selected list. (NotNull)
     * @exception org.seasar.dbflute.exception.DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<ImpasseNodeKeywords> selectList(
            final ImpasseNodeKeywordsCB cb) {
        return doSelectList(cb, ImpasseNodeKeywords.class);
    }

    protected <ENTITY extends ImpasseNodeKeywords> ListResultBean<ENTITY> doSelectList(
            final ImpasseNodeKeywordsCB cb, final Class<ENTITY> entityType) {
        assertCBStateValid(cb);
        assertObjectNotNull("entityType", entityType);
        assertSpecifyDerivedReferrerEntityProperty(cb, entityType);
        return helpSelectListInternally(
                cb,
                entityType,
                new InternalSelectListCallback<ENTITY, ImpasseNodeKeywordsCB>() {
                    @Override
                    public List<ENTITY> callbackSelectList(
                            final ImpasseNodeKeywordsCB cb,
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
     * ImpasseNodeKeywordsCB cb = new ImpasseNodeKeywordsCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #FD4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;ImpasseNodeKeywords&gt; page = impasseNodeKeywordsBhv.<span style="color: #FD4747">selectPage</span>(cb);
     * int allRecordCount = page.getAllRecordCount();
     * int allPageCount = page.getAllPageCount();
     * boolean isExistPrePage = page.isExistPrePage();
     * boolean isExistNextPage = page.isExistNextPage();
     * ...
     * for (ImpasseNodeKeywords impasseNodeKeywords : page) {
     *     ... = impasseNodeKeywords.get...();
     * }
     * </pre>
     * @param cb The condition-bean of ImpasseNodeKeywords. (NotNull)
     * @return The result bean of selected page. (NotNull)
     * @exception org.seasar.dbflute.exception.DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<ImpasseNodeKeywords> selectPage(
            final ImpasseNodeKeywordsCB cb) {
        return doSelectPage(cb, ImpasseNodeKeywords.class);
    }

    protected <ENTITY extends ImpasseNodeKeywords> PagingResultBean<ENTITY> doSelectPage(
            final ImpasseNodeKeywordsCB cb, final Class<ENTITY> entityType) {
        assertCBStateValid(cb);
        assertObjectNotNull("entityType", entityType);
        return helpSelectPageInternally(
                cb,
                entityType,
                new InternalSelectPageCallback<ENTITY, ImpasseNodeKeywordsCB>() {
                    @Override
                    public int callbackSelectCount(
                            final ImpasseNodeKeywordsCB cb) {
                        return doSelectCountPlainly(cb);
                    }

                    @Override
                    public List<ENTITY> callbackSelectList(
                            final ImpasseNodeKeywordsCB cb,
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
     * impasseNodeKeywordsBhv.<span style="color: #FD4747">scalarSelect</span>(Date.class).max(new ScalarQuery() {
     *     public void query(ImpasseNodeKeywordsCB cb) {
     *         cb.specify().<span style="color: #FD4747">columnFooDatetime()</span>; <span style="color: #3F7E5E">// required for a function</span>
     *         cb.query().setBarName_PrefixSearch("S");
     *     }
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar value derived by a function. (NullAllowed)
     */
    public <RESULT> SLFunction<ImpasseNodeKeywordsCB, RESULT> scalarSelect(
            final Class<RESULT> resultType) {
        return doScalarSelect(resultType, newMyConditionBean());
    }

    protected <RESULT, CB extends ImpasseNodeKeywordsCB> SLFunction<CB, RESULT> doScalarSelect(
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
     * @param impasseNodeKeywordsList The list of impasseNodeKeywords. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Integer> extractIdList(
            final List<ImpasseNodeKeywords> impasseNodeKeywordsList) {
        return helpExtractListInternally(impasseNodeKeywordsList,
                new InternalExtractCallback<ImpasseNodeKeywords, Integer>() {
                    @Override
                    public Integer getCV(final ImpasseNodeKeywords e) {
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
     * ImpasseNodeKeywords impasseNodeKeywords = new ImpasseNodeKeywords();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * impasseNodeKeywords.setFoo...(value);
     * impasseNodeKeywords.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//impasseNodeKeywords.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//impasseNodeKeywords.set...;</span>
     * impasseNodeKeywordsBhv.<span style="color: #FD4747">insert</span>(impasseNodeKeywords);
     * ... = impasseNodeKeywords.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param impasseNodeKeywords The entity of insert target. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(final ImpasseNodeKeywords impasseNodeKeywords) {
        doInsert(impasseNodeKeywords, null);
    }

    protected void doInsert(final ImpasseNodeKeywords impasseNodeKeywords,
            final InsertOption<ImpasseNodeKeywordsCB> option) {
        assertObjectNotNull("impasseNodeKeywords", impasseNodeKeywords);
        prepareInsertOption(option);
        delegateInsert(impasseNodeKeywords, option);
    }

    protected void prepareInsertOption(
            final InsertOption<ImpasseNodeKeywordsCB> option) {
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
     * ImpasseNodeKeywords impasseNodeKeywords = new ImpasseNodeKeywords();
     * impasseNodeKeywords.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * impasseNodeKeywords.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//impasseNodeKeywords.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//impasseNodeKeywords.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * impasseNodeKeywords.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     impasseNodeKeywordsBhv.<span style="color: #FD4747">update</span>(impasseNodeKeywords);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * } 
     * </pre>
     * @param impasseNodeKeywords The entity of update target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(final ImpasseNodeKeywords impasseNodeKeywords) {
        doUpdate(impasseNodeKeywords, null);
    }

    protected void doUpdate(final ImpasseNodeKeywords impasseNodeKeywords,
            final UpdateOption<ImpasseNodeKeywordsCB> option) {
        assertObjectNotNull("impasseNodeKeywords", impasseNodeKeywords);
        prepareUpdateOption(option);
        helpUpdateInternally(impasseNodeKeywords,
                new InternalUpdateCallback<ImpasseNodeKeywords>() {
                    @Override
                    public int callbackDelegateUpdate(
                            final ImpasseNodeKeywords entity) {
                        return delegateUpdate(entity, option);
                    }
                });
    }

    protected void prepareUpdateOption(
            final UpdateOption<ImpasseNodeKeywordsCB> option) {
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

    protected ImpasseNodeKeywordsCB createCBForVaryingUpdate() {
        final ImpasseNodeKeywordsCB cb = newMyConditionBean();
        cb.xsetupForVaryingUpdate();
        return cb;
    }

    protected ImpasseNodeKeywordsCB createCBForSpecifiedUpdate() {
        final ImpasseNodeKeywordsCB cb = newMyConditionBean();
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
     * @param impasseNodeKeywords The entity of insert or update target. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(final ImpasseNodeKeywords impasseNodeKeywords) {
        doInesrtOrUpdate(impasseNodeKeywords, null, null);
    }

    protected void doInesrtOrUpdate(
            final ImpasseNodeKeywords impasseNodeKeywords,
            final InsertOption<ImpasseNodeKeywordsCB> insertOption,
            final UpdateOption<ImpasseNodeKeywordsCB> updateOption) {
        helpInsertOrUpdateInternally(
                impasseNodeKeywords,
                new InternalInsertOrUpdateCallback<ImpasseNodeKeywords, ImpasseNodeKeywordsCB>() {
                    @Override
                    public void callbackInsert(final ImpasseNodeKeywords entity) {
                        doInsert(entity, insertOption);
                    }

                    @Override
                    public void callbackUpdate(final ImpasseNodeKeywords entity) {
                        doUpdate(entity, updateOption);
                    }

                    @Override
                    public ImpasseNodeKeywordsCB callbackNewMyConditionBean() {
                        return newMyConditionBean();
                    }

                    @Override
                    public int callbackSelectCount(
                            final ImpasseNodeKeywordsCB cb) {
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
            insertOption = insertOption == null ? new InsertOption<ImpasseNodeKeywordsCB>()
                    : insertOption;
            updateOption = updateOption == null ? new UpdateOption<ImpasseNodeKeywordsCB>()
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
     * ImpasseNodeKeywords impasseNodeKeywords = new ImpasseNodeKeywords();
     * impasseNodeKeywords.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * impasseNodeKeywords.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     impasseNodeKeywordsBhv.<span style="color: #FD4747">delete</span>(impasseNodeKeywords);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * } 
     * </pre>
     * @param impasseNodeKeywords The entity of delete target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(final ImpasseNodeKeywords impasseNodeKeywords) {
        doDelete(impasseNodeKeywords, null);
    }

    protected void doDelete(final ImpasseNodeKeywords impasseNodeKeywords,
            final DeleteOption<ImpasseNodeKeywordsCB> option) {
        assertObjectNotNull("impasseNodeKeywords", impasseNodeKeywords);
        prepareDeleteOption(option);
        helpDeleteInternally(impasseNodeKeywords,
                new InternalDeleteCallback<ImpasseNodeKeywords>() {
                    @Override
                    public int callbackDelegateDelete(
                            final ImpasseNodeKeywords entity) {
                        return delegateDelete(entity, option);
                    }
                });
    }

    protected void prepareDeleteOption(
            final DeleteOption<ImpasseNodeKeywordsCB> option) {
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
     * @param impasseNodeKeywordsList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(
            final List<ImpasseNodeKeywords> impasseNodeKeywordsList) {
        return doBatchInsert(impasseNodeKeywordsList, null);
    }

    protected int[] doBatchInsert(
            final List<ImpasseNodeKeywords> impasseNodeKeywordsList,
            final InsertOption<ImpasseNodeKeywordsCB> option) {
        assertObjectNotNull("impasseNodeKeywordsList", impasseNodeKeywordsList);
        prepareInsertOption(option);
        return delegateBatchInsert(impasseNodeKeywordsList, option);
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
     * impasseNodeKeywordsBhv.<span style="color: #FD4747">batchUpdate</span>(impasseNodeKeywordsList, new SpecifyQuery<ImpasseNodeKeywordsCB>() {
     *     public void specify(ImpasseNodeKeywordsCB cb) { <span style="color: #3F7E5E">// FOO_STATUS_CODE, BAR_DATE only updated</span>
     *         cb.specify().columnFooStatusCode();
     *         cb.specify().columnBarDate();
     *     }
     * });
     * </pre>
     * @param impasseNodeKeywordsList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(
            final List<ImpasseNodeKeywords> impasseNodeKeywordsList) {
        return doBatchUpdate(impasseNodeKeywordsList, null);
    }

    protected int[] doBatchUpdate(
            final List<ImpasseNodeKeywords> impasseNodeKeywordsList,
            final UpdateOption<ImpasseNodeKeywordsCB> option) {
        assertObjectNotNull("impasseNodeKeywordsList", impasseNodeKeywordsList);
        prepareUpdateOption(option);
        return delegateBatchUpdate(impasseNodeKeywordsList, option);
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
     * impasseNodeKeywordsBhv.<span style="color: #FD4747">batchUpdate</span>(impasseNodeKeywordsList, new SpecifyQuery<ImpasseNodeKeywordsCB>() {
     *     public void specify(ImpasseNodeKeywordsCB cb) { <span style="color: #3F7E5E">// FOO_STATUS_CODE, BAR_DATE only updated</span>
     *         cb.specify().columnFooStatusCode();
     *         cb.specify().columnBarDate();
     *     }
     * });
     * </pre>
     * @param impasseNodeKeywordsList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param updateColumnSpec The specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(
            final List<ImpasseNodeKeywords> impasseNodeKeywordsList,
            final SpecifyQuery<ImpasseNodeKeywordsCB> updateColumnSpec) {
        return doBatchUpdate(impasseNodeKeywordsList,
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
     * @param impasseNodeKeywordsList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDelete(
            final List<ImpasseNodeKeywords> impasseNodeKeywordsList) {
        return doBatchDelete(impasseNodeKeywordsList, null);
    }

    protected int[] doBatchDelete(
            final List<ImpasseNodeKeywords> impasseNodeKeywordsList,
            final DeleteOption<ImpasseNodeKeywordsCB> option) {
        assertObjectNotNull("impasseNodeKeywordsList", impasseNodeKeywordsList);
        prepareDeleteOption(option);
        return delegateBatchDelete(impasseNodeKeywordsList, option);
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
     * impasseNodeKeywordsBhv.<span style="color: #FD4747">queryInsert</span>(new QueryInsertSetupper&lt;ImpasseNodeKeywords, ImpasseNodeKeywordsCB&gt;() {
     *     public ConditionBean setup(impasseNodeKeywords entity, ImpasseNodeKeywordsCB intoCB) {
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
            final QueryInsertSetupper<ImpasseNodeKeywords, ImpasseNodeKeywordsCB> setupper) {
        return doQueryInsert(setupper, null);
    }

    protected int doQueryInsert(
            final QueryInsertSetupper<ImpasseNodeKeywords, ImpasseNodeKeywordsCB> setupper,
            final InsertOption<ImpasseNodeKeywordsCB> option) {
        assertObjectNotNull("setupper", setupper);
        prepareInsertOption(option);
        final ImpasseNodeKeywords entity = new ImpasseNodeKeywords();
        final ImpasseNodeKeywordsCB intoCB = createCBForQueryInsert();
        final ConditionBean resourceCB = setupper.setup(entity, intoCB);
        return delegateQueryInsert(entity, intoCB, resourceCB, option);
    }

    protected ImpasseNodeKeywordsCB createCBForQueryInsert() {
        final ImpasseNodeKeywordsCB cb = newMyConditionBean();
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
     * ImpasseNodeKeywords impasseNodeKeywords = new ImpasseNodeKeywords();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//impasseNodeKeywords.setPK...(value);</span>
     * impasseNodeKeywords.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//impasseNodeKeywords.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//impasseNodeKeywords.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//impasseNodeKeywords.setVersionNo(value);</span>
     * ImpasseNodeKeywordsCB cb = new ImpasseNodeKeywordsCB();
     * cb.query().setFoo...(value);
     * impasseNodeKeywordsBhv.<span style="color: #FD4747">queryUpdate</span>(impasseNodeKeywords, cb);
     * </pre>
     * @param impasseNodeKeywords The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of ImpasseNodeKeywords. (NotNull)
     * @return The updated count.
     * @exception org.seasar.dbflute.exception.NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(final ImpasseNodeKeywords impasseNodeKeywords,
            final ImpasseNodeKeywordsCB cb) {
        return doQueryUpdate(impasseNodeKeywords, cb, null);
    }

    protected int doQueryUpdate(final ImpasseNodeKeywords impasseNodeKeywords,
            final ImpasseNodeKeywordsCB cb,
            final UpdateOption<ImpasseNodeKeywordsCB> option) {
        assertObjectNotNull("impasseNodeKeywords", impasseNodeKeywords);
        assertCBStateValid(cb);
        prepareUpdateOption(option);
        return delegateQueryUpdate(impasseNodeKeywords, cb, option);
    }

    @Override
    protected int doRangeModify(final Entity entity, final ConditionBean cb,
            final UpdateOption<? extends ConditionBean> option) {
        if (option == null) {
            return queryUpdate(downcast(entity), (ImpasseNodeKeywordsCB) cb);
        } else {
            return varyingQueryUpdate(downcast(entity),
                    (ImpasseNodeKeywordsCB) cb, downcast(option));
        }
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * ImpasseNodeKeywordsCB cb = new ImpasseNodeKeywordsCB();
     * cb.query().setFoo...(value);
     * impasseNodeKeywordsBhv.<span style="color: #FD4747">queryDelete</span>(impasseNodeKeywords, cb);
     * </pre>
     * @param cb The condition-bean of ImpasseNodeKeywords. (NotNull)
     * @return The deleted count.
     * @exception org.seasar.dbflute.exception.NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(final ImpasseNodeKeywordsCB cb) {
        return doQueryDelete(cb, null);
    }

    protected int doQueryDelete(final ImpasseNodeKeywordsCB cb,
            final DeleteOption<ImpasseNodeKeywordsCB> option) {
        assertCBStateValid(cb);
        prepareDeleteOption(option);
        return delegateQueryDelete(cb, option);
    }

    @Override
    protected int doRangeRemove(final ConditionBean cb,
            final DeleteOption<? extends ConditionBean> option) {
        if (option == null) {
            return queryDelete((ImpasseNodeKeywordsCB) cb);
        } else {
            return varyingQueryDelete((ImpasseNodeKeywordsCB) cb,
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
     * ImpasseNodeKeywords impasseNodeKeywords = new ImpasseNodeKeywords();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * impasseNodeKeywords.setFoo...(value);
     * impasseNodeKeywords.setBar...(value);
     * InsertOption<ImpasseNodeKeywordsCB> option = new InsertOption<ImpasseNodeKeywordsCB>();
     * <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     * option.disableCommonColumnAutoSetup();
     * impasseNodeKeywordsBhv.<span style="color: #FD4747">varyingInsert</span>(impasseNodeKeywords, option);
     * ... = impasseNodeKeywords.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param impasseNodeKeywords The entity of insert target. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param option The option of insert for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(final ImpasseNodeKeywords impasseNodeKeywords,
            final InsertOption<ImpasseNodeKeywordsCB> option) {
        assertInsertOptionNotNull(option);
        doInsert(impasseNodeKeywords, option);
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, NonExclusiveControl) <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br />
     * Other specifications are same as update(entity).
     * <pre>
     * ImpasseNodeKeywords impasseNodeKeywords = new ImpasseNodeKeywords();
     * impasseNodeKeywords.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * impasseNodeKeywords.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * impasseNodeKeywords.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     <span style="color: #3F7E5E">// you can update by self calculation values</span>
     *     UpdateOption&lt;ImpasseNodeKeywordsCB&gt; option = new UpdateOption&lt;ImpasseNodeKeywordsCB&gt;();
     *     option.self(new SpecifyQuery&lt;ImpasseNodeKeywordsCB&gt;() {
     *         public void specify(ImpasseNodeKeywordsCB cb) {
     *             cb.specify().<span style="color: #FD4747">columnXxxCount()</span>;
     *         }
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     *     impasseNodeKeywordsBhv.<span style="color: #FD4747">varyingUpdate</span>(impasseNodeKeywords, option);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param impasseNodeKeywords The entity of update target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @param option The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(final ImpasseNodeKeywords impasseNodeKeywords,
            final UpdateOption<ImpasseNodeKeywordsCB> option) {
        assertUpdateOptionNotNull(option);
        doUpdate(impasseNodeKeywords, option);
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br />
     * Other specifications are same as insertOrUpdate(entity).
     * @param impasseNodeKeywords The entity of insert or update target. (NotNull)
     * @param insertOption The option of insert for varying requests. (NotNull)
     * @param updateOption The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(
            final ImpasseNodeKeywords impasseNodeKeywords,
            final InsertOption<ImpasseNodeKeywordsCB> insertOption,
            final UpdateOption<ImpasseNodeKeywordsCB> updateOption) {
        assertInsertOptionNotNull(insertOption);
        assertUpdateOptionNotNull(updateOption);
        doInesrtOrUpdate(impasseNodeKeywords, insertOption, updateOption);
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, NonExclusiveControl) <br />
     * Now a valid option does not exist. <br />
     * Other specifications are same as delete(entity).
     * @param impasseNodeKeywords The entity of delete target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @param option The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(final ImpasseNodeKeywords impasseNodeKeywords,
            final DeleteOption<ImpasseNodeKeywordsCB> option) {
        assertDeleteOptionNotNull(option);
        doDelete(impasseNodeKeywords, option);
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br />
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br />
     * Other specifications are same as batchInsert(entityList).
     * @param impasseNodeKeywordsList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(
            final List<ImpasseNodeKeywords> impasseNodeKeywordsList,
            final InsertOption<ImpasseNodeKeywordsCB> option) {
        assertInsertOptionNotNull(option);
        return doBatchInsert(impasseNodeKeywordsList, option);
    }

    /**
     * Batch-update the list with varying requests. <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br />
     * Other specifications are same as batchUpdate(entityList).
     * @param impasseNodeKeywordsList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(
            final List<ImpasseNodeKeywords> impasseNodeKeywordsList,
            final UpdateOption<ImpasseNodeKeywordsCB> option) {
        assertUpdateOptionNotNull(option);
        return doBatchUpdate(impasseNodeKeywordsList, option);
    }

    /**
     * Batch-delete the list with varying requests. <br />
     * For example, limitBatchDeleteLogging(). <br />
     * Other specifications are same as batchDelete(entityList).
     * @param impasseNodeKeywordsList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(
            final List<ImpasseNodeKeywords> impasseNodeKeywordsList,
            final DeleteOption<ImpasseNodeKeywordsCB> option) {
        assertDeleteOptionNotNull(option);
        return doBatchDelete(impasseNodeKeywordsList, option);
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
            final QueryInsertSetupper<ImpasseNodeKeywords, ImpasseNodeKeywordsCB> setupper,
            final InsertOption<ImpasseNodeKeywordsCB> option) {
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
     * ImpasseNodeKeywords impasseNodeKeywords = new ImpasseNodeKeywords();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//impasseNodeKeywords.setPK...(value);</span>
     * impasseNodeKeywords.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//impasseNodeKeywords.setVersionNo(value);</span>
     * ImpasseNodeKeywordsCB cb = new ImpasseNodeKeywordsCB();
     * cb.query().setFoo...(value);
     * UpdateOption&lt;ImpasseNodeKeywordsCB&gt; option = new UpdateOption&lt;ImpasseNodeKeywordsCB&gt;();
     * option.self(new SpecifyQuery&lt;ImpasseNodeKeywordsCB&gt;() {
     *     public void specify(ImpasseNodeKeywordsCB cb) {
     *         cb.specify().<span style="color: #FD4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * impasseNodeKeywordsBhv.<span style="color: #FD4747">varyingQueryUpdate</span>(impasseNodeKeywords, cb, option);
     * </pre>
     * @param impasseNodeKeywords The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of ImpasseNodeKeywords. (NotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The updated count.
     * @exception org.seasar.dbflute.exception.NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(
            final ImpasseNodeKeywords impasseNodeKeywords,
            final ImpasseNodeKeywordsCB cb,
            final UpdateOption<ImpasseNodeKeywordsCB> option) {
        assertUpdateOptionNotNull(option);
        return doQueryUpdate(impasseNodeKeywords, cb, option);
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br />
     * For example, allowNonQueryDelete(). <br />
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param cb The condition-bean of ImpasseNodeKeywords. (NotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @exception org.seasar.dbflute.exception.NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(final ImpasseNodeKeywordsCB cb,
            final DeleteOption<ImpasseNodeKeywordsCB> option) {
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
    public OutsideSqlBasicExecutor<ImpasseNodeKeywordsBhv> outsideSql() {
        return doOutsideSql();
    }

    // ===================================================================================
    //                                                                     Delegate Method
    //                                                                     ===============
    // [Behavior Command]
    // -----------------------------------------------------
    //                                                Select
    //                                                ------
    protected int delegateSelectCountUniquely(final ImpasseNodeKeywordsCB cb) {
        return invoke(createSelectCountCBCommand(cb, true));
    }

    protected int delegateSelectCountPlainly(final ImpasseNodeKeywordsCB cb) {
        return invoke(createSelectCountCBCommand(cb, false));
    }

    protected <ENTITY extends ImpasseNodeKeywords> void delegateSelectCursor(
            final ImpasseNodeKeywordsCB cb, final EntityRowHandler<ENTITY> erh,
            final Class<ENTITY> et) {
        invoke(createSelectCursorCBCommand(cb, erh, et));
    }

    protected <ENTITY extends ImpasseNodeKeywords> List<ENTITY> delegateSelectList(
            final ImpasseNodeKeywordsCB cb, final Class<ENTITY> et) {
        return invoke(createSelectListCBCommand(cb, et));
    }

    // -----------------------------------------------------
    //                                                Update
    //                                                ------
    protected int delegateInsert(final ImpasseNodeKeywords e,
            final InsertOption<ImpasseNodeKeywordsCB> op) {
        if (!processBeforeInsert(e, op)) {
            return 0;
        }
        return invoke(createInsertEntityCommand(e, op));
    }

    protected int delegateUpdate(final ImpasseNodeKeywords e,
            final UpdateOption<ImpasseNodeKeywordsCB> op) {
        if (!processBeforeUpdate(e, op)) {
            return 0;
        }
        return delegateUpdateNonstrict(e, op);
    }

    protected int delegateUpdateNonstrict(final ImpasseNodeKeywords e,
            final UpdateOption<ImpasseNodeKeywordsCB> op) {
        if (!processBeforeUpdate(e, op)) {
            return 0;
        }
        return invoke(createUpdateNonstrictEntityCommand(e, op));
    }

    protected int delegateDelete(final ImpasseNodeKeywords e,
            final DeleteOption<ImpasseNodeKeywordsCB> op) {
        if (!processBeforeDelete(e, op)) {
            return 0;
        }
        return delegateDeleteNonstrict(e, op);
    }

    protected int delegateDeleteNonstrict(final ImpasseNodeKeywords e,
            final DeleteOption<ImpasseNodeKeywordsCB> op) {
        if (!processBeforeDelete(e, op)) {
            return 0;
        }
        return invoke(createDeleteNonstrictEntityCommand(e, op));
    }

    protected int[] delegateBatchInsert(final List<ImpasseNodeKeywords> ls,
            final InsertOption<ImpasseNodeKeywordsCB> op) {
        if (ls.isEmpty()) {
            return new int[] {};
        }
        return invoke(createBatchInsertCommand(processBatchInternally(ls, op),
                op));
    }

    protected int[] delegateBatchUpdate(final List<ImpasseNodeKeywords> ls,
            final UpdateOption<ImpasseNodeKeywordsCB> op) {
        if (ls.isEmpty()) {
            return new int[] {};
        }
        return delegateBatchUpdateNonstrict(ls, op);
    }

    protected int[] delegateBatchUpdateNonstrict(
            final List<ImpasseNodeKeywords> ls,
            final UpdateOption<ImpasseNodeKeywordsCB> op) {
        if (ls.isEmpty()) {
            return new int[] {};
        }
        return invoke(createBatchUpdateNonstrictCommand(
                processBatchInternally(ls, op, true), op));
    }

    protected int[] delegateBatchDelete(final List<ImpasseNodeKeywords> ls,
            final DeleteOption<ImpasseNodeKeywordsCB> op) {
        if (ls.isEmpty()) {
            return new int[] {};
        }
        return delegateBatchDeleteNonstrict(ls, op);
    }

    protected int[] delegateBatchDeleteNonstrict(
            final List<ImpasseNodeKeywords> ls,
            final DeleteOption<ImpasseNodeKeywordsCB> op) {
        if (ls.isEmpty()) {
            return new int[] {};
        }
        return invoke(createBatchDeleteNonstrictCommand(
                processBatchInternally(ls, op, true), op));
    }

    protected int delegateQueryInsert(final ImpasseNodeKeywords e,
            final ImpasseNodeKeywordsCB inCB, final ConditionBean resCB,
            final InsertOption<ImpasseNodeKeywordsCB> op) {
        if (!processBeforeQueryInsert(e, inCB, resCB, op)) {
            return 0;
        }
        return invoke(createQueryInsertCBCommand(e, inCB, resCB, op));
    }

    protected int delegateQueryUpdate(final ImpasseNodeKeywords e,
            final ImpasseNodeKeywordsCB cb,
            final UpdateOption<ImpasseNodeKeywordsCB> op) {
        if (!processBeforeQueryUpdate(e, cb, op)) {
            return 0;
        }
        return invoke(createQueryUpdateCBCommand(e, cb, op));
    }

    protected int delegateQueryDelete(final ImpasseNodeKeywordsCB cb,
            final DeleteOption<ImpasseNodeKeywordsCB> op) {
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
    protected ImpasseNodeKeywords downcast(final Entity entity) {
        return helpEntityDowncastInternally(entity, ImpasseNodeKeywords.class);
    }

    protected ImpasseNodeKeywordsCB downcast(final ConditionBean cb) {
        return helpConditionBeanDowncastInternally(cb,
                ImpasseNodeKeywordsCB.class);
    }

    @SuppressWarnings("unchecked")
    protected List<ImpasseNodeKeywords> downcast(
            final List<? extends Entity> entityList) {
        return (List<ImpasseNodeKeywords>) entityList;
    }

    @SuppressWarnings("unchecked")
    protected InsertOption<ImpasseNodeKeywordsCB> downcast(
            final InsertOption<? extends ConditionBean> option) {
        return (InsertOption<ImpasseNodeKeywordsCB>) option;
    }

    @SuppressWarnings("unchecked")
    protected UpdateOption<ImpasseNodeKeywordsCB> downcast(
            final UpdateOption<? extends ConditionBean> option) {
        return (UpdateOption<ImpasseNodeKeywordsCB>) option;
    }

    @SuppressWarnings("unchecked")
    protected DeleteOption<ImpasseNodeKeywordsCB> downcast(
            final DeleteOption<? extends ConditionBean> option) {
        return (DeleteOption<ImpasseNodeKeywordsCB>) option;
    }

    @SuppressWarnings("unchecked")
    protected QueryInsertSetupper<ImpasseNodeKeywords, ImpasseNodeKeywordsCB> downcast(
            final QueryInsertSetupper<? extends Entity, ? extends ConditionBean> option) {
        return (QueryInsertSetupper<ImpasseNodeKeywords, ImpasseNodeKeywordsCB>) option;
    }
}
