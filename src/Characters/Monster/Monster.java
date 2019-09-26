package Characters.Monster;

public class Monster {
	private double damage;
	private double armorPenPercent; // armor pens works as so: (for every amount of damage, the penetration value is a certain percentage of that added on)
	private int itemDrop; // drops are inside an array, so we call a number instead of an object
	private double itemDropChance; // ex. (30% = 30.0)
	private double spawnRate;
	private int health;
	
	// constructor methods
	
	public Monster() {
		damage = 5.0;
		armorPenPercent = 10.0;
		itemDrop = 0;
		itemDropChance = 30.0;
		spawnRate = 1.0;
		health = 100;
	}
	
	public Monster(double dmg, double armPP, int itmDrp, 
				   double itmDrpChnc, double spwnR, int hlth, String typ) {
		damage = dmg;
		armorPenPercent = armPP;
		itemDrop = itmDrp;
		itemDropChance = itmDrpChnc;
		spawnRate = spwnR;
		health = hlth;
	}

}
