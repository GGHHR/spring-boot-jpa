package com.guo.demo.controller;

import com.guo.demo.repository.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class Hello {
    @Autowired
    private CityRepository cityRepository;

    @GetMapping("/all")
    public @ResponseBody Object  getAllCity( Integer id) {
        return cityRepository.findById(id);
    }
}