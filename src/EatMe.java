
import java.awt.Component;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowEvent;
import java.net.URL;
import java.util.HashMap;
import java.util.Random;
import java.util.Date;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 * This game uses the Makey Makey to see if you can match the pictures of food
 * to the correct utensil. There are utensils (including metal chopsticks!) in
 * one of the blue drawers.
 * 
 * Learn how to hook up the Makey Makey here: http://makeymakey.com/howto.php
 * 
 */

public class EatMe extends KeyAdapter {

	JFrame jFrame;
	HashMap<Integer, String> images = new HashMap<Integer, String>();
	private int correctUtensilCode;
int score = 0;
	private void makeAlbum() {
		// 1. Find 4 images of foods eaten by different utensils and put them in
		// your default package
		// 2. Connect the images to the UP, DOWN, LEFT, and RIGHT keys like
		// this...
		
		images.put(new Integer(KeyEvent.VK_UP), "noodle.jpg"); // the spoon will
																// be connected
																// to the UP key
		images.put(new Integer(KeyEvent.VK_LEFT), "sushi.jpg"); // the chopstick
																// will be
																// connected to
																// the LEFT key
		images.put(new Integer(KeyEvent.VK_RIGHT), "steak.jpg");
		images.put(new Integer(KeyEvent.VK_DOWN), "cereal.jpg");
		// 3. Call the method to show an image
		showImage();
	}

	private void showImage() {

		// 4. Initialize your jFrame to a new JFrame() (jFrame already exists)
		jFrame = new JFrame();
		// 5. Set the JFrame to visible
		jFrame.setVisible(true);
		jFrame.add(getNextRandomImage());

		// 6. Pack the frame
		jFrame.pack();
		// 7. Add a KeyListener to the frame
jFrame.addKeyListener(this);
	}

	public void keyPressed(KeyEvent e) {
		
		int whichKeyPressed = e.getKeyCode();
		// 8. Print out the key that was pressed
		System.out.println(whichKeyPressed);
		// 9. Print the correctUtensilCode
		System.out.println(correctUtensilCode);
		// 10. If they match, tell the user they were correct
		if (whichKeyPressed==(correctUtensilCode)) {
			JOptionPane.showMessageDialog(null, "Corect");
			score++;
		}else {
			JOptionPane.showMessageDialog(null, "Learn some manners");
			JOptionPane.showMessageDialog(null, "Your score was" + score);
			System.exit(0);
		}
		// 11. Otherwise, tell the user that they should learn some manners
		// 12. Hook up the utensils to the Makey Makey and test if it works

		jFrame.dispatchEvent(new WindowEvent(jFrame, WindowEvent.WINDOW_CLOSING)); // closes
																					// the
																					// window

		// 13. Call the method to show an image
showImage();
		// 14. Make a variable for the number of tries and limit it to

		// 10.[requires code in different places]

		// 15. Make a variable to track the score and tell the user at the end.
		// [requires code in different places]
	}

	private Component getNextRandomImage() {
		String[] fileNames = images.values().toArray(new String[0]);
		int randomness = new Random().nextInt(fileNames.length);
		String randomFile = fileNames[randomness];
		System.out.println("loading image " + randomness + ": " + randomFile);

		this.correctUtensilCode = getHashMapKey(randomFile);
		return loadImage(randomFile);

	}

	private Integer getHashMapKey(String randomFile) {
		for (Integer key : images.keySet()) {
			if (images.get(key).equals(randomFile)) {
				return key;
			}
		}
		return null;
	}

	private JLabel loadImage(String fileName) {
		URL imageURL = getClass().getResource(fileName);
		Icon icon = new ImageIcon(imageURL);
		return new JLabel(icon);
	}

	public static void main(String[] args) throws Exception {
		new EatMe().makeAlbum();
	}
}

/**
 * 17. [Optional] Add a timer. ~~~ Declare the Start at the top~~~Date
 * timeAtStart; ~~~ Set it where the code starts running ~~~ timeAtStart= new
 * Date();
 * 
 * ~~~ where the code ends ~~~ Date timeAtEnd = new Date();
 * System.out.println((timeAtEnd.getTime()-timeAtStart.getTime())/1000);
 * System.exit(0);
 * 
 **/
