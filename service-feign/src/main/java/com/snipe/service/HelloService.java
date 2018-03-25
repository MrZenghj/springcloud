package com.snipe.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *  定义一个feign接口，通过@ FeignClient（“服务名”），来指定调用哪个服务
 *      fallback :
 * */
@FeignClient(value = "service-client",fallback = HelloServiceHiHystric.class)
public interface HelloService {
    @RequestMapping(value = "/hi",method = RequestMethod.GET)
    String sayHiFromClientOne(@RequestParam(value = "name") String name);
}
