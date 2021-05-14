import java.util.Scanner;
 public class FacadeDemo 
{
   public static void main(String[] args)
   {
      AccountMaker am = new AccountMaker();
		Scanner sc = new Scanner(System.in);
		System.out.println("which bank account you want to create");
		System.out.println("1.Bob , 2.DenaBank , 3.Icici");
		int a = sc.nextInt();
		if(a==1)
			am.createBob();
		else if(a==2)
			am.createDenaBank();
		else
			am.createIcici();		
   }
}