package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:Consumer1.xml")
public class DubboConsumer1Application {

    public static void main(String[] args) {
        SpringApplication.run(DubboConsumer1Application.class, args);
    }

}
