
	import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JFrame;

	public class Main {

		public static void main(String[] args) throws FileNotFoundException {
			
			 int c = 1;
			 
			JFrame window = new JFrame("Moja pierwsza aplikacja GUI");
			
			gui.JList panel = new gui.JList();
			
			window.add(panel);
			
			window.setLocation(200,  100);
//			window.setSize(500,500);
			window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			window.setVisible(true);
			window.pack();
			
		
			
	        
		}
	}