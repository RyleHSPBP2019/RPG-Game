package Items.Weapons;
import enums.Rarity;
import enums.WeaponMaterials;
import enums.WeaponType;

public class Weapon {
	private double damage;
	private double speed;
	private double range;
	
	private double sellValue;
	private double purchaseValue;
	
	private WeaponMaterials material;
	private Rarity rarity;
	private WeaponType type;
	
	public Weapon() { // basic constructor
		
	}
	
	public Weapon(double damage, WeaponMaterials material, WeaponType type, double speed, double range) {
		
	}
	
	public void calculateValue(WeaponMaterials material, Rarity rarity, WeaponType type) {
		int x, y, z; // value holders for amount;
		
		switch (material) {
			case Wood:
				
				break;
			case Copper:
				
				break;
			case Bronze:
				
				break;
			case Iron:
				
				break;
			case Steel:
				
				break;
			case Titanium:
				
				break;
			case Adamantine:
				
				break;
		}
		
		switch (rarity) {
			case Common:
				
				break;
			case Uncommon:
				
				break;
			case GodLike:
				
				break;
			case Lengendary:
				
				break;
			case Rare:
				
				break;
			case Epic:
				
				break;
		}
		
		switch (type) {
			case Dagger:
				
				break;
			case Sword:
				
				break;
			case Axe:
				
				break;
			case Spear:
				
				break;
			case Mace:
				
				break;
			case Club:
				
				break;
			case Bow:
				
				break;
			case Crossbow:
				
				break;
		}
		// value setting here
		
		
	}
	
	public void createWeapon() {
		
	}
	
	public double getDamage() {
		return damage;
	}

}
