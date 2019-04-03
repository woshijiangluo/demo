package com.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.demo.mapper")
public class Mybatisplus02Application {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(Mybatisplus02Application.class, args);
    }

}
