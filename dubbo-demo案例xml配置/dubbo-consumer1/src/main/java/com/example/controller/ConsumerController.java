package com.example.controller;

import com.example.service.ApiService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import javax.annotation.Resource;

@RestController
public class ConsumerController {
    @Resource
    ApiService apiService;

    @GetMapping("/consumer")
    public String consumer() {
        return apiService.say("hello");
    }
}
