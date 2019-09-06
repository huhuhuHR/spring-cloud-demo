package com.github.smdlt;

import com.github.smdlt.service.TestService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * @author huorong
 * @date 2019/9/6
 */
@Component
@Slf4j
public class InitJob implements CommandLineRunner {
    @Autowired
    TestService testService;

    @Override
    public void run(String... args) throws Exception {
        log.info("重启");
        log.info(testService.findTests().toString());
    }
}
