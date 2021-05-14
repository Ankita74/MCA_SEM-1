import java.util.Scanner;
public class Addition
{
	private int no1 , no2 , ans;
	public  Addition()
	{
		ans=0;
	}
	public  Addition(int n1, int n2)
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
	private int doSum()
	{
		ans = no1+no2;
		return ans;
	}
	public int getSum()
	{
		ans=doSum();
		return ans;
	}
}