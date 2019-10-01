package Characters.Monster;

import java.util.Random;

public class randomMonster {
	public void run()
	{	
	Random rand = new Random();
	double avgStr[] = new double[16];
	Wolf wolves[] = new Wolf[100];
	for (int i = 0; i < 100; i++) 
	{
		double dmg, armPP;
		int drop, hp;
		dmg = rand.nextInt(32) + rand.nextDouble();
		armPP = rand.nextInt(32) + rand.nextDouble();
		drop = rand.nextInt(32);
		hp = rand.nextInt(32);
		wolves[i] = new Wolf(dmg, armPP, drop, hp);
		avgStr[1] += wolves[i].getPowerLevel();
	}
	}
}
