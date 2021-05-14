public class LoanFactory
{
	public static LoanAccount getLoanAccount(int acctype)
	{
		
		if(acctype == 1)
		{
			System.out.println("Welcome to the HomeLoanAccount");
			return new HomeLoanAccount();
		}
		else if (acctype == 2)
		{ 
		System.out.println("Welcome to the PersonalLoanAccount");
			return new PersonalLoanAccount();
			
		}
		else if (acctype == 3)
		{
		System.out.println("Welcome to the VehicleLoanAccount");
			return new VehicleLoanAccount();
		}
		else
		{
			return null;
		}
		
		
	}
}
