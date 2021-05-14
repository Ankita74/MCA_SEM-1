class Shapes
{
	public static void main(String [] args)
	{
		double area , ans;
		double area1 , ans1;
		double area2 , ans2;
		Rectangle rc = new Rectangle();
		area=rc.area();
		ans=rc.circumference();
		System.out.println("Area of Rectangle : " +area);
		System.out.println(" circumference of Rectangle : " +ans);
		
		Rectangle rc1 = new Rectangle(5,5);
		area=rc1.area();
		ans=rc1.circumference();
		System.out.println("Area of Rectangle : " +area);
		System.out.println("circumference of Rectangle : " +ans);
		
		Circle cr = new Circle();
		area1=cr.area();
		ans1=cr.circumference();
		System.out.println("Area of Circle : " +area1);
		System.out.println("circumference of Circle : " +ans1);
		
		Circle cr1 = new Circle(5);
		area1=cr1.area();
		ans1=cr1.circumference();
		System.out.println("Area of Circle : " +area1);
		System.out.println("circumference of Circle : " +ans1);
		
		Triangle tr = new Triangle();
		area2=tr.area();
		ans2=tr.circumference();
		System.out.println("Area of Triangle : " +area2);
		System.out.println(" circumference of Triangle : " +ans2);
		
		Triangle tr1 = new Triangle(20,20);
		area2=tr1.area();
		ans2=tr1.circumference();
		System.out.println("Area of Triangle : " +area2);
		System.out.println("circumference of Triangle : " +ans2);
	}
}