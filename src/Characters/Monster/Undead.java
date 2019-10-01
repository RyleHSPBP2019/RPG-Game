package Characters.Monster;

public class Undead extends Monster {

	public Undead(double dmg, double armPP, int itmDrp, double itmDrpChnc, int hlth) {
		super(dmg, armPP, itmDrp, itmDrpChnc, hlth);
		dmg = 20.0;
		armPP = 14.0;
		itmDrp = 0;
		itmDrpChnc = 30.0;
		hlth = 200;
	}
	
	public void bite() { //poison attack damage
		
	}
	
	public void smack() { //main attack
		
	}
	

}
