class Rectangle extends Shape2d
{
	int l , b ;
	public Rectangle()
	{
		 l=10;
		b=10;
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
	public double circumference()
	{
		return 2*l+b;
		
	}
}