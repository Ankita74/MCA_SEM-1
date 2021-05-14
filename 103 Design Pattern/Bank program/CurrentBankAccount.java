public class CurrentBankAccount extends Account 
{
	protected double minbal=500, amt;
	protected int acnum;
	

	public CurrentBankAccount()
	{
		System.out.println("CurrentBankAccount constructor");
	}
	
	public void withdrawBalance(double a)
	{
		if(a<20000)
		{
			if( a<amt-minbal)
			{
				amt=amt-a;
				 System.out.println(+ a +" rs withdraw successfully");
				System.out.println("your amount is "+ amt);
				
			}
			else
			{
				System.out.println("you dont have amount to withdraw");
			}
		}
		else
		{
			System.out.println("please enter amount less than 20000");
		}
		
	}
	public void depositBalance(double a)
	{
		  amt= amt+a;
		  System.out.println("your amount is "+ amt);
	}


}