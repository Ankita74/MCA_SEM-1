import java.util.Scanner;

class one
{
		public void oneDimension()
		{
			int i;
			int [] a = new int[5];
				System.out.println("length of array is " + a.length);
				Scanner sc = new Scanner(System.in);
	
				System.out.print("ONE DIMENSIONAL ARRAY \n	 ");
			for (i=0;i<a.length;i++)
			{
				System.out.print("enter any integer value: ");
				a[i]=sc.nextInt();
			}
			for( i=0;i<a.length;i++)
			{
				System.out.println("a ["+ i +"] " + a[i]); 
			}
		}
}
 class two
{
	public void twoDimension()
	{
		int i,j;
		int [][] b = new int[2][3];
		Scanner sc = new Scanner(System.in);
		System.out.println("\n enter elements for twoDimension array");
		for(i=0;i<2;i++)
		{
			for(j=0;j<3;j++)
			{
				b[i][j]=sc.nextInt();
			}
		}
		System.out.println("\n Array is");
		for(i=0;i<2;i++)
		{
			for(j=0;j<3;j++)
			{
				System.out.print(b[i][j]+" ");
	
			}
			System.out.println();
		}	
	}
}
	


	

class java4
{
	public static void main(String [] args)
	{
		one o = new one();
		o.oneDimension();
		two t = new two();
		t.twoDimension();
	}
}