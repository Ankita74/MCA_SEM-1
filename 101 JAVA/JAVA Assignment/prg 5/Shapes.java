class Shapes
{
	public static void main(String [] args)
	{
		double circle , rect ,triangle;
		Rectangle rc = new Rectangle();
		rect=rc.area();
		System.out.println("Area of Rectangle : " +rect);
		
		Rectangle rc1 = new Rectangle(50,50);
		rect=rc1.area();
		System.out.println("Area of Rectangle : " +rect);
		
		Circle cr = new Circle();
		circle=cr.area();
		System.out.println("Area of Circle : " +circle);
		
		Circle cr1 = new Circle(25);
		circle=cr1.area();
		System.out.println("Area of Circle : " +circle);
		
		Triangle tr = new Triangle();
		triangle=tr.area();
		System.out.println("Area of Triangle : " +triangle);
		
		Triangle tr1 = new Triangle(20,20);
		triangle=tr1.area();
		System.out.println("Area of Triangle : " +triangle);
	}
}