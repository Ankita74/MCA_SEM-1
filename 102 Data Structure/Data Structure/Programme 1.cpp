#include <stdio.h>
void Addition();
void Subtraction();
void Increment();
void Decrement();
void main()
{
	Addition();
	Subtraction();
	Increment();
	Decrement();
}
void Addition()
{
	int a = 10, b = 6;
	int *ptr, *ptr1;
	ptr = &a;
	ptr1 = &b;
	printf("sum of two pointers : %d \n", *ptr+b);
}
void Subtraction()
{
	int a = 20, b = 12;
	int *ptr, *ptr1;
	ptr = &a;
	ptr1 = &b;
	printf("Subtraction of two pointers : %d \n", a-*ptr1);
}
void Increment()
{
	int arr[3] = {10, 11, 12};
	int *ptr, i;
	ptr = arr;
	printf("Increment\n");
	for(i = 0; i < 3; i++)
	{
	printf("%d\t", *ptr);
	ptr++;
	}
		printf("\n");
}
void Decrement()
{
	int a[3] = {10, 11, 12};
	int *ptr, i;
	ptr = &a[2];
	printf("Decrement\n");
	for(i = 3; i > 0; i--)
	{
	printf("%d\t", *ptr);
	ptr--;
	}
}