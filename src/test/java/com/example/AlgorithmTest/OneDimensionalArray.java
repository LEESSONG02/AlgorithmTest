package com.example.AlgorithmTest;

import java.util.Arrays;

public class OneDimensionalArray {
	public int countHowMany(String intStr) {
		String[] intStrArr = intStr.split("\r\n");
		if(intStrArr.length != 3)
			throw new IllegalArgumentException();
		int totalCnt = Integer.parseInt(intStrArr[0]);
		int intStandard = Integer.parseInt(intStrArr[2]);
		if(!(1 <= totalCnt && totalCnt <= 100) || !(-100 <= intStandard && intStandard <= 100))
			throw new IllegalArgumentException();
		int[] intArr = Arrays.stream(intStrArr[1].split(" ")).mapToInt(Integer::parseInt).toArray();
		int intCnt = 0;
		for (int i : intArr) {
			if(i == intStandard) intCnt++;
		}
		return intCnt;
	}

	public String printSmallNum(String intStr) {
		String result;
		String[] intStrArr = intStr.split("\r\n");
		if(intStrArr.length != 2)
			throw new IllegalArgumentException();
		int[] nxArr = Arrays.stream(intStrArr[0].split(" ")).mapToInt(Integer::parseInt).toArray();
		int N = nxArr[0];
		int X = nxArr[1];
		int[] intArr = Arrays.stream(intStrArr[1].split(" ")).mapToInt(Integer::parseInt).toArray();
		if(!(1 <= N && N <= 10000) || !(1 <= X && X <= 10000) || N != intArr.length)
			throw new IllegalArgumentException();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < intArr.length; i++) {
			if(intArr[i] < X){
				sb.append(intArr[i]);
				sb.append(" ");
			}
		}
		sb.deleteCharAt(sb.length()-1);

		result = sb.toString();

		return result;
	}
}
