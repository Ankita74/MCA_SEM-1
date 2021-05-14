public class StrategyPattern 
{
	public static void main(String[] args) 
	{
		PropertyTax pt = new PropertyTax(new ResidentalTax());
		System.out.println("Residental Tax is :- " + pt.getTax(1000000 , 10 , 1));
		
		 pt = new PropertyTax(new CommercialTax());
		System.out.println("Commercial Tax is :- " + pt.getTax(1000000 , 15 , 1));
		
		pt = new PropertyTax(new EducationalTax());
		System.out.println("Educational Tax is :- " + pt.getTax(1000000 , 2 , 1));
		
		 pt = new PropertyTax(new HospitalTax());
		System.out.println("Hospital Tax is :- " + pt.getTax(1000000 , 1 , 1));
	}
}
