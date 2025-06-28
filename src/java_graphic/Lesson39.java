package java_graphic;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

//14.06.2025
//Java Applet Calculator

public class Lesson39 extends JFrame{

	
	public Lesson39() {
		JPanel panel = new JPanel();
		
		//super.setLayout(null);
		super.setTitle("Calculator");
		super.setSize(300,300);
		
	
		JLabel label1 = new JLabel();
		label1.setText("Skaitlis 1:");
		label1.setLocation(20,20);
		label1.setSize(120,20);
		label1.setFont(new Font("Arial", Font.PLAIN, 20));
		label1.setForeground(new Color(25, 10, 196));
		
		//label1.setOpaque(true);
		//label1.setBackground(Color.cyan);
		JLabel label2 = new JLabel();
		label2.setText("Skaitlis 2:");
		label2.setLocation(20,60);
		label2.setSize(120,20);
		label2.setFont(new Font("Arial", Font.PLAIN, 20));
		label2.setForeground(new Color(25, 10, 196));
		
		//Creating text field for number1
		JTextField number1 = new JTextField();
		number1.setSize(120,25);
		number1.setLocation(160,20);
		
		//Creating text field for number 2
		JTextField number2 = new JTextField();
		number2.setSize(120,25);
		number2.setLocation(160,60);
		
		
		JButton sumButton = new JButton("+");
		sumButton.setSize(50,40);
		sumButton.setLocation(120, 150);
		JLabel resultLabel = new JLabel("....");
	
		resultLabel.setLocation(130,220);
		resultLabel.setFont(new Font("Arial", Font.PLAIN, 20));
		resultLabel.setSize(200, 40);
		
		sumButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String sNumb1 = number1.getText();
				String sNumb2 = number2.getText();
				try {
					double dNumb1 = Double.parseDouble(sNumb1);
				double dNumb2 = Double.parseDouble(sNumb2);
				
				double sum = dNumb1 + dNumb2;
				resultLabel.setText("Result is "+sum);
				}catch (Exception er) {
					resultLabel.setText("Wrong Input");
					
				}
				
				
				
				//resultLabel.setText(sNumb1 +"+" + sNumb2);
			}
		});
		
		
		
		
		
		
		panel.setSize(300,300);
		panel.setLayout(null);
		
		panel.add(resultLabel);
		
		panel.add(number2);
		panel.add(sumButton);
		
		panel.add(number1);
		panel.add(label1);
		panel.add(label2);
		super.add(panel);
		super.setVisible(true);
		super.setResizable(false);
		
		
	}
	
	public static void main(String[] args) {
		Lesson39 app = new Lesson39();
		
	}

}