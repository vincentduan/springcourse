package com.edu.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;

/**
 * @Import 用来导入一个或多个类（Bean会被Spring容器托管），或者配置类（配置类里面的bean会被Spring容器托管）
 */
@ComponentScan
//@Import({User.class, Role.class, MyConfiguration.class})
@Import(MyImportSelector.class)
@EnableLog(name="my springboot")
public class App2 {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(App2.class, args);
        System.out.println(context.getBean(User.class));
        System.out.println(context.getBean(Role.class));
        System.out.println(context.getBeansOfType(Runnable.class));
        context.close();
    }

}
