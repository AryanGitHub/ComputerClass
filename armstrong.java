import java.io.*;
public class armstrong
{
    /*Armstrong
     *An Armstrong number of three digits is an integer such that the sum of the cubes of its digits 
     *is equal to the number itself. For example, 371 is an Armstrong number since 3**3 + 7**3 + 1**3 = 371.
     */
    public static void main () throws IOException
    {
        BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
        System.out.println("Enter the String: ");
        String in = br.readLine();
        int input = Integer.parseInt(in);
        int copy = input;
        int sum = 0;
        
        while (copy > 0){
            int d = copy%10;
            sum += Math.pow (d ,3);
            copy /= 10;
        }
        
        if (sum == input){
            System.out.println ("Armstrong Number.");
        }
        else {
        System.out.println ("Not Armstrong Number.");
        }
    }
}
