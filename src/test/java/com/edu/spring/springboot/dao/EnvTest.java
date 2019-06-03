package com.edu.spring.springboot.dao;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.env.Environment;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(properties = {"app.version=1.0.0"})
public class EnvTest {

    @Autowired
    private Environment environment;

    @Test
    public void testValue() {
        Assert.assertEquals("myapplication-test", environment.getProperty("spring.application.name"));
        Assert.assertEquals("1.0.0", environment.getProperty("app.version"));
    }

}
