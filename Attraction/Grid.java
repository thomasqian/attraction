package Attraction;

import javax.swing.*;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

public class Grid extends JPanel {
    private static int width;
    private static int height;
    private static int res; // resolution of grid
    private Point[][] points;
    private GridBagConstraints c;

    private static boolean mouseDown = false;

    public Grid(int width, int height, int res) {
        this.width = width;
        this.height = height;
        this.res = res;

        setPreferredSize(new Dimension(width, height));
        setBackground(Color.RED);
        setLayout(new GridBagLayout());
        c = new GridBagConstraints();

        points = new Point[height / res][width / res];

        for (int y = 0; y < height / res; ++y) {
            for (int x = 0; x < width / res; ++x) {
                points[y][x] = new Point(res);
                c.gridx = x;
                c.gridy = y;
                add(points[y][x], c);
            }
        }

        setBackground(Color.GREEN);
        requestFocusInWindow();
    }
}
