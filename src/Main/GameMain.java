package Main;

import java.applet.Applet;
import java.awt.Button;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import enums.Rooms;




	
public class GameMain extends Applet implements ActionListener
{
	Random rand = new Random();
	// all buttons
	Button confirm = new Button("Confirm");
	Button easy = new Button("Easy");
	Button medium = new Button("Medium");
	Button hard = new Button("Hard");
	Button shopHelmet1 = new Button();
	Button shopHelmet2 = new Button();
	Button shopChestplate1 = new Button();
	Button shopChestplate2 = new Button();
	Button shopLeggings1 = new Button();
	Button shopLeggings2 = new Button();
	Button shopBoots1 = new Button();
	Button shopBoots2 = new Button();
	Button shopGauntlets1 = new Button();
	Button shopGauntlets2 = new Button();
	Button shopWeapon1 = new Button();
	Button shopWeapon2 = new Button();
	Button shopRangeWeapon = new Button();
	Button shopDamagePotion1 = new Button();
	Button shopDamagePotion2 = new Button();
	Button shopHealthPotion1 = new Button();
	Button shopHealthPotion2 = new Button();
	Button choice1 = new Button();
	Button choice2 = new Button();
	int cChance = 100,eChance = 35,sChance = 8;
    static Frame f = new Frame("Game");
    static GameMain ex = new GameMain();  


	public void init()  
	   {  
	      add(easy); 
	      easy.addActionListener(this);
	      add(medium); 
	      medium.addActionListener(this);
	      add(hard);
	      hard.addActionListener(this);
	      add(confirm);
	      confirm.addActionListener(this);
	      
	    }  
	  public Dimension preferredSize()  
	   {  
	      return new Dimension(1920,1080);  
	   }  
	  @SuppressWarnings("deprecation")
	public static void main(String [] args)  
	   {  
	      ex.init();  
	      f.add("Center", ex);  
	      f.pack();  
	      f.show();  
	    }
	  public void paint(Graphics g)
	  {
		  g.drawString(Globals.output, 430, 40);
	  }
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		if(e.getSource() == easy)
		{
			Globals.output = "You have chosen easy";
			Globals.difficulty = 1;
			repaint();
		}
		else if(e.getSource() == medium)
		{
			Globals.output = "You have chosen medium";
			Globals.difficulty = 2;
			repaint();
		}
		else if(e.getSource() == hard)
		{
			Globals.output = "You have chosen hard";
			Globals.difficulty = 3;
			repaint();
		}
		else if(e.getSource() == confirm)
		{
			f.remove(hard);
			f.remove(easy);
			f.remove(medium);
			f.remove(confirm);
		}
	}
	public void pickRoom()
	{
		int x = rand.nextInt(100);

		
		if (x < cChance)
		{
			
			cChance-=5;
			eChance+=3;
			sChance+=2;
		}
		else if (x < eChance)
		{
			eChance-=3;
			sChance+=1;
			cChance+=2;

		}
		else if (x<sChance)
		{
			sChance-=3;
			eChance+=2;
			cChance+=1;

		}
	}
}

