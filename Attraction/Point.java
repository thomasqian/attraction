package Attraction;

import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Dimension;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Point extends JPanel implements MouseListener {
    private boolean filled;
    private static boolean mouse_down = false;

    public Point(int size) {
        filled = false;
        setPreferredSize(new Dimension(size, size));
        addMouseListener(this);
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
    
    public void setFilled(boolean fill) {
        filled = fill;
        repaint();
    }

    public boolean isFilled() { return filled; }
    
    @Override
    public void mouseClicked(MouseEvent m) {}

    @Override
    public void mousePressed(MouseEvent m) { 
        mouse_down = true;
        filled = true;
        repaint();
    }

    @Override
    public void mouseReleased(MouseEvent m) { mouse_down = false;}

    @Override
    public void mouseEntered(MouseEvent m) {
        if (mouse_down) {
            filled = true;
            repaint();
        }
    }

    @Override
    public void mouseExited(MouseEvent m) {}
}
