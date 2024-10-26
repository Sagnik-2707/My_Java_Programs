import java.util.Scanner;
public class Sorting2
{
	public static void main(String args[])
	{
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of account holders.");
		n = sc.nextInt();
		sc.nextLine();
		String[] acc_no = new String[n];
		double[] balance = new double[n];
		for(int  i=0;i<n;i++)
		{
			System.out.println("Enter the account number");
			acc_no[i] = sc.nextLine();
			System.out.println("Enter the balance amount");
			balance[i] = sc.nextDouble();
			sc.nextLine();
		}
		System.out.println("The account numbers and balances are:");
		for(int i=0;i<n;i++)
		{
			System.out.print(acc_no[i]+" ");
			System.out.print(balance[i]+" ");
			System.out.println();
		}
		
		sortByBalance(acc_no,balance,n);
		System.out.println("After sorting...");
		for(int i=0; i<n; i++)
		{
			System.out.print(acc_no[i]+" " );
			
			System.out.print(balance[i]+" " );
			System.out.println();
		}
	}
	private static void sortByBalance(String acc_no[], double balance[], int n)
		{
			for(int i=0;i<n-1;i++)
			{
				for(int k=0;k<n-(i+1);k++)
				{
					if(balance[k] > balance[k+1])
					{
						double temp1 = balance[k];
						balance[k] = balance[k+1];
						balance[k+1] = temp1;
					
						String temp2 = acc_no[k];
						acc_no[k] = acc_no[k+1];
						acc_no[k+1] = temp2;
					}
				}
			}
		}
}

		
