package jframeGUI;

public class testGUI {

	public static void main(String[] args) {
		TestFrame tf = new TestFrame(640, 480); //instantiate
		tf.setUpGUI();
		tf.setUpButtonListener();
	}

}
