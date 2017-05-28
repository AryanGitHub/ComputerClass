import java.io.*;
public class niven
{
    /*
     *Niven number =
     *Is an integer that is divisible by the sum of its digits when
     *written in that base
     */
    public static void main () throws IOException
    {
        BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
        System.out.println("Enter the String: ");
        String in = br.readLine();
        int input = Integer.parseInt(in);
        int copy = input;
        int sum = 0;
        
        while (copy>0){
            int d = copy/10;
            sum += d;
        }
        
        if (input%sum == 0){
            System.out.println ("Niven Number.");
        }
        else {
            System.out.println ("Not a Niven Number.");
        }
        
    }
}
