package net.marevol.redmine.impasse.db.allcommon;

import org.seasar.dbflute.DBDef;
import org.seasar.dbflute.cbean.ConditionBean;
import org.seasar.dbflute.cbean.cipher.GearedCipherManager;
import org.seasar.dbflute.cbean.sqlclause.AbstractSqlClause;
import org.seasar.dbflute.cbean.sqlclause.SqlClause;
import org.seasar.dbflute.cbean.sqlclause.SqlClauseCreator;
import org.seasar.dbflute.cbean.sqlclause.SqlClauseDb2;
import org.seasar.dbflute.cbean.sqlclause.SqlClauseDefault;
import org.seasar.dbflute.cbean.sqlclause.SqlClauseDerby;
import org.seasar.dbflute.cbean.sqlclause.SqlClauseFirebird;
import org.seasar.dbflute.cbean.sqlclause.SqlClauseH2;
import org.seasar.dbflute.cbean.sqlclause.SqlClauseMsAccess;
import org.seasar.dbflute.cbean.sqlclause.SqlClauseMySql;
import org.seasar.dbflute.cbean.sqlclause.SqlClauseOracle;
import org.seasar.dbflute.cbean.sqlclause.SqlClausePostgreSql;
import org.seasar.dbflute.cbean.sqlclause.SqlClauseSqlServer;
import org.seasar.dbflute.cbean.sqlclause.SqlClauseSqlite;
import org.seasar.dbflute.cbean.sqlclause.SqlClauseSybase;
import org.seasar.dbflute.dbmeta.DBMetaProvider;

/**
 * The creator of SQL clause.
 * @author DBFlute(AutoGenerator)
 */
public class ImplementedSqlClauseCreator implements SqlClauseCreator {

    // ===================================================================================
    //                                                                      Implementation
    //                                                                      ==============
    /**
     * Create SQL clause. {for condition-bean}
     * @param cb Condition-bean. (NotNull) 
     * @return SQL clause. (NotNull)
     */
    @Override
    public SqlClause createSqlClause(final ConditionBean cb) {
        final String tableDbName = cb.getTableDbName();
        final SqlClause sqlClause = createSqlClause(tableDbName);
        return sqlClause;
    }

    /**
     * Create SQL clause.
     * @param tableDbName The DB name of table. (NotNull) 
     * @return SQL clause. (NotNull)
     */
    @Override
    public SqlClause createSqlClause(final String tableDbName) {
        final SqlClause sqlClause = doCreateSqlClause(tableDbName);
        setupSqlClauseOption(sqlClause);
        return sqlClause;
    }

    // ===================================================================================
    //                                                                            Creation
    //                                                                            ========
    protected SqlClause doCreateSqlClause(final String tableDbName) {
        AbstractSqlClause sqlClause; // dynamic resolution but no perfect (almost static)
        if (isCurrentDBDef(DBDef.MySQL)) {
            sqlClause = createSqlClauseMySql(tableDbName);
        } else if (isCurrentDBDef(DBDef.PostgreSQL)) {
            sqlClause = createSqlClausePostgreSql(tableDbName);
        } else if (isCurrentDBDef(DBDef.Oracle)) {
            sqlClause = createSqlClauseOracle(tableDbName);
        } else if (isCurrentDBDef(DBDef.DB2)) {
            sqlClause = createSqlClauseDb2(tableDbName);
        } else if (isCurrentDBDef(DBDef.SQLServer)) {
            sqlClause = createSqlClauseSqlServer(tableDbName);
        } else if (isCurrentDBDef(DBDef.H2)) {
            sqlClause = createSqlClauseH2(tableDbName);
        } else if (isCurrentDBDef(DBDef.Derby)) {
            sqlClause = createSqlClauseDerby(tableDbName);
        } else if (isCurrentDBDef(DBDef.SQLite)) {
            sqlClause = createSqlClauseSqlite(tableDbName);
        } else if (isCurrentDBDef(DBDef.MSAccess)) {
            sqlClause = createSqlClauseMsAccess(tableDbName);
        } else if (isCurrentDBDef(DBDef.FireBird)) {
            sqlClause = createSqlClauseFirebird(tableDbName);
        } else if (isCurrentDBDef(DBDef.Sybase)) {
            sqlClause = createSqlClauseSybase(tableDbName);
        } else {
            // as the database when generating
            sqlClause = createSqlClauseMySql(tableDbName);
        }
        prepareSupporterComponent(sqlClause);
        return sqlClause;
    }

