 // Copyright Wintriss Technical Schools 2013
import java.awt.Component;
import java.awt.Frame;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class PhotoQuiz {

	public static void main(String[] args) throws Exception {
		Frame quizWindow = new Frame();
		quizWindow.setVisible(true);

		// 1. find an image on the internet, and put its URL in a String variable (from your browser, right click on the image, and select “Copy Image URL”)
String image = "https://36.media.tumblr.com/e25c9f4c3cb7f6701096193604c69ba9/tumblr_nl1ef01BxC1u918uco2_500.jpg";
		// 2. create a variable of type "Component" that will hold your image
Component picture = createImage(image);
		// 3. use the "createImage()" method below to initialize your Component
  
		// 4. add the image to the quiz window
quizWindow.add(picture);
		// 5. call the pack() method on the quiz window
quizWindow.pack();
		// 6. ask a question that relates to the image
String IDK=JOptionPane.showInputDialog("Do you know who these people are?");
		// 7. print "CORRECT" if the user gave the right answer
if (IDK.equals("I don't know")) {
	JOptionPane.showMessageDialog(null, "Either do I");
}else {
	JOptionPane.showMessageDialog(null, "Incorrect. I don't know who the those people are.");
}
		// 8. print "INCORRECT" if the answer is wrong

		// 9. remove the component from the quiz window (you may not see the effect of this until step 12)
quizWindow.remove(picture);
		// 10. find another image and create it
String image2 = ("http://static.tumblr.com/620781445aa7699323dbb8871ea729ce/ocdjucx/OMhmiscxj/tumblr_static_star_wars_stormtroopers_coffee_starbucks_1280x1024_wallpaper_www.wallpaperno.com_65.jpg");
		// 11. add the second image to the quiz window
Component pictureb = createImage(image2);
quizWindow.add(pictureb);
quizWindow.pack();
// 12. pack the quiz window

		// 13. ask another question
//quizWindow.setSize(100, 100);
String starbucks=JOptionPane.showInputDialog("do you like starbucks");
		if (starbucks.equals("yes")) {
			JOptionPane.showMessageDialog(null, "the empire won't come after you");
		}JOptionPane.showMessageDialog(null, "you better watch out, or else the empire will come after you");
// 14+ check answer, say if correct or incorrect, etc.

	}

	private static Component createImage(String imageUrl) throws MalformedURLException {
		URL url = new URL(imageUrl);
		Icon icon = new ImageIcon(url);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}

	/* OPTIONAL */
	// *14. add scoring to your quiz
	// *15. make something happen when mouse enters image (imageComponent.addMouseMotionListener()) 
}





