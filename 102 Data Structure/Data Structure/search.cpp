#include <stdio.h>
#include<stdlib.h>
void create();
void display();
void search();
int search(int key);

struct node {
   int data;
   struct node *next;
};
struct node *first=NULL;
struct node *last=NULL;

int main()
{
	do
	{
		int ch;
		printf("Enter choice... \n 1] create \n 2]display \n 3]search \n");
		scanf("%d",&ch);
		switch(ch)
		{
			case 1:
			create();
			break;
			case 2:
			display();
			break;
			case 3:
			search();
			break;
			case 4:
				exit(0);
		}
	}while(true);
	
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
void search()  
{  
    struct node *temp;  
    int item,i=0,flag;  
    temp = first;   
    if(temp == NULL)  
    {  
        printf("\nEmpty List\n");  
    }  
    else  
    {   
        printf("\nEnter item which you want to search?\n");   
        scanf("%d",&item);  
        while (temp!=NULL)  
        {  
            if(temp->data == item)  
            {  
                printf("item found at location %d ",i+1);  
                flag=0;  
            }   
            else  
            {  
                flag=1;  
            }  
            i++;  
            temp = temp -> next;  
        }  
        if(flag==1)  
        {  
            printf("Element not found\n");  
        }  
    }     
          
}  
