package com.example.AlgorithmTest;

public class ChessPiece {
	private int king = 1;
	private int queen = 1;
	private int look = 2;
	private int bishop = 2;
	private int knight = 2;
	private int pawn = 8;

	public String getPieces(int kingPcs, int queenPcs, int lookPcs, int bishopPcs, int knightPcs, int pawnPcs){
		return String.format("%s %s %s %s %s %s", Integer.toString(this.king - kingPcs), Integer.toString(queen - queenPcs), Integer.toString(look - lookPcs), Integer.toString(bishop - bishopPcs), Integer.toString(knight - knightPcs), Integer.toString(pawn - pawnPcs));
	}

	public String getPiecesStr(String listStr){
		return "";
	}
}
