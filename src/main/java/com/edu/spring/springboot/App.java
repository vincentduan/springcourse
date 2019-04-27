package com.edu.spring.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;


/**
 * 运行流程
 *  1. 判断是否是web环境
 *  2. 加载所有classpath下面的META-INF/spring.factories,  ApplicationContextInitializerr
 *  3. 加载所有classpath下面的META-INF/spring.factories, ApplicationListener
 *  4. 推断main方法所在的类
 *  5. 开始执行run方法
 *  6. 设置java.awt.headless系统变量
 *  7. 加载所有classpath下面的META-INF/spring.factories SpringApplicationRunListener
 *  8. 执行所有SpringApplicationRunListener的started方法
 *  9. 实例化ApplicationArguments对象
 *  10. 创建Environment
 *  11. 配置Environment，主要是把run方法的参数配置到Environment
 *  12. 执行所有SpringApplicationRunListener的environment.prepared方法
 *  13. 如果不是web环境，但是是web的Environment，则把web的Environment转换成标准的Environment
 *  14. 输出Banner
 *  15. 初始化applicationContext，如果是web环境，则实例化AnnotationConfigEmbeddedWebApplicationContext对象，否则实例化AnnotationConfigApplicationContext对象
 *  16. 如果beanNameGenerator不为空，就把beanNameGenerator对象注入Context里面去
 *  17. 回调所有的ApplicationContextInitializer方法
 *  18. 执行所有SpringApplicationRunListener的contextPrepared方法
 *  19. 依次往Spring容器中注入：ApplicationArguments, Banner
 *  20. 加载所有的源到context里面去。
 *  21. 执行所有SpringApplicationRunListener的contextLoaded方法
 *  22. 执行context的refresh方法，并且调用context的registerShutdownHook方法
 *  23. 回调，获取容器中所有的ApplicationRunner, CommandLineRunner接口，然后排序，依次调用
 *  24. 执行所有SpringApplicationRunListener的finished的finished方法
 *
 */
@SpringBootApplication
public class App {

    public static void main(String[] args) {
        // 实例化SpringApplication对象，然后调用run方法
        SpringApplication application = new SpringApplication(App.class);
        ConfigurableApplicationContext context = application.run(args);
        // 直接调用静态run方法
        // ConfigurableApplicationContext context = SpringApplication.run(App.class, args);
        context.close();
    }

}
