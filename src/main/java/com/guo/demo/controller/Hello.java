package com.guo.demo.controller;

import com.guo.demo.entity.City;
import com.guo.demo.repository.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Hello {
    @Autowired
    private CityRepository cityRepo;

    @GetMapping("/name")
    public @ResponseBody Object  setName(@RequestParam(required = false) Integer id,@RequestParam(required = false) String name) {

        City a = cityRepo.findById(id).get();
        System.out.println(a);
        a.setName("2");
        cityRepo.save(a);
        return a;
    }

}