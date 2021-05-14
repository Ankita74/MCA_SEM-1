class OddThread extends Thread
{
	public void run()
	{
		for(int i = 1 ; i<100 ; i++)
		{
			if (i%2!=0)
			{
				System.out.println( "Odd numbers :" +i);
			}
			try{
				Thread.sleep(500);
			}catch(InterruptedException e){
				e.printStackTrace();
			}
		}
	}
}
class PrimeThread implements Runnable
{
	public void run()
	{
		int i ,j, n=100 , count=0;
		for (i=2;i<=n;i++)
		{
			for(j=1;j<=1;j++)
			{
				if(i%j==0)
				{
					count++;
					
				}
				if(count==2)
				{
					System.out.println(" Prime numbers:" +i);
					count=0;
				}
				try{
					Thread.sleep(1000);
				}catch(InterruptedException e){
					e.printStackTrace();
				}
			}
		}
	}
}
class MultiThread
{
	public	static void main(String [] args)
	{
		OddThread od = new OddThread();
		od.start();
		PrimeThread pm = new PrimeThread();
		Thread t = new Thread(pm);
		t.start();
	}
}