//5. Write a Java program that swaps two elements ( first and third elements ) in a linked list ( using 
//Collections.swap(l_list, 0, 2))

package linkedlist;
import java.util.*;

public class LinkedListSwap {
 public static void main(String[] args) {

     LinkedList<String> list = new LinkedList<>();

     list.add("Red");
     list.add("Green");
     list.add("Blue");

     System.out.println("Before Swap: " + list);

     Collections.swap(list, 0, 2);

     System.out.println("After Swap: " + list);
 }
}
