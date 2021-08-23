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
	getContentPane().setBackground(Color.blue);
	
    }

    public void paint (Graphics g) {
        super.paint(g);
        this.r1.paint(g);
	this.r2.paint(g);
	this.r3.paint(g);
    }
}

class Rect {
    int x, y;
    int w, h;

    Rect (int x, int y, int w, int h) {
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
    }

    void print () {
        System.out.format("Retangulo de tamanho (%d,%d) na posicao (%d,%d).\n",
            this.w, this.h, this.x, this.y);
    }

    void paint (Graphics g) {
        Graphics2D g2d = (Graphics2D) g;

	g2d.setColor(new Color(22,222,208));
	g2d.fillRect (this.x, this.y, this.w, this.h);
	g2d.setColor(Color.black);
        g2d.drawRect(this.x,this.y, this.w,this.h);
	

    }
}
