import java.util.Scanner;
public class AbstractBillClient
{
	 public static void main(String[] args) 
	 {
		AbstractBillFactory abf;
		int choice1,choice2;
        Scanner in = new Scanner(System.in);
        System.out.println("1. WaterBill");
        System.out.println("2. Electricity Bill");
		System.out.println("3. Property Bill");
        System.err.print("Enter your choice :- ");
        choice1 = in.nextInt();
        System.out.println("1.Abad ");
        System.out.println("2.Gnagar ");
		System.out.println("2.Surat");
        System.out.print("Select  your City :- ");
        choice2 = in.nextInt();
		
		
		abf = AbstractBillFactory.getBill(choice1);

        if (choice1 == 1 )
        {
            WaterBill w = abf.getWaterBill(choice2);
            w.TearmCond();
        }
        else if(choice1 == 2)
        {
            ElectricityBill e = abf.getElectricityBill(choice2);
            e.TearmCond();
        }
		else if (choice1 == 3)
		{
			PropertyBill p = abf.getPropertyBill(choice2);
			p.TearmCond();
		}
	 }
}