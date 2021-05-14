import java.util.Scanner;
class Mycalc
{
	public static void main(String [] args)
	{
		int no1 , no2 , ans ,ch;
		Scanner sc = new Scanner(System.in);
		Addition ad = new Addition();
		Subtraction sb = new Subtraction();
		Multiplication mul = new Multiplication();
		Division div = new Division();
		System.out.println("enter no1 ");
		no1=sc.nextInt();
		System.out.println("enter no2 ");
		no2=sc.nextInt();
		ans=no1+no2;
		while(true)
		{
		System.out.println("1.Addition \n 2.Subtraction \n 3.Multiplication \n 4.Division \n 5.exit");
		System.out.println("Enter choice ");
		ch=sc.nextInt();
		switch(ch)
		{
			case 1:
				ad.setNum1(no1);
				ad.setNum2(no2);
				ans=ad.getSum();
			    System.out.println("addition is\n " + ans);
				break;
			case 2:
				sb.setNum1(no1);
				sb.setNum2(no2);
				ans=sb.getSub();
			    System.out.println("subtraction is \n" + ans);	
				break;
			case 3:
				mul.setNum1(no1);
				mul.setNum2(no2);
				ans=mul.getMul();
			    System.out.println("multiplication is \n" + ans);	
				break;
			case 4:
				div.setNum1(no1);
				div.setNum2(no2);
				ans=div.getDiv();
			    System.out.println("division is \n" + ans);
				break;
			case 5:
				return ;
		}
		}
	}
}