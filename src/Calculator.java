import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator {
	public static void main(String[] args) {
		Calculator j = new Calculator();
j.j();
	}

	void j() {
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		JButton button = new JButton();
		JButton button2 = new JButton();
		JButton button3 = new JButton();
		JButton button4 = new JButton();
		JTextField jft = new JTextField();
		JTextField tfj = new JTextField();
		frame.add(panel);
		panel.add(jft);
		panel.add(tfj);
		jft.setPreferredSize(new Dimension (200,20));
		tfj.setPreferredSize(new Dimension (200,20));
		panel.add(button);
		panel.add(button2);
		panel.add(button3);
		panel.add(button4);
		frame.pack();
		frame.setVisible(true);

	}
}
