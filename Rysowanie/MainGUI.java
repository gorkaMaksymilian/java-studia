import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Stroke;
import java.awt.Toolkit;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;

import javax.swing.JFrame;

public class MainGUI extends JFrame {
	public MainGUI(String title) {
		//Konstruktor klasy JFrame
		super(title);
		
		//Ustawiamy rozmiar 
		Toolkit t = Toolkit.getDefaultToolkit();
		Dimension d = t.getScreenSize();
		setSize(d.width/2,d.height/2);
		
		//Zamykamy "x"
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		//Zmiana po³o¿enia okna (center)
		setLocationRelativeTo(null);
		
		
		
		
	}
	
	@Override
	public void paint(Graphics arg0) {
		Graphics2D g2 = (Graphics2D)arg0;
		
		//Tworzymy obiekty
		Line2D line = new Line2D.Double(35,35,185,185);
		Ellipse2D elipse = new Ellipse2D.Double(35,35,150,150);
		Rectangle2D rectangle = new Rectangle2D.Double(35,35,150,150);
		
		//Rysujemy
		g2.draw(elipse);
		g2.setColor(Color.red);
		g2.draw(line);
		g2.setColor(Color.blue);
		g2.setStroke(new BasicStroke(10));
		g2.draw(rectangle);
		
		
	}


	
	
	
	
	
	
	
	
}
