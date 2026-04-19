/*4c. Develop a Swing program in Java to display a message “Digital Clock is pressed” or “Hour Glass 
is pressed” depending upon the Jbutton with image either Digital Clock or Hour Glass is pressed by 
implementing the event handling mechanism with addActionListener( ).*/
package collection;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ImageButtonExample {

    JFrame f;
    JLabel l1, imgLabel;

    ImageButtonExample() {
        f = new JFrame("Image Button Example");

        l1 = new JLabel("Click a button");
        l1.setBounds(150, 50, 400, 40);
        l1.setFont(new Font("Arial", Font.BOLD, 20));

        imgLabel = new JLabel();
        imgLabel.setBounds(150, 100, 200, 200);

        // Buttons
        JButton b1 = new JButton("Digital Clock");
        JButton b2 = new JButton("Hour Glass");

        b1.setBounds(50, 350, 150, 40);
        b2.setBounds(250, 350, 150, 40);

        // Action for Digital Clock
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                l1.setText("Digital Clock is pressed");

                ImageIcon icon = new ImageIcon("clock.png"); // add your image path
                imgLabel.setIcon(icon);
            }
        });

        // Action for Hour Glass
        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                l1.setText("Hour Glass is pressed");

                ImageIcon icon = new ImageIcon("hourglass.png"); // add your image path
                imgLabel.setIcon(icon);
            }
        });

        f.add(l1);
        f.add(imgLabel);
        f.add(b1);
        f.add(b2);

        f.setSize(500, 500);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new ImageButtonExample();
    }
}