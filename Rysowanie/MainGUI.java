import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.Stroke;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;


import javax.swing.JFrame;
import javax.swing.Timer;

public class MainGUI extends JFrame  {
	
	private Timer tm;
	private Point2D start = new Point2D.Double(5,5);
	private Point2D end = new Point2D.Double(150,150);
	
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
		
		//Tworzymy timer
		tm = new Timer(1000,new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				start.setLocation(new Point2D.Double(start.getX()+5,start.getY()+5));
				end.setLocation(new Point2D.Double(end.getX()+5,end.getY()+5));
				repaint();
			}
		});
		tm.start();
		
	}
	
	@Override
	public void paint(Graphics arg0) {
		Graphics2D g2 = (Graphics2D)arg0;
		
//		//Tworzymy obiekty
//		Line2D line = new Line2D.Double(35,35,185,185);
//		Ellipse2D elipse = new Ellipse2D.Double(35,35,150,150);
//		Rectangle2D rectangle = new Rectangle2D.Double(35,35,150,150);
//		
//		//Gruboœæ
//		g2.setStroke(new BasicStroke(10));
//		//rysujemy
//		g2.setColor(Color.blue);
//		g2.draw(rectangle);
//		g2.setColor(Color.red);
//		g2.draw(line);
//		g2.setColor(Color.BLACK);
//		g2.draw(elipse);
		
		paintLine(g2, start, end);
	}


	public void paintLine(Graphics2D g2,Point2D start,Point2D end) {
		Line2D line = new Line2D.Double(start,end);
		g2.draw(line);
		
	}
	
	
	
	
	
	
}
