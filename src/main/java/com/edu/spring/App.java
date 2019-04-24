package com.edu.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class App {
    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(App.class);
        application.setAdditionalProfiles("dev");
//        application.setAdditionalProfiles("test");
        ConfigurableApplicationContext context = application.run(args);
        System.out.println(context.getBean(TomcatProperties.class));
        System.out.println(context.getEnvironment().getProperty("springboot.name"));
        System.out.println(context.getEnvironment().getProperty("jdbc.url"));
        context.close();
    }

}
