import java.util.Scanner;
interface Shape
{
	public void area();
}
class Square implements Shape
{
	double length,ar;
	Square(double length)
	{
		this.length = length;
		ar = 0.0;
	}
	public void area()
	{
		ar = length * length;
		System.out.println("The area of square is:" +ar);
	}
}
class Triangle implements Shape
{
	double height,base,ar;
	Triangle(double height, double base)
	{
		this.height = height;
		this.base = base;
		ar = 0.0;
	}
	public void area()
	{
		ar = 0.5 * height * base;
		System.out.println("The area of triangle is: " +ar);
	}
}
public class Area
{
	public static void main(String args[])
	{
		int ch;
		Scanner sc = new Scanner(System.in);
		do
		{
			System.out.println("1. Area of square\n2. Area of triangle\n3. Exit");
			ch = sc.nextInt();
			switch(ch)
			{
				case 1:
					System.out.println("Enter the length of side of square:");
					double length = sc.nextDouble();
					Square ob1 = new Square(length);
					ob1.area();
					break;
				case 2:
					System.out.println("Enter height and base of triangle:");
					double height = sc.nextDouble();
					double base  = sc.nextDouble();
					Triangle ob2 = new Triangle(height, base);
					ob2.area();
					break;
				case 3:
					System.out.println("EXITING...");
					System.exit(0);
					break;
				default:
					System.out.println("Invalid choice");
			}
		}while(ch>0);
	}
}

