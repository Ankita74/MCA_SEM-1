import java.util.Scanner;
public class LoanAccountClient
{
	public static void main(String [] args)
	{
		LoanAccount lc;
		int ch , amt;
		Scanner sc = new Scanner(System.in);
		System.out.println("1.HomeloanAccount");
		System.out.println("2.PersonalloanAccount");
		System.out.println("3.VehiloanAccount");
		System.out.println("Enter your choice");
		ch=sc.nextInt();
		lc = LoanFactory.getLoanAccount(ch);
		lc.setRetofInterest(12);
		System.out.println("Enter amount for loan");
		amt=sc.nextInt();
		lc.setLoanAmount(amt);
		lc.setNoofYear(3);
		System.out.print("Loan Interest is :- ");
		System.out.println(lc.getInterest());
		System.out.println(lc.TermCondition());
		
		
	}
}