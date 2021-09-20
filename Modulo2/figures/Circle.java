package figures;

import java.awt.*;

public class Circle {
    int x, y;
    int w, h;
    int rf,gf,bf;

    public Circle (int x, int y, int w, int h,int rf,int gf,int bf) {
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
	this.rf = rf;
        this.gf = gf;
        this.bf = bf;
    }

    public void print () {
        System.out.format("Circulo de tamanho (%d,%d) na posicao (%d,%d).\n",
            this.w, this.h, this.x, this.y);
    }

    public void paint (Graphics g) {
        Graphics2D g2d = (Graphics2D) g;

        g2d.drawOval(this.x,this.y, this.w,this.h);
	g.setColor(new Color(this.rf,this.gf,this.bf));
	g.fillOval(this.x,this.y,this.w,this.h);
    }
}
