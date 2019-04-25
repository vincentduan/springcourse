package com.edu.spring;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * ImportSelector的方法的返回值，必须是一个class(全称),该class会被spring容器托管起来。
 */
public class MyImportSelector implements ImportSelector {
    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        System.out.println(importingClassMetadata.getAllAnnotationAttributes(EnableLog.class.getName()));
        /**
         * 这里可以获取到注解的详细信息。然后根据信息去动态的返回需要被spring容器管理的bean
         */
        return new String[]{"com.edu.spring.User",Role.class.getName(), MyConfiguration.class.getName()};
    }
}
