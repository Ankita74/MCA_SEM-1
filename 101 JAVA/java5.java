class java5
{
	public static void main(String [] args)
	{
		/*int n=5,i,j;
		for(i=n;i>=1;i--)
		{
			for(j=i;j<=5;j++)
			{
			System.out.print(j);
			}
			System.out.println("");
		}*/
		
		int i,j;
		for(i=1;i<=7;i++)
		{
			for(j=1;j<=i;j++)
			{
				if(j==1 || j==i)
				System.out.print(1);
				else
				System.out.print(0);
			
			}
			System.out.println("\n");
			
		}	
	}
}