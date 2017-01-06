import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.regex.Pattern;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class binary implements ActionListener {
	public static void main(String[] args) {
		binary convert = new binary();
		convert.J();

	}

	JFrame jf = new JFrame();
	JPanel jp = new JPanel();
	JTextField answer = new JTextField(20);
	JButton jb = new JButton();
	JTextField a = new JTextField(20);

	void J() {
		jf.setVisible(true);
		jf.add(jp);
		jp.add(answer);
		jp.add(a);
		jp.add(jb);
		jf.setSize(600, 100);
		jb.setText("Convert");
		jb.addActionListener(this);
	}

	int convertletter(String binary) {
		if (binary.length() != 8) {
			JOptionPane.showMessageDialog(null, "Enter 8 bits, silly!!!");
			return 0;
		}
		if (!Pattern.matches("\\A[01]+\\Z", binary)) {
			JOptionPane.showMessageDialog(null, "Binary can only contain 1s or 0s, silly!!!");
			return 0;
		}
		try {
			int asciiValue = Integer.parseInt(binary, 2);
			return asciiValue;
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Enter a binary, silly!!!");
			a.setText("hi");
			return 0;
		}
	}

	String convert(String binary) {
		int asciiValue = Integer.parseInt(binary);
		char theLetter = (char) asciiValue;
		return "" + theLetter;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String name = answer.getText();
		int ve = convertletter(name);
		String letter = convert(ve + ""); 
		a.setText(letter);
	}

}
