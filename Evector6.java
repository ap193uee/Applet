import java.applet.*;
import java.awt.*;
import java.awt.event.*; 

public class Evector6 extends Applet implements ActionListener
{
	Button submiT;
	Button submiT2;
	TextField x1co;
	TextField y1co;
	TextField x2co;
	TextField y2co;
	TextField x3co;
	TextField y3co;
	TextField z1co;
	TextField z2co;
	TextField z3co;
	int a,x,y,z,x1,x2,y1,y2,z1,z2;
	double csa,csb,sna,snb;

	public void init()
	{
		setLayout(null);
		submiT = new Button("ADD");
		submiT2 = new Button("SUBTRACT");
		x1co = new TextField("x1-coordinate");
		y1co = new TextField("y1-coordinate");
		x2co = new TextField("x2-coordinate");
		y2co = new TextField("y2-coordinate");
		z1co = new TextField("z1-coordinate");
		z2co = new TextField("z2-coordinate");
		z3co = new TextField("output-z");
		x3co = new TextField("output-x");
		y3co = new TextField("output-y");

		x1co.setBounds(10,20,100,30);
		y1co.setBounds(10,60,100,30);
		z1co.setBounds(10,100,100,30);
		x2co.setBounds(10,140,100,30);
		y2co.setBounds(10,180,100,30);
		z2co.setBounds(10,220,100,30);
		x3co.setBounds(10,340,100,30);
		y3co.setBounds(10,380,100,30);
		z3co.setBounds(10,420,100,30);
		submiT.setBounds(10,260,100,30);
		submiT2.setBounds(10,300,100,30);

		add(x1co);
		add(y1co);
		add(z1co);
		add(x2co);
		add(y2co);
		add(z2co);
		add(x3co);
		add(y3co);
		add(z3co);
		add(submiT);
		add(submiT2);

		submiT.addActionListener(this);
		submiT2.addActionListener(this);
	}

	public void stop()
	{
	}

