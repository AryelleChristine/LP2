import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class RectPaintApp {
	public static void main (String[] args) {
        	RectPaintFrame frame = new RectPaintFrame();
        	frame.setVisible(true);
    	}
}

class RectPaintFrame extends JFrame {
    	Rect rect1,rect2,rect3;

    	RectPaintFrame () {
        	this.addWindowListener (
            		new WindowAdapter() {
                		public void windowClosing (WindowEvent e) {
                    			System.exit(0);
                		}
            		}
        	);
        this.setTitle("Retangulos");
        this.setSize(300, 300);
	//250,30,0
        this.rect1 = new Rect(100,150,110,50,250,30,0,0,203,55);
	this.rect2 = new Rect(250,270,100,50,30,0,250,150,70,0);
	this.rect3 = new Rect(350,370,200,80,0,250,205,200,30,10);
    	}

    	public void paint (Graphics g) {
        	super.paint(g);
        	this.rect1.paint(g);
		this.rect2.paint(g);
		this.rect3.paint(g);
    	}
}

class Rect {
    	int x, y;
    	int w, h;
	int rf,gf,bf;
	int rc,gc,bc;

    	Rect (int x, int y, int w, int h,int rf,int gf,int bf,int rc,int gc,int bc) {
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

   	void print () {
       		System.out.format("Retangulo de tamanho (%d,%d) na posicao (%d,%d).\n",
            		this.w, this.h, this.x, this.y);
    	}

	void paint(Graphics g){
		Graphics2D g2d = (Graphics2D) g;

		g.setColor(new Color(this.rf,this.gf,this.bf));
		g.fillRect (this.x, this.y, this.w, this.h);
		g.setColor(new Color(this.rc,this.gc,this.bc));
        	g2d.drawRect(this.x,this.y, this.w,this.h);	
	
   	 }
}
