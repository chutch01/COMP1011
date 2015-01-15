
public class Player {

	public static void main(String[] args) {
		int year = 2015;
		System.out.println("Hello World It's " + year + "!");
		
		Person tom = new Person("Tom", 225.3f);
		tom.walks();
		
		Person mike = new Person("Mike", 180.9f);
		mike.walks();
		
		Person matt = new Person("Matt", 220.1f);
		matt.walks();
		matt.eats();
		
	
	}
	
}
