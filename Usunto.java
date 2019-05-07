import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class MainFrame extends JFrame implements Runnable, ActionListener,ItemListener {
	private JButton b1,b2,b3;
	private JPanel contentPanel;
	private JComboBox<String> cb;
	private String[] pozycje= {"Poniedzia��ek","Wtorek","��roda","Czwartek"};
	private JLabel label;
	public MainFrame(String tytul) {
		super(tytul);
		setSize(400, 250);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		contentPanel=new JPanel();
		setContentPane(contentPanel);
		
		b1=new JButton("Przycisk 1");
		add(b1);
		ButtonClickListener nasluchiwacz=new ButtonClickListener();
		b1.addActionListener(nasluchiwacz);
		
		b2=new JButton("Przycisk 2");
		add(b2);
		b2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JButton b=(JButton)e.getSource();
				JOptionPane.showMessageDialog(b.getParent(), "Klikni��to przycisk "+b.getText());				
			}
		});
		
		b3=new JButton("Przycisk 3");
		add(b3);
		b3.addActionListener(this);
		
		cb=new JComboBox<String>(pozycje);
		add(cb);
		cb.addItemListener(this);
		label=new JLabel();
		add(label);
	}

	@Override
	public void run() {
		setVisible(true);
	}
	
	class ButtonClickListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			JButton b=(JButton)e.getSource();
			JOptionPane.showMessageDialog(null, "Klikni��to przycisk "+b.getText());			
		}
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton b=(JButton)e.getSource();
		JOptionPane.showMessageDialog(b.getParent(), "Klikni��to przycisk "+b.getText());
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		label.setText(e.getItem().toString());
	}

}
