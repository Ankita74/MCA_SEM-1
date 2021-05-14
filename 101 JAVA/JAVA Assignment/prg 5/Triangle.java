class Triangle implements Shape2d
{
	int h , b ;
	public Triangle()
	{
		h=50;
		b=40;
	}
	public Triangle(int x , int y)
	{
		this.h=x;
		this.b=y;
	}
	public double area()
	{
		return h * b / 2;
	
	}
}