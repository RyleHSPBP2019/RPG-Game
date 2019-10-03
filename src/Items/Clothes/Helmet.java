package Items.Clothes;

import enums.ArmorStyle;
import enums.ClothingMaterials;

public class Helmet extends Clothes {
	double armor;
	double helmateMod = .25;
	public Helmet() {
		
	}

	public Helmet(ArmorStyle Type, ClothingMaterials Material , int Quality) {
		super(Type, Material, Quality);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void totalArmor() {
		armor = (armorValue()*helmateMod);
		
	}

}
