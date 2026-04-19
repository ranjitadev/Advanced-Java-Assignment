/*Q6. Write a Java Program for Capitalizing the first letter of each word. using user defined function 
capitalizeWords()*/
package collection;
public class Q6_CapitalizeWords {
    public static void main(String[] args) {
        String str = "java programming language";
        System.out.println(capitalizeWords(str));
    }

    public static String capitalizeWords(String str) {
        String[] words = str.split(" ");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            result.append(Character.toUpperCase(word.charAt(0)))
                  .append(word.substring(1)).append(" ");
        }
        return result.toString().trim();
    }
}