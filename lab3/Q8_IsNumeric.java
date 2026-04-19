/*Q8. Write a Java Program for Verifying if a string contains only numeric characters using user defined 
function isNumeric()*/
package collection;

public class Q8_IsNumeric {
    public static void main(String[] args) {
        String str = "12345";
        System.out.println(isNumeric(str));
    }

    public static boolean isNumeric(String str) {
        return str.matches("\\d+");
    }
}