package Attraction;

import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Dimension;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Point extends JPanel implements MouseListener {
  private static boolean mouse_down = false;
  private static Grid grid;
  private int y;
  private int x;
  private Entity entity;

  public Point(int y, int x, int size, Grid grid) {
    this.y = y;
    this.x = x;
    this.grid = grid;
    entity = null;
    setPreferredSize(new Dimension(size, size));
    addMouseListener(this);
  }

  public void paintComponent(Graphics g) {
    if (entity != null) {
      g.setColor(entity.getColor());
    } else {
      g.setColor(Color.WHITE);
    }
    g.fillRect(0, 0, getWidth(), getHeight());
  }

  public void setEntity(Entity e) { this.entity = e; }

  public void clearEntity() { this.entity = null; }

  public boolean hasEntity() { return entity != null; }

  @Override
    public void mouseClicked(MouseEvent m) {}

  @Override
    public void mousePressed(MouseEvent m) { 
      mouse_down = true;
      grid.pointTriggered(y, x);
    }

  @Override
    public void mouseReleased(MouseEvent m) { mouse_down = false;}

  @Override
    public void mouseEntered(MouseEvent m) {
      if (mouse_down) {
        grid.pointTriggered(y, x);
      }
    }

  @Override
    public void mouseExited(MouseEvent m) {}
}
