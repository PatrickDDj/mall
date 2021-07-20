package com.winemall.mall;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Author: Stephen
 * @Edition: V1.0
 * @CreateDate: 2021/5/10 15:26
 * @Description:
 */
//启用SpringBoot注解
@SpringBootApplication
//启用dubbo注解
@EnableDubbo
public class PictureServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(PictureServiceApplication.class,args);
    }
}
