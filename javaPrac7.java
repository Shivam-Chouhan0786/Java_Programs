// java GUI (graphical user interface) awt/swing


import java.awt.*;
import java.awt.event.*;
class Fdemo1 extends Frame implements ActionListener{
	Fdemo1(){
		
	}
	// setvisible(true);
	public void actionPerformed(ActionEvent e){
		
	}
}
class javaPrac7{
	public static void main(String args[]){
		Fdemo1 f=new Fdemo1();
		f.setVisible(true);
		f.setLocation(100,100);
		f.setSize(100,100);
	}
}