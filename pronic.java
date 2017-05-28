import java.io.*;
public class pronic
{
    
    /* Pronic Number :
     * A pronic number, oblong number, rectangular number or heteromecic number, is a number which is the
     * product of two consecutive integers, that is, n (n + 1).
     *The first few pronic numbers are:
     *0, 2, 6, 12, 20, 30, 42, 56, 72, 90, 110, 132, 156, 182, 210, 240, 272, 306, 342, 380, 420, 462 … etc.
     */
    public static void main () throws IOException
    {
        BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
        System.out.println("Enter the String: ");
        String in = br.readLine();
        int input = Integer.parseInt(in);
        boolean check = false;
        for (int pro = 0; pro <= input ; pro++){
           int com = pro * (pro + 1);
           if(com == input){
           check = true;
           } 
        }
        if (check){
            System.out.println ("Pronic Number.");
        }
        else {
            System.out.println ("Not a Pronic Number.");
        }
    }
}
