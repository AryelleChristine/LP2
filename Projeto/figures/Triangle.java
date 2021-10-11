package figures;

import java.awt.*;

public class Triangle extends Figure {
    public Triangle(int x,int y,int w,int h,Color fundoCor,Color contornoCor) {
        super(x,y,w,h,fundoCor,contornoCor);
    }

    public void Print() {
        System.out.format("Triangulo de vertices (%d, %d), (%d, %d) e (%d, %d).\n",
            this.x, this.y, this.w, this.h);
    }

    public void paint (Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        int x1[] = {this.x, ((this.w)/2) + (this.x), (this.w) + (this.x)};
        int y1[] = {this.y + h, (this.y + h) - (this.h), this.y + h};
        g2d.setColor(this.fundoCor);
        g2d.fillPolygon(x1, y1, 3); 
        g2d.setColor(this.contornoCor);
        g2d.drawPolygon(x1, y1, 3);
    }
}
