package Rooms.Combat;

import java.util.Arrays;

import Characters.Monster.Monster;
import Characters.Monster.randomMonster;
import Main.Globals;

public class Combat {
	Monster Enemy;
	int rNum;
	double monNum;

	public Combat() {
		
	}
	public Combat(int roomNum)
	{
		rNum = roomNum;
		
	}
	public void init()
	{
		
	}
	
	public void calculateSpawn(int roomNumber) {
		int randNum = (int)Math.random() * 10;
		double roomStrength = (100.0)/(1 + Globals.difficulty * Math.pow(Math.E, -0.2 * roomNumber + 1.7));
		double strengthRoll = randNum + roomStrength;
		// if statement here once done
		double[] temp = new double[randomMonster.avgStr.length];
		temp = randomMonster.avgStr;
		Arrays.sort(temp);
		for(int i = 0; i < randomMonster.avgStr.length;i++)
		if(randomMonster.avgStr[i] == Globals.findClosest(temp, strengthRoll))
			Enemy = randomMonster.pickMonster(i, strengthRoll);
			
	}
	
	
	

}
