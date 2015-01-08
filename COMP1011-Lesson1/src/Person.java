//putting classes in to their own pages makes it cleaner, classes within classes are called inner classes, and work a lot differently than what we are used it

public class Person{
		float height;
		float weight;
		//constructor
		public Person(){
			this.height = 6;
			this.weight = 200;
		}
		
		public void walks(){
			this.weight *= 0.9;
			System.out.println("You lost weight!");
			System.out.println("You weigh: " + this.weight +"lbs");
		}
		
		public void eats(){
			this.weight *= 1.2;
			System.out.println("you gained wait you fat tub of lard!");
			System.out.println("You weigh: " + this.weight + "lbs");
		}
		
	}