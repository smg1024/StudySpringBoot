package com.shop.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.shop.dto.Cust;
import com.shop.service.CustService;

@Controller
@RequestMapping("/cust")	// http://127.0.0.1/cust 으로 시작
public class CustController {
	
	String dir = "cust/";
	
	@Autowired
	CustService custservice;
	
	@RequestMapping("")	// http://127.0.0.1/cust
	public String main(Model model) {
		model.addAttribute("left", dir+"left");
		model.addAttribute("center", dir+"center");
		return "main";
	}
	
	@RequestMapping("/getall")	// http://127.0.0.1/cust/getall
	public String cust1(Model model) {
		List<Cust> list = null;
		try {
			list = custservice.get();
		} catch (Exception e) {
			e.printStackTrace();
		}
		model.addAttribute("custlist", list);
		
		model.addAttribute("left", dir+"left");
		model.addAttribute("center", dir+"getall");
		return "main";
	}
	
	@RequestMapping("/add")	// http://127.0.0.1/cust/add
	public String cust2(Model model) {
		model.addAttribute("left", dir+"left");
		model.addAttribute("center", dir+"add");
		return "main";
	}
	
	@RequestMapping("/register")	// http://127.0.0.1/cust/ch2
	public String register(Model model, Cust cust) {
		try {
			custservice.register(cust);
			model.addAttribute("center", dir+"registerok");
			model.addAttribute("cust", cust);
		} catch (Exception e) {
			model.addAttribute("center", dir+"registerfail");
			e.printStackTrace();
		}
		
		model.addAttribute("left", dir+"left");
		return "main";
	}
	
	@RequestMapping("/get")	// http://127.0.0.1/cust/get
	public String get(Model model, String id) {
		Cust cust = null;
		try {
			cust = custservice.get(id);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		model.addAttribute("cust", cust);
		model.addAttribute("left", dir+"left");
		model.addAttribute("center", dir+"get");
		return "main";
	}
	
	@RequestMapping("/update")	// http://127.0.0.1/cust/update
	public String update(Model model, Cust cust) {
		try {
			custservice.modify(cust);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return "redirect:get?id="+cust.getId();
	}
	
	@RequestMapping("/delete")	// http://127.0.0.1/cust/delete
	public String delete(Model model, String id) {
		try {
			custservice.remove(id);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return "redirect:getall";
	}
	
	@RequestMapping("/ch6")	// http://127.0.0.1/cust/ch6
	public String cust6(Model model) {
		model.addAttribute("left", dir+"left");
		model.addAttribute("center", dir+"ch6");
		return "main";
	}
	
	@RequestMapping("/ch7")	// http://127.0.0.1/cust/ch7
	public String cust7(Model model) {
		model.addAttribute("left", dir+"left");
		model.addAttribute("center", dir+"ch7");
		return "main";
	}
}
