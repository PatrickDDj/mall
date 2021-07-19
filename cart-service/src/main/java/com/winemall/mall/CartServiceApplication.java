package com.winemall.mall;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

//启用SpringBoot注解
@SpringBootApplication
//启用dubbo注解
@EnableDubbo
//启用事务管理器
@EnableTransactionManagement
public class CartServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(CartServiceApplication.class,args);
    }
}
