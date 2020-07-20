package com.sc.consumer.web.controller;

import com.sc.consumer.service.UserService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping("/v1/con/user/name")
public class UserNameConsumerController {
    @Resource
    private UserService userService;
    @GetMapping("/{id}")
    public Object getName(@PathVariable("id")String id){
        return userService.getName(id);
    }
    @PostMapping("/{id}")
    public  Object setName(@PathVariable("id")String id ,@RequestParam("name") String name){
        return  userService.setName(id,name);
    }
}
