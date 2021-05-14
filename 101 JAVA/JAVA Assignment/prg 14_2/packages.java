import org.gvp.dcs.shapes.*;
import org.gvp.dcs.ds.*;

class packages
{
	public static void main(String [] args)
	{
		Cube c = new Cube(10);
		System.out.println("volume of cube is :- "+c.volume());
		
		Sphere sp = new Sphere(10);
		System.out.println("volume of Sphere is :- "+sp.volume());
		
		Queue q = new Queue();
		q.deQueue();

		for(int i = 1; i < 6; i ++) {
		  q.enQueue(i);
		}
		q.enQueue(6);
		q.display();
		q.deQueue();
		q.display();

		
	}
} 