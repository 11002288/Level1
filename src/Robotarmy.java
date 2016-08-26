

	public class Robotarmy {
		public static void main(String[] asd){
			//1. create a new human
Human bob = new Human("steve");
Human b = new Human("chris");
Human bb = new Human("nick");
			//2. create a new Robot army of good and evil robots.
Robot a = new Robot("dog",true);
Robot d = new Robot("og",false);
Robot c = new Robot("g",false);
			
			//3. command your robot to destroy a huma
a.destroy(bb);
		}
	}

	/**
	 * Human Class
	 */
	class Human {
		String name;
		boolean isAlive;
		
		public Human(String name){
			this.name = name;
			this.isAlive = true;
		}
		public String getName() {
			return name;
		}
		public void die(){
			isAlive = false;
		}
	}

	/**
	 * Robot Class
	 */
	class Robot {
		boolean isEvil;
		String name;
		
		public Robot(String name, boolean isEvil){
			this.name = name;
			this.isEvil = isEvil;
		}
		
		public void destroy(Human man){
			if(isEvil){
				System.out.println("Beep Boop Pew! Oh no! the robot " + name + " blasted " + man.getName() + "'s head off!");
				man.die();
			}
			else{
				System.out.println("No!! The robot " + name + " loves " +man.getName());
			}
		}
	}


