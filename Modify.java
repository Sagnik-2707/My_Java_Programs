import java.util.*;
class Modify {
    String st;
    int len;
    Modify()
    {
        st = "";
        len = 0;   
    }
    public static Scanner sc = new Scanner(System.in);
    public void read()
    {
        System.out.println("Enter a string: ");
        st = sc.nextLine();
        st = st.trim();
        //st = st.toUpperCase();
        len = st.length();
    }
    public void putin(int p, char ch)
    {
        int i;
        char c;
        String x = "";
        for(i=0;i<len;i++)
        {
            c = st.charAt(i);
            if(i==p)
                x = x + ch + c;
            else
                x = x + c;
        }
        System.out.println("CHANGED STRING: " +x);
    }
    public void takeout(int p)
    {
        int i;
        char c;
        String x= "";
        for(i=0;i<len;i++)
        {
            c = st.charAt(i);
            if(i!=p)
                x = x + c;
        }
        System.out.println("CHANGED STRING: " +x);
    }
    public void change()
    {
        int i,a;
        char c,c1;
        String x = "";
        for(i=0;i<len;i++)
        {
            c = st.charAt(i);
            c1 = Character.toUpperCase(c);
            a = (int)c1;
            if(Character.isLetter(c1) == true)
            {
                if(a>=65 && a <= 88)
                    a = a + 2;
                else
                    a = a - 24;
            }
                c1 = (char)a;
                if(Character.isLowerCase(c) == true)
                    c1 = Character.toLowerCase(c1);
                x = x + c1;

        }
        System.out.println("CHANGED STRING: " +x);
    }
    
    public static void main(String args[])
    {
        Modify ob = new Modify();
        ob.read();
        System.out.println("Enter any character : ");
        char ch = (char)sc.next().charAt(0);
        System.out.println("Enter a position: ");
        int p;
        p = sc.nextInt();
        ob.putin(p,ch);
        System.out.println("Enter the position of extraction: ");
        p = sc.nextInt();
        ob.takeout(p);
        ob.change();
    }
}
