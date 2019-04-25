package com.edu.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * ApplicationContextInitializer 接口是在spring容器执行refreshed之前的一个回调
 *  使用步骤：
 *      1. 写一个类，实现ApplicationContextInitializer接口
 *      2. 注册ApplicationContextInitializer
 *
 *  注册方法：
 *      1. SpringApplication.addInitializers()
 *      2. 通过application.properties 配置context.initializer.classes=com.edu.spring.MyApplicationContextInitializer来进行,可以指定多个，多个用逗号隔开
 *      3.
 *
 */
@SpringBootApplication
public class App {
    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(App.class);
        //application.addInitializers(new MyApplicationContextInitializer());
        ConfigurableApplicationContext context = application.run(args);
        context.stop();
        context.close();
    }
}
