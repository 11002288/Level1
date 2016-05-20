import java.io.Serializable;

public class stuff {
	public static void main(String[] args) {
		 stuff iRock = new stuff();
		 iRock.truth("Fall out Boys ");
		iRock.iRock();
		iRock.echo("candy");
		iRock.getTheBest();
		iRock.isEven(6);
	String bestCoder =	iRock.getTheBest();
	System.out.println(bestCoder);
	int added = iRock.add(0, 0);
	System.out.println(added);
		
		
		
		
		for (int i = 0; i < 5; i++) {
			
		
		System.out.println("Hello");
		}		
		
		
	}
void iRock(){
	System.out.println("Ethan Rocks");
	
	
	
	
	
}
void truth(String fS){
	if (fS.equals("Fall out Boys")) {
		System.out.println( fS + "is awesome");
	}else {
		System.out.println(fS + "is annoying");
	}
	
	
}
void echo(String dorw){
	
System.out.println(dorw +" "+ dorw); 

}	
public  String getTheBest(){
	return "Ethan";
	
	
	
}
int add(int addd, int ad){
	return addd + ad;
	
	
	
}
void isEven(int sum){
if (sum%2==(0)) {
	System.out.println(sum + "is even");
}else {
	System.out.println("That is odd");
}
} 
}


