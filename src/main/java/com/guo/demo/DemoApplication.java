package com.guo.demo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@Slf4j
@SpringBootApplication
public class DemoApplication {
    public DemoApplication() {
        log.debug("---> debug start! <------");
        log.info("---> info start! <------");
        log.warn("---> warn start! <------");
        log.error("---> error start! <------");

        System.out.println("===> System.out.println <=====");
    }
    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

}
