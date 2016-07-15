import java.applet.AudioClip;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class tootmachine implements ActionListener{
public static void main(String[] args) {
	tootmachine shard = new tootmachine();
	shard.farts();
}

JFrame t = new JFrame();
JPanel o = new JPanel();
JButton oo = new JButton();
JButton ob = new JButton();
JButton bo = new JButton();

private  void farts() {
	t.setVisible(true);
   t.add(o);
   o.add(oo);
   o.add(bo);
   o.add(ob);
   oo.setText("Fart 1");
   ob.setText("Fart 2");
   bo.setText("Worst fart ever");
   t.pack();
oo.addActionListener(this);
ob.addActionListener(this);
bo.addActionListener(this);

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
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	if (e.getSource() == oo) {
	playSound("fartsboy.wav");	
	}
	if (e.getSource() == ob) {
		playSound("Person Farting-SoundBible.com-1490324066.wav");
	}
if(e.getSource() == bo){
	playSound("Fart Reverberating Bathroom-SoundBible.com-2032114496.wav");
	
}
	}


}
