package logic;
import gui.*;

public class GameController{
    private Square squares[][]; 
    private SquareButton firstSquare = null; // Just to be clear
    private SquareButton lastSquare = null;  // Just to be clear
    private StateContext stateContext;
    private MemoryFrame gui;

    public void initGame() {
    }

    public void setMemoryFrame(MemoryFrame mf){
	this.gui = mf;
    }
    
    public SquareButton getCurrentSquare(){
	return firstSquare;
    }

    public Square[][] getSquares(){
    }

    public void buttonClicked(SquareButton sb) {
    }
    
    public void drawSquare (SquareButton s){
    }
    
    public void setFirstSquare(SquareButton s){
    }
    
    public void setLastSquare(SquareButton s){
    }

    public void resetBothSquares() {

    }
    
    public void setBothSquaresEqual() {
    }

    public void cleanUpSquares(SquareButton s){
    }
}