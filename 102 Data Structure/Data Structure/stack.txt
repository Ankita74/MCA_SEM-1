#include<stdio.h>
#include<conio.h>
#define n 5
int stack[n],top,data,val,i;
void push();
void pop();
void show();
void main()
{
	top=-1;
	push();
	push();
	push();
	show();
	pop();
	show();
}
void push()
{
	if(top==n-1)
	{
		printf("stack is fulll\n");
	}
	else
	{
		printf("\nenter value to insert");
		scanf("%d",&data);
		top=top+1;
		stack[top]=data;



	}

}
void pop()
{
	if(top==-1)
	{
		printf("stack is underflow");
	}
	else
	{
		val=stack[top];
		printf("\npopped element is %d \n",val);
		top=top-1;
	}
}
void show()
{
	for(i=top;i>-1;i--)
	{
		printf("\nelement in stack is %d " ,stack[i]);
	}
}
