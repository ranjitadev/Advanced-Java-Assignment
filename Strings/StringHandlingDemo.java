//3a. Develop a java program for performing various string operations with different string handling 
//functions directed as follows:
//String Creation and Basic Operations, Length and Character Access, String Comparison, String 
//Searching, Substring Operations , String Modification, Whitespace Handling, String Concatenation, 
//String Splitting, StringBuilder Demo, String Formatting , Validate Email with contains( ) and 
//startsWith() and endsWith()
package Strings;
import java.util.*;

public class StringHandlingDemo {
 public static void main(String[] args) {

     // String Creation
     System.out.println("=== String Creation ===");
     String str1 = "Hello, World!";
     String str2 = new String("Java Programming");

     System.out.println("str1: " + str1);
     System.out.println("str2: " + str2);

     // Length & Character
     System.out.println("\n=== Length & Character ===");
     System.out.println("Length: " + str1.length());
     System.out.println("Char at 4: " + str1.charAt(4));

     // Comparison
     System.out.println("\n=== Comparison ===");
     String str3 = "hello, world!";
     System.out.println(str1.equals(str3));
     System.out.println(str1.equalsIgnoreCase(str3));

     // Searching
     System.out.println("\n=== Searching ===");
     System.out.println(str1.contains("Hello"));
     System.out.println(str1.indexOf("World"));

     // Substring
     System.out.println("\n=== Substring ===");
     System.out.println(str1.substring(0,5));

     // Modification
     System.out.println("\n=== Modification ===");
     System.out.println(str1.toUpperCase());
     System.out.println(str1.replace("World", "Java"));

     // Trim
     System.out.println("\n=== Trim ===");
     String s = "  Java  ";
     System.out.println(s.trim());

     // Concatenation
     System.out.println("\n=== Concatenation ===");
     System.out.println("Hello " + "Java");

     // Split
     System.out.println("\n=== Split ===");
     String data = "Java,Python,C++";
     String[] arr = data.split(",");
     for(String x : arr){
         System.out.println(x);
     }

     // StringBuilder
     System.out.println("\n=== StringBuilder ===");
     StringBuilder sb = new StringBuilder("Java");
     sb.append(" Programming");
     System.out.println(sb);

     // Formatting
     System.out.println("\n=== Formatting ===");
     System.out.println(String.format("Age: %d", 20));

     // Email Validation
     System.out.println("\n=== Email Validation ===");
     String email = "user@gmail.com";
     System.out.println(validateEmail(email));
 }

 static boolean validateEmail(String email){
     return email.contains("@") && email.contains(".");
 }
}
