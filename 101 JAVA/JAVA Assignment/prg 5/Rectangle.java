class Rectangle implements Shape2d
{
	int l , b ;
	public Rectangle()
	{
		l=15;
		b=15;
	}
	public Rectangle(int x , int y)
	{
		this.l=x;
		this.b=y;
	}
	public double area()
	{
		return l*b;
	
	}
}