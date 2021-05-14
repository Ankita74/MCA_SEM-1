import java.util.Scanner;
import java.util.ArrayList;

public class Pwebsite implements Iwebsite
{
	public String doConnect(String url)
	{
		String ans="";
		ArrayList sites = new ArrayList(3);
		sites.add("www.facebook.com");
		sites.add("www.instagram.com");
		sites.add("www.hike.com");
		sites.add("www.amazone.com");
		sites.add("www.fipcart.com");
		sites.add("www.voot.com");
		sites.add("www.snapchat.com");
		sites.add("www.hangout.com");
		sites.add("www.hotstar.com");
		sites.add("www.vidmate.com");
		boolean st = sites.contains(url);
		
		if(st)
		{
			System.out.print("This Site " + url + " is not allow to access");
		}
		else
		{
		
			Iwebsite iws = new Rwebsite();
			iws.doConnect(url);
		}
		
		
		return ans;
	}
}