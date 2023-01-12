package com.example.AlgorithmTest;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class LoopStatementTest {

	private static LoopStatement ls;
	@BeforeAll
	static void init(){
		ls = new LoopStatement();
	}


	@DisplayName("Q1: 구구단 출력 프로그램")
	@Test
	public void printMultiplicationTableTest(){
		Assertions.assertThatIllegalArgumentException().isThrownBy(
			() -> ls.printMultiplicationTable(200)
		);
		String result = ls.printMultiplicationTable(2);
		Assertions.assertThat(result).isEqualTo("2 * 1 = 2\r\n" +
				"2 * 2 = 4\r\n" +
				"2 * 3 = 6\r\n" +
				"2 * 4 = 8\r\n" +
				"2 * 5 = 10\r\n" +
				"2 * 6 = 12\r\n" +
				"2 * 7 = 14\r\n" +
				"2 * 8 = 16\r\n" +
				"2 * 9 = 18"
		);
		String result2 = ls.printMultiplicationTable(9);
		Assertions.assertThat(result2).isEqualTo("9 * 1 = 9\r\n" +
				"9 * 2 = 18\r\n" +
				"9 * 3 = 27\r\n" +
				"9 * 4 = 36\r\n" +
				"9 * 5 = 45\r\n" +
				"9 * 6 = 54\r\n" +
				"9 * 7 = 63\r\n" +
				"9 * 8 = 72\r\n" +
				"9 * 9 = 81");

	}
	@DisplayName("Q2: 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램")
	@Test
	public void printPlusTest(){
		Assertions.assertThatIllegalArgumentException().isThrownBy(
			() -> ls.printPlus("5\r\n" +
					"10 1\r\n" +
					"2 3\r\n" +
					"3 4\r\n" +
					"9 8\r\n" +
					"5 2")
		);
		String result = ls.printPlus("5\r\n" +
				"1 1\r\n" +
				"2 3\r\n" +
				"3 4\r\n" +
				"9 8\r\n" +
				"5 2"
		);
		Assertions.assertThat(result).isEqualTo("2\r\n" +
				"5\r\n" +
				"7\r\n" +
				"17\r\n" +
				"7");
	}
	
	@DisplayName("Q3: n이 주어졌을 때, 1부터 n까지 합을 구하는 프로그램")
	@Test
	public void sumNumberTest(){
		Assertions.assertThatIllegalArgumentException().isThrownBy(
			() -> ls.sumNumber(0)
		);
		int result = ls.sumNumber(3);
		Assertions.assertThat(result).isEqualTo(6);
	}

	@DisplayName("Q4: 총 금액이 영수증에 적힌 총 금액과 일치하는지 검사하는 프로그램")
	@Test
	public void checkBillTest(){
		Assertions.assertThatIllegalArgumentException().isThrownBy(
			() -> ls.checkBill("0\r\n" +
					"4\r\n" +
					"20000 5\r\n" +
					"30000 2\r\n" +
					"10000 6\r\n" +
					"5000 8")
		);
		Assertions.assertThatIllegalArgumentException().isThrownBy(
				() -> ls.checkBill("26000\r\n" +
						"0\r\n" +
						"20000 5\r\n" +
						"30000 2\r\n" +
						"10000 6\r\n" +
						"5000 8")
		);
		Assertions.assertThatIllegalArgumentException().isThrownBy(
				() -> ls.checkBill("26000\r\n" +
						"4\r\n" +
						"20000 15\r\n" +
						"30000 2\r\n" +
						"10000 6\r\n" +
						"5000 8")
		);
		String result = ls.checkBill("260000\r\n" +
				"4\r\n" +
				"20000 5\r\n" +
				"30000 2\r\n" +
				"10000 6\r\n" +
				"5000 8");
		Assertions.assertThat(result).isEqualTo("Yes");

		String result2 = ls.checkBill("250000\r\n" +
				"4\r\n" +
				"20000 5\r\n" +
				"30000 2\r\n" +
				"10000 6\r\n" +
				"5000 8");
		Assertions.assertThat(result2).isEqualTo("No");
	}
}
