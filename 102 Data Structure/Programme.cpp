#include<stdio.h>  
#include<stdlib.h>  
struct node  
{  
    struct node *prev;  
    struct node *next;  
    int data;  
};    
struct node *head;

void insertion_specified();
void insertion_first();
void insertion_last(); 
void deletion_first();
void deletion_last();  
void display();  
void deletion_specified();
int main ()  
{  
	
	do{
		int ch;
		printf(" \n Enter your choice... \n 1]insertion_first \n 2]Deletion_first \n 3]insertion_last \n 4]deletion_last \n 5]Insertion_specific \n 6]delete_specific \n 7]Display \n 8]exit.. \n");
		scanf("%d" , &ch);
		switch(ch)
		{
		case 1:
			insertion_first();
			break;
		case 2:
			deletion_first();
			break;
		case 3:
			insertion_last();
			break;
		case 4:
			deletion_last();
			break;
		case 5:
			insertion_specified();
			break;
		case 6:
			deletion_specified();
			break;
		case 7:
				display(); 
				break;
		case 8:
			exit(0);
	

		}
	}while(true);
}




void insertion_first()  
{  
   struct node *node;   
   int item;  
   node = (struct node *)malloc(sizeof(struct node));  
   
    printf("\nEnter value:-");  
    scanf("%d",&item);  
      
   if(head==NULL)  
   {  
       node->next=NULL;  
       node->prev=NULL;  
       node->data=item;  
       head=node;  
   }  
   else   
   {  
       node->data=item;  
       node->prev=NULL;  
       node->next = head;  
       head->prev=node;  
       head=node;  
   }  
  	 printf("\n First Node inserted\n");  
 
     
}  
void deletion_first()  
{  
    struct node *temp;  
    if(head == NULL)  
    {  
        printf("\n list is empty ");  
    }  
    else if(head->next == NULL)  
    {  
        head = NULL;   
        free(head);  
        printf("\n first node deleted\n");  
    }  
    else  
    {  
        temp = head;  
        head = head -> next;  
        head -> prev = NULL;  
        free(temp);  
        printf("\n First node deleted\n");  
    }  
}

void insertion_last()  
{  
   struct node *newNode,*temp;  
   int item;  
   newNode = (struct node *) malloc(sizeof(struct node));  
    
       printf("\nEnter value:-");  
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
          newNode -> prev=temp;  
          newNode->next = NULL;  
		}  
             
        
     printf("\n node inserted at last\n");  
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

void insertion_specified()  
{  
   struct node *newNode,*temp;  
   int item,pos,i;  
   newNode = (struct node *)malloc(sizeof(struct node));  
   printf("Enter value");  
     scanf("%d",&item);  
   if(head == NULL)  
   {  
       printf("\n Unable to allocate memory");  
   }  
   else  
   {  
       temp=head;  
       printf("Enter the position");  
       scanf("%d",&pos);  
       for(i=2;i<=pos-1;i++)  
       {  
           temp = temp->next;  
           if(temp == NULL)  
               break;  
       }  
	   if(temp != NULL)
	   {
		   newNode->data = item;  
		   newNode->next = temp->next;  
		   newNode -> prev = temp;  
		   temp->next = newNode;  
		   temp->next->prev=newNode;  
		   printf("\nnode inserted\n"); 
	   }
   }  
}  

void deletion_specified()  
{  
  
	int i , pos;
	struct node *temp , *prevnode;
	printf("enter position");
	scanf("%d" , &pos);
	if(head == NULL)
	{
		printf("list is empty");
	}
	else
	{
		temp = head;
		prevnode =head;
		for(i=2;i<=pos;i++)
		{
			prevnode = temp;
			temp = temp -> next;
			if(temp == NULL)
				break;
		}
		if(temp != NULL)
		{
	        temp = prevnode -> next;  
	        prevnode -> next = temp -> next;  
	        temp -> next -> prev = prevnode;  
	        free(temp);  
	     }   printf("\nnode deleted\n");  
    }     
}  

void display()  
{  
	if(head == NULL)  
    {  
        printf("\n nothing to print");  
    }   
	else
	{
		struct node *temp;  
		printf("\n printing values...\n");  
		temp = head;  
		while(temp!=NULL)  
		{  
			printf("%d\n",temp->data);  
			temp=temp->next;  
		 }  
	}
}  
