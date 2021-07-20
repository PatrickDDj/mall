package com.winemall.mall;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

<<<<<<< HEAD
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
=======
@SpringBootApplication
//注意: 在服务模块启动类上添加上启动dubbo的注解
@EnableDubbo
//启动事务管理器
@EnableTransactionManagement
public class UserServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(UserServiceApplication.class,args);
>>>>>>> origin/master
    }
}
