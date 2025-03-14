package fr.ynov.java.cours.gui.simple;

import javax.swing.JFrame;

public class MyWindow extends JFrame {

    public MyWindow() {
        super("My Window");
    }

    public void display() {
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}
