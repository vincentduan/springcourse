package com.edu.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class App {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(App.class, args);
        context.getBean(UserConfig.class).show();
        context.getBean(JdbcConfig.class).show();
        context.getBean(DataSourceProperties.class).show();
        context.close();
    }

}
