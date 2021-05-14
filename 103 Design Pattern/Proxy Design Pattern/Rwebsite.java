public class Rwebsite implements Iwebsite
{
	public String doConnect(String url)
	{
		System.out.println("Connecting to " + url);
		
		return url;
	}
}