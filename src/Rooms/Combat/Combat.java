package Rooms.Combat;

public class Combat {

	public Combat() {
		
	}
	
	public int calculateSpawn(int roomNumber, int toughNum, int difficulty) {
		int randNum = (int)Math.random() * 10;
		double roomStrength = (100.0)/(1 + difficulty * Math.pow(Math.E, -0.2 * roomNumber + 1.7));
		double strengthRoll = randNum + roomStrength;
		// if statement here once done
		return 0;
	}

}
