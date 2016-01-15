import org.omg.Messaging.SyncScopeHelper;

public class Penguin {
	String color;
	int legs;
	String type;
public static void main(String[] args) {
	
	Penguin penny = new Penguin();
	penny.Waddle();
penny.Squack();
}
public Penguin(){	
}
public void Squack(){
System.out.println("quack");	
}
public void Waddle(){
System.out.println("waddle waddle");
}
}
