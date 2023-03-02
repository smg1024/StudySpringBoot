package com.shop.ncp;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;

import com.shop.frame.CFR2Util;

@SpringBootTest
class CFR2Test {
	
	@Value("${custdir}")
	String custdir;

	@Test
	void contextLoads() {
		String imgname="ma.jpeg";
		try {
			String result = CFR2Util.getResult(imgname, custdir);
			System.out.println(result);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}	
}
