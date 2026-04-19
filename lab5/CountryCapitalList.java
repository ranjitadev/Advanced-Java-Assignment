/*5c. Develop a Swing program in Java to add the countries USA, India, Vietnam, Canada, Denmark, 
France, Great Britain, Japan, Africa, Greenland, Singapore into a JList and display the capital of the 
countries on console whenever the countries are selected on the list.*/
package collection;

import javax.swing.*;
import javax.swing.event.*;
import java.util.*;

public class CountryCapitalList extends JFrame {

    JList<String> list;

    CountryCapitalList() {

        // Countries
        String countries[] = {
            "USA", "India", "Vietnam", "Canada",
            "Denmark", "France", "Great Britain",
            "Japan", "Africa", "Greenland", "Singapore"
        };

        // Capitals (Mapping)
        HashMap<String, String> map = new HashMap<>();
        map.put("USA", "Washington D.C.");
        map.put("India", "New Delhi");
        map.put("Vietnam", "Hanoi");
        map.put("Canada", "Ottawa");
        map.put("Denmark", "Copenhagen");
        map.put("France", "Paris");
        map.put("Great Britain", "London");
        map.put("Japan", "Tokyo");
        map.put("Africa", "Addis Ababa");
        map.put("Greenland", "Nuuk");
        map.put("Singapore", "Singapore");

        list = new JList<>(countries);

        list.addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent e) {
                if (!e.getValueIsAdjusting()) {
                    String selected = list.getSelectedValue();
                    System.out.println("Capital of " + selected + " is: " + map.get(selected));
                }
            }
        });

        add(new JScrollPane(list));

        setTitle("Country Capital List");
        setSize(250, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new CountryCapitalList();
    }
}