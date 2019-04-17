package showimg;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JViewport;

public class MainGUI extends JFrame {
	JPanel pRysunek,pGuziki;
	JButton bLaduj;
	JLabel lObrazek,lSciezka;
	private String path;
	public MainGUI(String title) {
		super(title);
		
		//Ustawiamy rozmiar 
		Toolkit t = Toolkit.getDefaultToolkit();
		Dimension d = t.getScreenSize();
		setSize(d.width/2,d.height/2);
		
		//Zamykamy "x"
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		//Zmiana po³o¿enia okna (center)
		setLocationRelativeTo(null);
		
		
		//Tworzymy i dodajemy
		pGuziki = new JPanel();
		pRysunek = new JPanel();
		add(pGuziki,BorderLayout.SOUTH);
		add(pRysunek,BorderLayout.CENTER);
		
		//Tworzymy i dodajemy do panelu rysunek
		lObrazek = new JLabel();
		lSciezka = new JLabel("Lokalizacja pliku");
		pRysunek.add(lObrazek);
		pRysunek.add(lSciezka);
		
		//Tworzymy przycisk i dodajemy
		bLaduj = new JButton("Laduj obrazek");
		bLaduj.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//Tworzymy obiekt fileChooser
				JFileChooser fch = new JFileChooser();
				//Gdzie wyswietlic (referencja do okna)
				if(fch.showOpenDialog(((JButton)e.getSource()).getParent().getParent())==JFileChooser.APPROVE_OPTION) {
					path = fch.getSelectedFile().getAbsolutePath();
					lSciezka.setText(path);
				}
				//Wyœwietlam obrazek
				ImageIcon img = new ImageIcon(path);
				Image image = img.getImage();
				Image resclaedImg = image.getScaledInstance(120, 120, Image.SCALE_SMOOTH);
				lObrazek.setIcon(new ImageIcon(resclaedImg));
			}
		});
		pGuziki.add(bLaduj);
		
		
		
}
	
	
	
	
	

}
