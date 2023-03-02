package com.shop.ncp;

import java.io.IOException;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.shop.frame.ChatBotUtil;

@SpringBootTest
class ChatbotTests {

	@Test
	void contextLoads() {
		String q = "욕해서미안해";
		String re = null;
		
		try {
			re = ChatBotUtil.chat(q);
			System.out.println(re);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
