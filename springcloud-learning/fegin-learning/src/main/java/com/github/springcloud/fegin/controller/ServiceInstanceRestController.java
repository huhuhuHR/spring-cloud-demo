package com.github.springcloud.fegin.controller;

import com.github.springcloud.fegin.consume.ConsumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author huorong
 * @date 2019/8/5
 */
@RestController
class ServiceInstanceRestController {

    @Autowired
    private ConsumerService consumerService;

    @Autowired
    private DiscoveryClient discoveryClient;

    @RequestMapping("/consumer/sayHi")
    public String sayHello() {
        return "say hi: " + consumerService.sayHello();
    }


    @RequestMapping("/service-instances/{applicationName}")
    public List<ServiceInstance> serviceInstancesByApplicationName(
            @PathVariable String applicationName) {
        return this.discoveryClient.getInstances(applicationName);
    }
}