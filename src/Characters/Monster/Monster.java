package Characters.Monster;

public class Monster {
	private double damage;
	private double armorPenPercent; // armor pens works as so: (for every amount of damage, the penetration value is a certain percentage of that added on)
	private int itemDrop; // drops are inside an array, so we call a number instead of an object
	private double itemDropChance; // ex. (30% = 30.0)
	private int health;
	
	// constructor method
	
	public Monster(double dmg, double armPP, int itmDrp, 
				   double itmDrpChnc, int hlth) {
		damage = dmg;
		armorPenPercent = armPP;
		itemDrop = itmDrp;
		itemDropChance = itmDrpChnc;
		health = hlth;
	}
	
	public double calculatePowerLevel()
	{
		return ((damage + armorPenPercent) * health);
	}
	
	
}
