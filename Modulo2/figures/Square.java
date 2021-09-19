package figures;

import java.awt.*;

public class Square {
    int x, y;
    int w, h;
    int r,g2,b;

    public Square (int x, int y, int w, int h,int r,int g2,int b) {
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
	this.r = r;
        this.g2 = g2;
        this.b = b;
    }

    public void print () {
        System.out.format("Quadrado de tamanho (%d,%d) na posicao (%d,%d).\n",
            this.w, this.h, this.x, this.y);
    }

    public void paint (Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.drawRect(this.x,this.y, this.w,this.h);
	g.fillRect(this.x,this.y,this.w,this.h);
	g.setColor(new Color(this.r,this.g2,this.b));
    }
}
