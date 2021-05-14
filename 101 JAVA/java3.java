import java.util.Scanner;
class java3
{
public static void main(String [] args)
{
	int a=10 , b=10 , i , c=10 , d;
	Scanner sc = new Scanner(System.in);
	System.out.println("enter value 1 to 3");
	d=sc.nextInt();
	switch(d)
	{
		case 1:
	if(a==b)
	{
		System.out.println("its same");
	}
	else
	{
		System.out.println("its not same");
	}
		break;
		case 2:
	for(i=0;i<10;i++)
	  {
		System.out.println("value is "+i);
	}
		break;
		case 3:
	do
	{
		System.out.println(c);
		c--;
	}
	while(c>5);
		break;
	}
}
}