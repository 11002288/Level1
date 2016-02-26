

	import javax.swing.JFrame;

import org.teachingextensions.logo.MultiTurtlePanel;
import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.logo.Turtle;

	public class LandOfTurtles {
		public static void main(String[] args) {
			MultiTurtlePanel panel = new MultiTurtlePanel();
			String galapagosIslands = "https://farm2.staticflickr.com/1104/752631367_5c5d474ba5_o.jpg";
		JFrame frame = new JFrame();
		frame.setSize(699, 699);
	frame.add(panel);
	frame.setVisible(true);
			/* 1. Get the panel to show */
			panel.setVisible(true);
			/* 2. Set the background image of the panel to the Galapagos Islands */
panel.setBackgroundImage(galapagosIslands);
			/* 3. Instantiate a Turtle and add it to the panel */
			
			/* 4. Put 50 Turtles on the beach. */
for (int i = 0; i < 51; i++) {
	Turtle po = new Turtle();
po.setX(5 + i * 10);

			panel.addTurtle(po);
		}
		}}


