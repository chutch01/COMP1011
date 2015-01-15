
public class Speedster extends Hero {
	//constructor+++++++++++++++++++++++++++++
	public Speedster(String name) {
		super(name);
		// TODO Auto-generated constructor stub
		this.boostSpeed();
	}
	
	//private methods +++++++++++++++++++++++++++
	private void boostSpeed(){
		this.speed += 50;
		if(this.speed > 100){
			this.speed = 100;
		}
	}

}
