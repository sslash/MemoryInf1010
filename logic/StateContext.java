package logic;
import gui.*;

public class StateContext {
    private GameController gc;
    private ClickState currentState;

    public StateContext (GameController gc){
	this.gc = gc;
	currentState = new FirstState(this);
    }

    public void onClick(SquareButton square){
	currentState.squareClicked(square);	
    }

    public GameController getGameController() {
	return this.gc;
    }

    public void setState(ClickState state){
	currentState = state;
    }

}