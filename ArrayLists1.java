import java.util.*;
public class ArrayLists1
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		String arr[] = line.split(" ");
		ArrayList<Integer> al = new ArrayList<>();
		for(String s : arr)
		{
			al.add(Integer.parseInt(s));
		}
		Iterator<Integer> itr = al.iterator();
		while(itr.hasNext())
		{
			System.out.print(itr.next()+" ");
		}
		System.out.println();
	}
}

