package fr.ynov.java.cours.gui.shapes;

import javax.swing.JPanel;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;

public class ShapePanel extends JPanel {
    private List<GeometricShape> shapes = new ArrayList<>();
    private int x;
    private int y;

    @Override
    public void paintComponent(final Graphics g) {
        shapes.forEach(shape -> shape.draw(g, x, y));
    }

    public void setShapes(final List<GeometricShape> shapes) {
        this.shapes = shapes;
    }

    public void setX(final int x) {
        this.x = x;
    }

    public void setY(final int y) {
        this.y = y;
    }
}
