package Main;
import Items.Clothes.*;
import Items.Weapons.Weapon;

public class Player {
	// player armor
	private Boots boots;
	private Chestplate chestplate;
	private Gauntlets gauntlets;
	private Helmet helmet;
	private Leggings leggings;
	
	// player weapon
	private Weapon weapon;
	
	// player values
	private int health;
	private int maxHealth;
	private int armorAmount;
	private double damage;
	private int moneyAmount;
	
	// constructor methods
	
	public Player() {	// default player makes everything default
		maxHealth = 100;
		health = maxHealth;
		moneyAmount = 0;
		armorAmount = (boots.armorValue() + chestplate.armorValue() + gauntlets.armorValue() + helmet.armorValue() + leggings.armorValue());
		damage = weapon.getDamage();
		// weapon = #finish here keeton
	}
	
	
	// adjustment methods
	
	public void heal(int amount) {
		if (health != maxHealth) {
			int healAmountNeeded = maxHealth - health;
			if (healAmountNeeded >= amount) 
				health += amount;
			else if (healAmountNeeded < amount) {
				amount = healAmountNeeded;
				health += amount;
			}
		}
	}
	
	public void changeWeapon(Weapon newWeapon) {
		weapon = newWeapon;
	}
	
	public void changeMaxHealthAmount(int amount) { // this is a character setting method, meaning health will be reset as well
		maxHealth = amount;
		health = maxHealth;
	}
	
	public void changeBoots(Boots armorBoots) {
		boots = armorBoots;
	}
	
	public void changeChestplate(Chestplate armorChestplate) {
		chestplate = armorChestplate;
	}
	
	public void changeGauntlets(Gauntlets armorGauntlets) {
		gauntlets = armorGauntlets;
	}
	
	public void changeHelmet(Helmet armorHelmet) {
		helmet = armorHelmet;
	}
	
	public void changeLeggings(Leggings armorLeggings) {
		leggings = armorLeggings;
	}
}