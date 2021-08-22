#include <stdio.h>

typedef struct {
  int x, y;
  int w, h;
} Rect;

void print (Rect* r) {
  printf("Retangulo de tamanho (%d,%d) na posicao (%d,%d).\n",
    r->w,r->h, r->x,r->y);
}

void arrastar (int x, int y,int dx, int dy){
	dx = 5;
	dy = 3;
	printf("A posicao agora e (%d,%d)\n",dx+x,dy+y);
}
void main (void) {
	  int x,y;
    Rect r1 = { 1,1, 10,10 };
    arrastar(1,1,x,y);
    print(&r1);
}
