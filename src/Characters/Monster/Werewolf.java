package Characters.Monster;

public class Werewolf extends Monster {

	public Werewolf(double dmg, double armPP, int itmDrp, int hlth) {
		super(dmg, armPP, itmDrp, hlth);
		dmg = 40.0;
		armPP = 22.0;
		itmDrp = 0;
		hlth = 400;
	}
	
	public void howl() { //quake in boots - reduce armor value of boots 
		
	}
	
	public void claw() { //main attack
		
	}

}
