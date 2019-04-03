package com.example.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.example.service.ProviderService;
import org.springframework.stereotype.Component;

@Component
@Service(interfaceClass = ProviderService.class)
public class ProviderServiceImpl implements ProviderService {

    @Override
    public String sayHello(String hello) {
        System.err.println("调用成功");
        return hello;
    }
}
