package Main;

import Items.Clothes.Boots;
import Items.Clothes.Chestplate;
import Items.Clothes.Gauntlets;
import Items.Clothes.Helmet;
import Items.Clothes.Leggings;
import Items.Weapons.Weapon;

public class Globals {
	public static int difficulty;
	public static int roomNumber;
	public static String output = "Welcome to the game, please select your diffiulty";
	public static Boots[]  shopBoots = new Boots[2];
	public static Gauntlets[] shopGauntlets = new Gauntlets[2];
	public static Leggings[] shopLeggings = new Leggings[2];
	public static Chestplate[] shopChestplates = new Chestplate[2];
	public static Helmet[] shopHelmet = new Helmet[2];
	public static Weapon[] shopweapons = new Weapon[2];
	public static Weapon[] rangedWeapon = new Weapon[2];
	/*public static Potion[] shopHealthPots = new Potion[2];
	public static Potion[] shopDamagePots = new Potion[2];*/

	public static String[] shop = new String[18];
	
	public static double findClosest(double arr[], double target) 
    { 
        int n = arr.length; 
  
        // Corner cases 
        if (target <= arr[0]) 
            return arr[0]; 
        if (target >= arr[n - 1]) 
            return arr[n - 1]; 
  
        // Doing binary search  
        int i = 0, j = n, mid = 0; 
        while (i < j) { 
            mid = (i + j) / 2; 
  
            if (arr[mid] == target) 
                return arr[mid]; 
  
            /* If target is less than array element, 
               then search in left */
            if (target < arr[mid]) { 
         
                // If target is greater than previous 
                // to mid, return closest of two 
                if (mid > 0 && target > arr[mid - 1])  
                    return getClosest(arr[mid - 1],  
                                  arr[mid], target); 
                  
                /* Repeat for left half */
                j = mid;               
            } 
  
            // If target is greater than mid 
            else { 
                if (mid < n-1 && target < arr[mid + 1])  
                    return getClosest(arr[mid],  
                          arr[mid + 1], target);                 
                i = mid + 1; // update i 
            } 
        } 
  
        // Only single element left after search 
        return arr[mid]; 
    } 
  
    // Method to compare which one is the more close 
    // We find the closest by taking the difference 
    //  between the target and both values. It assumes 
    // that val2 is greater than val1 and target lies 
    // between these two. 
    public static double getClosest(double val1, double val2,  
                                         double target) 
    { 
        if (target - val1 >= val2 - target)  
            return val2;         
        else 
            return val1;         
    } 
	
}
