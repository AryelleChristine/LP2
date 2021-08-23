import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class ElipsePaintApp {
	public static void main (String[] args) {
		ElipsePaintFrame frame = new ElipsePaintFrame();
		frame.setVisible(true);
	}
}

class ElipsePaintFrame extends JFrame {
	Elipse e1;
	ElipsePaintFrame (){
		this.addWindowListener(
			new WindowAdapter(){
				public void windowClosing (WindowEvent e) {
					System.exit(0);
				}
			}
		);
	this.setTitle("Elipse");
	this.setSize(500,500);
	this.e1 = new Elipse(50,50,100,50);
	}

	public void paint(Graphics g){
		super.paint(g);
		this.e1.paint(g);
	}
}
class Elipse{
	int x,y,w,h;
	Elipse(int x, int y, int w, int h){
		this.x = x;
		this.y = y;
		this.w = w;
		this.h = h;
	}

	void print (){
		System.out.format("Elipse de tamanho (%d,%d) na posicao (%d,%d).\n",
			this.w,this.h,this.x,this.y);
	}

	void paint(Graphics g){
		Graphics g2d = (Graphics2D) g;
		g2d.setColor (Color.red);
		g2d.fillOval(this.x,this.y,this.w,this.h);
		g2d.setColor(new Color(22,222,208));
		g2d.drawOval(this.x,this.y,this.w,this.h);
	}
}
