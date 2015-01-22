
public class Project {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Strongman bigMan = new Strongman ("Big Man");
		bigMan.fight();
		bigMan.run();
		bigMan.showAbilities();
		
		
		
		Villan villan = new Villan("Sly Man");
		villan.run();
		villan.steals();
		villan.showAbilities();
		
		
		Vigilante vigilante = new Vigilante("Ms. Savage");
		vigilante.run();
		vigilante.steals();
		vigilante.dealsJustice();
		vigilante.showAbilities();
		
	}

}
