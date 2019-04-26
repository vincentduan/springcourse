package com.edu.spring;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Order(3)
@Component
public class ServerStartedReport implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        System.out.println("=========应用启动后的时间是：" + LocalDateTime.now().toString());
    }
}
