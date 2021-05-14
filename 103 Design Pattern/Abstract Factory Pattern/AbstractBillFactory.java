public abstract class AbstractBillFactory 
{
    public abstract WaterBill getWaterBill(int i );
    public abstract ElectricityBill getElectricityBill(int i );
	public abstract PropertyBill getPropertyBill(int i);
    public static AbstractBillFactory getBill(int i)
    {
		
        if ( i == 1 )
        {
            return new WaterBillFactory();
        }
        else if(i == 2 )
        {
            return new ElectricityBillFactory();
        }
        else if(i == 3)
		{
			return new PropertyBillFactory();
		}
        {
            return null;
        }
	
    }
}
