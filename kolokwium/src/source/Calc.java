package source;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calc extends JFrame implements Runnable{
	private JTextField firstField,secondField;
	private JComboBox<String> myBox;
	private String[] data = {"Plus","Minus","Razy"};
	private JLabel myLabel;
	private JButton myButton;
	private JPanel contentPanel;
	
	public Calc(String title) {
		super(title);
		setSize(400,250);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		contentPanel = new JPanel();
		setContentPane(contentPanel);
		
		
		firstField = new JTextField(5);
		secondField = new JTextField(5);
		add(firstField);
		add(secondField);
		

		myBox = new JComboBox<String>(data);
		add(myBox);
		
		myButton = new JButton("Outcome");
		add(myButton);
		
		myLabel = new JLabel();
		add(myLabel);
		
		myButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				if (myBox.getSelectedItem() == "Plus")
				{
					Double add = Double.parseDouble(firstField.getText())+Double.parseDouble(secondField.getText());
					myLabel.setText(Double.toString(add));
				}
				else if (myBox.getSelectedItem() == "Minus") {
					Double sub = Double.parseDouble(firstField.getText())-Double.parseDouble(secondField.getText());
					myLabel.setText(Double.toString(sub));
				}
				else if (myBox.getSelectedItem() == "Razy") {
					Double x = Double.parseDouble(firstField.getText())*Double.parseDouble(secondField.getText());
					myLabel.setText(Double.toString(x));
				}
				
			}
		});
		
		

		


		
		
		
	}

	@Override
	public void run() {
		setVisible(true);
		
	}
}
