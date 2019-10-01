package Characters.Monster;

public class Monster {
	private double damage;
	private double armorPenPercent; // armor pens works as so: (for every amount of damage, the penetration value is a certain percentage of that added on)
	private int itemDrop; // drops are inside an array, so we call a number instead of an object
	private int health;
	
	// constructor method
	
	public Monster(double dmg, double armPP, int itmDrp, 
				   int hlth) {
		damage = dmg;
		armorPenPercent = armPP;
		itemDrop = itmDrp;
		health = hlth;
	}
	
	public double getPowerLevel()
	{
		return ((damage + armorPenPercent) * health);
	}
	
	
}
