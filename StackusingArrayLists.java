import java.util.ArrayList;
import java.util.Scanner;
class StackusingArrayLists
{
	static class Stack
	{
		static ArrayList<Integer> list = new ArrayList<Integer>() ;
		public static boolean isEmpty()
		{
			return list.size() == 0;
		}
		public static void push(int x)
		{
			list.add(x);
		}
		public static int pop()
		{
			if(isEmpty())
				return -1;
			int p = list.get(list.size()-1);
			list.remove(list.size() - 1);
			return p;
		}
		public static int peek()
		{
			if(isEmpty())
				return -1;
			int p = list.get(list.size() - 1);
			return p;
		}
	}
	public static void main(String args[])
	{
		int d,i;
		Stack s = new Stack();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter elements to push");
		while(sc.hasNextInt())
		{	
			d = sc.nextInt();
			s.push(d);
		}
		while(!s.isEmpty())
		{
			System.out.print(s.peek() +" ");
			s.pop();
		}
		System.out.println();
	}
}
		
