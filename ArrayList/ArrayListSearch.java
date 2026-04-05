//1. Write a java program for getting different colors through ArrayList interface and searchwhether the color "Red" is available or not
package ArrayList;

import java.util.*;

public class ArrayListSearch {
 public static void main(String[] args) {

     ArrayList<String> colors = new ArrayList<>();

     colors.add("Blue");
     colors.add("Green");
     colors.add("Red");
     colors.add("Yellow");

     System.out.println("List: " + colors);

     if(colors.contains("Red")){
         System.out.println("Red is available");
     } else {
         System.out.println("Red is not available");
     }
 }
}
