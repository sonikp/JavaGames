package package1;

//System.out.println("Source: http://zetcode.com/tutorials/javagamestutorial/basics/");

import java.awt.EventQueue;
import javax.swing.JFrame;

public class Application extends JFrame {
	
	// constructor
	public Application() {
		
		initUI();
		
	}
	
	private void initUI() {
		
		add(new Board());
		
		setSize(250, 200);
		
		setTitle("Application");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
	}
	
	public static void main(String args[]) {
		
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				Application ex = new Application();
				ex.setVisible(true);
			}
		});
	}
}