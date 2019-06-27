import java.awt.*;
import java.awt.event.*;

class Ehandler implements ActionListener{    
TextField result;   
 
public Ehandler(TextField C){                
result=C;    
}    

public void actionPerformed(ActionEvent X){        
int A;        
A=Integer.parseInt(no1.getText());        
       
Button Btn=(Button)X.getSource();        
String ch=Btn.getLabel();        
if(ch.equals("+")){            
C=A+B;            
result.setText(Integer.toString(C));        
}        
if(ch.equals("-")){            
C=A-B;            
result.setText(Integer.toString(C));        
}        
if(ch.equals("/")){            
C=A/B;            
result.setText(Integer.toString(C));        
}        
if(ch.equals("x")){            
C=A*B;            
result.setText(Integer.toString(C));        
    }    
  }
}

class Calculator{    
public static void main(String xyz[]){        
Frame F=new Frame("Calculation");
Panel P1 = new Panel();
Panel P2 = new Panel();        
TextField T1 = new TextField();
T1 = new TextField(10);

Button B0,B1,B2,B3,B4,B5,B6,B7,B8,B9;
Button Btn_Add, Btn_Subtract, Btn_Multiply, Btn_Divide;
Button Button_Equals, Btn_Clear;

Button B0=new Button("0");
Button B1=new Button("1");
Button B2=new Button("2");
Button B3=new Button("3");
Button B4=new Button("4");
Button B5=new Button("5");
Button B6=new Button("6");
Button B7=new Button("7");
Button B8=new Button("8");
Button B9=new Button("9");
Button Btn_Add=new Button("+");        
Button Btn_Subtract=new Button("-");        
Button Btn_Divide=new Button("/");        
Button Btn_Multiply=new Button("x");        

Btn_Clear= new Button ("C");
Btn_Equals=new Button ("=")
   
      
Gridlayout G=new Gridlayout(4,4);        
P2.setLayout(G); 

P1.add(T1);       
P2.add(B0);        
P2.add(B1); 
P2.add(B2);
P2.add(Btn_Add);
P2.add(B3);
P2.add(B4);
P2.add(B5);
P2.add(Btn_Subtract);
P2.add(B6);
P2.add(B7);
P2.add(B8);
P2.add(Btn_Multiply);
P2.add(B9);
P2.add(Btn_Clear);
P2.add(Btn_Equals);
P2.add(Btn_Divide);


          
F.setSize(400,400);        
F.setVisible(true);    
}
}