package Attraction;

import javax.swing.*;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

public class Grid extends JPanel {
  private Controller controller;
  private static int width;
  private static int height;
  private static int res; // resolution of grid
  private Point[][] points;
  private GridBagConstraints c;

  private static boolean mouseDown = false;

  public Grid(int width, int height, int res, Controller controller) {
    this.controller = controller;
    this.width = width;
    this.height = height;
    this.res = res;

    //setPreferredSize(new Dimension(width, height));
    setBackground(Color.RED);
    setLayout(new GridBagLayout());
    c = new GridBagConstraints();

    points = new Point[height / res][width / res];

    for (int y = 0; y < height / res; ++y) {
      for (int x = 0; x < width / res; ++x) {
        points[y][x] = new Point(y, x, res, this);
        c.gridx = x;
        c.gridy = y;
        add(points[y][x], c);
      }
    }

    setBackground(Color.BLACK);
    requestFocusInWindow();
  }

  public void clearAll() {
    for (int y = 0; y < height / res; ++y) {
      for (int x = 0; x < width / res; ++x) {
        points[y][x].clearEntity();
      }
    }
    repaint();
  }

  public void pointTriggered(int y, int x) {
    switch (controller.getSelectedMob()) {
      case "Warrior": points[y][x].setEntity(new Warrior(y, x));
                      break;
      case "Archer":  points[y][x].setEntity(new Archer(y, x));
                      break;
      default: break;
    }
    repaint();
  }
}
