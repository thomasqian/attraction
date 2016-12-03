package Attraction;

import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Dimension;

public class Point extends JPanel {
    private boolean filled;

    public Point(int size) {
        filled = false;
        setPreferredSize(new Dimension(size, size));
    }

    public void paintComponent(Graphics g) {
        if (filled) {
            g.setColor(Color.BLACK);
        } else {
            g.setColor(Color.WHITE);
        }
        g.fillRect(0, 0, getWidth(), getHeight());
    }

    public boolean toggleFilled() {
        filled = !filled;
        repaint();
        return filled;
    }

    public boolean isFilled() { return filled; }
}
