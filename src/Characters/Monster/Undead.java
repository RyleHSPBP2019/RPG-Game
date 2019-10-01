package Characters.Monster;

public class Undead extends Monster {

	public Undead(double dmg, double armPP, int itmDrp, int hlth) {
		super(dmg, armPP, itmDrp, hlth);
		dmg = 20.0;
		armPP = 14.0;
		itmDrp = 0;
		hlth = 200;
	}
	
	public void bite() { //poison attack damage
		
	}
	
	public void smack() { //main attack
		
	}
	
}
