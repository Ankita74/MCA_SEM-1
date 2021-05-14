class Circle extends Shape
{
	double ans , r;
	public Circle()
	{
		r=0;
		ans=0;
	}
	public void draw()
	{
		System.out.println("This is circle");
	}
	public void area(double r)
	{
		ans=Math.PI * r * r;
		System.out.println("area is " + ans);
	}
}