package china.fighting.service.impl;

import china.fighting.service.IService;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

@Slf4j
public abstract class BaseService<T> implements IService<T> {

    @Autowired
    protected Mapper<T> mapper;

    public Mapper<T> getMapper() {
        return mapper;
    }

    @Override
    public List<T> select(T record) {
        return mapper.select(record);
    }

    @Override
    public T selectByKey(Object key) {
        return mapper.selectByPrimaryKey(key);
    }

    @Override
    public List<T> selectAll() {
        return mapper.selectAll();
    }

    @Override
    public T selectOne(T record) {
        return mapper.selectOne(record);
    }

    @Override
    public int selectCount(T record) {
        return mapper.selectCount(record);
    }

    @Override
    public List<T> selectByExample(Object example) {
        return mapper.selectByExample(example);
    }

    @Override
    public int save(T record) {
        return mapper.insertSelective(record);
    }

    @Override
    public int update(T entity) {
        return mapper.updateByPrimaryKeySelective(entity);
    }

    @Override
    public int delete(T record) {
        return mapper.delete(record);
    }

    @Override
    public int deleteByKey(Object key) {
        return mapper.deleteByPrimaryKey(key);
    }

    @Override
    public int batchDelete(List<T> list) {
        int result = 0;
        for (T record : list) {
            int count = mapper.delete(record);
            if (count < 1) {
                throw new RuntimeException("插入数据失败!");
            }
            result += count;
        }
        return result;
    }

    @Override
    public int selectCountByExample(Object example) {
        return mapper.selectCountByExample(example);
    }

    @Override
    public int updateByExample(T record, Object example) {
        return mapper.updateByExampleSelective(record, example);
    }

    @Override
    public int deleteByExample(Object example) {
        return mapper.deleteByPrimaryKey(example);
    }

    @Override
    public List<T> selectByRowBounds(T record, RowBounds rowBounds) {
        return mapper.selectByRowBounds(record, rowBounds);
    }

    @Override
    public List<T> selectByExampleAndRowBounds(Object example, RowBounds rowBounds) {
        return mapper.selectByExampleAndRowBounds(example, rowBounds);
    }

}
