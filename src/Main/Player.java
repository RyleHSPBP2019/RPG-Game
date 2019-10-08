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
	private int armorAmount;
	private double damage;
	
	// constructor methods
	
	public Player() {	// default player makes everything default
		health = 100;
		damage = weapon.getDamage();
		
	}
	
	
	// adjustment methods
	
	public void heal(int amount) {
		health += amount;
	}
	
}