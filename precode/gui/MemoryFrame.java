package gui;
import logic.*;
import javax.swing.*;

public class MemoryFrame extends JFrame {
    private GameController gc;
    private SquarePanel squarePanel;

    public MemoryFrame(GameController gc) {
	this.gc = gc;
	setTitle("Memory INF1010");
	this.drawGame();
	pack();
	setLocationRelativeTo(null);
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	setVisible(true);
    }

    private void drawGame() {
    }

    public void buttonClicked(SquareButton sb){
    }
}