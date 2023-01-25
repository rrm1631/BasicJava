package jframeGUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class firstGUI extends JFrame implements ActionListener{
	
	//Components
	JLabel L1 = new JLabel("Enter Number 1:");
	JLabel L2 = new JLabel("Enter Number 2:");
	JLabel L3 = new JLabel("Sum:           ");
	
	JTextField txt1 = new JTextField(15);
	JTextField txt2 = new JTextField(15);
	JTextField output = new JTextField(15);
	
	JButton btn = new JButton("Submit");
	
	Font F = new Font("Calibri", Font.BOLD, 20);
	Font Fa = new Font("Calibri", Font.ITALIC, 14);
	
	public firstGUI(){ //constructor - usually where the components are added
		
		Container C = getContentPane(); //Container - contains and controls the layout of components
		C.setLayout(new FlowLayout());
		C.setBackground(Color.yellow);
		
		setSize(300, 180);
		setTitle("Graphical User Interface");
		setVisible(true);
		
		
		
		//Adding Layout Components		
		C.add(L1);
		C.add(txt1);
		
		C.add(L2);
		C.add(txt2);
		
		C.add(L3);
		C.add(output);
		output.setEditable(false);
		
		C.add(btn);
		btn.addActionListener(this);

		
		
		//ToolTip
		txt1.setToolTipText("1st number!");
		txt2.setToolTipText("2nd number!");
		btn.setToolTipText("Click to display the sum");
		
		
		//Design
		output.setForeground(Color.red);
		output.setFont(Fa);
		
		btn.setBackground(new Color(128,128,255));
		btn.setForeground(new Color(255,255,255));
		btn.setFont(F);
	}
	
	
	public void actionPerformed (ActionEvent e) {
		int n1, n2, sum;
		
		n1 = Integer.parseInt(txt1.getText());
		n2 = Integer.parseInt(txt2.getText());
		
		sum = n1 + n2;
		
		output.setText(String.valueOf(sum));
	}

	public static void main(String[] args) {
		firstGUI M = new firstGUI ();
		M.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
}
