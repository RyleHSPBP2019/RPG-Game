package Characters.Monster;

public class Wolf extends Monster {
	
	public Wolf(double dmg, double armPP, int itmDrp, double itmDrpChnc, double spwnR, int hlth) {
		super(dmg, armPP, itmDrp, itmDrpChnc, spwnR, hlth);
		dmg = 10.0;
		armPP = 10.0;
		itmDrp = 0;
		itmDrpChnc = 30.0;
		spwnR = 0;
		hlth = 100;
	}

}
