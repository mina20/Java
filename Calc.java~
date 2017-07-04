//

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Calc extends Applet implements ActionListener{

	float num1,num2,op;
	Button add,sub,mul,div;
	TextField num11,num22,answer;
	public void init(){
	add=new Button("+");
	sub=new Button("-");
	mul=new Button("*");
	div=new Button("/");
	num11=new TextField("Number1");
	num22=new TextField("Number2");
	answer=new TextField("answer");

	add(add);
	add(sub);
	add(mul);
	add(div);
	add(num11);
	add(num22);
	add(answer);

	 add.addActionListener(this);
	 sub.addActionListener(this);
	 mul.addActionListener(this);
	 div.addActionListener(this);
	}
	public void paint(Graphics g){

	answer.setText(Float.toString(op));
	}

public void actionPerformed(ActionEvent evt){

	num1=Float.parseFloat(num11.getText());
	num2=Float.parseFloat(num22.getText());
	if(evt.getSource()==add){

	op=(num1+num2);
	repaint();
	}
	if(evt.getSource()==sub){

	po=(num1-num2);
	repaint();

	}


	if(evt.getSource()==mul){

	op=(num1*num2);
	repaint();


	}

	if(evt.getSource()==div){
	op=(num1/num2);
	repaint();
	}
	


}


}

