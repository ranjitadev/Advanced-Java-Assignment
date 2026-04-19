/*Q1. Write a Java Program for Checking if a given string is null or contains only whitespace using user 
defined function isNullOrEmpty().*/
package collection;

public class Q1_NullOrEmpty {
    public static void main(String[] args) {
        String str = "   ";
        System.out.println(isNullOrEmpty(str));
    }

    public static boolean isNullOrEmpty(String str) {
        return str == null || str.trim().isEmpty();
    }
}