package com.shop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/map")	// http://127.0.0.1/map 으로 시작
public class MapController {
	
	String dir = "map/";
	
	@RequestMapping("")	// http://127.0.0.1/map
	public String main(Model model) {
		model.addAttribute("left", dir+"left");
		model.addAttribute("center", dir+"center");
		return "main";
	}
	
	@RequestMapping("/ch1")	// http://127.0.0.1/map/ch1
	public String map1(Model model) {
		model.addAttribute("left", dir+"left");
		model.addAttribute("center", dir+"ch1");
		return "main";
	}
	
	@RequestMapping("/ch2")	// http://127.0.0.1/map/ch2
	public String map2(Model model) {
		model.addAttribute("left", dir+"left");
		model.addAttribute("center", dir+"ch2");
		return "main";
	}
	
	@RequestMapping("/ch3")	// http://127.0.0.1/map/ch3
	public String map3(Model model) {
		model.addAttribute("left", dir+"left");
		model.addAttribute("center", dir+"ch3");
		return "main";
	}
	
	@RequestMapping("/ch4")	// http://127.0.0.1/map/ch4
	public String map4(Model model) {
		model.addAttribute("left", dir+"left");
		model.addAttribute("center", dir+"ch4");
		return "main";
	}
	
	@RequestMapping("/ch5")	// http://127.0.0.1/map/ch5
	public String map5(Model model) {
		model.addAttribute("left", dir+"left");
		model.addAttribute("center", dir+"ch5");
		return "main";
	}
	
	@RequestMapping("/ch6")	// http://127.0.0.1/map/ch6
	public String map6(Model model) {
		model.addAttribute("left", dir+"left");
		model.addAttribute("center", dir+"ch6");
		return "main";
	}
	
	@RequestMapping("/ch7")	// http://127.0.0.1/map/ch7
	public String map7(Model model) {
		model.addAttribute("left", dir+"left");
		model.addAttribute("center", dir+"ch7");
		return "main";
	}
}
