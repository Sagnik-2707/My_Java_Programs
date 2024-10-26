import java.util.Scanner;
class Array2
{
	public static void main(String args[])
	{
		int i,n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of original array:");
		n=sc.nextInt();
		int a[] = new int[n];
		double s[] = new double[n];
		double c[] = new double[n];
		System.out.println("Enter the elements of the original array: ");
		for(i=0;i<n;i++)
		{
			a[i] = sc.nextInt();
		}
		for(i=0;i<n;i++)
		{
			s[i] = Math.pow(a[i], 2);
			c[i] = Math.pow(a[i], 3);
		}
		System.out.println("The elements of the original arrays are: ");
		for(i=0;i<n;i++)
		{
			System.out.print(a[i] +"\t");
		}
		System.out.println();
		for(i=0;i<n;i++)
		{
			 System.out.print(+s[i] + "\t");
		}
		System.out.println();
		for(i=0;i<n;i++)
		{
			System.out.print(+c[i] + "\t");
		}
		System.out.println();
	}
}
