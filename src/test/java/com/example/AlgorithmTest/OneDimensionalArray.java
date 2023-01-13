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
}
