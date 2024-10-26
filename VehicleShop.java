import java.util.*;
class Vehicle
{
	public void startEngine()
	{
		System.out.println("Override in other classes.");
	}
	public void stopEngine()
	{
		System.out.println("Override in other classes.");
	}
}

class Car extends Vehicle
{
	public void startEngine()
	{
		System.out.println("Car's engine is starting.");
	}
	public void stopEngine()
	{
		System.out.println("Car's engine stopped.");
	}
}

class Motorcycle extends Vehicle
{
	public void startEngine()
	{
		System.out.println("Motorcycle's engine is starting.");
	}
	public void stopEngine()
	{
		System.out.println("Motorcycle's engine stopped.");
	}
}

public class VehicleShop
{
	public static void main(String args[])
	{
		int ch;
		System.out.println("Welcome buyer...What do you want to buy?\n1.Car\n2.Motorcycle");
		Scanner sc = new Scanner(System.in);
		ch = sc.nextInt();
		if(ch == 1 || ch == 2)
		{
			if(ch == 1)
			{
				Car c = new Car();
				System.out.println("Thanks for purchasing a car. Here are the two functionalities we provide...");
				c.startEngine();
				c.stopEngine();
			}
			else if(ch == 2)
			{
				Motorcycle m = new Motorcycle();
				System.out.println("Thanks for purchasing a motorcycle. Here are the two functionalities we provide...");
				m.startEngine();
				m.stopEngine();
			}
		}
		else
		{
			System.out.println("You came to the wrong shop...");
			System.exit(0);
		}
	}
}

