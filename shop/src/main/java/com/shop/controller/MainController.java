package com.shop.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.shop.dto.Cust;
import com.shop.service.CustService;

@Controller
public class MainController {
	
	@Autowired
	CustService cservice;
	
	@RequestMapping("")
	public String main() {
		return "main";
	}
	
	@RequestMapping("/cfr2")
	public String cfr2(Model model) {
		model.addAttribute("center", "cfr2");
		return "main";
	}
	
	@RequestMapping("/ocr")
	public String ocr(Model model) {
		model.addAttribute("center", "ocr");
		return "main";
	}
	
	@RequestMapping("/chatbot")
	public String chatbot(Model model) {
		model.addAttribute("center", "chatbot");
		return "main";
	}
	
	@RequestMapping("/login")
	public String login(Model model) {
		model.addAttribute("center", "login");
		return "main";
	}
	
	@RequestMapping("/logout")
	public String logout(HttpSession session) {
		if(session != null) {
			session.invalidate();
		}
		return "main";
	}
	
	@PostMapping("/loginimpl")
	public String loginimpl(HttpSession session, String id, String pwd, Model model) {
		Cust cust = null;
		String resultpage = "loginfail";	// 로그인 시도의 default는 실패 페이지
		
		try {
			cust = cservice.get(id);
			
			if(cust!=null) {	// 아이디는 존재한다면,
				if(cust.getPwd().equals(pwd)) {	// 비번이 입력받은 비번과 일치하면,
					// 로그인 성공 -> 세션 생성
					session.setAttribute("logincust", cust);
					
					resultpage = "loginok";	// 성공 페이지로 이동
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		model.addAttribute("center", resultpage);
		return "main";
	}
	
	@RequestMapping("/websocket")
	public String websocket(Model model) {
		model.addAttribute("center", "websocket");
		return "main";
	}
}
