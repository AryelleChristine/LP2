#include <stdio.h>

typedef struct {
  int x, y;
  int w, h;
} Rect;

void print (Rect* r) {
  printf("Retangulo de tamanho (%d,%d) na posicao (%d,%d).\n",
    r->w,r->h, r->x,r->y);
}

int area(int w, int h){
  //calculo da area
	int a;
	a = w*h;
	printf("Area: %d\n",a);
}

void main (void) {
    Rect r1 = { 1,1, 10,10 };
    area(10,10);
    print(&r1);
}
