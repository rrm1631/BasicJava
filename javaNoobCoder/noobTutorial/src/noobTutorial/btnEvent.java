package noobTutorial;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class btnEvent implements ActionListener{
	
	private String message;
	public btnEvent(String message) {
		this.message = message;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println(this.message);
	}
	
}
