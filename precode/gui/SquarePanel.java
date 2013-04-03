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
    }



    class ButtonListener implements ActionListener {
    
	public void actionPerformed(ActionEvent e) { 
	    SquareButton square = (SquareButton) e.getSource();	    	    
	    mf.buttonClicked(square);
	}
    }
}
    
