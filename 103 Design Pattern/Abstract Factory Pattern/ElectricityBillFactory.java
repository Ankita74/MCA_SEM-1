public class ElectricityBillFactory extends AbstractBillFactory
{


    public  ElectricityBill getElectricityBill(int i) {
        if ( i== 1 )
        {
            return new AbadElectricityBill();
        }
        else if ( i== 2 )
        {
            return new GnagarElectricityBill();
        }
		else if(i==3)
		{
			return new SuratElectricityBill();
		}
        else
        {
            return null;
        }
    }
   
}
