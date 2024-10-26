import java.util.*;
import java.util.InputMismatchException;
class Student
{
	String name;
	int m1,m2,m3;
	int total;
	public void enterDetails()
	{
		Scanner sc = new Scanner(System.in);
		try{
		System.out.println("Enter name of student.");
		name = sc.nextLine();
		System.out.println("Enter marks1.");
		m1 = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter marks2.");
		m2 = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter marks3.");
		m3 = sc.nextInt();
		sc.nextLine();
		}
		catch(InputMismatchException e)
		{
			System.out.println("Invalid input.");
			System.exit(0);
		}
		
	}
	/*public void calculateTotal()
	{
		total = m1 + m2 + m3;
	}
	*/	
	public int getTotal()
	{
		return m1 + m2 + m3;
	}	
	public void displayDetails()
	{
		System.out.println("Name: " +name+ " Total Marks: " +getTotal());
	}	
}		
		
		
		
		
		
		
		
		
public class Sorting3
{
	public static void main(String args[])
	{
		int n;
		System.out.println("Enter the number of students.");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		sc.nextLine();
		Student[] students = new Student[n];
		int marks[] = new int[n];
		for(int i=0;i<n;i++)
		{
			students[i] = new Student();
			students[i].enterDetails();
			marks[i] = students[i].getTotal();
		}
		for(int i=0;i<n-1;i++)
		{
			for(int k=0;k<n-(i+1);k++)
			{
				if(marks[k] > marks[k+1])
				{
					int temp1 = marks[k];
					marks[k] = marks[k+1];
					marks[k+1] = temp1;
					
					Student temp2 = new Student();
					temp2 = students[k];
					students[k] = students[k+1];
					students[k+1] = temp2;
				}
			}
		}
		for(int i=0;i<n;i++)
		{
			students[i].displayDetails();
			//System.out.print(marks[i]+" ");
		}
	}
}
		
