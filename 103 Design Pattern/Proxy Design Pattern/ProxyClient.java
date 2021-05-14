import java.util.Scanner;
public class ProxyClient
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		Iwebsite ib = new Pwebsite();
		System.out.print("Enter Website name .... ");
		String site = sc.next();
		ib.doConnect(site);
	}
}	