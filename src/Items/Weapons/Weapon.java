package Items.Weapons;
import enums.Rarity;
import enums.WeaponMaterials;
import enums.WeaponType;

public class Weapon {
	private double damage;
	private double speed;
	private boolean range;
	
	private double sellValue;
	private double purchaseValue;
	
	private WeaponMaterials material;
	private Rarity rarity;
	private WeaponType type;
	
	public Weapon(double Damage, WeaponMaterials Material, WeaponType Type, double Speed, boolean Range) { // constructor method
		damage = Damage;
		material = Material;
		type = Type;
		speed = Speed;
		range = Range;
	}
	
	public Rarity calculateRarity(WeaponMaterials material) {
		switch (material) {
			case Wood:
				rarity = Rarity.Common;
				break;
			case Copper:
				rarity = Rarity.Uncommon;
				break;
			case Bronze:
				rarity = Rarity.Uncommon;
				break;
			case Iron:
				rarity = Rarity.Rare;
				break;
			case Steel:
				rarity = Rarity.Epic;
				break;
			case Titanium:
				rarity = Rarity.Lengendary;
				break;
			case Adamantine:
				rarity = Rarity.Godlike;
				break;
		}
		
		return rarity;
	}
	
	public void calculateValue(WeaponMaterials material, Rarity rarity, WeaponType type) {
		int x = 0, y = 0, z = 0; // value holders for amount;
		
		switch (material) {
			case Wood:
				int temp = (int)(Math.random() * 10);
				x = temp;
				break;
			case Copper:
				int temp1 = (int)(Math.random() * 10);
				x = 10 + temp1;
				break;
			case Bronze:
				int temp2 = (int)(Math.random() * 10);
				x = 15 + temp2;
				break;
			case Iron:
				int temp3 = (int)(Math.random() * 10);
				x = 20 + temp3;
				break;
			case Steel:
				int temp4 = (int)(Math.random() * 10);
				x = 25 + temp4;
				break;
			case Titanium:
				int temp5 = (int)(Math.random() * 10);
				x = 30 + temp5;
				break;
			case Adamantine:
				int temp6 = (int)(Math.random() * 10);
				x = 35 + temp6;
				break;
		}
		
		switch (rarity) {
			case Common:
				int temp = (int)(Math.random() * 20);
				y = temp;
				break;
			case Uncommon:
				int temp1 = (int)(Math.random() * 20);
				y = 20 + temp1;
				break;
			case Rare:
				int temp2 = (int)(Math.random() * 20);
				y = 40 + temp2;
				break;
			case Epic:
				int temp3 = (int)(Math.random() * 20);
				y = 60 + temp3;
				break;
			case Lengendary:
				int temp4 = (int)(Math.random() * 20);
				y = 80 + temp4;
				break;
			case Godlike:
				int temp5 = (int)(Math.random() * 20);
				y = 100 + temp5;
				break;
		}
		
		switch (type) {
			case Dagger:
				int temp = (int)(Math.random() * 5);
				z = temp;
				break;
			case Sword:
				int temp1 = (int)(Math.random() * 5);
				z = 1 + temp1;
				break;
			case Axe:
				int temp2 = (int)(Math.random() * 5);
				z = 2 + temp2;
				break;
			case Spear:
				int temp3 = (int)(Math.random() * 5);
				z = 3 + temp3;
				break;
			case Mace:
				int temp4 = (int)(Math.random() * 5);
				z = 4 + temp4;
				break;
			case Club:
				int temp5 = (int)(Math.random() * 5);
				z = 5 + temp5;
				break;
			case Bow:
				int temp6 = (int)(Math.random() * 5);
				z = 6 + temp6;
				break;
			case Crossbow:
				int temp7 = (int)(Math.random() * 5);
				z = 7 + temp7;
				break;
		}
		// value setting here
		purchaseValue = ((0.8 * z) + (x + y));
		sellValue = ((x + y) - z);
	}
	
	public double getDamage() {
		return damage;
	}
	
	public boolean isRanged() {
		return range;
	}
	
	public double getSpeed() {
		return speed;
	}

}
