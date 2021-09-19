import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Ellipse2D.Double;

class EllipsePaintApp {
	public static void main (String[] args) {
		ElipsePaintFrame frame = new ElipsePaintFrame();
		frame.setVisible(true);
	}
}

class EllipsePaintFrame extends JFrame {
	Ellipse e1,e2,e3;
	EllipsePaintFrame (){
		this.addWindowListener(
			new WindowAdapter(){
				public void windowClosing (WindowEvent e) {
					System.exit(0);
				}
			}
		);
	this.setTitle("Elipse");
	this.setSize(500,500);
	this.e1 = new Ellipse(50,50,100,50,25,25,112,173,255,47);
	this.e2 = new Ellipse(100,150,200,100,255,0,255,128,0,128);
	this.e3 = new Ellipse(250,250,300,150,255,182,193,20,20,44);
	
	}

	public void paint(Graphics g){
		super.paint(g);
		this.e1.paint(g);
		this.e2.paint(g);
		this.e3.paint(g);
	}
}
class Ellipse{
	int x,y;
	int w,h;
	int rf,gf,bf;
	int rc,gc,bc;
	public Ellipse(int x, int y, int w, int h,int rf,int gf,int bf,int rc,int gc,int bc){
		this.x = x;
        	this.y = y;
        	this.w = w;
        	this.h = h;
		this.rf = rf;
		this.gf = gf;
		this.bf = bf;
		this.rc = rc;
		this.gc = gc;
		this.bc = bc;
	}

	void print (){
		System.out.format("Elipse de tamanho (%d,%d) na posicao (%d,%d).\n",
			this.w,this.h,this.x,this.y);
	}

	void paint(Graphics g){
		Graphics2D g2d = (Graphics2D) g;
        	
		g.setColor(new Color(this.rf,this.gf,this.bf));
		g.fillOval (this.x, this.y, this.w, this.h);
		g.setColor(new Color(this.rc,this.gc,this.bc));
        	g2d.draw(new Ellipse2D.Double(this.x,this.y, this.w,this.h));	
	
   	 }
}
