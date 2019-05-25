package com.edu.spring.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import redis.clients.jedis.Jedis;

@SpringBootApplication
public class App {
    public static void main(String[] args) {
        ConfigurableApplicationContext configurableApplicationContext = SpringApplication.run(App.class, args);
        Jedis jedis = configurableApplicationContext.getBean(Jedis.class);
        System.out.println("springbourseredis bean" + jedis);
        jedis.set("id", "vincent");
        System.out.println(jedis.get("id"));
    }

}
