package Characters.Monster;

import java.util.Random;

import Main.Globals;

public class randomMonster {
	public static double avgStr[] = new double[10];
	static Wolf wolves[] = new Wolf[100];
	static Spider spiders[] = new Spider[100];
	static Undead theUndead[] = new Undead[100];
	static Wraith wraiths[] = new Wraith[100];
	static Orc orcs[] = new Orc[100];
	static Witch witches[] = new Witch[100];
	static Werewolf werewolves[] = new Werewolf[100];
	static Vampire vampires[] = new Vampire[100];
	static GiantSnake giantSnakes[] = new GiantSnake[100];
	static Dragon dragons[] = new Dragon[100];
	static double wolvesStr[] = new double[100];
	static double spidersStr[] = new double[100];
	static double theUndeadStr[] = new double[100];
	static double wraithsStr[] = new double[100];
	static double orcsStr[] = new double[100];
	static double witchesStr[] = new double[100];
	static double werewolvesStr[] = new double[100];
	static double vampiresStr[] = new double[100];
	static double giantSnakesStr[] = new double[100];
	static double dragonsStr[] = new double[100];


	public void run()
	{	
	Random rand = new Random();
	int wolfMinPen = 10, wolfMaxPen = 15;
	int wolfMinDmg = 10, wolfMaxDmg = 20;
	int wolfMinDrp = 0, wolfMaxDrp = 0;
	int wolfMinHp = 100, wolfMaxHp = 190;
	int spiderMinPen = 12, spiderMaxPen = 18;
	int spiderMinDmg = 15, spiderMaxDmg = 30;
	int spiderMinDrp = 0, spiderMaxDrp = 0;
	int spiderMinHp = 150, spiderMaxHp = 285;
	int undeadMinPen = 14, undeadMaxPen = 21;
	int undeadMinDmg = 20, undeadMaxDmg = 40;
	int undeadMinDrp = 0, undeadMaxDrp = 0;
	int undeadMinHp = 200, undeadMaxHp = 380;
	int wraithMinPen = 16, wraithMaxPen = 24;
	int wraithMinDmg = 25, wraithMaxDmg = 50;
	int wraithMinDrp = 0, wraithMaxDrp = 0;
	int wraithMinHp = 250, wraithMaxHp = 475;
	int orcMinPen = 18, orcMaxPen = 27;
	int orcMinDmg = 30, orcMaxDmg = 60;
	int orcMinDrp = 0, orcMaxDrp = 0;
	int orcMinHp = 300, orcMaxHp = 570;
	int witchMinPen = 20, witchMaxPen = 30;
	int witchMinDmg = 35, witchMaxDmg = 70;
	int witchMinDrp = 0, witchMaxDrp = 0;
	int witchMinHp = 350, witchMaxHp = 665;
	int werewolfMinPen = 22, werewolfMaxPen = 33;
	int werewolfMinDmg = 40, werewolfMaxDmg = 80;
	int werewolfMinDrp = 0, werewolfMaxDrp = 0;
	int werewolfMinHp = 400, werewolfMaxHp = 760;
	int vampireMinPen = 24, vampireMaxPen = 36;
	int vampireMinDmg = 45, vampireMaxDmg = 90;
	int vampireMinDrp = 0, vampireMaxDrp = 0;
	int vampireMinHp = 450, vampireMaxHp = 855;
	int giantSnakeMinPen = 26, giantSnakeMaxPen = 34;
	int giantSnakeMinDmg = 50, giantSnakeMaxDmg = 100;
	int giantSnakeMinDrp = 0, giantSnakeMaxDrp = 0;
	int giantSnakeMinHp = 500, giantSnakeMaxHp = 950;
	int dragonMinPen = 28, dragonMaxPen = 42;
	int dragonMinDmg = 55, dragonMaxDmg = 110;
	int dragonMinDrp = 0, dragonMaxDrp = 0;
	int dragonMinHp = 550, dragonMaxHp = 1045;


	 
	for (int i = 0; i < 100; i++) 
		{
			double dmg, armPP;
			int drop, hp;
			dmg = rand.nextInt(wolfMaxDmg-wolfMinDmg) + rand.nextDouble() + wolfMinDmg;
			armPP = rand.nextInt(wolfMaxPen-wolfMinPen) + rand.nextDouble() + wolfMinPen;
			drop = rand.nextInt(wolfMaxDrp-wolfMinDrp) + wolfMinDrp;
			hp = rand.nextInt(wolfMaxHp-wolfMinHp) + wolfMinHp;
			wolves[i] = new Wolf(dmg, armPP, drop, hp);
			avgStr[0] += wolves[i].getPowerLevel();
			wolvesStr[i] = wolves[i].getPowerLevel();

		}
	avgStr[0]/=100;
	
	for (int i = 0; i < 100; i++) 
		{
			double dmg, armPP;
			int drop, hp;
			dmg = rand.nextInt(spiderMaxDmg-spiderMinDmg) + rand.nextDouble() + spiderMinDmg;
			armPP = rand.nextInt(spiderMaxPen-spiderMinPen) + rand.nextDouble() + spiderMinPen;
			drop = rand.nextInt(spiderMaxDrp-spiderMinDrp) + spiderMinDrp;
			hp = rand.nextInt(spiderMaxHp-spiderMinHp) + spiderMinHp;
			spiders[i] = new Spider(dmg, armPP, drop, hp);
			avgStr[1] += spiders[i].getPowerLevel();
			spidersStr[i] = spiders[i].getPowerLevel();

		}
	avgStr[1]/=100;
	
	for (int i = 0; i < 100; i++) 
		{
			double dmg, armPP;
			int drop, hp;
			dmg = rand.nextInt(undeadMaxDmg-undeadMinDmg) + rand.nextDouble() + undeadMinDmg;
			armPP = rand.nextInt(undeadMaxPen-undeadMinPen) + rand.nextDouble() + undeadMinPen;
			drop = rand.nextInt(undeadMaxDrp-undeadMinDrp) + undeadMinDrp;
			hp = rand.nextInt(undeadMaxHp-undeadMinHp) + undeadMinHp;
			theUndead[i] = new Undead(dmg, armPP, drop, hp);
			avgStr[2] += theUndead[i].getPowerLevel();
			theUndeadStr[i] = theUndead[i].getPowerLevel();

		}
	avgStr[2]/=100;
	
	for (int i = 0; i < 100; i++) 
		{
			double dmg, armPP;
			int drop, hp;
			dmg = rand.nextInt(wraithMaxDmg-wraithMinDmg) + rand.nextDouble() + wraithMinDmg;
			armPP = rand.nextInt(wraithMaxPen-wraithMinPen) + rand.nextDouble() + wraithMinPen;
			drop = rand.nextInt(wraithMaxDrp-wraithMinDrp) + wraithMinDrp;
			hp = rand.nextInt(wraithMaxHp-wraithMinHp) + wraithMinHp;
			wraiths[i] = new Wraith(dmg, armPP, drop, hp);
			avgStr[3] += wraiths[i].getPowerLevel();
			wraithsStr[i] = wraiths[i].getPowerLevel();

		}
	avgStr[3]/=100;
	
	for (int i = 0; i < 100; i++) 
		{
			double dmg, armPP;
			int drop, hp;
			dmg = rand.nextInt(orcMaxDmg-orcMinDmg) + rand.nextDouble() + orcMinDmg;
			armPP = rand.nextInt(orcMaxPen-orcMinPen) + rand.nextDouble() + orcMinPen;
			drop = rand.nextInt(orcMaxDrp-orcMinDrp) + orcMinDrp;
			hp = rand.nextInt(orcMaxHp-orcMinHp) + orcMinHp;
			orcs[i] = new Orc(dmg, armPP, drop, hp);
			avgStr[4] += orcs[i].getPowerLevel();
			orcsStr[i] = orcs[i].getPowerLevel();

		}
	avgStr[4]/=100;
	
	for (int i = 0; i < 100; i++) 
		{
			double dmg, armPP;
			int drop, hp;
			dmg = rand.nextInt(witchMaxDmg-witchMinDmg) + rand.nextDouble() + witchMinDmg;
			armPP = rand.nextInt(witchMaxPen-witchMinPen) + rand.nextDouble() + witchMinPen;
			drop = rand.nextInt(witchMaxDrp-witchMinDrp) + witchMinDrp;
			hp = rand.nextInt(witchMaxHp-witchMinHp) + witchMinHp;
			witches[i] = new Witch(dmg, armPP, drop, hp);
			avgStr[5] += witches[i].getPowerLevel();
			witchesStr[i] = witches[i].getPowerLevel();

		}
	avgStr[5]/=100;
	
	for (int i = 0; i < 100; i++) 
		{
			double dmg, armPP;
			int drop, hp;
			dmg = rand.nextInt(werewolfMaxDmg-werewolfMinDmg) + rand.nextDouble() + werewolfMinDmg;
			armPP = rand.nextInt(werewolfMaxPen-werewolfMinPen) + rand.nextDouble() + werewolfMinPen;
			drop = rand.nextInt(werewolfMaxDrp-werewolfMinDrp) + werewolfMinDrp;
			hp = rand.nextInt(werewolfMaxHp-werewolfMinHp) + werewolfMinHp;
			werewolves[i] = new Werewolf(dmg, armPP, drop, hp);
			avgStr[6] += werewolves[i].getPowerLevel();
			werewolvesStr[i] = werewolves[i].getPowerLevel();

		}
	avgStr[6]/=100;
	
	for (int i = 0; i < 100; i++) 
		{
			double dmg, armPP;
			int drop, hp;
			dmg = rand.nextInt(vampireMaxDmg-vampireMinDmg) + rand.nextDouble() + vampireMinDmg;
			armPP = rand.nextInt(vampireMaxPen-vampireMinPen) + rand.nextDouble() + vampireMinPen;
			drop = rand.nextInt(vampireMaxDrp-vampireMinDrp) + vampireMinDrp;
			hp = rand.nextInt(vampireMaxHp-vampireMinHp) + vampireMinHp;
			vampires[i] = new Vampire(dmg, armPP, drop, hp);
			avgStr[7] += vampires[i].getPowerLevel();
			vampiresStr[i] = vampires[i].getPowerLevel();

		}
	avgStr[7]/=100;
	
	for (int i = 0; i < 100; i++) 
		{
			double dmg, armPP;
			int drop, hp;
			dmg = rand.nextInt(giantSnakeMaxDmg-giantSnakeMinDmg) + rand.nextDouble() + giantSnakeMinDmg;
			armPP = rand.nextInt(giantSnakeMaxPen-giantSnakeMinPen) + rand.nextDouble() + giantSnakeMinPen;
			drop = rand.nextInt(giantSnakeMaxDrp-giantSnakeMinDrp) + giantSnakeMinDrp;
			hp = rand.nextInt(giantSnakeMaxHp-giantSnakeMinHp) + giantSnakeMinHp;
			giantSnakes[i] = new GiantSnake(dmg, armPP, drop, hp);
			avgStr[8] += giantSnakes[i].getPowerLevel();
			giantSnakesStr[i] = giantSnakes[i].getPowerLevel();

		}
	avgStr[8]/=100;
	
	for (int i = 0; i < 100; i++)
		{
			double dmg, armPP;
			int drop, hp;
			dmg = rand.nextInt(dragonMaxDmg-dragonMinDmg) + rand.nextDouble() + dragonMinDmg;
			armPP = rand.nextInt(dragonMaxPen-dragonMinPen) + rand.nextDouble() + dragonMinPen;
			drop = rand.nextInt(dragonMaxDrp-dragonMinDrp) + dragonMinDrp;
			hp = rand.nextInt(dragonMaxHp-dragonMinHp) + dragonMinHp;
			dragons[i] = new Dragon(dmg, armPP, drop, hp);
			avgStr[9] += dragons[i].getPowerLevel();
			dragonsStr[i] = dragons[i].getPowerLevel();
		}
	avgStr[9]/=100;	
	}
	public static Monster pickMonster(int monsterType, double strRoll)
	{
		double index;
		switch(monsterType)
		{
		case 0:
			index=Globals.findClosest(wolvesStr, strRoll);
			for(int i = 0; i < 100; i++)
			{
				if(wolvesStr[i] == index)
					return wolves[i];
			}
			break;
		case 1:
			index=Globals.findClosest(spidersStr, strRoll);
			for(int i = 0; i < 100; i++)
			{
				if(spidersStr[i] == index)
					return spiders[i];
			}
			
			break;
		case 2:
			index=Globals.findClosest(theUndeadStr, strRoll);
			for(int i = 0; i < 100; i++)
			{
				if(theUndeadStr[i] == index)
					return theUndead[i];
			}
			
			break;
		case 3:
			index=Globals.findClosest(wraithsStr, strRoll);
			for(int i = 0; i < 100; i++)
			{
				if(wraithsStr[i] == index)
					return wraiths[i];
			}
			
			break;
		case 4:
			index=Globals.findClosest(orcsStr, strRoll);
			for(int i = 0; i < 100; i++)
			{
				if(orcsStr[i] == index)
					return orcs[i];
			}
			
			break;
		case 5:
			index=Globals.findClosest(witchesStr, strRoll);
			for(int i = 0; i < 100; i++)
			{
				if(witchesStr[i] == index)
					return witches[i];
			}
			
			break;
		case 6:
			index=Globals.findClosest(werewolvesStr, strRoll);
			for(int i = 0; i < 100; i++)
			{
				if(werewolvesStr[i] == index)
					return werewolves[i];
			}
			
			break;
		case 7:
			index=Globals.findClosest(vampiresStr, strRoll);
			for(int i = 0; i < 100; i++)
			{
				if(vampiresStr[i] == index)
					return vampires[i];
			}
			
			break;
		case 8:
			index=Globals.findClosest(giantSnakesStr, strRoll);
			for(int i = 0; i < 100; i++)
			{
				if(giantSnakesStr[i] == index)
					return giantSnakes[i];
			}
			
			break;
		case 9:
			index=Globals.findClosest(dragonsStr, strRoll);
			for(int i = 0; i < 100; i++)
			{
				if(dragonsStr[i] == index)
					return dragons[i];
			}
			
			break;
			
		}
		return null;
	}
}
