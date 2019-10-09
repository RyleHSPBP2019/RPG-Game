package Main;

import java.applet.Applet;
import java.awt.Button;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;




	
public class GameMain extends Applet implements ActionListener
{
	Button easy = new Button("Easy");
	Button medium = new Button("Medium");
	Button hard = new Button("Hard");
	public void init()  
	   {  
	      add(easy); 
	      easy.addActionListener(this);
	      add(medium); 
	      medium.addActionListener(this);
	      add(hard);
	      hard.addActionListener(this);
	      
	    }  
	  public Dimension preferredSize()  
	   {  
	      return new Dimension(300,100);  
	   }  
	  @SuppressWarnings("deprecation")
	public static void main(String [] args)  
	   {  
	      Frame f = new Frame("Button");  
	      GameMain ex = new GameMain();  
	      ex.init();  
	      f.add("Center", ex);  
	      f.pack();  
	      f.show();  
	    }
	  public void paint(Graphics g)
	  {
		  g.drawString(Globals.output, 10, 10);
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
		
	}
	  
	

	
}

