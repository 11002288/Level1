import info.gridworld.actor.Bug;
import info.gridworld.grid.Location;
import info.gridworld.world.World;

public class X {
public static void main(String[] args) {
	World wo = new World();
	wo.show();
	Bug b = new Bug();
	Location l = new Location(0,0);
	int a = 0;
	int c = 0;
	wo.add(l, b);
	for (int i = 0; i < 10; i++) {
		
	Location lo = new Location(a++,c++);
	wo.add(lo, b);}
	int d = 9;
	int e = 0;
	for (int i = 0; i < 10; i++) {
		Bug f = new Bug();
		Location loc = new Location(d--,e++);
		wo.add(loc, f);}
}
}
