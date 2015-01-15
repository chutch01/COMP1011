
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
		
	}
	
	public void fight(){
		
	}
	
	public void run(){
		
	}


}
