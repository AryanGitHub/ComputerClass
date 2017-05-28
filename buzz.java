import java.io.*;
public class buzz
{
    /*Buzz
     *A number is said to be Buzz Number if it ends with 7 or is divisible by 7
     */
    public static void main () throws IOException
    {
        BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
        System.out.println("Enter the String: ");
        String in = br.readLine();
        
        int input = Integer.parseInt (in);
        
        if(input%7 == 0 || input%10 == 7){
            System.out.println ("Buzzz Number");
        }
        else {
            System.out.println ("Not a Buzz Number");
        }
    }
}
