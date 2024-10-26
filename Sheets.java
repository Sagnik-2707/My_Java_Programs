import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
class Shape
{
	double area;
	void computeArea()
	{
		System.out.println("Override in compute area");
	}
	void displayArea()
	{
		System.out.println("Override in display area");
	}
}
	class Circle extends Shape
	{
		double r;
		Circle(double r)
		{
			this.r = r;
		}
		@Override
		void computeArea()
		{
			super.area = Math.PI * r * r;
		}
		void displayArea()
		{
			System.out.printf(" Circle(%.2f) Area: %.2f\n", r , super.area);
		}
	}
	class Rectangle extends Shape
	{
		double l,b;
		Rectangle(double l, double b)
		{
			this.l = l;
			this.b = b;
		}
		void computeArea()
		{
			super.area = l * b;
		}
		void displayArea()
		{
			System.out.printf(" Rectangle(%.2f, %.2f) Area: %.2f\n", l, b, super.area);
		}
	}
	class Triangle extends Shape
	{
		double h,b;
		Triangle(double h, double b)
		{
			this.h = h;
			this.b = b;
		}
		void computeArea()
		{
			super.area = 0.5*h*b;
		}
		void displayArea()
		{
			System.out.printf(" Triangle(%.2f, %.2f) Area: %.2f\n", h,b,super.area);
		}
	}

public class Sheets
{
	static Shape createShape(int type, Scanner sin)
	{
		Shape obj;
		double a,b;
		switch(type)
		{
			case 1:
			obj = new Circle(sin.nextDouble());
			obj.computeArea();
			break;
			
			case 2:
			obj = new Rectangle(sin.nextDouble(), sin.nextDouble());
			obj.computeArea();
			break;
			
			case 3:
			obj = new Triangle(sin.nextDouble(), sin.nextDouble());
			obj.computeArea();
			break;
			
			default:
			System.out.println("Ignored wrong type");
			obj=null;
			break;
		}
		return obj;
	}
	public static void main(String args[])
	{
		Shape Shapes[] = new Shape[50];
		int n,i=0, sheetType;
		Shape s;
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextInt())
		{
			sheetType = sc.nextInt();
			s = createShape(sheetType,sc);
			if(s!=null)
				Shapes[i++] = s;
		}
		n = i - 1;
		Arrays.sort(Shapes,0,i,new Comparator<Shape>() {
			public int compare(Shape s1, Shape s2)
			{
				if(s1.area > s2.area)
					return 1;
				else if(s1.area < s2.area)
					return -1;
				else
					return 0;
			}
		});
		for(int k=0;k<=n;k++)
		{
			System.out.print(k+ ":");
			Shapes[k].displayArea();
		}
	}
}
		
	
