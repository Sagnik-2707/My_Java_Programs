import java.util.Scanner;
class Array1
{
	public static void main(String args[])
	{
		int i,n;
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		System.err.println("Enter the size of the array: ");
		n=sc.nextInt();
		int a[] = new int[n];
		System.out.println("Enter the elements of array: ");
		for(i=0;i<n;i++)
		{
			a[i] = sc.nextInt();
		}
		for(i=0;i<n;i++)
		{
			sum = sum + a[i];
		}
		System.out.println("The sum of the elements of the array is:" +sum);
	}
}

