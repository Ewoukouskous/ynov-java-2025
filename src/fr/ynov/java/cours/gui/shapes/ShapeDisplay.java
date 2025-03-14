package fr.ynov.java.cours.gui.shapes;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;

public class ShapeDisplay extends JFrame {
    private final GeometricShape square = new Square(100, Color.RED); // Red Square
    private final GeometricShape circle = new Circle(50, Color.BLUE); // Blue Circle
    public final List<GeometricShape> shapes = List.of(square, circle);

    // Panel to draw shapes
    private final ShapePanel panel = new ShapePanel();

    public ShapeDisplay() {
        setTitle("Shape Display");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        panel.addMouseListener(new MouseAdapter() {;
            @Override
            public void mouseClicked(MouseEvent e) {
                System.out.println("form clicked at x = " + e.getX() + " y = " + e.getY());
            }
        });
        panel.setShapes(shapes);
    }

    @Override
    public void paint(java.awt.Graphics g) {
        super.paint(g);

        final int[] middle = getMiddle();
        panel.setX(middle[0]);
        panel.setY(middle[1]);
        add(panel); // Add panel to current frame
    }

    /**
     * Get the middle of the JFrame
     * @return int[] {x, y}
     */
    private int[] getMiddle() {
        int x = (getWidth() / 2);
        int y = (getHeight() / 2);
        return new int[]{x, y};
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            ShapeDisplay display = new ShapeDisplay();
            display.setVisible(true);
            display.paint(display.getGraphics());
        });
    }
}
