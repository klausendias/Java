import java.awt.event.*;
import java.awt.*;
class Windows7{
	public static void main(String xyz[]){
		Frame win = new Frame();
		Button B1= new Button ("Button 1");
		Button B2= new Button ("Button 2");
		Button B3= new Button ("Button 3");
		Button B4= new Button ("Button 4");
		Button B5= new Button ("Button 5");
		win.add(B1,BorderLayout.NORTH);
		win.add(B2,BorderLayout.EAST);
		win.add(B3,BorderLayout.WEST);
		win.add(B4,BorderLayout.SOUTH);
		win.add(B5,BorderLayout.CENTER);
		Action1 E = new Action1();
		B1.addActionListener(E);
		win.setSize(400,400);
		win.setVisible(true);
	}
}

class Action1 implements ActionListener{
	public void actionPerformed(ActionEvent x){
		System.out.println("Hello My Friend");
	}
}