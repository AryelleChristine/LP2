import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Ellipse2D.Double;

class ElipsePaintApp {
	public static void main (String[] args) {
		ElipsePaintFrame frame = new ElipsePaintFrame();
		frame.setVisible(true);
	}
}

class ElipsePaintFrame extends JFrame {
	Elipse e1,e2,e3;
	ElipsePaintFrame (){
		this.addWindowListener(
			new WindowAdapter(){
				public void windowClosing (WindowEvent e) {
					System.exit(0);
				}
			}
		);
	this.setTitle("Elipse");
	this.setSize(500,500);
	this.e1 = new Elipse(50,50,100,50,25,25,112,173,255,47);
	this.e2 = new Elipse(100,150,200,100,255,0,255,128,0,128);
	this.e3 = new Elipse(250,250,300,150,255,182,193,20,20,44);
	
	}

	public void paint(Graphics g){
		super.paint(g);
		this.e1.paint(g);
		this.e2.paint(g);
		this.e3.paint(g);
	}
}
class Elipse{
	int x,y,w,h;
	int r,g2,b;
	int r2,g3,b2;
	public Elipse(int x, int y, int w, int h,int r,int g2,int b,int r2,int g3,int b2){
		this.x = x;
        	this.y = y;
        	this.w = w;
        	this.h = h;
		this.r = r;
		this.g2 = g2;
		this.b = b;
		this.r2 = r2;
		this.g3 = g3;
		this.b2 = b2;
	}

	void print (){
		System.out.format("Elipse de tamanho (%d,%d) na posicao (%d,%d).\n",
			this.w,this.h,this.x,this.y);
	}

	void paint(Graphics g){
		Graphics2D g2d = (Graphics2D) g;
        	
		g.setColor(new Color(this.r,this.g2,this.b));
		g.fillOval (this.x, this.y, this.w, this.h);
		g.setColor(new Color(this.r2,this.g3,this.b2));
        	g2d.draw(new Ellipse2D.Double(this.x,this.y, this.w,this.h));	
	
   	 }
}
