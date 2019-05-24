package com.edu.spring.springboot;

import com.edu.spring.springboot.dao.IUserDao;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@EnableAspectJAutoProxy
@SpringBootApplication
public class App {
    public static void main(String[] args) {
        ConfigurableApplicationContext configurableApplicationContext = SpringApplication.run(App.class, args);
        System.out.println(configurableApplicationContext.getBean(IUserDao.class).getClass());
        configurableApplicationContext.getBean(IUserDao.class).add("admin", "123456");
        configurableApplicationContext.close();
    }

}
