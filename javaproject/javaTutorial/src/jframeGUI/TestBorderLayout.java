package jframeGUI;

import java.awt.*;
import javax.swing.*;

public class TestBorderLayout extends JFrame{

	JLabel lbl = new JLabel("Enter Number 2:");
	JTextField txt = new JTextField(15);
	JTextArea txtA = new JTextArea("Hello, \nThis is a JTextArea... ");
	
	JButton btn1 = new JButton("Button 1");
	JButton btn2 = new JButton("Button 2");
	
	public TestBorderLayout() {
		Container c = getContentPane();
		BorderLayout bl = new BorderLayout();
		c.setLayout(bl);
		
		setSize(340, 240);
		setTitle("Test Border Layout");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		c.add(txt, BorderLayout.NORTH);
		c.add(txtA, BorderLayout.CENTER);
		c.add(btn1, BorderLayout.WEST);
		c.add(btn2, BorderLayout.EAST);
		c.add(lbl, BorderLayout.SOUTH);
	}
		
	public static void main(String[] args) {
		TestBorderLayout g = new TestBorderLayout();

	}

}
