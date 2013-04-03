package logic;

public class GameController{
    private Square squares[][]; 

    public void initGame() {
	this.squares = MemoryGameGenerator.generateIntGame(6);
    }

    public Square[][] getSquares(){
	return this.squares;
    }
}