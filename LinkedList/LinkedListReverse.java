//2. Write a Java program to iterate a linked list in reverse order (using 
//objlist.descendingIterator())
package linkedlist;
import java.util.*;

public class LinkedListReverse {
 public static void main(String[] args) {

     LinkedList<String> list = new LinkedList<>();

     list.add("Red");
     list.add("Green");
     list.add("Blue");
     list.add("Yellow");

     System.out.println("Original List: " + list);

     Iterator<String> it = list.descendingIterator();

     System.out.println("Reverse Order:");
     while(it.hasNext()){
         System.out.println(it.next());
     }
 }
}
