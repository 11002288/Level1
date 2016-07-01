
public class Monkey {
	String Color;
	boolean ismale;
	boolean tail;
	int age;

	Monkey(String Color, boolean ismale, boolean tail, int age) {
		this.Color = Color;
		this.ismale = ismale;
		this.age = age;
		this.tail = tail;

	}

	void swing() {
		System.out.println("tarzan the monkey man swinging from a rubber band");
	}

	void eat() {
		System.out.println("I want bananas");
	}

	void scream() {
		System.out.println("(Monkey sound monkey sound)");
	}
}
