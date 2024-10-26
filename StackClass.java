
import java.util.Scanner;
import java.util.Stack;
class StackClass
{
	public static void main(String args[])
	{
		int d;
		Stack<Integer> s = new Stack<Integer>();
		System.out.println("Enter the elements");
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNextInt())
		{
			d = sc.nextInt();
			s.push(d);
		}
		while(!s.isEmpty())
		{
			System.out.println(s.peek());
			s.pop();
		}
	}
}		
