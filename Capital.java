import java.util.*;
class Capital {
    String sent;
    int freq;
    Capital()
    {
        sent = "";
        freq = 0;   
    }
    public static Scanner sc = new Scanner(System.in);
    public static void input()
    {
        System.out.println("Enter a sentence: ");
        sent = sc.nextLine();
        sent = sent.trim();
        sent = sent + " ";
    }
    public boolean isCap(String w)
    {
        boolean b = false;
        char c = w.charAt(0);
        if(Character.isUpperCase(c) == true)
            b = true;
        return b;
    }
    public static void display()
    {
        int i,l;
        char c;
        String w = "";
        l = sent.length();
        System.out.println("INPUT: " +sent);
        System.out.print("The words starting with capital letter are: ");
        for(i=0;i<l;i++)
        {
            c = sent.charAt(i);
            if(c != ' ')
            {
                w = w + c;
            }
            else
            {
                boolean b = isCap(w);
                if(b == true)
                {
                    System.out.print(w + ", ");
                    freq = freq + 1;
                }
                w = "";

            }
        }
        
        System.out.println("\nNo of words beginning with a capital letter: " +freq);
    }
    public static void main(String[] args) {
        //Capital ob = new Capital();
        Capital.input();
        Capital.display();
        //ob.input();
        //ob.display();
    }

}
