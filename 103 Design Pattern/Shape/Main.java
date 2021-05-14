import java.util.Scanner;
class Main
{
	public static void main(String [] args)
	{
		double r , a ,l ,b;
		Scanner sc = new Scanner(System.in);
		while(true)
		{
		System.out.println(" \n 1.Class circle 2.class square 3.class rectangle 4.exit ");
		System.out.println("enter your choice");
		int ch = sc.nextInt();
		switch(ch)
		{
			case 1:
				Circle c = new Circle();
				c.draw();
		        c.fill();
				System.out.println("enter radious");
				 r = sc.nextInt();
				c.area(r);
				break;
			
			case 2:
				Square s = new Square();
				s.draw();
				s.fill();
				System.out.println("enter A");
				 a =sc.nextInt();
				s.area(a);
				break;
			
			case 3:
				Rectangle rct = new Rectangle();
				rct.draw();
				rct.fill();
				System.out.println("enter L");
				l =sc.nextInt();
				System.out.println("enter B");
				b =sc.nextInt();
				rct.area(l,b);
				break;
			case 4:
				return;
		}
		}
	}
}

