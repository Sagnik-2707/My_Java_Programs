import java.util.*;
public class Error
{
	public static void main(String args[])
	{
		int x,y;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two integers:");
		try
		{
			while(sc.hasNextInt())
			{
				x = sc.nextInt();
				y = sc.nextInt();
				System.out.println("x/y is " +x/y);
			}
		}
		catch (ArithmeticException e)
		{
			System.out.println(e);
		}
		catch (InputMismatchException e)
		{
			System.out.println(e);
		}
		
	}
}