    protected SqlClauseMySql createSqlClauseMySql(final String tableDbName) {
        return new SqlClauseMySql(tableDbName);
    }

    protected SqlClausePostgreSql createSqlClausePostgreSql(
            final String tableDbName) {
        return new SqlClausePostgreSql(tableDbName);
    }

    protected SqlClauseOracle createSqlClauseOracle(final String tableDbName) {
        return new SqlClauseOracle(tableDbName);
    }

    protected SqlClauseDb2 createSqlClauseDb2(final String tableDbName) {
        return new SqlClauseDb2(tableDbName);
    }

    protected SqlClauseSqlServer createSqlClauseSqlServer(
            final String tableDbName) {
        return new SqlClauseSqlServer(tableDbName);
    }

    protected SqlClauseH2 createSqlClauseH2(final String tableDbName) {
        return new SqlClauseH2(tableDbName);
    }

    protected SqlClauseDerby createSqlClauseDerby(final String tableDbName) {
        return new SqlClauseDerby(tableDbName);
    }

    protected SqlClauseSqlite createSqlClauseSqlite(final String tableDbName) {
        return new SqlClauseSqlite(tableDbName);
    }

    protected SqlClauseMsAccess createSqlClauseMsAccess(final String tableDbName) {
        return new SqlClauseMsAccess(tableDbName);
    }

    protected SqlClauseFirebird createSqlClauseFirebird(final String tableDbName) {
        return new SqlClauseFirebird(tableDbName);
    }

    protected SqlClauseSybase createSqlClauseSybase(final String tableDbName) {
        return new SqlClauseSybase(tableDbName);
    }

    protected SqlClause createSqlClauseDefault(final String tableDbName) {
        return new SqlClauseDefault(tableDbName);
    }

    protected void prepareSupporterComponent(final AbstractSqlClause sqlClause) {
        sqlClause.dbmetaProvider(getDBMetaProvider()).cipherManager(
                getGearedCipherManager());
    }

    // ===================================================================================
    //                                                                           Supporter
    //                                                                           =========
    protected DBMetaProvider getDBMetaProvider() {
        return DBMetaInstanceHandler.getProvider();
    }

    protected GearedCipherManager getGearedCipherManager() {
        return DBFluteConfig.getInstance().getGearedCipherManager();
    }

    // ===================================================================================
    //                                                                              Option
    //                                                                              ======
    protected void setupSqlClauseOption(final SqlClause sqlClause) {
        if (isInnerJoinAutoDetect()) {
            sqlClause.allowInnerJoinAutoDetect();
        }
        if (isEmptyStringQueryAllowed()) {
            sqlClause.allowEmptyStringQuery();
        }
        if (isInvalidQueryChecked()) {
            sqlClause.checkInvalidQuery();
        }
        if (isDisableSelectIndex()) {
            sqlClause.disableSelectIndex();
        }
    }

    // ===================================================================================
    //                                                                       Determination
    //                                                                       =============
    protected boolean isCurrentDBDef(final DBDef currentDBDef) {
        return DBCurrent.getInstance().isCurrentDBDef(currentDBDef);
    }

    protected boolean isInnerJoinAutoDetect() {
        return DBFluteConfig.getInstance().isInnerJoinAutoDetect();
    }

    protected boolean isEmptyStringQueryAllowed() {
        return DBFluteConfig.getInstance().isEmptyStringQueryAllowed();
    }

    protected boolean isInvalidQueryChecked() {
        return DBFluteConfig.getInstance().isInvalidQueryChecked();
    }

    protected boolean isDisableSelectIndex() {
        return DBFluteConfig.getInstance().isDisableSelectIndex();
    }
}
