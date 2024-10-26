import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
public class Arrays_to_ArrayLists
{
	public static void main(String args[])
	{
		int i,n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements.");
		n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter array elements");
		for(i=0;i<n;i++)
		{
			arr[i] = sc.nextInt();
		}
		ArrayList list = new ArrayList(Arrays.asList(arr));
		System.out.println(list.get(1));
	}
}
