import java.awt.*;
import java.util.Random;
import java.awt.event.*;
import javax.swing.*;
class  p142 implements KeyListener
{
	ImageIcon img;
Random r;
JButton b, be,b2,b3;
JFrame f;
JLabel L1,L2,lab;
JLabel jl;
JPanel p;
int i1,j1,p1=0,p2=0,m1=400,m2=100,flag=1;
int i=20,j=20,count=2,a=0,k=0,temp1=0,temp2=0;
int num[]=new int[101];
JButton bb[]=new JButton[101];
p142()

{num[0]=0;

	f=new JFrame();
	f.setSize(1381,768);
	f.setVisible(true);
	f.setLayout(null);
	f.addWindowListener(new WindowAdapter(){public void windowClosing(WindowEvent e){System.exit(0);}});
	r=new Random();
	p=new JPanel();
	p.setBounds(0,0,1200,760);
	p.setVisible(true);
	p.setLayout(null);
	p.setBackground(Color.yellow);


    ImageIcon img = new ImageIcon("a.png");
	JLabel lab= new JLabel(img);
	p.add(lab);

	f.add(p);
	L1=new JLabel("Score");
	L1.setFont(new Font("Arial",Font.BOLD,40));
	L1.setBackground(Color.yellow);
	L1.setBounds(1200,200,200,100);
	f.add(L1);
	L2=new JLabel("Score");
	L2.setFont(new Font("Arial",Font.BOLD,40));
	L2.setBackground(Color.yellow);
	L2.setBounds(1200,300,200,100);
	f.add(L2);
	b=new JButton("O");
	be=new JButton("X");
	b3=new JButton();
	b.setBackground(Color.black);
	f.setBackground(Color.black);

	for(a=1;a<=100;a++){bb[a]=new JButton(Integer.toString(a));num[a]=num[a-1]+20; }//System.out.println(num[a]);}
	bb[0]=new JButton("");

	b2=new JButton("2");
	be.setBounds(m2,m1,10,10);
	for(int j=50,i=50;i<1100;)
	{

	appleChange(i,j);
	System.out.println("i="+i+"j="+j);
	be.setBackground(Color.red);
	be.setForeground(Color.red);
	be.setBounds(m2,m1,10,10);
	p.add(be);

	try{Thread.sleep(50);} catch(Exception e){}

			p.addKeyListener(new KeyAdapter(){public void keyPressed(KeyEvent e){keypress(e);}});
			f.addKeyListener(new KeyAdapter(){public void keyPressed(KeyEvent e){keypress(e);}});


for(k=0;k<count+1;k++)
{	if(flag==1)
	 	{j+=2;bb[k].setBounds(j-num[k],i,20,20);p.add(bb[k]);}//appleChange(i,j);
	 if(flag==2)
		{i+=2;bb[k].setBounds(j,i-num[k],20,20);p.add(bb[k]);}//appleChange(i,j);
	 if(flag==3)
		{j-=2;bb[k].setBounds(j+num[k],i,20,20);p.add(bb[k]);}//appleChange(i,j);
	if(flag==4)
		{i-=2;	bb[k].setBounds(j,i+num[k],20,20);p.add(bb[k]);}appleChange(i,j);
//if(k==count-1)break;
}		 if(i==10)i=760;
		 else if(i==760)i=10;
		 else if(j==1200)j=10;
		 else if(j==10)j=1200;
//	b.setBounds(j,i,20,20);
//	p.add(b);
	}
}

boolean buttonLocation(int i10,int j10)
{
int i11=i10,j11=j10;
for( i11=i10;i11<=i10+20;i11++){
for( j11=j10;j11<=j10+20;j11++)
		{
			if(i11==m1+5&&j11==m2+5||i11==m1+2&&j11==m2+3||i11==m2+8&&i11==m1+9)
			{
			return(true);
		}}}
return(false);
}
void appleChange(int ia,int ja)
{if(buttonLocation(ia,ja)==true)
					{  	count++;
							L2.setText(Integer.toString(count));
							p.remove(be);
							m1=r.nextInt(700);
							m2=r.nextInt(1080);
							if(!(m1>50&&m1<650)){ for(int k=0;k<10;k++){m1=r.nextInt(700);	if(m1>20&&m1<650);break;}}
							if(!(m2>50&&m2<1080)){for(int k=0;k<10;k++){m2=r.nextInt(1080);	if(m2>20&&m2<1080);break;}}
					be.setBounds(m1,m2,10,10);
					p.add(be);
					}
}
void keypress(KeyEvent e)
{
if(e.getKeyCode()==39)flag=1;
if(e.getKeyCode()==40)flag=2;
if(e.getKeyCode()==37)flag=3;
if(e.getKeyCode()==38)flag=4;
}

public void keyReleased(KeyEvent e){}
public void keyPressed(KeyEvent e){}
public void keyTyped(KeyEvent e){}
public static void main(String ssr[])
{
p142 obj=new p142();
}
}