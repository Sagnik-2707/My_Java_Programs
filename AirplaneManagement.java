class Airplane
{
	String flight_no, destination;
	int dept_time; 
	private int delay_time;
	Airplane(String flight_no, String destination, int dept_time)
	{
		this.flight_no = flight_no;
		this.destination = destination;
		this.dept_time = dept_time;
	}
	public void setDelayTime(int delay_time)
	{
		this.delay_time = delay_time;
	}
	public int getDelayTime()
	{
		return delay_time;
	}
	public void checkStatus()
	{
		if(delay_time == 0)
		{
			System.out.println("Flight number " + flight_no + " is on time.");
		}
		else
			System.out.println("Flight number " + flight_no + "is delayed by " + delay_time + " minutes");
	}
	public void isDelay()
	{
		if(delay_time == 0)
		{
			System.out.println("The flight " +flight_no+ " is running on time and will depart in " +dept_time+ " minutes");
		}
		else
		{
			dept_time = delay_time + dept_time;
			System.out.println("The flight " +flight_no+ " is running late and will depart in " +dept_time+ " minutes");
		}
	}
}

public class AirplaneManagement
{
	public static void main(String args[])
	{
		Airplane A1 = new Airplane("MH571", "New Delhi", 50);
		Airplane A2 = new Airplane("Boeing 700", "Santiago", 90);
		Airplane A3 = new Airplane("Air India 785", "Bangkok", 60);
		Airplane A4 = new Airplane("Vistara 985", "Frankfurt", 120);
		A1.setDelayTime(0);
		A2.setDelayTime(30);
		A3.setDelayTime(60);
		A4.setDelayTime(0);
		A1.checkStatus();
		A2.checkStatus();
		A3.isDelay();
		System.out.println("The flight " +A4.flight_no+ " is delayed by " +A4.getDelayTime()+ " minutes");
	}
}

