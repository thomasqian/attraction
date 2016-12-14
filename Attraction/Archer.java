package Attraction;

import java.awt.Color;

public class Archer extends Mob {
  private Color color = new Color(59, 89, 182);
  private int y;
  private int x;

  public Archer(int y, int x) {
    this.y = y;
    this.x = x;
  }

  public Color getColor() {
    return color;
  }
}
