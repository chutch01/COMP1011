
public class Strongman extends Hero {

	public Strongman(String name) {
		super(name);
		// TODO Auto-generated constructor stub
		this.boostStrength();
	}
	
	public void boostStrength(){
		this.strength += 50;
		if(this.strength > 100){
			this.strength = 100;
		}
	}

}
