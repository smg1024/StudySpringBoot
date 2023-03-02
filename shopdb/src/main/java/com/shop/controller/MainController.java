package com.shop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
	
	@RequestMapping("")
	public String main() {
		return "main";
	}
	
	@RequestMapping("/item")
	public String item(Model model) {
		model.addAttribute("left", "item_left");
		model.addAttribute("center", "item_center");
		
		return "main";
	}
	
	@RequestMapping("/item1")
	public String item1(Model model) {
		model.addAttribute("left", "item_left");
		model.addAttribute("center", "item1");
		
		return "main";
	}
	
	@RequestMapping("/register")
	public String register(Model model) {
		model.addAttribute("center", "register");
		
		return "main";
	}
}
