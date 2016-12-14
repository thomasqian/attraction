package Attraction;

import java.awt.Color;

public class Warrior extends Mob {
  private Color color = new Color(239, 53, 53);
  private int y;
  private int x;

  public Warrior(int y, int x) {
    this.y = y;
    this.x = x;
  }

  public Color getColor() {
    return color;
  }
}
