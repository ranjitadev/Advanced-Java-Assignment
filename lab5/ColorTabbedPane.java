/*5d. Develop a Swing program in Java to create a Tabbed Pan of Cyan, Magenta and Yellow and 
display the concerned color whenever the specific tab is selected in the Pan*/
package collection;
import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;

public class ColorTabbedPane {

    JFrame f;
    JLabel label;

    ColorTabbedPane() {

        f = new JFrame("Color Tab Example");

        // Label to display selected color
        label = new JLabel("Select a Tab", JLabel.CENTER);
        label.setBounds(50, 10, 300, 30);
        label.setFont(new Font("Arial", Font.BOLD, 16));

        // Panels
        JPanel p1 = new JPanel();
        JPanel p2 = new JPanel();
        JPanel p3 = new JPanel();

        p1.setBackground(Color.CYAN);
        p2.setBackground(Color.MAGENTA);
        p3.setBackground(Color.YELLOW);

        // Tabbed Pane
        JTabbedPane tp = new JTabbedPane();
        tp.setBounds(50, 50, 300, 250);

        tp.add("CYAN", p1);
        tp.add("MAGENTA", p2);
        tp.add("YELLOW", p3);

        // Event handling for tab change
        tp.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent e) {
                int index = tp.getSelectedIndex();

                if (index == 0) {
                    label.setText("Cyan Color Selected");
                } else if (index == 1) {
                    label.setText("Magenta Color Selected");
                } else if (index == 2) {
                    label.setText("Yellow Color Selected");
                }
            }
        });

        f.add(label);
        f.add(tp);

        f.setSize(400, 350);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new ColorTabbedPane();
    }
}