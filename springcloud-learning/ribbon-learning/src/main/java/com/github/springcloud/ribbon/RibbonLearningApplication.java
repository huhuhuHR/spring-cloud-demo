package com.github.springcloud.ribbon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @author huorong
 */
//@RibbonClient(name = "spring-boot-provider", configuration = com.github.springcloud.ribbon.LoadBalanced.class)
@SpringBootApplication
public class RibbonLearningApplication {
    @Bean
    @LoadBalanced
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

    public static void main(String[] args) {
        SpringApplication.run(RibbonLearningApplication.class, args);
    }

}
