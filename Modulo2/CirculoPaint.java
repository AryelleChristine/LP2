package figures;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class CirculoPaintApp { 
	public static void main (String[] args){
		CirculoPaintFrame frame = new CirculoPaintFrame();
		frame.setVisible(true);
	}
}

class CirculoPaintFrame extends JFrame {
	Circulo c1,c2,c3;
	CirculoPaintFrame(){
		this.addWindowListener(
			new WindowAdapter(){
				public void windowClosing (WindowEvent e){
					System.exit(0);
				}
			}
		);
		this.setTitle("Circulo");
		this.setSize(500,500);
		this.c1 = new Circulo(150,130,150,150);
		this.c2 = new Circulo(300,290,200,200);
		this.c3 = new Circulo(500,400,250,250);
	}
	
	public void paint(Graphics g){ 
		super.paint(g);
		this.c1.paint(g);
		this.c2.paint(g);
		this.c3.paint(g);
	}
}

class Circulo {
	int x,y,w,h;
	public Circulo (int x, int y, int w, int h){
		this.x = x;
		this.y = y;
		this.w = w;
		this.h = h;
	}

	public void print(){
		System.out.format("Circulo de tamanho (%d,%d) na posicao (%d,%d).\n",
			this.w,this.h,this.x,this.y);
	}

	public void paint(Graphics g){
		Graphics g2d = (Graphics2D) g;

		g2d.setColor(Color.green);
		g2d.fillOval(this.x,this.y,this.w,this.h);
		g2d.setColor(Color.black);
		g2d.drawOval(this.x,this.y,this.w,this.h);
	}
}
