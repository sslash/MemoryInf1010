package logic;
import gui.*;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;


public class Main {

    public static void main(String args[] ){
	
		
	// Start the logic progam
	final GameController game = new GameController();
	game.initGame();

	// Start the gui thread
	 SwingUtilities.invokeLater(new Runnable() {
            public void run() {
		MemoryFrame frame = new MemoryFrame(game);
            }
        });
    }

}

