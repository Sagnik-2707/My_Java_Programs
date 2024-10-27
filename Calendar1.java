import java.util.Calendar;
public class Calendar1 
{
    public static void main(String[] args)
    {
        Calendar cal = Calendar.getInstance();
        String months[] = {"Jan", "Feb", "Mar", "Apr", "May", "June", "July", "Aug", "Sep", "Oct", "Nov", "Dec" };
        System.out.print("Date : ");
        System.out.print(months[cal.get(Calendar.MONTH)]);
        System.out.print(" " + cal.get(Calendar.DAY_OF_MONTH));
        System.out.print(", " + cal.get(Calendar.YEAR));
    }
}
