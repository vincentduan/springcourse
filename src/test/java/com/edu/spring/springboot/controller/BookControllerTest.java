package com.edu.spring.springboot.controller;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class BookControllerTest {

    @Autowired
    private TestRestTemplate testRestTemplate;

    @Test
    public void home() {
        String forObject = testRestTemplate.getForObject("/book/home", String.class);
        Assert.assertEquals("book home", forObject);
    }

    @Test
    public void show() {
        String forObject = testRestTemplate.getForObject("/book/show?id=100", String.class);
        Assert.assertEquals("book100", forObject);
    }
}