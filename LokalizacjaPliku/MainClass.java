package showimg;

import java.awt.EventQueue;

public class MainClass {
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				MainGUI mf = new MainGUI("Main window");
				mf.setVisible(true);
			}
			
		});
		
		
		
		
		
		
		
	}
}
