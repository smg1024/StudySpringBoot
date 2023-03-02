package com.shop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/ajax")	// http://127.0.0.1/ajax 으로 시작
public class AjaxController {
	
	String dir = "ajax/";
	
	@RequestMapping("")	// http://127.0.0.1/ajax
	public String main(Model model) {
		model.addAttribute("left", dir+"left");
		model.addAttribute("center", dir+"center");
		return "main";
	}
	
	@RequestMapping("/ch1")	// http://127.0.0.1/ajax/ch1
	public String ajax1(Model model) {
		model.addAttribute("left", dir+"left");
		model.addAttribute("center", dir+"ch1");
		return "main";
	}
	
	@RequestMapping("/ch2")	// http://127.0.0.1/ajax/ch2
	public String ajax2(Model model) {
		model.addAttribute("left", dir+"left");
		model.addAttribute("center", dir+"ch2");
		return "main";
	}
	
	@RequestMapping("/ch3")	// http://127.0.0.1/ajax/ch3
	public String ajax3(Model model) {
		model.addAttribute("left", dir+"left");
		model.addAttribute("center", dir+"ch3");
		return "main";
	}
	
	@RequestMapping("/ch4")	// http://127.0.0.1/ajax/ch4
	public String ajax4(Model model) {
		model.addAttribute("left", dir+"left");
		model.addAttribute("center", dir+"ch4");
		return "main";
	}
	
	@RequestMapping("/ch5")	// http://127.0.0.1/ajax/ch5
	public String ajax5(Model model) {
		model.addAttribute("left", dir+"left");
		model.addAttribute("center", dir+"ch5");
		return "main";
	}
	
	@RequestMapping("/ch6")	// http://127.0.0.1/ajax/ch6
	public String ajax6(Model model) {
		model.addAttribute("left", dir+"left");
		model.addAttribute("center", dir+"ch6");
		return "main";
	}
	
	@RequestMapping("/ch7")	// http://127.0.0.1/ajax/ch7
	public String ajax7(Model model) {
		model.addAttribute("left", dir+"left");
		model.addAttribute("center", dir+"ch7");
		return "main";
	}
}
