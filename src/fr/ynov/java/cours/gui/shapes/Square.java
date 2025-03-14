package fr.ynov.java.cours.gui.shapes;

import java.awt.Color;
import java.awt.Graphics;

public class Square extends GeometricShape {
    private final double side;

    public Square(final double side, final Color color) {
        super(color);
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return side * side;
    }

    @Override
    public double calculatePerimeter() {
        return 4 * side;
    }

    @Override
    public void draw(final Graphics g, int x, int y) {
        g.setColor(color);
        x -= (int) side / 2;
        y -= (int) side / 2;
        g.fillRect(x, y, (int) side, (int) side);
    }
}
