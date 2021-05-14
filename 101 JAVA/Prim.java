import java.util.Scanner;

class Prim
{
	public static void main(String [] s)
	{
		Scanner sc = new Scanner(System.in);
		int prino = sc.nextInt();
		boolean flg=false;
		for(int i=2;i<Math.sqrt(prino);i++)
		{
			if(prino % i == 0)
			{
				System.out.println("number " + prino + "is not prime");
				flg=true;
				break;
				
			}
		
		}
		if(flg==false)
		{
			System.out.println("number " + prino + " is prime");
		}
	}
}