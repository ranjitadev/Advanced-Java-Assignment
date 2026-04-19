/*Q9. Write a Java Program for Creating a random string of a specified length using user defined 
function generateRandomString()*/
package collection;

import java.util.Random;

public class Q9_RandomString {
    public static void main(String[] args) {
        System.out.println(generateRandomString(8));
    }

    public static String generateRandomString(int length) {
        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        Random rand = new Random();
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < length; i++) {
            result.append(chars.charAt(rand.nextInt(chars.length())));
        }
        return result.toString();
    }
}