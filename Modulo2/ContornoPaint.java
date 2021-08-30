package cor;

import java.awt.*;

public class ContornoPaint{
	int r,g2,b;
	
	public ContornoPaint(int r,int g2,int b){
		this.r = r;
		this.g2 = g2;
		this.b = b;
	}
	
	public void paint(Graphics g){
		Graphics2D g2d = (Graphics2D) g;
		g.setColor(new Color(this.r,this.g2,this.b));
	}
}
