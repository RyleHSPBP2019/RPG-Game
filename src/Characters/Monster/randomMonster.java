package Characters.Monster;

public class randomMonster {
	int avgStr[] = new int[16];
	Wolf wolves[] = new Wolf[100];
	for (int i =0; i < 101; i++)
	{
		double dmg, armPP;
		int drop, hp;
		wolves[i] = new Wolf(dmg, armPP,drop,hp);
	}

}
