package com.sc.consumer.hystrix;

import com.sc.consumer.service.UserService;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class UserFallBackService implements UserService {
    @Override
    public String getName(String id) {
        return "getName fallback";
    }

    @Override
    public String setName(String id, String name) {
        return "setname fallBack";
    }
}
