interface Mobile
{
    public void ring();
    public void call();
}
class Samsung implements Mobile
{
    public void ring()
    {
        System.out.println("Samsung ringing");
    }
    public void call()
    {  
        System.out.println("Samsung calling");
    }
}
class Redmi implements Mobile
{
    public void ring()
    {
        System.out.println("Redmi ringing");
    }
    public void call()
    {
        System.out.println("Redmi calling");
    }
}
public class Random1
{
    public static void main(String args[])
    {
        Mobile obj;
        obj = new Samsung();
        obj.ring();
        obj = new Redmi();
        obj.ring();
    }
}
