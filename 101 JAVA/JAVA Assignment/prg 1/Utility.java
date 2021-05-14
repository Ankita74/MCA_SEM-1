class EvenOdd
{
	public static boolean evOd(int n)
	{
		if(n%2==0)
		{
			return true;
		}
	
	return false;
	}
}
class PrimeNot
{
	public static boolean isPrime(int value)
	{
		int i;
		for (i=2;i<=value/2;i++)
		{
			if(value%i==0)
			{
				return false;
			}
		}
	return true;
	}
}
public class Utility
{
	public static void main(String [] args)
	{
		EvenOdd ed = new EvenOdd();
		boolean result=ed.evOd(10);
		System.out.println(result);
		
		PrimeNot pm = new PrimeNot();
		boolean ans=pm.isPrime(10);
		System.out.println(ans);
		
	}
}