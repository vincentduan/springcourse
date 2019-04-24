package com.edu.spring;

import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;


/**
 * @Conditional 是基于条件的自动配置，一般配合Condition接口一起使用，只有接口实现类返回true才装配，否则不装配。
 * 它可以用在方法上，则只对该方法起作用，还可以用在类上，则对该类的所有方法起作用。
 */
@SpringBootConfiguration
public class EncodingConvertConfig {

    @Bean
    @Conditional(UTF8Condition.class)
    public EncodingConvert createUTF8EncodingConvert(){
        return new UTF8EncodingConvert();
    }

    @Bean
    @Conditional(GBKCondition.class)
    public EncodingConvert createGBKEncodingConvert(){
        return new GBKEncodingConvert();
    }

}
