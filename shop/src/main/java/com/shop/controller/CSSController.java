package com.shop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/css")	// http://127.0.0.1/css5 으로 시작
public class CSSController {
	
	String dir = "css/";
	
	@RequestMapping("")	// http://127.0.0.1/css
	public String main(Model model) {
		model.addAttribute("left", dir+"left");
		model.addAttribute("center", dir+"center");
		return "main";
	}
	
	@RequestMapping("/ch1")	// http://127.0.0.1/css/ch1
	public String css1(Model model) {
		model.addAttribute("left", dir+"left");
		model.addAttribute("center", dir+"ch1");
		return "main";
	}
	
	@RequestMapping("/ch2")	// http://127.0.0.1/css/ch2
	public String css2(Model model) {
		model.addAttribute("left", dir+"left");
		model.addAttribute("center", dir+"ch2");
		return "main";
	}
	
	@RequestMapping("/ch3")	// http://127.0.0.1/css/ch3
	public String css3(Model model) {
		model.addAttribute("left", dir+"left");
		model.addAttribute("center", dir+"ch3");
		return "main";
	}
	
	@RequestMapping("/ch4")	// http://127.0.0.1/css/ch4
	public String css4(Model model) {
		model.addAttribute("left", dir+"left");
		model.addAttribute("center", dir+"ch4");
		return "main";
	}
	
	@RequestMapping("/ch5")	// http://127.0.0.1/css/ch5
	public String css5(Model model) {
		model.addAttribute("left", dir+"left");
		model.addAttribute("center", dir+"ch5");
		return "main";
	}
}
