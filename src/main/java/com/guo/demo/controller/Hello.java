package com.guo.demo.controller;

import com.guo.demo.entity.City;
import com.guo.demo.entity.Greeting;
import com.guo.demo.repository.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;


@RestController
public class Hello {

    @Autowired
    private CityRepository cityRepository;

    private final AtomicLong counter = new AtomicLong();

    @GetMapping("/all")
    public @ResponseBody Iterable<City> getAllCity() {
        // This returns a JSON or XML with the users
        return cityRepository.findAll();
    }
    @GetMapping("/hello")
    public Greeting hello(@RequestParam(value = "name", defaultValue = "World") String name) {
        return new Greeting(counter.incrementAndGet(),"nihao"+name);
    }



}