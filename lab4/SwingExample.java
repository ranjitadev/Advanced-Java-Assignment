/*4a. Basic hello program of Swing displaying the message Hello! VI C , Welcome to Swing Programming 
in Blue color plain font with font size of 32 using Jframe and Jlabel*/
package collection;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

public class SwingExample {

    // Constructor
    public SwingExample() {  
    	
    	
    	

        // Create JFrame
        JFrame jfrm = new JFrame("A Simple Swing Application");

        // Set layout
        jfrm.setLayout(new FlowLayout());

        // Set size
        jfrm.setSize(400, 200);

        // Close operation
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create label
        JLabel jlab = new JLabel("Hello! VI C, Welcome to Swing Programming!");

        // Set font and color
        jlab.setFont(new Font("Verdana", Font.BOLD, 16));
        jlab.setForeground(Color.BLUE);

        // Add label to frame
        jfrm.add(jlab);

        // Center the frame
        jfrm.setLocationRelativeTo(null);

        // Make visible
        jfrm.setVisible(true);
    }

    // Main method
    public static void main(String[] args) {

        // Run GUI safely
        SwingUtilities.invokeLater(() -> new SwingExample());
    }
}