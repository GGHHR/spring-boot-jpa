package com.guo.demo;

import com.guo.demo.controller.Hello;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class DemoApplicationTests {


    @Autowired
    private Hello Hello;
}
