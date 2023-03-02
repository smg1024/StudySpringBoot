package com.shop.cust;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.shop.service.CustService;

@SpringBootTest
class DeleteTest {
	
	@Autowired
	CustService service;
	
	@Test
	void contextLoads() {
		try {
			service.remove("id03");
			System.out.println("OK");
		} catch (Exception e) {
			System.out.println("Fail");
			e.printStackTrace();
		}
	}

}