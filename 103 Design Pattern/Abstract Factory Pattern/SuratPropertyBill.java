public class SuratPropertyBill implements PropertyBill
{
	
	double rant;
	int month;
	public SuratPropertyBill()
	{
		rant=0;
		month=0;
	}
	public double getWaterBill()
	{
		return (rant/8*100)*month;
	}
    public void setWaterCharge(double rant)
	{
		this.rant=rant;
	}
   
    public void setNoofMonth(int n)
	{
		this.month=n;
	}
    public String TearmCond()
	{
		return "This is Property Bill of Surat ";
	}
}