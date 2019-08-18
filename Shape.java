package Sape;
 java.lang.NumberFormatException;

import java.awt.Graphics;
import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
public class Sape extends JPanel   {
	private int choice;
	
	public Sape(int userchoice) {
		choice =userchoice;
		
	}
	public void paintcomponent(Graphics g) {
		for(int i=0;i<10;i++) {
			switch(choice) {
			case 1:
				g.drawRect(10+i*10, 10+i*10,50+i*10,50+i*10 );
				break;
			case 2:
				g.drawOval(10+i*10, 10+i*10, 50+i*10,50+i*10 );
				break;
				
				
			}
		}
	}

}

class Shapetest{
	public static void main(String[]args) {
		String input=JOptionPane.showInputDialog("Enter 1 to draw recta\n "+"Enter 2 to draw ovals");
		int choice= Integer.parseInt(input);
		Sape panel=new Sape(choice);
		JFrame application=new JFrame();
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		application.add(panel);
		application.setSize(300,300);
		application.setVisible(true);
		
	}
}



