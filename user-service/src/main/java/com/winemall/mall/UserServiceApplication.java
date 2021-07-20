package com.winemall.mall;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @Author: Shinku
 * @Edition: V1.0
 * @CreateDate: 2021/7/21
 * @Description: This is a part of the training project
 */
@SpringBootApplication
@EnableDubbo
@EnableTransactionManagement
public class UserServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(UserMapperApplication.class,args);
        System.out.println("succeeded");
    }
}
