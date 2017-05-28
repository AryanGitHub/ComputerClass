import java.io.*;
public class special
{
    
    public static void main () throws IOException
    {
     /*Special =
     * number is said to be special number when the sum of factorial of its digits is equal to the number 
     * itself. Example- 145 is a Special Number as 1!+4!+5!=145.
     */
        BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
        System.out.println("Enter the String: ");
        String in = br.readLine();
        int input = Integer.parseInt(in);
        int copy= input;
        int sum = 0;
        while (copy > 0){
            int d= copy %10;
            int fact = 1;
            while (d > 1){
                fact *= d;
                d--;
            }
            sum += fact;
        }
        if (sum == input){
            System.out.println ("Special Number");
        }
        else {
            System.out.println ("Not a Special Number.");
        }
    }
}
