//simple applet program

import java.awt.*;
import java.applet.*;

public class SimpleApplet extends Applet
{
 String me="Sameena";
public void init(){

	setBackground(Color.black);
	
	setForeground(Color.red);	 
	me = "bkjajkhgklgjl;kgl";	


}
	public void start()
	{
	}
	 	public void paint(Graphics sam)
	{
	 sam.drawString(me,20,20);   
	} 

}
