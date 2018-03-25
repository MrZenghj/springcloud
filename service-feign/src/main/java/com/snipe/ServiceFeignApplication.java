package com.snipe;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
/**
 *		仪表盘访问地址： http://localhost:8764/hystrix
 *			监控 则添加后缀  .stream
 *					如http://localhost:8764/hystrix.stream
 *	关于断路器仪表盘显示Unable to connect to Command Metric Stream.
 *	访问URL : http://blog.csdn.net/seapeak007/article/details/77261729
 * */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
@EnableHystrixDashboard
@EnableCircuitBreaker
public class ServiceFeignApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceFeignApplication.class, args);
	}
}
