//putting classes in to their own pages makes it cleaner, classes within classes are called inner classes, and work a lot differently than what we are used it

public class Person{
		private float height;
		private float weight;
		private String name;
		
		//getters and setters
		public float getHeight() {
			return height;
		}

		public void setHeight(float height) {
			this.height = height;
		}

		//constructor
		public Person(String name, float weight){
			this.name = name;
			this.setHeight(6);
			this.weight = weight;
		}
		
		public void walks(){
			this.weight *= 0.9;
			System.out.println(this.name +" lost weight!");
			System.out.println(this.name +" weighs: " + this.weight +"lbs");
		}
		
		public void eats(){
			this.weight *= 1.2;
			System.out.println(this.name +" gained wait you fat tub of lard!");
			System.out.println(this.name +" weighs: " + this.weight + "lbs");
		}
		
	}