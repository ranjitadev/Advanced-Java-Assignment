/*Q10. Write a Java Program for Counting the number of words in a string using user defined function 
countWords()*/
package collection;

public class Q10_CountWords {
    public static void main(String[] args) {
        String str = "Java is very powerful";
        System.out.println(countWords(str));
    }

    public static int countWords(String str) {
        if (str == null || str.trim().isEmpty()) return 0;
        return str.trim().split("\\s+").length;
    }
}