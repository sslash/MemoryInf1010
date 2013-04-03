package gui;
import logic.*;
import javax.swing.*;

public class MemoryFrame extends JFrame {
    private GameController gc;
    private JPanel mainPanel;
    private SquarePanel squarePanel;
    private ResultsPanel resultsPanel;

    public MemoryFrame(GameController gc) {
	this.gc = gc;
	mainPanel = new JPanel();
	setTitle("Memory INF1010");
	this.drawGame();
	pack();
	setLocationRelativeTo(null);
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	setVisible(true);
    }

    private void drawGame() {
	this.squarePanel = new SquarePanel(gc.getSquares(), this);
	this.resultsPanel = new ResultsPanel();
	this.mainPanel.add(resultsPanel);
	this.mainPanel.add(squarePanel);
	this.add(mainPanel);
    }

    public void buttonClicked(SquareButton sb){
	gc.buttonClicked(sb);
    }
}