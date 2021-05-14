public class PropertyTax
{
	private PropertyTextCalculation ptc;
	
	public PropertyTax(PropertyTextCalculation ptc)
	{
		this.ptc=ptc;
	}
	public double getTax(double amount , double rate , int year)
	{
		return ptc.calculateTax( amount , rate , year);
	}
}