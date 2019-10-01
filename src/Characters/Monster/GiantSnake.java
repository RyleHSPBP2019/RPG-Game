package Characters.Monster;

public class GiantSnake extends Monster {

	public GiantSnake(double dmg, double armPP, int itmDrp, int hlth) {
		super(dmg, armPP, itmDrp, hlth);
		dmg = 50.0;
		armPP = 26.0;
		itmDrp = 0;
		hlth = 500;
	}
	
	public void trap() { //reduce armor value or something
		
	}
	
	public void pierce() {	//poison attack
		
	}

}
