package com.shop.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.shop.dto.Item;
import com.shop.frame.ImgUtil;
import com.shop.service.ItemService;


@Controller
@RequestMapping("/item")	// http://127.0.0.1/item 으로 시작
public class ItemController {
	
	String dir = "item/";
	
	@Autowired
	ItemService service;
	
	@Value("${custdir}")
	String custdir;
	
	@RequestMapping("")	// http://127.0.0.1/item
	public String main(Model model) {
		model.addAttribute("left", dir+"left");
		model.addAttribute("center", dir+"center");
		return "main";
	}
	
	@RequestMapping("/add")	// http://127.0.0.1/item/add
	public String add(Model model) {
		model.addAttribute("left", dir+"left");
		model.addAttribute("center", dir+"add");
		return "main";
	}
	
	@RequestMapping("/register")	// http://127.0.0.1/item/register
	public String register(Model model, Item item) {

		String imgname = item.getImg().getOriginalFilename();
		item.setImgname(imgname);
		
		try {
			ImgUtil.saveFile(item.getImg(), custdir);
			service.register(item);
			model.addAttribute("center", dir+"registerok");
		} catch (Exception e) {
			model.addAttribute("center", dir+"registerfail");
			e.printStackTrace();
		}
		
		model.addAttribute("left", dir+"left");
		return "main";
	}
	
	@RequestMapping("/getall")	// http://127.0.0.1/item/getall
	public String getall(Model model) {
		List<Item> ilist = null;
		
		try {
			ilist = service.get();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		model.addAttribute("itemlist", ilist);
		model.addAttribute("left", dir+"left");
		model.addAttribute("center", dir+"getall");
		return "main";
	}
	
	@RequestMapping("/get")	// http://127.0.0.1/item/get
	public String get(Model model, int id) {
		Item item = null;
		
		try {
			item = service.get(id);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		model.addAttribute("item", item);
		model.addAttribute("left", dir+"left");
		model.addAttribute("center", dir+"get");
		return "main";
	}
	
	@RequestMapping("/update")	// http://127.0.0.1/item/update
	public String update(Model model, Item item) {
		String imgname = item.getImg().getOriginalFilename();
		
		if(imgname.equals("") || imgname == null) {
			try {
				service.modify(item);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}else {
			item.setImgname(imgname);
			try {
				service.modify(item);
				ImgUtil.saveFile(item.getImg(), custdir);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		return "redirect:get?id="+item.getId();
	}
	
	@RequestMapping("/delete")	// http://127.0.0.1/item/delete
	public String delete(Model model, int id) {
		try {
			service.remove(id);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return "redirect:getall";
	}
	
}
