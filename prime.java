import java.io.*;
public class prime
{
    
    public static void main () throws IOException
    {
        BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
        System.out.println("Enter the String: ");
        String in = br.readLine();
        int input = Integer.parseInt (in);
        boolean check = false;
        for (int pro = 2; pro < input ; pro++){
            if (input%pro == 0)
                break;
            if (pro == input -1) check = true;
        }
        if (check) System.out.println ("Prime Number.");
        else System.out.println ("Not a Prime Number.");
    }
}
