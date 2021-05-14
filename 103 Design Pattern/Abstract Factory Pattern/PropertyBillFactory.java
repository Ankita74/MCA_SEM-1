public class PropertyBillFactory extends AbstractBillFactory
{


    public  PropertyBill getPropertyBill(int i) {
        if ( i== 1 )
        {
            return new AbadPropertyBill();
        }
        else if ( i== 2 )
        {
            return new GnagarPropertyBill();
        }
		else if(i==3)
		{
			return new SuratPropertyBill();
		}
        else
        {
            return null;
        }
    }
   
}
