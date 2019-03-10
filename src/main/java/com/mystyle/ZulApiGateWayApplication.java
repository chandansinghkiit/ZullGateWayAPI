package com.mystyle;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableZuulProxy
@SpringBootApplication
public class ZulApiGateWayApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZulApiGateWayApplication.class, args);
	}
	

}
