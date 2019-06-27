import java.awt.*;
import java.awt.event.*;



class Ehandleradd implements ActionListener{
   TextField no1,no2,result;

   public Ehandleradd(TextField A,TextField B,TextField C){
       no1=A;
       no2=B;
       result=C;
   }
   public void actionPerformed(ActionEvent X){
       int A,B,C;
       A=Integer.parseInt(no1.getText());
       B=Integer.parseInt(no2.getText());
       C=A+B;
       result.setText(Integer.toString(C));
   }
}

class Ehandlersub implements ActionListener{
   TextField no1,no2,result;

   public Ehandlersub(TextField A,TextField B,TextField C){
       no1=A;
       no2=B;
       result=C;
   }
   public void actionPerformed(ActionEvent X){
       int A,B,C;
       A=Integer.parseInt(no1.getText());
       B=Integer.parseInt(no2.getText());
       C=A-B;
       result.setText(Integer.toString(C));
   }
}

class Ehandlerdiv implements ActionListener{
   TextField no1,no2,result;

   public Ehandlerdiv(TextField A,TextField B,TextField C){
       no1=A;
       no2=B;
       result=C;
   }
   public void actionPerformed(ActionEvent X){
       int A,B,C;
       A=Integer.parseInt(no1.getText());
       B=Integer.parseInt(no2.getText());
       C=A/B;
       result.setText(Integer.toString(C));
   }
}

class Ehandlermul implements ActionListener{
   TextField no1,no2,result;

   public Ehandlermul(TextField A,TextField B,TextField C){
       no1=A;
       no2=B;
       result=C;
   }
   public void actionPerformed(ActionEvent X){
       int A,B,C;
       A=Integer.parseInt(no1.getText());
       B=Integer.parseInt(no2.getText());
       C=A*B;
       result.setText(Integer.toString(C));
   }
}


class WindowsXP{
   public static void main(String xyz[]){
       Frame F=new Frame("Calculation");
       TextField T1,T2,T3;
       Label L1,L2,L3;
       Button B1=new Button("+");
       Button B2=new Button("-");
       Button B3=new Button("/");
       Button B4=new Button("x");
       L1=new Label("First no: ");
       L2=new Label("Second no: ");
       L3=new Label("Result: ");
       T1=new TextField(10);
       T2=new TextField(10);
       T3=new TextField(0);

       FlowLayout Fl=new FlowLayout();
       F.setLayout(Fl);
       Ehandleradd Add=new Ehandleradd(T1,T2,T3);
       Ehandlersub Sub=new Ehandlersub(T1,T2,T3);
       Ehandlerdiv Div=new Ehandlerdiv(T1,T2,T3);
       Ehandlermul Mul=new Ehandlermul(T1,T2,T3);

       B1.addActionListener(Add);
       B2.addActionListener(Sub);
       B3.addActionListener(Div);
       B4.addActionListener(Mul);
       F.add(L1);
       F.add(T1);
       F.add(L2);
       F.add(T2);
       F.add(B1);
       F.add(B2);
       F.add(B3);
       F.add(B4);
       F.add(L3);
       F.add(T3);

       F.setSize(400,400);
       F.setVisible(true);
   }
}