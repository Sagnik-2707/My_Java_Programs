import java.util.*;
interface Account
{
	void deposit(String acc_no, double amount, String[] account_no, double[] balance_amount);
	void withdraw(String acc_no, double amount, String[] account_no, double[] balance_amount);
	void checkBalance(String acc_no, String[] account_no, double[] balance_amount);
}
class Bank implements Account
{
	String acc_no;
	double balance;
	Bank()
	{
		acc_no = "";
		balance = 0.0;
	}
	private int findAccount(String acc_no, String[] account_no)
	{	
		for(int i=0;i<account_no.length;i++)
		{
			if(account_no[i].equals(acc_no))
				return i;
		}
		return -1;
	}
	public void deposit(String acc_no, double amount, String[] account_no, double[] balance_amount)
	{
		if(amount <= 0.0)
		{
			System.out.println("ERROR");
		}
		int index = findAccount(acc_no,account_no);
		if(index!=-1)
		{
			balance_amount[index]+=amount;
			System.out.println("The updated balance is " +balance_amount[index]);
		}
		else
		{
			System.out.println("Account not found.");
		}
	}
	public void withdraw(String acc_no, double amount, String[] account_no, double[] balance_amount)
	{
		int index = findAccount(acc_no,account_no);
		if(index!=-1)
		{
			if(amount > balance_amount[index])
			{
				System.out.println("ERROR");
			}
			else
			{
				balance_amount[index] = balance_amount[index] - amount;
				System.out.println("The updated balance is " +balance_amount[index]);
			}
		}
		else
			System.out.println("Account does not exist.");
	}
	public void checkBalance(String acc_no, String[] account_no, double[] balance_amount)
	{
		int index = findAccount(acc_no,account_no);
		if(index!=-1)
		{
			System.out.println("The account number is " +account_no[index]);
			System.out.println("The balance amount is " +balance_amount[index]);
		}
		else
			System.out.println("Account not found");
	}
}
		
public class BankAccount
{
	public static void main(String args[])
	{
		String[] account_no = {"1010", "2020", "5823", "8975", "6017", "5011"};
		double[] balance_amount = {50000.0, 10000.0, 78560.0, 33690.12, 56320.0, 20000.0};
		Bank ob = new Bank();
		Scanner sc = new Scanner(System.in);
		String acc_no;
		double dep_amount, withdraw_amount;
		System.out.println("What do you want?\n1.Deposit\2.Withdraw\3.Check Balance");
		int choice;
		System.out.println("Enter your choice.");
		choice = sc.nextInt();
		sc.nextLine();
		switch(choice)
		{
			case 1: System.out.println("Enter your account number and amount to deposit.");
				acc_no = sc.nextLine();
				dep_amount = sc.nextDouble();
				sc.nextLine();
				ob.deposit(acc_no, dep_amount, account_no, balance_amount);
				break;
			case 2:
				System.out.println("Enter your account number and amount to withdraw.");
				acc_no = sc.nextLine();
				withdraw_amount = sc.nextDouble();
				sc.nextLine();
				ob.withdraw(acc_no, withdraw_amount,account_no, balance_amount);
				break;
			case 3:
				System.out.println("Enter your account number.");
				acc_no = sc.nextLine();
				ob.checkBalance(acc_no,account_no, balance_amount);
				break;
			default:
				System.out.println("Wrong choice.");
				System.exit(0);
		}
	}
}

		
