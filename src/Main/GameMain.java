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
	public void init()  
	   {  
	      add(easy); 
	      easy.addActionListener(this);
	      add(new Button("Medium")); 
	      add(new Button("Hard"));  
	      
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
		  g.drawString("Welcome to the game, choose you difficulty", 10, 10);
	  }
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		if(e.getSource() == easy)
		{
			
		}
		
	}
	  
	

	
}

