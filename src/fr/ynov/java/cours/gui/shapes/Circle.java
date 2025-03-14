package fr.ynov.java.cours.gui.shapes;

import java.awt.Color;
import java.awt.Graphics;

public class Circle extends GeometricShape {
    private final double radius;

    public Circle(final double radius, final Color color) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public void draw(final Graphics g, int x, int y) {
        g.setColor(color);
        x -= (int) radius;
        y -= (int) radius;
        g.fillOval(x, y, (int) (2 * radius), (int) (2 * radius));
    }
}
