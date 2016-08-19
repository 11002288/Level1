import java.awt.Color;

import org.teachingextensions.logo.Colors;
import org.teachingextensions.logo.Tortoise;

public class Houses {
	public static void main(String[] args) {

		Tortoise.setSpeed(10);
		Tortoise.setX(10);
		Tortoise.setY(435);
		Tortoise.show();
		house("small", Colors.getRandomColor());

		house("medium", Color.orange);
		house("large", Colors.getRandomColor());
		house("small", Colors.getRandomColor());
		house("large", Colors.getRandomColor());
		house("small", Colors.getRandomColor());
		house("medium", Colors.getRandomColor());
		house("small", Colors.getRandomColor());
		house("large", Colors.getRandomColor());
		house("medium", Colors.getRandomColor());
		house("medium" + "", Colors.getRandomColor());

	}

	private static void house(String size, Color c) {
		int height = 100;
		Tortoise.setPenColor(c);
		if (size.equals("small")) {
			height = 60;
		}
		if (size.equals("medium")) {
			height = 100;
		}
		if (size.equals("large")) {
			height = 250;
		}

		Tortoise.move(height);

		if (size.equals("large")) {
			flat();
		}else pointy();
		
		Tortoise.move(height);
		Tortoise.turn(270);
		Tortoise.setPenColor(Color.GREEN);
		Tortoise.move(20);
		Tortoise.turn(270);
		//flat();
	}

	private static void flat() {
		
		Tortoise.turn(90);
		Tortoise.move(40);
	Tortoise.turn(90);
	
//		Tortoise.turn(270);
		
	}

	private static void pointy() {
		Tortoise.turn(60);
		Tortoise.move(20);
		Tortoise.turn(60);
		Tortoise.move(20);
		Tortoise.turn(60);
	}
}