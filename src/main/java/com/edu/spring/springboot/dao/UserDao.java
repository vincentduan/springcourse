package com.edu.spring.springboot.dao;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class UserDao {
    private Logger logger = LoggerFactory.getLogger(UserDao.class);

    public void log() {
        logger.debug("user dao debug log");
        logger.info("user dao info log");
        logger.warn("user dao warn log");
        logger.error("user dao error log");
    }


}
