import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Hello2DApp {
    public static void main (String[] args) {
        Hello2DFrame frame = new Hello2DFrame();
    }
}

class Hello2DFrame extends JFrame {
    public Hello2DFrame () {
        this.addWindowListener (
            new WindowAdapter() {
                public void windowClosing (WindowEvent e) {
                    System.exit(0);
                }
            }
        );
        this.setTitle("Java2D - Hello World!");
        this.setSize(350, 350);
        this.setVisible(true);
	getContentPane().setBackground(Color.blue);
    }

    public void paint (Graphics g) {
        super.paint(g);
        Graphics2D g2d = (Graphics2D) g;
        int w = getWidth();
        int h = getHeight();
	// cor marrom
	Color cor = new Color(150,75,0);
	//corpo
	g2d.setColor(Color.yellow);
	g2d.drawRect(500,150,200,200);
	g2d.fillRect(500,150,200,200);
	
	//primeiras bolinhas
	g2d.setColor(Color.green);
	g2d.drawOval(500,150,30,30);
	g2d.fillOval(500,150,30,30);

	g2d.drawOval(580,150,30,30);
	g2d.fillOval(580,150,30,30);

	g2d.drawOval(670,150,30,30);
	g2d.fillOval(670,150,30,30);

	//bolinhas centrais
	g2d.drawOval(530,200,30,30);
	g2d.fillOval(530,200,30,30);

	g2d.drawOval(630,200,30,30);
	g2d.fillOval(630,200,30,30);
	
	//bolinhas finais
	g2d.drawOval(500,250,30,30);
	g2d.fillOval(500,250,30,30);

	g2d.drawOval(580,250,30,30);
	g2d.fillOval(580,250,30,30);
	
	g2d.drawOval(670,250,30,30);
	g2d.fillOval(670,250,30,30);
	
	//cilios
	g2d.setColor(Color.black);
	g2d.drawRect(560,172,3,12);
	g2d.fillRect(560,172,3,12);

	g2d.drawRect(570,170,3,10);
	g2d.fillRect(570,170,3,10);

	g2d.drawRect(580,172,3,10);
	g2d.fillRect(580,172,3,10);

	g2d.drawRect(610,172,3,12);
	g2d.fillRect(610,172,3,12);

	g2d.drawRect(620,170,3,10);
	g2d.fillRect(620,170,3,10);

	g2d.drawRect(630,172,3,12);
	g2d.fillRect(630,172,3,12);
	
	//olhos
	g2d.setColor(Color.white);
	g2d.drawOval(550,180,50,50);
	g2d.fillOval(550,180,50,50);
	
	g2d.drawOval(595,180,50,50);
	g2d.fillOval(595,180,51,51);
	
	g2d.setColor(Color.blue);
	g2d.drawOval(560,193,27,27);
	g2d.fillOval(560,193,28,28);

	g2d.drawOval(605,193,27,27);
	g2d.fillOval(605,193,28,28);

	g2d.setColor(Color.black);
	g2d.drawOval(565,200,15,15);
	g2d.fillOval(565,200,16,16);
	
	g2d.drawOval(612,200,15,15);
	g2d.fillOval(612,200,16,16);

	//bochecha
	g2d.setColor(Color.red);
	g2d.drawOval(525,230,3,3);
	g2d.fillOval(525,230,3,3);

	g2d.drawOval(535,230,3,3);
	g2d.fillOval(535,230,3,3);

	g2d.drawOval(530,240,3,3);
	g2d.fillOval(530,240,3,3);

	g2d.drawOval(660,230,3,3);
	g2d.fillOval(660,230,3,3);

	g2d.drawOval(670,230,3,3);
	g2d.fillOval(670,230,3,3);

	g2d.drawOval(665,240,3,3);
	g2d.fillOval(665,240,3,3);

	//boca
	g2d.setColor(Color.black);
	g2d.drawOval(555,240,90,30);
	g2d.fillOval(555,240,91,31);

	//dentes
	g2d.setColor(Color.white);
	g2d.drawRect(585,240,10,10);
	g2d.fillRect(585,240,10,10);

	g2d.drawRect(605,240,10,10);
	g2d.fillRect(605,240,10,10);

	//lingua
	g2d.setColor(Color.red);
	g2d.drawOval(590,261,20,10);
	g2d.fillOval(590,261,21,11);

	//calca
	g2d.setColor(cor);
	g2d.drawRect(500,300,200,80);
	g2d.fillRect(500,300,200,80);

	//pernas
	g2d.setColor(Color.yellow);
	g2d.drawRect(540,400,15,80);
	g2d.fillRect(540,400,15,80);
	
	g2d.drawRect(640,400,15,80);
	g2d.fillRect(640,400,15,80);

	//barra da calca
	g2d.setColor(cor);
	g2d.drawRect(530,380,35,30);
	g2d.fillRect(530,380,35,30);

	g2d.drawRect(630,380,35,30);
	g2d.fillRect(630,380,35,30);

	//meias
	g2d.setColor(Color.white);
	g2d.drawRect(540,440,15,70);
	g2d.fillRect(540,440,15,70);

	g2d.drawRect(640,440,15,70);
	g2d.fillRect(640,440,15,70);

	//listras azuis
	g2d.setColor(Color.blue);
	g2d.drawRect(540,450,15,5);
	g2d.fillRect(540,450,15,5);

	g2d.drawRect(640,450,15,5);
	g2d.fillRect(640,450,15,5);

	//listras vermelhas
	g2d.setColor(Color.red);
	g2d.drawRect(540,460,15,5);
	g2d.fillRect(540,460,15,5);

	g2d.drawRect(640,460,15,5);
	g2d.fillRect(640,460,15,5);
	
	//blusa
	g2d.setColor(Color.white);
	g2d.drawRect(500,290,200,20);
	g2d.fillRect(500,290,200,20);

	//bracos
	g2d.setColor(Color.yellow);
	g2d.drawRect(400,230,80,15);
	g2d.fillRect(400,230,80,15);
	
	g2d.drawRect(700,230,90,15);
	g2d.fillRect(700,230,90,15);

	//mangas da blusa
	g2d.setColor(Color.white);
	g2d.drawRect(464,220,35,30);
	g2d.fillRect(464,220,35,30);
	
	g2d.drawRect(700,220,35,30);
	g2d.fillRect(700,220,35,30);

	//cinto 
	g2d.setColor(Color.black);
	g2d.drawRect(510,320,30,5);
	g2d.fillRect(510,320,30,5);

	g2d.drawRect(560,320,30,5);
	g2d.fillRect(560,320,30,5);

	g2d.drawRect(610,320,30,5);
	g2d.fillRect(610,320,30,5);

	g2d.drawRect(660,320,30,5);
	g2d.fillRect(660,320,30,5);

	//sapatos
	g2d.setColor(Color.black);
	g2d.drawRect(540,500,15,20);
	g2d.fillRect(540,500,15,20);

	g2d.drawOval(515,500,30,20);
	g2d.fillOval(515,500,31,21);
	
	g2d.drawRect(640,500,15,20);
	g2d.fillRect(640,500,15,20);

	g2d.drawOval(650,500,30,20);
	g2d.fillOval(650,500,31,21);
    }
}
