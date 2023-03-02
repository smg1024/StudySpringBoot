package com.shop.cust;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.shop.dto.Cust;
import com.shop.service.CustService;

@SpringBootTest
class SelectAllTest {
	
	@Autowired
	CustService service;
	
	@Test
	void contextLoads() {
		List<Cust> custList = null;
		try {
			custList = service.get();
			for(Cust c : custList) {
				System.out.println(c);
			}
			System.out.println("OK");
		} catch (Exception e) {
			System.out.println("Fail");
			e.printStackTrace();
		}
	}

}