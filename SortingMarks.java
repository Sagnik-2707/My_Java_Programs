import java.util.Arrays;
import java.util.Scanner;
import java.util.Comparator;
class Student
{
	String name;
	int marks;

	public void accept_details()
	{
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name of student.");
		name = sc.nextLine();
		System.out.println("Enter marks of students.");
		marks = sc.nextInt();
	}
	public void display_details()
	{
		System.out.println("Name: " +name+ " , Marks: " +marks);
	}	

}	
public class SortingMarks
{
	public static void main(String args[])
	{
		int n;
		System.out.println("Enter number of students.");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		Student students[] = new Student[n];
		for(int i=0;i<n;i++)
		{
			students[i] = new Student();
			students[i].accept_details();
		}
		Arrays.sort(students, new Comparator<Student>(){
			public int compare(Student s1, Student s2)
			{
				return s1.marks - s2.marks;
			}
		});
		
		System.out.println("The sorted array of students in ascending order of marks.");
		for(int i=0;i<students.length;i++)
		{
			students[i].display_details();
		}
	}
}

