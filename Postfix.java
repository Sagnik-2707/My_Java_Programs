import java.util.*;
class Stack
{
	int top = -1;
	int arr[] = new int[100];
	public boolean isEmpty()
	{
		return top == -1;
	}
	public boolean isFull()
	{
		return top == 99;
	}
	public void push(int x)
	{
		if(! isFull())
			arr[++top] = x;
	}
	public int pop()
	{
		if(isEmpty())
			System.exit(0);
			
		return arr[top--];
	}
}
 public class Postfix
 {
 	public static void main(String args[])
 	{
 		Scanner sc = new Scanner(System.in);
 		String in = sc.nextLine();
 		String exp[] = in.split(" ");
 		Stack s = new Stack();
 		int i,n;
 		String ch;
 		int a,b;
 		for(i=0;i<exp.length;i++)
 		{
 			ch = exp[i];
 			switch(ch)
 			{
 				case "+":
 					a = s.pop();
 					
 					b = s.pop();
 					s.push(b + a);
 					break;
 				case "-":
 					a = s.pop();
 					
 					b = s.pop();
 					s.push(b - a);
 					break;
 				case "*":
 					a = s.pop();
 					b= s.pop();
 					s.push(b * a);
 					break;
 				case "/":
 					a = s.pop();
 					
 					b = s.pop();
 					s.push(b / a);
 					break;
 				default:
 					s.push(Integer.parseInt(ch));
 				}
 			}
 			System.out.println("RESULT:" +s.pop());
 	}
 }
 	
 			
	
