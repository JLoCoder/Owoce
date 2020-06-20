package gui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.List;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JColorChooser;

public class JList extends JPanel {

	
	
Color  red  = new Color(255, 0, 0);

	public JList() throws FileNotFoundException {
		setLayout(null); 
		
	
		// label1 i text1 
		JTextField text1 = new JTextField();
		text1.setBounds(200,200, 100, 40);
		add(text1);
		
		JLabel label1 = new JLabel("Owoce:");
		label1.setBounds(100, 200, 60, 30);
		label1.setOpaque(true);
		label1.setBackground(Color.RED);
		label1.setForeground(Color.GREEN);
		add(label1);
		
		// label2 i text2
		JTextField text2 = new JTextField();
		text2.setBounds(200,200, 100, 40);
		add(text2);
		
	
		File plik = new File("src/main/resources/listaowocow.txt"); // obiekt przechowywuj�ce dane z pliku tekstowego
        Scanner in = new Scanner(plik); //odczyt danych
        String zdanie = in.nextLine(); // wczytujemy do zmiennej linie tekstu

        
        ArrayList lista = new ArrayList();
        int c = 1;
        for (int i = 1; i < 4; i++) {
            lista.add(in.next());
            c++;	
           
        }
     System.out.println(lista);
	}
	@Override
	public Dimension getPreferredSize() {
		return new Dimension(500, 500);
	}
}