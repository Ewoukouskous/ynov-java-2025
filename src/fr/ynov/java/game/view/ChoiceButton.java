package fr.ynov.java.game.view;

import fr.ynov.java.game.model.Choice;

import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * A custom JButton that represents a choice in the game.
 */
public class ChoiceButton extends JButton {
    private final Choice choice;
    private static final Color DEFAULT_COLOR = new Color(70, 130, 180);
    private static final Color HOVER_COLOR = new Color(100, 160, 210);

    public ChoiceButton(final Choice choice) {
        super(choice.name());
        this.choice = choice;
        setupButton();
        setupHoverEffect();
    }

    private void setupButton() {
        setFont(new Font("Arial", Font.BOLD, 16));
        setForeground(DEFAULT_COLOR);
        // Disable the default button styling
        setFocusPainted(false);
        setBorderPainted(false);
    }

    private void setupHoverEffect() {
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                setForeground(HOVER_COLOR);
                setFocusPainted(true);
                grabFocus();
            }

            @Override
            public void mouseExited(MouseEvent e) {
                setForeground(DEFAULT_COLOR);
                setFocusPainted(false);
                transferFocus();
            }
        });
    }

    public Choice getChoice() {
        return choice;
    }
}
