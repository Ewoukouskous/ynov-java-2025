package fr.ynov.java.cours.gui.shapes;

import java.awt.Color;

public abstract class GeometricShape implements Shape, Drawable {
    protected final Color color;

    public GeometricShape(final Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }
}
