public class SuratWaterBill implements WaterBill
{
	
	double charge,lrt;
	int month;
	public SuratWaterBill()
	{
		charge=0;
		ltr=0;
		month=0;
	}
	public double getWaterBill()
	{
		return (Charge*lrt)*month;
	}
    public void setWaterCharge(double c)
	{
		this.charge=c;
	}
    public void setWaterLtr(double ltr)
	{
		this.lrt=lrt;
	}
	
    public void setNoofMonth(int n)
	{
		this.month=n;
	}
    public String TearmCond()
	{
		return "This is Water Bill of Surat ";
	}
}