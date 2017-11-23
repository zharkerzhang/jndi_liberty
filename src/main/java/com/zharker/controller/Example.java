package com.zharker.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.stereotype.*;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@RestController
//@EnableAutoConfiguration
public class Example {
	
	@Value("${profileStr}")
	private String profileStr;

	@RequestMapping("/")
	String home() {
		return "Hello liveReload! profile: "+profileStr;
	}
	
	@RequestMapping("/home")
	String home2(Model model) {
		model.addAttribute("message", "Hello World!");
		return "index";
	}
/*
	public static void main(String[] args) throws Exception {
		SpringApplication.run(Example.class, args);
	}
	*/

}