package DialogBox;

import java.lang.System;
import java.lang.String;
import javax.swing.*;

public class JOptionPaneFundamentals {

	public static void main(String[] args) {
		String num1, num2;
		int number1, number2, sum;
		
		JDialog.setDefaultLookAndFeelDecorated(true);
		
		//Syntax: JOptionPane.showMessageDialog (null, “String to Display”, “Text in Title Bar”, Type of Message Dialog);
		num1 = JOptionPane.showInputDialog(null,"Enter first integer:", "First", JOptionPane.WARNING_MESSAGE);
		number1 = Integer.parseInt(num1);
		
		num2 = JOptionPane.showInputDialog(null,"Enter second integer:", "Second", JOptionPane.INFORMATION_MESSAGE);
		number2 = Integer.parseInt(num2);
		
		sum = number1 + number2;
		
		JOptionPane.showMessageDialog(null,"The sum is " + sum);
		
		
		//JTextArea (Syntax: JTextArea object = new JTextArea (rows, columns);		
		JTextArea outputArea = new JTextArea(5, 10);
		JScrollPane scroll = new JScrollPane (outputArea); //scroll
		
		 for (int x = 1; x<=10; x++) {
			 //outputArea.setText(x+"\n");//setText()
			 outputArea.append(x+"\n"); //append()
		 }
			 
		 JOptionPane.showMessageDialog(null, scroll); //Display in Textarea using showMessageDialog
		
		
		System.exit(0);

	}

}


