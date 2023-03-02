package com.shop.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shop.dto.Cfr2;
import com.shop.dto.Cust;
import com.shop.dto.Rank;
import com.shop.frame.CFR2Util;
import com.shop.frame.ImgUtil;
import com.shop.frame.OCRUtil;
import com.shop.frame.WUtil;
import com.shop.service.CustService;

@SuppressWarnings("unchecked")
@RestController
public class AController {
	
	@Value("${custdir}")
	String custdir;
	
	@Autowired
	CustService cservice;
	
	@RequestMapping("/time")
	public Object time() {
		Date date = new Date();
		return date.toString();
	}
	
	@RequestMapping("/cnt")
	public Object cnt() {
		Random r = new Random();
		int i = r.nextInt(100);
		return i;
	}
	
	@RequestMapping("/rank")
	public Object rank() {
		List<Rank> list = new ArrayList<Rank>();
		list.add(new Rank(1,"전쟁","w"));
		list.add(new Rank(2,"경제","e"));
		list.add(new Rank(3,"문학","l"));
		list.add(new Rank(4,"소설","n"));
		list.add(new Rank(5,"K-pop","k"));
		
//		// Java Object -> JSON
//		JSONArray arr = new JSONArray();
//		
//		for(Rank r : list) {
//			JSONObject obj = new JSONObject();
//			obj.put("rank", r.getRank());
//			obj.put("title", r.getTitle());
//			obj.put("updown", r.getUpdown());
//			// {"rank":1,"title":"전쟁","updown":"w"}
//			arr.add(obj);
//		}
		
		return list;
	}
	
