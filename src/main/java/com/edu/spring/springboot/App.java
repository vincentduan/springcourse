package com.edu.spring.springboot;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.HashMap;
import java.util.Map;

/**
 * @SpringBootApplication默认扫描的包的路径是当前包以及子包下面的所有类，可以通过scanBasePackages修改这个扫描包的路径
 *
 * 自定义banner方法
 *  在classpath下放一个banner.txt的文件即可
 */
@SpringBootApplication(scanBasePackages = "com.edu.spring", excludeName = "org.springframework.boot.autoconfigure.gson.GsonAutoConfiguration")
public class App {
    @Value(("${server.host:localhost}"))
    private String serverHosts;
    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(App.class);
//        application.setBannerMode(Banner.Mode.OFF);
        ConfigurableApplicationContext context = application.run(args);
        Map<String, Object> defaultProperties = new HashMap<>();
        defaultProperties.put("server.host", "192.168.1.1");
        application.setDefaultProperties(defaultProperties);
        System.out.println(context.getEnvironment().getProperty("server.host","localhost2"));
        System.out.println(context.getBean(App.class).serverHosts);
        context.close();
    }
}
