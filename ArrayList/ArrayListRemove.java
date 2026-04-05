//2. Write a java program for getting different colors through ArrayList interface and removethe 2nd element and color "Blue" from the ArrayList
package ArrayList;

import java.util.*;

public class ArrayListRemove {
 public static void main(String[] args) {

     ArrayList<String> colors = new ArrayList<>();

     colors.add("Blue");
     colors.add("Green");
     colors.add("Red");
     colors.add("Yellow");

     System.out.println("Original List: " + colors);

     colors.remove(1); // remove 2nd element
     colors.remove("Blue"); // remove Blue

     System.out.println("After removal: " + colors);
 }
}