	@RequestMapping("/checkid")
	public Object checkid(String id) {
		int result = 0;
		Cust cust = null;
		
		try {
			cust = cservice.get(id);
			
			if(cust==null) {
				result = 1;
			}else {
				result = 0;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return result;
	}
	
	@RequestMapping("/getmarker2")
	public Object getmarker2(String loc) {
		JSONArray ja = new JSONArray();
		if(loc.equals("s")) {
			JSONObject jo1 = new JSONObject();
			jo1.put("title", "국밥집");
			jo1.put("target", "http://www.naver.com");
			jo1.put("lat", 37.5286891);
			jo1.put("lng", 127.061432);
			jo1.put("img", "food1.jpg");
			ja.add(jo1);
			
			JSONObject jo2 = new JSONObject();
			jo2.put("title", "짬뽕집");
			jo2.put("target", "http://www.daum.net");
			jo2.put("lat", 37.5386891);
			jo2.put("lng", 127.021432);
			jo2.put("img", "food2.jpg");
			ja.add(jo2);
			
			JSONObject jo3 = new JSONObject();
			jo3.put("title", "닭발집");
			jo3.put("target", "http://www.google.com");
			jo3.put("lat", 37.5186891);
			jo3.put("lng", 127.031432);
			jo3.put("img", "food3.jpg");
			ja.add(jo3);
		}else if(loc.equals("b")) {
			JSONObject jo1 = new JSONObject();
			jo1.put("title", "국밥집");
			jo1.put("target", "http://www.naver.com");
			jo1.put("lat", 35.1233984);
			jo1.put("lng", 129.0906448);
			jo1.put("img", "food1.jpg");
			ja.add(jo1);
			
			JSONObject jo2 = new JSONObject();
			jo2.put("title", "짬뽕집");
			jo2.put("target", "http://www.daum.net");
			jo2.put("lat", 35.1243984);
			jo2.put("lng", 129.0936448);
			jo2.put("img", "food2.jpg");
			ja.add(jo2);
			
			JSONObject jo3 = new JSONObject();
			jo3.put("title", "닭발집");
			jo3.put("target", "http://www.google.com");
			jo3.put("lat", 35.1253984);
			jo3.put("lng", 129.0966448);
			jo3.put("img", "food3.jpg");
			ja.add(jo3);
		}else if(loc.equals("j")) {
			//33.5199183,126.6142571
			JSONObject jo1 = new JSONObject();
			jo1.put("title", "국밥집");
			jo1.put("target", "http://www.naver.com");
			jo1.put("lat", 33.5239183);
			jo1.put("lng", 126.6162571);
			jo1.put("img", "food1.jpg");
			ja.add(jo1);
			
			JSONObject jo2 = new JSONObject();
			jo2.put("title", "짬뽕집");
			jo2.put("target", "http://www.daum.net");
			jo2.put("lat", 33.5119183);
			jo2.put("lng", 126.6252571);
			jo2.put("img", "food2.jpg");
			ja.add(jo2);
			
			JSONObject jo3 = new JSONObject();
			jo3.put("title", "닭발집");
			jo3.put("target", "http://www.google.com");
			jo3.put("lat", 33.5109183);
			jo3.put("lng", 126.6242571);
			jo3.put("img", "food3.jpg");
			ja.add(jo3);
		}
		
		return ja;
	}
	
	@RequestMapping("/chart1")
	public Object chart1() {
		// {'x':['1','2','3',...], 'mdata':[111,222,333,444,...]} 여러개의 배열을 담기
//		JSONObject jo = new JSONObject();
//		JSONArray month = new JSONArray();
//		JSONArray mdata = new JSONArray();
//		
//		for(int i=0; i<10; i++) {
//			month.add(i+1+"월");
//			
//			Random r = new Random();
//			int a = r.nextInt(1000)+1;
//			mdata.add(a);
//		}
//		
//		jo.put("month", month);
//		jo.put("mdata", mdata);
		
		List<Integer> mdata = new ArrayList<Integer>();
		List<String> month = new ArrayList<String>();
		
		HashMap<String, List> map = new HashMap<>();
		
		for(int i=0; i<10; i++) {
			Random r = new Random();
			
			mdata.add(r.nextInt(1000)+1);
			month.add(i+1+"월");
		}
		
		map.put("month", month);
		map.put("mdata", mdata);
		
		return map;
	}
	
	@RequestMapping("/chart2")
	public Object chart2() {
		// {'x':['1','2','3',...], 'mdata':[111,222,333,444,...]} 여러개의 배열을 담기
		JSONObject jo = new JSONObject();
		JSONArray month = new JSONArray();
		JSONArray temp = new JSONArray();
		JSONArray prec = new JSONArray();
		
		for(int i=0; i<12; i++) {
			month.add(i+1+"월");
			
			Random r = new Random();
			double a = Math.round((r.nextDouble()*60-30)*10)/10.0;
			temp.add(a);
			
			float b = Math.round((r.nextFloat()*50)*10)/10.0f;
			prec.add(b);
		}
		
		jo.put("month", month);
		jo.put("temp", temp);
		jo.put("prec", prec);
		
		return jo;
	}
	
	@RequestMapping("/chart3")
	public Object chart3(String sm, String em) {
		JSONObject jo = new JSONObject();
		JSONArray month = new JSONArray();
		JSONArray maledata = new JSONArray();
		JSONArray femaledata = new JSONArray();
		
		for(int i=Integer.parseInt(sm); i<=Integer.parseInt(em); i++) {
			month.add(i+"월");
			
			Random r = new Random();
			double a = Math.round((r.nextDouble()*150)*10)/10.0;
			maledata.add(a);
			
			float b = Math.round((r.nextFloat()*150)*10)/10.0f;
			femaledata.add(b);
		}
		
		jo.put("month", month);
		
		JSONArray data = new JSONArray();
		JSONObject male = new JSONObject();
		male.put("name", "Male");
		male.put("data", maledata);
		data.add(male);
		
		JSONObject female = new JSONObject();
		female.put("name", "Female");
		female.put("data", femaledata);
		data.add(female);
		
		jo.put("data", data);
		
		return jo;
	}
	
	@RequestMapping("/weather")
	public Object weather(String loc) {
		Object result = null;
		try {
			result = WUtil.getData(loc);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return result;
	}
	
	@RequestMapping("/cfr2impl")
	public Object cfr2impl(Cfr2 cfr2) {
		String imgname = cfr2.getImg().getOriginalFilename();
		System.out.println(imgname);
		String result = "";
		
		try {
			ImgUtil.saveFile(cfr2.getImg(), imgname);
			result = CFR2Util.getResult(imgname, custdir);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return result;
	}
	
	@RequestMapping("/ocrimpl")
	public Object oicrimpl(Cfr2 cfr2) {
		String imgname = cfr2.getImg().getOriginalFilename();
		System.out.println(imgname);
		String result = "";
		
		try {
			ImgUtil.saveFile(cfr2.getImg(), imgname);
			result = OCRUtil.getText(imgname, custdir);
			System.out.println(result);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return result;
	}

}
