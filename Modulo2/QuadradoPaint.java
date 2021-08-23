package figures;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class QuadradoPaintApp {
	public static void main (String[] args){
		QuadradoPaintFrame frame = new QuadradoPaintFrame();
		frame.setVisible(true);
	}
}

class QuadradoPaintFrame extends JFrame{
	Quadrado q1,q2,q3;
	QuadradoPaintFrame(){
		this.addWindowListener(
			new WindowAdapter(){
				public void windowClosing (WindowEvent e){
					System.exit(0);
				}
			}
		);
		this.setTitle("Quadrado");
		this.setSize(500,500);
		this.q1 = new Quadrado(100,100,150,150);
		this.q2 = new Quadrado(300,100,200,200);
		this.q3 = new Quadrado(100,350,250,250);
		getContentPane().setBackground(new Color(255,215,0));
	}
	
	public void paint(Graphics g){
		super.paint(g);
		this.q1.paint(g);
		this.q2.paint(g);
		this.q3.paint(g);
	}
}

class Quadrado{
	int x,y,w,h;
	public Quadrado (int x,int y,int w,int h){
		this.x = x;
		this.y = y;
		this.w = w;
		this.h = h;
	}
	
	public void print(){
		System.out.format("Quadrado de tamanho (%d,%d) na posicao (%d,%d).\n",
			this.w,this.h,this.x,this.y); 
	}

	public void paint(Graphics g){
		Graphics g2d = (Graphics2D) g;
		
		g2d.setColor(new Color(250,128,114));
		g2d.fillRect(this.x,this.y,this.w,this.h);
		g2d.setColor(new Color(128,0,0));
		g2d.drawRect(this.x,this.y,this.w,this.h);
	}
}
