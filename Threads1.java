import java.util.*;
class MyThread1 implements Runnable
{
	String tname;
	Thread thrd;
	MyThread1(String name)
	{
		tname = name;
		thrd = new Thread(this,name);
		thrd.start();
	}
	public void run()
	{
		System.out.println(thrd.getName() + "starting...");
		try
		{
			for(int i=0;i<10;i++)
			{
				
				Thread.sleep(400);
				System.out.println(thrd.getName() +"[" +i+ "]");
			}
		}
		catch(InterruptedException e)
		{
			System.out.println(thrd.getName() + " interrupted");
		}
		System.out.println(thrd.getName() + " terminated");
	}
}

public class Threads1
{
	public static void main(String args[])
	{
		System.out.println("Main Thread Starting...");
		MyThread1 mt1 = new MyThread1("C1");
		MyThread1 mt2 = new MyThread1("C2");
		MyThread1 mt3 = new MyThread1("C3");
		try
		{
			mt1.thrd.join();
			System.out.println("C1 joined after completion");
			mt2.thrd.join();
			System.out.println("C2 joined after completion");
			mt3.thrd.join();
			System.out.println("C3 joined after completion");
		}
		catch(InterruptedException exc)
		{
			System.out.println("Main thread interrupted...");
		}
		System.out.println("Main thread terminated...");
	}
}

					
