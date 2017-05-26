
public class stringFunctionsExamples
{
     
    public static void main (String [] args)
    {
          
        String str = "This is test String.";
        System.out.println (str.length());
        System.out.println (str.indexOf('i'));//ans: 2
        System.out.println (str.lastIndexOf('i')); //ans : 16 
        System.out.println (str.endsWith("String.")); //ans: true
        System.out.println (str.startsWith("this"));//ans : false
        System.out.println (str.equals("this is another String"));
        System.out.println (str.equalsIgnoreCase("this is test String."));//ans: true
        System.out.println (str.replace('i','*'));
        System.out.println (str.concat("And this line is added later."));
        System.out.println (str.substring(5,7));
        System.out.println (str.substring(8));
     
    }
}
