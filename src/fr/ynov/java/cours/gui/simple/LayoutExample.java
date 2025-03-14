package fr.ynov.java.cours.gui.simple;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

public class LayoutExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Exemple de Layout");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Exemple avec BorderLayout
        frame.setLayout(new BorderLayout());
        frame.add(new JButton("Nord"), BorderLayout.NORTH);
        frame.add(new JButton("Sud"), BorderLayout.SOUTH);
        frame.add(new JButton("Est"), BorderLayout.EAST);
        frame.add(new JButton("Ouest"), BorderLayout.WEST);
        frame.add(new JButton("Centre"), BorderLayout.CENTER); // will be overridden by the panel later

        // Exemple avec GridLayout
        JPanel gridPanel = new JPanel(new GridLayout(2, 2));

        // Here we want to have a button in the panel with a width that is the same as the panel.
        // But its height is fixed to 50.
        JPanel buttonPanel = new JPanel();
        JButton button = new JButton("Bouton 1");
        setSize(button, 120); // Initial width
        buttonPanel.add(button);

        frame.getRootPane().addComponentListener(new ComponentAdapter() {
            @Override
            public void componentResized(ComponentEvent e) {
                // This is only called when the user releases the mouse button.
                setSize(button, buttonPanel.getWidth());
            }
        });

        gridPanel.add(buttonPanel);
        gridPanel.add(new JButton("Bouton 2"));
        gridPanel.add(new JButton("Bouton 3"));
        gridPanel.add(new JButton("Bouton 4"));

        frame.add(gridPanel, BorderLayout.CENTER);
        frame.setVisible(true);
    }

    // Resize the button to the given width and keep the height fixed to 50.
    static void setSize(JButton button, int width) {
        final Dimension d = new Dimension(width - 5, 50);
        button.setSize(d);
        button.setPreferredSize(d);
        button.setMaximumSize(d);
        button.setMinimumSize(d);
    }
}

