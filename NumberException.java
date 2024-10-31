import java.util.Scanner;
class MyException extends Exception
{
    MyException(String message)
    {
        super(message);
    }
}

public class NumberException {
    public static void validateNumber(int n) throws MyException
    {
        if(n<0)
        {
            throw new MyException("Number cannot be negative");
        }
        else
            System.out.println("Number is valid.");
    }
    public static void main(String args[])
    {
        int num;
        System.out.println("Enter a number...");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        try
        {
            validateNumber(num);
        }
        catch(MyException e)
        {
            System.out.println(e);
        }
    }
}
