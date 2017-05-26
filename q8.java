import java.io.*;
public class q8
{
    public static void main(String [] args) throws IOException
    {
        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
        System.out.println ("Enter The String");
        String in = br.readLine();
        in = in.trim();
        in =" "+ in; 
        for (int a =0 ; a < in.length() ; a++){
            char ch = in.charAt(a);
            
            if (Character.isWhitespace(ch)){
                int end = a;
                
                
                for (int pos = a+1; pos < in.length() ; pos++){
                    char ch2 = in.charAt(pos);
                    if (Character.isWhitespace(ch2)){
                        end = pos;
                          
                        break;
                    }
                }
                if (end == a){
                            System.out.println(in.substring(a+1));
                        }
                        else 
                            System.out.println(in.substring(a+1 , end));
                              
                
            }
        }
    }
}
