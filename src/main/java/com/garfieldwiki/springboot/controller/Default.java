package com.garfieldwiki.springboot.controller;

import com.garfieldwiki.springboot.config.FooProperties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Default {

	@Autowired
	private FooProperties fooProperties;

	@RequestMapping("/")
	public String index() {
		return "Default page." + fooProperties.getHello();
	}

}
