package logic;

import java.util.Random;

public class MemoryGameGenerator {
	static Square[][] board;
	
	
	public static void testBruteForcer(){
		Square[][] test = generateIntGame(4);
		for(int i = 0; i < board.length; i++){
			for(int j = 0; j < board[i].length; j++)
				System.out.print(" " +board[i][j].getValue());
			System.out.println();
		}
	}
	public static Square[][] generateIntGame(int spots){
		board = new Square[spots][spots];
		for(int i = 0; i < board.length; i++)
			for(int j = 0; j < board[i].length; j++)
				board[i][j] = new Square(-1);
		
		bruteForce();
		return board;	
	}

	private static void bruteForce(){
		Random r = new Random();
		for(int i = 0; i < (board.length*board.length)/2; i++){
			int placement = 0;
			while(placement < 2){
				int firX = r.nextInt(board.length);
				int firY = r.nextInt(board.length);
				if(freeSpot(firX, firY)){
					board[firX][firY] = new Square(i+1);
					placement++;
				}
			}
		}
	}
	
	private static boolean freeSpot(int x, int y){
		if(board[x][y].getValue() == -1) return true;
		else return false;
	}
}