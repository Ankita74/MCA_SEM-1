
public abstract class Shape
{
	
	String color="red";
	public Shape()
	{
		System.out.println("Shape constructor");
	}
	
	public abstract void draw();
	public void fill()
	{
		
		System.out.println("color is "+ color);
	}
}