import java.util.*;
class minmax {
    public static void main (){
        
     
        //finding number of spaces in input
        Scanner scn = new Scanner (System.in);
        System.out.println ("Enter String Input");
        String input = scn.nextLine();
        int space = 0;
        for (int i = 0 ; i < input.length();i++){
            if (Character.isWhitespace(input.charAt(i)))
            space++;
        }
        
        String words [] = new String [space+1];
        words[0] = "";
        for (int i = 0 , pro = 0; i < input.length();i++){
            char ch = input.charAt(i);
            if (Character.isWhitespace(ch)){
            pro++;
            words[pro] = "";
             }  
            words[pro] += ch + "";
        }
        
        int minPos = 0;
        int maxPos = 0;
        
        for (int i = 1 ; i < words.length ; i ++){
            if (words[minPos].length()>words[i].length()){
                minPos = i;
            }
            if (words[maxPos].length()<words[i].length()){
                maxPos = i;
            }
        }
        
        System.out.println ("Smallest word is: "+words[minPos]);
        System.out.println ("Largest word is: "+words[maxPos]);
    }
}