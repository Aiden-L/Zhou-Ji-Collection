package com.xzr.webdemo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.xzr.webdemo.mapper") // 不写可能无法正确注入Bean
public class WebApplication {
    public static void main(String[] args) {
        // main program begin here
        SpringApplication.run(WebApplication.class, args);
    }
}