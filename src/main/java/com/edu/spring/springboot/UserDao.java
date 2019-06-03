package com.edu.spring.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class UserDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void addProduct(String id){
        String sql = "insert into test (id) values ("+ id + ")";
        jdbcTemplate.execute(sql);
    }

}
