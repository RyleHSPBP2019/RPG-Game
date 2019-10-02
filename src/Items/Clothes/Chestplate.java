package Items.Clothes;

import enums.ArmorStyle;
import enums.Material;
import enums.Rarity;

public abstract class Chestplate extends Clothes {

	public Chestplate() {

	}

	public Chestplate(ArmorStyle Type, Material Material, int Quality) {
		super(Type, Material, Quality);

	}

}
