package com.example.AlgorithmTest;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

 class InputAndOutputTest {

	private static InputAndOutPut inputAndOutPut;
	@BeforeAll
	static void init(){
		inputAndOutPut = new InputAndOutPut();
	}

	@DisplayName("Q1: 입력없이 'Hello World!' 출력")
	@Test
	 void helloWorld(){
		String result = inputAndOutPut.printHelloWorld();
		Assertions.assertThat(result).isEqualTo("Hello World!");
	}

	@DisplayName("Q2: 두 정수 A와 B를 입력받은 다음, 사칙연산 프로그램")
	@Test
	 void fourArithmeticTest(){
		int addResult = inputAndOutPut.add(1, 2);
		Assertions.assertThat(addResult).isEqualTo(3);
		int subtractResult = inputAndOutPut.subtract(3, 2);
		Assertions.assertThat(subtractResult).isEqualTo(1);
		int multiplyResult = inputAndOutPut.multiply(1, 2);
		Assertions.assertThat(multiplyResult).isEqualTo(2);
		double divideResult = inputAndOutPut.divide(1, 3);
		Assertions.assertThat(divideResult).isEqualTo(1*1.0/3);
		int remainderResult = inputAndOutPut.remainder(7,3);
		Assertions.assertThat(remainderResult).isEqualTo(1);
	}

	@DisplayName("Q3: 두 정수 A와 B를 입력받은 다음, 나머지를 구함")
	@Test
	 void remainderTest(){
		int remainderResult = inputAndOutPut.remainder(7,3);
		Assertions.assertThat(remainderResult).isEqualTo(1);
	}
	@DisplayName("Q4: 두 정수 A와 B를 입력받은 다음, 나머지를 구함")
	@Test
	 void printIsMember(){
		String isMemberStr = inputAndOutPut.printIsMember("joonas");
		String isMemberStr2 = inputAndOutPut.printIsMember("baekjoon");
		Assertions.assertThat(isMemberStr).isEqualTo("joonas??!");
		Assertions.assertThat(isMemberStr2).isEqualTo("baekjoon??!");
	}

	@DisplayName("Q5: 불기 연도가 주어질 때 이를 서기 연도로 바꿔 주는 프로그램")
	@Test
	 void convertYearTest(){
		int convertedYear = inputAndOutPut.convertYear(2541);
		Assertions.assertThat(convertedYear).isEqualTo(1998);
	}

	@DisplayName("Q6: 흰색 피스의 개수가 주어졌을 때, 몇 개를 더하거나 빼야 올바른 세트가 되는지 구하는 프로그램 커스텀버전")
	@Test
	 void findChessPieceTest_custom(){
		String result = inputAndOutPut.findChessPieceCustom(0,1,2,2,2,7);
		Assertions.assertThat(result).isEqualTo("1 0 0 0 0 1");
	}
	@DisplayName("Q7: 흰색 피스의 개수가 주어졌을 때, 몇 개를 더하거나 빼야 올바른 세트가 되는지 구하는 프로그램")
	@Test
	 void findChessPieceTest(){
		String result = inputAndOutPut.findChessPiece("0 1 2 2 2 7");
		Assertions.assertThat(result).isEqualTo("1 0 0 0 0 1");

		String result2 = inputAndOutPut.findChessPiece("2 1 2 1 2 1");
		Assertions.assertThat(result2).isEqualTo("-1 0 0 1 0 7");
	}

	/*
		(A+B)%C는 ((A%C) + (B%C))%C 와 같을까?
		(A×B)%C는 ((A%C) × (B%C))%C 와 같을까?
	*/
	@DisplayName("Q8: 세 수 A, B, C가 주어졌을 때, 위의 네 가지 값을 구하는 프로그램")
	@Test
	 void calFourResultsTest(){
		String result = inputAndOutPut.calFourResults("5 8 4");
		Assertions.assertThat(result).isEqualTo("1\r\n1\r\n0\r\n0");
	}

	@DisplayName("Q9: (세 자리 수) × (세 자리 수) 프로그램")
	@Test
	 void getMultiplyTest(){
		String result = inputAndOutPut.getMultiply("472\r\n385");
		Assertions.assertThat(result).isEqualTo("2360\r\n3776\r\n1416\r\n181720");
	}
	@DisplayName("Q10: 고양이 출력")
	@Test
	 void drawCatTest(){
		String result = inputAndOutPut.drawCat();
		Assertions.assertThat(result).isEqualTo("""
				\\    /\\
				 )  ( ')
				(  /  )
				 \\(__)|""");
	}

	@DisplayName("Q11: 개 출력")
	@Test
	 void drawDogTest(){
		String result = inputAndOutPut.drawDog();
		Assertions.assertThat(result).isEqualTo( """
				|\\_/|
				|q p|   /}
				( 0 )""\"\\
				|"^"`    |
				||_/=\\\\__|""");
	}
	@DisplayName("Q12: 새싹 출력")
	@Test
	 void drawSproutTest(){
		String result = inputAndOutPut.drawSprout();
		System.out.println(result);
		Assertions.assertThat(result).isEqualTo( """
				         ,r'"7
				r`-_   ,'  ,/
				 \\. ". L_r'
				   `~\\/
				      |
				      |""");
	}

}
