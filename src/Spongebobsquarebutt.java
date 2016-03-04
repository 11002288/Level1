
public class Spongebobsquarebutt {
public static void main(String[] args) {
	/*
	 * 1. In a Runner class, make Spongebob. Use the methods below to make him eat, and laugh.
	 * 2. Make Patrick and Squidward and print their name, have them eat, and make them laugh.
	 */
	SeaCreature bob = new SeaCreature("spongebob");
	bob.eat();
	bob.laugh();
	SeaCreature pat = new SeaCreature("patrick");
	pat.eat();
	pat.laugh();
	SeaCreature squid = new SeaCreature("squidward");
	squid.eat();
	squid.laugh();
	
}
}
