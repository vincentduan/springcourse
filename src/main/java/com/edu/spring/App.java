package com.edu.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;


@SpringBootApplication
public class App {
    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(App.class);
        // application.addListeners(new MyApplicationListener());
        ConfigurableApplicationContext context = application.run(args);
        context.publishEvent(new MyApplicationEvent(new Object()));
        context.stop();
        context.close();
    }
}
