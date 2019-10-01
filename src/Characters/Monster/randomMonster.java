package Characters.Monster;

import java.util.Random;

public class randomMonster {
	public void run()
	{	
	Random rand = new Random();
	double avgStr[] = new double[16];
	Wolf wolves[] = new Wolf[100];
	int wolfMinPen = 0, wolfMaxPen = 0;
	int wolfMinDmg = 0, wolfMaxDmg = 0;
	int wolfMinDrp = 0, wolfMaxDrp = 0;
	int wolfMinHp = 0, wolfMaxHp = 0;
	for (int i = 0; i < 100; i++) 
		{
			double dmg, armPP;
			int drop, hp;
			dmg = rand.nextInt(wolfMaxDmg-wolfMinDmg) + rand.nextDouble() + wolfMinDmg;
			armPP = rand.nextInt(wolfMaxPen-wolfMinPen) + rand.nextDouble() + wolfMinPen;
			drop = rand.nextInt(wolfMaxDrp-wolfMinDrp) + wolfMinDrp;
			hp = rand.nextInt(wolfMaxHp-wolfMinHp) + wolfMinHp;
			wolves[i] = new Wolf(dmg, armPP, drop, hp);
			avgStr[1] += wolves[i].getPowerLevel();
		}
	avgStr[1]/=100;
	
	}
}
