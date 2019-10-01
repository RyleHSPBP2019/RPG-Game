package Characters.Monster;

public class Spider extends Monster {

	public Spider(double dmg, double armPP, int itmDrp, double itmDrpChnc, int hlth) {
		super(dmg, armPP, itmDrp, itmDrpChnc, hlth);
		dmg = 15.0;
		armPP = 12.0;
		itmDrp = 0;
		itmDrpChnc = 30.0;
		hlth = 150;
	}
	
	public void webSling() { //trap attack
		
	}
	
	public void pierce() { //main attack
		
	}

}
