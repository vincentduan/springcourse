package com.edu.spring.springboot;

import com.edu.spring.springboot.dao.UserDao;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class App {
    public static void main(String[] args) {
        ConfigurableApplicationContext configurableApplicationContext = SpringApplication.run(App.class, args);
        configurableApplicationContext.getBean(UserDao.class).add("admin", "123456");
        configurableApplicationContext.close();
    }

}
