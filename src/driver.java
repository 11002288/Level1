
public class driver {
	public static void main(String[] args) {
		
	
smurf a = new smurf("handy");
smurf b = new smurf("papa");
smurf c = new smurf("smurfette");
	a.eat();
	a.getName();
	System.out.println(a.getName());
	b.getName();
	System.out.println(b.getName());
	b.getHatColor();
	System.out.println("My hat color is " + b.getHatColor());
	b.isGirlOrBoy();
	System.out.println("I'm a " + b.isGirlOrBoy());
	c.getName();
	System.out.println(c.getName());
	c.getHatColor();
	System.out.println("My hat color is " + c.getHatColor());
	c.isGirlOrBoy();
	System.out.println("I'm a " + c.isGirlOrBoy());
	
	}
}