package jframeGUI;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.*;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent; 
import java.awt.event.ActionListener; 

public class TestFrame extends JFrame{ //extends use to instanciate the JFrame properties

	private int width;
	private int heigth;
	
	private JLabel label;
	private JTextField input;
	
	private JButton button1;
	private JButton button2;
	
	private MyActionListener al;
	
	
	public TestFrame(int w, int h) { //Constructor
		width = w;
		heigth = h;
		
		label = new JLabel("Hello");
		input = new JTextField(10);
		
		button1 = new JButton("Set New Text");
		button2 = new JButton("x2");
		
		al = new MyActionListener();
	}
	
	public void setUpGUI() {
		
		Container c = getContentPane();
		FlowLayout flow = new FlowLayout();
		c.setLayout(flow);
		
		setSize(width, heigth);
		setTitle("Java App");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		c.add(label);
		c.add(input);
		
		c.add(button1);
		c.add(button2);
//		button.addActionListener(al);
		
	}
	
	public void setUpButtonListener() {
		ActionListener buttonListener = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == button1) {
					//System.out.println("Button 1 Clicked");
					
					String s = input.getText();
					label.setText(s);
					input.setText("");
				} 
				
				else if(e.getSource() == button2){
					//System.out.println("Button 2 Clicked");
					
					String val = input.getText();
					double n = Double.parseDouble(val);
					double result = n * 2;
					
					label.setText(Double.toString(result));
				}
			}
		};
		
//		ActionListener buttonListener2 = new ActionListener() {
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				System.out.println("Button 2 Clicked");
//			}
//		};
		
		button1.addActionListener(buttonListener);
		button2.addActionListener(buttonListener);
	}
	
	public class MyActionListener implements ActionListener{
		
		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println("Button Clicked");
		}
	}

}
