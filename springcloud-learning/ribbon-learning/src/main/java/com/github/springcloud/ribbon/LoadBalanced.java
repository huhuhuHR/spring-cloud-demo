package com.github.springcloud.ribbon;

import com.netflix.loadbalancer.IRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author huorong
 */
@Configuration
public class LoadBalanced {

    @Bean
    public IRule iRule() {
        return new GlobalRule();
    }
}