	public void paint(Graphics g)
	{
		x1=Integer.parseInt(x1co.getText());
		x2=Integer.parseInt(x2co.getText());
		y1=Integer.parseInt(y1co.getText());
		y2=Integer.parseInt(y2co.getText());
		z1=Integer.parseInt(z1co.getText());
		z2=Integer.parseInt(z2co.getText());
		
		csa=0.832; csb=0.98;
		sna=0.5547; snb=0.196;
		
		g.setColor(Color.black);

		g.drawLine(200, 410, 1200,610);
		g.drawLine(700,10,700, 1010);
		g.drawLine(400,710,1000, 310);
		
		g.setColor(Color.blue);

		g.drawLine(699,510,699+(int) (y1*csb-x1*csa),510-z1+(int) (x1*sna+y1*snb));
		g.drawLine(700,510,700+(int) (y1*csb-x1*csa),510-z1+(int) (x1*sna+y1*snb));
		g.drawLine(701,510,701+(int) (y1*csb-x1*csa),510-z1+(int) (x1*sna+y1*snb));
		g.drawLine(702,510,702+(int) (y1*csb-x1*csa),510-z1+(int) (x1*sna+y1*snb));
		g.drawLine(698,510,698+(int) (y1*csb-x1*csa),510-z1+(int) (x1*sna+y1*snb));
				
		g.drawLine(700+(int) (y1*csb-x1*csa),510-z1+(int) (x1*sna+y1*snb),700+(int) (y1*csb-x1*csa),510+(int) (x1*sna+y1*snb));
		g.drawLine(700+(int) (y1*csb-x1*csa),510+(int) (x1*sna+y1*snb),700-(int) (x1*csa),510+(int) (x1*sna));
		g.drawLine(700+(int) (y1*csb-x1*csa),510+(int) (x1*sna+y1*snb),700+(int) (y1*csb),510+(int) (y1*snb));
		
		g.setColor(Color.red);
		
		g.drawLine(701,510,701+(int) (y2*csb-x2*csa),510-z2+(int) (x2*sna+y2*snb));
		g.drawLine(700,510,700+(int) (y2*csb-x2*csa),510-z2+(int) (x2*sna+y2*snb));
		g.drawLine(699,510,699+(int) (y2*csb-x2*csa),510-z2+(int) (x2*sna+y2*snb));
		g.drawLine(702,510,702+(int) (y2*csb-x2*csa),510-z2+(int) (x2*sna+y2*snb));
		g.drawLine(698,510,698+(int) (y2*csb-x2*csa),510-z2+(int) (x2*sna+y2*snb));
		
		g.drawLine(700+(int) (y2*csb-x2*csa),510-z2+(int) (x2*sna+y2*snb),700+(int) (y2*csb-x2*csa),510+(int) (x2*sna+y2*snb));
		g.drawLine(700+(int) (y2*csb-x2*csa),510+(int) (x2*sna+y2*snb),700-(int) (x2*csa),510+(int) (x2*sna));
		g.drawLine(700+(int) (y2*csb-x2*csa),510+(int) (x2*sna+y2*snb),700+(int) (y2*csb),510+(int) (y2*snb));
		
		g.setColor(Color.green);
		if (a==1)
			{x =x1 + x2;
			y = y1 + y2;
			z = z1 +z2;
			g.drawLine(699,510,699+(int) (y*csb-x*csa),510-z+(int) (x*sna+y*snb));
			g.drawLine(700,510,700+(int) (y*csb-x*csa),510-z+(int) (x*sna+y*snb));
			g.drawLine(701,510,701+(int) (y*csb-x*csa),510-z+(int) (x*sna+y*snb));
			g.drawLine(698,510,698+(int) (y*csb-x*csa),510-z+(int) (x*sna+y*snb));
			g.drawLine(702,510,702+(int) (y*csb-x*csa),510-z+(int) (x*sna+y*snb));
			
			g.drawLine(700+(int) (y*csb-x*csa),510-z+(int) (x*sna+y*snb),700+(int) (y*csb-x*csa),510+(int) (x*sna+y*snb));
			g.drawLine(700+(int) (y*csb-x*csa),510+(int) (x*sna+y*snb),700-(int) (x*csa),510+(int) (x*sna));
			g.drawLine(700+(int) (y*csb-x*csa),510+(int) (x*sna+y*snb),700+(int) (y*csb),510+(int) (y*snb));
			
			x3co.setText("x3="+x);
			y3co.setText("y3="+y);
			z3co.setText("z3="+z);}
		
		else
			{x =x1 - x2;
			y = y1 - y2;
			z = z1- z2;
			g.drawLine(699,510,699+(int) (y*csb-x*csa),510-z+(int) (x*sna+y*snb));
			g.drawLine(700,510,700+(int) (y*csb-x*csa),510-z+(int) (x*sna+y*snb));
			g.drawLine(701,510,701+(int) (y*csb-x*csa),510-z+(int) (x*sna+y*snb));
			g.drawLine(698,510,698+(int) (y*csb-x*csa),510-z+(int) (x*sna+y*snb));
			g.drawLine(702,510,702+(int) (y*csb-x*csa),510-z+(int) (x*sna+y*snb));
			
			g.drawLine(700+(int) (y*csb-x*csa),510-z+(int) (x*sna+y*snb),700+(int) (y*csb-x*csa),510+(int) (x*sna+y*snb));
			g.drawLine(700+(int) (y*csb-x*csa),510+(int) (x*sna+y*snb),700-(int) (x*csa),510+(int) (x*sna));
			g.drawLine(700+(int) (y*csb-x*csa),510+(int) (x*sna+y*snb),700+(int) (y*csb),510+(int) (y*snb));
			
			z3co.setText("z3="+z);
			x3co.setText("x3="+x);
			y3co.setText("y3="+y);}
		
	}

public void actionPerformed(ActionEvent e)
{
if(e.getSource()==submiT)
{repaint();a=1;}
if(e.getSource()==submiT2)
{repaint();a=2;}
}

}