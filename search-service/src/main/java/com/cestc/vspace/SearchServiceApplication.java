package com.winemall.mall;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Author: Stephen
 * @Edition: V1.0
 * @CreateDate: 2021/5/28 16:22
 * @Description: 搜索服务启动类
 */
//启用springboot注解
@SpringBootApplication
//启用dubbo
@EnableDubbo
public class SearchServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(SearchServiceApplication.class,args);
    }
}
