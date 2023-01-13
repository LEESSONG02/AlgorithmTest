package com.example.AlgorithmTest;

import java.util.Arrays;

public class LoopStatement {


	public String printMultiplicationTable(int num) {
		if(!(1 <= num && num <= 9))
			throw new IllegalArgumentException();

		StringBuilder sb = new StringBuilder();

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
		StringBuilder sb = new StringBuilder();
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

	public int sumNumber(int num) {
		if(!(1 <= num && num <= 10000))
			throw new IllegalArgumentException();
		int sum = 0;
		for (int i = 1; i <= num ; i++) {
			sum += i;
		}

		return sum;
	}

	public String checkBill(String billStr) {
		String[] billStrArr = billStr.split("\r\n");
		int totalCnt = Integer.parseInt(billStrArr[0]);
		int totalItemCnt = Integer.parseInt(billStrArr[1]);
		String result = "No";
		if(!(1 <= totalCnt && totalCnt <= 1000000000) || !(1 <= totalItemCnt && totalItemCnt <= 100))
			throw new IllegalArgumentException();
		if(totalItemCnt != billStrArr.length -2)
			throw new IllegalArgumentException();
		int sum = 0;
		for (int i = 2; i <= billStrArr.length - 1; i++) {
			String[] eachItemArr = billStrArr[i].split(" ");
			int[] eachItemIntArr = Arrays.stream(eachItemArr).mapToInt(Integer::parseInt).toArray();
			if(!(1 <= eachItemIntArr[0] && eachItemIntArr[0] <= 1000000) || !(1 <= eachItemIntArr[1] && eachItemIntArr[1] <= 10))
				throw new IllegalArgumentException();
			sum += eachItemIntArr[0] * eachItemIntArr[1];
		}
		if(totalCnt == sum)
			result = "Yes";
		return result;
	}

	public String printStars(int cnt) {
		if(!(1 <= cnt && cnt <= 100))
			throw new IllegalArgumentException();
		StringBuilder sb = new StringBuilder();
		for (int i = 1; i <=cnt ; i++) {
			sb.append("*".repeat(i));
			if(i != cnt)
				sb.append("\r\n");
		}
		return sb.toString();
	}

	public String terminateSum(String nums) {
		String[] numsArr = nums.split("\r\n");
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < numsArr.length; i++) {
			String[] strArr = numsArr[i].split(" ");
			int[] numsIntArr = Arrays.stream(strArr).mapToInt(Integer::parseInt).toArray();
			int A = numsIntArr[0];
			int B = numsIntArr[1];
			if(A > 0 && B < 10){
				sb.append(A+B);
				if(i != numsArr.length-2)
					sb.append("\r\n");
			} else if (A == 0 && B == 0) {
				return sb.toString();
			} else
				throw new IllegalArgumentException();
		}
		return sb.toString();
		
	}

	public int calCycle(int N) {
		if(!(0 <= N && N <= 99))
			throw new IllegalArgumentException();
		int cycleCnt = 0;
		int newN = doCycle(N);
		while (true){
			cycleCnt++;
			if(newN != N){
				newN = doCycle(newN);
			} else
				break;
		}
		return cycleCnt;
	}
	public int doCycle(int N){
		int newN = 0;

		if(N >= 10){
			String[] nums = Integer.toString(N).split("");
			String lastNum = Integer.toString(N % 10);
			for (String num : nums) {
				newN += Integer.parseInt(num);
			}
			String newNStr = lastNum + (
						newN >= 10
						? Integer.toString(newN % 10)
						: Integer.toString(newN)
			);
			newN = Integer.parseInt(newNStr);
		} else
			newN = N*10 + N;
		return newN;
	}
}
