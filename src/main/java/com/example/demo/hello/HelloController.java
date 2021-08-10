package com.example.demo.hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.Map;

@RestController
public class HelloController {
    @GetMapping("/")
    public Map<String,String> sayHello(){
        return Collections.singletonMap("username1", "password1");
    }
}
