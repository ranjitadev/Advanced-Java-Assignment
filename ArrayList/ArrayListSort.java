//3. Write a java program for getting different colors through ArrayList interface and sort them using Collections.sort( ArrayListObj)
package ArrayList;
import java.util.*;

public class ArrayListSort {
 public static void main(String[] args) {

     ArrayList<String> colors = new ArrayList<>();

     colors.add("Blue");
     colors.add("Green");
     colors.add("Red");
     colors.add("Yellow");

     System.out.println("Before sorting: " + colors);

     Collections.sort(colors);

     System.out.println("After sorting: " + colors);
 }
}
