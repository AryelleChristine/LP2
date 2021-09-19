#include <stdio.h>

typedef struct{
	int x,y;
	int w,h;
}Square;

void print(Square* q){
	printf("Quadrado de tamanho (%d,%d) na posicao (%d,%d)\n",
	 q->w,q->h,q->x,q->y);	
}

void main (void){
	Square q1 = {2,2,50,50};
	print(&q1);
}
