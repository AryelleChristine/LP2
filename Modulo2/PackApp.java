import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import figures.*;

class PackApp {
	public static void main (String[] args) {
		PackFrame frame = new PackFrame();
		frame.setVisible(true);
	}
}

class PackFrame extends JFrame {
	RectPaint r1;
	EllipsePaint e1;
	CirculoPaint c1;
	QuadradoPaint q1;

	PackFrame () {
		this.addWindowListener (
			new WindowAdapter() {
				public void windowClosing (WindowEvent e) {
					System.exit(0);
				}
			}
		);
	this.setTitle("Java Packages");
	this.setSize(350, 350);
        this.r1 = new RectPaint(50,50, 100,30,128,0,128);
        this.e1 = new EllipsePaint(50,100, 100,30,255,0,255);
	this.c1 = new CirculoPaint(50,150,100,100,220,20,60);
	this.q1 = new QuadradoPaint(70,300,60,60,255,69,0);
	
    }

	public void paint (Graphics g) {
		super.paint(g);
        	this.r1.paint(g);
        	this.e1.paint(g);
		this.c1.paint(g);
		this.q1.paint(g);
    }
}
