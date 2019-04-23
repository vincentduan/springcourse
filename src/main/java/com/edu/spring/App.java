package com.edu.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class App {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(App.class, args);
        System.out.println(context.getBean(TomcatProperties.class));
        System.out.println(context.getEnvironment().getProperty("springboot.name"));
        context.close();
    }

}
