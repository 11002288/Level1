import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class whackamole implements ActionListener {
	public static void main(String[] args) {
		whackamole whack = new whackamole();
		whack.mole();
		whackamole a = new whackamole();
		a.mole();
	}

	JFrame frame = new JFrame();
	JButton jb;
int count=0;
Date ate = new Date();

	private void mole() {

		JPanel panel = new JPanel();
		frame.add(panel);
		int rand = new Random().nextInt(28);

		for (int i = 0; i < 28; i++) {
			JButton button = new JButton();
			if (rand == (i)) {
				jb = button;
				button.setText("Mole");
			}
			button.addActionListener(this);
			panel.add(button);
		}
		frame.setVisible(true);
		frame.setSize(100, 2900);
	} 
	private void endGame(Date timeAtStart, int molesWhacked) {
		Date timeAtEnd = new Date(molesWhacked);
		JOptionPane.showMessageDialog(null, "Your whack rate is "
		+ ((timeAtEnd.getTime() - timeAtStart.getTime()) / 1000.00 / molesWhacked) + " moles per second.");
		}


	void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words).waitFor();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
		}
	}

	@Override
	public void actionPerformed(ActionEvent action) {
		// TODO Auto-generated method stub
		action.getSource();
		if (jb == (action.getSource())) {
count += 1;			
			JOptionPane.showMessageDialog(null, "score "+ count);
		} else {

			System.out.println("dork");
			speak("Dork");
		}
		if (count==(10)) {
		endGame(ate, count);	
		}
		frame.dispose();
		frame = new JFrame();
		mole();
	}

}
