import java.io.*;
public class Amtomorphic
{
    /*Automorphic=
     *Note: An automorphic number is a number which is present in the last digit(s) of its square.
     *Example: 25 is an automorphic number as its square is 625 and 25 is present as the last digits
     */
    public static void main () throws IOException
    {
        BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
        System.out.println("Enter the String: ");
        String in = br.readLine();
        int input = Integer.parseInt(in);
        int squ = (int)Math.pow(input , 2);
        int nod = 0;//it is Number of digits
        
        int copy = input;
        while (copy > 0){
        nod++;
        copy/= 10;
        }
        
        int divid = (int)Math.pow(10,nod);
        int ld = squ% divid; // last numbers of digits.
        
        if (ld == input){
            System.out.println ("Automorphic Number.");
        }
        else {
            System.out.println("Not a Automorphic Number.");
        }
    }
}
