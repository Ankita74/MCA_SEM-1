import java.io.IOException;
import java.util.*;

public class DigitalClock implements Runnable
{
	private String str;
	private Thread t=null;
	
	DigitalClock()
	{
		t=new Thread(this);
		t.start();
	}
	public void run()
	{
		try
		{
			while(true)
			{
				Calendar c = Calendar.getInstance();
				int hh = c.get(Calendar.HOUR_OF_DAY);
				int mm = c.get(Calendar.MINUTE);
				int ss = c.get(Calendar.SECOND);
				Thread.sleep(1000);
				/*if(System.getProperty("os.name").contains("Windows"))
					new ProcessBuilder("cmd" , "/c", "cls").inheritIO().start().waitFor();
				else 
					Runtime.getRuntime().exec("clear");*/
				System.out.println("" +(hh < 10 ? "0" + hh : hh ) + ":" + (mm < 10 ? "0" + mm : mm)
				+ ":" + ( ss < 10 ? "0" + ss : ss));	
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}


	public static void main(String [] args)
	{
		DigitalClock dc = new DigitalClock();
	}

}