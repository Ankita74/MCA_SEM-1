import java.util.Scanner;
import java.util.Arrays;
class java6 
{
	public static void main(String [] args)
	{
		int no,i,j,temp;
		Scanner sc = new Scanner(System.in);
		System.out.println("\n enter numbers you want to assend");
		no=sc.nextInt();
		int [] a= new int[no];
		System.out.println("\n enter all elements");
		for(i=0;i<no;i++)
		{
			a[i]=sc.nextInt();
		}
		/*for (i=0;i<no;i++)
		{
			for(j=i+1;j<no;j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}*/
	Arrays.sort(a);
		System.out.println("\n assending order ");
		for(i=0;i<no;i++)
		{
			System.out.println(a[i]+", ");
		}

	System.out.println(a[no-1]);
		
		
	}
}