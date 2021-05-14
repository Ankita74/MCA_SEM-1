class addition
{
	public void add()
	{
		int a=10,b=10;
		int c=a+b;
		System.out.print("addition:-" + c +"\n");
	}

}
class addition1 extends addition
{
	public void add()
	{
		int a=20,b=20;
		int c=a+b;
		System.out.print("addition:-"+c);
	}
}
class java17
{
	public static void main(String [] args)
	{
		addition ad = new addition();
		addition ad2 = new addition1();
		ad.add();
		ad2.add();
		
	}
}