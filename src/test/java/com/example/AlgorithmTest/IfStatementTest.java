package com.example.AlgorithmTest;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class IfStatementTest {
	private static IfStatement ifStatement;
	@BeforeAll
	static void init(){
		ifStatement = new IfStatement();
	}

	@DisplayName("Q1: 두 수를 비교하는 프로그램")
	@Test
	public void compareNumTest(){
		Assertions.assertThatIllegalArgumentException().isThrownBy(
				()->ifStatement.compareNum("1 1000000")
		);
		String result = ifStatement.compareNum("1 2");
		Assertions.assertThat(result).isEqualTo("<");

		String result2 = ifStatement.compareNum("10 2");
		Assertions.assertThat(result2).isEqualTo(">");

		String result3 = ifStatement.compareNum("5 5");
		Assertions.assertThat(result3).isEqualTo("==");
	}
	@DisplayName("Q2: 시험 성적 출력 프로그램")
	@Test
	public void getGradeTest(){
		 Assertions.assertThatIllegalArgumentException().isThrownBy(
				 () -> ifStatement.getGrade(10000)
		 );
		 String result = ifStatement.getGrade(100);
		 Assertions.assertThat(result).isEqualTo("A");

		String result2 = ifStatement.getGrade(90);
		Assertions.assertThat(result2).isEqualTo("A");

		String result3 = ifStatement.getGrade(89);
		Assertions.assertThat(result3).isEqualTo("B");

		String result4 = ifStatement.getGrade(58);
		Assertions.assertThat(result4).isEqualTo("F");
	}
	@DisplayName("Q3: 윤년 판단 출력 프로그램")
	@Test
	public void isLeapYearTest() {
		Assertions.assertThatIllegalArgumentException().isThrownBy(
				() -> ifStatement.isLeapYear(5000)
		);
		int result = ifStatement.isLeapYear(2000);
		Assertions.assertThat(result).isEqualTo(1);
		int result2 = ifStatement.isLeapYear(1999);
		Assertions.assertThat(result2).isEqualTo(0);
		int result3 = ifStatement.isLeapYear(2012);
		Assertions.assertThat(result3).isEqualTo(1);
	}

	@DisplayName("Q4: 좌표 사분면 판단 프로그램")
	@Test
	public void getQuadrantTest() {
		Assertions.assertThatIllegalArgumentException().isThrownBy(
				() -> ifStatement.getQuadrant("12\r\n20000")
		);
		Assertions.assertThatIllegalArgumentException().isThrownBy(
				() -> ifStatement.getQuadrant("12\r\n0")
		);
		Assertions.assertThatIllegalArgumentException().isThrownBy(
				() -> ifStatement.getQuadrant("0\r\n10")
		);

		int result = ifStatement.getQuadrant("12\r\n5");
		Assertions.assertThat(result).isEqualTo(1);

		int result2 = ifStatement.getQuadrant("9\r\n-13");
		Assertions.assertThat(result2).isEqualTo(4);

		int result3 = ifStatement.getQuadrant("-9\r\n-13");
		Assertions.assertThat(result3).isEqualTo(3);

		int result4 = ifStatement.getQuadrant("-9\r\n13");
		Assertions.assertThat(result4).isEqualTo(2);

	}

	@DisplayName("Q5: 알람시간 구하는 프로그램")
	@Test
	public void getAlarmTimeTest(){
		Assertions.assertThatIllegalArgumentException().isThrownBy(
				()-> ifStatement.getAlarmTime("50 10")
		);
		Assertions.assertThatIllegalArgumentException().isThrownBy(
				()-> ifStatement.getAlarmTime("20 60")
		);

		String result = ifStatement.getAlarmTime("10 10");
		Assertions.assertThat(result).isEqualTo("9 25");

		String result2 = ifStatement.getAlarmTime("0 30");
		Assertions.assertThat(result2).isEqualTo("23 45");

		String result3 = ifStatement.getAlarmTime("23 40");
		Assertions.assertThat(result3).isEqualTo("22 55");
	}
	@DisplayName("Q6: 오븐구이가 끝나는 시각을 계산하는 프로그램")
	@Test
	public void getOvenEndTimeTest() {
		Assertions.assertThatIllegalArgumentException().isThrownBy(
				()-> ifStatement.getOvenEndTime("245 30\r\n20")
		);
		String result = ifStatement.getOvenEndTime("14 30\r\n20");
		Assertions.assertThat(result).isEqualTo("14 50");

		String result2 = ifStatement.getOvenEndTime("17 40\r\n80");
		Assertions.assertThat(result2).isEqualTo("19 0");

		String result3 = ifStatement.getOvenEndTime("23 48\r\n25");
		Assertions.assertThat(result3).isEqualTo("0 13");
	}

	@DisplayName("Q7: 상금 계산 프로그램")
	@Test
	public void calPrizeTest(){
		Assertions.assertThatIllegalArgumentException().isThrownBy(
				()-> ifStatement.calPrize("3 3 7")
		);
		Assertions.assertThatIllegalArgumentException().isThrownBy(
				()-> ifStatement.calPrize("3 3 7 8")
		);
		int result = ifStatement.calPrize("2 2 2");
		Assertions.assertThat(result).isEqualTo(12000);

		int result2 = ifStatement.calPrize("6 2 5");
		Assertions.assertThat(result2).isEqualTo(600);

		int result3 = ifStatement.calPrize("3 3 6");
		Assertions.assertThat(result3).isEqualTo(1300);
	}
}
