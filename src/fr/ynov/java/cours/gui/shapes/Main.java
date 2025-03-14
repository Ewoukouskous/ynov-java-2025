package fr.ynov.java.cours.gui.shapes;

import java.awt.Color;

public class Main {
    public static void main(String[] args) {
        Square square = new Square(5, Color.RED);
        System.out.println("Square - Color: " + square.getColor());
        System.out.println("Area: " + square.calculateArea());
        System.out.println("Perimeter: " + square.calculatePerimeter());

        Circle circle = new Circle(3, Color.BLUE);
        System.out.println("Circle - Color: " + circle.getColor());
        System.out.println("Area: " + circle.calculateArea());
        System.out.println("Perimeter: " + circle.calculatePerimeter());
    }
}
