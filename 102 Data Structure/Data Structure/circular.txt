#include<stdio.h>  
#include<stdlib.h>  
struct node  
{    
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
	display();  
	deletion_last(); 
	display();  
	deletion_last(); 
    display();  	
}
void insertion_last()
 {  
    struct node *newNode,*temp;   
    int item;  
    newNode = (struct node *)malloc(sizeof(struct node));  
    if(newNode == NULL)  
    {  
        printf("\nOVERFLOW\n");  
    }  
    else  
    {  
        printf("\nEnter Data");  
        scanf("%d",&item);  
        newNode->data = item;  
        if(head == NULL)  
        {  
            head = newNode;  
            newNode -> next = head;    
        }  
        else  
        {  
            temp = head;  
            while(temp -> next != head)  
            {  
                temp = temp -> next;  
            }  
            temp -> next = newNode;   
            newNode -> next = head;  
        }  
          
        printf("\nnode inserted\n");  
    }  
  
}  
  
void deletion_last()  
{  
    struct node *newNode, *preNode;  
    if(head==NULL)  
    {  
        printf("\nUNDERFLOW");  
    }  
    else if (head ->next == head)  
    {  
        head = NULL;  
        free(head);  
        printf("\nnode deleted\n");  
  
    }  
    else   
    {  
        newNode = head;  
        while(newNode ->next != head)  
        {  
            preNode=newNode;  
            newNode = newNode->next;  
        }  
        preNode->next = newNode -> next;  
        free(newNode);  
        printf("\nnode deleted\n");  
  
    }  
}  
  
void display()  
{  
    struct node *newNode;  
    newNode=head;  
    if(head == NULL)  
    {  
        printf("\nnothing to print");  
    }     
    else  
    {  
        printf("\n printing values ... \n");  
          
        while(newNode -> next != head)  
        {  
          
            printf("%d\n", newNode -> data);  
            newNode = newNode -> next;  
        }  
         printf("%d\n", newNode -> data);  
     
    }  
              
}  