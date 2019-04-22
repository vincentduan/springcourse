package com.edu.spring;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.stereotype.Component;

/**
 * BeanDefinitionRegistryPostProcessor可以拿到BeanDefinitionRegistry，ConfigurableListableBeanFactory两个对象
 * BeanDefinitionRegistry可以动态注入bean
 */
@Component
public class MyBeanDefinitionRegistryPostProcessor implements BeanDefinitionRegistryPostProcessor {
    @Override
    public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry beanDefinitionRegistry) throws BeansException {
        for( int i = 0; i < 10; i++){
            BeanDefinitionBuilder beanDefinitionBuilder = BeanDefinitionBuilder.rootBeanDefinition(Person.class);
            // 往person内注入属性,可以注入引用
            beanDefinitionBuilder.addPropertyValue("name", "admin" + i);
            beanDefinitionRegistry.registerBeanDefinition("person" + i, beanDefinitionBuilder.getBeanDefinition());


        }
    }

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory configurableListableBeanFactory) throws BeansException {

    }
}
