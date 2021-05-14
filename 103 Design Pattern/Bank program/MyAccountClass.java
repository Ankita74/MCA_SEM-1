import java.util.Scanner;
class MyAccountClass
{
	public static void main(String [] args)
	{
		double no ,a;
		int ch;
		Scanner sc =new Scanner(System.in);
		SavingBankAccount sba = new SavingBankAccount();
		CurrentBankAccount cba = new CurrentBankAccount();
		while(true)
		{
		System.out.println("\nFor Saving bank account \n 1.create account 2.deposit 3.withdraw 4.close account ");
		System.out.println("For current bank account \n 5.create account 6.deposit 7.withdraw 8.close account 9.exit");
		System.out.println("enter tour choice");
		ch=sc.nextInt();
		
		switch(ch)
		{
			case 1:
			
				System.out.println("enter account no");
				no=sc.nextDouble();
				sba.createAccount(no);
				System.out.println("account created your ac number is "+no);
				break;
			case 2:	
				System.out.println("enter amount you want to deposit");
				a=sc.nextDouble();
				sba.depositBalance(a);
				break;
			case 3:	
				System.out.println("enter amount you want to withdraw");
				a=sc.nextDouble();
				sba.withdrawBalance(a);
				break;
			case 4:	
				sba.closeAccount();
				break;
			
			case 5:
				System.out.println("enter account no");
				no=sc.nextDouble();
				cba.createAccount(no);
				System.out.println("account created your ac number is "+no);
				break;
			case 6:	
				System.out.println("enter amount you want to deposit");
				a=sc.nextDouble();
				cba.depositBalance(a);
				break;
			case 7:	
				System.out.println("enter amount you want to withdraw");
				a=sc.nextDouble();
				cba.withdrawBalance(a);
				break;
			case 8:	
				cba.closeAccount();
				
				break;
			case 9:
				return ;
		}
		}
	}
}