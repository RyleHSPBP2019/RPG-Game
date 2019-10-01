package Characters.Monster;

public class Wolf extends Monster {
	
	public Wolf(double dmg, double armPP, int itmDrp, double itmDrpChnc, int hlth) {
		super(dmg, armPP, itmDrp, itmDrpChnc, hlth);
		dmg = 10.0;
		armPP = 10.0;
		itmDrp = 0;
		itmDrpChnc = 30.0;
		hlth = 100;
	}
	
	public void pounce() { //slow movement or reduce armor
		
	}
	
	public void slashAttack() { // main attack
		
	}
	

}
