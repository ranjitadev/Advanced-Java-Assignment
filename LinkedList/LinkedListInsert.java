//3. Write a Java program to insert the specified element at the end of a linked list.( using 
//l_listobj.offerLast("Pink"))
package linkedlist;

import java.util.*;

public class LinkedListInsert {
 public static void main(String[] args) {

     LinkedList<String> list = new LinkedList<>();

     list.add("Red");
     list.add("Green");

     list.offerLast("Pink");

     System.out.println("After inserting Pink: " + list);
 }
}
