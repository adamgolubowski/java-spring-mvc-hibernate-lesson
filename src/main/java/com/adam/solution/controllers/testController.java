package com.adam.solution.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class testController {
	@RequestMapping("/")
	public String homePage() {
		return "home-page";
	}
}
