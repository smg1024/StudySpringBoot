package com.shop.weather;

import java.io.IOException;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.shop.frame.WUtil;

@SpringBootTest
class WeatherTests {

	@Test
	void contextLoads() {
		String loc = "108";
		String result = "";
		try {
			result = (String) WUtil.getData(loc);
			System.out.println(result);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
