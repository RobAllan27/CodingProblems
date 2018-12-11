
package attackingBishops;

/** This package aims to deal with the following problem
 * 
 * Problem overview
*
* On this special chessboard, two bishops attack each other if they share the same diagonal. This includes bishops that have another bishop located between them, i.e. bishops can attack through pieces.
*
* You are given N bishops, represented as (row, column) tuples on a M by M chessboard. Write a function to count the number of pairs of bishops that attack each other. The ordering of the pair doesn't matter: (1, 2) is considered the same as (2, 1).
*
*  For example, given M = 5 and the list of bishops:
*
*  (0, 0)
*  (1, 2)
*  (2, 2)
*  (4, 0)
*  The board would look like this:

*  [b 0 0 0 0]
*  [0 0 b 0 0]
*  [0 0 b 0 0]
*  [0 0 0 0 0]
*  [b 0 0 0 0]
* You should return 2, since bishops 1 and 3 attack each other, as well as bishops 3 and 4.
*
* Thanks came from Google
 * 
 * @author Rob
 *
 */
public class ProblemRunner {

	/**
	 * @param args
	 * 
	 * This class is a simple class to simply run the code - a runner class
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		AttackingBishopsCounter myABC = new AttackingBishopsCounter(4);
		myABC.addBishop(3,3);
		myABC.addBishop(2,2);
		myABC.addBishop(1,1);
		myABC.addBishop(0,0);
		myABC.addBishop(0,1);
		myABC.addBishop(1,2);
		myABC.addBishop(2,3);
		myABC.addBishop(0,3);
		myABC.addBishop(2,1);
		myABC.addBishop(3,0);
		myABC.countAttacker();
		System.out.println("");

	}
}
