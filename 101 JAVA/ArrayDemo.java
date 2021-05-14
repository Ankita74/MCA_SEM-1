import java.util.Scanner;

class ArrayDemo
{
	public static void main(String [] arg)
	{
		int [] a = new int[5];
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<a.length;i++)
		{
			
			
			System.out.print("enter any integer value: ");
			a[i]=sc.nextInt();
			
		}
		for(int i=0;i<a.length;i++)
		{
		System.out.println("a ["+ i +"] " + a[i]); 
		}

	}
}