package com.github.springcloud.ribbon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

/**
 * @author huorong
 * @date 2019/8/5
 */
@Controller
public class ConsumerController {
    @Autowired
    private RestTemplate restTemplate;
    @GetMapping("c1")
    @ResponseBody
    public String callProducer() {
        ResponseEntity<String> result =
                this.restTemplate.getForEntity(
                        "http://ServerA/t1",
                        String.class,
                        "");
        if (result.getStatusCode() == HttpStatus.OK) {
            System.out.printf(result.getBody() + " called in callProducer");
            return result.getBody();
        } else {
            System.out.printf(" is it empty");
            return " empty ";
        }
    }
}
