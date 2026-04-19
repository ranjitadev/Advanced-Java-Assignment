/*Q4. Write a Java Program for Checking if a string reads the same backward as forward (ignoring case 
and punctuation) using user defined function isPalindrome():*/
package collection;

public class Q4_Palindrome {
    public static void main(String[] args) {
        String str = "Madam";
        System.out.println(isPalindrome(str));
    }

    public static boolean isPalindrome(String str) {
        str = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        String reversed = new StringBuilder(str).reverse().toString();
        return str.equals(reversed);
    }
}