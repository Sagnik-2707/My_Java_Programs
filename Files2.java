import java.io.*;
public class Files2 
{
    public static void main(String args[]) throws IOException
    {
        String s = "";
        FileReader fr = new FileReader("names.txt");
        BufferedReader br = new BufferedReader(fr);
        while((s = br.readLine()) != null)
        {
            System.out.println(s);
        }
        fr.close();
        
    }    
}
