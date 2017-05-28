
    import java.io.*;
public class neon
{
    
    /*Neon
     *A number is said to be a Neon Number if the sum of digits of the square of the number is equal to the
     *number itself. Example- 9 is a Neon Number. 9*9=81 and 8+1=9.Hence it is a Neon Number.
     */
    public static void main () throws IOException
    {
        BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
        System.out.println("Enter the String: ");
        String in = br.readLine();
        int input = Integer.parseInt(in);
        int squ = (int)Math.pow(input , 2);
        int copy = squ;
        int sum = 0;
        while (copy > 0){
            int d = copy %10;
            sum += d;
            d /= 10;
        }
        if (sum == input){
            System.out.println("Neon Number.");
        }
        else {
            System.out.println ("Not a Neon Number.");
        }
        
    }
}
