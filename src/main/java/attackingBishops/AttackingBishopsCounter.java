package attackingBishops;

import java.util.ArrayList;

/* Problem overview

On this special chessboard, two bishops attack each other if they share the same diagonal. This includes bishops that have another bishop located between them, i.e. bishops can attack through pieces.

You are given N bishops, represented as (row, column) tuples on a M by M chessboard. Write a function to count the number of pairs of bishops that attack each other. The ordering of the pair doesn't matter: (1, 2) is considered the same as (2, 1).

For example, given M = 5 and the list of bishops:

(0, 0)
(1, 2)
(2, 2)
(4, 0)
The board would look like this:

[b 0 0 0 0]
[0 0 b 0 0]
[0 0 b 0 0]
[0 0 0 0 0]
[b 0 0 0 0]
* You should return 2, since bishops 1 and 3 attack each other, as well as bishops 3 and 4.

* Thanks came from Google

 */


public class AttackingBishopsCounter {

	private int[][] chessBoard;
//	private int[][] leftJustifiedBoard;
//	private int[][] rightJustifiedBoard;
	private int boardSize = 0;

	public AttackingBishopsCounter(int inBoardSize) {
		chessBoard = new int[inBoardSize][inBoardSize];
//		leftJustifiedBoard = new int[inBoardSize][inBoardSize];
//		rightJustifiedBoard = new int[inBoardSize][inBoardSize];
		this.boardSize = inBoardSize;
		clearBoard(chessBoard);
	}

	private void clearBoard(int [][] boardToBeZeroed) {

		for (int w =0; w < boardSize;w++) {
			for (int y =0; y < boardSize;y++) {
				boardToBeZeroed[w][y] = 0; 
			}
		}

	}

	public void addBishop (int bishopposX, int bishopposY) {
		chessBoard[bishopposX][bishopposY] = 1;
	}


	public int countAttacker() {

		int totalcount = 0;

	//	clearBoard(leftJustifiedBoard);
	//	clearBoard(rightJustifiedBoard);

		int distancetoEdge = 0;

		for (int i = 0 ; i< boardSize - 1; i++) 
		{
			for (int j = 0; j < boardSize -1 ;j++){
				if (chessBoard[i][j] == 0) {
					continue;	
				}			
				distancetoEdge  = Math.min(boardSize - i -1,boardSize - j -1);

				for (int rep = 1; rep <= distancetoEdge; rep++) {
					if (chessBoard[i+rep][j+rep] == 1) {
						totalcount = totalcount + 2;
					}
				}
			}
		}
		
		for (int i = 1 ; i< boardSize; i++) 
		{
			for (int j = 0; j < boardSize -1 ;j++){
				if (chessBoard[i][j] == 0) {
					continue;	
				}			
				distancetoEdge  = Math.min(i,boardSize - j -1);

				for (int rep = 1; rep <= distancetoEdge; rep++) {
					if (chessBoard[i-rep][j+rep] == 1) {
						totalcount = totalcount + 2;
					}
				}
			}
		}
		//System.out.println(totalcount);
		return totalcount;
	}	
}


/*


	for (int i = 0 ; i< boardSize; i++) 
	{
		for (int j = i; j < boardSize;j++){
			leftJustifiedBoard[i][j-i] = chessBoard[i][j];
		}
	}

	for (int r = 0 ;r< boardSize; r++) {
	 for	(int s = boardSize; s > boardSize - r;s--){
			rightJustifiedBoard[r][boardSize-s] = chessBoard[r][s];
		}
	}

	int countTotalLinks = 0;

	countTotalLinks = countTotalLinks + totalLinkagesinJustifiedBoard(leftJustifiedBoard);
	countTotalLinks = countTotalLinks + totalLinkagesinJustifiedBoard(rightJustifiedBoard);

	return countTotalLinks;
}

private int totalLinkagesinJustifiedBoard(int [][] justifiedBoard) {
	int countTotalLinksinJustifiedBoard = 0;
	for (int k = 0;k< boardSize; k++) {
		int totalInThisCol = 0;
		for (int l = 0;l < boardSize;l++) {
			if (justifiedBoard[l][k] == 1)
				totalInThisCol++;
		}
		countTotalLinksinJustifiedBoard = countTotalLinksinJustifiedBoard + calculateLinks(totalInThisCol);
	}
	return countTotalLinksinJustifiedBoard;
}


private int calculateLinks(int totalInThisCol) {
	return totalInThisCol* (totalInThisCol -1);
}

 */