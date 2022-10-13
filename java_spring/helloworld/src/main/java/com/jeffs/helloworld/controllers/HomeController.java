package com.jeffs.helloworld.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController{
    
    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("pieName", "French Silk");
        return "sample.jsp";
    }
    
}

//@RestController
//public class HomeController {
//	@RequestMapping("/")
//	public String index() {
//		return "Hello World";
//	}
//	
//	@RequestMapping("/greeting")
//	public String greeting(@RequestParam(value="q", required=false) String provName) {
//		return "Hello " + provName;
//	}
//	
//	@RequestMapping("/search")
//	public String search(@RequestParam(value="q") String searchQuery) {
//		return "You searched for: " + searchQuery;
//	}
//	
//	@RequestMapping("/user/{username}")
//	public String viewUser(@PathVariable("username") String username) {
//		return "Username: " + username;
//	}
//}
