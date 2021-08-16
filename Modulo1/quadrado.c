#include <stdio.h>

typedef struct{
	int x,y,w,h;
}Quadrado;

void print(Quadrado* q){
	printf("Quadrado de tamanho (%d,%d) na posicao (%d,%d)\n",
	q->w,q->h,q->x,q->y);	
}

void main (void){
	Quadrado q1 = {2,2,50,50};
	print(&q1);
}
