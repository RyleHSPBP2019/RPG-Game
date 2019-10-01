package Items.Clothes;

import enums.ArmorStyle;
import enums.Material;
import enums.Rarity;

public class Helmate extends Clothes {
	double armor;
	double helmateMod = .25;
	public Helmate() {
		
	}

	public Helmate(ArmorStyle Type, Material Material , int Quality) {
		super(Type, Material, Quality);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void totalArmor() {
		armor = (armorValue()*helmateMod);
		
	}

}
