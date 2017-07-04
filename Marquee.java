// write well come to CMS in marquee

import java.awt.*;
import java.applet.*;

public class SimpleBanner extends Applet implements Runnable{

	String msg = "Well Come To CMS";
	Thread t = null;
	int state;
	volatile boolean stopFlag;

	//initialize thread
	public void init(){

	setBackground(Color.cyan);
	setBackground(Color.red);

	}
//start thread
public void start() {

	t = new Thread(this);
	stopFlag = false;
	t.start();



	}

//Run the banner
public void run(){

	for( ; ; ){
	try{
	repaint();
	Thread.sleep(250);
	if(stopFlag)
	break;
	}
	}
	}







}
