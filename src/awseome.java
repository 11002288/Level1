

	
import java.awt.event.MouseAdapter;
	import java.awt.event.MouseEvent;
	import java.net.MalformedURLException;
	import java.net.URL;

	import javax.swing.Icon;
	import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

	public class awseome extends MouseAdapter {

		/* We’re going to make a slideshow of cool optical illusions. */

		// 1. Make a Frame variable and initialize it using "new Frame()"
JFrame frame = new JFrame();
JLabel label;
		private void makeAlbum() {
			// 2. Make the frame visible
		frame.setVisible(true);
			// 3. Set the size of the frame
		frame.setSize(500,500);
			// 4. find 2 images and save them to your disk
		
			// 5. make a variable. make it hold the location of your image. e.g. “/Users/illusion.jpg”
			String imagemc = "rabbit.png";
		// 6. create a variable of type "JLabel" but don’t initialize it
		label = loadImageFromComputer(imagemc);
			// 7. use one of the the "loadImage..." methods below to initialize your JLabel
			
			// 8. add the JLabel to the frame
		frame.add(label);
			// 9. call the pack() method on the frame
		frame.pack();

			// 10. add a mouse listener ("this") to your frame
		frame.addMouseListener(this);}

		public void mousePressed(MouseEvent e) {
			// 11. Print to the console when the mouse is pressed
			System.out.println("whateveerrrrrr");
			// 12. remove everything from the frame (the image will not disappear until step 14)
			frame.remove(label);
			
		
			String creepy1;
			String creepy = "creep.jpg";
			// 13. load a new image like before (this is more than one line of code)
			label = loadImageFromComputer(creepy);
			
			frame.add(label);
		
			// 14. pack the frame
		frame.pack();}

		// [OPTIONAL] 15. goad your users with some annoying or witty pop-ups

		public JLabel loadImageFromTheInternet(String imageURL) throws MalformedURLException {
			URL url = new URL(imageURL);
			Icon icon = new ImageIcon(url);
			return new JLabel(icon);
		}

		/*
		 * To use this method, the image must be placed in your Eclipse project under "default package".
		 */
		public JLabel loadImageFromComputer(String fileName) {
			URL imageURL = getClass().getResource(fileName);
			Icon icon = new ImageIcon(imageURL);
			return new JLabel(icon);
		}

		public static void main(String[] args) throws Exception {
			new awseome().makeAlbum();
		}
	}





