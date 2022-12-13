package com.line.demo;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootTest
@DisplayName("JUnit Exam 테스트 클래스")
class ExamApplicationTests3 {
	
	int number = ((int)(Math.random()*50000)) * 1000000000;
	
	@BeforeEach
	@DisplayName("문제 : 설정")
	public void strt() {
	}
	
	@Test
	@DisplayName("문제 : 풀이")
	public void test() {
		//2*2 = 4
		//4*4 = 16
	}
	
	@AfterEach
	@DisplayName("문제 : 출력")
	public void end() {
	}

}