package com.sc.user.provider.web.controller;

import com.alibaba.fastjson.JSONObject;
import com.sc.user.provider.model.UserModel;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {
    @Value("${server.port}")
    private  Integer port;
    @GetMapping("/v1/user/{id}")
    public  Object get(@PathVariable("id")String id) {
        return JSONObject.toJSONString(new UserModel(id, "gaoqc", port));
    }
    @GetMapping("/v1/user/info/name/{id}")
    public String  getName(@PathVariable("id")String id){
        System.out.println("=============id"+id);
        return "getName,port:"+port;
    }
    @PostMapping("/v1/user/info/name/{id}")
    public Object setName(@PathVariable("id")String id, @RequestParam("name")String name){
        System.out.println("id:"+id+" set name:"+name);
        return "setName,port:"+port;
    }
}
