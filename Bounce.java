package JavaLearning;

import java.awt.*;
import javax.swing.*;

public class Bounce {

	public static void main(String[] args) {
		EventQueue.invokeLater(()->{
			JFrame frame = new BounceFrame();
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setVisible(true);
		});

	}

}
