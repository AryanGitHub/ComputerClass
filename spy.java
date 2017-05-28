
import java.io.*;
public class spy
{
    /* Spy Number = A Number is spy number if the sum of its digits equals the product of its digits.
         Example : consider the number 1124
         Sum of the digits = 1 + 1 + 2 + 8
         Product of the digits = 1 * 1 * 2 * 8*/
         
    public static void main () throws IOException
    {
        BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
        System.out.println("Enter the Number: ");
        String in = br.readLine();
        int input = Integer.parseInt(in);
        
        int sum =0;
        int mul = 1;
        while (input > 0){
            int d = input%10;
            sum += d;
            mul *= d;
            input /= 10;
        }
        if (mul == sum){
            System.out.println("Spy Number");
        }
        else {
        System.out.print("Not a Spy number.");
        }
    }
}