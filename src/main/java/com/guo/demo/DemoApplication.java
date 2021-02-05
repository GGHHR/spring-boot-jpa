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
    }
    public static void main(String[] args) {
        /*打开默认浏览器*/
        /*try {
            Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler http://localhost:8080/index.html");
        } catch (IOException e) {
            e.printStackTrace();
        }*/
        SpringApplication.run(DemoApplication.class, args);
    }

}
