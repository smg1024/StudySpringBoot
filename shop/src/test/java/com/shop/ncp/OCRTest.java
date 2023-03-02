package com.shop.ncp;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;

import com.shop.frame.OCRUtil;

@SpringBootTest
class OCRTest {

	@Value("${custdir}")
	String custdir;
	
	@Test
	void contextLoads() {
		String imgname="s1.jpg";
		try {
			String result = OCRUtil.getText(imgname, custdir);
			System.out.println(result);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}	
}
