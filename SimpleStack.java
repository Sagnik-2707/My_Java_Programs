import java.util.*;
public class SimpleStack 
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        final int max = 5;
        String arr[] = new String[max];
        GenSimpleStack<String> st = new GenSimpleStack<String>(arr);
        int choice;
        while(true)
        {
            System.out.println("Enter your choice: ");
            choice = sc.nextInt();
            switch(choice)
            {
                case 1:
                    try
                    {
                        st.push(sc.next());
                    }
                    catch(StackFullException e)
                    {
                        System.out.println(e);
                    }
                    break;
                case 2:
                    try
                    {
                        System.out.println(st.pop());
                    }
                    catch(StackEmptyException e)
                    {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 0: 
                        System.exit(0);
                        break;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }  
}

interface IGenSimpleStack<T>
{
    public void push(T item) throws StackFullException;
    public T pop() throws StackEmptyException;
    public boolean isEmpty();
    public boolean isFull();
}

class GenSimpleStack<T> implements IGenSimpleStack<T>
{
    private T[] data;
    private int tos = -1;
    GenSimpleStack(T[] data)
    {
        this.data = data;
    }
    public void push(T item) throws StackFullException
    {
        if(isFull())
            throw new StackFullException(data.length);
        tos = tos + 1;
        data[tos] = item;        
    }
    public T pop()throws StackEmptyException
    {
        if(isEmpty())
            throw new StackEmptyException("[Empty]");
        return data[tos--];
    }
    public boolean isEmpty()
    {
        return (tos == -1);
    }
    public boolean isFull()
    {
        return (tos == data.length - 1);
    }
}
class StackFullException extends Exception
{
    int size;
    StackFullException(int size)
    {
        super();
        this.size = size;
    }
    public String toString()
    {
        return ("Stack is full. Maximum capacity: " + size);
    }

}
class StackEmptyException extends Exception
{
    StackEmptyException(String message)
    {
        super(message);
    }
}