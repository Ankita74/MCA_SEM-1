#include <stdio.h>
#include<stdlib.h>
void create();
void display();
int search(int key);

struct node {
   int data;
   struct node *next;
};
struct node *first=NULL;
struct node *last=NULL;

int main()
{
	int keyToSearch , index;
	create();
	create();
	create();
	display();
	printf("enter element to serach:-");
	scanf("%d " , & keyToSearch);
	index=search(keyToSearch);
	if(index>0)
		printf("%d found in the position %d \n " , keyToSearch , index+1);
	else
		printf("%d not found in the list \n" , keyToSearch);
}
void create()
{
	struct node *newnode;
	newnode = (struct node*)malloc(sizeof(struct node));
	printf("enter value in list:-");
	scanf("%d",&newnode->data);
	newnode->next=NULL;
	if(first==NULL)
	{
		first=newnode;
		last=newnode;
	}
	else
	{
		last->next=newnode;
		last=newnode;
	}
}
void display() 
{
	struct node *temp;
	for(temp=first;temp!=NULL;temp=temp->next)
	{
		printf("The elements of link list are :- %d \n ", temp->data);
	}
	
}
int search(int key)
{
	int index;
	struct node *curNode;
	index=0;
	curNode=first;
	while(curNode != NULL && curNode->data != key)
	{
		index++;
		curNode=curNode->next;
		
	}
	return (curNode != NULL) ? index : -1 ;
}
