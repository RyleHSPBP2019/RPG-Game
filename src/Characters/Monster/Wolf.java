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

	@Override
	public int calculateSpawn(int roomNumber, int toughNum, int difficulty) {
		int randNum = (int)Math.random() * 10;
		double roomStrength = (100.0)/(1 + difficulty * Math.pow(Math.E, -0.2 * roomNumber));
		double strengthRoll = randNum * roomStrength;
		// if statement here once done
		return 0;
	}

}
