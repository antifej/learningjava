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
//Random number generator
public class Lesson40 {
	
	public static void createNewFrame() {
		JFrame mainFrame = new JFrame();
		JPanel myPanel = new JPanel();
		Font myFont = new Font("Verdana",Font.BOLD,15);
		Font f1 = new Font("Calibri", Font.ITALIC,23);
		mainFrame.setTitle("Random number generator");
		mainFrame .setSize(400,400);
		mainFrame.setResizable(false);
		
		JLabel description = new JLabel("Enter min and max values to generate random number");
		description.setFont(myFont);
		description.setSize(400,18);
		description.setLocation(0,0);
		JLabel minLabel = new JLabel("Min:");
		minLabel.setFont(f1);
	    minLabel.setLocation(30,50);
	    minLabel.setSize(100,30);
	    
	    JLabel maxLabel = new JLabel("Max:");
		maxLabel.setFont(f1);
	    maxLabel.setLocation(30,90);
	    maxLabel.setSize(100,30);
	    
	    JTextField minI = new JTextField();
	    minI.setLocation(80,55);
	    minI.setSize(100,30);
	    
	    JTextField maxI = new JTextField();
	    maxI.setLocation(80,90);
	    maxI.setSize(100,30);
	    
	    JLabel resultL = new JLabel("Random number: ");
	    resultL.setFont(f1);
	    resultL.setLocation(120,200);
	    resultL.setSize(300,40);
	    
	    JButton bt = new JButton("GENERATE");
	    bt.setFont(f1);
	    bt.setLocation(100,150);
	    bt.setSize(150,30);
	    
	    bt.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				try {
					
					int min = Integer.parseInt(minI.getText());
					int max = Integer.parseInt(maxI.getText());
					
					if( min<= max) {
					int range = (max +1 )- min;
					int randNum = (int)((Math.random()*range) + min);
					resultL.setText("RN:"+ randNum);
					resultL.setForeground(Color.BLUE);
					}else {
						resultL.setText("MIN > MAX !!!");
						resultL.setForeground(Color.RED);
					}
				
			}catch(Exception er) {
				resultL.setText("Invalid input");
				resultL.setForeground(Color.RED);
			}
			}});
	    
	    JButton bt2 = new JButton("List");
	    bt2.setFont(f1);
	    bt2.setLocation(280,150);
	    bt2.setSize(80,30);
	    
	    JLabel listLabel = new JLabel("...");
	    listLabel.setFont(new Font("Arial", Font.PLAIN, 12));
	    listLabel.setLocation(50,250);
	    listLabel.setSize(200,20);
	    
	    bt2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
			try {
				int min = Integer.parseInt(minI.getText());
				int max = Integer.parseInt(maxI.getText());
				String dataToWrite="";
				
				for(int i=min; i<=max;i++) {
					dataToWrite += i +"";
				}
				listLabel.setText(dataToWrite);
				listLabel.setForeground(Color.BLUE);
				
			}catch(Exception err) {
				listLabel.setText("Wrong data!!!");
				listLabel.setForeground(Color.RED);
			}
			}
		});
	    
	    	
	    myPanel.add(listLabel);
	    myPanel.add(bt2);
	    myPanel.add(bt);
	    myPanel.add(resultL);
	    myPanel.add(maxI);
	    myPanel.add(minI);
	    myPanel.add(maxLabel);
	    myPanel.add(minLabel);
		myPanel.add(description);
		myPanel.setBackground(new Color(99, 244, 14));
		myPanel.setLayout(null);
		mainFrame.add(myPanel);
		mainFrame.setVisible(true);
		
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        createNewFrame();
	}

}
