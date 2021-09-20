package figures;

import java.awt.*;

public class Square {
    int x, y;
    int w, h;
    int rf,gf,bf;

    public Square (int x, int y, int w, int h,int rf,int gf,int bf) {
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
	this.rf = rf;
        this.gf = gf;
        this.bf = bf;
    }

    public void print () {
        System.out.format("Quadrado de tamanho (%d,%d) na posicao (%d,%d).\n",
            this.w, this.h, this.x, this.y);
    }

    public void paint (Graphics g) {
        Graphics2D g2d = (Graphics2D) g;

        g.setColor(new Color(this.rf,this.gf,this.bf));
	g.fillRect(this.x,this.y,this.w,this.h);
	g2d.drawRect(this.x,this.y, this.w,this.h);
    }
}
