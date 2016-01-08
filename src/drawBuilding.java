
import java.awt.Color;
import java.util.Random;

import org.teachingextensions.logo.*;

public class drawBuilding {
public static void main(String[] args) {
	Tortoise.show();
	Tortoise.setX(100);
	Tortoise.setY(300);
	int hi = new Random().nextInt(500);
	drawBuilding drawing = new drawBuilding();
	drawing.drawbuilding("small", Colors.Purples.Indigo);
	drawing.drawbuilding("medium", Colors.Oranges.Tomato);
	drawing.drawbuilding("large",Colors.getRandomColor());
	drawing.drawbuilding("medium",Colors.Greens.Aquamarine);
//	drawing.drawbuilding("medium");
//	drawing.drawbuilding("small");drawing.drawBuilding("small");
//	drawing.drawbuilding("large");
//	drawing.drawbuilding("large");
	//drawing.drawBuilding(100);
	//drawing.drawBuilding(110);
	//drawing.drawBuilding(150);
	//drawing.drawBuilding(70);

}
void drawbuilding(String size, Color tomato) {
	Tortoise.setPenColor(tomato);
	
int stuff ;
if (size.equals("small")) {
	Tortoise.move(40);
}
if (size.equals("medium")) {
	Tortoise.move(100);
}
if (size.equals("large")) {
	Tortoise.move(160);
}

	Tortoise.setSpeed(10);
//Tortoise.move(size);
Tortoise.turn(90);
//Tortoise.setPenColor(.ColorRandom);
Tortoise.move(50);
Tortoise.turn(90);
//Tortoise.move(size);
if (size.equals("small")) {
	Tortoise.move(40);
}
if (size.equals("medium")) {
	Tortoise.move(100);
}
if (size.equals("large")) {
	Tortoise.move(160);
}
Tortoise.turn(-90);
Tortoise.move(70);
Tortoise.turn(270);
}}



