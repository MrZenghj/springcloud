package com.snipe.controller;

import com.snipe.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    /**
     *  在Web层的controller层，对外暴露一个”/hi”的API接口，
     *  通过上面定义的Feign客户端helloService 来消费服务
     */
    @Autowired
    HelloService helloService;
    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String sayHi(@RequestParam String name){
        return helloService.sayHiFromClientOne(name);
    }
}
