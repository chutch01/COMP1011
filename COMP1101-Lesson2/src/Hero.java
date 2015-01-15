
public class Hero {
	//private properties++++++++++++++++++++++++++++++++++++++++++++++++++++++++
	private int strength;
	private int speed;
	private int health;
	
	//public properties+++++++++++++++++++++++++++++++++++++++++++++++++++++++++
	public String name;
	
	
	//get methods +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
	public int getStrength() {
		return strength;
	}

	public int getSpeed() {
		return speed;
	}

	public int getHealth() {
		return health;
	}
	
	//constructor +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
	public Hero(String name){
		this.name = name;
		generateAbilities();
		
	}
	
	private void generateAbilities(){
		this.strength = (int)(Math.random() * 100 +1);
		this.speed = (int)(Math.random() * 100 +1);
		this.health = (int)(Math.random() * 100 +1);
	}
	//public methods ++++++++++++++++++++++++++++++++++++++++++++++++++
	public void showAbilities(){
		System.out.println("+++++++++++++++++++");
		System.out.println("Strength: " + this.strength);
		System.out.println("Speed: " + this.speed);
		System.out.println("Health: " + this.health);
		System.out.println("+++++++++++++++++++");
		
	}
	
	public void fight(){
		System.out.println(this.name + " is fighting!");
	}
	
	public void run(){
		System.out.println(this.name + " is running!");	
	}


}
