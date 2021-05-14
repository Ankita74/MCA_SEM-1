class Decorator
{
	public static void main(String [] args)
	{
		Interface myif = new Msg();
		System.out.println(myif.message());
		Interface myif1 = new UpperMsg(new Msg());
		System.out.println("UPPERCASE:= " +myif1.message());
		Interface myif2 = new LowerMsg(new Msg());
		System.out.println("lowercase :=" +myif2.message());
		System.out.println("Reverse:=");
		Interface myif3 = new ReverseMsg(new Msg());
		System.out.println(myif3.message());
		
	}
	
}