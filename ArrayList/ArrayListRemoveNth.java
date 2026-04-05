//5. Write a java program for getting different colors through ArrayList interface and delete nth element from the ArrayList object by using remove by index
package ArrayList;
import java.util.*;

public class ArrayListRemoveNth {
 public static void main(String[] args) {

     ArrayList<String> colors = new ArrayList<>();

     colors.add("Blue");
     colors.add("Green");
     colors.add("Red");
     colors.add("Yellow");

     System.out.println("List: " + colors);

     int n = 2; // remove 3rd element

     colors.remove(n);

     System.out.println("After removing index " + n + ": " + colors);
 }
}
