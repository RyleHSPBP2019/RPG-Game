package Characters.Monster;

public class Wolf extends Monster {
	
	public Wolf(double dmg, double armPP, int itmDrp, int hlth) {
		super(dmg, armPP, itmDrp, hlth);
		dmg = 10.0;
		armPP = 10.0;
		itmDrp = 0;
		hlth = 100;
	}
	
	public void pounce() { //slow movement or reduce armor
		
	}
	
	public void slashAttack() { // main attack
		
	}
	
}
