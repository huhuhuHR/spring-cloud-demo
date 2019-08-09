package com.github.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @author huorong
 */
@SpringBootApplication
@EnableZuulProxy
@EnableEurekaClient
public class ZuulLearningApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZuulLearningApplication.class, args);
    }

}
