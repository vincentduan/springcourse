package com.edu.spring.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.servlet.error.ErrorMvcAutoConfiguration;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.SQLException;

@SpringBootApplication
@EnableTransactionManagement
public class App {
    public static void main(String[] args) {
        ConfigurableApplicationContext configurableApplicationContext = SpringApplication.run(App.class, args);
        DataSource dataSource = configurableApplicationContext.getBean(DataSource.class);
        try {
            Connection connection = dataSource.getConnection();
            System.out.println(connection.getCatalog());
            connection.close();
            ProductDao bean = configurableApplicationContext.getBean(ProductDao.class);
            try {
                bean.addTest("111", "222", "333", "444", "555");
            } catch (Exception e) {
                e.printStackTrace();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        System.out.println(dataSource.getClass());
    }

}
