package com.guo.demo;

import com.guo.demo.controller.Hello;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class DemoApplicationTests {


    @Autowired
    private Hello Hello;

    @Test
    void hello() {
        String aHello = Hello.hello();
        System.out.println(aHello);
    }

}
