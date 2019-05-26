package com.edu.spring.springboot.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class UserService {
    private Logger logger = LoggerFactory.getLogger(UserService.class);

    public void log() {
        logger.debug("user service debug log");
        logger.info("user service info log");
        logger.warn("user service warn log");
        logger.error("user service error log");
    }
}
