package com.example.AlgorithmTest;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class OneDimensionalArrayTest {
	private static OneDimensionalArray oneDms;
	@BeforeAll
	static void init(){
		oneDms = new OneDimensionalArray();
	}
	
	@DisplayName("Q1: 총 N개의 정수가 주어졌을 때, 정수 v가 몇 개인지 구하는 프로그램을 작성")
	@Test
	void countHowManyTest(){
		Assertions.assertThatIllegalArgumentException().isThrownBy(
			() -> oneDms.countHowMany("""
					101\r
					1 4 1 2 4 2 4 2 3 4 4\r
					2\r
					""")
		);
		Assertions.assertThatIllegalArgumentException().isThrownBy(
				() -> oneDms.countHowMany("""
					11\r
					1 4 1 2 4 2 4 2 3 4 4\r
					-200\r
					""")
		);
		int result = oneDms.countHowMany("""
				11\r
				1 4 1 2 4 2 4 2 3 4 4\r
				2\r
				""");
		Assertions.assertThat(result).isEqualTo(3);

		int result2 = oneDms.countHowMany("""
				11\r
				1 4 1 2 4 2 4 2 3 4 4\r
				5\r
				""");
		Assertions.assertThat(result2).isZero();
	}
	@DisplayName("Q2: 정수 N개로 이루어진 수열 A와 정수 X가 주어진다. 이때, A에서 X보다 작은 수를 모두 출력하는 프로그램")
	@Test
	void printSmallNumTest(){
		Assertions.assertThatIllegalArgumentException().isThrownBy(
			() -> oneDms.printSmallNum("0 5\r\n" +
					"1 10 4 9 2 3 8 5 7 6")
		);
		String result = oneDms.printSmallNum("10 5\r\n" +
				"1 10 4 9 2 3 8 5 7 6");
		Assertions.assertThat(result).isEqualTo("1 4 2 3");
	}
	@DisplayName("Q3: N개의 정수가 주어진다. 이때, 최솟값과 최댓값을 구하는 프로그램을 작성하시오.")
	@Test
	void printMinMaxTest(){
		Assertions.assertThatIllegalArgumentException().isThrownBy(
			() -> oneDms.printMinMax("0\r\n" +
					"20 10 35 30 7")
		);
		String result = oneDms.printMinMax("5\r\n" +
				"20 10 35 30 7");
		Assertions.assertThat(result).isEqualTo("7 35");
	}

}
