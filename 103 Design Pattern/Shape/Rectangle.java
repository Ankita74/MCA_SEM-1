class Rectangle extends Shape
{
	double ans , l,b;
	public Rectangle()
	{
		l=0;
		b=0;
		ans=0;
	}
	public void draw()
	{
		System.out.println("This is square");
	}
	public void area(double l,double b)
	{
		ans= l*b;
		System.out.println("area is " + ans);
	}
}