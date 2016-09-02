import java.awt.Color;
import java.util.Random;

import info.gridworld.actor.Bug;
import info.gridworld.actor.Flower;
import info.gridworld.grid.Location;
import info.gridworld.world.World;

public class Gridcity {
	public static void main(String[] args) {
		Location loc = new Location(3, 3);
		Location l = new Location(0, 0);
		Bug b = new Bug();

		b.setColor(Color.BLUE);
		World w = new World();
		w.show();
		w.add(loc, b);
		b.turn();
		Random ran = new Random();
		int a = ran.nextInt(10);
		int c = ran.nextInt(10);
		Location d = new Location(a, c);
		Bug e = new Bug();
		w.add(d, e);
		e.setColor(Color.gray);
		e.turn();
		e.turn();
		Flower f = new Flower();
		Location loca = new Location(a, c + 1);
		Location locat = new Location(a, c - 1);
		w.add(locat, f);
		w.add(loca, f);

		Location g = new Location(a + 1, c);
		int z = 0; 
		int x = 0;
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				
			
			Location locati = new Location(i, j);
			
			w.add(locati, f);}
		}
	}
}
