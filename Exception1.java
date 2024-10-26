import java.util.Scanner;
public class Exception1
{
	public static void main(String args[])
	{
		int m,n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers");
		try
		{	
			m = sc.nextInt();
			n = sc.nextInt();
			System.out.println(m/n);		
		}
		catch(ArithmeticException e)
		{
			System.out.println("Divison by zero not possible");
		}
	}
}

			
