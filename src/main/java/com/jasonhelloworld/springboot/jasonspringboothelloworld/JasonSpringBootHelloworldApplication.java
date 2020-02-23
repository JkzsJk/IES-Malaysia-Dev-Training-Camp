package com.jasonhelloworld.springboot.jasonspringboothelloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@EnableAutoConfiguration
@SpringBootApplication
public class JasonSpringBootHelloworldApplication {
	@RequestMapping("/hello")
	@ResponseBody
	public String sayHello() {
		return "Hello World Developer!!!";
	}
/*
	public static void main(String[] args) {
		SpringApplication.run(JasonSpringBootHelloworldApplication.class, args);
	}
*/
}
