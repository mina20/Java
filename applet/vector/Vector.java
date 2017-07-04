
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
import java.util.*;
import java.lang.*;

public class Vector extends Applet implements ActionListener{
	double num1,num2,result,angle;
	TextField force1,force2,theta;
	Button submit;
	public void init(){

	force1 = new TextField("Enter Force value 1");
	force2 = new TextField("Enter force value 2");
	theta = new TextField("Enter angle");
	submit= new Button("submit");
	add(force1);
	add(force2);
	add(theta);
	add(submit);
	submit.addActionListener(this);

	}
public void paint(Graphics g){

	g.drawString("Computer generated"+result,20,150);


	}
public void actionPerformed(ActionEvent e){
	if(e.getSource()==submit)
	{
	num1=Double.valueOf(force1.getText());
	num2=Double.valueOf(force2.getText());
	angle=Double.valueOf(theta.getText());
	result=Math.sqrt(num1*num1+num2*num2-(2*num1*num2*Math.cos(angle*(Math.PI/180))));
	}
	repaint();

	}





}

