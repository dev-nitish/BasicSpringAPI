package com.example.nitish.bootspringapi.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ErrorController {
	
	@RequestMapping("/hello")
	public  String sayHi() {
		return "Hi, this is hello controller responding";
	}
	
	@RequestMapping("/nitish")
	public  String helloNitish() {
		return "Hello Nitish";
	}

}
