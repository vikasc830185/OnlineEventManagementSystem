import java.awt.*;
import java.awt.event.*;
import java.io.IOException;
import java.util.Scanner;
public class Home
{
 public static void main(String[] args) {
{
{
Frame p = new Frame();
Label l1,l2,l3,l4;
TextField t1,t2;
Button b3,b4;
l1=new Label("Username");
l2=new Label("Password");
l3=new Label("Login Suucessfull");
l4=new Label("Username or Password is Incorrect");
b3=new Button("Login");
b4=new Button("Register");
t1=new TextField();
t2=new TextField();
p.addWindowListener(new WindowAdapter(){
 @Override
 public void windowClosing(WindowEvent win)
 {
 System.exit(0);
 }
 });
p.setSize(500, 300);
p.setBackground(Color.red);
p.setLayout(null);
l1.setBounds(40,60,80,30);
l2.setBounds(40,100,80,30);
l3.setBounds(60,180,150,30);
l4.setBounds(60,180,250,30);
b3.setBounds(100,140,80,30);
b4.setBounds(180,140,80,30);
t1.setBounds(130,60,140,30);
t2.setBounds(130,100,140,30);
p.add(l1);
p.add(l2);
p.add(b3);
p.add(b4);
p.add(t1);
p.add(t2);
p.setVisible(true);
b3.addActionListener(new ActionListener() {
 @Override
 public void actionPerformed(ActionEvent e)
 {
 String a = t1.getText();
 String b = t2.getText();
 if(a.equals("sanju") && b.equals("sanju"))
 {
 p.add(l3);
 System.out.println("Opening HomePage");
 p.setVisible(false);
 home_page hp=new home_page();
 hp.main();
 }
 else if(a.equals("vikas") && b.equals("vikas"))
 {
 p.add(l3);
 System.out.println("Opening HomePage");
 p.setVisible(false);
 home_page hp=new home_page();
 hp.main();
 }
 else
 {
 p.add(l4);
 System.out.println("Username or Password is Incorrect");
 }
 }
 });
b4.addActionListener(new ActionListener() {
 public void actionPerformed(ActionEvent e)
 {

 System.out.println("Opening Registration Page");
 p.setVisible(false);
 Register hp=new Register();
 hp.main();

 }
 });
}
}
}
}