package com.example.service.imp;

        import com.example.service.ApiService;
        import org.springframework.stereotype.Service;

@Service
public class ProviderServiceImpl implements ApiService {

    @Override
    public String say(String hello) {
        System.err.println("provider调用成功");
        return hello;
    }
}
