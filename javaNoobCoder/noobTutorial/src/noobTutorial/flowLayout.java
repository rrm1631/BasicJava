package noobTutorial;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JFrame;

public class flowLayout {

	public static void main(String[] args) {
		JFrame app = new JFrame();
		
		app.setTitle("My First GUI");
		app.setResizable(false);
		app.setSize(500,500);
		app.setVisible(true);
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = app.getContentPane();
		c.setLayout(new FlowLayout());
	

//		for(int i=0; i < 9; i++) {
//			c.add(new JButton(Integer.toString(i)));
//		}

	}

}