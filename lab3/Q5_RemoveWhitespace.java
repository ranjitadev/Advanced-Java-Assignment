/*Q5. Write a Java Program for Eliminating all whitespace characters from a string using user defined 
function removeWhitespace()*/
package collection;

public class Q5_RemoveWhitespace {
    public static void main(String[] args) {
        String str = "Hello World Java";
        System.out.println(removeWhitespace(str));
    }

    public static String removeWhitespace(String str) {
        return str.replaceAll("\\s", "");
    }
}