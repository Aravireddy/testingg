package com.example.SpringBoot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloWorld {

	@RequestMapping("/hello")
	public String hello() {
		return "hello world..!   go an do your work okay";
	}
}
