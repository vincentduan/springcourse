package com.edu.spring;

import com.edu.core.bean.Role;
import com.edu.core.bean.User;
import com.edu.core.bean.UserConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

/**
 * EnableAutoConfiguration 作用：从classpath中搜索所有META-INF/spring.factories配置文件，
 * 然后，将其中org.springframework.boot.autoconfigure.EnableAutoConfiguration key对应的配置项加载到spring容器中
 *
 * 只有spring.boot.enableautoconfiguration为true(默认为true)时，才启用自动配置
 *
 * 其内部实现的关键点有：
 *  1. ImportSelector 该接口的方法的额返回值都会被纳入到spring容器管理中
 *  2. SpringFactoriesLoader 该类可以从classpath中搜索所有META-INF/spring.factories配置文件，并读取配置
 */
@EnableAutoConfiguration(excludeName = "com.edu.core.bean.Role")
@ComponentScan
public class App {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(App.class, args);
        System.out.println(context.getBean(Runnable.class));
        System.out.println(context.getBean(User.class));
        // System.out.println(context.getBean(Role.class));
        context.close();
    }
}
