/*Q2. Write a Java Program for Counting how many times a substring appears in a main string 
using user defined function countOccurrences()*/
package collection;

public class Q2_CountOccurrences {
    public static void main(String[] args) {
        String mainStr = "Java is fun, Java is powerful";
        String subStr = "Java";
        System.out.println(countOccurrences(mainStr, subStr));
    }

    public static int countOccurrences(String mainStr, String subStr) {
        int count = 0, index = 0;
        while ((index = mainStr.indexOf(subStr, index)) != -1) {
            count++;
            index += subStr.length();
        }
        return count;
    }
}