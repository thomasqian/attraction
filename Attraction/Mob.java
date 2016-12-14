package Attraction;

public abstract class Mob extends Entity {
  protected String type;
  protected int hp;
  protected int damage;
  protected int range;

  public String getType() { return type; }
  public int getHP() { return hp; }
  public int getDamage() { return damage; }
  public int getRange() { return range; }
}
