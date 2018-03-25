package com.snipe.service;

import org.springframework.stereotype.Component;

@Component
public class HelloServiceHiHystric implements HelloService{

    @Override
    public String sayHiFromClientOne(String name) {
        return "sory" + name;
    }

}
