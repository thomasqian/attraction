package Attraction;

import javax.swing.*;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class Grid extends JPanel implements MouseMotionListener, MouseListener {
    private static int width;
    private static int height;
    private static int res = 4; // resolution of grid
    private Point[][] points;
    private GridBagConstraints c;

    private boolean mouseDown = false;

    public Grid(int width, int height) {
        this.width = width;
        this.height = height;

        setPreferredSize(new Dimension(width, height));
        setBackground(Color.GREEN);
        setLayout(new GridBagLayout());
        c = new GridBagConstraints();

        points = new Point[height / res][width / res];

        for (int i = 0; i < height / res; ++i) {
            for (int j = 0; j < width / res; ++j) {
                points[i][j] = new Point(res);
                c.gridx = i;
                c.gridy = j;
                add(points[i][j], c);
            }
        }

        addMouseMotionListener(this);
        addMouseListener(this);
    }

    @Override
    public void mouseDragged(MouseEvent m) {

    }

    @Override
    public void mouseMoved(MouseEvent m) {

    }

    @Override
    public void mouseClicked(MouseEvent m) {
        points[m.getX() / res][m.getY() / res].toggleFilled();
        points[m.getX() / res][m.getY() / res].repaint();
    }

    @Override
    public void mouseEntered(MouseEvent m) {}

    @Override
    public void mouseExited(MouseEvent m) {}

    @Override
    public void mousePressed(MouseEvent m) { mouseDown = true; }

    @Override
    public void mouseReleased(MouseEvent m) { mouseDown = false; }
}
