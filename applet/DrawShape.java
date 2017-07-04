//java code to draw circle rectangle line etc...

import java.awt.*;
import java.applet.*;

public class DrawShape extends Applet
	{
		public void paint(Graphics g){

		//Draw lines
		g.drawLine(0,0,100,50);
		//Draw rectangle
		g.setColor(Color.red);
		g.drawRect(20,30,400,300);
		//g.fillRect(20,30,400,300);
		g.setColor(Color.green);
		//draw oval

		g.drawOval(10,250,50,50);
		g.fillOval(10,250,50,50);
		g.setColor(Color.pink);
		g.drawOval(90,250,75,50);
		g.fillOval(90,250,75,50);
		//Draw polydoan
		int xpoints[] = {500,200,300};
		int ypoints[] = {200,500,300};
		g.setColor(Color.blue);
		g.drawPolygon(xpoints,ypoints,3);
		g.fillPolygon(xpoints,ypoints,3);
		}


	}
