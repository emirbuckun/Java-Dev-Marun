/* 150119024 & Emir & B��k�n
I acknowledge that I will not share my work (not even a part of it) 
with my friends; I will be responsible for what has been submitted. 
In case of any form of copying and cheating on solutions, I know that 
I will get ZERO on all homework and quizzes of the course!
*/

package quizies;

public class quiz2_150119024 {

	final static int N = 10;

	final static int M = 20;

	public static void main(String[] args) {
		// startGame(generatePlayers());

		// Test1

		int[][] players = { { 3, 4 }, { 0, 5 }, { 12, 17 }, { 3, 3 }, { 13, 8 }, { 0, 15 }, { 1, 18 }, { 2, 0 },
				{ 14, 2 }, { 9, 3 } };

		// Test2

		// int [][] players = {{9,7} ,{4,15} ,{5,19} ,{7,9} ,{1,6} ,{7,10} ,{12,16}
		// ,{15,1} ,{13,0} ,{2,17} };

		// Test3

		// int [][] players = {{1,17} ,{12,7} ,{16,14} ,{5,13} ,{0,14} ,{6,0} ,{18,4}
		// ,{8,0} ,{2,7} ,{1,17} };

		// startGame(players);

		startGame(players);
	}

	public static int[][] generatePlayers() {
		return null;
	}

	public static void startGame(int[][] players) {
		int randomPlayer = (int) (Math.random() * (10 - 1)) + 1;
		int x1 = players[randomPlayer][0];
		int y1 = players[randomPlayer][1];
		int x2 = 0, y2 = 0;

		for (int i = 0; i < N && i != randomPlayer; i++) {
			x2 = players[i][0];
			y2 = players[i][0];
			// if (distance(x1, y1, x2, y2));
		}
	}

	/** Compute the distance between two points (x1, y1) and (x2, y2) */
	public static double distance(int x1, int y1, int x2, int y2) {
		return Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
	}
}