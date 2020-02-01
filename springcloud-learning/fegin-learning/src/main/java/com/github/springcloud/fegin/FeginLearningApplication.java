package com.github.springcloud.fegin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author huorong
 */
@SpringBootApplication
@EnableFeignClients
public class FeginLearningApplication {

    public static void main(String[] args) {
        SpringApplication.run(FeginLearningApplication.class, args);
    }

}
