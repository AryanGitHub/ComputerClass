
import java.io.*;
import javax.script.ScriptEngineManager;
import javax.script.ScriptEngine;
import javax.script.ScriptException;

public class Test {
  public static void main(String[] args) throws ScriptException , IOException {
    ScriptEngineManager mgr = new ScriptEngineManager();
    ScriptEngine engine = mgr.getEngineByName("JavaScript");
    BufferedReader br =new BufferedReader (new InputStreamReader (System.in));
    while (true){
    System.out.println ("Enter the Expression");
    String foo = br.readLine();
    if (foo.equals("Stop")) break;
    System.out.println(engine.eval(foo));
    }
  } 
}