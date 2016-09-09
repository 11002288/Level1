
public class athlete {
	String name;
	int speed; 
	static String Cityrace;
	static int count = 0;
	
	athlete(String name, int speed){
this.name = name;	
this.speed = speed;
count++;}	
	
public static void main(String[] args) {
athlete bob = new athlete("Obmma", 3);
athlete jeff = new athlete("Usain bolt", 10);
bob.Cityrace= "San Diego";
System.out.println(jeff.Cityrace);
System.out.println(count);
}
}
