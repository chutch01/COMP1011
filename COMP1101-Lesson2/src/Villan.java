
public class Villan extends Hero {

	//constructor +++++++++++++++++++++++++++++++++++++++
	public Villan(String name) {
		super(name);
	
		
	
	}
	//public methods++++++++++++++++++++++++++++++++++++++
	public void steals(){
		System.out.println(this.name + " stole a thing!");
	}
	
	public void kill(){
		System.out.println(this.name + " killed someone! OH MY GOD!");
	}
}
