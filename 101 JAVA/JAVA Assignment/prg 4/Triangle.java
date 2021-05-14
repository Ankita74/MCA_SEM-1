class Triangle extends Shape2d
{
	int h , b ;
	int p=10 ,q =20, r=30;
	public Triangle()
	{
		h=100;
		b=10;
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
	public double circumference()
	{
		return p+q+r;
		
	}
}