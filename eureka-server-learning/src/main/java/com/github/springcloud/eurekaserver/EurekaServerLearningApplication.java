package com.github.springcloud.eurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author huorong
 */
@EnableEurekaServer
@SpringBootApplication
public class EurekaServerLearningApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaServerLearningApplication.class, args);
    }

}
