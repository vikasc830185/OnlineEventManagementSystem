public class home_page
{
void main()
{
{
Frame f=new Frame();
Label l1;
Button b1,b2,b3;
f.addWindowListener(new WindowAdapter(){
 @Override
 public void windowClosing(WindowEvent win)
 {
 System.exit(0);
 }
 });
l1=new Label("Select Required Event Type");
b1=new Button("Marriage");
b2=new Button("Birthday party");
b3=new Button("Official Events");
f.setSize(800, 300);
f.setBackground(Color.gray);
f.setLayout(null);
l1.setBounds(100,60,300,30);
b1.setBounds(100,100,140,30);
b2.setBounds(260,100,140,30);
b3.setBounds(420,100,140,30);
f.add(l1);
f.add(b1);
f.add(b2);
f.add(b3);
f.setVisible(true);
b1.addActionListener(new ActionListener() {
 public void actionPerformed(ActionEvent e)
 {

 System.out.println("Opening Marriage module");
 f.setVisible(false);
 Marriage hp=new Marriage();
 hp.main();

 }
 });
b2.addActionListener(new ActionListener() {
 public void actionPerformed(ActionEvent e)
 {

 System.out.println("Opening Birthday module");
 f.setVisible(false);
 Birthday hp=new Birthday();
 hp.main();

 }
 });
b3.addActionListener(new ActionListener() {
 public void actionPerformed(ActionEvent e)
 {

 System.out.println("Opening OfficialEvents module");
 f.setVisible(false);
 Officialevents hp=new Officialevents();
 hp.main();

 }
 });
}
}
}
