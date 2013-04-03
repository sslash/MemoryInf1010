package logic;

import gui.*;

public class LastState implements ClickState {

    private StateContext stateContext;

    public LastState(StateContext stateContext){
	this.stateContext = stateContext;
    }

    public void squareClicked(SquareButton square){
	GameController gc = stateContext.getGameController();
	gc.drawSquare(square);
	SquareButton before = gc.getCurrentSquare();
	
	if(before.getSquare().getValue().compareTo(square.getSquare().getValue()) != 0){
	    gc.setLastSquare(square);
	}else{
	    gc.setBothSquaresEqual();
	}
	
	stateContext.setState(new FirstState(stateContext));
    }


}