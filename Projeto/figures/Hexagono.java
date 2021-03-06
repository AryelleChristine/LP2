package figures;

import java.awt.*;

public class Hexagono extends Figure{
	public Hexagono(int x,int y,int w,int h,Color fundoCor,Color contornoCor){
		super(x,y,w,h,fundoCor,contornoCor);
	}
	public void paint (Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        int x1[] = {this.x+w/5,this.x+w*4/5,this.x+w,this.x+w*4/5,this.x+w/5,this.x*(w/w)};
        int y1[] = {this.y*(h/h),this.y*(h/h),this.y+(this.h/2),this.y+h,this.y+h,this.y+(this.h)/2};
        g2d.setColor(this.fundoCor);
        g2d.fillPolygon(x1, y1, 6); 
        g2d.setColor(this.contornoCor);
        g2d.drawPolygon(x1, y1, 6);
    }

}
