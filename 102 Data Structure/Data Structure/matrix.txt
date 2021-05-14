#include <stdio.h>
#include <conio.h>
void Addition();
void Subtracrion();
void main()
{
	Addition();
	Subtracrion();
}
void Addition()
{
	int a[2][2],b[2][2],c[2][2],i,j;
	printf("\nENTER VALUES FOR ADDITION:\n");
	printf("\nENTER VALUES FOR MATRIX A:\n");
	for(i=0;i<2;i++)
		for(j=0;j<2;j++)
			scanf("%d",&a[i][j]);
		
	printf("\nENTER VALUES FOR MATRIX B:\n");
	for(i=0;i<2;i++)
		for(j=0;j<2;j++)
			scanf("%d",&b[i][j]);
		
	for(i=0;i<2;i++)
		for(j=0;j<2;j++)
			c[i][j]=a[i][j]+b[i][j];
		
	printf("\nADDITION OF MATRIX :\n");
	for(i=0;i<2;i++)
        {
		for(j=0;j<2;j++)
			printf("%d\t",c[i][j]);
		printf("\n");
		}
}
void Subtracrion()
{
	int a[2][2],b[2][2],c[2][2],i,j;
	printf("\nENTER VALUES FOR SUBTRACTION:\n");	
	printf("\nENTER VALUES FOR MATRIX A:\n");
	for(i=0;i<2;i++)
		for(j=0;j<2;j++)
			scanf("%d",&a[i][j]);
		
	printf("\nENTER VALUES FOR MATRIX B:\n");
	for(i=0;i<2;i++)
		for(j=0;j<2;j++)
			scanf("%d",&b[i][j]);
		
	for(i=0;i<2;i++)
		for(j=0;j<2;j++)
			c[i][j]=a[i][j]-b[i][j];
		
	printf("\nSUBTRACTION OF MATRIX :\n");
	for(i=0;i<2;i++)
        {
		for(j=0;j<2;j++)
			printf("%d \t",c[i][j]);
		printf("\n");
		}
}





