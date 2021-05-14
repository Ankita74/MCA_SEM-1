class me
{
	public void ankita()
	{
	System.out.println("hello i am ankita");
	}
}
class study extends me
{
	public void gvp()
	{
	super.ankita();
	System.out.println("i am studying in gvp");
	}
}
class java15
{
	public static void main(String [] args)
	{
		study st = new study();
		st.gvp();
	}
}