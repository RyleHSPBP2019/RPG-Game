package Characters.Monster;

public abstract class Monster {
	private double damage;
	private double armorPenPercent; // armor pens works as so: (for every amount of damage, the penetration value is a certain percentage of that added on)
	private int itemDrop; // drops are inside an array, so we call a number instead of an object
	private double itemDropChance; // ex. (30% = 30.0)
	private double spawnRate; // this is also a percentage value (30% = 30.0)
	private int health;
	
	// constructor method
	
	public Monster(double dmg, double armPP, int itmDrp, 
				   double itmDrpChnc, double spwnR, int hlth) {
		damage = dmg;
		armorPenPercent = armPP;
		itemDrop = itmDrp;
		itemDropChance = itmDrpChnc;
		spawnRate = spwnR;
		health = hlth;
		
	}
	public int calculateStr()
	{
		return (int) ((damage + armorPenPercent) * health);
	}
	
	public abstract int calculateSpawn(int roomNumber, int toughNum, int difficulty);
	
}
