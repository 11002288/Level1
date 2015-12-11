
import java.awt.Frame;
import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Bodypartquiz {

	// Get 3 celebrity photos from the internet, save them to your computer, and
	// fill
	// in their paths here. To get the path, right click on the image, and copy
	// its Location.
	String firstImage = "/Users/league/Desktop/workshop2015/Level1/src/images.jpg";
	String secondImage = "/Users/league/Desktop/workshop2015/Level1/src/Justin_Bieber.jpg";
	String thirdImage = "/Users/league/Desktop/workshop2015/Level1/src/imgres.jpg";

	Frame window = new Frame();

	private void startQuiz() {

		window.setSize(40, 50);

		int score = 0;

		String picture1 = JOptionPane.showInputDialog("Who is this person?");

		if (picture1.equals("obama")) {
			score++;
			JOptionPane.showMessageDialog(null, "corect!!!!!!!!!!!!!! :)");

		} else {
			JOptionPane.showMessageDialog(null, "wrong");
		}

		JOptionPane.showMessageDialog(null, "Your score is " + score);

		window.setSize(50, 40);
showNextImage();
		String picture2 = JOptionPane.showInputDialog("Who is this person?");

		if (picture2.equals("Justin Bieber")) {
			score++;
			JOptionPane.showMessageDialog(null, "correct!!!!!!!!!!!!!! :)");

		} else {
			JOptionPane.showMessageDialog(null, "wrong");
		}

		JOptionPane.showMessageDialog(null, "Your score is " + score);
		showNextImage();
		window.setSize(70, 60);
		
				String picture3 = JOptionPane.showInputDialog("Who is this character?");

				if (picture3.equals("barbarian")) {
					score++;
					JOptionPane.showMessageDialog(null, "correct!!!!!!!!!!!!!! :)");

				} else {
					JOptionPane.showMessageDialog(null, "wrong");
				}

				JOptionPane.showMessageDialog(null, "Your score is " + score);
	}

	public void showNextImage() {
		window.removeAll();
		window.add(getNextImage());
		window.pack();
	}

	public static void main(String[] args) {
		Bodypartquiz quiz = new Bodypartquiz();
		quiz.initializeGui();
		quiz.startQuiz();
	}

	private void initializeGui() {
		initializeImageList();
		imageIterator = imageList.iterator();
		window.setVisible(true);
		showNextImage();
	}

	private JLabel loadImage(String fileName) {
		Icon icon = new ImageIcon(fileName);
		JLabel image = new JLabel(icon);
		return image;
	}

	ArrayList<JLabel> imageList = new ArrayList<JLabel>();
	Iterator<JLabel> imageIterator;

	private void initializeImageList() {
		JLabel imageLabel = loadImage(firstImage);
		imageList.add(imageLabel);
		imageLabel = loadImage(secondImage);
		imageList.add(imageLabel);
		imageLabel = loadImage(thirdImage);
		imageList.add(imageLabel);
	}

	private JLabel getNextImage() {
		if (imageIterator.hasNext())
			return imageIterator.next();
		window.dispose();
		return new JLabel();
	}
}
