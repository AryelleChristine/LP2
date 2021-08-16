import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ElipseApp{
	public static void main(String[] args){
	Elipse e1 = new Elipse(5,5,80,50);
	e1.print();
	}
}

class Elipse {
	int x,y,w,h;
	Elipse (int x, int y, int w, int h){
		this.x = x;
		this.y = y;
		this.w = w;
		this.h = h;
	}
	void print() {
		System.out.format("Elipse de tamanho (%d,%d) na posicao (%d,%d).",this.w,this.h,this.x,this.y);
	}
}
