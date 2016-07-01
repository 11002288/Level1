import java.applet.AudioClip;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class tootmachine {
public static void main(String[] args) {
	JFrame t = new JFrame();
	t.setVisible(true);
	JPanel o = new JPanel();
   JButton oo = new JButton();
   JButton ob = new JButton();
   JButton bo = new JButton();
   t.add(o);
   o.add(oo);
   o.add(bo);
   o.add(ob);
   oo.setText("Fart 1");
   ob.setText("Fart 2");
   bo.setText("Worst fart ever");
   t.pack();
}
//    Create a GUI for a fart machine that will play different fart sounds when the buttons are pressed.
//
//Gather fart sounds. They must be wav files. Here is a good collection: http://soundbible.com/tags-fart.html
//
//Call this playSound() method when they hit one of the buttons.
private void playSound(String fileName) {
		AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName));
		sound.play();
	}


}
