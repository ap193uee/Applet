import java.applet.*;
import java.awt.*;
import java.awt.event.*; 

public class Evector8 extends Applet implements ActionListener
{
	Button submiT;
	Button submiT2;
	Button zoomin;
	Button zoomout;
	TextField x1co;
	TextField y1co;
	TextField x2co;
	TextField y2co;
	TextField z1co;
	TextField z2co;
	int a;
	double csa,csb,sna,snb,n=1,x,y,z,x1,x2,y1,y2,z1,z2;

	public void init()
	{
		setLayout(null);
		submiT = new Button("ADD");
		submiT2 = new Button("SUBTRACT");
		zoomin = new Button("ZOOM IN");
		zoomout = new Button("ZOOM OUT");
		x1co = new TextField("x1-coordinate");
		y1co = new TextField("y1-coordinate");
		x2co = new TextField("x2-coordinate");
		y2co = new TextField("y2-coordinate");
		z1co = new TextField("z1-coordinate");
		z2co = new TextField("z2-coordinate");

		x1co.setBounds(10,20,100,30);
		y1co.setBounds(10,60,100,30);
		z1co.setBounds(10,100,100,30);
		x2co.setBounds(10,140,100,30);
		y2co.setBounds(10,180,100,30);
		z2co.setBounds(10,220,100,30);
		submiT.setBounds(10,260,100,30);
		submiT2.setBounds(10,300,100,30);
		zoomin.setBounds(10,380,100,30);
		zoomout.setBounds(10,420,100,30);
		
		add(x1co);
		add(y1co);
		add(z1co);
		add(x2co);
		add(y2co);
		add(z2co);
		add(submiT);
		add(submiT2);
		add(zoomin);
		add(zoomout);
		
		submiT.addActionListener(this);
		submiT2.addActionListener(this);
		zoomin.addActionListener(this);
		zoomout.addActionListener(this);	
	}

	public void stop()
	{
	}

