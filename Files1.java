import java.io.*;
import java.util.*;
public class Files1
{
    public static void main(String args[]) throws IOException
    {
        int i;
        String n;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        FileWriter fw = new FileWriter("names.txt");
        BufferedWriter bw = new BufferedWriter(fw);
        PrintWriter pw = new PrintWriter(bw);
        for(i=0;i<5;i++)
        {
            System.out.print("Enter names: ");
            n = br.readLine();
            pw.println(n);
        }
        pw.close();
        bw.close();
        fw.close();
    }
}
