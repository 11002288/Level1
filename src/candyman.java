import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class candyman implements MouseListener {
public static void main(String[] args) {
	candyman man = new candyman();
	man.js();	
	

}
static final int CREEPY = 0;
static final int SCREAM = 1;

public static void playSound(int whichSound) {
File soundFile = null;
	 if (whichSound == CREEPY)
		 soundFile = new File(
				 "/Users/league/Google Drive/league-sounds/creepy-noise.wav");
	 else if (whichSound == SCREAM)
		 soundFile = new File(
				 "/Users/League/Google Drive/league-sounds/scream.wav");
	 try {
		 AudioInputStream audioInputStream = AudioSystem
				 .getAudioInputStream(soundFile);
		 Clip clip = AudioSystem.getClip();
		 clip.open(audioInputStream);
		 clip.start();
			 } catch (Exception ex) {
		 ex.printStackTrace();
	 }
}




JButton button = new JButton();
private  void js() {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	frame.setSize(500, 500);
	
	frame.add(panel);
	panel.add(button);
	button.setText("Candyman");
	frame.setVisible(true);
 button.addMouseListener(this);
}
private void showPictureFromTheInternet(String imageUrl) {
	try {
		URL url = new URL(imageUrl);
		Icon icon = new ImageIcon(url);
		JLabel imageLabel = new JLabel(icon);
		JFrame frame = new JFrame();
		frame.add(imageLabel);
		frame.setVisible(true);
		frame.pack();
	} catch (MalformedURLException e) {
		e.printStackTrace();
	}
}

int countd = 0;
@Override
public void mouseClicked(MouseEvent e) {
	// TODO Auto-generated method stub
	if (e.getSource().equals(button)) {
		countd += 1;
		if (countd==5) {
			showPictureFromTheInternet("http://www.oddities123.com/wp-content/uploads/2012/04/scary_clown_faces-1.jpg");
			playSound(CREEPY);	
		}
		
	}
}

@Override
public void mousePressed(MouseEvent e) {
	// TODO Auto-generated method stub
	
}

@Override
public void mouseReleased(MouseEvent e) {
	// TODO Auto-generated method stub
	
}

@Override
public void mouseEntered(MouseEvent e) {
	// TODO Auto-generated method stub
	
}

@Override
public void mouseExited(MouseEvent e) {
	// TODO Auto-generated method stub
	
}






















}