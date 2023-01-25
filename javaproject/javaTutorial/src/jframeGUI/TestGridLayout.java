package jframeGUI;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class TestGridLayout extends JFrame implements ActionListener{

	JButton btn1 = new JButton("Button 1");
	JButton btn2 = new JButton("Button 2");
	JButton btn3 = new JButton("Button 3");
	JButton btn4 = new JButton("Button 1");
	JButton btn5 = new JButton("Button 2");
	JButton btn6 = new JButton("Button 3");
	
	public TestGridLayout() {
		Container c = getContentPane();
		GridLayout gl = new GridLayout(2, 3); //rows, column
		c.setLayout(gl);
		
		setSize(340, 240);
		setTitle("Test Grid Layout");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		c.add(btn1);
		c.add(btn2);
		c.add(btn3);
		c.add(btn4);
		c.add(btn5);
		c.add(btn6);
		
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		btn3.addActionListener(this);
		btn4.addActionListener(this);
		btn5.addActionListener(this);
		btn6.addActionListener(this);
	}
	
	public void actionPerformed (ActionEvent e) {
		if(e.getSource() == btn1) {
			System.out.println("1");
		}
		
		else if(e.getSource() == btn2) {
			System.out.println("2");
		}
		
		else if(e.getSource() == btn3) {
			System.out.println("3");
		}
		
		else if(e.getSource() == btn4) {
			System.out.println("4");
		}
		
		else if(e.getSource() == btn5) {
			System.out.println("5");
		}
		
		else if(e.getSource() == btn6) {
			System.out.println("6");
		}
		
	}
	
	
	public static void main(String[] args) {
		TestGridLayout tg = new TestGridLayout();
	}

}
