package noobTutorial;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.JFrame;

public class gui {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame app = new JFrame();
		
		app.setTitle("My First GUI");
		app.setResizable(false);
		app.setSize(500,500);
		app.setVisible(true);
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = app.getContentPane();
//		c.setBackground(new Color(0,0,0));
		
		//ActionEvent 1
		JButton east = new JButton("east");
		btnEvent eastbtn = new btnEvent("East Button Clicked");
		east.addActionListener(eastbtn);
		
		//ActionEvent 2
		JButton west = new JButton("west");
		west.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("West Button Clicked");
			}
		});
		
		
		JButton center = new JButton("center");
		JButton south = new JButton("south");
		JButton north = new JButton("north");
		
		c.add(east, BorderLayout.EAST);
		c.add(west, BorderLayout.WEST);
		c.add(center, BorderLayout.CENTER);
		c.add(south, BorderLayout.SOUTH);
		c.add(north, BorderLayout.NORTH);
		
	}

}
