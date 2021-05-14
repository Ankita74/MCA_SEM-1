import java.util.Scanner;
class prime
{
	public void p()
	{
		
		int no;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number to check whether number is prime or not");
		no=sc.nextInt();
		if(no%2==0)
		{
			System.out.println(+no+" is not prime");
		}
		else
		{
			System.out.println(+no+" is prime");	
		}
	}
}
class sum
{
	public void s()
	{
		int sum=0;
		int i;
		int [] a = new int[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number for sum");
		for(i=0;i<a.length;i++)
		{
		    a[i]=sc.nextInt();
			
		}
		for(i=0;i<a.length;i++)
		{
		  sum=sum+a[i];
		}
		  System.out.println("sum is " + sum);
	
	}
}
class java7
{
	public static void main(String [] args)
	{
		prime p1 = new prime();
		p1.p();
		sum s1 = new sum();
		s1.s();
	}
}