package Main;

import java.applet.Applet;
import java.awt.*;




	
public class GameMain extends Applet
{
	
	Frame f;
	public void init() {
	f = new Frames("Game Title");
	f.setSize(1920, 1080);
	f.setVisible(true);
	}
	public void start() {
	f.setVisible(true);
	}
	public void stop() {
	f.setVisible(false);
	}
	public void paint(Graphics g) {
	g.drawString("Welcome to te game", 50, 90);
	}

	
}

