package logic;
import gui.*;

public class GameController{
    private Square squares[][]; 
    private SquareButton firstSquare = null; // Just to be clear
    private SquareButton lastSquare = null;
    private StateContext stateContext;
    private MemoryFrame gui;

    public void initGame() {
	this.squares = MemoryGameGenerator.generateIntGame(6,6);
	stateContext = new StateContext(this);
    }

    public void setMemoryFrame(MemoryFrame mf){
	this.gui = mf;
    }
    
    public SquareButton getCurrentSquare(){
	return firstSquare;
    }

    public Square[][] getSquares(){
	return this.squares;
    }

    public void buttonClicked(SquareButton sb) {
	stateContext.onClick(sb);
    }
    
    public void drawSquare (SquareButton s){
	s.paintValue();
    }
    
    public void setFirstSquare(SquareButton s){
	this.firstSquare = s;
    }
    
    public void setLastSquare(SquareButton s){
	this.lastSquare = s;
    }

    public void resetBothSquares() {
	if ( firstSquare != null) 
	    firstSquare.resetValue();
	if ( lastSquare  != null)
	    lastSquare.resetValue();
    }
    public void setBothSquaresEqual() {
	firstSquare = lastSquare = null;
    }

    public void cleanUpSquares(SquareButton s){
	firstSquare.setEnabled(true);
	s.setEnabled(true);
	firstSquare.resetValue();
	s.resetValue();
    }
}