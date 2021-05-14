import java.util.Scanner;
class Stack
{
	
			int [] n = new n [5];
			int value , data ,i , top ;
			Scanner sc = new Scanner(System.in);
			public void Push()
			{
				if(top >=n.length-1)
				{
					System.out.println("Stack is overflow \n");
					return;
				}
				else
				{
					System.out.println("enter value to insert \n");
					data=sc.nextInt();
					
					
				}
			}
			public void Display()
			{
				for(i=top ; i>-1 ; i--)
				{
				System.out.println("Values in stack is" + n[top]);
				}
			}
	
}

class demo
{
	public static void main(String [] args)
	{
		Stack s = new Stack();
		s.Push();
		s.Display();
	}
}