//1. Write a Java program to iterate through all elements in a linked list starting at the 
// specified position ( 2nd) using iterator ( hint : Iterator iteratorobj = listobj.listIterator(1))
package linkedlist;
import java.util.*;

public class LinkedListIteration {
 public static void main(String[] args) {

     LinkedList<String> list = new LinkedList<>();

     list.add("Red");
     list.add("Green");
     list.add("Blue");
     list.add("Yellow");

     System.out.println("LinkedList: " + list);

     Iterator<String> it = list.iterator();

     System.out.println("Iterating using Iterator:");
     while(it.hasNext()){
         System.out.println(it.next());
     }
 }
}
