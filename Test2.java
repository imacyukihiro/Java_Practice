import java.util.*;

public class Test2 {
  public static void main (String[] args) {
    String s1 = "Java and JavaScript";
    if (s1.contains("Java")) {
      System.out.println("String s1 contains Java");
    }
    if (s1.endsWith("Java")) {
      System.out.println("String s1 contains Java in last");
    }
    System.out.println("The First Location of Java in s1 is" + s1.indexOf("Java"));
    System.out.println("The Last Location of Java in s1 is " + s1.lastIndexOf("Java"));
  }
}
