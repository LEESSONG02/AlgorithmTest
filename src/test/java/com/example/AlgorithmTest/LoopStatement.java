package com.example.AlgorithmTest;

import java.util.Arrays;

public class LoopStatement {


	public String printMultiplicationTable(int num) {
		if(!(1 <= num && num <= 9))
			throw new IllegalArgumentException();

		StringBuffer sb = new StringBuffer();

		for (int i = 1; i <= 9; i++) {
			sb.append(String.format("%d * %d = %d", num, i, num*i));
			if(i != 9)
				sb.append("\r\n");
		}

		return sb.toString();
	}

	public String printPlus(String caseStr) {
		String[] caseStrArr = caseStr.split("\r\n");
		int caseCnt = Integer.parseInt(caseStrArr[0]);
		if(caseCnt != caseStrArr.length -1)
			throw new IllegalArgumentException();
		StringBuffer sb = new StringBuffer();
		for (int i = 1; i < caseStrArr.length; i++) {
			String[] eachCaseArr = caseStrArr[i].split(" ");
			int[] eachCaseIntArr = Arrays.stream(eachCaseArr).mapToInt(Integer::parseInt).toArray();
			int sum = 0;
			for (int i1 : eachCaseIntArr) {
				if(!(0 < i1 && i1 < 10))
					throw new IllegalArgumentException();
				sum += i1;
			}
			sb.append(sum);
			if(i != caseStrArr.length -1)
				sb.append("\r\n");
		}
		return sb.toString();
	}
}
