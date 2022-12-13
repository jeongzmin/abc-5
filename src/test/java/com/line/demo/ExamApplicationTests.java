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
class ExamApplicationTests {
	
	public String word = "";
	int count1 = 0;
	int count2 = 0;
	
	@BeforeEach
	@DisplayName("문제 : 설정")
	public void strt() {
		String w = "";
		int i = 0;
		while (i < ((int)(Math.random()*50))) {
			w += ((int)(Math.random()*2)) == 0 ? (char)((int)(Math.random()*26)+97) : (char)((int)(Math.random()*26)+65);
		    i++;
		}
		word = w;
	}
	
	@Test
	@DisplayName("문제 : 풀이")
	public void test() {
		System.out.println(word);
		
		word = "p";
		
		String word1 = "p";
		String word2 = "y";
		
		char[] charArray = word.toLowerCase().toCharArray();

		int size = charArray.length;
		for (int i = 0; i < size; i++) {
			String arr = charArray[i]+"";
			if(word1.equals(arr)) {
				count1++;
			}
			
			if(word2.equals(arr)) {
				count2++;
			}
		}
	}
	
	@AfterEach
	@DisplayName("문제 : 출력")
	public void end() {
		System.out.println( "결과출력 :"+count1+","+count2 );
		System.out.println( count1==count2 ? true : false );
	}
	
//	@NullSource
//	@EmptySource
//	@RepeatedTest(value = 10, name = "{displayName} {currentRepetition}/{totalRepetitions}")
//	@Test
//	@Order(1)
	
//	@DisplayName("문제 : 옹알이")
//	@ParameterizedTest(name ="{index} {displayName} message = {0}")
//	@NullAndEmptySource
//	@ValueSource(strings={"babbling"})
////	@ValueSource(strings = { "q", "qwerasdfzxcv", "qq23" })
//	void testOngaleSource(String argument) {
//		System.out.println(this.ongale(argument));
//	}
//	}

}