public abstract class Account
{
	protected double minbal, amt;
	protected int acnum;
	
	public Account()
	{
		amt=0;
	}
	
	public double createAccount(double no)
	{
		return acnum;
	}
	public abstract void withdrawBalance(double a);
	public abstract void depositBalance(double a);
	public void closeAccount()
	{
		if(amt==0)
		{
			System.out.println("Account is closed");
			
		}
		amt=0;
	}
	
	
}