import java.io.*;
public class perfect
{
    /*Perfect
     *Perfect number is a number which is equal to sum of its divisor. For eg,divisors of 6 are 1,2 and 3. The 
     * sum of these divisors is 6. So 6 is called as perfect number
     */
    public static void main () throws IOException
    {
        BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
        System.out.println("Enter the String: ");
        String in = br.readLine();
        int input = Integer.parseInt(in);
        int sum = 0;
        for(int pro = 1; pro < input ; pro++){
             if(input%pro == 0){
             sum += pro;
             }
        }
        if (sum == input){
            System.out.println("Perfect Number.");
        }
        else {
            System.out.println ("Not a Perfect Number.");
            
        }
    }
}
