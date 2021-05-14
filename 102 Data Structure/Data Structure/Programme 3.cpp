#include<stdio.h>
#include<conio.h>

int sum(int a , int b)
{
	return a+b;
}
void main()
{
	int (*funptr)(int,int) = sum;
	int result = funptr(15,10);
	printf("sum is : %d " , result);
}