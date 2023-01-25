package jframeGUI;

import java.awt.*;
import javax.swing.*;

public class TestJPanel extends JFrame{

	
	JButton btn1 = new JButton("Button 1");
	JButton btn2 = new JButton("Button 2");
	JPanel panel = new JPanel();
	
	public TestJPanel() {
		panel.setLayout(new GridLayout(1,2));
		
		setSize(340, 240);
		setTitle("JPanel");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		add(panel);
		panel.add(btn1);
		panel.add(btn2);
		
		
	}
	
	public static void main(String[] args) {
		TestJPanel jp = new TestJPanel();
	}

}
