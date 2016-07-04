package com.manish.javadev.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloWorldController {
	String message = "Welcome to Spring MVC!";

	@RequestMapping("/hello.htm")
	public ModelAndView showMessage(){

		// 1 Creating a ModelAndView Object
		ModelAndView model = new ModelAndView("helloWorld");
		model.addObject("firstName", "Divya");
		model.addObject("lastName", "Srivastava");
		return model;
		
	}
}