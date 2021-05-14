class Circle
{
	double r=10;
	int x , y;
	public Circle()
	{
		x=0;
		y=0;
	}
	public Circle(double r)
	{
		this.r=r;
	}
	public double area()
	{
		return Math.PI * r * r;
		
	}
}
class CircleDemo
{
	public static void main(String [] s)
	{
		Circle c = new Circle ();
		Circle c1 = new Circle(5);
		System.out.println("Area : " + c.area());
		System.out.println("Area : " + c1.area());
		
		
	}
}