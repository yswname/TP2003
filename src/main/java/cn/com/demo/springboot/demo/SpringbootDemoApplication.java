package cn.com.demo.springboot.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
// 实现接口的动态绑定
@MapperScan(basePackages = "cn.com.demo.springboot.demo.mapper")
// 扫描Service
@ComponentScan(basePackages = {"cn.com.demo.springboot.demo.service.impl",
                               "cn.com.demo.springboot.demo.constroller",
                               "cn.com.demo.springboot.demo.config"})
// 开启注解事务
@EnableTransactionManagement
public class SpringbootDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootDemoApplication.class, args);
    }

}
