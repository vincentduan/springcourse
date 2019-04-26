package com.edu.spring.springboot;

import com.google.gson.Gson;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.gson.GsonAutoConfiguration;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @SpringBootApplication默认扫描的包的路径是当前包以及子包下面的所有类，可以通过scanBasePackages修改这个扫描包的路径
 */
@SpringBootApplication(scanBasePackages = "com.edu.spring", excludeName = "org.springframework.boot.autoconfigure.gson.GsonAutoConfiguration")
public class App {
    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(App.class);
//        application.setBannerMode(Banner.Mode.OFF);
        ConfigurableApplicationContext context = application.run(args);
        context.close();
    }
}
