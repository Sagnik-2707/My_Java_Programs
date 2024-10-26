import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;
import java.util.InputMismatchException;
class Student
{
	int marks;
	int roll;
	Student(int roll, int marks)
	{
		this.roll = roll;
		this.marks = marks;
	}
}

class Students
{
	Student students[] = new Student[50];
	int size = 0;
	public void addStudents()
	{
		int roll,marks;
		Scanner sc = new Scanner(System.in);
		try
		{
			while(true)
			{
				roll = sc.nextInt();
				if(roll<0)
				{
					System.out.println("ERROR: Invalid Roll.");
					break;
				}
				if(roll == 0)
					break;
				try{
					marks = sc.nextInt();
					if(marks < 0)
					{	
						System.out.println("ERROR: Invalid Marks.");
						System.exit(0);
					}
					
					Student ob = new Student(roll,marks);
					students[size++] = ob;
				}
				catch(InputMismatchException e)
				{
					System.out.println("ERROR: Invalid Marks.");
					System.exit(0);
				}
			}
		}
		catch(InputMismatchException e)
		{
			System.out.println("ERROR: Invalid Roll");
			System.exit(0);
		}
	}
	public void dispStudents()
	{
		if(size == 0)
		{
			System.out.println("ERROR: Empty List");
		}
		else
		{
		Arrays.sort(students, 0 ,size, new Comparator<Student> () {
			public int compare(Student s1, Student s2)
			{
				return s1.marks - s2.marks;
			}
		});
		System.out.print(students[size-1].roll+" ");
		System.out.println(students[size-1].marks);
	}
}
}
public class StudentMarks
{
	public static void main(String args[])
	{
		Students ss = new Students();
		ss.addStudents();
		ss.dispStudents();
	}
}

