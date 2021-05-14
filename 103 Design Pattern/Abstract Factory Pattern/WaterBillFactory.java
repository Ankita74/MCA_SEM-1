public class WaterBillFactory extends AbstractBillFactory
{
	
    public  WaterBill getWaterBill(int i) 
	{
		 if( i == 1 )
        {
            return new AbadWaterBill();
        }
      else if( i== 2 )
        {
            return new GnagarWaterBill();
        }
		else if(i==3)
		{
			return new SuratWaterBill();
		}
        else
        {
            return null;
        }
	
    }
    
}
