package com.example.AlgorithmTest;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class IfStatement {
	public String compareNum(String numStr){
		String[] numStrArr = numStr.split(" ");
		int[] numIntArr =  Arrays.stream(numStrArr).mapToInt(Integer::parseInt).toArray();
		for(int a:numIntArr){
			if(!(-10000 <= a && a <= 10000))
				throw new IllegalArgumentException();
		}
		if(numIntArr[0] < numIntArr[1])
			return "<";
		if(numIntArr[0] > numIntArr[1])
			return ">";
		return "==";

	}
	public String getGrade(int score){
		if(!(0 <= score && score <= 100))
			throw new IllegalArgumentException();
		if (score >= 90) {
			return "A";
		} else if (80 <= score) {
			return "B";
		} else if (70 <= score) {
			return "C";
		} else if (60 <= score) {
			return "D";
		}else {
			return "F";
		}
	}

	public int isLeapYear(int year){
		if(!(1 <= year && year <= 4000))
			throw new IllegalArgumentException();
		boolean is4x = year % 4 == 0;
		boolean is100x = year % 100 == 0;
		boolean is400x = year % 400 == 0;

		if((is4x && !is100x) || is400x)
			return 1;
		return 0;
	}
	public int getQuadrant(String coordinateStr){
		String[] coordinateStrArr = coordinateStr.split("\r\n");
		int[] coordinateIntArr =  Arrays.stream(coordinateStrArr).mapToInt(Integer::parseInt).toArray();
		boolean[] booleanArr = new boolean[coordinateIntArr.length];
		for(int i=0; i < coordinateIntArr.length; i++){
			if(!(-1000 <= coordinateIntArr[i] && coordinateIntArr[i] <= 1000) || coordinateIntArr[i] == 0)
				throw new IllegalArgumentException();
			boolean isPlus = coordinateIntArr[i] > 0;
			booleanArr[i] = isPlus;
		}
		if(booleanArr[0] && booleanArr[1]){
			return 1;
		} else if (!booleanArr[0] && booleanArr[1]) {
			return 2;
		} else if (!booleanArr[0]) {
			return 3;
		} else {
			return 4;
		}
	}

	public String getAlarmTime(String hmStr){
		String[] hmStrArr = hmStr.split(" ");
		int[] hmIntArr =  Arrays.stream(hmStrArr).mapToInt(Integer::parseInt).toArray();
		int H = hmIntArr[0];
		int M = hmIntArr[1];
		if(!(0 <= H && H <= 23) || !(0 <= M && M <= 59))
			throw new IllegalArgumentException();

		LocalTime localTime = LocalTime.of(H, M);
		LocalTime newTime = localTime.minusMinutes(45);

		return newTime.format(DateTimeFormatter.ofPattern("H m"));
	}

	public String getOvenEndTime(String infoStr) {
		String[] infoStrArr = infoStr.split("\r\n");
		String[] infoStartTimeArr = infoStrArr[0].split(" ");
		int[] infoStartTimeIntArr =  Arrays.stream(infoStartTimeArr).mapToInt(Integer::parseInt).toArray();
		int H = infoStartTimeIntArr[0];
		int M = infoStartTimeIntArr[1];
		int C = Integer.parseInt(infoStrArr[1]);
		if(!(0 <= H && H <= 23) || !(0 <= M && M <= 59) || !(0 <= C && C <= 1000))
			throw new IllegalArgumentException();
		LocalTime localTime = LocalTime.of(H, M);
		LocalTime newTime = localTime.plusMinutes(C);

		return newTime.format(DateTimeFormatter.ofPattern("H m"));
	}
	@SuppressWarnings("MismatchedQueryAndUpdateOfCollection")
	public int calPrize(String diceStr) {
		String[] diceStrArr = diceStr.split(" ");
		if(diceStrArr.length != 3)
			throw new IllegalArgumentException();
		int[] diceIntArr = Arrays.stream(diceStrArr).mapToInt(Integer :: parseInt).toArray();
		ArrayList<Integer> diceList = new ArrayList<>();
		for (int diceNum : diceIntArr) {
			if (!(0 < diceNum && diceNum <= 6))
				throw new IllegalArgumentException();
			diceList.add(diceNum);
		}
		int duplicateCnt = (int) Arrays.stream(diceIntArr).distinct().count();
		int prize;
		prize = switch (duplicateCnt) {
			case 3 -> Arrays.stream(diceIntArr).max().getAsInt() * 100;
			case 1 -> Arrays.stream(diceIntArr).max().getAsInt() * 1000 + 10000;
			default ->{
				int dupNum=0;
				for (int i = 0; i < diceIntArr.length; i++) {
					for (int j = 0; j < i; j++) {
						if (diceIntArr[i] == diceIntArr[j]) {  // 중복 검사
							dupNum= diceIntArr[i];
							break;
						}
					}
				}
				yield  1000+ dupNum*100;
			}
		};
		return prize;
	}
}
