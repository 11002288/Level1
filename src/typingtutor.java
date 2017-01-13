import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class typingtutor implements KeyListener {

	JFrame jf = new JFrame();
	JPanel jp = new JPanel();
	JLabel jl = new JLabel();
	char currentLetter = generateRandomLetter();

	char generateRandomLetter() {
		Random r = new Random();
		return (char) (r.nextInt(26) + 'a');
	}

	public typingtutor() {
		jf.add(jp);
		jp.add(jl);
		jf.addKeyListener(this);
		jf.setVisible(true);
		jf.setTitle("Type or die");
		jl.setText("" + currentLetter);
		jl.setFont(jl.getFont().deriveFont(28.0f));
		jl.setHorizontalAlignment(JLabel.CENTER);	
		jf.pack();
		
	}

	public static void main(String[] args) {
typingtutor tt = new typingtutor();
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		 currentLetter = generateRandomLetter();

	}

}
