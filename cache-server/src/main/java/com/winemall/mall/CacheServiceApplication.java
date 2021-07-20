package com.winemall.mall;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Author: Stephen
 * @Edition: V1.0
 * @CreateDate: 2021/6/30 10:11
 * @Description: 缓存服务启动类
 */
//启用springboot注解
@SpringBootApplication
//启用dubbo注解
@EnableDubbo
public class CacheServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(CacheServiceApplication.class,args);
    }
}