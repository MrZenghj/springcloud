package com.snipe;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
/**
 * 	/ @EnableEurekaServer 服务注册中心
 * */
@EnableEurekaServer
@SpringBootApplication
public class EurekaSerivceApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaSerivceApplication.class, args);
	}
}
