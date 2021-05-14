#include<stdio.h>  
#include<stdlib.h>  
struct node  
{  
    struct node *prev;  
    struct node *next;  
    int data;  
};    
struct node *head;
void insertion_last(); 
void deletion_last();  
void display();  
void main ()  
{  
	insertion_last();  
	insertion_last();  
	insertion_last();  
	deletion_last(); 
    display();  	
}
void insertion_last()  
{  
   struct node *newNode,*temp;  
   int item;  
   newNode = (struct node *) malloc(sizeof(struct node));  
   if(newNode == NULL)  
   {  
       printf("\nOVERFLOW");  
   }  
   else  
   {  
       printf("\nEnter value");  
       scanf("%d",&item);  
        newNode->data=item;  
       if(head == NULL)  
       {  
           newNode->next = NULL;  
           newNode->prev = NULL;  
           head = newNode;  
       }  
       else  
       {  
          temp = head;  
          while(temp->next!=NULL)  
          {  
              temp = temp->next;  
          }  
          temp->next = newNode;  
          newNode ->prev=temp;  
          newNode->next = NULL;  
		}  
             
       }  
     printf("\nnode inserted\n");  
}  
	
void deletion_last()  
{
	struct node *temp , *secondLastNode;
	if(head == NULL)
	{
		printf("list is alredy empty");
	}
	else
	{
		temp = head;
		secondLastNode = head;
		while(temp->next != NULL)
		{
			secondLastNode = temp;
			temp = temp->next;
		}
		if(temp==head)
		{
			head = NULL;
		}
		else
		{
			secondLastNode -> next = NULL;
			
		}
		free(temp);
		printf("\n last node deleted \n");
	}
}
void display() 
{
	struct node *temp;
	for(temp=head;temp!=NULL;temp=temp->next)
	{
		printf("The elements of link list are :- %d \n ", temp->data);
	}
	
}
