package com.github.springcloud.fegin.consume;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author huorong
 * @date 2019/8/5
 */
@Component
@FeignClient(name = "ServerA", fallback = BackUPCallHi.class)
public interface ConsumerService {
    @RequestMapping("/t1")
    String sayHello();
}