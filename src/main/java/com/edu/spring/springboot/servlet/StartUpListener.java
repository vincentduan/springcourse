package com.edu.spring.springboot.servlet;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class StartUpListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("===========");
        System.out.println("application is started");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {

    }
}
