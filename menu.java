import java.util.*;
public class menu
{
    public static void main (String args []){
        System.out.println ("1  : Composit Number");
        System.out.println ("2  : Smallest Digit in Given Number");
        System.out.print ("Enter Option :  ");
        Scanner scn  = new Scanner (System.in);
        int opt = scn.nextInt();
        int take ;
        switch(opt){
            case 1:
            System.out.print ("Enter Number :  ");
            take = scn.nextInt();
            if (isComposit(take))
            System.out.println ("The number "+take +" is Composit.");
            else 
            System.out.println ("The number "+take +" is Prime.");
            break;
            
            case 2:
            System.out.print ("Enter Number :  ");
            take = scn.nextInt();
            int d = smallestNumber(take);
            System.out.println("This smallest digit in Number "+take+" is "+d+".");
            break;
            
            default :
            System.out.println ("This choice Entered is Not a vaild Option.");
        }
        
    }
    
    
   public static boolean isComposit (int input){
       int pro = 2 ;
       
       while (pro < input){
           if (input % pro == 0)
           return true;
           pro++;
        }
       return false;
    }
    public static int smallestNumber(int input)
    {
       int copy = input;
       int n = 0;
       while (copy > 0){
          n++;
          copy /= 10;
        }
       int digits[] = new int [n];
       copy = input;
       
       while (copy > 0) {
           int d = copy % 10;
           digits[(digits.length - n)] = d;
           n--;
           copy /= 10;
    }
    
    int minPos= 0 ;
    for (int i = 1 ; i  <  digits.length ; i++){
        if (digits[minPos] > digits [i]){
            minPos = i;
        }
    }
    return digits [minPos];
   }
}
