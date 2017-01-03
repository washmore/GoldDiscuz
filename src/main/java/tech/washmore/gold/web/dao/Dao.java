package tech.washmore.gold.web.dao;

import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author washmore
 * @version 1.0
 * @since 2016-05-20
 */
@Repository
@Lazy(true)
public class Dao<E> extends SqlSessionDaoSupport {

    @Resource(name = "sqlSessionFactory")
    @Override
    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
        super.setSqlSessionFactory(sqlSessionFactory);
    }

    public E selectOne(String aSqlId) {
        return (E) this.getSqlSession().selectOne(aSqlId);
    }

    public E selectOne(String aSqlId, Object aParameterObject) {
        return (E) this.getSqlSession().selectOne(aSqlId, aParameterObject);
    }


    public List<E> selectList(String aSqlId) {
        return this.getSqlSession().selectList(aSqlId);
    }

    public List<E> selectList(String aSqlId, Object aParameterObject) {
        return this.getSqlSession().selectList(aSqlId, aParameterObject);
    }

    public int count(String aSqlId, Object aParameterObject) {
        final int result = this.getSqlSession().selectOne(aSqlId, aParameterObject);
        if (result > 0) {
            return result;
        }
        return 0;
    }

    public boolean exists(String aSqlId, Object aParameterObject) {
        Integer result = count(aSqlId, aParameterObject);
        if (result.intValue() > 0) return true;
        return false;
    }

    /**
     * 增(SqlId)
     */
    public int insert(String aSqlId) {
        return this.getSqlSession().insert(aSqlId);
    }

    /**
     * 增(SqlId＋参数)
     */
    public int insert(String aSqlId, Object aParameterObject) {
        return this.getSqlSession().insert(aSqlId, aParameterObject);
    }

    /**
     * 增(SqlId＋参数) 返回新增条数
     */
    public int insertReturnInt(String aSqlId, Object aParameterObject) {
        return this.getSqlSession().insert(aSqlId, aParameterObject);
    }

    /**
     * 增_返回ID(SqlId＋参数)
     */
    public Integer insertAndReturnId(String aSqlId, Object aParameterObject) {
        return this.getSqlSession().insert(aSqlId, aParameterObject);
    }

    /**
     * 删(SqlId)
     */
    public int delete(String aSqlId) {
        return this.getSqlSession().delete(aSqlId);
    }

    /**
     * 删(SqlId＋参数)
     */
    public int delete(String aSqlId, Object aParameterObject) {
        return this.getSqlSession().delete(aSqlId, aParameterObject);
    }

    /**
     * 删(SqlId＋参数) 返回删除条数
     */
    public int deleteReturnInt(String aSqlId, Object aParameterObject) {
        return this.getSqlSession().delete(aSqlId, aParameterObject);
    }

    /**
     * 改(SqlId)
     */
    public int update(String aSqlId) {
        return this.getSqlSession().update(aSqlId);
    }

    /**
     * 改(SqlId)返回更新条数
     */
    public int updateReturnInt(String aSqlId) {
        return this.getSqlSession().update(aSqlId);
    }

    /**
     * 改(SqlId＋参数)
     */
    public int update(String aSqlId, Object aParameterObject) {
        return this.getSqlSession().update(aSqlId, aParameterObject);
    }

    /**
     * 改(SqlId＋参数)返回更新条数
     */
    public int updateReturnInt(String aSqlId, Object aParameterObject) {
        return this.getSqlSession().update(aSqlId, aParameterObject);
    }

    /**
     * 改_无乐观锁判校验(SqlId＋参数)
     */
    public void updateWithoutVersionCheck(String aSqlId, Object aParameterObject) {
        // TODO 待完善
    }


    public void clearData(String aSqlId, Object aParameterObject) {
        int result = this.getSqlSession().delete(aSqlId, aParameterObject);
        System.out.println("Dao.clearData清洗数据:" + aSqlId + ",删除:" + result + "条");
    }
}
