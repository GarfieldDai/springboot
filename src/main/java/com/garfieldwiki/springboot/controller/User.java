package com.garfieldwiki.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class User {

	@RequestMapping("/user")
	@ResponseBody
	public String user() {
		return "I am a user.";
	}

}
