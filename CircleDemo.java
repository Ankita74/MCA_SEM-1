class Circle
{
	double r;
	public double area()
	{
		return Math.PI * r * r;
		
	}
	public void setR(double r)
	{
		this.r=r;
	}
 
}
class CircleDemo
{
	public static void main(String [] s)
	{
		Circle c = new Circle ();
		c.setR(5);
		System.out.println("Area : " + c.area());
		
		
	}
}