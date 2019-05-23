package com.edu.spring.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.io.FileNotFoundException;

@Repository
public class ProductDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void addProduct(String id){
        String sql = "insert into test (id) values ("+ id + ")";
        jdbcTemplate.execute(sql);
    }

    /**
     * roobackFor 设置对哪些异常进行回滚，默认是运行时异常
     * @param ids
     * @throws FileNotFoundException
     */
    @Transactional(rollbackFor = Exception.class, noRollbackFor = NullPointerException.class)
    public void addProductBatch(String ...ids) throws Exception {
        for(String id: ids){
            String sql = "insert into test (id) values ("+ id + ")";
            jdbcTemplate.execute(sql);
            if("".equals("")) {
                throw new NullPointerException();
            }
        }

    }

    public void addTest(String ...ids){
        add(ids);
    }

    @Transactional()
    private void add(String ...ids){
        for(String id: ids){
            String sql = "insert into test (id) values ("+ id + ")";
            jdbcTemplate.execute(sql);
            if("".equals("")) {
                throw new NullPointerException();
            }
        }
    }

}
