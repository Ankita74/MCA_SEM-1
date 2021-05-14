public class HomeLoanAccount implements LoanAccount
{
	double lamt ,rate;
	int year;
	
	public HomeLoanAccount()
	{
		
		lamt = 0.0;
		rate =0.0;
		year =0;
		
	}
		
	public double getInterest()
	{
		return System.out.print("HomeLoanAccount Interest is:-" );
		return (lamt*rate*year)/100;
	}
	public void setRetofInterest(double r)
	{
		this.rate=r;
	}
	public void setLoanAmount(double amt)
	{
		this.lamt=amt;
	}
	public void setNoofYear(int n)
	{
		this.year=n;
	}
	public String TermCondition()
	{
		return "This is Homeloan Account  ";
	}
}