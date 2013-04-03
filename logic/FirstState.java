package logic;
import gui.*;

public class FirstState implements ClickState{
    private StateContext stateContext;

    public FirstState(StateContext stateContext){
	this.stateContext = stateContext;
    }

    public void squareClicked(SquareButton square){
	GameController gc = stateContext.getGameController();
	gc.resetBothSquares();
	gc.drawSquare(square);
	gc.setFirstSquare(square);
	stateContext.setState(new LastState(stateContext));
    }

}