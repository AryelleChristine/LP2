package figures;

import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Ellipse2D.Double;

public class Ellipse {
    int x, y;
    int w, h;
    int rf,gf,bf;

    public Ellipse (int x, int y, int w, int h,int rf,int gf,int bf) {
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
        this.rf = rf;
        this.gf = gf;
        this.bf = bf;
    }

    public void print () {
        System.out.format("Elipse de tamanho (%d,%d) na posicao (%d,%d).\n",
            this.w, this.h, this.x, this.y);
    }

    public void paint (Graphics g) {
        Graphics2D g2d = (Graphics2D) g;

        g2d.draw(new Ellipse2D.Double(this.x,this.y, this.w,this.h));
	    g.setColor(new Color(this.rf,this.gf,this.bf));
	    g.fillOval(this.x,this.y,this.w,this.h);
	
    }
}
