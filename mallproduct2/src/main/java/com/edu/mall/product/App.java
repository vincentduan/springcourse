package com.edu.mall.product;

import com.edu.mall.product.bean.Product;
import com.edu.mall.product.mapper.ProductMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;


/**
 * 常见的注册中心：zookeeper, consul, etcd, redis
 * 服务提供方，需要在服务启动的时候，把服务的信息(ip,端口)注册到注册中心(zookeeper)
 *
 */
@SpringBootApplication
public class App {
    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(App.class, args);
//        ProductMapper productMapper = run.getBean(ProductMapper.class);
//        Product product = new Product();
//        product.setPname("java入门到精通");
//        product.setPrice(10.0);
//        product.setType("计算机");
//        productMapper.add(product);
//        run.close();
    }

}