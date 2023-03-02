package com.shop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/chart")	// http://127.0.0.1/chart 으로 시작
public class ChartController {
	
	String dir = "chart/";
	
	@RequestMapping("")	// http://127.0.0.1/chart
	public String main(Model model) {
		model.addAttribute("left", dir+"left");
		model.addAttribute("center", dir+"center");
		return "main";
	}
	
	@RequestMapping("/ch1")	// http://127.0.0.1/chart/ch1
	public String chart1(Model model) {
		model.addAttribute("left", dir+"left");
		model.addAttribute("center", dir+"ch1");
		return "main";
	}
	
	@RequestMapping("/ch2")	// http://127.0.0.1/chart/ch2
	public String chart2(Model model) {
		model.addAttribute("left", dir+"left");
		model.addAttribute("center", dir+"ch2");
		return "main";
	}
	
	@RequestMapping("/ch3")	// http://127.0.0.1/chart/ch3
	public String chart3(Model model) {
		model.addAttribute("left", dir+"left");
		model.addAttribute("center", dir+"ch3");
		return "main";
	}
	
	@RequestMapping("/ch4")	// http://127.0.0.1/chart/ch4
	public String chart4(Model model) {
		model.addAttribute("left", dir+"left");
		model.addAttribute("center", dir+"ch4");
		return "main";
	}
	
	@RequestMapping("/ch5")	// http://127.0.0.1/chart/ch5
	public String chart5(Model model) {
		model.addAttribute("left", dir+"left");
		model.addAttribute("center", dir+"ch5");
		return "main";
	}
	
	@RequestMapping("/ch6")	// http://127.0.0.1/chart/ch6
	public String chart6(Model model) {
		model.addAttribute("left", dir+"left");
		model.addAttribute("center", dir+"ch6");
		return "main";
	}
	
	@RequestMapping("/ch7")	// http://127.0.0.1/chart/ch7
	public String chart7(Model model) {
		model.addAttribute("left", dir+"left");
		model.addAttribute("center", dir+"ch7");
		return "main";
	}
}
