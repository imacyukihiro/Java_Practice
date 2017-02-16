import java.util.*;

public class Test1 {
  public static void main (String[] args) {
    String s1 = "スッキリJava";
    String s2 = "Java";
    String s3 = "java";
    if (s2.equals(s3)) {
      System.out.println("S2 = S3");
      System.out.pritnln("S2 == s3");
    } 
    if (s2.equalsIgnoreCase(s3))
      System.out.println("s2 = s3 (case isn't considered)");
    System.out.println("S1 Length : " + s1.length());
    if (s1.isEmpty()) {
      System.out.println("s1 is Empty");
    }
  }
}
