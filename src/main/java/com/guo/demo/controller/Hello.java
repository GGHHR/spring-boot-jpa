package com.guo.demo.controller;

import com.guo.demo.entity.City;
import com.guo.demo.repository.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;


@RestController
public class Hello {
    @Autowired
    private CityRepository cityRepo;

    @Value("${devtools.livereload.enabled}")
    private String autoInject;

    /*获取配置项 yml*/
    @Value("${spring.datasource.url}")
    private String url;
    
    @GetMapping(path = "url")
    public String show() {
        return url;
    }


    @GetMapping("/name")
    public @ResponseBody Object  setName(@RequestParam(required = false) Integer id,@RequestParam(required = false) String name) {
        return cityRepo.findByName(name);
    }
    @GetMapping("/ds")
    public @ResponseBody Object  district( @RequestParam(required = false) String district) {
        return cityRepo.findByDistrict(district);
    }
    @GetMapping("/save")
    public @ResponseBody Object  save( @RequestParam(required = false) String name) {
        City a = new City();
        a.setName("nihao");
        a.setCreatAt(new Date());
        cityRepo.save(a);
        return  a;
    }

}