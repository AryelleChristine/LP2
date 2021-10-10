import java.awt.*;
import java.awt.event.*;
import java.awt.event.MouseEvent;
import java.io.ObjectInputFilter.Status;

import javax.swing.*;

import java.util.ArrayList;
import java.util.Random;

import figures.*;

class ListApp {
    public static void main (String[] args) {
        ListFrame frame = new ListFrame();
        frame.setVisible(true);
    }
}

class ListFrame extends JFrame {
    ArrayList<Figure> figs = new ArrayList<Figure>();
    Figure focus = null;
    Point pMouse = null;
    int dx,dy;

    Random Rand = new Random();

    ListFrame () {
        this.addWindowListener (
            new WindowAdapter() {
                public void windowClosing (WindowEvent e) {
                    System.exit(0);
                }
            }
        );

        this.addMouseListener(
            new MouseAdapter(){
                public void mousePressed(MouseEvent evt){
                    pMouse = getMousePosition();
                    focus = null;
                    for (Figure fig: figs){ 
                        if (fig.clicked(pMouse.x,pMouse.y)){
                            focus = fig;
                            dx = (pMouse.x - focus.x);
                            dy = (pMouse.y - focus.y);  
                        }

			if (focus!=null){
			    figs.add(focus);
			    figs.remove(focus);			    
			}
                        repaint();
                    }

                 }
            }
        );
        
       this.addMouseMotionListener(
            new MouseMotionAdapter() {
                public void mouseDragged(MouseEvent move) {
                    pMouse = getMousePosition();
                    if (focus != null) {
                        figs.remove(focus);
                        figs.add(focus);
                        focus.x = pMouse.x + dx;
                        focus.y = pMouse.y + dy;
                    }
                    repaint();
                }
            }
        );


        this.addKeyListener (
            new KeyAdapter() {
                public void keyPressed (KeyEvent evt) {
                    pMouse = getMousePosition();
                    int x = pMouse.x;
		            int y = pMouse.y;
                    int w = 70;
                    int h = 40;
                                      
                    if (evt.getKeyChar() == 'r') {
                        int r = 191;
                        int g = 70;
                        int b = 199;
                        int r1 = 184;
                        int g1 = 239;
                        int b1 = 213;
                        figs.add(new Rect(x,y, w,h, r,g,b, r1,g1,b1));
                    }
                    
                    if (evt.getKeyChar() == 'e') {
                        int r = 173;
                        int g = 255;
                        int b = 47;
                        int r1 = 0;
                        int g1 = 71;
                        int b1 = 171;
                        figs.add(new Ellipse(x,y, w,h, r,g,b, r1,g1,b1));
                    }
                     
                    if (evt.getKeyChar() == 't') {
                        int r = 227;
                        int g = 173;
                        int b = 83;
                        int r1 = 243;
                        int g1 = 46;
                        int b1 = 83;
                        figs.add(new Triangle(x,y, w,h, r,g,b, r1,g1,b1));                        
                    }

                    if (evt.getKeyChar() == 'l') {
                        int r = 247;
                        int g = 185;
                        int b = 202;
                        int r1 = 24;
                        int g1 = 115;
                        int b1 = 126;
                        figs.add(new Line(x,y, w,h, r,g,b, r1,g1,b1));                        
                    } 

                    if(evt.getKeyCode() == 127){
			            figs.remove(focus);
                    }

                     
                    if(evt.getKeyChar() == 'd'){
			            focus.x += 5;
                    }
                     
                     
                    if(evt.getKeyChar() == 'a'){
			            focus.x -= 5;
                    }
                     
                    if(evt.getKeyChar() == 'w'){
			            focus.y -= 5;
                    }

                    if(evt.getKeyChar() == 's'){
			            focus.y += 5;
                    }

                    repaint();
                }
            }
        );

        

        this.setTitle("Projeto");
        this.setSize(350, 350);
        this.setVisible(true);
	
    }

    public void paint (Graphics g) {
        super.paint(g);
        for (Figure fig: this.figs) {
            fig.paint(g);
        }
    }
}
