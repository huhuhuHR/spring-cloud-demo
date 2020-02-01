package com.github.springcloud.fegin.consume;

import org.springframework.stereotype.Component;

/**
 * @author huorong
 * @date 2019/8/5
 */
@Component
public class BackUPCallHi implements ConsumerService {

    @Override
    public String sayHello() {
        return "I'm feign hystrix.";
    }
}
