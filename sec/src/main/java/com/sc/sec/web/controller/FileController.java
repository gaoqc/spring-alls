package com.sc.sec.web.controller;

import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import java.lang.reflect.Array;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;

@RestController
public class FileController {
    /**
     * cookies 增加信息
     *
     * @param response
     * @param id
     * @return
     */
    @GetMapping("file/{id}")
    public  Object getFileBame(HttpServletResponse  response, @PathVariable("id")String id){
        List<String> names=new ArrayList<>();
        names.add("gaoqc");
//
//        request.headers().map().put("name",names);
        List<String>ages=new ArrayList<>();
        ages.add("100");
//        request.headers().map().put("age",ages);
        response.addCookie(new Cookie("name","gaoqc"));
        response.addCookie(new Cookie("age","100"));
        return "fileName:"+id;
    }

}
