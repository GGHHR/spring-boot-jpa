package com.guo.demo.controller;

import com.guo.demo.mysql.Greeting;
import org.springframework.boot.autoconfigure.jdbc.JdbcTemplateAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.concurrent.atomic.AtomicLong;

@RestController
public class Hello {
    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/hello")
    public Greeting hello(@RequestParam(value = "name", defaultValue = "World") String name) {
        return new Greeting(counter.incrementAndGet(), String.format(template, name));
    }
    @GetMapping("/a")
    public Greeting a(@RequestParam(value = "name", defaultValue = "World") String name) {

//        dbcTemplate.queryForList("select * from city where ID>'2' and ID<'9'");

        return new Greeting(counter.incrementAndGet(), String.format(template, name));
    }
}