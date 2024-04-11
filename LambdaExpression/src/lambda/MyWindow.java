package lambda;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class MyWindow {

	public static void main(String[] args) {
		JFrame frame = new JFrame("window");
		frame.setSize(400,400);
		frame.setLayout(new FlowLayout());
		JButton button = new JButton("click me");
		frame.add(button);
		button.addActionListener(e-> JOptionPane.showMessageDialog(null, "hey button is clicked"));
				
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		

	}

}
