package com.example.AlgorithmTest;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;

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
		for (int j : intArr) {
			if (j < X) {
				sb.append(j);
				sb.append(" ");
			}
		}
		sb.deleteCharAt(sb.length()-1);

		result = sb.toString();

		return result;
	}

	public String printMinMax(String intStr) {
		String[] intStrArr = intStr.split("\r\n");
		if(intStrArr.length != 2)
			throw new IllegalArgumentException();
		int N = Integer.parseInt(intStrArr[0]);
		if(!(1 <= N && N <= 1000000))
			throw new IllegalArgumentException();
		int[] intArr = Arrays.stream(intStrArr[1].split(" ")).mapToInt(Integer :: parseInt).toArray();

		int minInt = Arrays.stream(intArr).min().orElseThrow(
				IllegalArgumentException :: new
		);
		int maxInt = Arrays.stream(intArr).max().orElseThrow(
				IllegalArgumentException :: new
		);

		StringBuilder result = new StringBuilder();
		result.append(minInt)
				.append(" ")
				.append(maxInt);

		return result.toString();
	}

	public String findMaxIndex(String intStr) {
		int[] intArr = Arrays.stream(intStr.split("\r\n")).mapToInt(Integer::parseInt).toArray();
		List<Integer> list = Arrays.stream(intArr).boxed().toList();
		for (Integer integer : list) {
			if(!(0 < integer && integer < 100))
				throw new IllegalArgumentException();
		}
		int maxInt = Arrays.stream(intArr).max().orElseThrow(IllegalAccessError::new);
		int maxIntIndex = list.indexOf(maxInt)+1;
		StringBuilder sb = new StringBuilder();
		sb.append(maxInt)
			.append("\r\n")
			.append(maxIntIndex);


		return sb.toString();
	}
}
