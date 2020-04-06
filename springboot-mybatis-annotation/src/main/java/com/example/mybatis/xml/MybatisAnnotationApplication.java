package com.example.mybatis.xml;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.mybatis.annotation.mapper")
public class MybatisAnnotationApplication {

    public static void main(String[] args) {
        SpringApplication.run(MybatisAnnotationApplication.class, args);
    }
}
