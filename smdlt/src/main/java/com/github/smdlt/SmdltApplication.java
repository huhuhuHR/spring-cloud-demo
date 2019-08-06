package com.github.smdlt;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan(value = "com.github.smdlt.dao")
@SpringBootApplication
public class SmdltApplication {

    public static void main(String[] args) {
        SpringApplication.run(SmdltApplication.class, args);
    }

}
