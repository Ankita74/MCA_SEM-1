class Square extends Shape
{
	double ans , a;
	public Square()
	{
		a=0;
		ans=0;
	}
	public void draw()
	{
		System.out.println("This is square");
	}
	public void area(double a)
	{
		ans= a*a;
		System.out.println("area is " + ans);
	}
}