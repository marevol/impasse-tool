package net.marevol.redmine.impasse.db.cbean.cq.bs;

import java.util.Collection;

import net.marevol.redmine.impasse.db.allcommon.DBMetaInstanceHandler;
import net.marevol.redmine.impasse.db.cbean.UsersCB;
import net.marevol.redmine.impasse.db.cbean.cq.UsersCQ;

import org.seasar.dbflute.cbean.AbstractConditionQuery;
import org.seasar.dbflute.cbean.ConditionQuery;
import org.seasar.dbflute.cbean.SubQuery;
import org.seasar.dbflute.cbean.chelper.HpQDRFunction;
import org.seasar.dbflute.cbean.chelper.HpQDRSetupper;
import org.seasar.dbflute.cbean.chelper.HpSSQFunction;
import org.seasar.dbflute.cbean.chelper.HpSSQOption;
import org.seasar.dbflute.cbean.chelper.HpSSQSetupper;
import org.seasar.dbflute.cbean.ckey.ConditionKey;
import org.seasar.dbflute.cbean.coption.DateFromToOption;
import org.seasar.dbflute.cbean.coption.DerivedReferrerOption;
import org.seasar.dbflute.cbean.coption.FromToOption;
import org.seasar.dbflute.cbean.coption.LikeSearchOption;
import org.seasar.dbflute.cbean.coption.RangeOfOption;
import org.seasar.dbflute.cbean.cvalue.ConditionValue;
import org.seasar.dbflute.cbean.sqlclause.SqlClause;
import org.seasar.dbflute.dbmeta.DBMetaProvider;

