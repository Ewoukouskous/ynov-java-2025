package fr.ynov.java.cours.gui.simple;

import javax.swing.*;
import java.awt.*;

public class WindowWithList {
    public static void main(String[] args) {
        final JFrame frame = new JFrame("Window with list");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Layout
        frame.setLayout(new BorderLayout());

        // Person item list
        final JPanel panel = new JPanel();
        final Person[] data = {new Person("John"), new Person("Jane"), new Person("Jack")};
        final JList<Person> list = new JList<>(data);

        // Creates a label
        final JLabel label = new JLabel("Current selection: ");

        // Be able to click on the list
        list.setEnabled(true);
        list.addListSelectionListener(e -> {
            if (!e.getValueIsAdjusting()) {
                final Person person = list.getSelectedValue();
                System.out.println(person);
                label.setText("Current selection: " + person);
            }
        });

        // Add the list in scrollable panel to handle scrollbars
        JScrollPane scrollPane = new JScrollPane(list);
        // KO : height will be correct only at init, when resizing main window it doesn't updates, we should add listener
        scrollPane.setPreferredSize(new Dimension(80, frame.getHeight() - 40));

        // Add the scrollable panel to the main panel
        panel.add(scrollPane);

        // Add the panel and the label to the frame
        frame.add(panel, BorderLayout.WEST);
        frame.add(label, BorderLayout.CENTER);

        // Make the frame visible
        frame.setVisible(true);
    }
}

