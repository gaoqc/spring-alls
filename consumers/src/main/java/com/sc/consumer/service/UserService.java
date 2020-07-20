package com.sc.consumer.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.ribbon.proxy.annotation.Hystrix;
import com.sc.consumer.hystrix.UserFallBackService;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

@FeignClient(name = "user-provider",fallback = UserFallBackService.class)
//@RequestMapping("/v1/user/info")
public interface UserService {
    @GetMapping("/v1/user/info/name/{id}")
    String   getName(@PathVariable("id") String id);
    @PostMapping("/v1/user/info/name/{id}")

    String   setName(@PathVariable("id")String id, @RequestParam("name")String name);

}
