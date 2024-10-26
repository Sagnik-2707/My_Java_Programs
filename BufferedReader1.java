import java.io.*;
class BufferedReader1{
/*{
	public static void main(String args[]) throws IOException
	{
		char c;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter characters, period to quit.");
		do
		{
			c = (char) br.read();
			System.out.println(c);
		}
		while(c != '.');
	}
}
*/
public static void main(String args[]) throws IOException
{
	String str;
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter strings, period to quit.");
	do
	{
		str = br.readLine();
		System.out.println(str);
	}
	while (! str.equals("."));
}
}
