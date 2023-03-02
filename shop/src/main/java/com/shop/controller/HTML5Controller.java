package com.shop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/html5")	// http://127.0.0.1/html5 으로 시작
public class HTML5Controller {
	
	String dir = "html5/";
	
	@RequestMapping("")	// http://127.0.0.1/html5
	public String main(Model model) {
		model.addAttribute("left", dir+"left");
		model.addAttribute("center", dir+"center");
		return "main";
	}
	
	@RequestMapping("/ch1")	// http://127.0.0.1/html5/ch1
	public String html1(Model model) {
		model.addAttribute("left", dir+"left");
		model.addAttribute("center", dir+"ch1");
		return "main";
	}
	
	@RequestMapping("/ch2")	// http://127.0.0.1/html5/ch2
	public String html2(Model model) {
		model.addAttribute("left", dir+"left");
		model.addAttribute("center", dir+"ch2");
		
		model.addAttribute("mytxt", "Welcome to this website");
		return "main";
	}
	
	@RequestMapping("/ch3")	// http://127.0.0.1/html5/ch3
	public String html3(Model model) {
		model.addAttribute("left", dir+"left");
		model.addAttribute("center", dir+"ch3");
		return "main";
	}
	
	@RequestMapping("/ch4")	// http://127.0.0.1/html5/ch4
	public String html4(Model model) {
		model.addAttribute("left", dir+"left");
		model.addAttribute("center", dir+"ch4");
		return "main";
	}
	
	@RequestMapping("/ch5")	// http://127.0.0.1/html5/ch5
	public String html5(Model model) {
		model.addAttribute("left", dir+"left");
		model.addAttribute("center", dir+"ch5");
		return "main";
	}
}
