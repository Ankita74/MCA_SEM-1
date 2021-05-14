public class HospitalTax implements PropertyTextCalculation
{
	public double calculateTax(double amount , double rate , int year)
	{
		return amount * rate * year / 100;
	}
}