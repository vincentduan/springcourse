package com.edu.spring.springboot;

import com.edu.spring.springboot.dao.UserDao;
import com.edu.spring.springboot.service.UserService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * springboot默认的级别是info
 * 可以通过logging.level.*=debug 来设置，* 可以是包，也可以是某个类。
 * 日志级别有：trace，debug，info，warn，error，fatal，off
 * 日至级别off表示关闭日志
 *
 * logging.pattern.console配置控制台输出日志的pattern
 * logging.file.console配置文件输出日志的pattern
 */
@SpringBootApplication
public class App {
    public static void main(String[] args) {

        ConfigurableApplicationContext run = SpringApplication.run(App.class, args);
        run.getBean(UserDao.class).log();
        run.getBean(UserService.class).log();
        run.close();

    }

}
