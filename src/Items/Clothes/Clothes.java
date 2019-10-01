package Items.Clothes;

import enums.ArmorStyle;
import enums.Material;
import enums.Rarity;

public abstract class Clothes {
	ArmorStyle type;
	Material material;
	Rarity rarity;
	int quality,armorValue,materialValue,typeValue, movementMod;
	
	public Clothes()
	{
		type = ArmorStyle.chain;
		material = Material.cloth;
		quality = 5;
		armorValue();
		rarity = calculateRarity();

		
	}
	public Clothes(ArmorStyle Type, Material Material, int Quality)
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
		case cloth:
			materialValue = 1;
			break;
		case leather:
			materialValue = 2;
			break;
		case iron:
			materialValue = 3;
			break;
		case steel:
			materialValue = 4;
			break;
		case adamantine:
			materialValue = 5;
			break;
		}
		armorValue = (typeValue+materialValue)*quality;

		return (typeValue+materialValue)*quality;
	}
	public Rarity calculateRarity()
	{
		Rarity value = Rarity.common;
		if (armorValue < 25)
			value = Rarity.common;
		else if(armorValue < 60)
			value = Rarity.uncommon;
		else if(armorValue < 80)
			value = Rarity.rare;
		else if (armorValue < 100)
			value = Rarity.epic;
		else if (armorValue < 120)
			value = Rarity.lengendary;
		else
			value = Rarity.godLike;
		
		return value;
	}
	public abstract void totalArmor();
}
