package com.shop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/javascript")	// http://127.0.0.1/javascript 으로 시작
public class JavascriptController {
	
	String dir = "javascript/";
	
	@RequestMapping("")	// http://127.0.0.1/javascript
	public String main(Model model) {
		model.addAttribute("left", dir+"left");
		model.addAttribute("center", dir+"center");
		return "main";
	}
	
	@RequestMapping("/ch1")	// http://127.0.0.1/javascript/ch1
	public String javascript1(Model model) {
		model.addAttribute("left", dir+"left");
		model.addAttribute("center", dir+"ch1");
		return "main";
	}
	
	@RequestMapping("/ch2")	// http://127.0.0.1/javascript/ch2
	public String javascript2(Model model) {
		model.addAttribute("left", dir+"left");
		model.addAttribute("center", dir+"ch2");
		return "main";
	}
	
	@RequestMapping("/ch3")	// http://127.0.0.1/javascript/ch3
	public String javascript3(Model model) {
		model.addAttribute("left", dir+"left");
		model.addAttribute("center", dir+"ch3");
		return "main";
	}
	
	@RequestMapping("/ch4")	// http://127.0.0.1/javascript/ch4
	public String javascript4(Model model) {
		model.addAttribute("left", dir+"left");
		model.addAttribute("center", dir+"ch4");
		return "main";
	}
	
	@RequestMapping("/ch5")	// http://127.0.0.1/javascript/ch5
	public String javascript5(Model model) {
		model.addAttribute("left", dir+"left");
		model.addAttribute("center", dir+"ch5");
		return "main";
	}
	
	@RequestMapping("/ch6")	// http://127.0.0.1/javascript/ch6
	public String javascript6(Model model) {
		model.addAttribute("left", dir+"left");
		model.addAttribute("center", dir+"ch6");
		return "main";
	}
	
	@RequestMapping("/ch7")	// http://127.0.0.1/javascript/ch7
	public String javascript7(Model model) {
		model.addAttribute("left", dir+"left");
		model.addAttribute("center", dir+"ch7");
		return "main";
	}
	
	@RequestMapping("/ch8")	// http://127.0.0.1/javascript/ch8
	public String javascript8(Model model) {
		model.addAttribute("left", dir+"left");
		model.addAttribute("center", dir+"ch8");
		return "main";
	}
	
	@RequestMapping("/ch9")	// http://127.0.0.1/javascript/ch9
	public String javascript9(Model model) {
		model.addAttribute("left", dir+"left");
		model.addAttribute("center", dir+"ch9");
		return "main";
	}
}
