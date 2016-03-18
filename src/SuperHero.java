
public class SuperHero {
	String name;
String	power;
	String sidekick;	
 SuperHero(String name, String power, String sidekick){
	this.name = name;
	this.power = power;
	this.name = sidekick;
	
}
	String getName() {
		return name;	
	}
	String getPower() {
		return power;}
	String getsidekick() {
		return sidekick;}
	void setName(String name) {
		this.name = name;
	}
	void setPower(String power) {
		this.power = power;
	}
	void setSideKick(String sidekick) {
		this.sidekick = sidekick;
	}
	
	public String toString(){
		return name + " Wonderman " + power + " skills";
		
		
	}
}
