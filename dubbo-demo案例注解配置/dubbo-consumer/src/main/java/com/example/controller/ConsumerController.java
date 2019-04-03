package com.example.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.example.service.ProviderService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumerController {

    @Reference
    ProviderService providerService;
    @GetMapping("/test")
    public String test(){
        return providerService.sayHello("qqqqqqq");
    }

}
