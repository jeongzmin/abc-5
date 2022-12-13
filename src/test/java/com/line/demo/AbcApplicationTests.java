package com.line.demo;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class AbcApplicationTests {

	@Test
	@DisplayName("테스트 Junit 5")
	void contextLoads() {
		System.out.println(">>>");
	}

}
