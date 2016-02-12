
public class Platypus {

		private String name;
		
		public Platypus(String namep) {
			name = namep;
			}
		
		void sayHi(){
			System.out.println("he platypus " + name + " is smarter than your average platypus.");
		}
		
		public static void main(String[] args) {
			//1. Make an instance of your new pet platypus
			Platypus plati = new Platypus("patty");
			//2. Call the sayHi method
			plati.sayHi();
			//3. Create a constructor in the platypus class so that you can give your platypus a name.
		}
}


