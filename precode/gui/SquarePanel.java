package gui;
import javax.swing.*;
import logic.*;
import java.awt.*;
import java.awt.event.*;

public class SquarePanel extends JPanel {
    private GridLayout layout;
    private int length;
    private MemoryFrame mf;

    public SquarePanel(Square[][] squares, MemoryFrame mf){
	this.length = squares.length;
	this.mf = mf;
	layout = new GridLayout(length, length);
	this.setLayout(layout);
	
	for ( int i = 0; i < length; i ++) {
	    for ( int y = 0; y < length; y ++) {
		SquareButton btn = new SquareButton(squares[i][y]);
		btn.addActionListener(new ButtonListener());
		this.add( btn );
	    }
	}	    
    }


    public void showSquare(SquareButton s) {
	s.paintValue();
    }


    class ButtonListener implements ActionListener {
    
	public void actionPerformed(ActionEvent e) { 
	    SquareButton square = (SquareButton) e.getSource();	    	    
	    mf.buttonClicked(square);
	}
    }
}
    
