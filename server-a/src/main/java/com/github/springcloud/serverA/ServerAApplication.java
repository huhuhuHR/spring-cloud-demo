package com.github.springcloud.serverA;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author huorong
 */
@SpringBootApplication
@MapperScan(value = "com.github.springcloud.serverA.dao")
public class ServerAApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServerAApplication.class, args);
    }

}
