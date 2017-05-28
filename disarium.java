import java.io.*;
public class disarium
{
    /*A number is called Disarium if sum of its digits powered with their respective positions is 
     *equal to the number itself. */
    public static void main () throws IOException
    {
        BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
        System.out.println("Enter the String: ");
        String in  = br.readLine();
        int input = Integer.parseInt(in);
        int copy = input;
        int power = in.length();
        int sum = 0;
        while (copy > 0){
            int d = input/10;
            sum += Math.pow(d,power);
            power--;
            copy /= 10;
        }
        
        if (sum == input){
            System.out.println ("Disarium");
        }
        else {
            System.out.println ("Not a Disarium");
        }
        
    }
}
