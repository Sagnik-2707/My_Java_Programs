import java.util.Date;
public class Date1 
{
    public static void main(String[] args)
    {
        Date ob = new Date();
        System.out.println(ob);
        long msec = ob.getTime();
        System.out.println("Milliseconds since Jan 1, 1970 GMT = " + msec);
    }
}
