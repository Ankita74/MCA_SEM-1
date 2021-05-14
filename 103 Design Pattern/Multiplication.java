import java.util.Scanner;
class Multiplication
{
	private int no1 , no2 , ans;
	public  Multiplication()
	{
		ans=0;
	}
	public  Multiplication(int n1, int n2)
	{
		this.no1=n1;
		this.no2=n2;	
	}
	public void setNum1(int n1)
	{
		this.no1=n1;
	}
	public int getNum1()
	{
		return no1;
	}
	public void setNum2(int n2)
	{
		this.no2=n2;
	}
	public int getNum2()
	{
		return no2;
	}
	private int doMul()
	{
		ans = no1+no2;
		return ans;
	}
	public int getMul()
	{
		ans=doMul();
		return ans;
	}
}