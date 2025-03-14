package fr.ynov.java.cours.gui.simple;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.FlowLayout;
import java.awt.Taskbar;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.IOException;

public class Example {

    public static void main(String[] args) throws IOException {
        swing();
        // or fromMyWindow();
    }

    static void fromMyWindow() {
        MyWindow window = new MyWindow();
        window.display();
    }

    static void swing() {
        // Create a window with Swing and display it
        JFrame frame = new JFrame("Basic Program");
        frame.setSize(300, 300);

        // Set the icon of the window
        ImageIcon img = new ImageIcon("res/icon.png");

        // For mac users (to be tested on windows user)
        Taskbar.getTaskbar().setIconImage(img.getImage());

        // Create a panel with layout
        JPanel panel = new JPanel(new FlowLayout());

        // Create a label
        JLabel label = new JLabel("Hello World!");

        // Aligning the label to CENTER
        label.setHorizontalAlignment(JLabel.CENTER);

        // Adding Label to the panel
        panel.add(label);

        // Adding panel to the frame
        frame.add(panel);

        // Making the Frame visible
        frame.setVisible(true);

        // Using WindowListener for closing the window
        // Can be replaced by frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e)
            {
                System.exit(0);
            }
        });
    }
}