	public void paint(Graphics g)
	{
		csa=0.832; csb=0.98;
		sna=0.5547; snb=0.196;
		
		x1=n*Integer.parseInt(x1co.getText());
		x2=n*Integer.parseInt(x2co.getText());
		y1=n*Integer.parseInt(y1co.getText());
		y2=n*Integer.parseInt(y2co.getText());
		z1=n*Integer.parseInt(z1co.getText());
		z2=n*Integer.parseInt(z2co.getText());
		
		g.setColor(Color.black);

		g.drawLine(200, 410, 1200,610);
		g.drawLine(700,10,700, 1010);
		g.drawLine(100,910,1300, 110);
		
		g.drawString("Z-axis",710,20);
		g.drawString("Y-axis",1210,610);
		g.drawString("X-axis",150,920);
		g.drawString("Zoom Factor="+n,10,360);
		
		g.setColor(Color.blue);
		
		
		g.drawLine(699,509,699+(int) (y1*csb-x1*csa),509+(int) (x1*sna+y1*snb-z1));
		g.drawLine(700,510,700+(int) (y1*csb-x1*csa),510+(int) (x1*sna+y1*snb-z1));
		g.drawLine(701,511,701+(int) (y1*csb-x1*csa),511+(int) (x1*sna+y1*snb-z1));
		g.drawLine(702,512,702+(int) (y1*csb-x1*csa),512+(int) (x1*sna+y1*snb-z1));
		g.drawLine(698,508,698+(int) (y1*csb-x1*csa),508+(int) (x1*sna+y1*snb-z1));
		
		g.drawString("A("+(int)(x1/n)+","+(int)(y1/n)+","+(int)(z1/n)+")",710+(int) (y1*csb-x1*csa),520+(int) (x1*sna+y1*snb-z1));
				
		g.drawLine(700+(int) (y1*csb-x1*csa),510+(int) (x1*sna+y1*snb-z1),700+(int) (y1*csb-x1*csa),510+(int) (x1*sna+y1*snb));
		g.drawLine(700+(int) (y1*csb-x1*csa),510+(int) (x1*sna+y1*snb),700-(int) (x1*csa),510+(int) (x1*sna));
		g.drawLine(700+(int) (y1*csb-x1*csa),510+(int) (x1*sna+y1*snb),700+(int) (y1*csb),510+(int) (y1*snb));
		
		g.setColor(Color.red);
		
		g.drawLine(701,511,701+(int) (y2*csb-x2*csa),511+(int) (x2*sna+y2*snb-z2));
		g.drawLine(700,510,700+(int) (y2*csb-x2*csa),510+(int) (x2*sna+y2*snb-z2));
		g.drawLine(699,509,699+(int) (y2*csb-x2*csa),509+(int) (x2*sna+y2*snb-z2));
		g.drawLine(702,512,702+(int) (y2*csb-x2*csa),512+(int) (x2*sna+y2*snb-z2));
		g.drawLine(698,508,698+(int) (y2*csb-x2*csa),508+(int) (x2*sna+y2*snb-z2));
		
		g.drawString("B("+(int)(x2/n)+","+(int)(y2/n)+","+(int)(z2/n)+")",710+(int) (y2*csb-x2*csa),520+(int) (x2*sna+y2*snb-z2));
		
		g.drawLine(700+(int) (y2*csb-x2*csa),510+(int) (x2*sna+y2*snb-z2),700+(int) (y2*csb-x2*csa),510+(int) (x2*sna+y2*snb));
		g.drawLine(700+(int) (y2*csb-x2*csa),510+(int) (x2*sna+y2*snb),700-(int) (x2*csa),510+(int) (x2*sna));
		g.drawLine(700+(int) (y2*csb-x2*csa),510+(int) (x2*sna+y2*snb),700+(int) (y2*csb),510+(int) (y2*snb));
		
		g.setColor(Color.green);
		if (a==1)
			{x =x1 + x2;
			y = y1 + y2;
			z = z1 +z2;
			g.drawLine(699,509,699+(int) (y*csb-x*csa),509+(int) (x*sna+y*snb-z));
			g.drawLine(700,510,700+(int) (y*csb-x*csa),510+(int) (x*sna+y*snb-z));
			g.drawLine(701,511,701+(int) (y*csb-x*csa),511+(int) (x*sna+y*snb-z));
			g.drawLine(698,508,698+(int) (y*csb-x*csa),508+(int) (x*sna+y*snb-z));
			g.drawLine(702,512,702+(int) (y*csb-x*csa),512+(int) (x*sna+y*snb-z));
			
			g.drawLine(700+(int) (y*csb-x*csa),510+(int) (x*sna+y*snb-z),700+(int) (y*csb-x*csa),510+(int) (x*sna+y*snb));
			g.drawLine(700+(int) (y*csb-x*csa),510+(int) (x*sna+y*snb),700-(int) (x*csa),510+(int) (x*sna));
			g.drawLine(700+(int) (y*csb-x*csa),510+(int) (x*sna+y*snb),700+(int) (y*csb),510+(int) (y*snb));
			
			g.drawString("C("+(int)(x/n)+","+(int)(y/n)+","+(int)(z/n)+")",710+(int) (y*csb-x*csa),520+(int) (x*sna+y*snb-z));}
		
		else
			{x =x1 - x2;
			y = y1 - y2;
			z = z1- z2;
			
			g.drawLine(699,509,699+(int) (y*csb-x*csa),509+(int) (x*sna+y*snb-z));
			g.drawLine(700,510,700+(int) (y*csb-x*csa),510+(int) (x*sna+y*snb-z));
			g.drawLine(701,511,701+(int) (y*csb-x*csa),511+(int) (x*sna+y*snb-z));
			g.drawLine(698,508,698+(int) (y*csb-x*csa),508+(int) (x*sna+y*snb-z));
			g.drawLine(702,512,702+(int) (y*csb-x*csa),512+(int) (x*sna+y*snb-z));
			
			g.drawLine(700+(int) (y*csb-x*csa),510+(int) (x*sna+y*snb-z),700+(int) (y*csb-x*csa),510+(int) (x*sna+y*snb));
			g.drawLine(700+(int) (y*csb-x*csa),510+(int) (x*sna+y*snb),700-(int) (x*csa),510+(int) (x*sna));
			g.drawLine(700+(int) (y*csb-x*csa),510+(int) (x*sna+y*snb),700+(int) (y*csb),510+(int) (y*snb));
			
			g.drawString("C("+(int)(x/n)+","+(int)(y/n)+","+(int)(z/n)+")",710+(int) (y*csb-x*csa),520+(int) (x*sna+y*snb-z));}
			
	}

public void actionPerformed(ActionEvent e)
{
if(e.getSource()==submiT)
{repaint();a=1;}
if(e.getSource()==submiT2)
{repaint();a=2;}
if(e.getSource()==zoomin)
{repaint();n=n*2;}
if(e.getSource()==zoomout)
{repaint();n=n/2;}
}

}