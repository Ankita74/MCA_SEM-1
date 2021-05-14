class Circle extends Shape2d
{
	int r;
	public Circle()
	{
		r=20;
	}
	public Circle(int r)
	{
		this.r=r;
	}
	public double area()
	{
		return Math.PI * r * r;
	}
	public double circumference()
	{
		return 2 * Math.PI *r;
	}
}