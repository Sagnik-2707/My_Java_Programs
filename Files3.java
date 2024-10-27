import java.io.*;
public class Files3 
{
    public static void main(String args[]) throws IOException
    {
        String s;
        int i=0;
        String arr[] = new String[20];
        FileReader fr = new FileReader("names.txt");
        BufferedReader br = new BufferedReader(fr);
        while((s = br.readLine()) != null)
        {
            arr[i++] = s;
        }
        String temp = "";
        int l = i;
        for(int j=0;j<l-1;j++)
        {
            for(int k=0;k<l-(j+1);k++)
            {
                if(arr[k].compareTo(arr[k+1]) > 0)
                {
                    temp = arr[k];
                    arr[k] = arr[k+1];
                    arr[k+1] = temp;
                }
            }
        }
        System.out.println("Sorted names in ascending lexicographic order:");
        for(i=0;i<l;i++)
        {
            System.out.println(arr[i] + " ");
        }
        fr.close();
    }
}
