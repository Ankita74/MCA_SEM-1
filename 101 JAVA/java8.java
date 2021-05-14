import java.util.Scanner;
class java8
{
	public static void main(String [] args)
	{
	int i,j;
	int a[][]={{1,2,3},{2,3,5},{5,6,4}};
	int b[][]={{2,3,4},{2,6,8},{2,4,6}};
	
	int d[][]={{1,2},{2,3}};
	int e[][]={{2,3},{2,6}};
	
	int c[][]= new int[3][3];
	int f[][]= new int[2][2];
	System.out.print(" addition is");
	for(i=0;i<3;i++)
	{
		for(j=0;j<3;j++)
		{
			c[i][j]=a[i][j]+b[i][j];
			System.out.print(c[i][j]+" ");
		}
		System.out.println(" ");
	}
	
		System.out.print(" multiplication is \n");
		
	for(i=0;i<2;i++)
	{
		for(j=0;j<2;j++)
		{
			f[i][j]=d[i][j]*e[i][j];
		
			System.out.print(f[i][j]+" ");
		}
		System.out.println(" ");
	}
	
	

	}
}