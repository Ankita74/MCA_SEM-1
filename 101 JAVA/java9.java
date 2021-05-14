class value
{
	int data=50;
	
	public void change(int data)
	{
		data=data+100;
	}
	
}
class reference
{
	int data1=100;
	
	public void change1(reference rf)
	{
		rf.data1=rf.data1+100;
	}
}

class java9
{
	public static void main(String [] args)
	{
		value v = new value();
		System.out.println("befor change passed by value " +v.data);
		v.change(100);
		System.out.println("after change passed by value" +v.data);
		
		reference rf = new reference();
		System.out.println("befor change passed by reference " +rf.data1);
		rf.change1(rf);
		System.out.println("after change passed by reference" +rf.data1);
		
	}
}