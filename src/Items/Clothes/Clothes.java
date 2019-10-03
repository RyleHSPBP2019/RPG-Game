package Items.Clothes;

import enums.ArmorStyle;
import enums.ClothingMaterials;
import enums.Rarity;

public abstract class Clothes {
	ArmorStyle type;
	ClothingMaterials material;
	Rarity rarity;
	int quality,armorValue,materialValue,typeValue, movementMod;
	
	public Clothes()
	{
		type = ArmorStyle.chain;
		material = ClothingMaterials.Cloth;
		quality = 5;
		armorValue();
		rarity = calculateRarity();

		
	}
	
	public Clothes(ArmorStyle Type, ClothingMaterials Material, int Quality)
	{
		type = Type;
		material = Material;
		quality = Quality;
		armorValue();
		rarity = calculateRarity();
	}
	
	public int armorValue()
	{
		switch(type)
		{
		case chain:
			typeValue = 3;
			movementMod = 8;
			break;
		case padded:
			typeValue = 2;
			movementMod = 10;
			break;
		case splint:
			typeValue = 6;
			movementMod = 5;
			break;
		case plate:
			typeValue = 8;
			movementMod = 2;
			break;
		}
		switch(material)
		{
		case Cloth:
			materialValue = 1;
			break;
		case Leather:
			materialValue = 2;
			break;
		case Iron:
			materialValue = 3;
			break;
		case Steel:
			materialValue = 4;
			break;
		case Adamantine:
			materialValue = 5;
			break;
		}
		armorValue = (typeValue + materialValue) * quality;

		return (typeValue + materialValue) * quality;
	}
	
	public Rarity calculateRarity()
	{
		Rarity value = Rarity.Common;
		if (armorValue < 25)
			value = Rarity.Common;
		else if(armorValue < 60)
			value = Rarity.Uncommon;
		else if(armorValue < 80)
			value = Rarity.Rare;
		else if (armorValue < 100)
			value = Rarity.Epic;
		else if (armorValue < 120)
			value = Rarity.Lengendary;
		else
			value = Rarity.GodLike;
		
		return value;
	}
	
	public abstract void totalArmor();
}
