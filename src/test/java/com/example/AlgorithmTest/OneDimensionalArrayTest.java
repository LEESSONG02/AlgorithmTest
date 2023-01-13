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
}
