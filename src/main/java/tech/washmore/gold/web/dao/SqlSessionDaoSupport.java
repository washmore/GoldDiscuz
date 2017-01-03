package tech.washmore.gold.web.dao;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.dao.support.DaoSupport;

import static org.springframework.util.Assert.notNull;

/**
 * springframework-DAO 略改
 *
 * @author washmore
 * @version 1.0
 * @since 2016-01-01
 */
public class SqlSessionDaoSupport extends DaoSupport {

    /**
     * sqlSession
     */
    private SqlSession sqlSession;

    /**
     * 启动sqlSession
     *
     * @param aSqlSessionFactory
     */
    public void setSqlSessionFactory(final SqlSessionFactory aSqlSessionFactory) {
        this.sqlSession = new SqlSessionTemplate(aSqlSessionFactory);
    }

    /**
     * 启动sqlSession
     *
     * @param aSqlSessionTemplate
     */
    public void setSqlSessionTemplate(final SqlSessionTemplate aSqlSessionTemplate) {
        this.sqlSession = aSqlSessionTemplate;
    }

    /**
     * Users should use this method to get a SqlSession to call its statement
     * methods This is SqlSession is managed by spring. Users should not
     * commit/rollback/close it because it will be automatically done.
     *
     * @return Spring managed thread safe SqlSession
     */
    public final SqlSession getSqlSession() {
        return this.sqlSession;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected void checkDaoConfig() {
        notNull(this.sqlSession, "Property 'sqlSessionFactory' or 'sqlSessionTemplate' are required");
    }

}
