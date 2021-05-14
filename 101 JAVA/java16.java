class add
{
	public void add1()
	{
		int a=10 , b=20,c;
		c=a+b;
		System.out.print("addition is :- " + c + "\n");
		
	}
	public void add1(int c , int d)
	{
		int e;
		e=c+d;
		System.out.print("addition is :-" + e);
	}
}
class java16
{
	public static void main(String [] args)
	{
		add a= new add();
		a.add1();
		a.add1(20,30);
	}
}