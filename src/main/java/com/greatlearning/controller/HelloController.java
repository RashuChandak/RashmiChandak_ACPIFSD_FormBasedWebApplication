package com.greatlearning.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

	@RequestMapping("/hello")
	public String welcome(ModelMap model) {

		model.addAttribute("message", "hello and welcome to the project");
//null means name of attribute, model means value of attribute
		return "hello";
	}
}
