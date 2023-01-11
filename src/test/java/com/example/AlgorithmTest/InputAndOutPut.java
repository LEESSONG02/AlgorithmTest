package com.example.AlgorithmTest;

import java.util.Arrays;

public class InputAndOutPut {
	public String printHelloWorld(){
		return "Hello World!";
	}
	public int add(int i, int i1) {
		if(!(0< i && i < 10 && 0 < i1 && i1 < 10))
			throw new IllegalArgumentException();
		return i+i1;
	}

	public int subtract(int i, int i1){
		if(!(0< i && i < 10 && 0 < i1 && i1 < 10))
			throw new IllegalArgumentException();
		return i-i1;
	}

	public int multiply(int i, int i1) {
		if(!(0< i && i < 10 && 0 < i1 && i1 < 10))
			throw new IllegalArgumentException();
		return i*i1;
	}
	public int remainder(int i, int i1) {
		if(!(0< i && i < 10 && 0 < i1 && i1 < 10))
			throw new IllegalArgumentException();
		return i%i1;
	}

	public double divide(int i, int i1) {
		if(!(0< i && i < 10 && 0 < i1 && i1 < 10))
			throw new IllegalArgumentException();
		return i*1.0/i1;
	}

	public String printIsMember(String idStr) {
		if(idStr.length() > 50)
			throw new IllegalArgumentException();
		return idStr+"??!";
	}

	public int convertYear(int buddhaEra) {
		if(!(1000 <= buddhaEra && buddhaEra <= 3000))
			throw new IllegalArgumentException();
		return buddhaEra-543;
	}

	public String findChessPieceCustom(int king, int queen, int look, int bishop, int knight, int pawn) {
		if(!(0<= king && king <= 10 && 0<= queen && queen <= 10 && 0<= look && look <=10 && 0<= bishop && bishop <= 10 && 0<= knight && knight <= 10 && 0<= pawn && pawn <= 10))
			throw new IllegalArgumentException();
		ChessPiece chessPiece = new ChessPiece();
		return chessPiece.getPieces(king, queen, look, bishop, knight, pawn);
	}

	public String findChessPiece(String listStr) {
		String[] chessItems= listStr.split(" ");
		int[] nums = Arrays.stream(chessItems).mapToInt(Integer::parseInt).toArray();
		return String.format("%d %d %d %d %d %d", 1 -nums[0], 1-nums[1], 2-nums[2], 2-nums[3], 2-nums[4], 8-nums[5]);
	}

	public String calFourResults(String params){
		String[] paramList = params.split(" ");
		int[] paramIntList =  Arrays.stream(paramList).mapToInt(Integer::parseInt).toArray();
		for(int paramInt : paramIntList){
			if(!(2 <= paramInt && paramInt<= 10000))
				throw new IllegalArgumentException();
		}
		int A = paramIntList[0];
		int B = paramIntList[1];
		int C = paramIntList[2];
		StringBuffer sb = new StringBuffer(Integer.toString((A+B)%C));
		sb.append("\r\n");
		sb.append(Integer.toString(((A%C) + (B%C))%C));
		sb.append("\r\n");
		sb.append(Integer.toString((A*B)%C));
		sb.append("\r\n");
		sb.append(Integer.toString(((A%C) * (B%C))%C));

		return sb.toString();
	}

	public String getMultiply(String params){
		String[] paramList = params.split("\r\n");
		int A = Integer.parseInt(paramList[0]);
		String[] param1List = paramList[1].split("");
		StringBuffer sb = new StringBuffer();


		for(int i = param1List.length; i>0; i--){
			sb.append(Integer.toString(A * (Integer.parseInt(param1List[i-1]))));
			sb.append("\r\n");
		}
		sb.append(A * Integer.parseInt(paramList[1]));

		return sb.toString();
	}
	public String drawCat(){
		return """
				\\    /\\
				 )  ( ')
				(  /  )
				 \\(__)|""";
	}

	public String drawDog(){
		return """
				|\\_/|
				|q p|   /}
				( 0 )""\"\\
				|"^"`    |
				||_/=\\\\__|""";
	}

	public String drawSprout(){
		return """
				         ,r'"7
				r`-_   ,'  ,/
				 \\. ". L_r'
				   `~\\/
				      |
				      |""";
	}
}
