import java.util.*;
public class ArrayLists2
{
	static int binsearch(ArrayList<Integer> al, int key)
	{
		Collections.sort(al);
		Collections.reverse(al);
		System.out.println("Sorted List: " +al);
		int index = Collections.binarySearch(al, key, Collections.reverseOrder());
		return index;
	}
	
	public static void main(String args[])
	{
		ArrayList<Integer> al = new ArrayList<>();
		int ele,key;
		Scanner sc1 = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		System.out.println("Enter elements...");
		while(sc1.hasNextInt())
		{
			ele = sc1.nextInt();
			al.add(ele);
		}
		System.out.println("Enter the element to search...");
		key = sc2.nextInt();
		int index = binsearch(al,key);
		if(index>=0)
			System.out.println("Element found at index " +index);
		else
			System.out.println("Element not present.");
	}
}