/**
 * The abstract condition-query of users.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsUsersCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsUsersCQ(final ConditionQuery childQuery,
            final SqlClause sqlClause, final String aliasName,
            final int nestLevel) {
        super(childQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                     DBMeta Provider
    //                                                                     ===============
    @Override
    protected DBMetaProvider xgetDBMetaProvider() {
        return DBMetaInstanceHandler.getProvider();
    }

    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    @Override
    public String getTableDbName() {
        return "users";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * id: {PK, ID, IX, NotNull, INT(10)}
     * @param id The value of id as equal.
     */
    public void setId_Equal(final Integer id) {
        doSetId_Equal(id);
    }

    protected void doSetId_Equal(final Integer id) {
        regId(CK_EQ, id);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * id: {PK, ID, IX, NotNull, INT(10)}
     * @param id The value of id as notEqual.
     */
    public void setId_NotEqual(final Integer id) {
        doSetId_NotEqual(id);
    }

    protected void doSetId_NotEqual(final Integer id) {
        regId(CK_NES, id);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * id: {PK, ID, IX, NotNull, INT(10)}
     * @param id The value of id as greaterThan.
     */
    public void setId_GreaterThan(final Integer id) {
        regId(CK_GT, id);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * id: {PK, ID, IX, NotNull, INT(10)}
     * @param id The value of id as lessThan.
     */
    public void setId_LessThan(final Integer id) {
        regId(CK_LT, id);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * id: {PK, ID, IX, NotNull, INT(10)}
     * @param id The value of id as greaterEqual.
     */
    public void setId_GreaterEqual(final Integer id) {
        regId(CK_GE, id);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * id: {PK, ID, IX, NotNull, INT(10)}
     * @param id The value of id as lessEqual.
     */
    public void setId_LessEqual(final Integer id) {
        regId(CK_LE, id);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * id: {PK, ID, IX, NotNull, INT(10)}
     * @param minNumber The min number of id. (NullAllowed)
     * @param maxNumber The max number of id. (NullAllowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setId_RangeOf(final Integer minNumber, final Integer maxNumber,
            final RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueId(), "id", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * id: {PK, ID, IX, NotNull, INT(10)}
     * @param idList The collection of id as inScope.
     */
    public void setId_InScope(final Collection<Integer> idList) {
        doSetId_InScope(idList);
    }

    protected void doSetId_InScope(final Collection<Integer> idList) {
        regINS(CK_INS, cTL(idList), getCValueId(), "id");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * id: {PK, ID, IX, NotNull, INT(10)}
     * @param idList The collection of id as notInScope.
     */
    public void setId_NotInScope(final Collection<Integer> idList) {
        doSetId_NotInScope(idList);
    }

    protected void doSetId_NotInScope(final Collection<Integer> idList) {
        regINS(CK_NINS, cTL(idList), getCValueId(), "id");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * id: {PK, ID, IX, NotNull, INT(10)}
     */
    public void setId_IsNull() {
        regId(CK_ISN, DOBJ);
    }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * id: {PK, ID, IX, NotNull, INT(10)}
     */
    public void setId_IsNotNull() {
        regId(CK_ISNN, DOBJ);
    }

    protected void regId(final ConditionKey k, final Object v) {
        regQ(k, v, getCValueId(), "id");
    }

    abstract protected ConditionValue getCValueId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * login: {NotNull, VARCHAR(255)}
     * @param login The value of login as equal.
     */
    public void setLogin_Equal(final String login) {
        doSetLogin_Equal(fRES(login));
    }

    protected void doSetLogin_Equal(final String login) {
        regLogin(CK_EQ, login);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * login: {NotNull, VARCHAR(255)}
     * @param login The value of login as notEqual.
     */
    public void setLogin_NotEqual(final String login) {
        doSetLogin_NotEqual(fRES(login));
    }

    protected void doSetLogin_NotEqual(final String login) {
        regLogin(CK_NES, login);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * login: {NotNull, VARCHAR(255)}
     * @param login The value of login as greaterThan.
     */
    public void setLogin_GreaterThan(final String login) {
        regLogin(CK_GT, fRES(login));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * login: {NotNull, VARCHAR(255)}
     * @param login The value of login as lessThan.
     */
    public void setLogin_LessThan(final String login) {
        regLogin(CK_LT, fRES(login));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * login: {NotNull, VARCHAR(255)}
     * @param login The value of login as greaterEqual.
     */
    public void setLogin_GreaterEqual(final String login) {
        regLogin(CK_GE, fRES(login));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * login: {NotNull, VARCHAR(255)}
     * @param login The value of login as lessEqual.
     */
    public void setLogin_LessEqual(final String login) {
        regLogin(CK_LE, fRES(login));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * login: {NotNull, VARCHAR(255)}
     * @param loginList The collection of login as inScope.
     */
    public void setLogin_InScope(final Collection<String> loginList) {
        doSetLogin_InScope(loginList);
    }

    public void doSetLogin_InScope(final Collection<String> loginList) {
        regINS(CK_INS, cTL(loginList), getCValueLogin(), "login");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * login: {NotNull, VARCHAR(255)}
     * @param loginList The collection of login as notInScope.
     */
    public void setLogin_NotInScope(final Collection<String> loginList) {
        doSetLogin_NotInScope(loginList);
    }

    public void doSetLogin_NotInScope(final Collection<String> loginList) {
        regINS(CK_NINS, cTL(loginList), getCValueLogin(), "login");
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * login: {NotNull, VARCHAR(255)}
     * @param login The value of login as prefixSearch.
     */
    public void setLogin_PrefixSearch(final String login) {
        setLogin_LikeSearch(login, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * login: {NotNull, VARCHAR(255)}
     * @param login The value of login as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setLogin_LikeSearch(final String login,
            final LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(login), getCValueLogin(), "login", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * login: {NotNull, VARCHAR(255)}
     * @param login The value of login as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setLogin_NotLikeSearch(final String login,
            final LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(login), getCValueLogin(), "login", likeSearchOption);
    }

    protected void regLogin(final ConditionKey k, final Object v) {
        regQ(k, v, getCValueLogin(), "login");
    }

    abstract protected ConditionValue getCValueLogin();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * hashed_password: {NotNull, VARCHAR(40)}
     * @param hashedPassword The value of hashedPassword as equal.
     */
    public void setHashedPassword_Equal(final String hashedPassword) {
        doSetHashedPassword_Equal(fRES(hashedPassword));
    }

    protected void doSetHashedPassword_Equal(final String hashedPassword) {
        regHashedPassword(CK_EQ, hashedPassword);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * hashed_password: {NotNull, VARCHAR(40)}
     * @param hashedPassword The value of hashedPassword as notEqual.
     */
    public void setHashedPassword_NotEqual(final String hashedPassword) {
        doSetHashedPassword_NotEqual(fRES(hashedPassword));
    }

    protected void doSetHashedPassword_NotEqual(final String hashedPassword) {
        regHashedPassword(CK_NES, hashedPassword);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * hashed_password: {NotNull, VARCHAR(40)}
     * @param hashedPassword The value of hashedPassword as greaterThan.
     */
    public void setHashedPassword_GreaterThan(final String hashedPassword) {
        regHashedPassword(CK_GT, fRES(hashedPassword));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * hashed_password: {NotNull, VARCHAR(40)}
     * @param hashedPassword The value of hashedPassword as lessThan.
     */
    public void setHashedPassword_LessThan(final String hashedPassword) {
        regHashedPassword(CK_LT, fRES(hashedPassword));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * hashed_password: {NotNull, VARCHAR(40)}
     * @param hashedPassword The value of hashedPassword as greaterEqual.
     */
    public void setHashedPassword_GreaterEqual(final String hashedPassword) {
        regHashedPassword(CK_GE, fRES(hashedPassword));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * hashed_password: {NotNull, VARCHAR(40)}
     * @param hashedPassword The value of hashedPassword as lessEqual.
     */
    public void setHashedPassword_LessEqual(final String hashedPassword) {
        regHashedPassword(CK_LE, fRES(hashedPassword));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * hashed_password: {NotNull, VARCHAR(40)}
     * @param hashedPasswordList The collection of hashedPassword as inScope.
     */
    public void setHashedPassword_InScope(
            final Collection<String> hashedPasswordList) {
        doSetHashedPassword_InScope(hashedPasswordList);
    }

    public void doSetHashedPassword_InScope(
            final Collection<String> hashedPasswordList) {
        regINS(CK_INS, cTL(hashedPasswordList), getCValueHashedPassword(),
                "hashed_password");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * hashed_password: {NotNull, VARCHAR(40)}
     * @param hashedPasswordList The collection of hashedPassword as notInScope.
     */
    public void setHashedPassword_NotInScope(
            final Collection<String> hashedPasswordList) {
        doSetHashedPassword_NotInScope(hashedPasswordList);
    }

    public void doSetHashedPassword_NotInScope(
            final Collection<String> hashedPasswordList) {
        regINS(CK_NINS, cTL(hashedPasswordList), getCValueHashedPassword(),
                "hashed_password");
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * hashed_password: {NotNull, VARCHAR(40)}
     * @param hashedPassword The value of hashedPassword as prefixSearch.
     */
    public void setHashedPassword_PrefixSearch(final String hashedPassword) {
        setHashedPassword_LikeSearch(hashedPassword, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * hashed_password: {NotNull, VARCHAR(40)}
     * @param hashedPassword The value of hashedPassword as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setHashedPassword_LikeSearch(final String hashedPassword,
            final LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(hashedPassword), getCValueHashedPassword(),
                "hashed_password", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * hashed_password: {NotNull, VARCHAR(40)}
     * @param hashedPassword The value of hashedPassword as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setHashedPassword_NotLikeSearch(final String hashedPassword,
            final LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(hashedPassword), getCValueHashedPassword(),
                "hashed_password", likeSearchOption);
    }

    protected void regHashedPassword(final ConditionKey k, final Object v) {
        regQ(k, v, getCValueHashedPassword(), "hashed_password");
    }

    abstract protected ConditionValue getCValueHashedPassword();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * firstname: {NotNull, VARCHAR(30)}
     * @param firstname The value of firstname as equal.
     */
    public void setFirstname_Equal(final String firstname) {
        doSetFirstname_Equal(fRES(firstname));
    }

    protected void doSetFirstname_Equal(final String firstname) {
        regFirstname(CK_EQ, firstname);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * firstname: {NotNull, VARCHAR(30)}
     * @param firstname The value of firstname as notEqual.
     */
    public void setFirstname_NotEqual(final String firstname) {
        doSetFirstname_NotEqual(fRES(firstname));
    }

    protected void doSetFirstname_NotEqual(final String firstname) {
        regFirstname(CK_NES, firstname);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * firstname: {NotNull, VARCHAR(30)}
     * @param firstname The value of firstname as greaterThan.
     */
    public void setFirstname_GreaterThan(final String firstname) {
        regFirstname(CK_GT, fRES(firstname));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * firstname: {NotNull, VARCHAR(30)}
     * @param firstname The value of firstname as lessThan.
     */
    public void setFirstname_LessThan(final String firstname) {
        regFirstname(CK_LT, fRES(firstname));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * firstname: {NotNull, VARCHAR(30)}
     * @param firstname The value of firstname as greaterEqual.
     */
    public void setFirstname_GreaterEqual(final String firstname) {
        regFirstname(CK_GE, fRES(firstname));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * firstname: {NotNull, VARCHAR(30)}
     * @param firstname The value of firstname as lessEqual.
     */
    public void setFirstname_LessEqual(final String firstname) {
        regFirstname(CK_LE, fRES(firstname));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * firstname: {NotNull, VARCHAR(30)}
     * @param firstnameList The collection of firstname as inScope.
     */
    public void setFirstname_InScope(final Collection<String> firstnameList) {
        doSetFirstname_InScope(firstnameList);
    }

    public void doSetFirstname_InScope(final Collection<String> firstnameList) {
        regINS(CK_INS, cTL(firstnameList), getCValueFirstname(), "firstname");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * firstname: {NotNull, VARCHAR(30)}
     * @param firstnameList The collection of firstname as notInScope.
     */
    public void setFirstname_NotInScope(final Collection<String> firstnameList) {
        doSetFirstname_NotInScope(firstnameList);
    }

    public void doSetFirstname_NotInScope(final Collection<String> firstnameList) {
        regINS(CK_NINS, cTL(firstnameList), getCValueFirstname(), "firstname");
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * firstname: {NotNull, VARCHAR(30)}
     * @param firstname The value of firstname as prefixSearch.
     */
    public void setFirstname_PrefixSearch(final String firstname) {
        setFirstname_LikeSearch(firstname, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * firstname: {NotNull, VARCHAR(30)}
     * @param firstname The value of firstname as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setFirstname_LikeSearch(final String firstname,
            final LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(firstname), getCValueFirstname(), "firstname",
                likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * firstname: {NotNull, VARCHAR(30)}
     * @param firstname The value of firstname as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setFirstname_NotLikeSearch(final String firstname,
            final LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(firstname), getCValueFirstname(), "firstname",
                likeSearchOption);
    }

    protected void regFirstname(final ConditionKey k, final Object v) {
        regQ(k, v, getCValueFirstname(), "firstname");
    }

    abstract protected ConditionValue getCValueFirstname();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * lastname: {NotNull, VARCHAR(30)}
     * @param lastname The value of lastname as equal.
     */
    public void setLastname_Equal(final String lastname) {
        doSetLastname_Equal(fRES(lastname));
    }

    protected void doSetLastname_Equal(final String lastname) {
        regLastname(CK_EQ, lastname);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * lastname: {NotNull, VARCHAR(30)}
     * @param lastname The value of lastname as notEqual.
     */
    public void setLastname_NotEqual(final String lastname) {
        doSetLastname_NotEqual(fRES(lastname));
    }

    protected void doSetLastname_NotEqual(final String lastname) {
        regLastname(CK_NES, lastname);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * lastname: {NotNull, VARCHAR(30)}
     * @param lastname The value of lastname as greaterThan.
     */
    public void setLastname_GreaterThan(final String lastname) {
        regLastname(CK_GT, fRES(lastname));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * lastname: {NotNull, VARCHAR(30)}
     * @param lastname The value of lastname as lessThan.
     */
    public void setLastname_LessThan(final String lastname) {
        regLastname(CK_LT, fRES(lastname));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * lastname: {NotNull, VARCHAR(30)}
     * @param lastname The value of lastname as greaterEqual.
     */
    public void setLastname_GreaterEqual(final String lastname) {
        regLastname(CK_GE, fRES(lastname));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * lastname: {NotNull, VARCHAR(30)}
     * @param lastname The value of lastname as lessEqual.
     */
    public void setLastname_LessEqual(final String lastname) {
        regLastname(CK_LE, fRES(lastname));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * lastname: {NotNull, VARCHAR(30)}
     * @param lastnameList The collection of lastname as inScope.
     */
    public void setLastname_InScope(final Collection<String> lastnameList) {
        doSetLastname_InScope(lastnameList);
    }

    public void doSetLastname_InScope(final Collection<String> lastnameList) {
        regINS(CK_INS, cTL(lastnameList), getCValueLastname(), "lastname");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * lastname: {NotNull, VARCHAR(30)}
     * @param lastnameList The collection of lastname as notInScope.
     */
    public void setLastname_NotInScope(final Collection<String> lastnameList) {
        doSetLastname_NotInScope(lastnameList);
    }

    public void doSetLastname_NotInScope(final Collection<String> lastnameList) {
        regINS(CK_NINS, cTL(lastnameList), getCValueLastname(), "lastname");
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * lastname: {NotNull, VARCHAR(30)}
     * @param lastname The value of lastname as prefixSearch.
     */
    public void setLastname_PrefixSearch(final String lastname) {
        setLastname_LikeSearch(lastname, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * lastname: {NotNull, VARCHAR(30)}
     * @param lastname The value of lastname as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setLastname_LikeSearch(final String lastname,
            final LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(lastname), getCValueLastname(), "lastname",
                likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * lastname: {NotNull, VARCHAR(30)}
     * @param lastname The value of lastname as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setLastname_NotLikeSearch(final String lastname,
            final LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(lastname), getCValueLastname(), "lastname",
                likeSearchOption);
    }

    protected void regLastname(final ConditionKey k, final Object v) {
        regQ(k, v, getCValueLastname(), "lastname");
    }

    abstract protected ConditionValue getCValueLastname();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * mail: {NotNull, VARCHAR(60)}
     * @param mail The value of mail as equal.
     */
    public void setMail_Equal(final String mail) {
        doSetMail_Equal(fRES(mail));
    }

    protected void doSetMail_Equal(final String mail) {
        regMail(CK_EQ, mail);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * mail: {NotNull, VARCHAR(60)}
     * @param mail The value of mail as notEqual.
     */
    public void setMail_NotEqual(final String mail) {
        doSetMail_NotEqual(fRES(mail));
    }

    protected void doSetMail_NotEqual(final String mail) {
        regMail(CK_NES, mail);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * mail: {NotNull, VARCHAR(60)}
     * @param mail The value of mail as greaterThan.
     */
    public void setMail_GreaterThan(final String mail) {
        regMail(CK_GT, fRES(mail));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * mail: {NotNull, VARCHAR(60)}
     * @param mail The value of mail as lessThan.
     */
    public void setMail_LessThan(final String mail) {
        regMail(CK_LT, fRES(mail));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * mail: {NotNull, VARCHAR(60)}
     * @param mail The value of mail as greaterEqual.
     */
    public void setMail_GreaterEqual(final String mail) {
        regMail(CK_GE, fRES(mail));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * mail: {NotNull, VARCHAR(60)}
     * @param mail The value of mail as lessEqual.
     */
    public void setMail_LessEqual(final String mail) {
        regMail(CK_LE, fRES(mail));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * mail: {NotNull, VARCHAR(60)}
     * @param mailList The collection of mail as inScope.
     */
    public void setMail_InScope(final Collection<String> mailList) {
        doSetMail_InScope(mailList);
    }

    public void doSetMail_InScope(final Collection<String> mailList) {
        regINS(CK_INS, cTL(mailList), getCValueMail(), "mail");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * mail: {NotNull, VARCHAR(60)}
     * @param mailList The collection of mail as notInScope.
     */
    public void setMail_NotInScope(final Collection<String> mailList) {
        doSetMail_NotInScope(mailList);
    }

    public void doSetMail_NotInScope(final Collection<String> mailList) {
        regINS(CK_NINS, cTL(mailList), getCValueMail(), "mail");
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * mail: {NotNull, VARCHAR(60)}
     * @param mail The value of mail as prefixSearch.
     */
    public void setMail_PrefixSearch(final String mail) {
        setMail_LikeSearch(mail, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * mail: {NotNull, VARCHAR(60)}
     * @param mail The value of mail as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setMail_LikeSearch(final String mail,
            final LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(mail), getCValueMail(), "mail", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * mail: {NotNull, VARCHAR(60)}
     * @param mail The value of mail as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setMail_NotLikeSearch(final String mail,
            final LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(mail), getCValueMail(), "mail", likeSearchOption);
    }

    protected void regMail(final ConditionKey k, final Object v) {
        regQ(k, v, getCValueMail(), "mail");
    }

    abstract protected ConditionValue getCValueMail();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * admin: {NotNull, BIT, default=[0]}
     * @param admin The value of admin as equal.
     */
    public void setAdmin_Equal(final Boolean admin) {
        regAdmin(CK_EQ, admin);
    }

    protected void regAdmin(final ConditionKey k, final Object v) {
        regQ(k, v, getCValueAdmin(), "admin");
    }

    abstract protected ConditionValue getCValueAdmin();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * status: {NotNull, INT(10), default=[1]}
     * @param status The value of status as equal.
     */
    public void setStatus_Equal(final Integer status) {
        doSetStatus_Equal(status);
    }

    protected void doSetStatus_Equal(final Integer status) {
        regStatus(CK_EQ, status);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * status: {NotNull, INT(10), default=[1]}
     * @param status The value of status as notEqual.
     */
    public void setStatus_NotEqual(final Integer status) {
        doSetStatus_NotEqual(status);
    }

    protected void doSetStatus_NotEqual(final Integer status) {
        regStatus(CK_NES, status);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * status: {NotNull, INT(10), default=[1]}
     * @param status The value of status as greaterThan.
     */
    public void setStatus_GreaterThan(final Integer status) {
        regStatus(CK_GT, status);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * status: {NotNull, INT(10), default=[1]}
     * @param status The value of status as lessThan.
     */
    public void setStatus_LessThan(final Integer status) {
        regStatus(CK_LT, status);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * status: {NotNull, INT(10), default=[1]}
     * @param status The value of status as greaterEqual.
     */
    public void setStatus_GreaterEqual(final Integer status) {
        regStatus(CK_GE, status);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * status: {NotNull, INT(10), default=[1]}
     * @param status The value of status as lessEqual.
     */
    public void setStatus_LessEqual(final Integer status) {
        regStatus(CK_LE, status);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * status: {NotNull, INT(10), default=[1]}
     * @param minNumber The min number of status. (NullAllowed)
     * @param maxNumber The max number of status. (NullAllowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setStatus_RangeOf(final Integer minNumber,
            final Integer maxNumber, final RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueStatus(), "status", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * status: {NotNull, INT(10), default=[1]}
     * @param statusList The collection of status as inScope.
     */
    public void setStatus_InScope(final Collection<Integer> statusList) {
        doSetStatus_InScope(statusList);
    }

    protected void doSetStatus_InScope(final Collection<Integer> statusList) {
        regINS(CK_INS, cTL(statusList), getCValueStatus(), "status");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * status: {NotNull, INT(10), default=[1]}
     * @param statusList The collection of status as notInScope.
     */
    public void setStatus_NotInScope(final Collection<Integer> statusList) {
        doSetStatus_NotInScope(statusList);
    }

    protected void doSetStatus_NotInScope(final Collection<Integer> statusList) {
        regINS(CK_NINS, cTL(statusList), getCValueStatus(), "status");
    }

    protected void regStatus(final ConditionKey k, final Object v) {
        regQ(k, v, getCValueStatus(), "status");
    }

    abstract protected ConditionValue getCValueStatus();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * last_login_on: {DATETIME(19)}
     * @param lastLoginOn The value of lastLoginOn as equal.
     */
    public void setLastLoginOn_Equal(final java.sql.Timestamp lastLoginOn) {
        regLastLoginOn(CK_EQ, lastLoginOn);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * last_login_on: {DATETIME(19)}
     * @param lastLoginOn The value of lastLoginOn as greaterThan.
     */
    public void setLastLoginOn_GreaterThan(final java.sql.Timestamp lastLoginOn) {
        regLastLoginOn(CK_GT, lastLoginOn);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * last_login_on: {DATETIME(19)}
     * @param lastLoginOn The value of lastLoginOn as lessThan.
     */
    public void setLastLoginOn_LessThan(final java.sql.Timestamp lastLoginOn) {
        regLastLoginOn(CK_LT, lastLoginOn);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * last_login_on: {DATETIME(19)}
     * @param lastLoginOn The value of lastLoginOn as greaterEqual.
     */
    public void setLastLoginOn_GreaterEqual(final java.sql.Timestamp lastLoginOn) {
        regLastLoginOn(CK_GE, lastLoginOn);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * last_login_on: {DATETIME(19)}
     * @param lastLoginOn The value of lastLoginOn as lessEqual.
     */
    public void setLastLoginOn_LessEqual(final java.sql.Timestamp lastLoginOn) {
        regLastLoginOn(CK_LE, lastLoginOn);
    }

    /**
     * FromTo with various options. (versatile) <br />
     * {(default) fromDatetime &lt;= column &lt;= toDatetime} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * last_login_on: {DATETIME(19)}
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of lastLoginOn. (NullAllowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of lastLoginOn. (NullAllowed)
     * @param fromToOption The option of from-to. (NotNull)
     */
    public void setLastLoginOn_FromTo(final java.util.Date fromDatetime,
            final java.util.Date toDatetime, final FromToOption fromToOption) {
        regFTQ(fromDatetime != null ? new java.sql.Timestamp(
                fromDatetime.getTime()) : null,
                toDatetime != null ? new java.sql.Timestamp(toDatetime
                        .getTime()) : null, getCValueLastLoginOn(),
                "last_login_on", fromToOption);
    }

    /**
     * DateFromTo. (Date means yyyy/MM/dd) <br />
     * {fromDate &lt;= column &lt; toDate + 1 day} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * last_login_on: {DATETIME(19)}
     * <pre>
     * e.g. from:{2007/04/10 08:24:53} to:{2007/04/16 14:36:29}
     *  --&gt; column &gt;= '2007/04/10 00:00:00'
     *  and column <span style="color: #FD4747">&lt; '2007/04/17 00:00:00'</span>
     * </pre>
     * @param fromDate The from-date(yyyy/MM/dd) of lastLoginOn. (NullAllowed)
     * @param toDate The to-date(yyyy/MM/dd) of lastLoginOn. (NullAllowed)
     */
    public void setLastLoginOn_DateFromTo(final java.util.Date fromDate,
            final java.util.Date toDate) {
        setLastLoginOn_FromTo(fromDate, toDate, new DateFromToOption());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * last_login_on: {DATETIME(19)}
     */
    public void setLastLoginOn_IsNull() {
        regLastLoginOn(CK_ISN, DOBJ);
    }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * last_login_on: {DATETIME(19)}
     */
    public void setLastLoginOn_IsNotNull() {
        regLastLoginOn(CK_ISNN, DOBJ);
    }

    protected void regLastLoginOn(final ConditionKey k, final Object v) {
        regQ(k, v, getCValueLastLoginOn(), "last_login_on");
    }

    abstract protected ConditionValue getCValueLastLoginOn();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * language: {VARCHAR(5)}
     * @param language The value of language as equal.
     */
    public void setLanguage_Equal(final String language) {
        doSetLanguage_Equal(fRES(language));
    }

    protected void doSetLanguage_Equal(final String language) {
        regLanguage(CK_EQ, language);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * language: {VARCHAR(5)}
     * @param language The value of language as notEqual.
     */
    public void setLanguage_NotEqual(final String language) {
        doSetLanguage_NotEqual(fRES(language));
    }

    protected void doSetLanguage_NotEqual(final String language) {
        regLanguage(CK_NES, language);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * language: {VARCHAR(5)}
     * @param language The value of language as greaterThan.
     */
    public void setLanguage_GreaterThan(final String language) {
        regLanguage(CK_GT, fRES(language));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * language: {VARCHAR(5)}
     * @param language The value of language as lessThan.
     */
    public void setLanguage_LessThan(final String language) {
        regLanguage(CK_LT, fRES(language));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * language: {VARCHAR(5)}
     * @param language The value of language as greaterEqual.
     */
    public void setLanguage_GreaterEqual(final String language) {
        regLanguage(CK_GE, fRES(language));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * language: {VARCHAR(5)}
     * @param language The value of language as lessEqual.
     */
    public void setLanguage_LessEqual(final String language) {
        regLanguage(CK_LE, fRES(language));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * language: {VARCHAR(5)}
     * @param languageList The collection of language as inScope.
     */
    public void setLanguage_InScope(final Collection<String> languageList) {
        doSetLanguage_InScope(languageList);
    }

    public void doSetLanguage_InScope(final Collection<String> languageList) {
        regINS(CK_INS, cTL(languageList), getCValueLanguage(), "language");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * language: {VARCHAR(5)}
     * @param languageList The collection of language as notInScope.
     */
    public void setLanguage_NotInScope(final Collection<String> languageList) {
        doSetLanguage_NotInScope(languageList);
    }

    public void doSetLanguage_NotInScope(final Collection<String> languageList) {
        regINS(CK_NINS, cTL(languageList), getCValueLanguage(), "language");
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * language: {VARCHAR(5)}
     * @param language The value of language as prefixSearch.
     */
    public void setLanguage_PrefixSearch(final String language) {
        setLanguage_LikeSearch(language, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * language: {VARCHAR(5)}
     * @param language The value of language as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setLanguage_LikeSearch(final String language,
            final LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(language), getCValueLanguage(), "language",
                likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * language: {VARCHAR(5)}
     * @param language The value of language as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setLanguage_NotLikeSearch(final String language,
            final LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(language), getCValueLanguage(), "language",
                likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * language: {VARCHAR(5)}
     */
    public void setLanguage_IsNull() {
        regLanguage(CK_ISN, DOBJ);
    }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br />
     * language: {VARCHAR(5)}
     */
    public void setLanguage_IsNullOrEmpty() {
        regLanguage(CK_ISNOE, DOBJ);
    }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * language: {VARCHAR(5)}
     */
    public void setLanguage_IsNotNull() {
        regLanguage(CK_ISNN, DOBJ);
    }

    protected void regLanguage(final ConditionKey k, final Object v) {
        regQ(k, v, getCValueLanguage(), "language");
    }

    abstract protected ConditionValue getCValueLanguage();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * auth_source_id: {IX, INT(10)}
     * @param authSourceId The value of authSourceId as equal.
     */
    public void setAuthSourceId_Equal(final Integer authSourceId) {
        doSetAuthSourceId_Equal(authSourceId);
    }

    protected void doSetAuthSourceId_Equal(final Integer authSourceId) {
        regAuthSourceId(CK_EQ, authSourceId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * auth_source_id: {IX, INT(10)}
     * @param authSourceId The value of authSourceId as notEqual.
     */
    public void setAuthSourceId_NotEqual(final Integer authSourceId) {
        doSetAuthSourceId_NotEqual(authSourceId);
    }

    protected void doSetAuthSourceId_NotEqual(final Integer authSourceId) {
        regAuthSourceId(CK_NES, authSourceId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * auth_source_id: {IX, INT(10)}
     * @param authSourceId The value of authSourceId as greaterThan.
     */
    public void setAuthSourceId_GreaterThan(final Integer authSourceId) {
        regAuthSourceId(CK_GT, authSourceId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * auth_source_id: {IX, INT(10)}
     * @param authSourceId The value of authSourceId as lessThan.
     */
    public void setAuthSourceId_LessThan(final Integer authSourceId) {
        regAuthSourceId(CK_LT, authSourceId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * auth_source_id: {IX, INT(10)}
     * @param authSourceId The value of authSourceId as greaterEqual.
     */
    public void setAuthSourceId_GreaterEqual(final Integer authSourceId) {
        regAuthSourceId(CK_GE, authSourceId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * auth_source_id: {IX, INT(10)}
     * @param authSourceId The value of authSourceId as lessEqual.
     */
    public void setAuthSourceId_LessEqual(final Integer authSourceId) {
        regAuthSourceId(CK_LE, authSourceId);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * auth_source_id: {IX, INT(10)}
     * @param minNumber The min number of authSourceId. (NullAllowed)
     * @param maxNumber The max number of authSourceId. (NullAllowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setAuthSourceId_RangeOf(final Integer minNumber,
            final Integer maxNumber, final RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueAuthSourceId(), "auth_source_id",
                rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * auth_source_id: {IX, INT(10)}
     * @param authSourceIdList The collection of authSourceId as inScope.
     */
    public void setAuthSourceId_InScope(
            final Collection<Integer> authSourceIdList) {
        doSetAuthSourceId_InScope(authSourceIdList);
    }

    protected void doSetAuthSourceId_InScope(
            final Collection<Integer> authSourceIdList) {
        regINS(CK_INS, cTL(authSourceIdList), getCValueAuthSourceId(),
                "auth_source_id");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * auth_source_id: {IX, INT(10)}
     * @param authSourceIdList The collection of authSourceId as notInScope.
     */
    public void setAuthSourceId_NotInScope(
            final Collection<Integer> authSourceIdList) {
        doSetAuthSourceId_NotInScope(authSourceIdList);
    }

    protected void doSetAuthSourceId_NotInScope(
            final Collection<Integer> authSourceIdList) {
        regINS(CK_NINS, cTL(authSourceIdList), getCValueAuthSourceId(),
                "auth_source_id");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * auth_source_id: {IX, INT(10)}
     */
    public void setAuthSourceId_IsNull() {
        regAuthSourceId(CK_ISN, DOBJ);
    }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * auth_source_id: {IX, INT(10)}
     */
    public void setAuthSourceId_IsNotNull() {
        regAuthSourceId(CK_ISNN, DOBJ);
    }

    protected void regAuthSourceId(final ConditionKey k, final Object v) {
        regQ(k, v, getCValueAuthSourceId(), "auth_source_id");
    }

    abstract protected ConditionValue getCValueAuthSourceId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * created_on: {DATETIME(19)}
     * @param createdOn The value of createdOn as equal.
     */
    public void setCreatedOn_Equal(final java.sql.Timestamp createdOn) {
        regCreatedOn(CK_EQ, createdOn);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * created_on: {DATETIME(19)}
     * @param createdOn The value of createdOn as greaterThan.
     */
    public void setCreatedOn_GreaterThan(final java.sql.Timestamp createdOn) {
        regCreatedOn(CK_GT, createdOn);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * created_on: {DATETIME(19)}
     * @param createdOn The value of createdOn as lessThan.
     */
    public void setCreatedOn_LessThan(final java.sql.Timestamp createdOn) {
        regCreatedOn(CK_LT, createdOn);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * created_on: {DATETIME(19)}
     * @param createdOn The value of createdOn as greaterEqual.
     */
    public void setCreatedOn_GreaterEqual(final java.sql.Timestamp createdOn) {
        regCreatedOn(CK_GE, createdOn);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * created_on: {DATETIME(19)}
     * @param createdOn The value of createdOn as lessEqual.
     */
    public void setCreatedOn_LessEqual(final java.sql.Timestamp createdOn) {
        regCreatedOn(CK_LE, createdOn);
    }

    /**
     * FromTo with various options. (versatile) <br />
     * {(default) fromDatetime &lt;= column &lt;= toDatetime} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * created_on: {DATETIME(19)}
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of createdOn. (NullAllowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of createdOn. (NullAllowed)
     * @param fromToOption The option of from-to. (NotNull)
     */
    public void setCreatedOn_FromTo(final java.util.Date fromDatetime,
            final java.util.Date toDatetime, final FromToOption fromToOption) {
        regFTQ(fromDatetime != null ? new java.sql.Timestamp(
                fromDatetime.getTime()) : null,
                toDatetime != null ? new java.sql.Timestamp(toDatetime
                        .getTime()) : null, getCValueCreatedOn(), "created_on",
                fromToOption);
    }

    /**
     * DateFromTo. (Date means yyyy/MM/dd) <br />
     * {fromDate &lt;= column &lt; toDate + 1 day} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * created_on: {DATETIME(19)}
     * <pre>
     * e.g. from:{2007/04/10 08:24:53} to:{2007/04/16 14:36:29}
     *  --&gt; column &gt;= '2007/04/10 00:00:00'
     *  and column <span style="color: #FD4747">&lt; '2007/04/17 00:00:00'</span>
     * </pre>
     * @param fromDate The from-date(yyyy/MM/dd) of createdOn. (NullAllowed)
     * @param toDate The to-date(yyyy/MM/dd) of createdOn. (NullAllowed)
     */
    public void setCreatedOn_DateFromTo(final java.util.Date fromDate,
            final java.util.Date toDate) {
        setCreatedOn_FromTo(fromDate, toDate, new DateFromToOption());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * created_on: {DATETIME(19)}
     */
    public void setCreatedOn_IsNull() {
        regCreatedOn(CK_ISN, DOBJ);
    }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * created_on: {DATETIME(19)}
     */
    public void setCreatedOn_IsNotNull() {
        regCreatedOn(CK_ISNN, DOBJ);
    }

    protected void regCreatedOn(final ConditionKey k, final Object v) {
        regQ(k, v, getCValueCreatedOn(), "created_on");
    }

    abstract protected ConditionValue getCValueCreatedOn();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * updated_on: {DATETIME(19)}
     * @param updatedOn The value of updatedOn as equal.
     */
    public void setUpdatedOn_Equal(final java.sql.Timestamp updatedOn) {
        regUpdatedOn(CK_EQ, updatedOn);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * updated_on: {DATETIME(19)}
     * @param updatedOn The value of updatedOn as greaterThan.
     */
    public void setUpdatedOn_GreaterThan(final java.sql.Timestamp updatedOn) {
        regUpdatedOn(CK_GT, updatedOn);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * updated_on: {DATETIME(19)}
     * @param updatedOn The value of updatedOn as lessThan.
     */
    public void setUpdatedOn_LessThan(final java.sql.Timestamp updatedOn) {
        regUpdatedOn(CK_LT, updatedOn);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * updated_on: {DATETIME(19)}
     * @param updatedOn The value of updatedOn as greaterEqual.
     */
    public void setUpdatedOn_GreaterEqual(final java.sql.Timestamp updatedOn) {
        regUpdatedOn(CK_GE, updatedOn);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * updated_on: {DATETIME(19)}
     * @param updatedOn The value of updatedOn as lessEqual.
     */
    public void setUpdatedOn_LessEqual(final java.sql.Timestamp updatedOn) {
        regUpdatedOn(CK_LE, updatedOn);
    }

    /**
     * FromTo with various options. (versatile) <br />
     * {(default) fromDatetime &lt;= column &lt;= toDatetime} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * updated_on: {DATETIME(19)}
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of updatedOn. (NullAllowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of updatedOn. (NullAllowed)
     * @param fromToOption The option of from-to. (NotNull)
     */
    public void setUpdatedOn_FromTo(final java.util.Date fromDatetime,
            final java.util.Date toDatetime, final FromToOption fromToOption) {
        regFTQ(fromDatetime != null ? new java.sql.Timestamp(
                fromDatetime.getTime()) : null,
                toDatetime != null ? new java.sql.Timestamp(toDatetime
                        .getTime()) : null, getCValueUpdatedOn(), "updated_on",
                fromToOption);
    }

    /**
     * DateFromTo. (Date means yyyy/MM/dd) <br />
     * {fromDate &lt;= column &lt; toDate + 1 day} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * updated_on: {DATETIME(19)}
     * <pre>
     * e.g. from:{2007/04/10 08:24:53} to:{2007/04/16 14:36:29}
     *  --&gt; column &gt;= '2007/04/10 00:00:00'
     *  and column <span style="color: #FD4747">&lt; '2007/04/17 00:00:00'</span>
     * </pre>
     * @param fromDate The from-date(yyyy/MM/dd) of updatedOn. (NullAllowed)
     * @param toDate The to-date(yyyy/MM/dd) of updatedOn. (NullAllowed)
     */
    public void setUpdatedOn_DateFromTo(final java.util.Date fromDate,
            final java.util.Date toDate) {
        setUpdatedOn_FromTo(fromDate, toDate, new DateFromToOption());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * updated_on: {DATETIME(19)}
     */
    public void setUpdatedOn_IsNull() {
        regUpdatedOn(CK_ISN, DOBJ);
    }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * updated_on: {DATETIME(19)}
     */
    public void setUpdatedOn_IsNotNull() {
        regUpdatedOn(CK_ISNN, DOBJ);
    }

    protected void regUpdatedOn(final ConditionKey k, final Object v) {
        regQ(k, v, getCValueUpdatedOn(), "updated_on");
    }

    abstract protected ConditionValue getCValueUpdatedOn();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * type: {IX, VARCHAR(255)}
     * @param type The value of type as equal.
     */
    public void setType_Equal(final String type) {
        doSetType_Equal(fRES(type));
    }

    protected void doSetType_Equal(final String type) {
        regType(CK_EQ, type);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * type: {IX, VARCHAR(255)}
     * @param type The value of type as notEqual.
     */
    public void setType_NotEqual(final String type) {
        doSetType_NotEqual(fRES(type));
    }

    protected void doSetType_NotEqual(final String type) {
        regType(CK_NES, type);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * type: {IX, VARCHAR(255)}
     * @param type The value of type as greaterThan.
     */
    public void setType_GreaterThan(final String type) {
        regType(CK_GT, fRES(type));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * type: {IX, VARCHAR(255)}
     * @param type The value of type as lessThan.
     */
    public void setType_LessThan(final String type) {
        regType(CK_LT, fRES(type));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * type: {IX, VARCHAR(255)}
     * @param type The value of type as greaterEqual.
     */
    public void setType_GreaterEqual(final String type) {
        regType(CK_GE, fRES(type));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * type: {IX, VARCHAR(255)}
     * @param type The value of type as lessEqual.
     */
    public void setType_LessEqual(final String type) {
        regType(CK_LE, fRES(type));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * type: {IX, VARCHAR(255)}
     * @param typeList The collection of type as inScope.
     */
    public void setType_InScope(final Collection<String> typeList) {
        doSetType_InScope(typeList);
    }

    public void doSetType_InScope(final Collection<String> typeList) {
        regINS(CK_INS, cTL(typeList), getCValueType(), "type");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * type: {IX, VARCHAR(255)}
     * @param typeList The collection of type as notInScope.
     */
    public void setType_NotInScope(final Collection<String> typeList) {
        doSetType_NotInScope(typeList);
    }

    public void doSetType_NotInScope(final Collection<String> typeList) {
        regINS(CK_NINS, cTL(typeList), getCValueType(), "type");
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * type: {IX, VARCHAR(255)}
     * @param type The value of type as prefixSearch.
     */
    public void setType_PrefixSearch(final String type) {
        setType_LikeSearch(type, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * type: {IX, VARCHAR(255)}
     * @param type The value of type as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setType_LikeSearch(final String type,
            final LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(type), getCValueType(), "type", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * type: {IX, VARCHAR(255)}
     * @param type The value of type as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setType_NotLikeSearch(final String type,
            final LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(type), getCValueType(), "type", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * type: {IX, VARCHAR(255)}
     */
    public void setType_IsNull() {
        regType(CK_ISN, DOBJ);
    }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br />
     * type: {IX, VARCHAR(255)}
     */
    public void setType_IsNullOrEmpty() {
        regType(CK_ISNOE, DOBJ);
    }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * type: {IX, VARCHAR(255)}
     */
    public void setType_IsNotNull() {
        regType(CK_ISNN, DOBJ);
    }

    protected void regType(final ConditionKey k, final Object v) {
        regQ(k, v, getCValueType(), "type");
    }

    abstract protected ConditionValue getCValueType();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * identity_url: {VARCHAR(255)}
     * @param identityUrl The value of identityUrl as equal.
     */
    public void setIdentityUrl_Equal(final String identityUrl) {
        doSetIdentityUrl_Equal(fRES(identityUrl));
    }

    protected void doSetIdentityUrl_Equal(final String identityUrl) {
        regIdentityUrl(CK_EQ, identityUrl);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * identity_url: {VARCHAR(255)}
     * @param identityUrl The value of identityUrl as notEqual.
     */
    public void setIdentityUrl_NotEqual(final String identityUrl) {
        doSetIdentityUrl_NotEqual(fRES(identityUrl));
    }

    protected void doSetIdentityUrl_NotEqual(final String identityUrl) {
        regIdentityUrl(CK_NES, identityUrl);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * identity_url: {VARCHAR(255)}
     * @param identityUrl The value of identityUrl as greaterThan.
     */
    public void setIdentityUrl_GreaterThan(final String identityUrl) {
        regIdentityUrl(CK_GT, fRES(identityUrl));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * identity_url: {VARCHAR(255)}
     * @param identityUrl The value of identityUrl as lessThan.
     */
    public void setIdentityUrl_LessThan(final String identityUrl) {
        regIdentityUrl(CK_LT, fRES(identityUrl));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * identity_url: {VARCHAR(255)}
     * @param identityUrl The value of identityUrl as greaterEqual.
     */
    public void setIdentityUrl_GreaterEqual(final String identityUrl) {
        regIdentityUrl(CK_GE, fRES(identityUrl));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * identity_url: {VARCHAR(255)}
     * @param identityUrl The value of identityUrl as lessEqual.
     */
    public void setIdentityUrl_LessEqual(final String identityUrl) {
        regIdentityUrl(CK_LE, fRES(identityUrl));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * identity_url: {VARCHAR(255)}
     * @param identityUrlList The collection of identityUrl as inScope.
     */
    public void setIdentityUrl_InScope(final Collection<String> identityUrlList) {
        doSetIdentityUrl_InScope(identityUrlList);
    }

    public void doSetIdentityUrl_InScope(
            final Collection<String> identityUrlList) {
        regINS(CK_INS, cTL(identityUrlList), getCValueIdentityUrl(),
                "identity_url");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * identity_url: {VARCHAR(255)}
     * @param identityUrlList The collection of identityUrl as notInScope.
     */
    public void setIdentityUrl_NotInScope(
            final Collection<String> identityUrlList) {
        doSetIdentityUrl_NotInScope(identityUrlList);
    }

    public void doSetIdentityUrl_NotInScope(
            final Collection<String> identityUrlList) {
        regINS(CK_NINS, cTL(identityUrlList), getCValueIdentityUrl(),
                "identity_url");
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * identity_url: {VARCHAR(255)}
     * @param identityUrl The value of identityUrl as prefixSearch.
     */
    public void setIdentityUrl_PrefixSearch(final String identityUrl) {
        setIdentityUrl_LikeSearch(identityUrl, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * identity_url: {VARCHAR(255)}
     * @param identityUrl The value of identityUrl as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setIdentityUrl_LikeSearch(final String identityUrl,
            final LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(identityUrl), getCValueIdentityUrl(),
                "identity_url", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * identity_url: {VARCHAR(255)}
     * @param identityUrl The value of identityUrl as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setIdentityUrl_NotLikeSearch(final String identityUrl,
            final LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(identityUrl), getCValueIdentityUrl(),
                "identity_url", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * identity_url: {VARCHAR(255)}
     */
    public void setIdentityUrl_IsNull() {
        regIdentityUrl(CK_ISN, DOBJ);
    }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br />
     * identity_url: {VARCHAR(255)}
     */
    public void setIdentityUrl_IsNullOrEmpty() {
        regIdentityUrl(CK_ISNOE, DOBJ);
    }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * identity_url: {VARCHAR(255)}
     */
    public void setIdentityUrl_IsNotNull() {
        regIdentityUrl(CK_ISNN, DOBJ);
    }

    protected void regIdentityUrl(final ConditionKey k, final Object v) {
        regQ(k, v, getCValueIdentityUrl(), "identity_url");
    }

    abstract protected ConditionValue getCValueIdentityUrl();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * mail_notification: {NotNull, VARCHAR(255)}
     * @param mailNotification The value of mailNotification as equal.
     */
    public void setMailNotification_Equal(final String mailNotification) {
        doSetMailNotification_Equal(fRES(mailNotification));
    }

    protected void doSetMailNotification_Equal(final String mailNotification) {
        regMailNotification(CK_EQ, mailNotification);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * mail_notification: {NotNull, VARCHAR(255)}
     * @param mailNotification The value of mailNotification as notEqual.
     */
    public void setMailNotification_NotEqual(final String mailNotification) {
        doSetMailNotification_NotEqual(fRES(mailNotification));
    }

    protected void doSetMailNotification_NotEqual(final String mailNotification) {
        regMailNotification(CK_NES, mailNotification);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * mail_notification: {NotNull, VARCHAR(255)}
     * @param mailNotification The value of mailNotification as greaterThan.
     */
    public void setMailNotification_GreaterThan(final String mailNotification) {
        regMailNotification(CK_GT, fRES(mailNotification));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * mail_notification: {NotNull, VARCHAR(255)}
     * @param mailNotification The value of mailNotification as lessThan.
     */
    public void setMailNotification_LessThan(final String mailNotification) {
        regMailNotification(CK_LT, fRES(mailNotification));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * mail_notification: {NotNull, VARCHAR(255)}
     * @param mailNotification The value of mailNotification as greaterEqual.
     */
    public void setMailNotification_GreaterEqual(final String mailNotification) {
        regMailNotification(CK_GE, fRES(mailNotification));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * mail_notification: {NotNull, VARCHAR(255)}
     * @param mailNotification The value of mailNotification as lessEqual.
     */
    public void setMailNotification_LessEqual(final String mailNotification) {
        regMailNotification(CK_LE, fRES(mailNotification));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * mail_notification: {NotNull, VARCHAR(255)}
     * @param mailNotificationList The collection of mailNotification as inScope.
     */
    public void setMailNotification_InScope(
            final Collection<String> mailNotificationList) {
        doSetMailNotification_InScope(mailNotificationList);
    }

    public void doSetMailNotification_InScope(
            final Collection<String> mailNotificationList) {
        regINS(CK_INS, cTL(mailNotificationList), getCValueMailNotification(),
                "mail_notification");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * mail_notification: {NotNull, VARCHAR(255)}
     * @param mailNotificationList The collection of mailNotification as notInScope.
     */
    public void setMailNotification_NotInScope(
            final Collection<String> mailNotificationList) {
        doSetMailNotification_NotInScope(mailNotificationList);
    }

    public void doSetMailNotification_NotInScope(
            final Collection<String> mailNotificationList) {
        regINS(CK_NINS, cTL(mailNotificationList), getCValueMailNotification(),
                "mail_notification");
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * mail_notification: {NotNull, VARCHAR(255)}
     * @param mailNotification The value of mailNotification as prefixSearch.
     */
    public void setMailNotification_PrefixSearch(final String mailNotification) {
        setMailNotification_LikeSearch(mailNotification, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * mail_notification: {NotNull, VARCHAR(255)}
     * @param mailNotification The value of mailNotification as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setMailNotification_LikeSearch(final String mailNotification,
            final LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(mailNotification), getCValueMailNotification(),
                "mail_notification", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * mail_notification: {NotNull, VARCHAR(255)}
     * @param mailNotification The value of mailNotification as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setMailNotification_NotLikeSearch(
            final String mailNotification,
            final LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(mailNotification), getCValueMailNotification(),
                "mail_notification", likeSearchOption);
    }

    protected void regMailNotification(final ConditionKey k, final Object v) {
        regQ(k, v, getCValueMailNotification(), "mail_notification");
    }

    abstract protected ConditionValue getCValueMailNotification();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * salt: {VARCHAR(64)}
     * @param salt The value of salt as equal.
     */
    public void setSalt_Equal(final String salt) {
        doSetSalt_Equal(fRES(salt));
    }

    protected void doSetSalt_Equal(final String salt) {
        regSalt(CK_EQ, salt);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * salt: {VARCHAR(64)}
     * @param salt The value of salt as notEqual.
     */
    public void setSalt_NotEqual(final String salt) {
        doSetSalt_NotEqual(fRES(salt));
    }

    protected void doSetSalt_NotEqual(final String salt) {
        regSalt(CK_NES, salt);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * salt: {VARCHAR(64)}
     * @param salt The value of salt as greaterThan.
     */
    public void setSalt_GreaterThan(final String salt) {
        regSalt(CK_GT, fRES(salt));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * salt: {VARCHAR(64)}
     * @param salt The value of salt as lessThan.
     */
    public void setSalt_LessThan(final String salt) {
        regSalt(CK_LT, fRES(salt));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * salt: {VARCHAR(64)}
     * @param salt The value of salt as greaterEqual.
     */
    public void setSalt_GreaterEqual(final String salt) {
        regSalt(CK_GE, fRES(salt));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * salt: {VARCHAR(64)}
     * @param salt The value of salt as lessEqual.
     */
    public void setSalt_LessEqual(final String salt) {
        regSalt(CK_LE, fRES(salt));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * salt: {VARCHAR(64)}
     * @param saltList The collection of salt as inScope.
     */
    public void setSalt_InScope(final Collection<String> saltList) {
        doSetSalt_InScope(saltList);
    }

    public void doSetSalt_InScope(final Collection<String> saltList) {
        regINS(CK_INS, cTL(saltList), getCValueSalt(), "salt");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * salt: {VARCHAR(64)}
     * @param saltList The collection of salt as notInScope.
     */
    public void setSalt_NotInScope(final Collection<String> saltList) {
        doSetSalt_NotInScope(saltList);
    }

    public void doSetSalt_NotInScope(final Collection<String> saltList) {
        regINS(CK_NINS, cTL(saltList), getCValueSalt(), "salt");
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * salt: {VARCHAR(64)}
     * @param salt The value of salt as prefixSearch.
     */
    public void setSalt_PrefixSearch(final String salt) {
        setSalt_LikeSearch(salt, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * salt: {VARCHAR(64)}
     * @param salt The value of salt as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSalt_LikeSearch(final String salt,
            final LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(salt), getCValueSalt(), "salt", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * salt: {VARCHAR(64)}
     * @param salt The value of salt as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSalt_NotLikeSearch(final String salt,
            final LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(salt), getCValueSalt(), "salt", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * salt: {VARCHAR(64)}
     */
    public void setSalt_IsNull() {
        regSalt(CK_ISN, DOBJ);
    }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br />
     * salt: {VARCHAR(64)}
     */
    public void setSalt_IsNullOrEmpty() {
        regSalt(CK_ISNOE, DOBJ);
    }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * salt: {VARCHAR(64)}
     */
    public void setSalt_IsNotNull() {
        regSalt(CK_ISNN, DOBJ);
    }

    protected void regSalt(final ConditionKey k, final Object v) {
        regQ(k, v, getCValueSalt(), "salt");
    }

    abstract protected ConditionValue getCValueSalt();

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO = (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_Equal()</span>.max(new SubQuery&lt;UsersCB&gt;() {
     *     public void query(UsersCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<UsersCB> scalar_Equal() {
        return xcreateSSQFunction(CK_EQ.getOperand());
    }

    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO &lt;&gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_NotEqual()</span>.max(new SubQuery&lt;UsersCB&gt;() {
     *     public void query(UsersCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<UsersCB> scalar_NotEqual() {
        return xcreateSSQFunction(CK_NES.getOperand());
    }

    /**
     * Prepare ScalarCondition as greaterThan. <br />
     * {where FOO &gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_GreaterThan()</span>.max(new SubQuery&lt;UsersCB&gt;() {
     *     public void query(UsersCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<UsersCB> scalar_GreaterThan() {
        return xcreateSSQFunction(CK_GT.getOperand());
    }

    /**
     * Prepare ScalarCondition as lessThan. <br />
     * {where FOO &lt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_LessThan()</span>.max(new SubQuery&lt;UsersCB&gt;() {
     *     public void query(UsersCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<UsersCB> scalar_LessThan() {
        return xcreateSSQFunction(CK_LT.getOperand());
    }

    /**
     * Prepare ScalarCondition as greaterEqual. <br />
     * {where FOO &gt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_GreaterEqual()</span>.max(new SubQuery&lt;UsersCB&gt;() {
     *     public void query(UsersCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<UsersCB> scalar_GreaterEqual() {
        return xcreateSSQFunction(CK_GE.getOperand());
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br />
     * {where FOO &lt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_LessEqual()</span>.max(new SubQuery&lt;UsersCB&gt;() {
     *     public void query(UsersCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<UsersCB> scalar_LessEqual() {
        return xcreateSSQFunction(CK_LE.getOperand());
    }

    protected HpSSQFunction<UsersCB> xcreateSSQFunction(final String operand) {
        return new HpSSQFunction<UsersCB>(new HpSSQSetupper<UsersCB>() {
            @Override
            public void setup(final String function,
                    final SubQuery<UsersCB> subQuery,
                    final HpSSQOption<UsersCB> option) {
                xscalarCondition(function, subQuery, operand, option);
            }
        });
    }

    protected void xscalarCondition(final String function,
            final SubQuery<UsersCB> subQuery, final String operand,
            final HpSSQOption<UsersCB> option) {
        assertObjectNotNull("subQuery<UsersCB>", subQuery);
        final UsersCB cb = xcreateScalarConditionCB();
        subQuery.query(cb);
        final String subQueryPropertyName = keepScalarCondition(cb.query()); // for saving query-value
        option.setPartitionByCBean(xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(function, cb.query(), subQueryPropertyName,
                operand, option);
    }

    public abstract String keepScalarCondition(UsersCQ subQuery);

    protected UsersCB xcreateScalarConditionCB() {
        final UsersCB cb = new UsersCB();
        cb.xsetupForScalarCondition(this);
        return cb;
    }

    protected UsersCB xcreateScalarConditionPartitionByCB() {
        final UsersCB cb = new UsersCB();
        cb.xsetupForScalarConditionPartitionBy(this);
        return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(final String function,
            final SubQuery<UsersCB> subQuery, final String aliasName,
            final DerivedReferrerOption option) {
        assertObjectNotNull("subQuery<UsersCB>", subQuery);
        final UsersCB cb = new UsersCB();
        cb.xsetupForDerivedReferrer(this);
        subQuery.query(cb);
        final String subQueryPropertyName = keepSpecifyMyselfDerived(cb.query()); // for saving query-value.
        registerSpecifyMyselfDerived(function, cb.query(), "id", "id",
                subQueryPropertyName, "myselfDerived", aliasName, option);
    }

    public abstract String keepSpecifyMyselfDerived(UsersCQ subQuery);

    /**
     * Prepare for (Query)MyselfDerived (SubQuery).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<UsersCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived();
    }

    protected HpQDRFunction<UsersCB> xcreateQDRFunctionMyselfDerived() {
        return new HpQDRFunction<UsersCB>(new HpQDRSetupper<UsersCB>() {
            @Override
            public void setup(final String function,
                    final SubQuery<UsersCB> subQuery, final String operand,
                    final Object value, final DerivedReferrerOption option) {
                xqderiveMyselfDerived(function, subQuery, operand, value,
                        option);
            }
        });
    }

    public void xqderiveMyselfDerived(final String function,
            final SubQuery<UsersCB> subQuery, final String operand,
            final Object value, final DerivedReferrerOption option) {
        assertObjectNotNull("subQuery<UsersCB>", subQuery);
        final UsersCB cb = new UsersCB();
        cb.xsetupForDerivedReferrer(this);
        subQuery.query(cb);
        final String subQueryPropertyName = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        final String parameterPropertyName = keepQueryMyselfDerivedParameter(value);
        registerQueryMyselfDerived(function, cb.query(), "id", "id",
                subQueryPropertyName, "myselfDerived", operand, value,
                parameterPropertyName, option);
    }

    public abstract String keepQueryMyselfDerived(UsersCQ subQuery);

    public abstract String keepQueryMyselfDerivedParameter(Object parameterValue);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (SubQuery).
     * @param subQuery The implementation of sub query. (NotNull)
     */
    public void myselfExists(final SubQuery<UsersCB> subQuery) {
        assertObjectNotNull("subQuery<UsersCB>", subQuery);
        final UsersCB cb = new UsersCB();
        cb.xsetupForMyselfExists(this);
        subQuery.query(cb);
        final String subQueryPropertyName = keepMyselfExists(cb.query()); // for saving query-value.
        registerMyselfExists(cb.query(), subQueryPropertyName);
    }

    public abstract String keepMyselfExists(UsersCQ subQuery);

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    /**
     * Prepare for MyselfInScope (SubQuery).
     * @param subQuery The implementation of sub query. (NotNull)
     */
    public void myselfInScope(final SubQuery<UsersCB> subQuery) {
        assertObjectNotNull("subQuery<UsersCB>", subQuery);
        final UsersCB cb = new UsersCB();
        cb.xsetupForMyselfInScope(this);
        subQuery.query(cb);
        final String subQueryPropertyName = keepMyselfInScope(cb.query()); // for saving query-value.
        registerMyselfInScope(cb.query(), subQueryPropertyName);
    }

    public abstract String keepMyselfInScope(UsersCQ subQuery);

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabCB() {
        return UsersCB.class.getName();
    }

    protected String xabCQ() {
        return UsersCQ.class.getName();
    }

    protected String xabLSO() {
        return LikeSearchOption.class.getName();
    }

    protected String xabSSQS() {
        return HpSSQSetupper.class.getName();
    }
}
