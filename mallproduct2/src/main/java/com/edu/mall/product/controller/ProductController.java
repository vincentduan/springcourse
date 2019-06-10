package com.edu.mall.product.controller;

import com.edu.mall.product.bean.Product;
import com.edu.mall.product.mapper.ProductMapper;
import com.edu.mall.product.web.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * product rest 服务
 */
@RestController
public class ProductController {

    @Autowired
    private ProductMapper productMapper;

    @PostMapping("/soa/product/add")
    public Object add(Product product) {
        Integer res = productMapper.add(product);
        return res == 1 ? new Response("200", "OK") : new Response("500", "Fail");
    }

    @PutMapping("/soa/product/update")
    public Object update(Product product) {
        Integer res = productMapper.update(product);
        return res == 1 ? new Response("200", "OK") : new Response("500", "Fail");
    }

    @GetMapping("/soa/product/{id}")
    public Object get(@PathVariable("id") Integer id) {
        Product product = productMapper.getById(id);
        return new Response("200", "OK", product);
    }

    @DeleteMapping("/soa/product/{id}")
    public Object delete(@PathVariable("id") Integer id) {
        Integer res = productMapper.deleteById(id);
        return res == 1 ? new Response("200", "OK") : new Response("500", "Fail");
    }

    @GetMapping("/soa/products")
    public Object list(Integer id) {
        List<Product> products = productMapper.queryByList();
        return new Response("200", "OK", products);
    }

    @GetMapping("/soa/address")
    public Object version() {
        return new Response("200", "OK", "127.0.0.1:9090");
    }

}
