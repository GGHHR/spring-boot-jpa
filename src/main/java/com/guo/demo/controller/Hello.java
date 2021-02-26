package com.guo.demo.controller;

import com.guo.demo.entity.City;
import com.guo.demo.repository.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.stream.Collectors;


@RestController
public class Hello {
    @Autowired
    private CityRepository cityRepo;

    @Value("${devtools.livereload.enabled}")
    private String autoInject;

    /*获取配置项 yml*/
    @Value("${spring.datasource.url}")
    private String url;
    /*返回配置项url*/
    @GetMapping(path = "url")
    public String show(HttpServletRequest request) {
        System.out.println(request.getHeader("myHeader"));
        return url;
    }

    @GetMapping("/all")
    public @ResponseBody Object  all() {
        List list=cityRepo.findAll();
        return list;
    }

    @GetMapping("/name")
    public @ResponseBody Object  setName(@RequestParam(required = false) Integer id,@RequestParam(required = false) String name) {
        List<City> list=cityRepo.findByName(name);
        list.stream().map(data->{
            System.out.println(data.getId());
            return data;
        }).collect(Collectors.toList());
        return list;
    }

    @GetMapping("/ds")
    public @ResponseBody Object  district( City city) {
        List list= cityRepo.findByDistrict(city.getDistrict());
        return list;
    }
    @GetMapping("/save")
    public Object  save(City city) {/*实体类接收参数*/
        return cityRepo.save(city);
    }


}