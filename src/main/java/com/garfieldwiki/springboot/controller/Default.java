package com.garfieldwiki.springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Default {

	@RequestMapping("/")
	public String index() {
		return "Default page.";
	}

}
