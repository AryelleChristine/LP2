import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class RectPaintApp {
	public static void main (String[] args) {
        	RectPaintFrame frame = new RectPaintFrame();
        	frame.setVisible(true);
    	}
}

public class RectPaintFrame extends JFrame {
    	Rect r1,r2,r3;

    	RectPaintFrame () {
        	this.addWindowListener (
            		new WindowAdapter() {
                		public void windowClosing (WindowEvent e) {
                    			System.exit(0);
                		}
            		}
        	);
        this.setTitle("Retangulo");
        this.setSize(300, 300);
        this.r1 = new Rect(100,150, 110,50);
	this.r2 = new Rect(250,270, 100,50);
	this.r3 = new Rect(350,370, 200,80);
    	}

    	public void paint (Graphics g) {
        	super.paint(g);
        	this.r1.paint(g);
		this.r2.paint(g);
		this.r3.paint(g);
    	}
}

public class Rect {
    	int x, y;
    	int w, h;
	int r,g2,b;

    	public Rect (int x, int y, int w, int h) {
        	this.x = x;
        	this.y = y;
        	this.w = w;
        	this.h = h;
    	}

   	public void print () {
       		System.out.format("Retangulo de tamanho (%d,%d) na posicao (%d,%d).\n",
            		this.w, this.h, this.x, this.y);
    	}

	public void paint(Graphics g){
		this.r = r;
		this.g2 = g2;
		this.b = b;
		Graphics2D g2d = (Graphics2D) g;

		g.setColor(new Color(this.r,this.g2,this.b));
		g.fillRect (this.x, this.y, this.w, this.h);
		g.setColor(new Color(this.r,this.g2,this.b));
        	g2d.drawRect(this.x,this.y, this.w,this.h);	
   	 }
}
