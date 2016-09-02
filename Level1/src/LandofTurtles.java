

	import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JPanel;

import org.teachingextensions.logo.MultiTurtlePanel;
	import org.teachingextensions.logo.Turtle;

	public class LandofTurtles {
		public static void main(String[] args) {
			MultiTurtlePanel panel = new MultiTurtlePanel();
			String galapagosIslands = "https://farm2.staticflickr.com/1104/752631367_5c5d474ba5_o.jpg";

	// 1. Create a frame & make it visible
JFrame JF = new JFrame();
JF.setVisible(true);
JF.setSize(500, 500);
			// 2. Add the panel to the frame
		
			JF.add(panel);
			// 3. Set the background image of the panel to the Galapagos Islands 
panel.setBackgroundImage(galapagosIslands);
			// 4. Instantiate a Turtle 


	
// 5. Add the turtle to the panel 
			for (int i = 0; i < 50; i++) {
				Turtle tur = new Turtle();
			tur.setX(new Random().nextInt(500));
			tur.setY(new Random().nextInt(350)+200);
				panel.addTurtle(tur);}
			// 6. Put 50 Turtles on the beach

		}
	}


