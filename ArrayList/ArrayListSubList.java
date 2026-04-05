//4. Write a java program for getting different colors through ArrayList interface and extract the elements 1st and 2nd from the ArrayList object by using SubList()
package ArrayList;
import java.util.*;

public class ArrayListSubList {
 public static void main(String[] args) {

     ArrayList<String> colors = new ArrayList<>();

     colors.add("Blue");
     colors.add("Green");
     colors.add("Red");
     colors.add("Yellow");

     System.out.println("List: " + colors);

     List<String> sub = colors.subList(0, 2);

     System.out.println("SubList (1st & 2nd): " + sub);
 }
}
