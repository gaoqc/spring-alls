package com.sc.consumer.web.controller;

import com.google.common.collect.Maps;
import com.netflix.discovery.EurekaClient;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Map;

@RestController
public class EurekaInfoController {
    @Resource
    private EurekaClient client;

    @GetMapping("/eureka/status/{serviceId}")
    public Object getServiceStatus(@PathVariable("serviceId")String serviceId){
          return client.getInstanceRemoteStatus().name();
    }

}
