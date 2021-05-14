public class PersonalLoanAccount implements LoanAccount
{
	double lamt ,rate;
	int year;
	
	public PersonalLoanAccount()
	{
		lamt = 0.0;
		rate =0.0;
		year =0;
		
	}
		
	public double getInterest()
	{
		return lamt-(lamt*rate*year)/100;
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
		return " This is Personal loan Account ";
	}
}