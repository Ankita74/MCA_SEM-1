public class SavingBankAccount extends Account 
{
	protected double minbal=1000, amt;
	protected int acnum;
	

	public SavingBankAccount()
	{
		System.out.println("SavingBankAccount constructor");
	}
	

	public void withdrawBalance(double a)
	{
		if(a<10000)
		{
			if (a<amt-minbal)
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
			System.out.println("please enter amount less than 10000");
		}
	}
	public void depositBalance(double a)
	{
		  amt= amt+a;
		  System.out.println("your amount is "+ amt);
	}


}