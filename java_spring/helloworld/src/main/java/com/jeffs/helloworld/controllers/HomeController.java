package com.jeffs.helloworld.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	@RequestMapping("/")
	public String index() {
		return "Hello World";
	}
	
	@RequestMapping("/greeting")
	public String greeting(@RequestParam(value="q", required=false) String provName) {
		return "Hello " + provName;
	}
	
	@RequestMapping("/search")
	public String search(@RequestParam(value="q") String searchQuery) {
		return "You searched for: " + searchQuery;
	}
	
	@RequestMapping("/user/{username}")
	public String viewUser(@PathVariable("username") String username) {
		return "Username: " + username;
	}
}
