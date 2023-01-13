package com.example.AlgorithmTest;
@SuppressWarnings("FieldCanBeLocal")
public class ChessPiece {
	private final int king = 1;
	private final int queen = 1;
	private final int look = 2;
	private final int bishop = 2;
	private final int knight = 2;
	private final int pawn = 8;

	public String getPieces(int kingPcs, int queenPcs, int lookPcs, int bishopPcs, int knightPcs, int pawnPcs){
		return String.format("%s %s %s %s %s %s", this.king - kingPcs, queen - queenPcs, look - lookPcs, bishop - bishopPcs, knight - knightPcs, pawn - pawnPcs);
	}

}
