import java.io.*;
public class palindrome
{
    /*Palindrome = A palindromic number or numeral palindrome is a number that remains the same when its 
     *digits are reversed. Like 16461,*/
     public static void main ()throws IOException{
        BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
        System.out.println("Enter the String: ");
        String in = br.readLine();
        int input = Integer.parseInt(in);
        int copy = input;
        int palindrome = 0;
        
        while (copy > 0){
        int d = copy%10;
        palindrome = palindrome *10 + d;
        copy /= 10;
        }
        
        if (palindrome == input){
            System.out.println("Palindrome");
        }
        else {
            System.out.println ("Not Palindrome");
        }
    }
}
