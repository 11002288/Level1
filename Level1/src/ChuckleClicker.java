import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Set;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ChuckleClicker implements ActionListener {
	public static void main(String[] args) {
		ChuckleClicker buttons = new ChuckleClicker();
		buttons.makesbuttons();
	

		
		
	}
	
	JButton button = new JButton();
	JButton Button = new JButton();
	public void makesbuttons() {
		JFrame rame = new JFrame();
		rame.setVisible(true);
	rame.setSize(500, 500);;
		JPanel panel = new JPanel();
		
				
		button.setText("Joke");
		panel.add(button);
		rame.add(panel);
		
		
		Button.setText("punchline");
		panel.add(Button);
		rame.add(panel);
Button.addActionListener(this);
button.addActionListener(this);
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		System.out.println("hi");
		if (e.getSource () == Button) {
			JOptionPane.showMessageDialog(null, "Stop with punchlines you are going to hurt yourself");
		}
		if (e.getSource () == button) {
			JOptionPane.showMessageDialog(null,"Why did the chicken cross the road");
			JOptionPane.showMessageDialog(null, "To go home duh");	}
	
	

	}}
