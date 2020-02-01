package com.github.product;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configurers.ResourceServerSecurityConfigurer;
import org.springframework.security.oauth2.provider.token.TokenStore;
import org.springframework.security.oauth2.provider.token.store.JwtAccessTokenConverter;
import org.springframework.security.oauth2.provider.token.store.JwtTokenStore;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.Enumeration;
import java.util.List;

/**
 * @author huorong
 */
@EnableDiscoveryClient
@SpringBootApplication
@RestController
@EnableAdminServer
public class ProductApplication extends ResourceServerConfigurerAdapter {
    @Autowired
    DiscoveryClient client;

    public static void main(String[] args) {
        SpringApplication.run(ProductApplication.class, args);
    }

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String hello() {
        List<ServiceInstance> instance = client.getInstances("hello-service");
        return instance == null ?
                "hello1" : "host:" + instance.get(0).getHost() + ",port:" + instance.get(0).getPort() + instance.get(0).getServiceId();
    }
}
