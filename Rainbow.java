import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;
import javax.swing.JFrame;

public class GU extends JPanel {
	private final static Color VIOLET=new Color(128,0,128);
	private final static Color INDIGO=new Color(75,0,130);
	private Color[]colors= {Color.WHITE,Color.WHITE,VIOLET,INDIGO, Color.BLUE,Color.GREEN,Color.YELLOW,Color.ORANGE,Color.RED

};
	public GU(){
		setBackground(Color.WHITE);
	}
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		int radius=20;
		int centerx=getWidth()/2;
		int centery=getHeight()-10;
		for(int counter=colors.length;counter>0;counter--) {
			g.setColor(colors[counter-1]);
			g.fillArc(centerx-counter*radius, centery-counter*radius, counter*radius*2, counter*radius*2, 0, 180);
		}
	}
}

class GUTest{
	public static void main(String[]args) {
		GU panel=new GU();
		JFrame application=new JFrame();
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		application.add(panel);
		application.setSize(400,250);
		application.setVisible(true);
	}
}
