class Circle implements Shape2d
{
	int r;
	public Circle()
	{
		r=10;
	}
	public Circle(int r)
	{
		this.r=r;
	}
	public double area()
	{
		return Math.PI * r * r;
	}
}