package gui;
import javax.swing.*;
import java.awt.*;
import logic.*;


public class SquareButton extends JButton {
    private Square square;
    
    public SquareButton(Square square){
	super("");
	this.square = square;
	setPreferredSize(new Dimension(80, 80));
    }

    public Square getSquare() {
	return square;
    }
 
    public void paintValue() {
	this.setText("" + square.getValue());
	this.setEnabled(false);
    }

    public void resetValue(){
	setText("");
	this.setEnabled(true);
    }
}
