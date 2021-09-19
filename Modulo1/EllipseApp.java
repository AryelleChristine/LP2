public class EllipseApp{
	public static void main(String[] args){
		Ellipse e1 = new Ellipse(5,5,80,50);
		e1.print();
	}
}

class Ellipse {
	int x,y,w,h;
	Ellipse (int x, int y, int w, int h){
		this.x = x;
		this.y = y;
		this.w = w;
		this.h = h;
	}
	void print() {
		System.out.format("Elipse de tamanho (%d,%d) na posicao (%d,%d).",
			this.w,this.h,this.x,this.y);
	}
}
